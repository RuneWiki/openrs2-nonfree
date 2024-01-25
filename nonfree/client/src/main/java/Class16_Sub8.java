import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class16_Sub8 extends Class16 {

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "F")
	private float aFloat130;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
	private int anInt5442;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "Lclient!gw;")
	private Class94 aClass94_4;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Lclient!mm;")
	private final Class162 aClass162_5;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!up;")
	private Class244 aClass244_5;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "[F")
	private float[] aFloatArray13;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!tt;Lclient!mm;)V")
	public Class16_Sub8(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) Class162 arg1) {
		super(arg0);
		this.aClass162_5 = arg1;
		if (super.aClass200_Sub2_36.aBoolean446 && super.aClass200_Sub2_36.anInt6744 >= 2) {
			this.aClass244_5 = Static65.method3962("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass200_Sub2_36);
			if (this.aClass244_5 != null) {
				@Pc(39) int[][] local39 = Static251.method3222(0.4F);
				@Pc(50) int[][] local50 = Static251.method3222(0.4F);
				this.aFloatArray13 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray13[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray13[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method4336();
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	@Override
	public void method5148() {
		if (this.aClass94_4 != null) {
			this.aClass94_4.method2132('\u0001');
			super.aClass200_Sub2_36.method5319(1);
			super.aClass200_Sub2_36.method5312(null);
			super.aClass200_Sub2_36.method5319(0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
	private void method4336() {
		this.aClass94_4 = new Class94(super.aClass200_Sub2_36, 2);
		this.aClass94_4.method2130(0);
		super.aClass200_Sub2_36.method5319(1);
		super.aClass200_Sub2_36.method5308(-16777216);
		super.aClass200_Sub2_36.method5304(260, 7681);
		super.aClass200_Sub2_36.method5341(34166, 0);
		super.aClass200_Sub2_36.method5319(0);
		OpenGL.glBindProgramARB(34336, this.aClass244_5.anInt6955);
		OpenGL.glEnable(34336);
		this.aClass94_4.method2133();
		this.aClass94_4.method2130(1);
		super.aClass200_Sub2_36.method5319(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass200_Sub2_36.method5297(0);
		super.aClass200_Sub2_36.method5341(5890, 0);
		super.aClass200_Sub2_36.method5319(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass94_4.method2133();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BILclient!in;)V")
	@Override
	public void method5150(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		super.aClass200_Sub2_36.method5312(arg1);
		super.aClass200_Sub2_36.method5297(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass94_4 == null) {
			return;
		}
		super.aClass200_Sub2_36.method5319(1);
		@Pc(75) int local75;
		if ((arg1 & 0x80) != 0) {
			super.aClass200_Sub2_36.method5312(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass162_5.aBoolean276) {
				super.aClass200_Sub2_36.method5312(this.aClass162_5.aClass31_Sub2_2);
			} else {
				super.aClass200_Sub2_36.method5312(this.aClass162_5.aClass31_Sub1Array1[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass162_5.aBoolean276) {
			super.aClass200_Sub2_36.method5312(this.aClass162_5.aClass31_Sub2_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat130, 0.0F, 0.0F, 1.0F);
		} else {
			local75 = super.aClass200_Sub2_36.anInt6720 % 4000 * 16 / 4000;
			super.aClass200_Sub2_36.method5312(this.aClass162_5.aClass31_Sub1Array1[local75]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass200_Sub2_36.method5319(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static273.aFloatArray7, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static273.aFloatArray7, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local75 = arg1 & 0x3;
		if (local75 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local75 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5157(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5154() {
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		if (this.aClass94_4 == null) {
			return;
		}
		this.aClass94_4.method2132('\u0000');
		super.aClass200_Sub2_36.method5319(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass200_Sub2_36.aClass29_Sub1_4.method1963(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass200_Sub2_36.method5319(0);
		if (this.anInt5442 == super.aClass200_Sub2_36.anInt6720) {
			return;
		}
		@Pc(58) int local58 = super.aClass200_Sub2_36.anInt6720 % 5120 * 128 / 5120;
		local58 *= 128;
		for (@Pc(64) int local64 = 0; local64 < 64; local64++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local64, this.aFloatArray13, local58);
			local58 += 2;
		}
		if (this.aClass162_5.aBoolean276) {
			this.aFloat130 = (float) (super.aClass200_Sub2_36.anInt6720 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5442 = super.aClass200_Sub2_36.anInt6720;
	}
}
