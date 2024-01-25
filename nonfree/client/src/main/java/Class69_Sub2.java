import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class69_Sub2 extends Class69 {

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "F")
	private float aFloat14;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!gk;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
	private int anInt2325;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "Lclient!pq;")
	private final Class202 aClass202_2;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "Lclient!ug;")
	private Class249 aClass249_1;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "[F")
	private float[] aFloatArray5;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!ih;Lclient!pq;)V")
	public Class69_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_2 = arg1;
		if (super.aClass117_Sub1_43.aBoolean292 && super.aClass117_Sub1_43.anInt3107 >= 2) {
			this.aClass249_1 = Static256.method3587("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass117_Sub1_43);
			if (this.aClass249_1 != null) {
				@Pc(39) int[][] local39 = Static1.method17(0.4F);
				@Pc(50) int[][] local50 = Static1.method17(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray5 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray5[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray5[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method1877();
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5853() {
		if (this.aClass94_1 != null) {
			this.aClass94_1.method1738('\u0001');
			super.aClass117_Sub1_43.method2476(1);
			super.aClass117_Sub1_43.method2504(null);
			super.aClass117_Sub1_43.method2476(0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5862(@OriginalArg(0) boolean arg0) {
		if (this.aClass94_1 == null) {
			return;
		}
		this.aClass94_1.method1738('\u0000');
		super.aClass117_Sub1_43.method2476(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass117_Sub1_43.aClass34_Sub2_4.method1908(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass117_Sub1_43.method2476(0);
		if (super.aClass117_Sub1_43.anInt3092 == this.anInt2325) {
			return;
		}
		@Pc(64) int local64 = super.aClass117_Sub1_43.anInt3092 % 5120 * 128 / 5120;
		local64 *= 128;
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local70, this.aFloatArray5, local64);
			local64 += 2;
		}
		if (this.aClass202_2.aBoolean484) {
			this.aFloat14 = (float) (super.aClass117_Sub1_43.anInt3092 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt2325 = super.aClass117_Sub1_43.anInt3092;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V")
	@Override
	public void method5857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass94_1 == null) {
			return;
		}
		super.aClass117_Sub1_43.method2476(1);
		@Pc(97) int local97;
		if ((arg1 & 0x80) != 0) {
			super.aClass117_Sub1_43.method2504(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass202_2.aBoolean484) {
				super.aClass117_Sub1_43.method2504(this.aClass202_2.aClass23_Sub2_3);
			} else {
				super.aClass117_Sub1_43.method2504(this.aClass202_2.aClass23_Sub3Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass202_2.aBoolean484) {
			super.aClass117_Sub1_43.method2504(this.aClass202_2.aClass23_Sub2_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat14, 0.0F, 0.0F, 1.0F);
		} else {
			local97 = super.aClass117_Sub1_43.anInt3092 % 4000 * 16 / 4000;
			super.aClass117_Sub1_43.method2504(this.aClass202_2.aClass23_Sub3Array3[local97]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass117_Sub1_43.method2476(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static379.aFloatArray2, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static379.aFloatArray2, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local97 = arg1 & 0x3;
		if (local97 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local97 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	private void method1877() {
		this.aClass94_1 = new Class94(super.aClass117_Sub1_43, 2);
		this.aClass94_1.method1744(0);
		super.aClass117_Sub1_43.method2476(1);
		super.aClass117_Sub1_43.method2533(-16777216);
		super.aClass117_Sub1_43.method2471(7681, 260);
		super.aClass117_Sub1_43.method2492(34166, 0);
		super.aClass117_Sub1_43.method2476(0);
		OpenGL.glBindProgramARB(34336, this.aClass249_1.anInt6550);
		OpenGL.glEnable(34336);
		this.aClass94_1.method1745();
		this.aClass94_1.method1744(1);
		super.aClass117_Sub1_43.method2476(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass117_Sub1_43.method2535(0);
		super.aClass117_Sub1_43.method2492(5890, 0);
		super.aClass117_Sub1_43.method2476(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass94_1.method1745();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5852() {
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!sv;IB)V")
	@Override
	public void method5863(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		super.aClass117_Sub1_43.method2504(arg0);
		super.aClass117_Sub1_43.method2535(arg1);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5861(@OriginalArg(0) boolean arg0) {
	}
}
