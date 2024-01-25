import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class56_Sub3 extends Class56 {

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
	private int anInt2663;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "Lclient!wu;")
	private Class269 aClass269_3;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "Lclient!go;")
	private final Class96 aClass96_3;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "Lclient!mc;")
	private Class153 aClass153_1;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "[F")
	private float[] aFloatArray18;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!ht;Lclient!go;)V")
	public Class56_Sub3(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class96 arg1) {
		super(arg0);
		this.aClass96_3 = arg1;
		if (super.aClass109_Sub1_41.aBoolean174 && super.aClass109_Sub1_41.anInt2983 >= 2) {
			this.aClass153_1 = Static392.method5479(super.aClass109_Sub1_41, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass153_1 != null) {
				@Pc(39) int[][] local39 = Static389.method5313(0.4F);
				@Pc(50) int[][] local50 = Static389.method5313(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray18 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray18[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray18[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method2369();
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5079(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	@Override
	public void method5084() {
		if (this.aClass269_3 != null) {
			this.aClass269_3.method6088('\u0001');
			super.aClass109_Sub1_41.method2564(1);
			super.aClass109_Sub1_41.method2578(null);
			super.aClass109_Sub1_41.method2564(0);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5087(@OriginalArg(1) boolean arg0) {
		if (this.aClass269_3 == null) {
			return;
		}
		this.aClass269_3.method6088('\u0000');
		super.aClass109_Sub1_41.method2564(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass109_Sub1_41.aClass18_Sub1_4.method425(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass109_Sub1_41.method2564(0);
		if (super.aClass109_Sub1_41.anInt2974 == this.anInt2663) {
			return;
		}
		@Pc(65) int local65 = super.aClass109_Sub1_41.anInt2974 % 5120 * 128 / 5120;
		local65 *= 128;
		for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local71, this.aFloatArray18, local65);
			local65 += 2;
		}
		if (this.aClass96_3.aBoolean124) {
			@Pc(106) float local106 = (float) (super.aClass109_Sub1_41.anInt2974 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local106, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt2663 = super.aClass109_Sub1_41.anInt2974;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	private void method2369() {
		this.aClass269_3 = new Class269(super.aClass109_Sub1_41, 2);
		this.aClass269_3.method6086(0);
		super.aClass109_Sub1_41.method2564(1);
		super.aClass109_Sub1_41.method2574(-16777216);
		super.aClass109_Sub1_41.method2549(260, 7681);
		super.aClass109_Sub1_41.method2545(34166, 0);
		super.aClass109_Sub1_41.method2564(0);
		OpenGL.glBindProgramARB(34336, this.aClass153_1.anInt4346);
		OpenGL.glEnable(34336);
		this.aClass269_3.method6090();
		this.aClass269_3.method6086(1);
		super.aClass109_Sub1_41.method2564(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass109_Sub1_41.method2531(0);
		super.aClass109_Sub1_41.method2545(5890, 0);
		super.aClass109_Sub1_41.method2564(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass269_3.method6090();
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(III)V")
	@Override
	public void method5083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass269_3 == null) {
			return;
		}
		super.aClass109_Sub1_41.method2564(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass109_Sub1_41.method2578(null);
		} else if (this.aClass96_3.aBoolean124) {
			super.aClass109_Sub1_41.method2578(this.aClass96_3.aClass13_Sub2_3);
		} else {
			@Pc(42) int local42 = super.aClass109_Sub1_41.anInt2974 % 4000 * 16 / 4000;
			super.aClass109_Sub1_41.method2578(this.aClass96_3.aClass13_Sub1Array3[local42]);
		}
		super.aClass109_Sub1_41.method2564(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static300.aFloatArray28, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static300.aFloatArray28, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		@Pc(102) int local102 = arg0 & 0x3;
		if (local102 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local102 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5085() {
		return true;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!ao;)V")
	@Override
	public void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		super.aClass109_Sub1_41.method2578(arg1);
		super.aClass109_Sub1_41.method2531(arg0);
	}
}
