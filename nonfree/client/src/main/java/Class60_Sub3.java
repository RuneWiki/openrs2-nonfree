import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class60_Sub3 extends Class60 {

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "F")
	private float aFloat85;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "Lclient!qda;")
	private Class266 aClass266_2;

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
	private int anInt4315;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "Lclient!dk;")
	private final Class69 aClass69_3;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "Lclient!fb;")
	private Class88 aClass88_1;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "[F")
	private float[] aFloatArray39;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!jaa;Lclient!dk;)V")
	public Class60_Sub3(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class69 arg1) {
		super(arg0);
		this.aClass69_3 = arg1;
		if (super.aClass14_Sub3_42.aBoolean294 && super.aClass14_Sub3_42.anInt4596 >= 2) {
			this.aClass88_1 = Static534.method7253(super.aClass14_Sub3_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass88_1 != null) {
				@Pc(41) int[][] local41 = Static529.method4038(0.4F);
				@Pc(52) int[][] local52 = Static529.method4038(0.4F);
				this.aFloatArray39 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray39[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray39[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method3761();
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7476(@OriginalArg(0) boolean arg0) {
		if (this.aClass266_2 == null) {
			return;
		}
		this.aClass266_2.method5987('\u0000');
		super.aClass14_Sub3_42.method3917(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass14_Sub3_42.aClass54_Sub2_3.method4407(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass14_Sub3_42.method3917(0);
		if (super.aClass14_Sub3_42.anInt4557 == this.anInt4315) {
			return;
		}
		@Pc(58) int local58 = super.aClass14_Sub3_42.anInt4557 % 5120 * 128 / 5120;
		local58 *= 128;
		for (@Pc(64) int local64 = 0; local64 < 64; local64++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local64, this.aFloatArray39, local58);
			local58 += 2;
		}
		if (this.aClass69_3.aBoolean127) {
			this.aFloat85 = (float) (super.aClass14_Sub3_42.anInt4557 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4315 = super.aClass14_Sub3_42.anInt4557;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
	private void method3761() {
		this.aClass266_2 = new Class266(super.aClass14_Sub3_42, 2);
		this.aClass266_2.method5983(0);
		super.aClass14_Sub3_42.method3917(1);
		super.aClass14_Sub3_42.method3902(-16777216);
		super.aClass14_Sub3_42.method3976(260, 7681);
		super.aClass14_Sub3_42.method3918(0, 34166);
		super.aClass14_Sub3_42.method3917(0);
		OpenGL.glBindProgramARB(34336, this.aClass88_1.anInt2919);
		OpenGL.glEnable(34336);
		this.aClass266_2.method5989();
		this.aClass266_2.method5983(1);
		super.aClass14_Sub3_42.method3917(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass14_Sub3_42.method3925(0);
		super.aClass14_Sub3_42.method3918(0, 5890);
		super.aClass14_Sub3_42.method3917(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass266_2.method5989();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	@Override
	public void method7474() {
		if (this.aClass266_2 != null) {
			this.aClass266_2.method5987('\u0001');
			super.aClass14_Sub3_42.method3917(1);
			super.aClass14_Sub3_42.method3985(null);
			super.aClass14_Sub3_42.method3917(0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILclient!tj;)V")
	@Override
	public void method7475(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		super.aClass14_Sub3_42.method3985(arg1);
		super.aClass14_Sub3_42.method3925(arg0);
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7478() {
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass266_2 == null) {
			return;
		}
		super.aClass14_Sub3_42.method3917(1);
		@Pc(85) int local85;
		if ((arg0 & 0x80) != 0) {
			super.aClass14_Sub3_42.method3985(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass69_3.aBoolean127) {
				super.aClass14_Sub3_42.method3985(this.aClass69_3.aClass51_Sub2_1);
			} else {
				super.aClass14_Sub3_42.method3985(this.aClass69_3.aClass51_Sub1Array1[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass69_3.aBoolean127) {
			super.aClass14_Sub3_42.method3985(this.aClass69_3.aClass51_Sub2_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat85, 0.0F, 0.0F, 1.0F);
		} else {
			local85 = super.aClass14_Sub3_42.anInt4557 % 4000 * 16 / 4000;
			super.aClass14_Sub3_42.method3985(this.aClass69_3.aClass51_Sub1Array1[local85]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass14_Sub3_42.method3917(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static224.aFloatArray45, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static224.aFloatArray45, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local85 = arg0 & 0x3;
		if (local85 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local85 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
