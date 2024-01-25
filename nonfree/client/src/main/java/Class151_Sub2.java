import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class151_Sub2 extends Class151 {

	@OriginalMember(owner = "client!vfa", name = "lb", descriptor = "[I")
	public static int[] lb;

	@OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
	private int anInt9150;

	@OriginalMember(owner = "client!vfa", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!vfa", name = "U", descriptor = "I")
	private int anInt9169;

	@OriginalMember(owner = "client!vfa", name = "cb", descriptor = "Lclient!gv;")
	public Class133 aClass133_13;

	@OriginalMember(owner = "client!vfa", name = "eb", descriptor = "Lclient!gv;")
	public Class133 aClass133_14;

	@OriginalMember(owner = "client!vfa", name = "fb", descriptor = "Lclient!gv;")
	public Class133 aClass133_15;

	@OriginalMember(owner = "client!vfa", name = "gb", descriptor = "I")
	private int anInt9171;

	@OriginalMember(owner = "client!vfa", name = "hb", descriptor = "I")
	private int anInt9172;

	@OriginalMember(owner = "client!vfa", name = "ib", descriptor = "Lclient!gv;")
	private Class133 aClass133_16;

	@OriginalMember(owner = "client!vfa", name = "jb", descriptor = "[Lclient!eca;")
	private Class2_Sub14[] aClass2_Sub14Array1;

	@OriginalMember(owner = "client!vfa", name = "kb", descriptor = "Lclient!fba;")
	private Interface10 anInterface10_7;

	@OriginalMember(owner = "client!vfa", name = "n", descriptor = "Lclient!dc;")
	private final Class70 aClass70_67 = new Class70();

	@OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
	private final int anInt9151 = this.anInt9568 - 2;

	@OriginalMember(owner = "client!vfa", name = "m", descriptor = "Lclient!uca;")
	public final Class162_Sub3 aClass162_Sub3_41;

	@OriginalMember(owner = "client!vfa", name = "B", descriptor = "I")
	private final int anInt9156;

	@OriginalMember(owner = "client!vfa", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!vfa", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!vfa", name = "F", descriptor = "I")
	public final int anInt9159;

	@OriginalMember(owner = "client!vfa", name = "Q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!vfa", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!vfa", name = "Y", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!vfa", name = "t", descriptor = "[[[Lclient!eca;")
	private Class2_Sub14[][][] aClass2_Sub14ArrayArrayArray1;

	@OriginalMember(owner = "client!vfa", name = "T", descriptor = "[[B")
	private final byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!vfa", name = "E", descriptor = "[[S")
	public final short[][] aShortArrayArray14;

	@OriginalMember(owner = "client!vfa", name = "s", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!vfa", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!vfa", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!vfa", name = "z", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!vfa", name = "bb", descriptor = "Lclient!efa;")
	private Class90 aClass90_40;

	@OriginalMember(owner = "client!vfa", name = "u", descriptor = "Lclient!pga;")
	private Class268 aClass268_2;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!uca;IIII[[I[[II)V")
	public Class151_Sub2(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass162_Sub3_41 = arg0;
		this.anInt9156 = 0x1 << this.anInt9151;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anInt9159 = arg2;
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aFloatArrayArray12 = new float[super.anInt9572 + 1][super.anInt9574 + 1];
		this.aByteArrayArray22 = new byte[arg3 + 1][arg4 + 1];
		this.aClass2_Sub14ArrayArrayArray1 = new Class2_Sub14[arg3][arg4][];
		this.aByteArrayArray21 = new byte[arg3][arg4];
		this.aShortArrayArray14 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aFloatArrayArray13 = new float[super.anInt9572 + 1][super.anInt9574 + 1];
		this.aFloatArrayArray14 = new float[super.anInt9572 + 1][super.anInt9574 + 1];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9574; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt9572; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + local138 * local138 + local154 * local154)));
				this.aFloatArrayArray12[local119][local115] = local173 * (float) local138;
				this.aFloatArrayArray13[local119][local115] = (float) (-arg7 * 2) * local173;
				this.aFloatArrayArray14[local119][local115] = local173 * (float) local154;
			}
		}
		this.aClass90_40 = new Class90(128);
		if ((this.anInt9159 & 0x10) != 0) {
			this.aClass268_2 = new Class268(this.aClass162_Sub3_41, this);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ILclient!uu;IB)V")
	private void method7323(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub8_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray16[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray19[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (this.aClass162_Sub3_41.anIntArray569.length < local22) {
			this.aClass162_Sub3_41.anIntArray570 = new int[local22];
			this.aClass162_Sub3_41.anIntArray569 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass162_Sub3_41.anIntArray569;
		@Pc(50) int[] local50 = this.aClass162_Sub3_41.anIntArray570;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass162_Sub3_41.anInt8685;
			local50[local52] = local19[local52] >> this.aClass162_Sub3_41.anInt8685;
		}
		@Pc(92) int local92 = 0;
		while (local92 < local22) {
			@Pc(98) int local98 = local46[local92];
			@Pc(103) int local103 = local50[local92++];
			@Pc(107) int local107 = local46[local92];
			@Pc(112) int local112 = local50[local92++];
			@Pc(116) int local116 = local46[local92];
			@Pc(121) int local121 = local50[local92++];
			if (-((local116 - local107) * (local112 + -local103)) + (local98 - local107) * (local112 - local121) > 0) {
				arg1.method7147(local107, local103, local112, local121, local98, local116);
			}
		}
	}

	@OriginalMember(owner = "client!vfa", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class2_Sub2_Sub8 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub8 arg2) {
		if ((this.aByteArrayArray21[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9573 >> this.aClass162_Sub3_41.anInt8685;
		@Pc(24) Class2_Sub2_Sub8_Sub2 local24 = (Class2_Sub2_Sub8_Sub2) arg2;
		@Pc(34) Class2_Sub2_Sub8_Sub2 local34;
		if (local24 != null && local24.method7146(local21, local21)) {
			local34 = local24;
			local24.method7145();
		} else {
			local34 = new Class2_Sub2_Sub8_Sub2(this.aClass162_Sub3_41, local21, local21);
		}
		local34.method7143(0, local21, 0, local21);
		this.method7323(arg0, local34, arg1);
		return local34;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
	@Override
	public void method7682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method7675(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass268_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass162_Sub3_41.anInt8720 * arg2 >> 8) >> this.aClass162_Sub3_41.anInt8685;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass162_Sub3_41.anInt8712 >> 8) >> this.aClass162_Sub3_41.anInt8685;
			return this.aClass268_2.method5546(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray22[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt9572][super.anInt9574][];
		}
		if (arg5 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt9572][super.anInt9574][];
		}
		this.anIntArrayArrayArray16[arg0][arg1] = arg2;
		this.anIntArrayArrayArray19[arg0][arg1] = arg4;
		this.anIntArrayArrayArray14[arg0][arg1] = arg6;
		this.anIntArrayArrayArray18[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg3;
		}
		@Pc(88) Class2_Sub14[] local88 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1] = new Class2_Sub14[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class2 local125;
			for (local125 = this.aClass90_40.method1685(local119); local125 != null; local125 = this.aClass90_40.method1682()) {
				@Pc(130) Class2_Sub14 local130 = (Class2_Sub14) local125;
				if (local130.anInt1910 == arg8[local90] && (float) arg9[local90] == local130.aFloat49 && arg10 == local130.anInt1915 && arg11 == local130.anInt1908 && local130.anInt1905 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class2_Sub14(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass90_40.method1684(local88[local90], local119);
			} else {
				local88[local90] = (Class2_Sub14) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray21[arg0][arg1] = (byte) (this.aByteArrayArray21[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt9172) {
			this.anInt9172 = arg6.length;
		}
		this.anInt9171 += arg6.length;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!tg;[I)V")
	@Override
	public void method7674(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass70_67.method1269(new Class2_Sub36(this.aClass162_Sub3_41, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Z[[ZIIIZI)V")
	private void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass2_Sub14Array1 == null) {
			return;
		}
		@Pc(24) int local24 = arg4 + arg4 + 1;
		@Pc(28) int local28 = local24 * local24;
		if (this.aClass162_Sub3_41.anIntArray571.length < local28) {
			this.aClass162_Sub3_41.anIntArray571 = new int[local28];
		}
		if (this.aClass162_Sub3_41.aClass2_Sub7_Sub1_3.aByteArray52.length < this.anInt9150 * 2) {
			this.aClass162_Sub3_41.aClass2_Sub7_Sub1_3 = new Class2_Sub7_Sub1(this.anInt9150 * 2);
		}
		@Pc(64) int local64 = arg2 - arg4;
		@Pc(66) int local66 = local64;
		if (local64 < 0) {
			local64 = 0;
		}
		@Pc(78) int local78 = arg3 - arg4;
		@Pc(80) int local80 = local78;
		if (local78 < 0) {
			local78 = 0;
		}
		@Pc(88) int local88 = arg4 + arg2;
		if (local88 > super.anInt9572 - 1) {
			local88 = super.anInt9572 - 1;
		}
		@Pc(103) int local103 = arg4 + arg3;
		if (super.anInt9574 - 1 < local103) {
			local103 = super.anInt9574 - 1;
		}
		@Pc(120) int local120 = 0;
		@Pc(124) int[] local124 = this.aClass162_Sub3_41.anIntArray571;
		@Pc(137) int local137;
		for (@Pc(126) int local126 = local64; local126 <= local88; local126++) {
			@Pc(135) boolean[] local135 = arg1[local126 - local66];
			for (local137 = local78; local137 <= local103; local137++) {
				if (local135[local137 - local80]) {
					local124[local120++] = local126 + super.anInt9572 * local137;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass162_Sub3_41.method6932();
		} else {
			this.aClass162_Sub3_41.method6893((float) arg5);
			this.aClass162_Sub3_41.method6914();
		}
		this.aClass162_Sub3_41.method6907((this.anInt9159 & 0x7) != 0);
		for (@Pc(201) int local201 = 0; local201 < this.aClass2_Sub14Array1.length; local201++) {
			this.aClass2_Sub14Array1[local201].method1603(local120, local124);
		}
		if (!this.aClass70_67.method1263()) {
			local137 = this.aClass162_Sub3_41.anInt8730;
			@Pc(230) int local230 = this.aClass162_Sub3_41.anInt8701;
			this.aClass162_Sub3_41.pa(0, local230, this.aClass162_Sub3_41.anInt8707);
			this.aClass162_Sub3_41.method6907(false);
			this.aClass162_Sub3_41.method6896(false);
			this.aClass162_Sub3_41.method6923(128);
			this.aClass162_Sub3_41.method6963(-2);
			this.aClass162_Sub3_41.method6911(this.aClass162_Sub3_41.aClass3_Sub1_5);
			this.aClass162_Sub3_41.method6903(8448, 7681);
			this.aClass162_Sub3_41.method6957(34166, 770, 0);
			this.aClass162_Sub3_41.method6926(34167, 0);
			for (@Pc(290) Class2 local290 = this.aClass70_67.method1264(); local290 != null; local290 = this.aClass70_67.method1261()) {
				@Pc(295) Class2_Sub36 local295 = (Class2_Sub36) local290;
				local295.method5408(arg2, arg4, arg1, arg3);
			}
			this.aClass162_Sub3_41.method6957(5890, 768, 0);
			this.aClass162_Sub3_41.method6926(5890, 0);
			this.aClass162_Sub3_41.method6911(null);
			this.aClass162_Sub3_41.pa(local137, local230, this.aClass162_Sub3_41.anInt8707);
		}
		if (this.aClass268_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass162_Sub3_41.method6916(this.aClass133_13, null, null, this.aClass133_14);
		this.aClass268_2.method5543(arg4, arg0, arg3, arg2, arg1);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!vfa", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass268_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass162_Sub3_41.anInt8720 * arg2 >> 8) >> this.aClass162_Sub3_41.anInt8685;
			@Pc(38) int local38 = arg3 - (this.aClass162_Sub3_41.anInt8712 * arg2 >> 8) >> this.aClass162_Sub3_41.anInt8685;
			this.aClass268_2.method5544(local24, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method7325(arg4, arg3, arg0, arg1, arg2, -1);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7677(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9171 <= 0) {
			return;
		}
		this.aClass162_Sub3_41.method6905();
		this.aClass162_Sub3_41.method6972(false);
		this.aClass162_Sub3_41.method6907(false);
		this.aClass162_Sub3_41.method6895(false);
		this.aClass162_Sub3_41.method6896(false);
		this.aClass162_Sub3_41.method6923(0);
		this.aClass162_Sub3_41.method6963(-2);
		this.aClass162_Sub3_41.method6911(null);
		Static167.aFloatArray13[7] = 0.0F;
		Static167.aFloatArray13[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass162_Sub3_41.anInt8616;
		Static167.aFloatArray13[6] = 0.0F;
		Static167.aFloatArray13[9] = 0.0F;
		Static167.aFloatArray13[0] = (float) 1024 / ((float) super.anInt9573 * 128.0F * (float) this.aClass162_Sub3_41.anInt8616);
		Static167.aFloatArray13[3] = 0.0F;
		Static167.aFloatArray13[15] = 1.0F;
		Static167.aFloatArray13[2] = 0.0F;
		Static167.aFloatArray13[8] = 0.0F;
		Static167.aFloatArray13[10] = 0.0F;
		Static167.aFloatArray13[11] = 0.0F;
		Static167.aFloatArray13[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass162_Sub3_41.anInt8634;
		Static167.aFloatArray13[4] = 0.0F;
		Static167.aFloatArray13[5] = (float) 1024 / ((float) super.anInt9573 * 128.0F * (float) this.aClass162_Sub3_41.anInt8634);
		Static167.aFloatArray13[1] = 0.0F;
		Static167.aFloatArray13[14] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static167.aFloatArray13, 0);
		Static167.aFloatArray13[0] = 1.0F;
		Static167.aFloatArray13[6] = 1.0F;
		Static167.aFloatArray13[14] = 0.0F;
		Static167.aFloatArray13[4] = 0.0F;
		Static167.aFloatArray13[9] = 1.0F;
		Static167.aFloatArray13[7] = 0.0F;
		Static167.aFloatArray13[3] = 0.0F;
		Static167.aFloatArray13[13] = 0.0F;
		Static167.aFloatArray13[11] = 0.0F;
		Static167.aFloatArray13[5] = 0.0F;
		Static167.aFloatArray13[12] = 0.0F;
		Static167.aFloatArray13[1] = 0.0F;
		Static167.aFloatArray13[2] = 0.0F;
		Static167.aFloatArray13[8] = 0.0F;
		Static167.aFloatArray13[10] = 0.0F;
		Static167.aFloatArray13[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static167.aFloatArray13, 0);
		if ((this.anInt9159 & 0x7) == 0) {
			this.aClass162_Sub3_41.method6907(false);
		} else {
			this.aClass162_Sub3_41.method6907(true);
			this.aClass162_Sub3_41.method6958();
		}
		this.aClass162_Sub3_41.method6916(this.aClass133_13, this.aClass133_15, this.aClass133_16, this.aClass133_14);
		if (this.aClass162_Sub3_41.aClass2_Sub7_Sub1_3.aByteArray52.length >= this.anInt9150 * 2) {
			this.aClass162_Sub3_41.aClass2_Sub7_Sub1_3.anInt5186 = 0;
		} else {
			this.aClass162_Sub3_41.aClass2_Sub7_Sub1_3 = new Class2_Sub7_Sub1(this.anInt9150 * 2);
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class2_Sub7_Sub1 local318 = this.aClass162_Sub3_41.aClass2_Sub7_Sub1_3;
		@Pc(324) int local324;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(353) short[] local353;
		@Pc(357) int local357;
		if (this.aClass162_Sub3_41.aBoolean720) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = local324 * super.anInt9572 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local353 = this.aShortArrayArray14[local333];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local318.method4511(local353[local357] & 0xFFFF);
								local314++;
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = local324 * super.anInt9572 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local353 = this.aShortArrayArray14[local333];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local314++;
								local318.method4469(local353[local357] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(478) Class79_Sub2 local478 = new Class79_Sub2(this.aClass162_Sub3_41, 5123, local318.aByteArray52, local318.anInt5186);
			this.aClass162_Sub3_41.method6904(0, local314, local478);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7325(arg4, arg3, arg0, arg1, arg2, arg5);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(47) int[] local47 = arg3 == null ? null : new int[local8 * 3];
		@Pc(56) int[] local56 = arg5 == null ? null : new int[local8 * 3];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local8; local60++) {
			@Pc(66) int local66 = arg6[local60];
			@Pc(70) int local70 = arg7[local60];
			@Pc(74) int local74 = arg8[local60];
			local13[local58] = arg2[local66];
			local18[local58] = arg4[local66];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
			if (arg3 != null) {
				local47[local58] = arg3[local66];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local66];
			}
			local58++;
			local13[local58] = arg2[local70];
			local18[local58] = arg4[local70];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
			if (arg3 != null) {
				local47[local58] = arg3[local70];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local70];
			}
			local58++;
			local13[local58] = arg2[local74];
			local18[local58] = arg4[local74];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.O(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!vfa", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt9171 <= 0) {
			this.aClass268_2 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt9572 + 1][super.anInt9574 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; local25 < super.anInt9572; local25++) {
				for (local29 = 1; local29 < super.anInt9574; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray22[local25 - 1][local29] >> 2) + (this.aByteArrayArray22[local25 + 1][local29] >> 3) + (this.aByteArrayArray22[local25][local29 - 1] >> 2) + (this.aByteArrayArray22[local25][local29 + 1] >> 3) + (this.aByteArrayArray22[local25][local29] >> 1));
				}
			}
			this.aClass2_Sub14Array1 = new Class2_Sub14[this.aClass90_40.method1679()];
			this.aClass90_40.method1677(this.aClass2_Sub14Array1);
			for (local29 = 0; local29 < this.aClass2_Sub14Array1.length; local29++) {
				this.aClass2_Sub14Array1[local29].method1610(this.anInt9171);
			}
			@Pc(133) int local133 = 24;
			if (this.anIntArrayArrayArray15 != null) {
				local133 += 4;
			}
			if ((this.anInt9159 & 0x7) != 0) {
				local133 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass162_Sub3_41.aNativeHeap6.a(local133 * this.anInt9171, false);
			@Pc(161) Stream local161 = new Stream(local156);
			@Pc(165) Class2_Sub14[] local165 = new Class2_Sub14[this.anInt9171];
			@Pc(172) int local172 = Static511.method7273(this.anInt9171 / 4);
			if (local172 < 1) {
				local172 = 1;
			}
			@Pc(182) Class90 local182 = new Class90(local172);
			@Pc(186) Class2_Sub14[] local186 = new Class2_Sub14[this.anInt9172];
			@Pc(192) int local192;
			for (@Pc(188) int local188 = 0; super.anInt9572 > local188; local188++) {
				for (local192 = 0; super.anInt9574 > local192; local192++) {
					if (this.anIntArrayArrayArray14[local188][local192] != null) {
						@Pc(208) Class2_Sub14[] local208 = this.aClass2_Sub14ArrayArrayArray1[local188][local192];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray16[local188][local192];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray19[local188][local192];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray18[local188][local192];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray14[local188][local192];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local188][local192];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(264) int[] local264 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local188][local192];
						@Pc(271) float local271 = this.aFloatArrayArray12[local188][local192];
						@Pc(278) float local278 = this.aFloatArrayArray13[local188][local192];
						@Pc(285) float local285 = this.aFloatArrayArray14[local188][local192];
						@Pc(294) float local294 = this.aFloatArrayArray12[local188][local192 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray13[local188][local192 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray14[local188][local192 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray12[local188 + 1][local192 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray13[local188 + 1][local192 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray14[local188 + 1][local192 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray12[local188 + 1][local192];
						@Pc(363) float local363 = this.aFloatArrayArray13[local188 + 1][local192];
						@Pc(372) float local372 = this.aFloatArrayArray14[local188 + 1][local192];
						@Pc(380) int local380 = local23[local188][local192] & 0xFF;
						@Pc(390) int local390 = local23[local188][local192 + 1] & 0xFF;
						@Pc(402) int local402 = local23[local188 + 1][local192 + 1] & 0xFF;
						@Pc(412) int local412 = local23[local188 + 1][local192] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(424) int local424;
						label337: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(422) Class2_Sub14 local422 = local208[local416];
							for (local424 = 0; local424 < local414; local424++) {
								if (local422 == local186[local424]) {
									continue label337;
								}
							}
							local186[local414++] = local422;
						}
						@Pc(466) short[] local466 = this.aShortArrayArray14[local192 * super.anInt9572 + local188] = new short[local236.length];
						for (local424 = 0; local424 < local236.length; local424++) {
							@Pc(480) int local480 = (local188 << super.anInt9568) + local215[local424];
							@Pc(489) int local489 = (local192 << super.anInt9568) + local222[local424];
							@Pc(494) int local494 = local480 >> this.anInt9151;
							@Pc(499) int local499 = local489 >> this.anInt9151;
							@Pc(503) int local503 = local236[local424];
							@Pc(507) int local507 = local229[local424];
							@Pc(515) int local515 = local248 == null ? 0 : local248[local424];
							@Pc(533) long local533 = (long) local507 << 48 | (long) local503 << 32 | (long) (local494 << 16) | (long) local499;
							@Pc(537) int local537 = local215[local424];
							@Pc(541) int local541 = local222[local424];
							@Pc(543) byte local543 = 74;
							@Pc(545) int local545 = 0;
							@Pc(559) float local559;
							@Pc(553) float local553;
							@Pc(551) float local551;
							@Pc(639) float local639;
							@Pc(557) int local557;
							if (local537 == 0 && local541 == 0) {
								local551 = local285;
								local553 = local278;
								local557 = local543 - local380;
								local559 = local271;
							} else if (local537 == 0 && super.anInt9573 == local541) {
								local551 = local312;
								local559 = local294;
								local553 = local303;
								local557 = local543 - local390;
							} else if (local537 == super.anInt9573 && local541 == super.anInt9573) {
								local553 = local334;
								local559 = local323;
								local557 = local543 - local402;
								local551 = local345;
							} else if (super.anInt9573 == local537 && local541 == 0) {
								local551 = local372;
								local553 = local363;
								local559 = local354;
								local557 = local543 - local412;
							} else {
								@Pc(615) float local615 = (float) local537 / (float) super.anInt9573;
								@Pc(622) float local622 = (float) local541 / (float) super.anInt9573;
								@Pc(630) float local630 = (local354 - local271) * local615 + local271;
								local639 = (local363 - local278) * local615 + local278;
								@Pc(647) float local647 = local615 * (local372 - local285) + local285;
								@Pc(655) float local655 = local294 + (local323 - local294) * local615;
								@Pc(663) float local663 = local303 + (local334 - local303) * local615;
								local553 = local639 + local622 * (local663 - local639);
								@Pc(680) float local680 = local312 + (local345 - local312) * local615;
								local559 = local630 + (local655 - local630) * local622;
								local551 = local622 * (local680 - local647) + local647;
								@Pc(708) int local708 = (local537 * (local412 - local380) >> super.anInt9568) + local380;
								@Pc(719) int local719 = ((local402 - local390) * local537 >> super.anInt9568) + local390;
								local557 = local543 - local708 - ((local719 - local708) * local541 >> super.anInt9568);
							}
							@Pc(748) float local748 = 1.0F;
							if (local503 != -1) {
								@Pc(759) int local759 = local557 * (local503 & 0x7F) >> 7;
								if (local759 < 2) {
									local759 = 2;
								} else if (local759 > 126) {
									local759 = 126;
								}
								if ((this.anInt9159 & 0x7) == 0) {
									local748 = local553 * this.aClass162_Sub3_41.aFloatArray70[1] + this.aClass162_Sub3_41.aFloatArray70[0] * local559 + local551 * this.aClass162_Sub3_41.aFloatArray70[2];
									local748 = this.aClass162_Sub3_41.aFloat225 + local748 * (local748 > 0.0F ? this.aClass162_Sub3_41.aFloat222 : this.aClass162_Sub3_41.aFloat226);
								}
								local545 = Static142.anIntArray365[local503 & 0xFF80 | local759];
							}
							@Pc(830) Class2 local830 = null;
							if ((local480 & this.anInt9156 - 1) == 0 && (this.anInt9156 - 1 & local489) == 0) {
								local830 = local182.method1685(local533);
							}
							@Pc(1190) int local1190;
							@Pc(862) int local862;
							if (local830 == null) {
								if (local507 == local503) {
									local862 = local545;
								} else {
									@Pc(872) int local872 = (local507 & 0x7F) * local557 >> 7;
									if (local872 < 2) {
										local872 = 2;
									} else if (local872 > 126) {
										local872 = 126;
									}
									local862 = Static142.anIntArray365[local872 | local507 & 0xFF80];
									if ((this.anInt9159 & 0x7) == 0) {
										local639 = local551 * this.aClass162_Sub3_41.aFloatArray70[2] + local553 * this.aClass162_Sub3_41.aFloatArray70[1] + local559 * this.aClass162_Sub3_41.aFloatArray70[0];
										local639 = this.aClass162_Sub3_41.aFloat225 + (local748 > 0.0F ? this.aClass162_Sub3_41.aFloat222 : this.aClass162_Sub3_41.aFloat226) * local748;
										@Pc(945) int local945 = local862 >> 16 & 0xFF;
										@Pc(951) int local951 = local862 >> 8 & 0xFF;
										local945 = (int) ((float) local945 * local639);
										@Pc(961) int local961 = local862 & 0xFF;
										if (local945 < 0) {
											local945 = 0;
										} else if (local945 > 255) {
											local945 = 255;
										}
										local951 = (int) ((float) local951 * local639);
										if (local951 < 0) {
											local951 = 0;
										} else if (local951 > 255) {
											local951 = 255;
										}
										local961 = (int) ((float) local961 * local639);
										if (local961 < 0) {
											local961 = 0;
										} else if (local961 > 255) {
											local961 = 255;
										}
										local862 = local945 << 16 | local951 << 8 | local961;
									}
								}
								if (this.aClass162_Sub3_41.aBoolean720) {
									local161.a((float) local480);
									local161.a((float) (local515 + this.method7680(local480, local489)));
									local161.a((float) local489);
									local161.d((byte) (local862 >> 16));
									local161.d((byte) (local862 >> 8));
									local161.d((byte) local862);
									local161.d(-1);
									local161.a((float) local480);
									local161.a((float) local489);
									if (this.anIntArrayArrayArray15 != null) {
										local161.a((float) (local264 == null ? 0 : local264[local424] - 1));
									}
									if ((this.anInt9159 & 0x7) != 0) {
										local161.a(local559);
										local161.a(local553);
										local161.a(local551);
									}
								} else {
									local161.b((float) local480);
									local161.b((float) (this.method7680(local480, local489) + local515));
									local161.b((float) local489);
									local161.d((byte) (local862 >> 16));
									local161.d((byte) (local862 >> 8));
									local161.d((byte) local862);
									local161.d(-1);
									local161.b((float) local480);
									local161.b((float) local489);
									if (this.anIntArrayArrayArray15 != null) {
										local161.b((float) (local264 == null ? 0 : local264[local424] - 1));
									}
									if ((this.anInt9159 & 0x7) != 0) {
										local161.b(local559);
										local161.b(local553);
										local161.b(local551);
									}
								}
								local1190 = this.anInt9169++;
								local466[local424] = (short) local1190;
								if (local503 != -1) {
									local165[local1190] = local208[local424];
								}
								local182.method1684(new Class2_Sub43(local466[local424]), local533);
							} else {
								local466[local424] = ((Class2_Sub43) local830).aShort96;
								local1190 = local466[local424] & 0xFFFF;
								if (local503 != -1 && local208[local424].aLong268 < local165[local1190].aLong268) {
									local165[local1190] = local208[local424];
								}
							}
							for (local862 = 0; local862 < local414; local862++) {
								local186[local862].method1604(local748, local557, local545, local1190);
							}
							this.anInt9150++;
						}
					}
				}
			}
			for (local192 = 0; local192 < this.anInt9169; local192++) {
				@Pc(1302) Class2_Sub14 local1302 = local165[local192];
				if (local1302 != null) {
					local1302.method1609(local192);
				}
			}
			@Pc(1339) int local1339;
			for (@Pc(1319) int local1319 = 0; super.anInt9572 > local1319; local1319++) {
				for (@Pc(1323) int local1323 = 0; super.anInt9574 > local1323; local1323++) {
					@Pc(1335) short[] local1335 = this.aShortArrayArray14[local1319 + super.anInt9572 * local1323];
					if (local1335 != null) {
						local1339 = 0;
						@Pc(1341) int local1341 = 0;
						while (local1335.length > local1341) {
							@Pc(1350) int local1350 = local1335[local1341++] & 0xFFFF;
							@Pc(1357) int local1357 = local1335[local1341++] & 0xFFFF;
							@Pc(1364) int local1364 = local1335[local1341++] & 0xFFFF;
							@Pc(1368) Class2_Sub14 local1368 = local165[local1350];
							@Pc(1372) Class2_Sub14 local1372 = local165[local1357];
							@Pc(1376) Class2_Sub14 local1376 = local165[local1364];
							@Pc(1378) Class2_Sub14 local1378 = null;
							if (local1368 != null) {
								local1368.method1607(local1339, local1323, local1319);
								local1378 = local1368;
							}
							if (local1372 != null) {
								local1372.method1607(local1339, local1323, local1319);
								if (local1378 == null || local1372.aLong268 < local1378.aLong268) {
									local1378 = local1372;
								}
							}
							if (local1376 != null) {
								local1376.method1607(local1339, local1323, local1319);
								if (local1378 == null || local1378.aLong268 > local1376.aLong268) {
									local1378 = local1376;
								}
							}
							if (local1378 != null) {
								if (local1368 != null) {
									local1378.method1609(local1350);
								}
								if (local1372 != null) {
									local1378.method1609(local1357);
								}
								if (local1376 != null) {
									local1378.method1609(local1364);
								}
								local1378.method1607(local1339, local1323, local1319);
							}
							local1339++;
						}
					}
				}
			}
			local161.c();
			this.anInterface10_7 = this.aClass162_Sub3_41.method6909(local161.a(), local133, local156);
			this.aClass133_14 = new Class133(this.anInterface10_7, 5126, 3, 0);
			this.aClass133_16 = new Class133(this.anInterface10_7, 5121, 4, 12);
			@Pc(1517) byte local1517;
			if (this.anIntArrayArrayArray15 == null) {
				this.aClass133_13 = new Class133(this.anInterface10_7, 5126, 2, 16);
				local1517 = 24;
			} else {
				this.aClass133_13 = new Class133(this.anInterface10_7, 5126, 3, 16);
				local1517 = 28;
			}
			if ((this.anInt9159 & 0x7) != 0) {
				this.aClass133_15 = new Class133(this.anInterface10_7, 5126, 3, local1517);
			}
			@Pc(1554) long[] local1554 = new long[this.aClass2_Sub14Array1.length];
			for (local1339 = 0; local1339 < this.aClass2_Sub14Array1.length; local1339++) {
				@Pc(1563) Class2_Sub14 local1563 = this.aClass2_Sub14Array1[local1339];
				local1554[local1339] = local1563.aLong268;
				local1563.method1605(this.anInt9169);
			}
			Static517.method6674(this.aClass2_Sub14Array1, local1554);
			if (this.aClass268_2 != null) {
				this.aClass268_2.method5542();
			}
		}
		this.anIntArrayArrayArray15 = null;
		this.aByteArrayArray22 = null;
		this.aClass2_Sub14ArrayArrayArray1 = null;
		this.anIntArrayArrayArray16 = this.anIntArrayArrayArray19 = null;
		this.anIntArrayArrayArray17 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray13 = this.aFloatArrayArray14 = null;
		this.anIntArrayArrayArray14 = null;
		this.aClass90_40 = null;
		this.anIntArrayArrayArray18 = null;
	}

	@OriginalMember(owner = "client!vfa", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass268_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass162_Sub3_41.anInt8720 * arg2 >> 8) >> this.aClass162_Sub3_41.anInt8685;
			@Pc(39) int local39 = arg3 - (this.aClass162_Sub3_41.anInt8712 * arg2 >> 8) >> this.aClass162_Sub3_41.anInt8685;
			this.aClass268_2.method5549(local24, local39, arg0);
		}
	}
}
