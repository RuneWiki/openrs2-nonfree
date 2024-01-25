import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class38_Sub4 extends Class38 {

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	private int anInt3811;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "F")
	private float aFloat56;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!hq;")
	private Class102 aClass102_2;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Lclient!hl;")
	private final Class100 aClass100_3;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!sh;")
	private Class221 aClass221_5;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "[F")
	private float[] aFloatArray22;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!nq;Lclient!hl;)V")
	public Class38_Sub4(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Class100 arg1) {
		super(arg0);
		this.aClass100_3 = arg1;
		if (super.aClass167_Sub1_42.aBoolean359 && super.aClass167_Sub1_42.anInt4910 >= 2) {
			this.aClass221_5 = Static111.method1820(super.aClass167_Sub1_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass221_5 != null) {
				@Pc(39) int[][] local39 = Static8.method94(0.4F);
				@Pc(50) int[][] local50 = Static8.method94(0.4F);
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
				this.method3284();
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5704() {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5708(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	@Override
	public void method5706() {
		if (this.aClass102_2 != null) {
			this.aClass102_2.method2512('\u0001');
			super.aClass167_Sub1_42.method3993(1);
			super.aClass167_Sub1_42.method4028(null);
			super.aClass167_Sub1_42.method3993(0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!lr;I)V")
	@Override
	public void method5710(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
		super.aClass167_Sub1_42.method4028(arg0);
		super.aClass167_Sub1_42.method3998(arg1);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5707(@OriginalArg(1) boolean arg0) {
		if (this.aClass102_2 == null) {
			return;
		}
		this.aClass102_2.method2512('\u0000');
		super.aClass167_Sub1_42.method3993(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass167_Sub1_42.aClass11_Sub2_4.method2183(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, (float) 0, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass167_Sub1_42.method3993(0);
		if (this.anInt3811 == super.aClass167_Sub1_42.anInt4890) {
			return;
		}
		@Pc(61) int local61 = super.aClass167_Sub1_42.anInt4890 % 5120 * 128 / 5120;
		local61 *= 128;
		for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local67, this.aFloatArray22, local61);
			local61 += 2;
		}
		if (this.aClass100_3.aBoolean215) {
			this.aFloat56 = (float) (super.aClass167_Sub1_42.anInt4890 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3811 = super.aClass167_Sub1_42.anInt4890;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
	private void method3284() {
		this.aClass102_2 = new Class102(super.aClass167_Sub1_42, 2);
		this.aClass102_2.method2513(0);
		super.aClass167_Sub1_42.method3993(1);
		super.aClass167_Sub1_42.method4026(-16777216);
		super.aClass167_Sub1_42.method3983(260, 7681);
		super.aClass167_Sub1_42.method3997(0, 34166);
		super.aClass167_Sub1_42.method3993(0);
		OpenGL.glBindProgramARB(34336, this.aClass221_5.anInt6313);
		OpenGL.glEnable(34336);
		this.aClass102_2.method2510();
		this.aClass102_2.method2513(1);
		super.aClass167_Sub1_42.method3993(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass167_Sub1_42.method3998(0);
		super.aClass167_Sub1_42.method3997(0, 5890);
		super.aClass167_Sub1_42.method3993(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass102_2.method2510();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass102_2 == null) {
			return;
		}
		super.aClass167_Sub1_42.method3993(1);
		@Pc(59) int local59;
		if ((arg1 & 0x80) != 0) {
			super.aClass167_Sub1_42.method4028(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass100_3.aBoolean215) {
				super.aClass167_Sub1_42.method4028(this.aClass100_3.aClass137_Sub2_2);
			} else {
				super.aClass167_Sub1_42.method4028(this.aClass100_3.aClass137_Sub1Array1[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass100_3.aBoolean215) {
			super.aClass167_Sub1_42.method4028(this.aClass100_3.aClass137_Sub2_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat56, 0.0F, 0.0F, 1.0F);
		} else {
			local59 = super.aClass167_Sub1_42.anInt4890 % 4000 * 16 / 4000;
			super.aClass167_Sub1_42.method4028(this.aClass100_3.aClass137_Sub1Array1[local59]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass167_Sub1_42.method3993(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static315.aFloatArray29, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static315.aFloatArray29, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local59 = arg1 & 0x3;
		if (local59 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local59 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
