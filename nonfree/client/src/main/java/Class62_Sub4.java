import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class62_Sub4 extends Class62 {

	@OriginalMember(owner = "client!os", name = "m", descriptor = "I")
	private int anInt5233;

	@OriginalMember(owner = "client!os", name = "u", descriptor = "Lclient!ih;")
	private Class117 aClass117_3;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "Lclient!mc;")
	private final Class159 aClass159_1;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "Lclient!km;")
	private Class143 aClass143_5;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "[F")
	private float[] aFloatArray37;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!ef;Lclient!mc;)V")
	public Class62_Sub4(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) Class159 arg1) {
		super(arg0);
		this.aClass159_1 = arg1;
		if (super.aClass49_Sub2_43.aBoolean121 && super.aClass49_Sub2_43.anInt2031 >= 2) {
			this.aClass143_5 = Static157.method2556("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass49_Sub2_43);
			if (this.aClass143_5 != null) {
				@Pc(41) int[][] local41 = Static121.method2116(0.4F);
				@Pc(52) int[][] local52 = Static121.method2116(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray37 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray37[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray37[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method4204();
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass117_3 == null) {
			return;
		}
		super.aClass49_Sub2_43.method1600(1);
		@Pc(51) int local51;
		if ((arg1 & 0x80) != 0) {
			super.aClass49_Sub2_43.method1646(null);
		} else if (this.aClass159_1.aBoolean328) {
			super.aClass49_Sub2_43.method1646(this.aClass159_1.aClass55_Sub2_1);
		} else {
			local51 = super.aClass49_Sub2_43.anInt2002 % 4000 * 16 / 4000;
			super.aClass49_Sub2_43.method1646(this.aClass159_1.aClass55_Sub3Array2[local51]);
		}
		super.aClass49_Sub2_43.method1600(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static161.aFloatArray58, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static161.aFloatArray58, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local51 = arg1 & 0x3;
		if (local51 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local51 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	@Override
	public void method5829() {
		if (this.aClass117_3 != null) {
			this.aClass117_3.method2645('\u0001');
			super.aClass49_Sub2_43.method1600(1);
			super.aClass49_Sub2_43.method1646(null);
			super.aClass49_Sub2_43.method1600(0);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!mk;II)V")
	@Override
	public void method5830(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		super.aClass49_Sub2_43.method1646(arg0);
		super.aClass49_Sub2_43.method1624(arg1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5821() {
		return true;
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
	private void method4204() {
		this.aClass117_3 = new Class117(super.aClass49_Sub2_43, 2);
		this.aClass117_3.method2648(0);
		super.aClass49_Sub2_43.method1600(1);
		super.aClass49_Sub2_43.method1642(-16777216);
		super.aClass49_Sub2_43.method1613(260, 7681);
		super.aClass49_Sub2_43.method1623(34166, 0);
		super.aClass49_Sub2_43.method1600(0);
		OpenGL.glBindProgramARB(34336, this.aClass143_5.anInt3983);
		OpenGL.glEnable(34336);
		this.aClass117_3.method2647();
		this.aClass117_3.method2648(1);
		super.aClass49_Sub2_43.method1600(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass49_Sub2_43.method1624(0);
		super.aClass49_Sub2_43.method1623(5890, 0);
		super.aClass49_Sub2_43.method1600(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass117_3.method2647();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5822(@OriginalArg(1) boolean arg0) {
		if (this.aClass117_3 == null) {
			return;
		}
		this.aClass117_3.method2645('\u0000');
		super.aClass49_Sub2_43.method1600(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass49_Sub2_43.aClass35_Sub2_4.method5049(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass49_Sub2_43.method1600(0);
		if (this.anInt5233 == super.aClass49_Sub2_43.anInt2002) {
			return;
		}
		@Pc(58) int local58 = super.aClass49_Sub2_43.anInt2002 % 5120 * 128 / 5120;
		local58 *= 128;
		for (@Pc(64) int local64 = 0; local64 < 64; local64++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local64, this.aFloatArray37, local58);
			local58 += 2;
		}
		if (this.aClass159_1.aBoolean328) {
			@Pc(99) float local99 = (float) (super.aClass49_Sub2_43.anInt2002 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local99, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5233 = super.aClass49_Sub2_43.anInt2002;
	}
}
