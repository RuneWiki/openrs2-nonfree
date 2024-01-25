import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class114_Sub1 extends Class114 {

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	private int anInt3434;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	private int anInt3435;

	@OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
	private int anInt3437;

	@OriginalMember(owner = "client!kg", name = "G", descriptor = "Lclient!eb;")
	private Interface3 anInterface3_3;

	@OriginalMember(owner = "client!kg", name = "H", descriptor = "Lclient!qd;")
	public Class168 aClass168_7;

	@OriginalMember(owner = "client!kg", name = "I", descriptor = "Lclient!qd;")
	public Class168 aClass168_8;

	@OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
	private int anInt3438;

	@OriginalMember(owner = "client!kg", name = "L", descriptor = "Lclient!qd;")
	private Class168 aClass168_9;

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "Lclient!qd;")
	public Class168 aClass168_10;

	@OriginalMember(owner = "client!kg", name = "S", descriptor = "[Lclient!vn;")
	private Class14_Sub40[] aClass14_Sub40Array1;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Lclient!bd;")
	private final Class18 aClass18_15 = new Class18();

	@OriginalMember(owner = "client!kg", name = "z", descriptor = "Lclient!sq;")
	public final Class46_Sub2 aClass46_Sub2_20;

	@OriginalMember(owner = "client!kg", name = "B", descriptor = "[[I")
	private final int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!kg", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
	public final int anInt3431;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	public int anInt3433;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	public final int anInt3432;

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "[[[Lclient!vn;")
	private Class14_Sub40[][][] aClass14_Sub40ArrayArrayArray1;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!kg", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "[[S")
	public final short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "[[B")
	private final byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!kg", name = "N", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!kg", name = "R", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "Lclient!bn;")
	private Class25 aClass25_12;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!lb;")
	private Class125 aClass125_1;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!sq;IIII[[I[[II)V")
	public Class114_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass46_Sub2_20 = arg0;
		this.anIntArrayArray53 = arg5;
		this.anIntArrayArray54 = arg6;
		this.anInt3431 = arg2;
		while (arg7 > 1) {
			this.anInt3433++;
			arg7 >>= 0x1;
		}
		this.anInt3432 = 0x1 << this.anInt3433;
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aClass14_Sub40ArrayArrayArray1 = new Class14_Sub40[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aShortArrayArray4 = new short[arg3 * arg4][];
		this.aByteArrayArray7 = new byte[arg3][arg4];
		this.aByteArrayArray8 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray5 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray6 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray7 = new float[arg3 + 1][arg4 + 1];
		for (@Pc(119) int local119 = 1; local119 < arg4; local119++) {
			for (@Pc(124) int local124 = 1; local124 < arg3; local124++) {
				@Pc(145) int local145 = this.anIntArrayArray53[local124 + 1][local119] - this.anIntArrayArray53[local124 - 1][local119];
				@Pc(163) int local163 = this.anIntArrayArray53[local124][local119 + 1] - this.anIntArrayArray53[local124][local119 - 1];
				@Pc(178) float local178 = (float) (1.0D / Math.sqrt((double) (local145 * local145 + local163 * local163 + 65536)));
				this.aFloatArrayArray5[local124][local119] = (float) local145 * local178;
				this.aFloatArrayArray6[local124][local119] = -256.0F * local178;
				this.aFloatArrayArray7[local124][local119] = (float) local163 * local178;
			}
		}
		this.aClass25_12 = new Class25(128);
		if ((this.anInt3431 & 0x10) != 0) {
			this.aClass125_1 = new Class125(this.aClass46_Sub2_20, this);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method3612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
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
		this.method3603(arg0, arg1, local7, local41, local12, local17, local22, local27, local32, arg12, arg13, false);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)I")
	@Override
	public int method3607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt3433;
		@Pc(9) int local9 = arg1 >> this.anInt3433;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt3871 - 1 || local9 > this.anInt3873 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt3432 - 1;
		@Pc(41) int local41 = arg1 & this.anInt3432 - 1;
		@Pc(67) int local67 = this.anIntArrayArray53[local4][local9] * (this.anInt3432 - local34) + this.anIntArrayArray53[local4 + 1][local9] * local34 >> this.anInt3433;
		@Pc(97) int local97 = this.anIntArrayArray53[local4][local9 + 1] * (this.anInt3432 - local34) + this.anIntArrayArray53[local4 + 1][local9 + 1] * local34 >> this.anInt3433;
		return local67 * (this.anInt3432 - local41) + local97 * local41 >> this.anInt3433;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(II)I")
	@Override
	public int method3610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray53[arg0][arg1];
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3597(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3437 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass46_Sub2_20.anOpengl1;
		this.aClass46_Sub2_20.method5262();
		this.aClass46_Sub2_20.method5266(false);
		this.aClass46_Sub2_20.method5241(false);
		this.aClass46_Sub2_20.method5235(false);
		this.aClass46_Sub2_20.method5208(false);
		this.aClass46_Sub2_20.method5256(0);
		this.aClass46_Sub2_20.method5226();
		this.aClass46_Sub2_20.method5251(null);
		Static163.aFloatArray9[0] = (float) 1024 / ((float) this.anInt3432 * 128.0F * (float) this.aClass46_Sub2_20.anInt5735);
		Static163.aFloatArray9[1] = 0.0F;
		Static163.aFloatArray9[2] = 0.0F;
		Static163.aFloatArray9[3] = 0.0F;
		Static163.aFloatArray9[4] = 0.0F;
		Static163.aFloatArray9[5] = (float) 1024 / ((float) this.anInt3432 * 128.0F * (float) this.aClass46_Sub2_20.anInt5740);
		Static163.aFloatArray9[6] = 0.0F;
		Static163.aFloatArray9[7] = 0.0F;
		Static163.aFloatArray9[8] = 0.0F;
		Static163.aFloatArray9[9] = 0.0F;
		Static163.aFloatArray9[10] = 0.0F;
		Static163.aFloatArray9[11] = 0.0F;
		Static163.aFloatArray9[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass46_Sub2_20.anInt5735;
		Static163.aFloatArray9[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass46_Sub2_20.anInt5740;
		Static163.aFloatArray9[14] = 0.0F;
		Static163.aFloatArray9[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static163.aFloatArray9, 0);
		Static163.aFloatArray9[0] = 1.0F;
		Static163.aFloatArray9[1] = 0.0F;
		Static163.aFloatArray9[2] = 0.0F;
		Static163.aFloatArray9[3] = 0.0F;
		Static163.aFloatArray9[4] = 0.0F;
		Static163.aFloatArray9[5] = 0.0F;
		Static163.aFloatArray9[6] = 1.0F;
		Static163.aFloatArray9[7] = 0.0F;
		Static163.aFloatArray9[8] = 0.0F;
		Static163.aFloatArray9[9] = 1.0F;
		Static163.aFloatArray9[10] = 0.0F;
		Static163.aFloatArray9[11] = 0.0F;
		Static163.aFloatArray9[12] = 0.0F;
		Static163.aFloatArray9[13] = 0.0F;
		Static163.aFloatArray9[14] = 0.0F;
		Static163.aFloatArray9[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static163.aFloatArray9, 0);
		if ((this.anInt3431 & 0x7) == 0) {
			this.aClass46_Sub2_20.method5241(false);
		} else {
			this.aClass46_Sub2_20.method5241(true);
			this.aClass46_Sub2_20.method5228();
		}
		this.aClass46_Sub2_20.method5217(this.aClass168_7, this.aClass168_10, this.aClass168_9, this.aClass168_8);
		if (Static163.aClass14_Sub4_6.aByteArray74.length < this.anInt3434 * 2) {
			Static163.aClass14_Sub4_6 = new Class14_Sub4(this.anInt3434 * 2);
		} else {
			Static163.aClass14_Sub4_6.anInt2637 = 0;
		}
		@Pc(288) int local288 = 0;
		@Pc(294) int local294;
		@Pc(304) int local304;
		@Pc(306) int local306;
		@Pc(324) short[] local324;
		@Pc(328) int local328;
		if (this.aClass46_Sub2_20.aBoolean397) {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt3871 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray4[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static163.aClass14_Sub4_6.method2509(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		} else {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt3871 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray4[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static163.aClass14_Sub4_6.method2545(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		}
		if (local288 > 0) {
			@Pc(418) Class182_Sub1 local418 = new Class182_Sub1(this.aClass46_Sub2_20, 5123, Static163.aClass14_Sub4_6.aByteArray74, Static163.aClass14_Sub4_6.anInt2637);
			this.aClass46_Sub2_20.method5231(local418, 0, local288);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ej;[I)V")
	@Override
	public void method3604(@OriginalArg(0) Class14_Sub13 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass18_15.method451(new Class14_Sub10(this.aClass46_Sub2_20, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!as;)Lclient!as;")
	@Override
	public Class14_Sub2_Sub2 method3613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub2_Sub2 arg2) {
		if ((this.aByteArrayArray7[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt3432 >> this.aClass46_Sub2_20.anInt5736;
		@Pc(20) Class14_Sub2_Sub2_Sub1 local20 = (Class14_Sub2_Sub2_Sub1) arg2;
		@Pc(30) Class14_Sub2_Sub2_Sub1 local30;
		if (local20 != null && local20.method5428(local17, local17)) {
			local30 = local20;
			local20.method5431();
		} else {
			local30 = new Class14_Sub2_Sub2_Sub1(this.aClass46_Sub2_20, local17, local17);
		}
		local30.method5430(local17, local17, 0, 0);
		this.method3264(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	@Override
	public void method3598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray8[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ub;II)V")
	private void method3264(@OriginalArg(0) Class14_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static163.anIntArray301.length < local16) {
			Static163.anIntArray301 = new int[local16];
			Static163.anIntArray303 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static163.anIntArray301[local28] = (local6[local28] & 0xFF) >> this.aClass46_Sub2_20.anInt5736;
			Static163.anIntArray303[local28] = (local13[local28] & 0xFF) >> this.aClass46_Sub2_20.anInt5736;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static163.anIntArray301[local28];
			@Pc(71) int local71 = Static163.anIntArray303[local28++];
			@Pc(75) int local75 = Static163.anIntArray301[local28];
			@Pc(80) int local80 = Static163.anIntArray303[local28++];
			@Pc(84) int local84 = Static163.anIntArray301[local28];
			@Pc(89) int local89 = Static163.anIntArray303[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method5432(local80, local66, local75, local84, local89, local71);
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	@Override
	public void method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method3603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		this.anIntArrayArrayArray8[arg0][arg1] = arg3;
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray9[arg0][arg1] = arg4;
		this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		@Pc(45) Class14_Sub40[] local45 = this.aClass14_Sub40ArrayArrayArray1[arg0][arg1] = new Class14_Sub40[arg5.length];
		for (@Pc(47) int local47 = 0; local47 < arg5.length; local47++) {
			@Pc(73) long local73 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[local47] << 16) | (long) arg8[local47];
			@Pc(79) Class14 local79 = this.aClass25_12.method691(local73);
			if (local79 == null) {
				local45[local47] = new Class14_Sub40(this, arg7[local47], arg8[local47], arg9, arg10);
				this.aClass25_12.method687(local73, local45[local47]);
			} else {
				local45[local47] = (Class14_Sub40) local79;
			}
		}
		if (arg11) {
			this.aByteArrayArray7[arg0][arg1] = (byte) (this.aByteArrayArray7[arg0][arg1] | 0x1);
		}
		if (arg5.length > this.anInt3438) {
			this.anInt3438 = arg5.length;
		}
		this.anInt3437 += arg5.length;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!as;IIIIZ)Z")
	@Override
	public boolean method3601(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass125_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass46_Sub2_20.anInt5772 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass46_Sub2_20.anInt5756 >> 8) >> 3;
			return this.aClass125_1.method3386(arg0, local30, local18);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass14_Sub40Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass46_Sub2_20.aFloat120;
		@Pc(10) float local10 = this.aClass46_Sub2_20.aFloat118;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static163.anIntArray302.length < local20) {
			Static163.anIntArray302 = new int[local20];
		}
		if (Static163.aClass14_Sub4_6.aByteArray74.length < this.anInt3434 * 2) {
			Static163.aClass14_Sub4_6 = new Class14_Sub4(this.anInt3434 * 2);
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
		if (local67 > this.anInt3871 - 1) {
			local67 = this.anInt3871 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt3873 - 1) {
			local82 = this.anInt3873 - 1;
		}
		Static163.anInt3436 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static163.anIntArray302[Static163.anInt3436++] = local108 * this.anInt3871 + local97;
				}
			}
		}
		this.aClass46_Sub2_20.method5242();
		this.aClass46_Sub2_20.method5241((this.anInt3431 & 0x7) != 0);
		for (local97 = 0; local97 < this.aClass14_Sub40Array1.length; local97++) {
			this.aClass14_Sub40Array1[local97].method5789(Static163.anIntArray302, Static163.anInt3436);
		}
		if (!this.aClass18_15.method452()) {
			local97 = this.aClass46_Sub2_20.anInt5749;
			@Pc(180) int local180 = this.aClass46_Sub2_20.anInt5753;
			this.aClass46_Sub2_20.method5163(0, local180);
			this.aClass46_Sub2_20.method5161(local10, local6 - 4.0F);
			this.aClass46_Sub2_20.method5241(false);
			this.aClass46_Sub2_20.method5208(false);
			this.aClass46_Sub2_20.method5256(130);
			this.aClass46_Sub2_20.method5226();
			this.aClass46_Sub2_20.method5251(this.aClass46_Sub2_20.aClass8_Sub1_6);
			this.aClass46_Sub2_20.method5248(8448, 7681);
			this.aClass46_Sub2_20.method5261(0, 34166, 770);
			this.aClass46_Sub2_20.method5236(0, 34167);
			for (@Pc(236) Class14 local236 = this.aClass18_15.method459(); local236 != null; local236 = this.aClass18_15.method453()) {
				@Pc(241) Class14_Sub10 local241 = (Class14_Sub10) local236;
				local241.method1522(arg3, arg1, arg0, arg2);
			}
			this.aClass46_Sub2_20.method5261(0, 5890, 768);
			this.aClass46_Sub2_20.method5236(0, 5890);
			this.aClass46_Sub2_20.method5251(null);
			this.aClass46_Sub2_20.method5163(local97, local180);
		}
		if (this.aClass125_1 != null) {
			this.aClass46_Sub2_20.method5161(local10, local6 - 8.0F);
			this.aClass46_Sub2_20.method5242();
			this.aClass46_Sub2_20.method5217(this.aClass168_7, null, null, this.aClass168_8);
			this.aClass125_1.method3382(arg0, arg4, arg2, arg1, arg3);
		}
		this.aClass46_Sub2_20.method5161(local10, local6);
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(Lclient!as;IIIIZ)V")
	@Override
	public void method3611(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass125_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass46_Sub2_20.anInt5772 >> 8) >> this.aClass46_Sub2_20.anInt5736;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass46_Sub2_20.anInt5756 >> 8) >> this.aClass46_Sub2_20.anInt5736;
			this.aClass125_1.method3384(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
	@Override
	public void method3599() {
		if (this.anInt3437 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt3871 + 1][this.anInt3873 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt3871; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt3873; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray8[local14 - 1][local20] >> 2) + (this.aByteArrayArray8[local14 + 1][local20] >> 3) + (this.aByteArrayArray8[local14][local20 - 1] >> 2) + (this.aByteArrayArray8[local14][local20 + 1] >> 3) + (this.aByteArrayArray8[local14][local20] >> 1));
				}
			}
			this.aClass14_Sub40Array1 = new Class14_Sub40[this.aClass25_12.method699()];
			this.aClass25_12.method693(this.aClass14_Sub40Array1);
			for (local14 = 0; local14 < this.aClass14_Sub40Array1.length; local14++) {
				this.aClass14_Sub40Array1[local14].method5790(this.anInt3437);
			}
			local14 = 24;
			if (this.anIntArrayArray54 != null) {
				local14 += 4;
			}
			if ((this.anInt3431 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt3437 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class14_Sub40[] local141 = new Class14_Sub40[this.anInt3437];
			@Pc(149) Class25 local149 = new Class25(Static159.method3097(this.anInt3437));
			@Pc(153) Class14_Sub40[] local153 = new Class14_Sub40[this.anInt3438];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt3871; local155++) {
				for (local161 = 0; local161 < this.anInt3873; local161++) {
					if (this.anIntArrayArrayArray10[local155][local161] != null) {
						@Pc(180) Class14_Sub40[] local180 = this.aClass14_Sub40ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray8[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray6[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray9[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray7[local155][local161];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray10[local155][local161];
						if (local208 == null) {
							local208 = local215;
						}
						@Pc(226) float local226 = this.aFloatArrayArray5[local155][local161];
						@Pc(233) float local233 = this.aFloatArrayArray6[local155][local161];
						@Pc(240) float local240 = this.aFloatArrayArray7[local155][local161];
						@Pc(249) float local249 = this.aFloatArrayArray5[local155][local161 + 1];
						@Pc(258) float local258 = this.aFloatArrayArray6[local155][local161 + 1];
						@Pc(267) float local267 = this.aFloatArrayArray7[local155][local161 + 1];
						@Pc(278) float local278 = this.aFloatArrayArray5[local155 + 1][local161 + 1];
						@Pc(289) float local289 = this.aFloatArrayArray6[local155 + 1][local161 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray7[local155 + 1][local161 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray5[local155 + 1][local161];
						@Pc(318) float local318 = this.aFloatArrayArray6[local155 + 1][local161];
						@Pc(327) float local327 = this.aFloatArrayArray7[local155 + 1][local161];
						@Pc(335) int local335 = local12[local155][local161] & 0xFF;
						@Pc(345) int local345 = local12[local155][local161 + 1] & 0xFF;
						@Pc(357) int local357 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(367) int local367 = local12[local155 + 1][local161] & 0xFF;
						@Pc(378) float local378;
						@Pc(388) float local388;
						@Pc(400) float local400;
						@Pc(410) float local410;
						if (this.anIntArrayArray54 == null) {
							local410 = 0.0F;
							local400 = 0.0F;
							local388 = 0.0F;
							local378 = 0.0F;
						} else {
							local378 = this.anIntArrayArray54[local155][local161];
							local388 = this.anIntArrayArray54[local155][local161 + 1];
							local400 = this.anIntArrayArray54[local155 + 1][local161 + 1];
							local410 = this.anIntArrayArray54[local155 + 1][local161];
						}
						@Pc(421) int local421 = 0;
						@Pc(433) int local433;
						label304: for (@Pc(423) int local423 = 0; local423 < local215.length; local423++) {
							@Pc(431) Class14_Sub40 local431 = local180[local423];
							for (local433 = 0; local433 < local421; local433++) {
								if (local153[local433] == local431) {
									continue label304;
								}
							}
							local153[local421++] = local431;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray4[local161 * this.anInt3871 + local155] = new short[local215.length];
						for (@Pc(467) int local467 = 0; local467 < local215.length; local467++) {
							@Pc(480) int local480 = (local155 << this.anInt3433) + local194[local467];
							@Pc(489) int local489 = (local161 << this.anInt3433) + local201[local467];
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
							} else if (local527 == 0 && local531 == this.anInt3432) {
								local543 = local249;
								local545 = local258;
								local547 = local267;
								local549 = local388;
								local553 = 74 - local345;
							} else if (local527 == this.anInt3432 && local531 == this.anInt3432) {
								local543 = local278;
								local545 = local289;
								local547 = local300;
								local549 = local400;
								local553 = 74 - local357;
							} else if (local527 == this.anInt3432 && local531 == 0) {
								local543 = local309;
								local545 = local318;
								local547 = local327;
								local549 = local410;
								local553 = 74 - local367;
							} else {
								@Pc(620) float local620 = (float) local527 / (float) this.anInt3432;
								@Pc(627) float local627 = (float) local531 / (float) this.anInt3432;
								@Pc(635) float local635 = local226 + (local309 - local226) * local620;
								local643 = local233 + (local318 - local233) * local620;
								@Pc(651) float local651 = local240 + (local327 - local240) * local620;
								@Pc(659) float local659 = local249 + (local278 - local249) * local620;
								@Pc(667) float local667 = local258 + (local289 - local258) * local620;
								@Pc(675) float local675 = local267 + (local300 - local267) * local620;
								local543 = local635 + (local659 - local635) * local627;
								local545 = local643 + (local667 - local643) * local627;
								local547 = local651 + (local675 - local651) * local627;
								@Pc(710) int local710 = local335 + ((local367 - local335) * local527 >> this.anInt3433);
								@Pc(721) int local721 = local345 + ((local357 - local345) * local527 >> this.anInt3433);
								local553 = 74 - local710 - ((local721 - local710) * local531 >> this.anInt3433);
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
								local535 = Static50.anIntArray75[local493 & 0xFF80 | local769];
								if ((this.anInt3431 & 0x7) == 0) {
									local537 = this.aClass46_Sub2_20.aFloatArray25[0] * local543 + this.aClass46_Sub2_20.aFloatArray25[1] * local545 + this.aClass46_Sub2_20.aFloatArray25[2] * local547;
									local537 = this.aClass46_Sub2_20.aFloat126 + local537 * (local537 > 0.0F ? this.aClass46_Sub2_20.aFloat122 : this.aClass46_Sub2_20.aFloat125);
								}
							}
							@Pc(840) Class14 local840 = local149.method691(local523);
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
									local872 = Static50.anIntArray75[local497 & 0xFF80 | local853];
									if ((this.anInt3431 & 0x7) == 0) {
										@Pc(900) float local900 = this.aClass46_Sub2_20.aFloatArray25[0] * local543 + this.aClass46_Sub2_20.aFloatArray25[1] * local545 + this.aClass46_Sub2_20.aFloatArray25[2] * local547;
										local643 = this.aClass46_Sub2_20.aFloat126 + local537 * (local537 > 0.0F ? this.aClass46_Sub2_20.aFloat122 : this.aClass46_Sub2_20.aFloat125);
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
								local137.putFloat((float) (this.method3607(local480, local489) + local505));
								local137.putFloat((float) local489);
								local137.put((byte) (local872 >> 16));
								local137.put((byte) (local872 >> 8));
								local137.put((byte) local872);
								local137.put((byte) -1);
								local137.putFloat((float) local480);
								local137.putFloat((float) local489);
								if (this.anIntArrayArray54 != null) {
									local137.putFloat(local549 + (float) local505);
								}
								if ((this.anInt3431 & 0x7) != 0) {
									local137.putFloat(local543);
									local137.putFloat(local545);
									local137.putFloat(local547);
								}
								local433 = this.anInt3435++;
								local465[local467] = (short) local433;
								if (local493 != -1) {
									local141[local433] = local180[local467];
								}
								local149.method687(local523, new Class14_Sub31(local465[local467]));
							} else {
								local465[local467] = ((Class14_Sub31) local840).aShort77;
								local433 = local465[local467] & 0xFFFF;
								if (local493 != -1 && local180[local467].aLong217 < local141[local433].aLong217) {
									local141[local433] = local180[local467];
								}
							}
							for (local872 = 0; local872 < local421; local872++) {
								local153[local872].method5792(local535, local537, local433, local553);
							}
							this.anInt3434++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt3435; local155++) {
				@Pc(1178) Class14_Sub40 local1178 = local141[local155];
				if (local1178 != null) {
					local1178.method5788(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt3871; local155++) {
				for (local161 = 0; local161 < this.anInt3873; local161++) {
					@Pc(1208) short[] local1208 = this.aShortArrayArray4[local161 * this.anInt3871 + local155];
					if (local1208 != null) {
						@Pc(1212) int local1212 = 0;
						@Pc(1214) int local1214 = 0;
						while (local1214 < local1208.length) {
							@Pc(1225) int local1225 = local1208[local1214++] & 0xFFFF;
							@Pc(1232) int local1232 = local1208[local1214++] & 0xFFFF;
							@Pc(1239) int local1239 = local1208[local1214++] & 0xFFFF;
							@Pc(1243) Class14_Sub40 local1243 = local141[local1225];
							@Pc(1247) Class14_Sub40 local1247 = local141[local1232];
							@Pc(1251) Class14_Sub40 local1251 = local141[local1239];
							@Pc(1253) Class14_Sub40 local1253 = null;
							if (local1243 != null) {
								local1243.method5793(local155, local161, local1212);
								local1253 = local1243;
							}
							if (local1247 != null) {
								local1247.method5793(local155, local161, local1212);
								if (local1253 == null || local1247.aLong217 < local1253.aLong217) {
									local1253 = local1247;
								}
							}
							if (local1251 != null) {
								local1251.method5793(local155, local161, local1212);
								if (local1253 == null || local1251.aLong217 < local1253.aLong217) {
									local1253 = local1251;
								}
							}
							if (local1253 != null) {
								if (local1243 != null) {
									local1253.method5788(local1225);
								}
								if (local1247 != null) {
									local1253.method5788(local1232);
								}
								if (local1251 != null) {
									local1253.method5788(local1239);
								}
								local1253.method5793(local155, local161, local1212);
							}
							local1212++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface3_3 = this.aClass46_Sub2_20.method5196(local14, local137);
			this.aClass168_7 = new Class168(this.aClass46_Sub2_20, this.anInterface3_3, 5126, 3, 0);
			this.aClass168_9 = new Class168(this.aClass46_Sub2_20, this.anInterface3_3, 5121, 4, 12);
			@Pc(1383) byte local1383;
			if (this.anIntArrayArray54 == null) {
				this.aClass168_8 = new Class168(this.aClass46_Sub2_20, this.anInterface3_3, 5126, 2, 16);
				local1383 = 24;
			} else {
				this.aClass168_8 = new Class168(this.aClass46_Sub2_20, this.anInterface3_3, 5126, 3, 16);
				local1383 = 28;
			}
			if ((this.anInt3431 & 0x7) != 0) {
				this.aClass168_10 = new Class168(this.aClass46_Sub2_20, this.anInterface3_3, 5126, 3, local1383);
				local155 = local1383 + 12;
			}
			@Pc(1421) long[] local1421 = new long[this.aClass14_Sub40Array1.length];
			for (@Pc(1423) int local1423 = 0; local1423 < this.aClass14_Sub40Array1.length; local1423++) {
				@Pc(1433) Class14_Sub40 local1433 = this.aClass14_Sub40Array1[local1423];
				local1421[local1423] = local1433.aLong217;
				local1433.method5791(this.anInt3435);
			}
			Static227.method4022(this.aClass14_Sub40Array1, local1421);
			if (this.aClass125_1 != null) {
				this.aClass125_1.method3387();
			}
		} else {
			this.aClass125_1 = null;
		}
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass14_Sub40ArrayArrayArray1 = null;
		this.anIntArrayArrayArray10 = null;
		this.aByteArrayArray8 = null;
		this.aClass25_12 = null;
		this.anIntArrayArray54 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray7 = null;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Lclient!as;IIIIZ)V")
	@Override
	public void method3602(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass125_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass46_Sub2_20.anInt5772 >> 8) >> this.aClass46_Sub2_20.anInt5736;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass46_Sub2_20.anInt5756 >> 8) >> this.aClass46_Sub2_20.anInt5736;
			this.aClass125_1.method3381(local19, arg0, local33);
		}
	}
}
