import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class75_Sub2 extends Class75 {

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	private int anInt6787;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "F")
	private float aFloat146;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "Lclient!uj;")
	private Class328 aClass328_1;

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "Lclient!pm;")
	private final Class256 aClass256_2;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Lclient!mt;")
	private Class218 aClass218_5;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "[F")
	private float[] aFloatArray62;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!ji;Lclient!pm;)V")
	public Class75_Sub2(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Class256 arg1) {
		super(arg0);
		this.aClass256_2 = arg1;
		if (super.aClass15_Sub3_42.aBoolean459 && super.aClass15_Sub3_42.anInt5360 >= 2) {
			this.aClass218_5 = Static276.method4820(super.aClass15_Sub3_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass218_5 != null) {
				@Pc(37) int[][] local37 = Static228.method3904(0.4F);
				@Pc(48) int[][] local48 = Static228.method3904(0.4F);
				@Pc(50) int local50 = 0;
				this.aFloatArray62 = new float[32768];
				for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
					@Pc(61) int[] local61 = local37[local56];
					@Pc(65) int[] local65 = local48[local56];
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						this.aFloatArray62[local50++] = (float) local61[local67] / 4096.0F;
						this.aFloatArray62[local50++] = (float) local65[local67] / 4096.0F;
					}
				}
				this.method5657();
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8295() {
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		if (this.aClass328_1 == null) {
			return;
		}
		this.aClass328_1.method7872('\u0000');
		super.aClass15_Sub3_42.method4458(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass15_Sub3_42.aClass255_Sub1_3.method6438(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass15_Sub3_42.method4458(0);
		if (super.aClass15_Sub3_42.anInt5325 == this.anInt6787) {
			return;
		}
		@Pc(68) int local68 = super.aClass15_Sub3_42.anInt5325 % 5120 * 128 / 5120;
		local68 *= 128;
		for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local74, this.aFloatArray62, local68);
			local68 += 2;
		}
		if (this.aClass256_2.aBoolean664) {
			this.aFloat146 = (float) (super.aClass15_Sub3_42.anInt5325 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6787 = super.aClass15_Sub3_42.anInt5325;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	private void method5657() {
		this.aClass328_1 = new Class328(super.aClass15_Sub3_42, 2);
		this.aClass328_1.method7870(0);
		super.aClass15_Sub3_42.method4458(1);
		super.aClass15_Sub3_42.method4410(-16777216);
		super.aClass15_Sub3_42.method4451(7681, 260);
		super.aClass15_Sub3_42.method4378(0, 34166);
		super.aClass15_Sub3_42.method4458(0);
		OpenGL.glBindProgramARB(34336, this.aClass218_5.anInt6950);
		OpenGL.glEnable(34336);
		this.aClass328_1.method7868();
		this.aClass328_1.method7870(1);
		super.aClass15_Sub3_42.method4458(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass15_Sub3_42.method4432(0);
		super.aClass15_Sub3_42.method4378(0, 5890);
		super.aClass15_Sub3_42.method4458(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass328_1.method7868();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass328_1 == null) {
			return;
		}
		super.aClass15_Sub3_42.method4458(1);
		@Pc(80) int local80;
		if ((arg0 & 0x80) != 0) {
			super.aClass15_Sub3_42.method4377(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass256_2.aBoolean664) {
				super.aClass15_Sub3_42.method4377(this.aClass256_2.aClass11_Sub4_1);
			} else {
				super.aClass15_Sub3_42.method4377(this.aClass256_2.aClass11_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass256_2.aBoolean664) {
			super.aClass15_Sub3_42.method4377(this.aClass256_2.aClass11_Sub4_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat146, 0.0F, 0.0F, 1.0F);
		} else {
			local80 = super.aClass15_Sub3_42.anInt5325 % 4000 * 16 / 4000;
			super.aClass15_Sub3_42.method4377(this.aClass256_2.aClass11_Sub2Array3[local80]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass15_Sub3_42.method4458(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static582.aFloatArray70, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static582.aFloatArray70, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local80 = arg0 & 0x3;
		if (local80 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local80 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!gq;)V")
	@Override
	public void method8289(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		super.aClass15_Sub3_42.method4377(arg1);
		super.aClass15_Sub3_42.method4432(arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	@Override
	public void method8290() {
		if (this.aClass328_1 != null) {
			this.aClass328_1.method7872('\u0001');
			super.aClass15_Sub3_42.method4458(1);
			super.aClass15_Sub3_42.method4377(null);
			super.aClass15_Sub3_42.method4458(0);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8296(@OriginalArg(0) boolean arg0) {
	}
}
