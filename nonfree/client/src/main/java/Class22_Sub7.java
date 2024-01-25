import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class22_Sub7 extends Class22 {

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "[I")
	public static final int[] anIntArray410 = new int[16384];

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "[I")
	public static final int[] anIntArray411 = new int[16384];

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_1;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_2;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_3;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_4;

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_5;

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_6;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_7;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_8;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_9;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_10;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_11;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "Lclient!pe;")
	public static final Class188 aClass188_12;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "[Lclient!pe;")
	private static final Class188[] aClass188Array1;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	private int anInt4471;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Lclient!ce;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Lclient!bt;")
	private final Class30 aClass30_4;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!ae;")
	private Class5 aClass5_5;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "[F")
	private float[] aFloatArray9;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray411[local9] = (int) (Math.sin(local7 * (double) local9) * 32768.0D);
			anIntArray410[local9] = (int) (Math.cos((double) local9 * local7) * 32768.0D);
		}
		aClass188_1 = new Class188(14, 1);
		aClass188_2 = new Class188(15, 4);
		aClass188_3 = new Class188(16, -2);
		aClass188_4 = new Class188(17, 0);
		aClass188_5 = new Class188(18, -2);
		aClass188_6 = new Class188(19, -2);
		aClass188_7 = new Class188(20, 6);
		aClass188_8 = new Class188(21, 9);
		aClass188_9 = new Class188(22, -2);
		aClass188_10 = new Class188(23, 4);
		aClass188_11 = new Class188(24, -1);
		aClass188_12 = new Class188(25, -2);
		aClass188Array1 = new Class188[32];
		@Pc(114) Class188[] local114 = Static2.method4();
		for (@Pc(116) int local116 = 0; local116 < local114.length; local116++) {
			aClass188Array1[local114[local116].anInt5048] = local114[local116];
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!vd;Lclient!bt;)V")
	public Class22_Sub7(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) Class30 arg1) {
		super(arg0);
		this.aClass30_4 = arg1;
		if (super.aClass51_Sub2_33.aBoolean443 && super.aClass51_Sub2_33.anInt6942 >= 2) {
			this.aClass5_5 = Static418.method5228("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass51_Sub2_33);
			if (this.aClass5_5 != null) {
				@Pc(41) int[][] local41 = Static51.method673(0.4F);
				@Pc(52) int[][] local52 = Static51.method673(0.4F);
				this.aFloatArray9 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray9[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray9[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method3565();
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	private void method3565() {
		this.aClass37_4 = new Class37(super.aClass51_Sub2_33, 2);
		this.aClass37_4.method601(0);
		super.aClass51_Sub2_33.method5371(1);
		super.aClass51_Sub2_33.method5397(-16777216);
		super.aClass51_Sub2_33.method5394(260, 7681);
		super.aClass51_Sub2_33.method5374(34166, 0);
		super.aClass51_Sub2_33.method5371(0);
		OpenGL.glBindProgramARB(34336, this.aClass5_5.anInt21);
		OpenGL.glEnable(34336);
		this.aClass37_4.method606();
		this.aClass37_4.method601(1);
		super.aClass51_Sub2_33.method5371(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass51_Sub2_33.method5400(0);
		super.aClass51_Sub2_33.method5374(5890, 0);
		super.aClass51_Sub2_33.method5371(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass37_4.method606();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4106() {
		return true;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4101(@OriginalArg(0) boolean arg0) {
		if (this.aClass37_4 == null) {
			return;
		}
		this.aClass37_4.method600('\u0000');
		super.aClass51_Sub2_33.method5371(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass51_Sub2_33.aClass33_Sub2_4.method2389(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass51_Sub2_33.method5371(0);
		if (super.aClass51_Sub2_33.anInt6911 == this.anInt4471) {
			return;
		}
		@Pc(65) int local65 = super.aClass51_Sub2_33.anInt6911 % 5120 * 128 / 5120;
		local65 *= 128;
		for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local71, this.aFloatArray9, local65);
			local65 += 2;
		}
		if (this.aClass30_4.aBoolean30) {
			@Pc(108) float local108 = (float) (super.aClass51_Sub2_33.anInt6911 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local108, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4471 = super.aClass51_Sub2_33.anInt6911;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!ew;I)V")
	@Override
	public void method4100(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1) {
		super.aClass51_Sub2_33.method5364(arg0);
		super.aClass51_Sub2_33.method5400(arg1);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	@Override
	public void method4104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass37_4 == null) {
			return;
		}
		super.aClass51_Sub2_33.method5371(1);
		@Pc(48) int local48;
		if ((arg0 & 0x80) != 0) {
			super.aClass51_Sub2_33.method5364(null);
		} else if (this.aClass30_4.aBoolean30) {
			super.aClass51_Sub2_33.method5364(this.aClass30_4.aClass59_Sub2_2);
		} else {
			local48 = super.aClass51_Sub2_33.anInt6911 % 4000 * 16 / 4000;
			super.aClass51_Sub2_33.method5364(this.aClass30_4.aClass59_Sub3Array2[local48]);
		}
		super.aClass51_Sub2_33.method5371(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static139.aFloatArray6, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static139.aFloatArray6, 0);
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

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4099(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	@Override
	public void method4103() {
		if (this.aClass37_4 != null) {
			this.aClass37_4.method600('\u0001');
			super.aClass51_Sub2_33.method5371(1);
			super.aClass51_Sub2_33.method5364(null);
			super.aClass51_Sub2_33.method5371(0);
		}
	}
}
