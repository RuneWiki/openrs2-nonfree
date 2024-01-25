import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class44_Sub6 extends Class44 {

	@OriginalMember(owner = "client!np", name = "o", descriptor = "Lclient!ab;")
	private Class3 aClass3_3;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "I")
	private int anInt6328;

	@OriginalMember(owner = "client!np", name = "y", descriptor = "F")
	private float aFloat269;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "Lclient!lm;")
	private final Class188 aClass188_3;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Lclient!rv;")
	private Class261 aClass261_5;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "[F")
	private float[] aFloatArray61;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!jj;Lclient!lm;)V")
	public Class44_Sub6(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Class188 arg1) {
		super(arg0);
		this.aClass188_3 = arg1;
		if (super.aClass62_Sub3_43.aBoolean294 && super.aClass62_Sub3_43.anInt4651 >= 2) {
			this.aClass261_5 = Static436.method6215(super.aClass62_Sub3_43, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass261_5 != null) {
				@Pc(39) int[][] local39 = Static109.method2187(0.4F);
				@Pc(50) int[][] local50 = Static109.method2187(0.4F);
				this.aFloatArray61 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray61[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray61[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method5254();
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7274(@OriginalArg(0) boolean arg0) {
		if (this.aClass3_3 == null) {
			return;
		}
		this.aClass3_3.method207('\u0000');
		super.aClass62_Sub3_43.method4009(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass62_Sub3_43.aClass78_Sub3_3.method5517(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass62_Sub3_43.method4009(0);
		if (super.aClass62_Sub3_43.anInt4623 == this.anInt6328) {
			return;
		}
		@Pc(64) int local64 = super.aClass62_Sub3_43.anInt4623 % 5120 * 128 / 5120;
		local64 *= 128;
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local70, this.aFloatArray61, local64);
			local64 += 2;
		}
		if (this.aClass188_3.aBoolean404) {
			this.aFloat269 = (float) (super.aClass62_Sub3_43.anInt4623 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6328 = super.aClass62_Sub3_43.anInt4623;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
	private void method5254() {
		this.aClass3_3 = new Class3(super.aClass62_Sub3_43, 2);
		this.aClass3_3.method205(0);
		super.aClass62_Sub3_43.method4009(1);
		super.aClass62_Sub3_43.method3956(-16777216);
		super.aClass62_Sub3_43.method4011(7681, 260);
		super.aClass62_Sub3_43.method4003(0, 34166);
		super.aClass62_Sub3_43.method4009(0);
		OpenGL.glBindProgramARB(34336, this.aClass261_5.anInt7683);
		OpenGL.glEnable(34336);
		this.aClass3_3.method210();
		this.aClass3_3.method205(1);
		super.aClass62_Sub3_43.method4009(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass62_Sub3_43.method3999(0);
		super.aClass62_Sub3_43.method4003(0, 5890);
		super.aClass62_Sub3_43.method4009(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass3_3.method210();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7277(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)V")
	@Override
	public void method7278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_3 == null) {
			return;
		}
		super.aClass62_Sub3_43.method4009(1);
		@Pc(47) int local47;
		if ((arg0 & 0x80) != 0) {
			super.aClass62_Sub3_43.method4007(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass188_3.aBoolean404) {
				super.aClass62_Sub3_43.method4007(this.aClass188_3.aClass4_Sub1_1);
			} else {
				super.aClass62_Sub3_43.method4007(this.aClass188_3.aClass4_Sub2Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass188_3.aBoolean404) {
			super.aClass62_Sub3_43.method4007(this.aClass188_3.aClass4_Sub1_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat269, 0.0F, 0.0F, 1.0F);
		} else {
			local47 = super.aClass62_Sub3_43.anInt4623 % 4000 * 16 / 4000;
			super.aClass62_Sub3_43.method4007(this.aClass188_3.aClass4_Sub2Array2[local47]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass62_Sub3_43.method4009(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static149.aFloatArray25, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static149.aFloatArray25, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local47 = arg0 & 0x3;
		if (local47 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local47 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	@Override
	public void method7280() {
		if (this.aClass3_3 != null) {
			this.aClass3_3.method207('\u0001');
			super.aClass62_Sub3_43.method4009(1);
			super.aClass62_Sub3_43.method4007(null);
			super.aClass62_Sub3_43.method4009(0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!aba;I)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		super.aClass62_Sub3_43.method4007(arg1);
		super.aClass62_Sub3_43.method3999(arg0);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7281() {
		return true;
	}
}
