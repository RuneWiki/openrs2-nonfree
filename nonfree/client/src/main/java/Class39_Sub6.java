import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class39_Sub6 extends Class39 {

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Lclient!uv;")
	private Class260 aClass260_3;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
	private int anInt5320;

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "F")
	private float aFloat77;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "Lclient!pt;")
	private final Class201 aClass201_4;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "Lclient!j;")
	private Class117 aClass117_5;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "[F")
	private float[] aFloatArray22;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!bt;Lclient!pt;)V")
	public Class39_Sub6(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class201 arg1) {
		super(arg0);
		this.aClass201_4 = arg1;
		if (super.aClass30_Sub1_42.aBoolean35 && super.aClass30_Sub1_42.anInt863 >= 2) {
			this.aClass117_5 = Static281.method4418(super.aClass30_Sub1_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass117_5 != null) {
				@Pc(39) int[][] local39 = Static465.method6296(0.4F);
				@Pc(50) int[][] local50 = Static465.method6296(0.4F);
				this.aFloatArray22 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray22[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray22[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method4451();
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ei;II)V")
	@Override
	public void method5997(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		super.aClass30_Sub1_42.method730(arg0);
		super.aClass30_Sub1_42.method713(arg1);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5999(@OriginalArg(1) boolean arg0) {
		if (this.aClass260_3 == null) {
			return;
		}
		this.aClass260_3.method5895('\u0000');
		super.aClass30_Sub1_42.method726(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass30_Sub1_42.aClass72_Sub2_4.method2193(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass30_Sub1_42.method726(0);
		if (this.anInt5320 == super.aClass30_Sub1_42.anInt841) {
			return;
		}
		@Pc(64) int local64 = super.aClass30_Sub1_42.anInt841 % 5120 * 128 / 5120;
		local64 *= 128;
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local70, this.aFloatArray22, local64);
			local64 += 2;
		}
		if (this.aClass201_4.aBoolean428) {
			this.aFloat77 = (float) (super.aClass30_Sub1_42.anInt841 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5320 = super.aClass30_Sub1_42.anInt841;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
	@Override
	public void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass260_3 == null) {
			return;
		}
		super.aClass30_Sub1_42.method726(1);
		@Pc(55) int local55;
		if ((arg1 & 0x80) != 0) {
			super.aClass30_Sub1_42.method730(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass201_4.aBoolean428) {
				super.aClass30_Sub1_42.method730(this.aClass201_4.aClass62_Sub1_2);
			} else {
				super.aClass30_Sub1_42.method730(this.aClass201_4.aClass62_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass201_4.aBoolean428) {
			super.aClass30_Sub1_42.method730(this.aClass201_4.aClass62_Sub1_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat77, 0.0F, 0.0F, 1.0F);
		} else {
			local55 = super.aClass30_Sub1_42.anInt841 % 4000 * 16 / 4000;
			super.aClass30_Sub1_42.method730(this.aClass201_4.aClass62_Sub2Array3[local55]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass30_Sub1_42.method726(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static121.aFloatArray46, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static121.aFloatArray46, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local55 = arg1 & 0x3;
		if (local55 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local55 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6000() {
		return true;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5996(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	@Override
	public void method5994() {
		if (this.aClass260_3 != null) {
			this.aClass260_3.method5895('\u0001');
			super.aClass30_Sub1_42.method726(1);
			super.aClass30_Sub1_42.method730(null);
			super.aClass30_Sub1_42.method726(0);
		}
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
	private void method4451() {
		this.aClass260_3 = new Class260(super.aClass30_Sub1_42, 2);
		this.aClass260_3.method5892(0);
		super.aClass30_Sub1_42.method726(1);
		super.aClass30_Sub1_42.method765(-16777216);
		super.aClass30_Sub1_42.method724(260, 7681);
		super.aClass30_Sub1_42.method690(34166, 0);
		super.aClass30_Sub1_42.method726(0);
		OpenGL.glBindProgramARB(34336, this.aClass117_5.anInt3679);
		OpenGL.glEnable(34336);
		this.aClass260_3.method5894();
		this.aClass260_3.method5892(1);
		super.aClass30_Sub1_42.method726(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass30_Sub1_42.method713(0);
		super.aClass30_Sub1_42.method690(5890, 0);
		super.aClass30_Sub1_42.method726(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass260_3.method5894();
	}
}
