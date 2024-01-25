import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class15_Sub8 extends Class15 {

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
	private int anInt8432;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "Lclient!sr;")
	private Class307 aClass307_6;

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "F")
	private float aFloat183;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "Lclient!fj;")
	private final Class105 aClass105_4;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "Lclient!ed;")
	private Class84 aClass84_5;

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "[F")
	private float[] aFloatArray58;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!er;Lclient!fj;)V")
	public Class15_Sub8(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Class105 arg1) {
		super(arg0);
		this.aClass105_4 = arg1;
		if (super.aClass31_Sub2_40.aBoolean225 && super.aClass31_Sub2_40.anInt3146 >= 2) {
			this.aClass84_5 = Static503.method6752(super.aClass31_Sub2_40, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass84_5 != null) {
				@Pc(41) int[][] local41 = Static469.method7107(0.4F);
				@Pc(52) int[][] local52 = Static469.method7107(0.4F);
				this.aFloatArray58 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray58[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray58[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method6620();
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
		if (this.aClass307_6 == null) {
			return;
		}
		this.aClass307_6.method6699('\u0000');
		super.aClass31_Sub2_40.method2513(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass31_Sub2_40.aClass42_Sub1_4.method1230(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass31_Sub2_40.method2513(0);
		if (this.anInt8432 == super.aClass31_Sub2_40.anInt3134) {
			return;
		}
		@Pc(59) int local59 = super.aClass31_Sub2_40.anInt3134 % 5000 * 128 / 5000;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local61, this.aFloatArray58, local59);
			local59 += 2;
		}
		if (this.aClass105_4.aBoolean246) {
			this.aFloat183 = (float) (super.aClass31_Sub2_40.anInt3134 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt8432 = super.aClass31_Sub2_40.anInt3134;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	@Override
	public void method6944() {
		if (this.aClass307_6 != null) {
			this.aClass307_6.method6699('\u0001');
			super.aClass31_Sub2_40.method2513(1);
			super.aClass31_Sub2_40.method2535(null);
			super.aClass31_Sub2_40.method2513(0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
	@Override
	public void method6948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass307_6 == null) {
			return;
		}
		super.aClass31_Sub2_40.method2513(1);
		@Pc(37) int local37;
		if ((arg1 & 0x80) != 0) {
			super.aClass31_Sub2_40.method2535(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass105_4.aBoolean246) {
				super.aClass31_Sub2_40.method2535(this.aClass105_4.aClass50_Sub3_2);
			} else {
				super.aClass31_Sub2_40.method2535(this.aClass105_4.aClass50_Sub1Array1[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass105_4.aBoolean246) {
			super.aClass31_Sub2_40.method2535(this.aClass105_4.aClass50_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat183, 0.0F, 0.0F, 1.0F);
		} else {
			local37 = super.aClass31_Sub2_40.anInt3134 % 4000 * 16 / 4000;
			super.aClass31_Sub2_40.method2535(this.aClass105_4.aClass50_Sub1Array1[local37]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass31_Sub2_40.method2513(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static183.aFloatArray35, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static183.aFloatArray35, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local37 = arg1 & 0x3;
		if (local37 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local37 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6946() {
		return true;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
	private void method6620() {
		this.aClass307_6 = new Class307(super.aClass31_Sub2_40, 2);
		this.aClass307_6.method6701(0);
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2572(-16777216);
		super.aClass31_Sub2_40.method2536(7681, 260);
		super.aClass31_Sub2_40.method2499(34166, 0);
		super.aClass31_Sub2_40.method2513(0);
		OpenGL.glBindProgramARB(34336, this.aClass84_5.anInt2708);
		OpenGL.glEnable(34336);
		this.aClass307_6.method6702();
		this.aClass307_6.method6701(1);
		super.aClass31_Sub2_40.method2513(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass31_Sub2_40.method2495(0);
		super.aClass31_Sub2_40.method2499(5890, 0);
		super.aClass31_Sub2_40.method2513(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass307_6.method6702();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6945(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!ep;I)V")
	@Override
	public void method6947(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		super.aClass31_Sub2_40.method2535(arg0);
		super.aClass31_Sub2_40.method2495(arg1);
	}
}
