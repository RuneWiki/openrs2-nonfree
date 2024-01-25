import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class36_Sub9 extends Class36 {

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "Lclient!iq;")
	private Class120 aClass120_6;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	private int anInt7761;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "Lclient!ri;")
	private final Class212 aClass212_6;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "Lclient!bm;")
	private Class25 aClass25_5;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "[F")
	private float[] aFloatArray33;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!bo;Lclient!ri;)V")
	public Class36_Sub9(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class212 arg1) {
		super(arg0);
		this.aClass212_6 = arg1;
		if (super.aClass26_Sub1_43.aBoolean81 && super.aClass26_Sub1_43.anInt964 >= 2) {
			this.aClass25_5 = Static250.method3256(super.aClass26_Sub1_43, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass25_5 != null) {
				@Pc(39) int[][] local39 = Static123.method1789(0.4F);
				@Pc(50) int[][] local50 = Static123.method1789(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray33 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray33[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray33[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method6020();
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass120_6 == null) {
			return;
		}
		super.aClass26_Sub1_43.method696(1);
		@Pc(41) int local41;
		if ((arg1 & 0x80) != 0) {
			super.aClass26_Sub1_43.method673(null);
		} else if (this.aClass212_6.aBoolean527) {
			super.aClass26_Sub1_43.method673(this.aClass212_6.aClass65_Sub2_3);
		} else {
			local41 = super.aClass26_Sub1_43.anInt925 % 4000 * 16 / 4000;
			super.aClass26_Sub1_43.method673(this.aClass212_6.aClass65_Sub3Array2[local41]);
		}
		super.aClass26_Sub1_43.method696(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static448.aFloatArray34, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static448.aFloatArray34, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local41 = arg1 & 0x3;
		if (local41 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local41 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6010() {
		return true;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6011(@OriginalArg(1) boolean arg0) {
		if (this.aClass120_6 == null) {
			return;
		}
		this.aClass120_6.method2782('\u0000');
		super.aClass26_Sub1_43.method696(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass26_Sub1_43.aClass102_Sub2_4.method2657(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, (float) 0);
		OpenGL.glMatrixMode(5888);
		super.aClass26_Sub1_43.method696(0);
		if (super.aClass26_Sub1_43.anInt925 == this.anInt7761) {
			return;
		}
		@Pc(59) int local59 = super.aClass26_Sub1_43.anInt925 % 5120 * 128 / 5120;
		local59 *= 128;
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local65, this.aFloatArray33, local59);
			local59 += 2;
		}
		if (this.aClass212_6.aBoolean527) {
			@Pc(91) float local91 = (float) (super.aClass26_Sub1_43.anInt925 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt7761 = super.aClass26_Sub1_43.anInt925;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	@Override
	public void method6012() {
		if (this.aClass120_6 != null) {
			this.aClass120_6.method2782('\u0001');
			super.aClass26_Sub1_43.method696(1);
			super.aClass26_Sub1_43.method673(null);
			super.aClass26_Sub1_43.method696(0);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!nk;II)V")
	@Override
	public void method6008(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		super.aClass26_Sub1_43.method673(arg0);
		super.aClass26_Sub1_43.method669(arg1);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6015(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V")
	private void method6020() {
		this.aClass120_6 = new Class120(super.aClass26_Sub1_43, 2);
		this.aClass120_6.method2784(0);
		super.aClass26_Sub1_43.method696(1);
		super.aClass26_Sub1_43.method679(-16777216);
		super.aClass26_Sub1_43.method695(260, 7681);
		super.aClass26_Sub1_43.method643(0, 34166);
		super.aClass26_Sub1_43.method696(0);
		OpenGL.glBindProgramARB(34336, this.aClass25_5.anInt671);
		OpenGL.glEnable(34336);
		this.aClass120_6.method2781();
		this.aClass120_6.method2784(1);
		super.aClass26_Sub1_43.method696(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass26_Sub1_43.method669(0);
		super.aClass26_Sub1_43.method643(0, 5890);
		super.aClass26_Sub1_43.method696(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass120_6.method2781();
	}
}
