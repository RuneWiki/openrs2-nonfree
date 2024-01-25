import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class84_Sub8 extends Class84 {

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "Lclient!bw;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	private int anInt5458;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "Lclient!qh;")
	private final Class202 aClass202_5;

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "Lclient!dd;")
	private Class48 aClass48_5;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!od;Lclient!qh;)V")
	public Class84_Sub8(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_5 = arg1;
		if (super.aClass128_Sub2_39.aBoolean352 && super.aClass128_Sub2_39.anInt4625 >= 2) {
			this.aClass48_5 = Static386.method4928(super.aClass128_Sub2_39, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass48_5 != null) {
				@Pc(39) int[][] local39 = Static212.method2830(0.4F);
				@Pc(50) int[][] local50 = Static212.method2830(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray25 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray25[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray25[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method4258();
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
	@Override
	public void method5153() {
		if (this.aClass32_5 != null) {
			this.aClass32_5.method651('\u0001');
			super.aClass128_Sub2_39.method3667(1);
			super.aClass128_Sub2_39.method3691(null);
			super.aClass128_Sub2_39.method3667(0);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!jk;IB)V")
	@Override
	public void method5152(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		super.aClass128_Sub2_39.method3691(arg0);
		super.aClass128_Sub2_39.method3677(arg1);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5150(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
	private void method4258() {
		this.aClass32_5 = new Class32(super.aClass128_Sub2_39, 2);
		this.aClass32_5.method657(0);
		super.aClass128_Sub2_39.method3667(1);
		super.aClass128_Sub2_39.method3646(-16777216);
		super.aClass128_Sub2_39.method3622(7681, 260);
		super.aClass128_Sub2_39.method3626(0, 34166);
		super.aClass128_Sub2_39.method3667(0);
		OpenGL.glBindProgramARB(34336, this.aClass48_5.anInt1149);
		OpenGL.glEnable(34336);
		this.aClass32_5.method658();
		this.aClass32_5.method657(1);
		super.aClass128_Sub2_39.method3667(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass128_Sub2_39.method3677(0);
		super.aClass128_Sub2_39.method3626(0, 5890);
		super.aClass128_Sub2_39.method3667(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass32_5.method658();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		if (this.aClass32_5 == null) {
			return;
		}
		this.aClass32_5.method651('\u0000');
		super.aClass128_Sub2_39.method3667(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass128_Sub2_39.aClass40_Sub2_4.method1129(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass128_Sub2_39.method3667(0);
		if (this.anInt5458 == super.aClass128_Sub2_39.anInt4604) {
			return;
		}
		@Pc(60) int local60 = super.aClass128_Sub2_39.anInt4604 % 5120 * 128 / 5120;
		local60 *= 128;
		for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local66, this.aFloatArray25, local60);
			local60 += 2;
		}
		if (this.aClass202_5.aBoolean437) {
			@Pc(92) float local92 = (float) (super.aClass128_Sub2_39.anInt4604 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local92, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5458 = super.aClass128_Sub2_39.anInt4604;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5155() {
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	@Override
	public void method5154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass32_5 == null) {
			return;
		}
		super.aClass128_Sub2_39.method3667(1);
		@Pc(35) int local35;
		if ((arg1 & 0x80) != 0) {
			super.aClass128_Sub2_39.method3691(null);
		} else if (this.aClass202_5.aBoolean437) {
			super.aClass128_Sub2_39.method3691(this.aClass202_5.aClass5_Sub3_3);
		} else {
			local35 = super.aClass128_Sub2_39.anInt4604 % 4000 * 16 / 4000;
			super.aClass128_Sub2_39.method3691(this.aClass202_5.aClass5_Sub1Array4[local35]);
		}
		super.aClass128_Sub2_39.method3667(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static65.aFloatArray4, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static65.aFloatArray4, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local35 = arg1 & 0x3;
		if (local35 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local35 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
