import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class76_Sub6 extends Class76 {

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
	private int anInt5317;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "Lclient!cn;")
	private Class46 aClass46_4;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "Lclient!pe;")
	private final Class191 aClass191_5;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "Lclient!ub;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "[F")
	private float[] aFloatArray33;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!qg;Lclient!pe;)V")
	public Class76_Sub6(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class191 arg1) {
		super(arg0);
		this.aClass191_5 = arg1;
		if (super.aClass121_Sub2_39.aBoolean459 && super.aClass121_Sub2_39.anInt5957 >= 2) {
			this.aClass235_1 = Static308.method5955("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass121_Sub2_39);
			if (this.aClass235_1 != null) {
				@Pc(39) int[][] local39 = Static344.method4952(0.4F);
				@Pc(50) int[][] local50 = Static344.method4952(0.4F);
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
				this.method4294();
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILclient!go;B)V")
	@Override
	public void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1) {
		super.aClass121_Sub2_39.method4681(arg1);
		super.aClass121_Sub2_39.method4707(arg0);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5608(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	@Override
	public void method5613() {
		if (this.aClass46_4 != null) {
			this.aClass46_4.method781('\u0001');
			super.aClass121_Sub2_39.method4669(1);
			super.aClass121_Sub2_39.method4681(null);
			super.aClass121_Sub2_39.method4669(0);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5611(@OriginalArg(0) boolean arg0) {
		if (this.aClass46_4 == null) {
			return;
		}
		this.aClass46_4.method781('\u0000');
		super.aClass121_Sub2_39.method4669(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass121_Sub2_39.aClass43_Sub2_3.method2483(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass121_Sub2_39.method4669(0);
		if (super.aClass121_Sub2_39.anInt5935 == this.anInt5317) {
			return;
		}
		@Pc(68) int local68 = super.aClass121_Sub2_39.anInt5935 % 5120 * 128 / 5120;
		local68 *= 128;
		for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local74, this.aFloatArray33, local68);
			local68 += 2;
		}
		if (this.aClass191_5.aBoolean403) {
			@Pc(111) float local111 = (float) (super.aClass121_Sub2_39.anInt5935 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local111, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5317 = super.aClass121_Sub2_39.anInt5935;
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)V")
	private void method4294() {
		this.aClass46_4 = new Class46(super.aClass121_Sub2_39, 2);
		this.aClass46_4.method778(0);
		super.aClass121_Sub2_39.method4669(1);
		super.aClass121_Sub2_39.method4648(-16777216);
		super.aClass121_Sub2_39.method4709(7681, 260);
		super.aClass121_Sub2_39.method4673(0, 34166);
		super.aClass121_Sub2_39.method4669(0);
		OpenGL.glBindProgramARB(34336, this.aClass235_1.anInt7103);
		OpenGL.glEnable(34336);
		this.aClass46_4.method779();
		this.aClass46_4.method778(1);
		super.aClass121_Sub2_39.method4669(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass121_Sub2_39.method4707(0);
		super.aClass121_Sub2_39.method4673(0, 5890);
		super.aClass121_Sub2_39.method4669(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass46_4.method779();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5606() {
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass46_4 == null) {
			return;
		}
		super.aClass121_Sub2_39.method4669(1);
		@Pc(41) int local41;
		if ((arg1 & 0x80) != 0) {
			super.aClass121_Sub2_39.method4681(null);
		} else if (this.aClass191_5.aBoolean403) {
			super.aClass121_Sub2_39.method4681(this.aClass191_5.aClass21_Sub1_1);
		} else {
			local41 = super.aClass121_Sub2_39.anInt5935 % 4000 * 16 / 4000;
			super.aClass121_Sub2_39.method4681(this.aClass191_5.aClass21_Sub2Array3[local41]);
		}
		super.aClass121_Sub2_39.method4669(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static252.aFloatArray19, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static252.aFloatArray19, 0);
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
}
