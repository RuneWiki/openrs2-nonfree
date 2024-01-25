import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
	private int anInt6362;

	@OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
	private int anInt6367;

	@OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
	private int anInt6368;

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "Lclient!pe;")
	private Class156 aClass156_12;

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "Lclient!pe;")
	public Class156 aClass156_13;

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "[Lclient!di;")
	private Class5_Sub11[] aClass5_Sub11Array1;

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "Lclient!pe;")
	public Class156 aClass156_14;

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "Lclient!ti;")
	private Interface9 anInterface9_5;

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
	private int anInt6369;

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "Lclient!pe;")
	public Class156 aClass156_15;

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lclient!pe;")
	public Class156 aClass156_16;

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "Lclient!vn;")
	private final Class211 aClass211_41 = new Class211();

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!po;")
	public final Class59_Sub1 aClass59_Sub1_38;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "[[I")
	private final int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
	public final int anInt6365;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public int anInt6363;

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
	public final int anInt6364;

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray23;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "[[[Lclient!di;")
	private Class5_Sub11[][][] aClass5_Sub11ArrayArrayArray1;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray22;

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray24;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "[[S")
	public final short[][] aShortArrayArray16;

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "[[B")
	private final byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!wa", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "Lclient!cs;")
	private Class42 aClass42_57;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "Lclient!lo;")
	private Class123 aClass123_2;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!po;IIII[[I[[II)V")
	public Class3_Sub2(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass59_Sub1_38 = arg0;
		this.anIntArrayArray58 = arg5;
		this.anIntArrayArray59 = arg6;
		this.anInt6365 = arg2;
		while (arg7 > 1) {
			this.anInt6363++;
			arg7 >>= 0x1;
		}
		this.anInt6364 = 0x1 << this.anInt6363;
		this.anIntArrayArrayArray23 = new int[arg3][arg4][];
		this.aClass5_Sub11ArrayArrayArray1 = new Class5_Sub11[arg3][arg4][];
		this.anIntArrayArrayArray21 = new int[arg3][arg4][];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.anIntArrayArrayArray22 = new int[arg3][arg4][];
		this.anIntArrayArrayArray24 = new int[arg3][arg4][];
		this.aShortArrayArray16 = new short[arg3 * arg4][];
		this.aByteArrayArray23 = new byte[arg3][arg4];
		this.aByteArrayArray24 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray3 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray5 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray4 = new float[arg3 + 1][arg4 + 1];
		for (@Pc(119) int local119 = 1; local119 < arg4; local119++) {
			for (@Pc(124) int local124 = 1; local124 < arg3; local124++) {
				@Pc(145) int local145 = this.anIntArrayArray58[local124 + 1][local119] - this.anIntArrayArray58[local124 - 1][local119];
				@Pc(163) int local163 = this.anIntArrayArray58[local124][local119 + 1] - this.anIntArrayArray58[local124][local119 - 1];
				@Pc(178) float local178 = (float) (1.0D / Math.sqrt((double) (local145 * local145 + local163 * local163 + 65536)));
				this.aFloatArrayArray3[local124][local119] = (float) local145 * local178;
				this.aFloatArrayArray5[local124][local119] = -256.0F * local178;
				this.aFloatArrayArray4[local124][local119] = (float) local163 * local178;
			}
		}
		this.aClass42_57 = new Class42(128);
		if ((this.anInt6365 & 0x10) != 0) {
			this.aClass123_2 = new Class123(this.aClass59_Sub1_38, this);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5634(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6369 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass59_Sub1_38.anOpengl2;
		this.aClass59_Sub1_38.method4343();
		this.aClass59_Sub1_38.method4310(false);
		this.aClass59_Sub1_38.method4321(false);
		this.aClass59_Sub1_38.method4267(false);
		this.aClass59_Sub1_38.method4274(false);
		this.aClass59_Sub1_38.method4342(0);
		this.aClass59_Sub1_38.method4320();
		this.aClass59_Sub1_38.method4296(null);
		Static340.aFloatArray28[0] = (float) 1024 / ((float) this.anInt6364 * 128.0F * (float) this.aClass59_Sub1_38.anInt4760);
		Static340.aFloatArray28[1] = 0.0F;
		Static340.aFloatArray28[2] = 0.0F;
		Static340.aFloatArray28[3] = 0.0F;
		Static340.aFloatArray28[4] = 0.0F;
		Static340.aFloatArray28[5] = (float) 1024 / ((float) this.anInt6364 * 128.0F * (float) this.aClass59_Sub1_38.anInt4762);
		Static340.aFloatArray28[6] = 0.0F;
		Static340.aFloatArray28[7] = 0.0F;
		Static340.aFloatArray28[8] = 0.0F;
		Static340.aFloatArray28[9] = 0.0F;
		Static340.aFloatArray28[10] = 0.0F;
		Static340.aFloatArray28[11] = 0.0F;
		Static340.aFloatArray28[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass59_Sub1_38.anInt4760;
		Static340.aFloatArray28[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass59_Sub1_38.anInt4762;
		Static340.aFloatArray28[14] = 0.0F;
		Static340.aFloatArray28[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static340.aFloatArray28, 0);
		Static340.aFloatArray28[0] = 1.0F;
		Static340.aFloatArray28[1] = 0.0F;
		Static340.aFloatArray28[2] = 0.0F;
		Static340.aFloatArray28[3] = 0.0F;
		Static340.aFloatArray28[4] = 0.0F;
		Static340.aFloatArray28[5] = 0.0F;
		Static340.aFloatArray28[6] = 1.0F;
		Static340.aFloatArray28[7] = 0.0F;
		Static340.aFloatArray28[8] = 0.0F;
		Static340.aFloatArray28[9] = 1.0F;
		Static340.aFloatArray28[10] = 0.0F;
		Static340.aFloatArray28[11] = 0.0F;
		Static340.aFloatArray28[12] = 0.0F;
		Static340.aFloatArray28[13] = 0.0F;
		Static340.aFloatArray28[14] = 0.0F;
		Static340.aFloatArray28[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static340.aFloatArray28, 0);
		this.aClass59_Sub1_38.method4330();
		this.aClass59_Sub1_38.method4322(this.aClass156_12);
		this.aClass59_Sub1_38.method4288(this.aClass156_13);
		this.aClass59_Sub1_38.method4275(0, this.aClass156_14);
		if ((this.anInt6365 & 0x7) == 0) {
			this.aClass59_Sub1_38.method4321(false);
		} else {
			this.aClass59_Sub1_38.method4268(this.aClass156_15);
			this.aClass59_Sub1_38.method4321(true);
		}
		this.aClass59_Sub1_38.method4325();
		if (Static340.aClass5_Sub1_9.aByteArray18.length < this.anInt6367 * 2) {
			Static340.aClass5_Sub1_9 = new Class5_Sub1(this.anInt6367 * 2);
		} else {
			Static340.aClass5_Sub1_9.anInt2029 = 0;
		}
		@Pc(301) int local301 = 0;
		@Pc(307) int local307;
		@Pc(317) int local317;
		@Pc(319) int local319;
		@Pc(337) short[] local337;
		@Pc(341) int local341;
		if (this.aClass59_Sub1_38.aBoolean350) {
			for (local307 = arg1; local307 < arg3; local307++) {
				local317 = local307 * this.anInt6360 + arg0;
				for (local319 = arg0; local319 < arg2; local319++) {
					if (arg4[local319 - arg0][local307 - arg1]) {
						local337 = this.aShortArrayArray16[local317];
						if (local337 != null) {
							for (local341 = 0; local341 < local337.length; local341++) {
								Static340.aClass5_Sub1_9.method1870(local337[local341]);
								local301++;
							}
						}
					}
					local317++;
				}
			}
		} else {
			for (local307 = arg1; local307 < arg3; local307++) {
				local317 = local307 * this.anInt6360 + arg0;
				for (local319 = arg0; local319 < arg2; local319++) {
					if (arg4[local319 - arg0][local307 - arg1]) {
						local337 = this.aShortArrayArray16[local317];
						if (local337 != null) {
							for (local341 = 0; local341 < local337.length; local341++) {
								Static340.aClass5_Sub1_9.method1829(local337[local341]);
								local301++;
							}
						}
					}
					local317++;
				}
			}
		}
		if (local301 > 0) {
			this.aClass59_Sub1_38.anInterface2_4.method2597(Static340.aClass5_Sub1_9.aByteArray18, Static340.aClass5_Sub1_9.anInt2029);
			this.aClass59_Sub1_38.method4318(this.aClass59_Sub1_38.anInterface2_4, 0, local301);
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(Lclient!lg;IIIIZ)V")
	@Override
	public void method5631(@OriginalArg(0) Class5_Sub9_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass123_2 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass59_Sub1_38.anInt4795 >> 8) >> this.aClass59_Sub1_38.anInt4761;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass59_Sub1_38.anInt4784 >> 8) >> this.aClass59_Sub1_38.anInt4761;
			this.aClass123_2.method3314(local19, arg0, local33);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!vg;[I)V")
	@Override
	public void method5637(@OriginalArg(0) Class5_Sub13 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass211_41.method5609(new Class5_Sub43(this.aClass59_Sub1_38, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
	@Override
	public void method5640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray24[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method5632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(2) int local2 = arg8.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local2; local45++) {
			@Pc(52) int local52 = arg5[local45];
			@Pc(56) int local56 = arg6[local45];
			@Pc(60) int local60 = arg7[local45];
			local7[local43] = arg2[local52];
			local12[local43] = arg4[local52];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local52];
			}
			local43++;
			local7[local43] = arg2[local56];
			local12[local43] = arg4[local56];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local56];
			}
			local43++;
			local7[local43] = arg2[local60];
			local12[local43] = arg4[local60];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local60];
			}
			local43++;
		}
		this.method5641(arg0, arg1, local7, local41, local12, local17, local22, local27, local32, arg12, arg13, false);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILclient!lg;)Lclient!lg;")
	@Override
	public Class5_Sub9_Sub14 method5627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub9_Sub14 arg2) {
		if ((this.aByteArrayArray23[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt6364 >> this.aClass59_Sub1_38.anInt4761;
		@Pc(20) Class5_Sub9_Sub14_Sub1 local20 = (Class5_Sub9_Sub14_Sub1) arg2;
		@Pc(30) Class5_Sub9_Sub14_Sub1 local30;
		if (local20 != null && local20.method3945(local17, local17)) {
			local30 = local20;
			local20.method3943();
		} else {
			local30 = new Class5_Sub9_Sub14_Sub1(this.aClass59_Sub1_38, local17, local17);
		}
		local30.method3942(local17, 0, 0, local17);
		this.method5642(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass5_Sub11Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass59_Sub1_38.aFloat71;
		@Pc(10) float local10 = this.aClass59_Sub1_38.aFloat79;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static340.anIntArray549.length < local20) {
			Static340.anIntArray549 = new int[local20];
		}
		if (Static340.aClass5_Sub1_9.aByteArray18.length < this.anInt6367 * 2) {
			Static340.aClass5_Sub1_9 = new Class5_Sub1(this.anInt6367 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt6360 - 1) {
			local67 = this.anInt6360 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt6361 - 1) {
			local82 = this.anInt6361 - 1;
		}
		Static340.anInt6366 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static340.anIntArray549[Static340.anInt6366++] = local108 * this.anInt6360 + local97;
				}
			}
		}
		this.aClass59_Sub1_38.method4285();
		for (local97 = 0; local97 < this.aClass5_Sub11Array1.length; local97++) {
			this.aClass5_Sub11Array1[local97].method1211(Static340.anIntArray549, Static340.anInt6366);
		}
		if (!this.aClass211_41.method5606()) {
			local97 = this.aClass59_Sub1_38.anInt4765;
			@Pc(169) int local169 = this.aClass59_Sub1_38.anInt4780;
			this.aClass59_Sub1_38.method4790(0, local169);
			this.aClass59_Sub1_38.method4859(local10, local6 - 4.0F);
			this.aClass59_Sub1_38.method4321(false);
			this.aClass59_Sub1_38.method4274(false);
			this.aClass59_Sub1_38.method4342(130);
			this.aClass59_Sub1_38.method4320();
			this.aClass59_Sub1_38.method4296(this.aClass59_Sub1_38.aClass11_Sub1_6);
			this.aClass59_Sub1_38.method4311(8448, 7681);
			this.aClass59_Sub1_38.method4297(0, 34166, 770);
			this.aClass59_Sub1_38.method4298(0, 34167);
			for (@Pc(225) Class5 local225 = this.aClass211_41.method5608(); local225 != null; local225 = this.aClass211_41.method5603()) {
				@Pc(230) Class5_Sub43 local230 = (Class5_Sub43) local225;
				local230.method5759(arg3, arg0, arg2, arg1);
			}
			this.aClass59_Sub1_38.method4297(0, 5890, 768);
			this.aClass59_Sub1_38.method4298(0, 5890);
			this.aClass59_Sub1_38.method4296(null);
			this.aClass59_Sub1_38.method4790(local97, local169);
		}
		if (this.aClass123_2 != null) {
			this.aClass59_Sub1_38.method4859(local10, local6 - 8.0F);
			this.aClass59_Sub1_38.method4285();
			this.aClass59_Sub1_38.method4288(this.aClass156_13);
			this.aClass59_Sub1_38.method4275(0, this.aClass156_14);
			this.aClass59_Sub1_38.method4325();
			this.aClass123_2.method3321(arg1, arg2, arg4, arg3, arg0);
		}
		this.aClass59_Sub1_38.method4859(local10, local6);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Lclient!lg;IIIIZ)V")
	@Override
	public void method5628(@OriginalArg(0) Class5_Sub9_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass123_2 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass59_Sub1_38.anInt4795 >> 8) >> this.aClass59_Sub1_38.anInt4761;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass59_Sub1_38.anInt4784 >> 8) >> this.aClass59_Sub1_38.anInt4761;
			this.aClass123_2.method3318(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!om;II)V")
	private void method5642(@OriginalArg(0) Class5_Sub9_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray21[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray20[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static340.anIntArray551.length < local16) {
			Static340.anIntArray551 = new int[local16];
			Static340.anIntArray550 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static340.anIntArray551[local28] = (local6[local28] & 0xFF) >> this.aClass59_Sub1_38.anInt4761;
			Static340.anIntArray550[local28] = (local13[local28] & 0xFF) >> this.aClass59_Sub1_38.anInt4761;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static340.anIntArray551[local28];
			@Pc(71) int local71 = Static340.anIntArray550[local28++];
			@Pc(75) int local75 = Static340.anIntArray551[local28];
			@Pc(80) int local80 = Static340.anIntArray550[local28++];
			@Pc(84) int local84 = Static340.anIntArray551[local28];
			@Pc(89) int local89 = Static340.anIntArray550[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method3946(local75, local84, local89, local80, local71, local66);
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!lg;IIIIZ)Z")
	@Override
	public boolean method5626(@OriginalArg(0) Class5_Sub9_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass123_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass59_Sub1_38.anInt4795 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass59_Sub1_38.anInt4784 >> 8) >> 3;
			return this.aClass123_2.method3320(arg0, local18, local30);
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)I")
	@Override
	public int method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray58[arg0][arg1];
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
	@Override
	public void method5629() {
		if (this.anInt6369 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt6360 + 1][this.anInt6361 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt6360; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt6361; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray24[local14 - 1][local20] >> 2) + (this.aByteArrayArray24[local14 + 1][local20] >> 3) + (this.aByteArrayArray24[local14][local20 - 1] >> 2) + (this.aByteArrayArray24[local14][local20 + 1] >> 3) + (this.aByteArrayArray24[local14][local20] >> 1));
				}
			}
			this.aClass5_Sub11Array1 = new Class5_Sub11[this.aClass42_57.method1056()];
			this.aClass42_57.method1049(this.aClass5_Sub11Array1);
			for (local14 = 0; local14 < this.aClass5_Sub11Array1.length; local14++) {
				this.aClass5_Sub11Array1[local14].method1207(this.anInt6369);
			}
			local14 = 24;
			if (this.anIntArrayArray59 != null) {
				local14 += 4;
			}
			if ((this.anInt6365 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt6369 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class5_Sub11[] local141 = new Class5_Sub11[this.anInt6369];
			@Pc(149) Class42 local149 = new Class42(Static7.method234(this.anInt6369));
			@Pc(153) Class5_Sub11[] local153 = new Class5_Sub11[this.anInt6368];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt6360; local155++) {
				for (local161 = 0; local161 < this.anInt6361; local161++) {
					if (this.anIntArrayArrayArray22[local155][local161] != null) {
						@Pc(180) Class5_Sub11[] local180 = this.aClass5_Sub11ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray23[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray21[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray20[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray24[local155][local161];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray22[local155][local161];
						if (local208 == null) {
							local208 = local215;
						}
						@Pc(226) float local226 = this.aFloatArrayArray3[local155][local161];
						@Pc(233) float local233 = this.aFloatArrayArray5[local155][local161];
						@Pc(240) float local240 = this.aFloatArrayArray4[local155][local161];
						@Pc(249) float local249 = this.aFloatArrayArray3[local155][local161 + 1];
						@Pc(258) float local258 = this.aFloatArrayArray5[local155][local161 + 1];
						@Pc(267) float local267 = this.aFloatArrayArray4[local155][local161 + 1];
						@Pc(278) float local278 = this.aFloatArrayArray3[local155 + 1][local161 + 1];
						@Pc(289) float local289 = this.aFloatArrayArray5[local155 + 1][local161 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray4[local155 + 1][local161 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray3[local155 + 1][local161];
						@Pc(318) float local318 = this.aFloatArrayArray5[local155 + 1][local161];
						@Pc(327) float local327 = this.aFloatArrayArray4[local155 + 1][local161];
						@Pc(335) int local335 = local12[local155][local161] & 0xFF;
						@Pc(345) int local345 = local12[local155][local161 + 1] & 0xFF;
						@Pc(357) int local357 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(367) int local367 = local12[local155 + 1][local161] & 0xFF;
						@Pc(378) float local378;
						@Pc(388) float local388;
						@Pc(400) float local400;
						@Pc(410) float local410;
						if (this.anIntArrayArray59 == null) {
							local410 = 0.0F;
							local400 = 0.0F;
							local388 = 0.0F;
							local378 = 0.0F;
						} else {
							local378 = this.anIntArrayArray59[local155][local161];
							local388 = this.anIntArrayArray59[local155][local161 + 1];
							local400 = this.anIntArrayArray59[local155 + 1][local161 + 1];
							local410 = this.anIntArrayArray59[local155 + 1][local161];
						}
						@Pc(421) int local421 = 0;
						@Pc(433) int local433;
						label303: for (@Pc(423) int local423 = 0; local423 < local215.length; local423++) {
							@Pc(431) Class5_Sub11 local431 = local180[local423];
							for (local433 = 0; local433 < local421; local433++) {
								if (local153[local433] == local431) {
									continue label303;
								}
							}
							local153[local421++] = local431;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray16[local161 * this.anInt6360 + local155] = new short[local215.length];
						for (@Pc(467) int local467 = 0; local467 < local215.length; local467++) {
							@Pc(480) int local480 = (local155 << this.anInt6363) + local194[local467];
							@Pc(489) int local489 = (local161 << this.anInt6363) + local201[local467];
							@Pc(493) int local493 = local215[local467];
							@Pc(497) int local497 = local208[local467];
							@Pc(505) int local505 = local187 == null ? 0 : local187[local467];
							@Pc(523) long local523 = (long) local497 << 48 | (long) local493 << 32 | (long) (local480 << 16) | (long) local489;
							@Pc(527) int local527 = local194[local467];
							@Pc(531) int local531 = local201[local467];
							@Pc(535) int local535 = 0;
							@Pc(537) float local537 = 1.0F;
							@Pc(553) int local553;
							@Pc(543) float local543;
							@Pc(545) float local545;
							@Pc(547) float local547;
							@Pc(549) float local549;
							@Pc(643) float local643;
							if (local527 == 0 && local531 == 0) {
								local543 = local226;
								local545 = local233;
								local547 = local240;
								local549 = local378;
								local553 = 74 - local335;
							} else if (local527 == 0 && local531 == this.anInt6364) {
								local543 = local249;
								local545 = local258;
								local547 = local267;
								local549 = local388;
								local553 = 74 - local345;
							} else if (local527 == this.anInt6364 && local531 == this.anInt6364) {
								local543 = local278;
								local545 = local289;
								local547 = local300;
								local549 = local400;
								local553 = 74 - local357;
							} else if (local527 == this.anInt6364 && local531 == 0) {
								local543 = local309;
								local545 = local318;
								local547 = local327;
								local549 = local410;
								local553 = 74 - local367;
							} else {
								@Pc(620) float local620 = (float) local527 / (float) this.anInt6364;
								@Pc(627) float local627 = (float) local531 / (float) this.anInt6364;
								@Pc(635) float local635 = local226 + (local309 - local226) * local620;
								local643 = local233 + (local318 - local233) * local620;
								@Pc(651) float local651 = local240 + (local327 - local240) * local620;
								@Pc(659) float local659 = local249 + (local278 - local249) * local620;
								@Pc(667) float local667 = local258 + (local289 - local258) * local620;
								@Pc(675) float local675 = local267 + (local300 - local267) * local620;
								local543 = local635 + (local659 - local635) * local627;
								local545 = local643 + (local667 - local643) * local627;
								local547 = local651 + (local675 - local651) * local627;
								@Pc(710) int local710 = local335 + ((local367 - local335) * local527 >> this.anInt6363);
								@Pc(721) int local721 = local345 + ((local357 - local345) * local527 >> this.anInt6363);
								local553 = 74 - local710 - ((local721 - local710) * local531 >> this.anInt6363);
								@Pc(742) float local742 = local378 + (local410 - local378) * local620;
								@Pc(750) float local750 = local388 + (local400 - local388) * local620;
								local549 = local742 + (local750 - local742) * local627;
							}
							if (local493 != -1) {
								@Pc(769) int local769 = (local493 & 0x7F) * local553 >> 7;
								if (local769 < 2) {
									local769 = 2;
								} else if (local769 > 126) {
									local769 = 126;
								}
								local535 = Static169.anIntArray252[local493 & 0xFF80 | local769];
								if ((this.anInt6365 & 0x7) == 0) {
									local537 = this.aClass59_Sub1_38.aFloatArray26[0] * local543 + this.aClass59_Sub1_38.aFloatArray26[1] * local545 + this.aClass59_Sub1_38.aFloatArray26[2] * local547;
									local537 = this.aClass59_Sub1_38.aFloat81 + local537 * (local537 > 0.0F ? this.aClass59_Sub1_38.aFloat74 : this.aClass59_Sub1_38.aFloat89);
								}
							}
							@Pc(840) Class5 local840 = local149.method1052(local523);
							@Pc(872) int local872;
							if (local840 == null) {
								if (local497 == local493) {
									local872 = local535;
								} else {
									@Pc(853) int local853 = (local497 & 0x7F) * local553 >> 7;
									if (local853 < 2) {
										local853 = 2;
									} else if (local853 > 126) {
										local853 = 126;
									}
									local872 = Static169.anIntArray252[local497 & 0xFF80 | local853];
									if ((this.anInt6365 & 0x7) == 0) {
										@Pc(900) float local900 = this.aClass59_Sub1_38.aFloatArray26[0] * local543 + this.aClass59_Sub1_38.aFloatArray26[1] * local545 + this.aClass59_Sub1_38.aFloatArray26[2] * local547;
										local643 = this.aClass59_Sub1_38.aFloat81 + local537 * (local537 > 0.0F ? this.aClass59_Sub1_38.aFloat74 : this.aClass59_Sub1_38.aFloat89);
										@Pc(925) int local925 = local872 >> 16 & 0xFF;
										@Pc(931) int local931 = local872 >> 8 & 0xFF;
										@Pc(935) int local935 = local872 & 0xFF;
										local925 = (int) ((float) local925 * local643);
										if (local925 < 0) {
											local925 = 0;
										} else if (local925 > 255) {
											local925 = 255;
										}
										local931 = (int) ((float) local931 * local643);
										if (local931 < 0) {
											local931 = 0;
										} else if (local931 > 255) {
											local931 = 255;
										}
										local935 = (int) ((float) local935 * local643);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local872 = local925 << 16 | local931 << 8 | local935;
									}
								}
								local137.putFloat((float) local480);
								local137.putFloat((float) (this.method5639(local480, local489) + local505));
								local137.putFloat((float) local489);
								local137.putFloat((float) local480);
								local137.putFloat((float) local489);
								local137.put((byte) (local872 >> 16));
								local137.put((byte) (local872 >> 8));
								local137.put((byte) local872);
								local137.put((byte) -1);
								if ((this.anInt6365 & 0x7) != 0) {
									local137.putFloat(local543);
									local137.putFloat(local545);
									local137.putFloat(local547);
								}
								if (this.anIntArrayArray59 != null) {
									local137.putFloat(local549 + (float) local505);
								}
								local433 = this.anInt6362++;
								local465[local467] = (short) local433;
								if (local493 != -1) {
									local141[local433] = local180[local467];
								}
								local149.method1050(local523, new Class5_Sub23(local465[local467]));
							} else {
								local465[local467] = ((Class5_Sub23) local840).aShort32;
								local433 = local465[local467] & 0xFFFF;
								if (local493 != -1 && local180[local467].aLong218 < local141[local433].aLong218) {
									local141[local433] = local180[local467];
								}
							}
							for (local872 = 0; local872 < local421; local872++) {
								local153[local872].method1210(local553, local433, local535, local537);
							}
							this.anInt6367++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt6362; local155++) {
				@Pc(1178) Class5_Sub11 local1178 = local141[local155];
				if (local1178 != null) {
					local1178.method1209(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt6360; local155++) {
				for (local161 = 0; local161 < this.anInt6361; local161++) {
					@Pc(1208) short[] local1208 = this.aShortArrayArray16[local161 * this.anInt6360 + local155];
					if (local1208 != null) {
						@Pc(1212) int local1212 = 0;
						@Pc(1214) int local1214 = 0;
						while (local1214 < local1208.length) {
							@Pc(1225) int local1225 = local1208[local1214++] & 0xFFFF;
							@Pc(1232) int local1232 = local1208[local1214++] & 0xFFFF;
							@Pc(1239) int local1239 = local1208[local1214++] & 0xFFFF;
							@Pc(1243) Class5_Sub11 local1243 = local141[local1225];
							@Pc(1247) Class5_Sub11 local1247 = local141[local1232];
							@Pc(1251) Class5_Sub11 local1251 = local141[local1239];
							@Pc(1253) Class5_Sub11 local1253 = null;
							if (local1243 != null) {
								local1243.method1208(local1212, local161, local155);
								local1253 = local1243;
							}
							if (local1247 != null) {
								local1247.method1208(local1212, local161, local155);
								if (local1253 == null || local1247.aLong218 < local1253.aLong218) {
									local1253 = local1247;
								}
							}
							if (local1251 != null) {
								local1251.method1208(local1212, local161, local155);
								if (local1253 == null || local1251.aLong218 < local1253.aLong218) {
									local1253 = local1251;
								}
							}
							if (local1253 != null) {
								if (local1243 != null) {
									local1253.method1209(local1225);
								}
								if (local1247 != null) {
									local1253.method1209(local1232);
								}
								if (local1251 != null) {
									local1253.method1209(local1239);
								}
								local1253.method1208(local1212, local161, local155);
							}
							local1212++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface9_5 = this.aClass59_Sub1_38.method4300(local14, local137);
			local155 = 24;
			this.aClass156_13 = new Class156(this.aClass59_Sub1_38, this.anInterface9_5, 5126, 3, 0);
			this.aClass156_14 = new Class156(this.aClass59_Sub1_38, this.anInterface9_5, 5126, 2, 12);
			this.aClass156_12 = new Class156(this.aClass59_Sub1_38, this.anInterface9_5, 5121, 4, 20);
			if ((this.anInt6365 & 0x7) != 0) {
				this.aClass156_15 = new Class156(this.aClass59_Sub1_38, this.anInterface9_5, 5126, 3, 24);
				local155 += 12;
			}
			if (this.anIntArrayArray59 != null) {
				this.aClass156_16 = new Class156(this.aClass59_Sub1_38, this.anInterface9_5, 5126, 1, local155);
				local155 += 4;
			}
			@Pc(1419) long[] local1419 = new long[this.aClass5_Sub11Array1.length];
			for (@Pc(1421) int local1421 = 0; local1421 < this.aClass5_Sub11Array1.length; local1421++) {
				@Pc(1431) Class5_Sub11 local1431 = this.aClass5_Sub11Array1[local1421];
				local1419[local1421] = local1431.aLong218;
				local1431.method1212(this.anInt6362);
			}
			Static110.method2185(local1419, this.aClass5_Sub11Array1);
			if (this.aClass123_2 != null) {
				this.aClass123_2.method3315();
			}
		} else {
			this.aClass123_2 = null;
		}
		this.anIntArrayArrayArray21 = this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray24 = null;
		this.anIntArrayArrayArray23 = null;
		this.aClass5_Sub11ArrayArrayArray1 = null;
		this.anIntArrayArrayArray22 = null;
		this.aByteArrayArray24 = null;
		this.aClass42_57 = null;
		this.anIntArrayArray59 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray5 = this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)I")
	@Override
	public int method5639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt6363;
		@Pc(9) int local9 = arg1 >> this.anInt6363;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt6360 - 1 || local9 > this.anInt6361 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt6364 - 1;
		@Pc(41) int local41 = arg1 & this.anInt6364 - 1;
		@Pc(67) int local67 = this.anIntArrayArray58[local4][local9] * (this.anInt6364 - local34) + this.anIntArrayArray58[local4 + 1][local9] * local34 >> this.anInt6363;
		@Pc(97) int local97 = this.anIntArrayArray58[local4][local9 + 1] * (this.anInt6364 - local34) + this.anIntArrayArray58[local4 + 1][local9 + 1] * local34 >> this.anInt6363;
		return local67 * (this.anInt6364 - local41) + local97 * local41 >> this.anInt6363;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method5641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		this.anIntArrayArrayArray23[arg0][arg1] = arg3;
		this.anIntArrayArrayArray21[arg0][arg1] = arg2;
		this.anIntArrayArrayArray20[arg0][arg1] = arg4;
		this.anIntArrayArrayArray22[arg0][arg1] = arg5;
		this.anIntArrayArrayArray24[arg0][arg1] = arg6;
		@Pc(45) Class5_Sub11[] local45 = this.aClass5_Sub11ArrayArrayArray1[arg0][arg1] = new Class5_Sub11[arg5.length];
		for (@Pc(47) int local47 = 0; local47 < arg5.length; local47++) {
			@Pc(73) long local73 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[local47] << 16) | (long) arg8[local47];
			@Pc(79) Class5 local79 = this.aClass42_57.method1052(local73);
			if (local79 == null) {
				local45[local47] = new Class5_Sub11(this, arg7[local47], arg8[local47], arg9, arg10);
				this.aClass42_57.method1050(local73, local45[local47]);
			} else {
				local45[local47] = (Class5_Sub11) local79;
			}
		}
		if (arg11) {
			this.aByteArrayArray23[arg0][arg1] = (byte) (this.aByteArrayArray23[arg0][arg1] | 0x1);
		}
		if (arg5.length > this.anInt6368) {
			this.anInt6368 = arg5.length;
		}
		this.anInt6369 += arg5.length;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
	@Override
	public void method5630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
