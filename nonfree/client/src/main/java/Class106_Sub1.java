import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	private int anInt2642;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	private int anInt2643;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	private int anInt2644;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "[[Lclient!eg;")
	private Class58[][] aClass58ArrayArray1;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
	private int anInt2646;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	private int anInt2647;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	private int anInt2648;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "[[Lclient!ls;")
	private Class131[][] aClass131ArrayArray1;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
	private int anInt2649;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
	private int anInt2650;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
	private int anInt2651;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
	private int anInt2653;

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
	private int anInt2655;

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
	private int anInt2656;

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "[[Lclient!h;")
	private Class87[][] aClass87ArrayArray1;

	@OriginalMember(owner = "client!jf", name = "G", descriptor = "[[Lclient!e;")
	private Class56[][] aClass56ArrayArray1;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "Lclient!jn;")
	private final Class81_Sub2 aClass81_Sub2_6;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
	private final int anInt2652;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "[[I")
	public final int[][] anIntArrayArray109;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "[[I")
	private final int[][] anIntArrayArray108;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
	private final int anInt2654;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
	private int anInt2645;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!jf", name = "H", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!jn;IIII[[I[[II)V")
	public Class106_Sub1(@OriginalArg(0) Class81_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass81_Sub2_6 = arg0;
		this.anInt2652 = arg2;
		this.anIntArrayArray109 = arg5;
		this.anIntArrayArray108 = arg6;
		this.anInt2654 = arg7;
		this.anInt2645 = 0;
		while (arg7 > 1) {
			this.anInt2645++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray8 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass81_Sub2_6.anInt2834 >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray109[local55 + 1][local52] - this.anIntArrayArray109[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray109[local55][local52 + 1] - this.anIntArrayArray109[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass81_Sub2_6.anInt2831 * local113 + this.aClass81_Sub2_6.anInt2845 * local117 + this.aClass81_Sub2_6.anInt2821 * local123 >> 17);
				local145 >>= 0x1;
				if (local145 < 2) {
					local145 = 2;
				} else if (local145 > 126) {
					local145 = 126;
				}
				this.aByteArrayArray8[local55][local52] = (byte) local145;
			}
		}
		this.aByteArrayArray9 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
	private boolean method2801(@OriginalArg(0) int arg0) {
		if ((this.anInt2652 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)I")
	@Override
	public int method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray109[arg0][arg1];
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5728(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class186 local4 = this.aClass81_Sub2_6.method3057(Thread.currentThread());
		@Pc(7) Class8 local7 = local4.aClass8_2;
		local7.anInt133 = 0;
		local7.aBoolean12 = false;
		if (this.aClass131ArrayArray1 != null) {
			this.method2805(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray597, local4.anIntArray585);
		} else if (this.aClass87ArrayArray1 != null) {
			this.method2803(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray597, local4.anIntArray585);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
	@Override
	public void method5721() {
		this.aByteArrayArray8 = null;
		this.aByteArrayArray9 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!sr;IIIIZ)V")
	@Override
	public void method5719(@OriginalArg(0) Class6_Sub2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method5712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass87ArrayArray1 == null) {
			this.aClass87ArrayArray1 = new Class87[super.anInt6271][super.anInt6277];
			this.aClass58ArrayArray1 = new Class58[super.anInt6271][super.anInt6277];
		} else if (this.aClass131ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg5[local57]];
				local70 = arg4[arg5[local57]];
				if (local64 != 0 && local64 != this.anInt2654 || local70 != 0 && local70 != this.anInt2654) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class58 local95 = new Class58();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort13 = local99;
			local95.aShortArray34 = new short[local99];
			local95.anIntArray141 = new int[local99];
			local95.anIntArray145 = new int[local99];
			local95.anIntArray144 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray34[local124] = (short) (this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt2654) {
					local95.aShortArray34[local124] = (short) (this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]);
				} else if (local129 == this.anInt2654 && local133 == this.anInt2654) {
					local95.aShortArray34[local124] = (short) (this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt2654 && local133 == 0) {
					local95.aShortArray34[local124] = (short) (this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]) * (this.anInt2654 - local129) + (this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]) * (this.anInt2654 - local129) + (this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray34[local124] = (short) (local288 * (this.anInt2654 - local133) + local335 * local133 >> this.anInt2645 * 2);
				}
				local288 = (arg0 << this.anInt2645) + local129;
				local335 = (arg1 << this.anInt2645) + local133;
				local95.anIntArray141[local124] = local288;
				local95.anIntArray144[local124] = local335;
				local95.anIntArray145[local124] = this.method5717(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray34[local124] < 2) {
					local95.aShortArray34[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass81_Sub2_6.anInterface2_4.method346(arg10[local288]).aBoolean162) {
					local412 = true;
				}
			}
			local95.anIntArray143 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray142 = new int[local133];
			}
			local95.aShortArray36 = new short[local133];
			local95.aShortArray33 = new short[local133];
			local95.aShortArray37 = new short[local133];
			if (local412) {
				local95.aShortArray38 = new short[local133];
				local95.aShortArray35 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray143[local95.aShort14] = Static154.method3114(arg8[local335]);
					} else {
						local95.anIntArray143[local95.aShort14] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray142[local95.aShort14] = -1;
						} else {
							local95.anIntArray142[local95.aShort14] = Static154.method3114(arg9[local335]);
						}
					}
					local95.aShortArray36[local95.aShort14] = (short) arg5[local335];
					local95.aShortArray33[local95.aShort14] = (short) arg6[local335];
					local95.aShortArray37[local95.aShort14] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass81_Sub2_6.anInterface2_4.method346(arg10[local335]).aBoolean162) {
							local95.aShortArray38[local95.aShort14] = -1;
						} else {
							local95.aShortArray38[local95.aShort14] = (short) arg10[local335];
							local95.aShortArray35[local95.aShort14] = (short) arg11[local335];
						}
					}
					local95.aShort14++;
				}
			}
			this.aClass58ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class87 local641 = new Class87();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt2051 = Static198.method3635(Static154.method3114(arg9[0]), this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]);
				if (local64 == -1) {
					local641.aByte29 = (byte) (local641.aByte29 | 0x2);
				}
			}
			if (this.anIntArrayArray109[arg0][arg1] == this.anIntArrayArray109[arg0 + 1][arg1] && this.anIntArrayArray109[arg0][arg1] == this.anIntArrayArray109[arg0 + 1][arg1 + 1] && this.anIntArrayArray109[arg0][arg1] == this.anIntArrayArray109[arg0][arg1 + 1]) {
				local641.aByte29 = (byte) (local641.aByte29 | 0x1);
			}
			if (local70 == -1 || (local641.aByte29 & 0x2) != 0 || this.aClass81_Sub2_6.anInterface2_4.method346(local70).aBoolean162) {
				@Pc(842) short local842 = Static154.method3114(local64);
				local641.aShort28 = (short) Static198.method3635(local842, this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]);
				local641.aShort24 = (short) Static198.method3635(local842, this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]);
				local641.aShort27 = (short) Static198.method3635(local842, this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]);
				local641.aShort26 = (short) Static198.method3635(local842, this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]);
				local641.aShort25 = -1;
			} else {
				local641.aShort28 = (short) (this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]);
				local641.aShort24 = (short) (this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]);
				local641.aShort27 = (short) (this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]);
				local641.aShort26 = (short) (this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]);
				local641.aShort25 = (short) local70;
			}
			this.aClass87ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
	@Override
	public void method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray9[arg0][arg1] < arg2) {
			this.aByteArrayArray9[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!sr;)Lclient!sr;")
	@Override
	public Class6_Sub2_Sub17 method5710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub17 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(Lclient!sr;IIIIZ)Z")
	@Override
	public boolean method5727(@OriginalArg(0) Class6_Sub2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII[[ZLclient!ah;[I[I)V")
	private void method2803(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class8 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean13 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass87ArrayArray1[local22][local25] != null) {
						@Pc(50) Class87 local50 = this.aClass87ArrayArray1[local22][local25];
						if (local50.aShort25 != -1 && (local50.aByte29 & 0x2) == 0 && local50.anInt2051 == -1) {
							local69 = this.aClass81_Sub2_6.method3058(local50.aShort25);
							arg5.method136(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static198.method3635(local69, local50.aShort27 & 0xFFFF), Static198.method3635(local69, local50.aShort26 & 0xFFFF), Static198.method3635(local69, local50.aShort24 & 0xFFFF));
							arg5.method136(local20, local20, local20 - 4, local16, local16 + 4, local16, Static198.method3635(local69, local50.aShort28 & 0xFFFF), Static198.method3635(local69, local50.aShort24 & 0xFFFF), Static198.method3635(local69, local50.aShort26 & 0xFFFF));
						} else if (local50.anInt2051 == -1) {
							arg5.method136(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort27 & 0xFFFF, local50.aShort26 & 0xFFFF, local50.aShort24 & 0xFFFF);
							arg5.method136(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort28 & 0xFFFF, local50.aShort24 & 0xFFFF, local50.aShort26 & 0xFFFF);
						} else {
							local69 = local50.anInt2051;
							arg5.method136(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method136(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass58ArrayArray1[local22][local25] != null) {
						@Pc(249) Class58 local249 = this.aClass58ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort13; local69++) {
							arg6[local69] = local16 + (local249.anIntArray141[local69] - local22 * this.anInt2654) * 4 / this.anInt2654;
							arg7[local69] = local20 - (local249.anIntArray144[local69] - local25 * this.anInt2654) * 4 / this.anInt2654;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort14; local297++) {
							@Pc(303) short local303 = local249.aShortArray36[local297];
							@Pc(308) short local308 = local249.aShortArray33[local297];
							@Pc(313) short local313 = local249.aShortArray37[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray142 != null && local249.anIntArray142[local297] != -1) {
								local351 = local249.anIntArray142[local297];
								arg5.method136(local329, local333, local337, local317, local321, local325, Static198.method3635(local351, local249.aShortArray34[local303]), Static198.method3635(local351, local249.aShortArray34[local308]), Static198.method3635(local351, local249.aShortArray34[local313]));
							} else if (local249.aShortArray38 == null || local249.aShortArray38[local297] == -1) {
								local351 = local249.anIntArray143[local297];
								arg5.method136(local329, local333, local337, local317, local321, local325, Static198.method3635(local351, local249.aShortArray34[local303]), Static198.method3635(local351, local249.aShortArray34[local308]), Static198.method3635(local351, local249.aShortArray34[local313]));
							} else {
								local351 = this.aClass81_Sub2_6.method3058(local249.aShortArray38[local297]);
								arg5.method136(local329, local333, local337, local317, local321, local325, Static198.method3635(local351, local249.aShortArray34[local303]), Static198.method3635(local351, local249.aShortArray34[local308]), Static198.method3635(local351, local249.aShortArray34[local313]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean13 = true;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZLclient!ah;[I[I[I)V")
	private void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class8 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class131 local6 = this.aClass131ArrayArray1[arg0][arg1];
		@Pc(29) int local29;
		@Pc(255) int local255;
		@Pc(311) int local311;
		@Pc(367) int local367;
		@Pc(423) int local423;
		@Pc(283) int local283;
		@Pc(339) int local339;
		@Pc(395) int local395;
		@Pc(451) int local451;
		@Pc(244) int local244;
		@Pc(300) int local300;
		@Pc(356) int local356;
		@Pc(412) int local412;
		@Pc(272) int local272;
		@Pc(328) int local328;
		@Pc(384) int local384;
		@Pc(440) int local440;
		@Pc(78) int local78;
		@Pc(101) int local101;
		@Pc(124) int local124;
		@Pc(147) int local147;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(163) int local163;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(222) int local222;
		@Pc(227) int local227;
		@Pc(620) int local620;
		if (local6 == null) {
			@Pc(1450) Class56 local1450 = this.aClass56ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort11; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray15[local423];
					local29 = local1450.aShortArray14[local423];
					@Pc(1470) short local1470 = local1450.aShortArray18[local423];
					local367 = this.anInt2644 + (this.anInt2649 * local1460 + this.anInt2642 * local29 + this.anInt2653 * local1470 >> 15);
					if (local367 <= this.aClass81_Sub2_6.anInt2828) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass81_Sub2_6.anInt2841;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray16[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass81_Sub2_6.aBoolean222) {
						local283 = local367 - this.aClass81_Sub2_6.anInt2841;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt2646 + (this.anInt2655 * local1460 + this.anInt2651 * local29 + this.anInt2643 * local1470 >> 15);
					local311 = this.anInt2647 + (this.anInt2650 * local1460 + this.anInt2648 * local29 + this.anInt2656 * local1470 >> 15);
					arg4[local423] = arg3.anInt137 + local255 * this.aClass81_Sub2_6.anInt2848 / local367;
					arg5[local423] = arg3.anInt136 + local311 * this.aClass81_Sub2_6.anInt2835 / local367;
				}
				if (local1450.aShortArray17 != null) {
					local283 = this.anIntArrayArray109[arg0][arg1];
					local339 = this.anIntArrayArray109[arg0 + 1][arg1];
					local395 = this.anIntArrayArray109[arg0][arg1 + 1];
					local451 = arg0 * this.anInt2654;
					local244 = local451 + this.anInt2654;
					local300 = arg1 * this.anInt2654;
					local356 = local300 + this.anInt2654;
					local412 = this.anInt2646 + (this.anInt2655 * local451 + this.anInt2651 * local283 + this.anInt2643 * local300 >> 15);
					local272 = this.anInt2647 + (this.anInt2650 * local451 + this.anInt2648 * local283 + this.anInt2656 * local300 >> 15);
					local328 = this.anInt2644 + (this.anInt2649 * local451 + this.anInt2642 * local283 + this.anInt2653 * local300 >> 15);
					local384 = this.anInt2646 + (this.anInt2655 * local244 + this.anInt2651 * local339 + this.anInt2643 * local300 >> 15);
					local440 = this.anInt2647 + (this.anInt2650 * local244 + this.anInt2648 * local339 + this.anInt2656 * local300 >> 15);
					local78 = this.anInt2644 + (this.anInt2649 * local244 + this.anInt2642 * local339 + this.anInt2653 * local300 >> 15);
					local101 = this.anInt2646 + (this.anInt2655 * local451 + this.anInt2651 * local395 + this.anInt2643 * local356 >> 15);
					local124 = this.anInt2647 + (this.anInt2650 * local451 + this.anInt2648 * local395 + this.anInt2656 * local356 >> 15);
					local147 = this.anInt2644 + (this.anInt2649 * local451 + this.anInt2642 * local395 + this.anInt2653 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort12; local36++) {
						local38 = local36 * 3;
						local40 = local38 + 1;
						local42 = local40 + 1;
						local163 = arg4[local38];
						local56 = arg4[local40];
						local61 = arg4[local42];
						local222 = arg5[local38];
						local227 = arg5[local40];
						local620 = arg5[local42];
						@Pc(1910) int local1910 = arg6[local38] + arg6[local40] + arg6[local42];
						if ((local163 - local56) * (local620 - local227) - (local222 - local227) * (local61 - local56) > 0) {
							arg3.aBoolean12 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt138 || local56 > arg3.anInt138 || local61 > arg3.anInt138;
							@Pc(1954) short local1954 = local1450.aShortArray17[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method2801(this.aClass81_Sub2_6.anInterface2_4.method346(local1954).aByte27)) {
									arg3.anInt133 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method135(local222, local227, local620, local163, local56, local61, this.aClass81_Sub2_6.anInt2843, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray131[local38], local1450.anIntArray131[local40], local1450.anIntArray131[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray131[local38] & 0xFFFFFF) != 0) {
										arg3.method134(local222, local227, local620, local163, local56, local61, Static8.method3297(arg6[local38] << 24 | this.aClass81_Sub2_6.anInt2843, local1450.anIntArray131[local38]), Static8.method3297(arg6[local40] << 24 | this.aClass81_Sub2_6.anInt2843, local1450.anIntArray131[local40]), Static8.method3297(arg6[local42] << 24 | this.aClass81_Sub2_6.anInt2843, local1450.anIntArray131[local42]));
									}
								} else if (local1954 != -1) {
									arg3.method137(local222, local227, local620, local163, local56, local61, local1450.anIntArray131[local38], local1450.anIntArray131[local40], local1450.anIntArray131[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray131[local38] & 0xFFFFFF) != 0) {
									arg3.method134(local222, local227, local620, local163, local56, local61, local1450.anIntArray131[local38], local1450.anIntArray131[local40], local1450.anIntArray131[local42]);
								}
								arg3.anInt133 = 0;
							} else {
								arg3.method138(local222, local227, local620, local163, local56, local61, this.aClass81_Sub2_6.anInt2843);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort12; local283++) {
					local339 = local283 * 3;
					local395 = local339 + 1;
					local451 = local395 + 1;
					local244 = arg4[local339];
					local300 = arg4[local395];
					local356 = arg4[local451];
					local412 = arg5[local339];
					local272 = arg5[local395];
					local328 = arg5[local451];
					local384 = arg6[local339] + arg6[local395] + arg6[local451];
					if ((local244 - local300) * (local328 - local272) - (local412 - local272) * (local356 - local300) > 0) {
						arg3.aBoolean12 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt138 || local300 > arg3.anInt138 || local356 > arg3.anInt138;
						if (local384 >= 765) {
							arg3.method138(local412, local272, local328, local244, local300, local356, this.aClass81_Sub2_6.anInt2843);
						} else if (local384 > 0) {
							if ((local1450.anIntArray131[local339] & 0xFFFFFF) != 0) {
								arg3.method134(local412, local272, local328, local244, local300, local356, Static102.method4774(arg6[local339], this.aClass81_Sub2_6.anInt2843, local1450.anIntArray131[local339]), Static102.method4774(arg6[local395], this.aClass81_Sub2_6.anInt2843, local1450.anIntArray131[local395]), Static102.method4774(arg6[local451], this.aClass81_Sub2_6.anInt2843, local1450.anIntArray131[local451]));
							}
						} else if ((local1450.anIntArray131[local339] & 0xFFFFFF) != 0) {
							arg3.method134(local412, local272, local328, local244, local300, local356, local1450.anIntArray131[local339], local1450.anIntArray131[local395], local1450.anIntArray131[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte52 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt2654;
			@Pc(24) int local24 = local19 + this.anInt2654;
			local29 = arg1 * this.anInt2654;
			@Pc(34) int local34 = local29 + this.anInt2654;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte52 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray109[arg0][arg1];
				local61 = this.anIntArrayArray109[arg0 + 1][arg1];
				local222 = this.anIntArrayArray109[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray109[arg0][arg1 + 1];
				local78 = this.anInt2644 + (this.anInt2649 * local19 + this.anInt2642 * local56 + this.anInt2653 * local29 >> 15);
				if (local78 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local101 = this.anInt2644 + (this.anInt2649 * local24 + this.anInt2642 * local61 + this.anInt2653 * local29 >> 15);
				if (local101 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local124 = this.anInt2644 + (this.anInt2649 * local24 + this.anInt2642 * local222 + this.anInt2653 * local34 >> 15);
				if (local124 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local147 = this.anInt2644 + (this.anInt2649 * local19 + this.anInt2642 * local227 + this.anInt2653 * local34 >> 15);
				if (local147 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray108[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray108[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray108[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray108[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass81_Sub2_6.aBoolean222) {
					local163 = local78 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt2646 + (this.anInt2655 * local19 + this.anInt2651 * local56 + this.anInt2643 * local29 >> 15);
				local255 = arg3.anInt137 + local244 * this.aClass81_Sub2_6.anInt2848 / local78;
				local272 = this.anInt2647 + (this.anInt2650 * local19 + this.anInt2648 * local56 + this.anInt2656 * local29 >> 15);
				local283 = arg3.anInt136 + local272 * this.aClass81_Sub2_6.anInt2835 / local78;
				local300 = this.anInt2646 + (this.anInt2655 * local24 + this.anInt2651 * local61 + this.anInt2643 * local29 >> 15);
				local311 = arg3.anInt137 + local300 * this.aClass81_Sub2_6.anInt2848 / local101;
				local328 = this.anInt2647 + (this.anInt2650 * local24 + this.anInt2648 * local61 + this.anInt2656 * local29 >> 15);
				local339 = arg3.anInt136 + local328 * this.aClass81_Sub2_6.anInt2835 / local101;
				local356 = this.anInt2646 + (this.anInt2655 * local24 + this.anInt2651 * local222 + this.anInt2643 * local34 >> 15);
				local367 = arg3.anInt137 + local356 * this.aClass81_Sub2_6.anInt2848 / local124;
				local384 = this.anInt2647 + (this.anInt2650 * local24 + this.anInt2648 * local222 + this.anInt2656 * local34 >> 15);
				local395 = arg3.anInt136 + local384 * this.aClass81_Sub2_6.anInt2835 / local124;
				local412 = this.anInt2646 + (this.anInt2655 * local19 + this.anInt2651 * local227 + this.anInt2643 * local34 >> 15);
				local423 = arg3.anInt137 + local412 * this.aClass81_Sub2_6.anInt2848 / local147;
				local440 = this.anInt2647 + (this.anInt2650 * local19 + this.anInt2648 * local227 + this.anInt2656 * local34 >> 15);
				local451 = arg3.anInt136 + local440 * this.aClass81_Sub2_6.anInt2835 / local147;
			} else {
				local56 = this.anIntArrayArray109[arg0][arg1];
				local61 = this.anInt2642 * local56;
				local78 = this.anInt2644 + (this.anInt2649 * local19 + local61 + this.anInt2653 * local29 >> 15);
				if (local78 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local101 = this.anInt2644 + (this.anInt2649 * local24 + local61 + this.anInt2653 * local29 >> 15);
				if (local101 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local124 = this.anInt2644 + (this.anInt2649 * local24 + local61 + this.anInt2653 * local34 >> 15);
				if (local124 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local147 = this.anInt2644 + (this.anInt2649 * local19 + local61 + this.anInt2653 * local34 >> 15);
				if (local147 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				if (this.aClass81_Sub2_6.aBoolean222) {
					local163 = local78 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass81_Sub2_6.anInt2841;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt2651 * local56;
				local227 = this.anInt2648 * local56;
				local244 = this.anInt2646 + (this.anInt2655 * local19 + local222 + this.anInt2643 * local29 >> 15);
				local255 = arg3.anInt137 + local244 * this.aClass81_Sub2_6.anInt2848 / local78;
				local272 = this.anInt2647 + (this.anInt2650 * local19 + local227 + this.anInt2656 * local29 >> 15);
				local283 = arg3.anInt136 + local272 * this.aClass81_Sub2_6.anInt2835 / local78;
				local300 = this.anInt2646 + (this.anInt2655 * local24 + local222 + this.anInt2643 * local29 >> 15);
				local311 = arg3.anInt137 + local300 * this.aClass81_Sub2_6.anInt2848 / local101;
				local328 = this.anInt2647 + (this.anInt2650 * local24 + local227 + this.anInt2656 * local29 >> 15);
				local339 = arg3.anInt136 + local328 * this.aClass81_Sub2_6.anInt2835 / local101;
				local356 = this.anInt2646 + (this.anInt2655 * local24 + local222 + this.anInt2643 * local34 >> 15);
				local367 = arg3.anInt137 + local356 * this.aClass81_Sub2_6.anInt2848 / local124;
				local384 = this.anInt2647 + (this.anInt2650 * local24 + local227 + this.anInt2656 * local34 >> 15);
				local395 = arg3.anInt136 + local384 * this.aClass81_Sub2_6.anInt2835 / local124;
				local412 = this.anInt2646 + (this.anInt2655 * local19 + local222 + this.anInt2643 * local34 >> 15);
				local423 = arg3.anInt137 + local412 * this.aClass81_Sub2_6.anInt2848 / local147;
				local440 = this.anInt2647 + (this.anInt2650 * local19 + local227 + this.anInt2656 * local34 >> 15);
				local451 = arg3.anInt136 + local440 * this.aClass81_Sub2_6.anInt2835 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort48 != -1 && this.method2801(this.aClass81_Sub2_6.anInterface2_4.method346(local6.aShort48).aByte27);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean12 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt138 || local423 > arg3.anInt138 || local311 > arg3.anInt138;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt133 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort48 >= 0) {
							arg3.method135(local395, local451, local339, local367, local423, local311, this.aClass81_Sub2_6.anInt2843, local40, local42, local38, local6.anInt3450, local6.anInt3449, local6.anInt3452, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort48);
						} else {
							arg3.method134(local395, local451, local339, local367, local423, local311, Static8.method3297(local40 << 24 | this.aClass81_Sub2_6.anInt2843, local6.anInt3450), Static8.method3297(local42 << 24 | this.aClass81_Sub2_6.anInt2843, local6.anInt3449), Static8.method3297(local38 << 24 | this.aClass81_Sub2_6.anInt2843, local6.anInt3452));
						}
					} else if (local6.aShort48 >= 0) {
						arg3.method137(local395, local451, local339, local367, local423, local311, local6.anInt3450, local6.anInt3449, local6.anInt3452, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort48);
					} else {
						arg3.method134(local395, local451, local339, local367, local423, local311, local6.anInt3450, local6.anInt3449, local6.anInt3452);
					}
					arg3.anInt133 = 0;
				} else {
					arg3.method138(local395, local451, local339, local367, local423, local311, this.aClass81_Sub2_6.anInt2843);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean12 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt138 || local311 > arg3.anInt138 || local423 > arg3.anInt138;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt133 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort48 >= 0) {
							arg3.method135(local283, local339, local451, local255, local311, local423, this.aClass81_Sub2_6.anInt2843, local36, local38, local42, local6.anInt3451, local6.anInt3452, local6.anInt3449, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort48);
						} else {
							arg3.method134(local283, local339, local451, local255, local311, local423, Static8.method3297(local36 << 24 | this.aClass81_Sub2_6.anInt2843, local6.anInt3451), Static8.method3297(local38 << 24 | this.aClass81_Sub2_6.anInt2843, local6.anInt3452), Static8.method3297(local42 << 24 | this.aClass81_Sub2_6.anInt2843, local6.anInt3449));
						}
					} else if (local6.aShort48 >= 0) {
						arg3.method137(local283, local339, local451, local255, local311, local423, local6.anInt3451, local6.anInt3452, local6.anInt3449, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort48);
					} else {
						arg3.method134(local283, local339, local451, local255, local311, local423, local6.anInt3451, local6.anInt3452, local6.anInt3449);
					}
					arg3.anInt133 = 0;
					return;
				}
				arg3.method138(local283, local339, local451, local255, local311, local423, this.aClass81_Sub2_6.anInt2843);
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass131ArrayArray1 == null) {
			this.aClass131ArrayArray1 = new Class131[super.anInt6271][super.anInt6277];
			this.aClass56ArrayArray1 = new Class56[super.anInt6271][super.anInt6277];
		} else if (this.aClass87ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static158.anIntArray634[Static154.method3114(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static158.anIntArray634[Static154.method3114(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg5[local104] != arg5[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == this.anInt2654 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt2654 && arg4[local116] == this.anInt2654) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt2654) {
					if (local110 != -1 && arg5[local110] != arg5[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt2654 && arg2[local244] != arg2[0] - this.anInt2654) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt2654 && arg4[local244] != arg4[0] - this.anInt2654) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(531) int local531;
		if (local102) {
			@Pc(334) Class131 local334 = new Class131();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt3453 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte52 = (byte) (local334.aByte52 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray109[arg0][arg1] == this.anIntArrayArray109[arg0 + 1][arg1] && this.anIntArrayArray109[arg0][arg1] == this.anIntArrayArray109[arg0 + 1][arg1 + 1] && this.anIntArrayArray109[arg0][arg1] == this.anIntArrayArray109[arg0][arg1 + 1]) {
				local334.aByte52 = (byte) (local334.aByte52 | 0x1);
			}
			if (local342 == -1 || (local334.aByte52 & 0x2) != 0 || this.aClass81_Sub2_6.anInterface2_4.method346(local342).aBoolean162) {
				if (this.anIntArrayArray108 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray108[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3451 = Static102.method4774(local531, arg9, Static364.method2802(arg5[local104] >> 8, this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]));
				if (local334.anInt3453 != 0) {
					local334.anInt3451 |= this.aByteArrayArray9[arg0][arg1] + 255 - this.aByteArrayArray8[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray108 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray108[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3452 = Static102.method4774(local531, arg9, Static364.method2802(arg5[local106] >> 8, this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]));
				if (local334.anInt3453 != 0) {
					local334.anInt3452 |= this.aByteArrayArray9[arg0 + 1][arg1] + 255 - this.aByteArrayArray8[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray108 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray108[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3450 = Static102.method4774(local531, arg9, Static364.method2802(arg5[local108] >> 8, this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]));
				if (local334.anInt3453 != 0) {
					local334.anInt3450 |= this.aByteArrayArray9[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray8[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray108 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray108[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3449 = Static102.method4774(local531, arg9, Static364.method2802(arg5[local110] >> 8, this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]));
				if (local334.anInt3453 != 0) {
					local334.anInt3449 |= this.aByteArrayArray9[arg0][arg1 + 1] + 255 - this.aByteArrayArray8[arg0][arg1 + 1] << 25;
				}
				local334.aShort48 = -1;
			} else {
				local334.anInt3451 = this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1];
				local334.anInt3452 = this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1];
				local334.anInt3450 = this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1];
				local334.anInt3449 = this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1];
				local334.aShort48 = (short) local342;
			}
			this.aClass131ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class56 local886 = new Class56();
		local886.aShort11 = (short) arg2.length;
		local886.aShort12 = (short) (arg2.length / 3);
		local886.aShortArray15 = new short[local886.aShort11];
		local886.aShortArray14 = new short[local886.aShort11];
		local886.aShortArray18 = new short[local886.aShort11];
		local886.anIntArray131 = new int[local886.aShort11];
		if (this.anIntArrayArray108 != null) {
			local886.aShortArray16 = new short[local886.aShort11];
		}
		@Pc(957) int local957;
		@Pc(1078) int local1078;
		@Pc(1125) int local1125;
		@Pc(1225) int local1225;
		@Pc(1344) int local1344;
		for (local244 = 0; local244 < local886.aShort11; local244++) {
			local342 = arg2[local244];
			local531 = arg4[local244];
			if (local342 == 0 && local531 == 0) {
				local957 = this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt2654) {
				local957 = this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1];
			} else if (local342 == this.anInt2654 && local531 == this.anInt2654) {
				local957 = this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt2654 && local531 == 0) {
				local957 = this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray8[arg0][arg1] - this.aByteArrayArray9[arg0][arg1]) * (this.anInt2654 - local342) + (this.aByteArrayArray8[arg0 + 1][arg1] - this.aByteArrayArray9[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray8[arg0][arg1 + 1] - this.aByteArrayArray9[arg0][arg1 + 1]) * (this.anInt2654 - local342) + (this.aByteArrayArray8[arg0 + 1][arg1 + 1] - this.aByteArrayArray9[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt2654 - local531) + local1125 * local531 >> this.anInt2645 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt2645) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt2645) + local531);
			local886.aShortArray15[local244] = local1149;
			local886.aShortArray18[local244] = local1157;
			local886.aShortArray14[local244] = (short) (this.method5717(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass81_Sub2_6.anInterface2_4.method346(arg7[local244]).aBoolean162) {
				local886.anIntArray131[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray108 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray108[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt2654) {
						local1241 = this.anIntArrayArray108[arg0][arg1 + 1];
					} else if (local342 == this.anInt2654 && local531 == this.anInt2654) {
						local1241 = this.anIntArrayArray108[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt2654 && local531 == 0) {
						local1241 = this.anIntArrayArray108[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray108[arg0][arg1] * (this.anInt2654 - local342) + this.anIntArrayArray108[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray108[arg0][arg1 + 1] * (this.anInt2654 - local342) + this.anIntArrayArray108[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt2654 - local531) + local1344 * local531 >> this.anInt2645 * 2;
					}
					local886.aShortArray16[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray131[local244] = Static102.method4774(local1225, arg9, Static364.method2802(arg5[local244] >> 8, local957));
				if (arg6 != null) {
					local886.anIntArray131[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray131[local244] = 0;
			} else {
				local886.anIntArray131[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort12; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass81_Sub2_6.anInterface2_4.method346(arg7[local531 * 3]).aBoolean162) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray130 = new int[local886.aShort12];
		}
		if (local1424) {
			local886.aShortArray17 = new short[local886.aShort12];
			local886.aShortArray13 = new short[local886.aShort12];
		}
		for (local957 = 0; local957 < local886.aShort12; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray130[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass81_Sub2_6.anInterface2_4.method346(local1344).aBoolean162) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass81_Sub2_6.anInterface2_4.method346(local1344).aBoolean162) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass81_Sub2_6.anInterface2_4.method346(local1344).aBoolean162) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray17[local957] = (short) local1344;
					local886.aShortArray13[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass81_Sub2_6.anInterface2_4.method346(local1344).aBoolean162) {
							local886.anIntArray131[local1078] = Static158.anIntArray634[Static154.method3114(this.aClass81_Sub2_6.anInterface2_4.method346(local1344).aShort23 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass81_Sub2_6.anInterface2_4.method346(local1344).aBoolean162) {
							local886.anIntArray131[local1125] = Static158.anIntArray634[Static154.method3114(this.aClass81_Sub2_6.anInterface2_4.method346(local1344).aShort23 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass81_Sub2_6.anInterface2_4.method346(local1344).aBoolean162) {
							local886.anIntArray131[local1225] = Static158.anIntArray634[Static154.method3114(this.aClass81_Sub2_6.anInterface2_4.method346(local1344).aShort23 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray17[local957] = -1;
				}
			}
		}
		this.aClass56ArrayArray1[arg0][arg1] = local886;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!uc;[I)V")
	@Override
	public void method5726(@OriginalArg(0) Class6_Sub17 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(IIIIIII[[ZLclient!ah;[I[I)V")
	private void method2805(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class8 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean13 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass131ArrayArray1[local22][local25] != null) {
						@Pc(50) Class131 local50 = this.aClass131ArrayArray1[local22][local25];
						if (local50.aShort48 != -1 && (local50.aByte52 & 0x2) == 0 && local50.anInt3453 == 0) {
							local68 = this.aClass81_Sub2_6.method3058(local50.aShort48);
							arg5.method136(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static198.method3635(local68, local50.anInt3450), Static198.method3635(local68, local50.anInt3449), Static198.method3635(local68, local50.anInt3452));
							arg5.method136(local20, local20, local20 - 4, local16, local16 + 4, local16, Static198.method3635(local68, local50.anInt3451), Static198.method3635(local68, local50.anInt3452), Static198.method3635(local68, local50.anInt3449));
						} else if (local50.anInt3453 == 0) {
							arg5.method134(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt3450, local50.anInt3449, local50.anInt3452);
							arg5.method134(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt3451, local50.anInt3452, local50.anInt3449);
						} else {
							local68 = local50.anInt3453;
							arg5.method134(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static8.method3297(local50.anInt3450 & 0xFF000000, local68), Static8.method3297(local50.anInt3449 & 0xFF000000, local68), Static8.method3297(local50.anInt3452 & 0xFF000000, local68));
							arg5.method134(local20, local20, local20 - 4, local16, local16 + 4, local16, Static8.method3297(local50.anInt3451 & 0xFF000000, local68), Static8.method3297(local50.anInt3452 & 0xFF000000, local68), Static8.method3297(local50.anInt3449 & 0xFF000000, local68));
						}
					} else if (this.aClass56ArrayArray1[local22][local25] != null) {
						@Pc(259) Class56 local259 = this.aClass56ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort11; local68++) {
							arg6[local68] = local16 + (local259.aShortArray15[local68] - local22 * this.anInt2654) * 4 / this.anInt2654;
							arg7[local68] = local20 - (local259.aShortArray18[local68] - local25 * this.anInt2654) * 4 / this.anInt2654;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort12; local307++) {
							@Pc(312) int local312 = local307 * 3;
							@Pc(316) int local316 = local312 + 1;
							@Pc(320) int local320 = local316 + 1;
							@Pc(324) int local324 = arg6[local312];
							@Pc(328) int local328 = arg6[local316];
							@Pc(332) int local332 = arg6[local320];
							@Pc(336) int local336 = arg7[local312];
							@Pc(340) int local340 = arg7[local316];
							@Pc(344) int local344 = arg7[local320];
							@Pc(369) int local369;
							if (local259.anIntArray130 != null && local259.anIntArray130[local307] != 0 && (local259.aShortArray17 == null || local259.aShortArray17 != null && local259.aShortArray17[local307] == -1)) {
								local369 = local259.anIntArray130[local307];
								arg5.method134(local336, local340, local344, local324, local328, local332, Static8.method3297(-(local259.anIntArray131[local312] & -16777216) - 16777216, local369), Static8.method3297(-(local259.anIntArray131[local316] & -16777216) - 16777216, local369), Static8.method3297(-(local259.anIntArray131[local320] & -16777216) - 16777216, local369));
							} else if (local259.aShortArray17 == null || local259.aShortArray17[local307] == -1) {
								arg5.method134(local336, local340, local344, local324, local328, local332, local259.anIntArray131[local312], local259.anIntArray131[local316], local259.anIntArray131[local320]);
							} else {
								local369 = this.aClass81_Sub2_6.method3058(local259.aShortArray17[local307]);
								arg5.method136(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean13 = true;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
	@Override
	public void method5715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class186 local4 = this.aClass81_Sub2_6.method3057(Thread.currentThread());
		local4.aClass8_2.anInt133 = 0;
		if (this.aClass131ArrayArray1 != null) {
			this.method2804(arg0, arg1, this.aClass81_Sub2_6.aBoolean220, local4.aClass8_2, local4.anIntArray597, local4.anIntArray585, local4.anIntArray587);
		} else if (this.aClass87ArrayArray1 != null) {
			this.method2806(arg0, arg1, local4.aClass8_2, local4.anIntArray597, local4.anIntArray585, local4.anIntArray587);
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)I")
	@Override
	public int method5717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt2645;
		@Pc(9) int local9 = arg1 >> this.anInt2645;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt6271 - 1 || local9 > super.anInt6277 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt2654 - 1;
		@Pc(41) int local41 = arg1 & this.anInt2654 - 1;
		@Pc(67) int local67 = this.anIntArrayArray109[local4][local9] * (this.anInt2654 - local34) + this.anIntArrayArray109[local4 + 1][local9] * local34 >> this.anInt2645;
		@Pc(97) int local97 = this.anIntArrayArray109[local4][local9 + 1] * (this.anInt2654 - local34) + this.anIntArrayArray109[local4 + 1][local9 + 1] * local34 >> this.anInt2645;
		return local67 * (this.anInt2654 - local41) + local97 * local41 >> this.anInt2645;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!ah;[I[I[I)V")
	private void method2806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class87 local6 = this.aClass87ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(181) int local181;
		@Pc(237) int local237;
		@Pc(293) int local293;
		@Pc(349) int local349;
		@Pc(209) int local209;
		@Pc(170) int local170;
		@Pc(226) int local226;
		@Pc(282) int local282;
		@Pc(338) int local338;
		@Pc(198) int local198;
		@Pc(254) int local254;
		@Pc(310) int local310;
		@Pc(366) int local366;
		@Pc(68) int local68;
		@Pc(91) int local91;
		@Pc(114) int local114;
		@Pc(137) int local137;
		@Pc(46) int local46;
		@Pc(265) int local265;
		@Pc(321) int local321;
		@Pc(377) int local377;
		if (local6 == null) {
			@Pc(996) Class58 local996 = this.aClass58ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort13; local349++) {
					local24 = local996.anIntArray141[local349];
					local29 = local996.anIntArray145[local349];
					local34 = local996.anIntArray144[local349];
					local293 = this.anInt2644 + (this.anInt2649 * local24 + this.anInt2642 * local29 + this.anInt2653 * local34 >> 15);
					if (local293 <= this.aClass81_Sub2_6.anInt2828) {
						return;
					}
					local181 = this.anInt2646 + (this.anInt2655 * local24 + this.anInt2651 * local29 + this.anInt2643 * local34 >> 15);
					local237 = this.anInt2647 + (this.anInt2650 * local24 + this.anInt2648 * local29 + this.anInt2656 * local34 >> 15);
					arg3[local349] = arg2.anInt137 + local181 * this.aClass81_Sub2_6.anInt2848 / local293;
					arg4[local349] = arg2.anInt136 + local237 * this.aClass81_Sub2_6.anInt2835 / local293;
				}
				if (local996.aShortArray38 != null) {
					local209 = this.anIntArrayArray109[arg0][arg1];
					local265 = this.anIntArrayArray109[arg0 + 1][arg1];
					local321 = this.anIntArrayArray109[arg0][arg1 + 1];
					local377 = arg0 * this.anInt2654;
					local170 = local377 + this.anInt2654;
					local226 = arg1 * this.anInt2654;
					local282 = local226 + this.anInt2654;
					local338 = this.anInt2646 + (this.anInt2655 * local377 + this.anInt2651 * local209 + this.anInt2643 * local226 >> 15);
					local198 = this.anInt2647 + (this.anInt2650 * local377 + this.anInt2648 * local209 + this.anInt2656 * local226 >> 15);
					local254 = this.anInt2644 + (this.anInt2649 * local377 + this.anInt2642 * local209 + this.anInt2653 * local226 >> 15);
					local310 = this.anInt2646 + (this.anInt2655 * local170 + this.anInt2651 * local265 + this.anInt2643 * local226 >> 15);
					local366 = this.anInt2647 + (this.anInt2650 * local170 + this.anInt2648 * local265 + this.anInt2656 * local226 >> 15);
					local68 = this.anInt2644 + (this.anInt2649 * local170 + this.anInt2642 * local265 + this.anInt2653 * local226 >> 15);
					local91 = this.anInt2646 + (this.anInt2655 * local377 + this.anInt2651 * local321 + this.anInt2643 * local282 >> 15);
					local114 = this.anInt2647 + (this.anInt2650 * local377 + this.anInt2648 * local321 + this.anInt2656 * local282 >> 15);
					local137 = this.anInt2644 + (this.anInt2649 * local377 + this.anInt2642 * local321 + this.anInt2653 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort14; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray36[local46];
						@Pc(1354) short local1354 = local996.aShortArray33[local46];
						@Pc(1359) short local1359 = local996.aShortArray37[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean12 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt138 || local1367 > arg2.anInt138 || local1371 > arg2.anInt138;
							@Pc(1427) short local1427 = local996.aShortArray38[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray143[local46];
								if (local1482 != -1) {
									arg2.method136(local1375, local1379, local1383, local1363, local1367, local1371, Static198.method3635(local1482, local996.aShortArray34[local1349]), Static198.method3635(local1482, local996.aShortArray34[local1354]), Static198.method3635(local1482, local996.aShortArray34[local1359]));
								}
							} else {
								if (this.method2801(this.aClass81_Sub2_6.anInterface2_4.method346(local1427).aByte27)) {
									arg2.anInt133 = 100;
								}
								arg2.method137(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray34[local1349], local996.aShortArray34[local1354], local996.aShortArray34[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt133 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort14; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray36[local209];
					@Pc(1533) short local1533 = local996.aShortArray33[local209];
					@Pc(1538) short local1538 = local996.aShortArray37[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray143[local209];
						if (local310 != -1) {
							arg2.aBoolean12 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt138 || local226 > arg2.anInt138 || local282 > arg2.anInt138;
							arg2.method136(local338, local198, local254, local170, local226, local282, Static198.method3635(local310, local996.aShortArray34[local1528]), Static198.method3635(local310, local996.aShortArray34[local1533]), Static198.method3635(local310, local996.aShortArray34[local1538]));
						}
					}
				}
			}
		} else if ((local6.aByte29 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt2654;
			local24 = local19 + this.anInt2654;
			local29 = arg1 * this.anInt2654;
			local34 = local29 + this.anInt2654;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte29 & 0x1) == 0) {
				local46 = this.anIntArrayArray109[arg0][arg1];
				local51 = this.anIntArrayArray109[arg0 + 1][arg1];
				local148 = this.anIntArrayArray109[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray109[arg0][arg1 + 1];
				local68 = this.anInt2644 + (this.anInt2649 * local19 + this.anInt2642 * local46 + this.anInt2653 * local29 >> 15);
				if (local68 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local91 = this.anInt2644 + (this.anInt2649 * local24 + this.anInt2642 * local51 + this.anInt2653 * local29 >> 15);
				if (local91 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local114 = this.anInt2644 + (this.anInt2649 * local24 + this.anInt2642 * local148 + this.anInt2653 * local34 >> 15);
				if (local114 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local137 = this.anInt2644 + (this.anInt2649 * local19 + this.anInt2642 * local153 + this.anInt2653 * local34 >> 15);
				if (local137 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local170 = this.anInt2646 + (this.anInt2655 * local19 + this.anInt2651 * local46 + this.anInt2643 * local29 >> 15);
				local181 = arg2.anInt137 + local170 * this.aClass81_Sub2_6.anInt2848 / local68;
				local198 = this.anInt2647 + (this.anInt2650 * local19 + this.anInt2648 * local46 + this.anInt2656 * local29 >> 15);
				local209 = arg2.anInt136 + local198 * this.aClass81_Sub2_6.anInt2835 / local68;
				local226 = this.anInt2646 + (this.anInt2655 * local24 + this.anInt2651 * local51 + this.anInt2643 * local29 >> 15);
				local237 = arg2.anInt137 + local226 * this.aClass81_Sub2_6.anInt2848 / local91;
				local254 = this.anInt2647 + (this.anInt2650 * local24 + this.anInt2648 * local51 + this.anInt2656 * local29 >> 15);
				local265 = arg2.anInt136 + local254 * this.aClass81_Sub2_6.anInt2835 / local91;
				local282 = this.anInt2646 + (this.anInt2655 * local24 + this.anInt2651 * local148 + this.anInt2643 * local34 >> 15);
				local293 = arg2.anInt137 + local282 * this.aClass81_Sub2_6.anInt2848 / local114;
				local310 = this.anInt2647 + (this.anInt2650 * local24 + this.anInt2648 * local148 + this.anInt2656 * local34 >> 15);
				local321 = arg2.anInt136 + local310 * this.aClass81_Sub2_6.anInt2835 / local114;
				local338 = this.anInt2646 + (this.anInt2655 * local19 + this.anInt2651 * local153 + this.anInt2643 * local34 >> 15);
				local349 = arg2.anInt137 + local338 * this.aClass81_Sub2_6.anInt2848 / local137;
				local366 = this.anInt2647 + (this.anInt2650 * local19 + this.anInt2648 * local153 + this.anInt2656 * local34 >> 15);
				local377 = arg2.anInt136 + local366 * this.aClass81_Sub2_6.anInt2835 / local137;
			} else {
				local46 = this.anIntArrayArray109[arg0][arg1];
				local51 = this.anInt2642 * local46;
				local68 = this.anInt2644 + (this.anInt2649 * local19 + local51 + this.anInt2653 * local29 >> 15);
				if (local68 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local91 = this.anInt2644 + (this.anInt2649 * local24 + local51 + this.anInt2653 * local29 >> 15);
				if (local91 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local114 = this.anInt2644 + (this.anInt2649 * local24 + local51 + this.anInt2653 * local34 >> 15);
				if (local114 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local137 = this.anInt2644 + (this.anInt2649 * local19 + local51 + this.anInt2653 * local34 >> 15);
				if (local137 <= this.aClass81_Sub2_6.anInt2828) {
					return;
				}
				local148 = this.anInt2651 * local46;
				local153 = this.anInt2648 * local46;
				local170 = this.anInt2646 + (this.anInt2655 * local19 + local148 + this.anInt2643 * local29 >> 15);
				local181 = arg2.anInt137 + local170 * this.aClass81_Sub2_6.anInt2848 / local68;
				local198 = this.anInt2647 + (this.anInt2650 * local19 + local153 + this.anInt2656 * local29 >> 15);
				local209 = arg2.anInt136 + local198 * this.aClass81_Sub2_6.anInt2835 / local68;
				local226 = this.anInt2646 + (this.anInt2655 * local24 + local148 + this.anInt2643 * local29 >> 15);
				local237 = arg2.anInt137 + local226 * this.aClass81_Sub2_6.anInt2848 / local91;
				local254 = this.anInt2647 + (this.anInt2650 * local24 + local153 + this.anInt2656 * local29 >> 15);
				local265 = arg2.anInt136 + local254 * this.aClass81_Sub2_6.anInt2835 / local91;
				local282 = this.anInt2646 + (this.anInt2655 * local24 + local148 + this.anInt2643 * local34 >> 15);
				local293 = arg2.anInt137 + local282 * this.aClass81_Sub2_6.anInt2848 / local114;
				local310 = this.anInt2647 + (this.anInt2650 * local24 + local153 + this.anInt2656 * local34 >> 15);
				local321 = arg2.anInt136 + local310 * this.aClass81_Sub2_6.anInt2835 / local114;
				local338 = this.anInt2646 + (this.anInt2655 * local19 + local148 + this.anInt2643 * local34 >> 15);
				local349 = arg2.anInt137 + local338 * this.aClass81_Sub2_6.anInt2848 / local137;
				local366 = this.anInt2647 + (this.anInt2650 * local19 + local153 + this.anInt2656 * local34 >> 15);
				local377 = arg2.anInt136 + local366 * this.aClass81_Sub2_6.anInt2835 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean12 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt138 || local349 > arg2.anInt138 || local237 > arg2.anInt138;
				if (local6.aShort25 >= 0) {
					if (this.method2801(this.aClass81_Sub2_6.anInterface2_4.method346(local6.aShort25).aByte27)) {
						arg2.anInt133 = 100;
					}
					arg2.method137(local321, local377, local265, local293, local349, local237, local6.aShort27 & 0xFFFF, local6.aShort26 & 0xFFFF, local6.aShort24 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort25);
					arg2.anInt133 = 0;
				} else {
					arg2.method136(local321, local377, local265, local293, local349, local237, local6.aShort27 & 0xFFFF, local6.aShort26 & 0xFFFF, local6.aShort24 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean12 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt138 || local237 > arg2.anInt138 || local349 > arg2.anInt138;
				if (local6.aShort25 >= 0) {
					if (this.method2801(this.aClass81_Sub2_6.anInterface2_4.method346(local6.aShort25).aByte27)) {
						arg2.anInt133 = 100;
					}
					arg2.method137(local209, local265, local377, local181, local237, local349, local6.aShort28 & 0xFFFF, local6.aShort24 & 0xFFFF, local6.aShort26 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort25);
					arg2.anInt133 = 0;
					return;
				}
				arg2.method136(local209, local265, local377, local181, local237, local349, local6.aShort28 & 0xFFFF, local6.aShort24 & 0xFFFF, local6.aShort26 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lclient!sr;IIIIZ)V")
	@Override
	public void method5724(@OriginalArg(0) Class6_Sub2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class72_Sub2 local3 = this.aClass81_Sub2_6.aClass72_Sub2_2;
		this.anInt2655 = local3.anInt4269;
		this.anInt2651 = local3.anInt4276;
		this.anInt2643 = local3.anInt4273;
		this.anInt2646 = local3.anInt4277;
		this.anInt2650 = local3.anInt4275;
		this.anInt2648 = local3.anInt4274;
		this.anInt2656 = local3.anInt4270;
		this.anInt2647 = local3.anInt4271;
		this.anInt2649 = local3.anInt4272;
		this.anInt2642 = local3.anInt4268;
		this.anInt2653 = local3.anInt4279;
		this.anInt2644 = local3.anInt4278;
	}
}
