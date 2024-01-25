import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class51_Sub6 extends Class51 {

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "Lclient!bf;")
	private Class18 aClass18_5;

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
	private int anInt4742;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "Lclient!wl;")
	private final Class264 aClass264_5;

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "Lclient!hd;")
	private Class94 aClass94_5;

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "[F")
	private float[] aFloatArray32;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!gk;Lclient!wl;)V")
	public Class51_Sub6(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_5 = arg1;
		if (super.aClass75_Sub2_39.aBoolean231 && super.aClass75_Sub2_39.anInt3105 >= 2) {
			this.aClass94_5 = Static240.method3748("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass75_Sub2_39);
			if (this.aClass94_5 != null) {
				@Pc(37) int[][] local37 = Static217.method3476(0.4F);
				@Pc(48) int[][] local48 = Static217.method3476(0.4F);
				this.aFloatArray32 = new float[32768];
				@Pc(54) int local54 = 0;
				for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
					@Pc(61) int[] local61 = local37[local56];
					@Pc(65) int[] local65 = local48[local56];
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						this.aFloatArray32[local54++] = (float) local61[local67] / 4096.0F;
						this.aFloatArray32[local54++] = (float) local65[local67] / 4096.0F;
					}
				}
				this.method3855();
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4955() {
		return true;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!rh;II)V")
	@Override
	public void method4960(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		super.aClass75_Sub2_39.method2456(arg0);
		super.aClass75_Sub2_39.method2424(arg1);
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	private void method3855() {
		this.aClass18_5 = new Class18(super.aClass75_Sub2_39, 2);
		this.aClass18_5.method718(0);
		super.aClass75_Sub2_39.method2426(1);
		super.aClass75_Sub2_39.method2405(-16777216);
		super.aClass75_Sub2_39.method2479(260, 7681);
		super.aClass75_Sub2_39.method2460(34166, 0);
		super.aClass75_Sub2_39.method2426(0);
		OpenGL.glBindProgramARB(34336, this.aClass94_5.anInt3281);
		OpenGL.glEnable(34336);
		this.aClass18_5.method723();
		this.aClass18_5.method718(1);
		super.aClass75_Sub2_39.method2426(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass75_Sub2_39.method2424(0);
		super.aClass75_Sub2_39.method2460(5890, 0);
		super.aClass75_Sub2_39.method2426(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass18_5.method723();
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
	@Override
	public void method4957() {
		if (this.aClass18_5 != null) {
			this.aClass18_5.method720('\u0001');
			super.aClass75_Sub2_39.method2426(1);
			super.aClass75_Sub2_39.method2456(null);
			super.aClass75_Sub2_39.method2426(0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4961(@OriginalArg(1) boolean arg0) {
		if (this.aClass18_5 == null) {
			return;
		}
		this.aClass18_5.method720('\u0000');
		super.aClass75_Sub2_39.method2426(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass75_Sub2_39.aClass106_Sub2_3.method5114(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass75_Sub2_39.method2426(0);
		if (this.anInt4742 == super.aClass75_Sub2_39.anInt3079) {
			return;
		}
		@Pc(66) int local66 = super.aClass75_Sub2_39.anInt3079 % 5120 * 128 / 5120;
		local66 *= 128;
		for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local72, this.aFloatArray32, local66);
			local66 += 2;
		}
		if (this.aClass264_5.aBoolean519) {
			@Pc(107) float local107 = (float) (super.aClass75_Sub2_39.anInt3079 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local107, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4742 = super.aClass75_Sub2_39.anInt3079;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4956(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BII)V")
	@Override
	public void method4958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass18_5 == null) {
			return;
		}
		super.aClass75_Sub2_39.method2426(1);
		@Pc(48) int local48;
		if ((arg0 & 0x80) != 0) {
			super.aClass75_Sub2_39.method2456(null);
		} else if (this.aClass264_5.aBoolean519) {
			super.aClass75_Sub2_39.method2456(this.aClass264_5.aClass42_Sub4_3);
		} else {
			local48 = super.aClass75_Sub2_39.anInt3079 % 4000 * 16 / 4000;
			super.aClass75_Sub2_39.method2456(this.aClass264_5.aClass42_Sub1Array3[local48]);
		}
		super.aClass75_Sub2_39.method2426(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static112.aFloatArray34, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static112.aFloatArray34, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local48 = arg0 & 0x3;
		if (local48 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local48 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
