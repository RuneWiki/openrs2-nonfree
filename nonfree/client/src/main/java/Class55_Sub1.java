import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!e", name = "o", descriptor = "I")
	private int anInt1483;

	@OriginalMember(owner = "client!e", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!e", name = "R", descriptor = "I")
	private int anInt1500;

	@OriginalMember(owner = "client!e", name = "V", descriptor = "Lclient!ms;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "Lclient!m;")
	private Class145 aClass145_4;

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "[Lclient!hj;")
	private Class3_Sub22[] aClass3_Sub22Array1;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "Lclient!m;")
	public Class145 aClass145_5;

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "Lclient!m;")
	public Class145 aClass145_6;

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "Lclient!m;")
	public Class145 aClass145_7;

	@OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
	private int anInt1502;

	@OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
	private int anInt1504;

	@OriginalMember(owner = "client!e", name = "G", descriptor = "Lclient!ps;")
	private final Class193 aClass193_18 = new Class193();

	@OriginalMember(owner = "client!e", name = "S", descriptor = "Lclient!nq;")
	public final Class167_Sub1 aClass167_Sub1_7;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "I")
	private final int anInt1489;

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "[[I")
	private final int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!e", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!e", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "[[[Lclient!hj;")
	private Class3_Sub22[][][] aClass3_Sub22ArrayArrayArray1;

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!e", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!e", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "I")
	private final int anInt1484;

	@OriginalMember(owner = "client!e", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!e", name = "U", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "[[B")
	private final byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "I")
	public final int anInt1490;

	@OriginalMember(owner = "client!e", name = "O", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!e", name = "db", descriptor = "Lclient!lp;")
	private Class140 aClass140_13;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!en;")
	private Class62 aClass62_1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!nq;IIII[[I[[II)V")
	public Class55_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass167_Sub1_7 = arg0;
		this.anInt1489 = super.anInt4615 - 2;
		this.anIntArrayArray10 = arg5;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aFloatArrayArray4 = new float[super.anInt4614 + 1][super.anInt4611 + 1];
		this.aClass3_Sub22ArrayArrayArray1 = new Class3_Sub22[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt4614 + 1][super.anInt4611 + 1];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray2 = new float[super.anInt4614 + 1][super.anInt4611 + 1];
		this.anInt1484 = 0x1 << this.anInt1489;
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aByteArrayArray6 = new byte[arg3][arg4];
		this.anInt1490 = arg2;
		this.aShortArrayArray1 = new short[arg4 * arg3][];
		for (@Pc(117) int local117 = 1; super.anInt4611 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt4614 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local140 * local140 + arg7 * arg7 * 4 + local157 * local157)));
				this.aFloatArrayArray3[local121][local117] = local176 * (float) local140;
				this.aFloatArrayArray4[local121][local117] = local176 * (float) (-arg7 * 2);
				this.aFloatArrayArray2[local121][local117] = local176 * (float) local157;
			}
		}
		this.aClass140_13 = new Class140(128);
		if ((this.anInt1490 & 0x10) != 0) {
			this.aClass62_1 = new Class62(this.aClass167_Sub1_7, this);
		}
	}

	@OriginalMember(owner = "client!e", name = "H", descriptor = "(Lclient!ia;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass62_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass167_Sub1_7.anInt4916 * arg2 >> 8) >> this.aClass167_Sub1_7.anInt4888;
			@Pc(39) int local39 = arg3 - (this.aClass167_Sub1_7.anInt4904 * arg2 >> 8) >> this.aClass167_Sub1_7.anInt4888;
			this.aClass62_1.method1602(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "ia", descriptor = "(Lclient!ia;IIIIZ)V")
	@Override
	public void ia(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass62_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass167_Sub1_7.anInt4916 >> 8) >> this.aClass167_Sub1_7.anInt4888;
			@Pc(39) int local39 = arg3 - (this.aClass167_Sub1_7.anInt4904 * arg2 >> 8) >> this.aClass167_Sub1_7.anInt4888;
			this.aClass62_1.method1607(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ia;IIIIZ)Z")
	@Override
	public boolean method3815(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass62_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass167_Sub1_7.anInt4916 >> 8) >> this.aClass167_Sub1_7.anInt4888;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass167_Sub1_7.anInt4904 >> 8) >> this.aClass167_Sub1_7.anInt4888;
			return this.aClass62_1.method1606(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3813(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt1502 <= 0) {
			return;
		}
		this.aClass167_Sub1_7.method3972();
		this.aClass167_Sub1_7.method4022(false);
		this.aClass167_Sub1_7.method3971(false);
		this.aClass167_Sub1_7.method4017(false);
		this.aClass167_Sub1_7.method4036(false);
		this.aClass167_Sub1_7.method4040(0);
		this.aClass167_Sub1_7.method3968(-2);
		this.aClass167_Sub1_7.method4028(null);
		Static117.aFloatArray8[3] = 0.0F;
		Static117.aFloatArray8[11] = 0.0F;
		Static117.aFloatArray8[15] = 1.0F;
		Static117.aFloatArray8[2] = 0.0F;
		Static117.aFloatArray8[14] = 0.0F;
		Static117.aFloatArray8[9] = 0.0F;
		Static117.aFloatArray8[10] = 0.0F;
		Static117.aFloatArray8[5] = (float) 1024 / ((float) this.aClass167_Sub1_7.anInt4815 * (float) super.anInt4610 * 128.0F);
		Static117.aFloatArray8[8] = 0.0F;
		Static117.aFloatArray8[6] = 0.0F;
		Static117.aFloatArray8[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass167_Sub1_7.anInt4813;
		Static117.aFloatArray8[0] = (float) 1024 / ((float) this.aClass167_Sub1_7.anInt4813 * (float) super.anInt4610 * 128.0F);
		Static117.aFloatArray8[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass167_Sub1_7.anInt4815;
		Static117.aFloatArray8[1] = 0.0F;
		Static117.aFloatArray8[7] = 0.0F;
		Static117.aFloatArray8[4] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static117.aFloatArray8, 0);
		Static117.aFloatArray8[15] = 1.0F;
		Static117.aFloatArray8[12] = 0.0F;
		Static117.aFloatArray8[1] = 0.0F;
		Static117.aFloatArray8[11] = 0.0F;
		Static117.aFloatArray8[7] = 0.0F;
		Static117.aFloatArray8[0] = 1.0F;
		Static117.aFloatArray8[5] = 0.0F;
		Static117.aFloatArray8[4] = 0.0F;
		Static117.aFloatArray8[6] = 1.0F;
		Static117.aFloatArray8[2] = 0.0F;
		Static117.aFloatArray8[8] = 0.0F;
		Static117.aFloatArray8[10] = 0.0F;
		Static117.aFloatArray8[9] = 1.0F;
		Static117.aFloatArray8[14] = 0.0F;
		Static117.aFloatArray8[3] = 0.0F;
		Static117.aFloatArray8[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static117.aFloatArray8, 0);
		if ((this.anInt1490 & 0x7) == 0) {
			this.aClass167_Sub1_7.method3971(false);
		} else {
			this.aClass167_Sub1_7.method3971(true);
			this.aClass167_Sub1_7.method3994();
		}
		this.aClass167_Sub1_7.method4045(this.aClass145_7, this.aClass145_5, this.aClass145_6, this.aClass145_4);
		if (this.aClass167_Sub1_7.aClass3_Sub25_Sub2_3.aByteArray88.length < this.anInt1483 * 2) {
			this.aClass167_Sub1_7.aClass3_Sub25_Sub2_3 = new Class3_Sub25_Sub2(this.anInt1483 * 2);
		} else {
			this.aClass167_Sub1_7.aClass3_Sub25_Sub2_3.anInt4974 = 0;
		}
		@Pc(311) int local311 = 0;
		@Pc(315) Class3_Sub25_Sub2 local315 = this.aClass167_Sub1_7.aClass3_Sub25_Sub2_3;
		@Pc(321) int local321;
		@Pc(330) int local330;
		@Pc(332) int local332;
		@Pc(351) short[] local351;
		@Pc(355) int local355;
		if (this.aClass167_Sub1_7.aBoolean349) {
			for (local321 = arg1; local321 < arg3; local321++) {
				local330 = arg0 + local321 * super.anInt4614;
				for (local332 = arg0; local332 < arg2; local332++) {
					if (arg4[local332 - arg0][local321 - arg1]) {
						local351 = this.aShortArrayArray1[local330];
						if (local351 != null) {
							for (local355 = 0; local355 < local351.length; local355++) {
								local315.method4123(local351[local355] & 0xFFFF);
								local311++;
							}
						}
					}
					local330++;
				}
			}
		} else {
			for (local321 = arg1; local321 < arg3; local321++) {
				local330 = arg0 + local321 * super.anInt4614;
				for (local332 = arg0; local332 < arg2; local332++) {
					if (arg4[local332 - arg0][local321 - arg1]) {
						local351 = this.aShortArrayArray1[local330];
						if (local351 != null) {
							for (local355 = 0; local355 < local351.length; local355++) {
								local311++;
								local315.method4120(local351[local355] & 0xFFFF);
							}
						}
					}
					local330++;
				}
			}
		}
		if (local311 > 0) {
			@Pc(479) Class89_Sub2 local479 = new Class89_Sub2(this.aClass167_Sub1_7, 5123, local315.aByteArray88, local315.anInt4974);
			this.aClass167_Sub1_7.method4018(0, local311, local479);
		}
	}

	@OriginalMember(owner = "client!e", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray7[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray7[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!be;[I)V")
	@Override
	public void method3818(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass193_18.method4527(new Class3_Sub19(this.aClass167_Sub1_7, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!e", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt4614][super.anInt4611][];
		}
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt4614][super.anInt4611][];
		}
		this.anIntArrayArrayArray5[arg0][arg1] = arg2;
		this.anIntArrayArrayArray3[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray6[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub22[] local88 = this.aClass3_Sub22ArrayArrayArray1[arg0][arg1] = new Class3_Sub22[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[local90] << 14);
			@Pc(125) Class3 local125;
			for (local125 = this.aClass140_13.method3490(local119); local125 != null; local125 = this.aClass140_13.method3491()) {
				@Pc(130) Class3_Sub22 local130 = (Class3_Sub22) local125;
				if (local130.anInt2770 == arg8[local90] && local130.aFloat49 == (float) arg9[local90] && arg10 == local130.anInt2769 && arg11 == local130.anInt2766 && arg12 == local130.anInt2765) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub22(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass140_13.method3494(local119, local88[local90]);
			} else {
				local88[local90] = (Class3_Sub22) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray6[arg0][arg1] = (byte) (this.aByteArrayArray6[arg0][arg1] | 0x1);
		}
		if (this.anInt1504 < arg6.length) {
			this.anInt1504 = arg6.length;
		}
		this.anInt1502 += arg6.length;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!gf;III)V")
	private void method1475(@OriginalArg(0) Class3_Sub3_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray5[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray3[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass167_Sub1_7.anIntArray318.length) {
			this.aClass167_Sub1_7.anIntArray318 = new int[local22];
			this.aClass167_Sub1_7.anIntArray320 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass167_Sub1_7.anIntArray318;
		@Pc(46) int[] local46 = this.aClass167_Sub1_7.anIntArray320;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = (local12[local48] & 0xFF) >> this.aClass167_Sub1_7.anInt4888;
			local46[local48] = (local19[local48] & 0xFF) >> this.aClass167_Sub1_7.anInt4888;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(90) int local90 = local42[local84];
			@Pc(95) int local95 = local46[local84++];
			@Pc(99) int local99 = local42[local84];
			@Pc(104) int local104 = local46[local84++];
			@Pc(108) int local108 = local42[local84];
			@Pc(113) int local113 = local46[local84++];
			if (-((local108 - local99) * (local104 + -local95)) + (local90 - local99) * (-local113 + local104) > 0) {
				arg0.method2021(local99, local95, local113, local90, local104, local108);
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "q", descriptor = "(IILclient!ia;)Lclient!ia;")
	@Override
	public Class3_Sub3_Sub9 q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub9 arg2) {
		if ((this.aByteArrayArray6[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt4610 >> this.aClass167_Sub1_7.anInt4888;
		@Pc(24) Class3_Sub3_Sub9_Sub1 local24 = (Class3_Sub3_Sub9_Sub1) arg2;
		@Pc(34) Class3_Sub3_Sub9_Sub1 local34;
		if (local24 != null && local24.method2018(local21, local21)) {
			local34 = local24;
			local24.method2020();
		} else {
			local34 = new Class3_Sub3_Sub9_Sub1(this.aClass167_Sub1_7, local21, local21);
		}
		local34.method2017(0, 0, local21, local21);
		this.method1475(local34, arg0, arg1);
		return local34;
	}

	@OriginalMember(owner = "client!e", name = "R", descriptor = "(II)I")
	@Override
	public int R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt4615;
		@Pc(13) int local13 = arg1 >> super.anInt4615;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt4614 - 1 || super.anInt4611 - 1 < local13) {
			return 0;
		}
		@Pc(49) int local49 = arg0 & super.anInt4610 - 1;
		@Pc(56) int local56 = super.anInt4610 - 1 & arg1;
		@Pc(83) int local83 = local49 * this.anIntArrayArray10[local8 + 1][local13] + this.anIntArrayArray10[local8][local13] * (super.anInt4610 - local49) >> super.anInt4615;
		@Pc(114) int local114 = this.anIntArrayArray10[local8 + 1][local13 + 1] * local49 + this.anIntArrayArray10[local8][local13 + 1] * (super.anInt4610 - local49) >> super.anInt4615;
		return local83 * (super.anInt4610 - local56) + local114 * local56 >> super.anInt4615;
	}

	@OriginalMember(owner = "client!e", name = "oa", descriptor = "(II)I")
	@Override
	public int oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray10[arg0][arg1];
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	@Override
	public void method3814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!e", name = "U", descriptor = "()V")
	@Override
	public void U() {
		if (this.anInt1502 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt4614 + 1][super.anInt4611 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; local23 < super.anInt4614; local23++) {
				for (local27 = 1; local27 < super.anInt4611; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray7[local23][local27 + 1] >> 3) + (this.aByteArrayArray7[local23 - 1][local27] >> 2) + (this.aByteArrayArray7[local23 + 1][local27] >> 3) + (this.aByteArrayArray7[local23][local27 + -1] >> 2) + (this.aByteArrayArray7[local23][local27] >> 1));
				}
			}
			this.aClass3_Sub22Array1 = new Class3_Sub22[this.aClass140_13.method3492()];
			this.aClass140_13.method3484(this.aClass3_Sub22Array1);
			for (local27 = 0; local27 < this.aClass3_Sub22Array1.length; local27++) {
				this.aClass3_Sub22Array1[local27].method2363(this.anInt1502);
			}
			@Pc(143) int local143 = 24;
			if (this.anIntArrayArrayArray7 != null) {
				local143 += 4;
			}
			if ((this.anInt1490 & 0x7) != 0) {
				local143 += 12;
			}
			@Pc(165) NativeBuffer local165 = this.aClass167_Sub1_7.aNativeHeap2.a(this.anInt1502 * local143);
			@Pc(170) NativeStream local170 = new NativeStream(local165);
			@Pc(174) Class3_Sub22[] local174 = new Class3_Sub22[this.anInt1502];
			@Pc(181) int local181 = Static146.method2292(this.anInt1502 / 4);
			if (local181 < 1) {
				local181 = 1;
			}
			@Pc(191) Class140 local191 = new Class140(local181);
			@Pc(195) Class3_Sub22[] local195 = new Class3_Sub22[this.anInt1504];
			@Pc(201) int local201;
			for (@Pc(197) int local197 = 0; local197 < super.anInt4614; local197++) {
				for (local201 = 0; super.anInt4611 > local201; local201++) {
					if (this.anIntArrayArrayArray8[local197][local201] != null) {
						@Pc(217) Class3_Sub22[] local217 = this.aClass3_Sub22ArrayArrayArray1[local197][local201];
						@Pc(224) int[] local224 = this.anIntArrayArrayArray5[local197][local201];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray3[local197][local201];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray6[local197][local201];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray8[local197][local201];
						@Pc(257) int[] local257 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local197][local201];
						if (local238 == null) {
							local238 = local245;
						}
						@Pc(273) int[] local273 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local197][local201];
						@Pc(280) float local280 = this.aFloatArrayArray3[local197][local201];
						@Pc(287) float local287 = this.aFloatArrayArray4[local197][local201];
						@Pc(294) float local294 = this.aFloatArrayArray2[local197][local201];
						@Pc(303) float local303 = this.aFloatArrayArray3[local197][local201 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray4[local197][local201 + 1];
						@Pc(321) float local321 = this.aFloatArrayArray2[local197][local201 + 1];
						@Pc(332) float local332 = this.aFloatArrayArray3[local197 + 1][local201 + 1];
						@Pc(343) float local343 = this.aFloatArrayArray4[local197 + 1][local201 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray2[local197 + 1][local201 + 1];
						@Pc(363) float local363 = this.aFloatArrayArray3[local197 + 1][local201];
						@Pc(372) float local372 = this.aFloatArrayArray4[local197 + 1][local201];
						@Pc(381) float local381 = this.aFloatArrayArray2[local197 + 1][local201];
						@Pc(389) int local389 = local21[local197][local201] & 0xFF;
						@Pc(399) int local399 = local21[local197][local201 + 1] & 0xFF;
						@Pc(411) int local411 = local21[local197 + 1][local201 + 1] & 0xFF;
						@Pc(421) int local421 = local21[local197 + 1][local201] & 0xFF;
						@Pc(423) int local423 = 0;
						@Pc(433) int local433;
						label335: for (@Pc(425) int local425 = 0; local425 < local245.length; local425++) {
							@Pc(431) Class3_Sub22 local431 = local217[local425];
							for (local433 = 0; local433 < local423; local433++) {
								if (local195[local433] == local431) {
									continue label335;
								}
							}
							local195[local423++] = local431;
						}
						@Pc(474) short[] local474 = this.aShortArrayArray1[local197 + super.anInt4614 * local201] = new short[local245.length];
						for (local433 = 0; local433 < local245.length; local433++) {
							@Pc(488) int local488 = (local197 << super.anInt4615) + local224[local433];
							@Pc(498) int local498 = (local201 << super.anInt4615) + local231[local433];
							@Pc(503) int local503 = local488 >> this.anInt1489;
							@Pc(508) int local508 = local498 >> this.anInt1489;
							@Pc(512) int local512 = local245[local433];
							@Pc(516) int local516 = local238[local433];
							@Pc(524) int local524 = local257 == null ? 0 : local257[local433];
							@Pc(542) long local542 = (long) local512 << 32 | (long) local516 << 48 | (long) (local503 << 16) | (long) local508;
							@Pc(546) int local546 = local224[local433];
							@Pc(550) int local550 = local231[local433];
							@Pc(552) byte local552 = 74;
							@Pc(554) int local554 = 0;
							@Pc(556) float local556 = 1.0F;
							@Pc(583) float local583;
							@Pc(591) float local591;
							@Pc(585) float local585;
							@Pc(645) float local645;
							@Pc(589) int local589;
							if (local546 == 0 && local550 == 0) {
								local585 = local294;
								local589 = local552 - local389;
								local583 = local280;
								local591 = local287;
							} else if (local546 == 0 && local550 == super.anInt4610) {
								local583 = local303;
								local589 = local552 - local399;
								local585 = local321;
								local591 = local312;
							} else if (local546 == super.anInt4610 && local550 == super.anInt4610) {
								local583 = local332;
								local585 = local354;
								local589 = local552 - local411;
								local591 = local343;
							} else if (local546 == super.anInt4610 && local550 == 0) {
								local585 = local381;
								local591 = local372;
								local589 = local552 - local421;
								local583 = local363;
							} else {
								@Pc(622) float local622 = (float) local546 / (float) super.anInt4610;
								@Pc(629) float local629 = (float) local550 / (float) super.anInt4610;
								@Pc(637) float local637 = local280 + (local363 - local280) * local622;
								local645 = local622 * (local372 - local287) + local287;
								@Pc(654) float local654 = local294 + (local381 - local294) * local622;
								@Pc(662) float local662 = local622 * (local332 - local303) + local303;
								@Pc(671) float local671 = local312 + (local343 - local312) * local622;
								local583 = (local662 - local637) * local629 + local637;
								local591 = local645 + (local671 - local645) * local629;
								@Pc(696) float local696 = local622 * (local354 - local321) + local321;
								local585 = (local696 - local654) * local629 + local654;
								@Pc(717) int local717 = local389 + ((local421 - local389) * local546 >> super.anInt4615);
								@Pc(729) int local729 = ((local411 - local399) * local546 >> super.anInt4615) + local399;
								local589 = local552 - local717 - ((local729 - local717) * local550 >> super.anInt4615);
							}
							if (local512 != -1) {
								@Pc(779) int local779 = local589 * (local512 & 0x7F) >> 7;
								if (local779 < 2) {
									local779 = 2;
								} else if (local779 > 126) {
									local779 = 126;
								}
								local554 = Static329.anIntArray346[local512 & 0xFF80 | local779];
								if ((this.anInt1490 & 0x7) == 0) {
									local556 = local585 * this.aClass167_Sub1_7.aFloatArray27[2] + this.aClass167_Sub1_7.aFloatArray27[1] * local591 + this.aClass167_Sub1_7.aFloatArray27[0] * local583;
									local556 = this.aClass167_Sub1_7.aFloat66 + (local556 > 0.0F ? this.aClass167_Sub1_7.aFloat74 : this.aClass167_Sub1_7.aFloat65) * local556;
								}
							}
							@Pc(855) Class3 local855 = null;
							if ((this.anInt1484 - 1 & local488) == 0 && (local498 & this.anInt1484 - 1) == 0) {
								local855 = local191.method3490(local542);
							}
							@Pc(891) int local891;
							@Pc(917) int local917;
							if (local855 == null) {
								if (local512 == local516) {
									local917 = local554;
								} else {
									@Pc(927) int local927 = (local516 & 0x7F) * local589 >> 7;
									if (local927 < 2) {
										local927 = 2;
									} else if (local927 > 126) {
										local927 = 126;
									}
									local917 = Static329.anIntArray346[local516 & 0xFF80 | local927];
									if ((this.anInt1490 & 0x7) == 0) {
										@Pc(975) float local975 = this.aClass167_Sub1_7.aFloatArray27[1] * local591 + local583 * this.aClass167_Sub1_7.aFloatArray27[0] + this.aClass167_Sub1_7.aFloatArray27[2] * local585;
										local645 = this.aClass167_Sub1_7.aFloat66 + (local556 > 0.0F ? this.aClass167_Sub1_7.aFloat74 : this.aClass167_Sub1_7.aFloat65) * local556;
										@Pc(1000) int local1000 = local917 >> 16 & 0xFF;
										@Pc(1006) int local1006 = local917 >> 8 & 0xFF;
										@Pc(1010) int local1010 = local917 & 0xFF;
										local1000 = (int) ((float) local1000 * local645);
										if (local1000 < 0) {
											local1000 = 0;
										} else if (local1000 > 255) {
											local1000 = 255;
										}
										local1006 = (int) ((float) local1006 * local645);
										if (local1006 < 0) {
											local1006 = 0;
										} else if (local1006 > 255) {
											local1006 = 255;
										}
										local1010 = (int) ((float) local1010 * local645);
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										local917 = local1000 << 16 | local1006 << 8 | local1010;
									}
								}
								if (this.aClass167_Sub1_7.aBoolean349) {
									local170.a((float) local488);
									local170.a((float) (this.R(local488, local498) + local524));
									local170.a((float) local498);
									local170.a((byte) (local917 >> 16));
									local170.a((byte) (local917 >> 8));
									local170.a((byte) local917);
									local170.a(-1);
									local170.a((float) local488);
									local170.a((float) local498);
									if (this.anIntArrayArrayArray7 != null) {
										local170.a((float) (local273 == null ? 0 : local273[local433] - 1));
									}
									if ((this.anInt1490 & 0x7) != 0) {
										local170.a(local583);
										local170.a(local591);
										local170.a(local585);
									}
								} else {
									local170.b((float) local488);
									local170.b((float) (local524 + this.R(local488, local498)));
									local170.b((float) local498);
									local170.a((byte) (local917 >> 16));
									local170.a((byte) (local917 >> 8));
									local170.a((byte) local917);
									local170.a(-1);
									local170.b((float) local488);
									local170.b((float) local498);
									if (this.anIntArrayArrayArray7 != null) {
										local170.b((float) (local273 == null ? 0 : local273[local433] - 1));
									}
									if ((this.anInt1490 & 0x7) != 0) {
										local170.b(local583);
										local170.b(local591);
										local170.b(local585);
									}
								}
								local891 = this.anInt1500++;
								local474[local433] = (short) local891;
								if (local512 != -1) {
									local174[local891] = local217[local433];
								}
								local191.method3494(local542, new Class3_Sub20(local474[local433]));
							} else {
								local474[local433] = ((Class3_Sub20) local855).aShort27;
								local891 = local474[local433] & 0xFFFF;
								if (local512 != -1 && local174[local891].aLong248 > local217[local433].aLong248) {
									local174[local891] = local217[local433];
								}
							}
							for (local917 = 0; local917 < local423; local917++) {
								local195[local917].method2360(local891, local589, local556, local554);
							}
							this.anInt1483++;
						}
					}
				}
			}
			for (local201 = 0; local201 < this.anInt1500; local201++) {
				@Pc(1324) Class3_Sub22 local1324 = local174[local201];
				if (local1324 != null) {
					local1324.method2358(local201);
				}
			}
			@Pc(1361) int local1361;
			for (@Pc(1341) int local1341 = 0; local1341 < super.anInt4614; local1341++) {
				for (@Pc(1345) int local1345 = 0; local1345 < super.anInt4611; local1345++) {
					@Pc(1357) short[] local1357 = this.aShortArrayArray1[local1341 + super.anInt4614 * local1345];
					if (local1357 != null) {
						local1361 = 0;
						@Pc(1363) int local1363 = 0;
						while (local1357.length > local1363) {
							@Pc(1372) int local1372 = local1357[local1363++] & 0xFFFF;
							@Pc(1379) int local1379 = local1357[local1363++] & 0xFFFF;
							@Pc(1386) int local1386 = local1357[local1363++] & 0xFFFF;
							@Pc(1390) Class3_Sub22 local1390 = local174[local1372];
							@Pc(1394) Class3_Sub22 local1394 = local174[local1379];
							@Pc(1398) Class3_Sub22 local1398 = local174[local1386];
							@Pc(1400) Class3_Sub22 local1400 = null;
							if (local1390 != null) {
								local1400 = local1390;
								local1390.method2359(local1345, local1341, local1361);
							}
							if (local1394 != null) {
								local1394.method2359(local1345, local1341, local1361);
								if (local1400 == null || local1394.aLong248 < local1400.aLong248) {
									local1400 = local1394;
								}
							}
							if (local1398 != null) {
								local1398.method2359(local1345, local1341, local1361);
								if (local1400 == null || local1400.aLong248 > local1398.aLong248) {
									local1400 = local1398;
								}
							}
							if (local1400 != null) {
								if (local1390 != null) {
									local1400.method2358(local1372);
								}
								if (local1394 != null) {
									local1400.method2358(local1379);
								}
								if (local1398 != null) {
									local1400.method2358(local1386);
								}
								local1400.method2359(local1345, local1341, local1361);
							}
							local1361++;
						}
					}
				}
			}
			local170.c();
			this.anInterface9_2 = this.aClass167_Sub1_7.method3989(local143, local165, local170.a());
			this.aClass145_7 = new Class145(this.anInterface9_2, 5126, 3, 0);
			this.aClass145_4 = new Class145(this.anInterface9_2, 5121, 4, 12);
			@Pc(1537) byte local1537;
			if (this.anIntArrayArrayArray7 == null) {
				local1537 = 24;
				this.aClass145_6 = new Class145(this.anInterface9_2, 5126, 2, 16);
			} else {
				local1537 = 28;
				this.aClass145_6 = new Class145(this.anInterface9_2, 5126, 3, 16);
			}
			if ((this.anInt1490 & 0x7) != 0) {
				this.aClass145_5 = new Class145(this.anInterface9_2, 5126, 3, local1537);
			}
			@Pc(1581) long[] local1581 = new long[this.aClass3_Sub22Array1.length];
			for (local1361 = 0; local1361 < this.aClass3_Sub22Array1.length; local1361++) {
				@Pc(1590) Class3_Sub22 local1590 = this.aClass3_Sub22Array1[local1361];
				local1581[local1361] = local1590.aLong248;
				local1590.method2356(this.anInt1500);
			}
			Static39.method637(this.aClass3_Sub22Array1, local1581);
			if (this.aClass62_1 != null) {
				this.aClass62_1.method1604();
			}
		} else {
			this.aClass62_1 = null;
		}
		this.aFloatArrayArray3 = this.aFloatArrayArray4 = this.aFloatArrayArray2 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray5 = this.anIntArrayArrayArray3 = null;
		this.aClass3_Sub22ArrayArrayArray1 = null;
		this.aByteArrayArray7 = null;
		this.aClass140_13 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZIII[[Z)V")
	private void method1477(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean[][] arg4) {
		if (this.aClass3_Sub22Array1 == null) {
			return;
		}
		@Pc(18) float local18 = this.aClass167_Sub1_7.aFloat70;
		@Pc(22) float local22 = this.aClass167_Sub1_7.aFloat76;
		@Pc(28) int local28 = arg3 + arg3 + 1;
		@Pc(32) int local32 = local28 * local28;
		if (this.aClass167_Sub1_7.anIntArray319.length < local32) {
			this.aClass167_Sub1_7.anIntArray319 = new int[local32];
		}
		if (this.aClass167_Sub1_7.aClass3_Sub25_Sub2_3.aByteArray88.length < this.anInt1483 * 2) {
			this.aClass167_Sub1_7.aClass3_Sub25_Sub2_3 = new Class3_Sub25_Sub2(this.anInt1483 * 2);
		}
		@Pc(75) int local75 = arg2 - arg3;
		@Pc(77) int local77 = local75;
		if (local75 < 0) {
			local75 = 0;
		}
		@Pc(88) int local88 = arg0 - arg3;
		@Pc(90) int local90 = local88;
		if (local88 < 0) {
			local88 = 0;
		}
		@Pc(101) int local101 = arg3 + arg2;
		if (local101 > super.anInt4614 - 1) {
			local101 = super.anInt4614 - 1;
		}
		@Pc(120) int local120 = arg3 + arg0;
		if (super.anInt4611 - 1 < local120) {
			local120 = super.anInt4611 - 1;
		}
		@Pc(133) int local133 = 0;
		@Pc(137) int[] local137 = this.aClass167_Sub1_7.anIntArray319;
		@Pc(150) int local150;
		for (@Pc(139) int local139 = local75; local139 <= local101; local139++) {
			@Pc(148) boolean[] local148 = arg4[local139 - local77];
			for (local150 = local88; local150 <= local120; local150++) {
				if (local148[local150 - local90]) {
					local137[local133++] = local139 + super.anInt4614 * local150;
				}
			}
		}
		this.aClass167_Sub1_7.method4031();
		this.aClass167_Sub1_7.method3971((this.anInt1490 & 0x7) != 0);
		for (@Pc(215) int local215 = 0; local215 < this.aClass3_Sub22Array1.length; local215++) {
			this.aClass3_Sub22Array1[local215].method2361(local133, local137);
		}
		if (!this.aClass193_18.method4529()) {
			local150 = this.aClass167_Sub1_7.anInt4915;
			@Pc(244) int local244 = this.aClass167_Sub1_7.anInt4922;
			this.aClass167_Sub1_7.ha(0, local244, this.aClass167_Sub1_7.anInt4920);
			this.aClass167_Sub1_7.PA(local22, local18 - 4.0F);
			this.aClass167_Sub1_7.method3971(false);
			this.aClass167_Sub1_7.method4036(false);
			this.aClass167_Sub1_7.method4040(128);
			this.aClass167_Sub1_7.method3968(-2);
			this.aClass167_Sub1_7.method4028(this.aClass167_Sub1_7.aClass137_Sub1_3);
			this.aClass167_Sub1_7.method3983(8448, 7681);
			this.aClass167_Sub1_7.method4012(34166, 770, 0);
			this.aClass167_Sub1_7.method3997(0, 34167);
			for (@Pc(311) Class3 local311 = this.aClass193_18.method4519(); local311 != null; local311 = this.aClass193_18.method4525()) {
				@Pc(316) Class3_Sub19 local316 = (Class3_Sub19) local311;
				local316.method1986(arg4, arg2, arg3, arg0);
			}
			this.aClass167_Sub1_7.method4012(5890, 768, 0);
			this.aClass167_Sub1_7.method3997(0, 5890);
			this.aClass167_Sub1_7.method4028(null);
			this.aClass167_Sub1_7.ha(local150, local244, this.aClass167_Sub1_7.anInt4920);
		}
		if (this.aClass62_1 != null) {
			this.aClass167_Sub1_7.PA(local22, local18 - 8.0F);
			this.aClass167_Sub1_7.method4031();
			this.aClass167_Sub1_7.method4045(this.aClass145_7, null, this.aClass145_6, null);
			this.aClass62_1.method1603(arg3, arg0, arg1, arg4, arg2);
		}
		this.aClass167_Sub1_7.PA(local22, local18);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method1477(arg1, arg4, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
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
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
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
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.ta(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}
}
