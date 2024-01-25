import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
	private int anInt1610;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "Lclient!gs;")
	private Class98 aClass98_1;

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "Lclient!re;")
	private final Class202 aClass202_2;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "Lclient!vl;")
	private Class254 aClass254_1;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "[F")
	private float[] aFloatArray13;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!bv;Lclient!re;)V")
	public Class2_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_2 = arg1;
		if (super.aClass30_Sub1_42.aBoolean80 && super.aClass30_Sub1_42.anInt1272 >= 2) {
			this.aClass254_1 = Static75.method1363(super.aClass30_Sub1_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass254_1 != null) {
				@Pc(41) int[][] local41 = Static418.method5471(0.4F);
				@Pc(52) int[][] local52 = Static418.method5471(0.4F);
				this.aFloatArray13 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray13[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray13[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method1231();
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5386(@OriginalArg(0) boolean arg0) {
		if (this.aClass98_1 == null) {
			return;
		}
		this.aClass98_1.method2005('\u0000');
		super.aClass30_Sub1_42.method948(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass30_Sub1_42.aClass116_Sub2_3.method4594(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass30_Sub1_42.method948(0);
		if (this.anInt1610 == super.aClass30_Sub1_42.anInt1244) {
			return;
		}
		@Pc(61) int local61 = super.aClass30_Sub1_42.anInt1244 % 5120 * 128 / 5120;
		local61 *= 128;
		for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local67, this.aFloatArray13, local61);
			local61 += 2;
		}
		if (this.aClass202_2.aBoolean411) {
			@Pc(93) float local93 = (float) (super.aClass30_Sub1_42.anInt1244 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local93, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt1610 = super.aClass30_Sub1_42.anInt1244;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5380() {
		return true;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
	@Override
	public void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass98_1 == null) {
			return;
		}
		super.aClass30_Sub1_42.method948(1);
		@Pc(44) int local44;
		if ((arg1 & 0x80) != 0) {
			super.aClass30_Sub1_42.method916(null);
		} else if (this.aClass202_2.aBoolean411) {
			super.aClass30_Sub1_42.method916(this.aClass202_2.aClass1_Sub4_1);
		} else {
			local44 = super.aClass30_Sub1_42.anInt1244 % 4000 * 16 / 4000;
			super.aClass30_Sub1_42.method916(this.aClass202_2.aClass1_Sub3Array3[local44]);
		}
		super.aClass30_Sub1_42.method948(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static8.aFloatArray3, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static8.aFloatArray3, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local44 = arg1 & 0x3;
		if (local44 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local44 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	@Override
	public void method5384() {
		if (this.aClass98_1 != null) {
			this.aClass98_1.method2005('\u0001');
			super.aClass30_Sub1_42.method948(1);
			super.aClass30_Sub1_42.method916(null);
			super.aClass30_Sub1_42.method948(0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILclient!kv;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1) {
		super.aClass30_Sub1_42.method916(arg1);
		super.aClass30_Sub1_42.method923(arg0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5383(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)V")
	private void method1231() {
		this.aClass98_1 = new Class98(super.aClass30_Sub1_42, 2);
		this.aClass98_1.method2003(0);
		super.aClass30_Sub1_42.method948(1);
		super.aClass30_Sub1_42.method921(-16777216);
		super.aClass30_Sub1_42.method905(7681, 260);
		super.aClass30_Sub1_42.method954(0, 34166);
		super.aClass30_Sub1_42.method948(0);
		OpenGL.glBindProgramARB(34336, this.aClass254_1.anInt7126);
		OpenGL.glEnable(34336);
		this.aClass98_1.method2004();
		this.aClass98_1.method2003(1);
		super.aClass30_Sub1_42.method948(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass30_Sub1_42.method923(0);
		super.aClass30_Sub1_42.method954(0, 5890);
		super.aClass30_Sub1_42.method948(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass98_1.method2004();
	}
}
