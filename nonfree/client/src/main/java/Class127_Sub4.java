import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class127_Sub4 extends Class127 {

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "F")
	private float aFloat133;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
	private int anInt6151;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "Lclient!tw;")
	private Class329 aClass329_2;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "Lclient!rb;")
	private final Class287 aClass287_4;

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "Lclient!ft;")
	private Class117 aClass117_1;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "[F")
	private float[] aFloatArray42;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!kw;Lclient!rb;)V")
	public Class127_Sub4(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class287 arg1) {
		super(arg0);
		this.aClass287_4 = arg1;
		if (super.aClass5_Sub2_42.aBoolean375 && super.aClass5_Sub2_42.anInt5668 >= 2) {
			this.aClass117_1 = Static360.method5895(super.aClass5_Sub2_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass117_1 != null) {
				@Pc(39) int[][] local39 = Static24.method992(0.4F);
				@Pc(50) int[][] local50 = Static24.method992(0.4F);
				this.aFloatArray42 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray42[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray42[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method5389();
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8458(@OriginalArg(1) boolean arg0) {
		if (this.aClass329_2 == null) {
			return;
		}
		this.aClass329_2.method8098('\u0000');
		super.aClass5_Sub2_42.method5004(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass5_Sub2_42.aClass39_Sub2_5.method6554(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass5_Sub2_42.method5004(0);
		if (this.anInt6151 == super.aClass5_Sub2_42.anInt5646) {
			return;
		}
		@Pc(61) int local61 = super.aClass5_Sub2_42.anInt5646 % 5000 * 128 / 5000;
		for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local63, this.aFloatArray42, local61);
			local61 += 2;
		}
		if (this.aClass287_4.aBoolean585) {
			this.aFloat133 = (float) (super.aClass5_Sub2_42.anInt5646 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6151 = super.aClass5_Sub2_42.anInt5646;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass329_2 == null) {
			return;
		}
		super.aClass5_Sub2_42.method5004(1);
		@Pc(79) int local79;
		if ((arg1 & 0x80) != 0) {
			super.aClass5_Sub2_42.method4997(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass287_4.aBoolean585) {
				super.aClass5_Sub2_42.method4997(this.aClass287_4.aClass76_Sub4_2);
			} else {
				super.aClass5_Sub2_42.method4997(this.aClass287_4.aClass76_Sub3Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass287_4.aBoolean585) {
			super.aClass5_Sub2_42.method4997(this.aClass287_4.aClass76_Sub4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat133, 0.0F, 0.0F, 1.0F);
		} else {
			local79 = super.aClass5_Sub2_42.anInt5646 % 4000 * 16 / 4000;
			super.aClass5_Sub2_42.method4997(this.aClass287_4.aClass76_Sub3Array3[local79]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass5_Sub2_42.method5004(0);
		if ((arg1 & 0x40) == 0) {
			Static272.aFloatArray33[2] = super.aClass5_Sub2_42.aFloat120 * super.aClass5_Sub2_42.aFloat118;
			Static272.aFloatArray33[0] = super.aClass5_Sub2_42.aFloat125 * super.aClass5_Sub2_42.aFloat118;
			Static272.aFloatArray33[1] = super.aClass5_Sub2_42.aFloat114 * super.aClass5_Sub2_42.aFloat118;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static272.aFloatArray33, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local79 = arg1 & 0x3;
		if (local79 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local79 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8456() {
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	@Override
	public void method8454() {
		if (this.aClass329_2 != null) {
			this.aClass329_2.method8098('\u0001');
			super.aClass5_Sub2_42.method5004(1);
			super.aClass5_Sub2_42.method4997(null);
			super.aClass5_Sub2_42.method5004(0);
		}
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	private void method5389() {
		this.aClass329_2 = new Class329(super.aClass5_Sub2_42, 2);
		this.aClass329_2.method8097(0);
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4956(-16777216);
		super.aClass5_Sub2_42.method4982(7681, 260);
		super.aClass5_Sub2_42.method4969(34166, 0);
		super.aClass5_Sub2_42.method5004(0);
		OpenGL.glBindProgramARB(34336, this.aClass117_1.anInt3241);
		OpenGL.glEnable(34336);
		this.aClass329_2.method8094();
		this.aClass329_2.method8097(1);
		super.aClass5_Sub2_42.method5004(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass5_Sub2_42.method4953(0);
		super.aClass5_Sub2_42.method4969(5890, 0);
		super.aClass5_Sub2_42.method5004(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass329_2.method8094();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!ou;II)V")
	@Override
	public void method8460(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub2_42.method4997(arg0);
		super.aClass5_Sub2_42.method4953(arg1);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8457(@OriginalArg(0) boolean arg0) {
	}
}
