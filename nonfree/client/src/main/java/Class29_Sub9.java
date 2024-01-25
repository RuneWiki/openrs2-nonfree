import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class29_Sub9 extends Class29 {

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	private int anInt6853;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Lclient!tm;")
	private Class239 aClass239_6;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "F")
	private float aFloat116;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Lclient!ai;")
	private final Class9 aClass9_6;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!hh;")
	private Class105 aClass105_5;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "[F")
	private float[] aFloatArray31;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!da;Lclient!ai;)V")
	public Class29_Sub9(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) Class9 arg1) {
		super(arg0);
		this.aClass9_6 = arg1;
		if (super.aClass50_Sub1_37.aBoolean80 && super.aClass50_Sub1_37.anInt1416 >= 2) {
			this.aClass105_5 = Static159.method2688(super.aClass50_Sub1_37, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass105_5 != null) {
				@Pc(39) int[][] local39 = Static3.method3436(0.4F);
				@Pc(50) int[][] local50 = Static3.method3436(0.4F);
				this.aFloatArray31 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray31[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray31[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method5384();
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5383(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!ac;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		super.aClass50_Sub1_37.method1295(arg1);
		super.aClass50_Sub1_37.method1256(arg0);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	private void method5384() {
		this.aClass239_6 = new Class239(super.aClass50_Sub1_37, 2);
		this.aClass239_6.method5221(0);
		super.aClass50_Sub1_37.method1300(1);
		super.aClass50_Sub1_37.method1278(-16777216);
		super.aClass50_Sub1_37.method1316(260, 7681);
		super.aClass50_Sub1_37.method1275(34166, 0);
		super.aClass50_Sub1_37.method1300(0);
		OpenGL.glBindProgramARB(34336, this.aClass105_5.anInt3125);
		OpenGL.glEnable(34336);
		this.aClass239_6.method5222();
		this.aClass239_6.method5221(1);
		super.aClass50_Sub1_37.method1300(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass50_Sub1_37.method1256(0);
		super.aClass50_Sub1_37.method1275(5890, 0);
		super.aClass50_Sub1_37.method1300(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass239_6.method5222();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	@Override
	public void method5378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass239_6 == null) {
			return;
		}
		super.aClass50_Sub1_37.method1300(1);
		@Pc(97) int local97;
		if ((arg0 & 0x80) != 0) {
			super.aClass50_Sub1_37.method1295(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass9_6.aBoolean7) {
				super.aClass50_Sub1_37.method1295(this.aClass9_6.aClass4_Sub3_2);
			} else {
				super.aClass50_Sub1_37.method1295(this.aClass9_6.aClass4_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass9_6.aBoolean7) {
			super.aClass50_Sub1_37.method1295(this.aClass9_6.aClass4_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat116, 0.0F, 0.0F, 1.0F);
		} else {
			local97 = super.aClass50_Sub1_37.anInt1403 % 4000 * 16 / 4000;
			super.aClass50_Sub1_37.method1295(this.aClass9_6.aClass4_Sub1Array2[local97]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass50_Sub1_37.method1300(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static46.aFloatArray5, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static46.aFloatArray5, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local97 = arg0 & 0x3;
		if (local97 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local97 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	@Override
	public void method5381() {
		if (this.aClass239_6 != null) {
			this.aClass239_6.method5224('\u0001');
			super.aClass50_Sub1_37.method1300(1);
			super.aClass50_Sub1_37.method1295(null);
			super.aClass50_Sub1_37.method1300(0);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5376(@OriginalArg(0) boolean arg0) {
		if (this.aClass239_6 == null) {
			return;
		}
		this.aClass239_6.method5224('\u0000');
		super.aClass50_Sub1_37.method1300(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass50_Sub1_37.aClass34_Sub1_3.method4151(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass50_Sub1_37.method1300(0);
		if (super.aClass50_Sub1_37.anInt1403 == this.anInt6853) {
			return;
		}
		@Pc(62) int local62 = super.aClass50_Sub1_37.anInt1403 % 5120 * 128 / 5120;
		local62 *= 128;
		for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local68, this.aFloatArray31, local62);
			local62 += 2;
		}
		if (this.aClass9_6.aBoolean7) {
			this.aFloat116 = (float) (super.aClass50_Sub1_37.anInt1403 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6853 = super.aClass50_Sub1_37.anInt1403;
	}
}
