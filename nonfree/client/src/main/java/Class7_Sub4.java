import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!j", name = "h", descriptor = "F")
	private float aFloat107;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	private int anInt4433;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!cl;")
	private Class53 aClass53_3;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Lclient!ica;")
	private final Class150 aClass150_2;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!pc;")
	private Class250 aClass250_5;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "[F")
	private float[] aFloatArray37;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!ag;Lclient!ica;)V")
	public Class7_Sub4(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Class150 arg1) {
		super(arg0);
		this.aClass150_2 = arg1;
		if (super.aClass12_Sub1_42.aBoolean32 && super.aClass12_Sub1_42.anInt492 >= 2) {
			this.aClass250_5 = Static453.method6379(super.aClass12_Sub1_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass250_5 != null) {
				@Pc(41) int[][] local41 = Static474.method988(0.4F);
				@Pc(52) int[][] local52 = Static474.method988(0.4F);
				this.aFloatArray37 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray37[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray37[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method3821();
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	@Override
	public void method7785() {
		if (this.aClass53_3 != null) {
			this.aClass53_3.method1511('\u0001');
			super.aClass12_Sub1_42.method376(1);
			super.aClass12_Sub1_42.method378(null);
			super.aClass12_Sub1_42.method376(0);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	private void method3821() {
		this.aClass53_3 = new Class53(super.aClass12_Sub1_42, 2);
		this.aClass53_3.method1513(0);
		super.aClass12_Sub1_42.method376(1);
		super.aClass12_Sub1_42.method375(-16777216);
		super.aClass12_Sub1_42.method420(7681, 260);
		super.aClass12_Sub1_42.method388(0, 34166);
		super.aClass12_Sub1_42.method376(0);
		OpenGL.glBindProgramARB(34336, this.aClass250_5.anInt6822);
		OpenGL.glEnable(34336);
		this.aClass53_3.method1514();
		this.aClass53_3.method1513(1);
		super.aClass12_Sub1_42.method376(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass12_Sub1_42.method401(0);
		super.aClass12_Sub1_42.method388(0, 5890);
		super.aClass12_Sub1_42.method376(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass53_3.method1514();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!vfa;B)V")
	@Override
	public void method7782(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1) {
		super.aClass12_Sub1_42.method378(arg1);
		super.aClass12_Sub1_42.method401(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7777(@OriginalArg(1) boolean arg0) {
		if (this.aClass53_3 == null) {
			return;
		}
		this.aClass53_3.method1511('\u0000');
		super.aClass12_Sub1_42.method376(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass12_Sub1_42.aClass209_Sub3_5.method5489(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass12_Sub1_42.method376(0);
		if (this.anInt4433 == super.aClass12_Sub1_42.anInt461) {
			return;
		}
		@Pc(63) int local63 = super.aClass12_Sub1_42.anInt461 % 5000 * 128 / 5000;
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local65, this.aFloatArray37, local63);
			local63 += 2;
		}
		if (this.aClass150_2.aBoolean339) {
			this.aFloat107 = (float) (super.aClass12_Sub1_42.anInt461 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4433 = super.aClass12_Sub1_42.anInt461;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7784() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7780(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	@Override
	public void method7783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass53_3 == null) {
			return;
		}
		super.aClass12_Sub1_42.method376(1);
		@Pc(48) int local48;
		if ((arg1 & 0x80) != 0) {
			super.aClass12_Sub1_42.method378(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass150_2.aBoolean339) {
				super.aClass12_Sub1_42.method378(this.aClass150_2.aClass52_Sub4_3);
			} else {
				super.aClass12_Sub1_42.method378(this.aClass150_2.aClass52_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass150_2.aBoolean339) {
			super.aClass12_Sub1_42.method378(this.aClass150_2.aClass52_Sub4_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat107, 0.0F, 0.0F, 1.0F);
		} else {
			local48 = super.aClass12_Sub1_42.anInt461 % 4000 * 16 / 4000;
			super.aClass12_Sub1_42.method378(this.aClass150_2.aClass52_Sub1Array2[local48]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass12_Sub1_42.method376(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static494.aFloatArray67, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static494.aFloatArray67, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local48 = arg1 & 0x3;
		if (local48 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local48 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
