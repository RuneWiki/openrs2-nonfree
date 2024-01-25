import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
	private int anInt3303;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "F")
	private float aFloat72;

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "Lclient!fo;")
	private Class107 aClass107_3;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "Lclient!dja;")
	private final Class65 aClass65_4;

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "Lclient!ne;")
	private Class218 aClass218_1;

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "[F")
	private float[] aFloatArray32;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!ac;Lclient!dja;)V")
	public Class16_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class65 arg1) {
		super(arg0);
		this.aClass65_4 = arg1;
		if (super.aClass5_Sub1_42.aBoolean31 && super.aClass5_Sub1_42.anInt388 >= 2) {
			this.aClass218_1 = Static592.method8156(super.aClass5_Sub1_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass218_1 != null) {
				@Pc(41) int[][] local41 = Static260.method4607(0.4F);
				@Pc(52) int[][] local52 = Static260.method4607(0.4F);
				this.aFloatArray32 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray32[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray32[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method2756();
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!cu;ZI)V")
	@Override
	public void method8762(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub1_42.method352(arg0);
		super.aClass5_Sub1_42.method385(arg1);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8763(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8759() {
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8760(@OriginalArg(1) boolean arg0) {
		if (this.aClass107_3 == null) {
			return;
		}
		this.aClass107_3.method3156('\u0000');
		super.aClass5_Sub1_42.method334(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass5_Sub1_42.aClass115_Sub1_5.method3377(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass5_Sub1_42.method334(0);
		if (this.anInt3303 == super.aClass5_Sub1_42.anInt361) {
			return;
		}
		@Pc(55) int local55 = super.aClass5_Sub1_42.anInt361 % 5000 * 128 / 5000;
		for (@Pc(57) int local57 = 0; local57 < 64; local57++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local57, this.aFloatArray32, local55);
			local55 += 2;
		}
		if (this.aClass65_4.aBoolean234) {
			this.aFloat72 = (float) (super.aClass5_Sub1_42.anInt361 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3303 = super.aClass5_Sub1_42.anInt361;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
	@Override
	public void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass107_3 == null) {
			return;
		}
		super.aClass5_Sub1_42.method334(1);
		@Pc(46) int local46;
		if ((arg0 & 0x80) != 0) {
			super.aClass5_Sub1_42.method352((Class2) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass65_4.aBoolean234) {
				super.aClass5_Sub1_42.method352(this.aClass65_4.aClass2_Sub4_2);
			} else {
				super.aClass5_Sub1_42.method352(this.aClass65_4.aClass2_Sub1Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass65_4.aBoolean234) {
			super.aClass5_Sub1_42.method352(this.aClass65_4.aClass2_Sub4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat72, 0.0F, 0.0F, 1.0F);
		} else {
			local46 = super.aClass5_Sub1_42.anInt361 % 4000 * 16 / 4000;
			super.aClass5_Sub1_42.method352(this.aClass65_4.aClass2_Sub1Array3[local46]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass5_Sub1_42.method334(0);
		if ((arg0 & 0x40) == 0) {
			Static473.aFloatArray70[0] = super.aClass5_Sub1_42.aFloat12 * super.aClass5_Sub1_42.aFloat17;
			Static473.aFloatArray70[2] = super.aClass5_Sub1_42.aFloat12 * super.aClass5_Sub1_42.aFloat21;
			Static473.aFloatArray70[1] = super.aClass5_Sub1_42.aFloat12 * super.aClass5_Sub1_42.aFloat14;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static473.aFloatArray70, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local46 = arg0 & 0x3;
		if (local46 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local46 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)V")
	private void method2756() {
		this.aClass107_3 = new Class107(super.aClass5_Sub1_42, 2);
		this.aClass107_3.method3155(0);
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method371(-16777216);
		super.aClass5_Sub1_42.method388(7681, 260);
		super.aClass5_Sub1_42.method375(0, 34166);
		super.aClass5_Sub1_42.method334(0);
		OpenGL.glBindProgramARB(34336, this.aClass218_1.anInt7061);
		OpenGL.glEnable(34336);
		this.aClass107_3.method3154();
		this.aClass107_3.method3155(1);
		super.aClass5_Sub1_42.method334(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass5_Sub1_42.method385(0);
		super.aClass5_Sub1_42.method375(0, 5890);
		super.aClass5_Sub1_42.method334(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass107_3.method3154();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
	@Override
	public void method8765() {
		if (this.aClass107_3 != null) {
			this.aClass107_3.method3156('\u0001');
			super.aClass5_Sub1_42.method334(1);
			super.aClass5_Sub1_42.method352((Class2) null);
			super.aClass5_Sub1_42.method334(0);
		}
	}
}
