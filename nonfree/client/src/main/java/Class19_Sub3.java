import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	private int anInt3282;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "Lclient!jv;")
	private Class170 aClass170_1;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "F")
	private float aFloat99;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "Lclient!lc;")
	private final Class189 aClass189_1;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Lclient!pl;")
	private Class264 aClass264_5;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "[F")
	private float[] aFloatArray35;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!qo;Lclient!lc;)V")
	public Class19_Sub3(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Class189 arg1) {
		super(arg0);
		this.aClass189_1 = arg1;
		if (super.aClass20_Sub3_42.aBoolean630 && super.aClass20_Sub3_42.anInt8793 >= 2) {
			this.aClass264_5 = Static250.method6312(super.aClass20_Sub3_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass264_5 != null) {
				@Pc(39) int[][] local39 = Static559.method8403(0.4F);
				@Pc(50) int[][] local50 = Static559.method8403(0.4F);
				this.aFloatArray35 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray35[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray35[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method3020();
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass170_1 == null) {
			return;
		}
		super.aClass20_Sub3_42.method7325(1);
		@Pc(81) int local81;
		if ((arg0 & 0x80) != 0) {
			super.aClass20_Sub3_42.method7358(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass189_1.aBoolean483) {
				super.aClass20_Sub3_42.method7358(this.aClass189_1.aClass85_Sub2_1);
			} else {
				super.aClass20_Sub3_42.method7358(this.aClass189_1.aClass85_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass189_1.aBoolean483) {
			super.aClass20_Sub3_42.method7358(this.aClass189_1.aClass85_Sub2_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat99, 0.0F, 0.0F, 1.0F);
		} else {
			local81 = super.aClass20_Sub3_42.anInt8773 % 4000 * 16 / 4000;
			super.aClass20_Sub3_42.method7358(this.aClass189_1.aClass85_Sub1Array2[local81]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass20_Sub3_42.method7325(0);
		if ((arg0 & 0x40) == 0) {
			Static35.aFloatArray5[2] = super.aClass20_Sub3_42.aFloat181 * super.aClass20_Sub3_42.aFloat175;
			Static35.aFloatArray5[0] = super.aClass20_Sub3_42.aFloat176 * super.aClass20_Sub3_42.aFloat175;
			Static35.aFloatArray5[1] = super.aClass20_Sub3_42.aFloat175 * super.aClass20_Sub3_42.aFloat180;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static35.aFloatArray5, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local81 = arg0 & 0x3;
		if (local81 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local81 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ud;BI)V")
	@Override
	public void method9168(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
		super.aClass20_Sub3_42.method7358(arg0);
		super.aClass20_Sub3_42.method7348(arg1);
	}

	@OriginalMember(owner = "client!em", name = "e", descriptor = "(I)V")
	private void method3020() {
		this.aClass170_1 = new Class170(super.aClass20_Sub3_42, 2);
		this.aClass170_1.method5087(0);
		super.aClass20_Sub3_42.method7325(1);
		super.aClass20_Sub3_42.method7395(-16777216);
		super.aClass20_Sub3_42.method7316(260, 7681);
		super.aClass20_Sub3_42.method7362(0, 34166);
		super.aClass20_Sub3_42.method7325(0);
		OpenGL.glBindProgramARB(34336, this.aClass264_5.anInt8064);
		OpenGL.glEnable(34336);
		this.aClass170_1.method5083();
		this.aClass170_1.method5087(1);
		super.aClass20_Sub3_42.method7325(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass20_Sub3_42.method7348(0);
		super.aClass20_Sub3_42.method7362(0, 5890);
		super.aClass20_Sub3_42.method7325(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass170_1.method5083();
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9165() {
		return true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
	@Override
	public void method9161() {
		if (this.aClass170_1 != null) {
			this.aClass170_1.method5086('\u0001');
			super.aClass20_Sub3_42.method7325(1);
			super.aClass20_Sub3_42.method7358(null);
			super.aClass20_Sub3_42.method7325(0);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9162(@OriginalArg(0) boolean arg0) {
		if (this.aClass170_1 == null) {
			return;
		}
		this.aClass170_1.method5086('\u0000');
		super.aClass20_Sub3_42.method7325(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass20_Sub3_42.aClass30_Sub3_5.method4393(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass20_Sub3_42.method7325(0);
		if (this.anInt3282 == super.aClass20_Sub3_42.anInt8773) {
			return;
		}
		@Pc(59) int local59 = super.aClass20_Sub3_42.anInt8773 % 5000 * 128 / 5000;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local61, this.aFloatArray35, local59);
			local59 += 2;
		}
		if (this.aClass189_1.aBoolean483) {
			this.aFloat99 = (float) (super.aClass20_Sub3_42.anInt8773 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3282 = super.aClass20_Sub3_42.anInt8773;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9167(@OriginalArg(0) boolean arg0) {
	}
}
