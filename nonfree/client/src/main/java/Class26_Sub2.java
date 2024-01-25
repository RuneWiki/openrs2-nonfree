import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "[[Lclient!de;")
	private Class46[][] aClass46ArrayArray1;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "[[Lclient!se;")
	private Class187[][] aClass187ArrayArray1;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
	private int anInt5944;

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
	private int anInt5945;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	private int anInt5946;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
	private int anInt5947;

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
	private int anInt5948;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
	private int anInt5949;

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "[[Lclient!mm;")
	private Class131[][] aClass131ArrayArray1;

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
	private int anInt5950;

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
	private int anInt5951;

	@OriginalMember(owner = "client!sm", name = "A", descriptor = "[[Lclient!qj;")
	private Class168[][] aClass168ArrayArray1;

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
	private int anInt5952;

	@OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
	private int anInt5953;

	@OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
	private int anInt5954;

	@OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
	private int anInt5956;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Lclient!hm;")
	private final Class92_Sub1 aClass92_Sub1_9;

	@OriginalMember(owner = "client!sm", name = "E", descriptor = "I")
	private final int anInt5955;

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "[[I")
	private final int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	private final int anInt5943;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	private int anInt5942;

	@OriginalMember(owner = "client!sm", name = "x", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!hm;IIII[[I[[II)V")
	public Class26_Sub2(@OriginalArg(0) Class92_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass92_Sub1_9 = arg0;
		this.anInt5955 = arg2;
		this.anIntArrayArray58 = arg5;
		this.anIntArrayArray57 = arg6;
		this.anInt5943 = arg7;
		this.anInt5942 = 0;
		while (arg7 > 1) {
			this.anInt5942++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray21 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass92_Sub1_9.anInt2613 >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray58[local55 + 1][local52] - this.anIntArrayArray58[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray58[local55][local52 + 1] - this.anIntArrayArray58[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass92_Sub1_9.anInt2627 * local113 + this.aClass92_Sub1_9.anInt2628 * local117 + this.aClass92_Sub1_9.anInt2624 * local123 >> 17);
				local145 >>= 0x1;
				if (local145 < 2) {
					local145 = 2;
				} else if (local145 > 126) {
					local145 = 126;
				}
				this.aByteArrayArray21[local55][local52] = (byte) local145;
			}
		}
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(Lclient!ve;IIIIZ)V")
	@Override
	public void method4998(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)I")
	@Override
	public int method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray58[arg0][arg1];
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "()V")
	@Override
	public void method5005() {
		this.aByteArrayArray21 = null;
		this.aByteArrayArray20 = null;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!fs;[I)V")
	@Override
	public void method4995(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass168ArrayArray1 == null) {
			this.aClass168ArrayArray1 = new Class168[super.anInt5941][super.anInt5936];
			this.aClass46ArrayArray1 = new Class46[super.anInt5941][super.anInt5936];
		} else if (this.aClass187ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != this.anInt5943 || local70 != 0 && local70 != this.anInt5943) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class46 local95 = new Class46();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort30 = local99;
			local95.aShortArray33 = new short[local99];
			local95.anIntArray134 = new int[local99];
			local95.anIntArray131 = new int[local99];
			local95.anIntArray133 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray33[local124] = (short) (this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt5943) {
					local95.aShortArray33[local124] = (short) (this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]);
				} else if (local129 == this.anInt5943 && local133 == this.anInt5943) {
					local95.aShortArray33[local124] = (short) (this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt5943 && local133 == 0) {
					local95.aShortArray33[local124] = (short) (this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]) * (this.anInt5943 - local129) + (this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]) * (this.anInt5943 - local129) + (this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray33[local124] = (short) (local288 * (this.anInt5943 - local133) + local335 * local133 >> this.anInt5942 * 2);
				}
				local288 = (arg0 << this.anInt5942) + local129;
				local335 = (arg1 << this.anInt5942) + local133;
				local95.anIntArray134[local124] = local288;
				local95.anIntArray133[local124] = local335;
				local95.anIntArray131[local124] = this.method4990(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray33[local124] < 2) {
					local95.aShortArray33[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass92_Sub1_9.anInterface1_1.method5634(arg10[local288]).aBoolean359) {
					local412 = true;
				}
			}
			local95.anIntArray132 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray130 = new int[local133];
			}
			local95.aShortArray37 = new short[local133];
			local95.aShortArray35 = new short[local133];
			local95.aShortArray32 = new short[local133];
			if (local412) {
				local95.aShortArray34 = new short[local133];
				local95.aShortArray36 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray132[local95.aShort29] = Static176.method3333(arg8[local335]);
					} else {
						local95.anIntArray132[local95.aShort29] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray130[local95.aShort29] = -1;
						} else {
							local95.anIntArray130[local95.aShort29] = Static176.method3333(arg9[local335]);
						}
					}
					local95.aShortArray37[local95.aShort29] = (short) arg5[local335];
					local95.aShortArray35[local95.aShort29] = (short) arg6[local335];
					local95.aShortArray32[local95.aShort29] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass92_Sub1_9.anInterface1_1.method5634(arg10[local335]).aBoolean359) {
							local95.aShortArray34[local95.aShort29] = -1;
						} else {
							local95.aShortArray34[local95.aShort29] = (short) arg10[local335];
							local95.aShortArray36[local95.aShort29] = (short) arg11[local335];
						}
					}
					local95.aShort29++;
				}
			}
			this.aClass46ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class168 local641 = new Class168();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt5349 = Static91.method1636(Static176.method3333(arg9[0]), this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				if (local64 == -1) {
					local641.aByte66 = (byte) (local641.aByte66 | 0x2);
				}
			}
			if (this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0 + 1][arg1] && this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0 + 1][arg1 + 1] && this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0][arg1 + 1]) {
				local641.aByte66 = (byte) (local641.aByte66 | 0x1);
			}
			if (local70 == -1 || (local641.aByte66 & 0x2) != 0 || this.aClass92_Sub1_9.anInterface1_1.method5634(local70).aBoolean359) {
				@Pc(842) short local842 = Static176.method3333(local64);
				local641.aShort77 = (short) Static91.method1636(local842, this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				local641.aShort75 = (short) Static91.method1636(local842, this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]);
				local641.aShort76 = (short) Static91.method1636(local842, this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]);
				local641.aShort78 = (short) Static91.method1636(local842, this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]);
				local641.aShort74 = -1;
			} else {
				local641.aShort77 = (short) (this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				local641.aShort75 = (short) (this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]);
				local641.aShort76 = (short) (this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]);
				local641.aShort78 = (short) (this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]);
				local641.aShort74 = (short) local70;
			}
			this.aClass168ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
	@Override
	public void method5002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray20[arg0][arg1] < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I")
	@Override
	public int method4990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt5942;
		@Pc(9) int local9 = arg1 >> this.anInt5942;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt5941 - 1 || local9 > super.anInt5936 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt5943 - 1;
		@Pc(41) int local41 = arg1 & this.anInt5943 - 1;
		@Pc(67) int local67 = this.anIntArrayArray58[local4][local9] * (this.anInt5943 - local34) + this.anIntArrayArray58[local4 + 1][local9] * local34 >> this.anInt5942;
		@Pc(97) int local97 = this.anIntArrayArray58[local4][local9 + 1] * (this.anInt5943 - local34) + this.anIntArrayArray58[local4 + 1][local9 + 1] * local34 >> this.anInt5942;
		return local67 * (this.anInt5943 - local41) + local97 * local41 >> this.anInt5942;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZLclient!vh;[I[I[I)V")
	private void method5007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class209 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class187 local6 = this.aClass187ArrayArray1[arg0][arg1];
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
			@Pc(1450) Class131 local1450 = this.aClass131ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort56; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray59[local423];
					local29 = local1450.aShortArray62[local423];
					@Pc(1470) short local1470 = local1450.aShortArray64[local423];
					local367 = this.anInt5944 + (this.anInt5946 * local1460 + this.anInt5950 * local29 + this.anInt5953 * local1470 >> 15);
					if (local367 <= this.aClass92_Sub1_9.anInt2617) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass92_Sub1_9.anInt2614;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray61[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass92_Sub1_9.aBoolean223) {
						local283 = local367 - this.aClass92_Sub1_9.anInt2614;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt5952 + (this.anInt5951 * local1460 + this.anInt5956 * local29 + this.anInt5947 * local1470 >> 15);
					local311 = this.anInt5954 + (this.anInt5945 * local1460 + this.anInt5949 * local29 + this.anInt5948 * local1470 >> 15);
					arg4[local423] = arg3.anInt6652 + local255 * this.aClass92_Sub1_9.anInt2621 / local367;
					arg5[local423] = arg3.anInt6649 + local311 * this.aClass92_Sub1_9.anInt2612 / local367;
				}
				if (local1450.aShortArray63 != null) {
					local283 = this.anIntArrayArray58[arg0][arg1];
					local339 = this.anIntArrayArray58[arg0 + 1][arg1];
					local395 = this.anIntArrayArray58[arg0][arg1 + 1];
					local451 = arg0 * this.anInt5943;
					local244 = local451 + this.anInt5943;
					local300 = arg1 * this.anInt5943;
					local356 = local300 + this.anInt5943;
					local412 = this.anInt5952 + (this.anInt5951 * local451 + this.anInt5956 * local283 + this.anInt5947 * local300 >> 15);
					local272 = this.anInt5954 + (this.anInt5945 * local451 + this.anInt5949 * local283 + this.anInt5948 * local300 >> 15);
					local328 = this.anInt5944 + (this.anInt5946 * local451 + this.anInt5950 * local283 + this.anInt5953 * local300 >> 15);
					local384 = this.anInt5952 + (this.anInt5951 * local244 + this.anInt5956 * local339 + this.anInt5947 * local300 >> 15);
					local440 = this.anInt5954 + (this.anInt5945 * local244 + this.anInt5949 * local339 + this.anInt5948 * local300 >> 15);
					local78 = this.anInt5944 + (this.anInt5946 * local244 + this.anInt5950 * local339 + this.anInt5953 * local300 >> 15);
					local101 = this.anInt5952 + (this.anInt5951 * local451 + this.anInt5956 * local395 + this.anInt5947 * local356 >> 15);
					local124 = this.anInt5954 + (this.anInt5945 * local451 + this.anInt5949 * local395 + this.anInt5948 * local356 >> 15);
					local147 = this.anInt5944 + (this.anInt5946 * local451 + this.anInt5950 * local395 + this.anInt5953 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort55; local36++) {
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
							arg3.aBoolean574 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt6651 || local56 > arg3.anInt6651 || local61 > arg3.anInt6651;
							@Pc(1954) short local1954 = local1450.aShortArray63[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method5008(this.aClass92_Sub1_9.anInterface1_1.method5634(local1954).aByte49)) {
									arg3.anInt6654 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method5522(local222, local227, local620, local163, local56, local61, this.aClass92_Sub1_9.anInt2630, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray359[local38], local1450.anIntArray359[local40], local1450.anIntArray359[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray359[local38] & 0xFFFFFF) != 0) {
										arg3.method5515(local222, local227, local620, local163, local56, local61, Static204.method3621(arg6[local38] << 24 | this.aClass92_Sub1_9.anInt2630, local1450.anIntArray359[local38]), Static204.method3621(arg6[local40] << 24 | this.aClass92_Sub1_9.anInt2630, local1450.anIntArray359[local40]), Static204.method3621(arg6[local42] << 24 | this.aClass92_Sub1_9.anInt2630, local1450.anIntArray359[local42]));
									}
								} else if (local1954 != -1) {
									arg3.method5521(local222, local227, local620, local163, local56, local61, local1450.anIntArray359[local38], local1450.anIntArray359[local40], local1450.anIntArray359[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray359[local38] & 0xFFFFFF) != 0) {
									arg3.method5515(local222, local227, local620, local163, local56, local61, local1450.anIntArray359[local38], local1450.anIntArray359[local40], local1450.anIntArray359[local42]);
								}
								arg3.anInt6654 = 0;
							} else {
								arg3.method5523(local222, local227, local620, local163, local56, local61, this.aClass92_Sub1_9.anInt2630);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort55; local283++) {
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
						arg3.aBoolean574 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt6651 || local300 > arg3.anInt6651 || local356 > arg3.anInt6651;
						if (local384 >= 765) {
							arg3.method5523(local412, local272, local328, local244, local300, local356, this.aClass92_Sub1_9.anInt2630);
						} else if (local384 > 0) {
							if ((local1450.anIntArray359[local339] & 0xFFFFFF) != 0) {
								arg3.method5515(local412, local272, local328, local244, local300, local356, Static146.method2869(this.aClass92_Sub1_9.anInt2630, local1450.anIntArray359[local339], arg6[local339]), Static146.method2869(this.aClass92_Sub1_9.anInt2630, local1450.anIntArray359[local395], arg6[local395]), Static146.method2869(this.aClass92_Sub1_9.anInt2630, local1450.anIntArray359[local451], arg6[local451]));
							}
						} else if ((local1450.anIntArray359[local339] & 0xFFFFFF) != 0) {
							arg3.method5515(local412, local272, local328, local244, local300, local356, local1450.anIntArray359[local339], local1450.anIntArray359[local395], local1450.anIntArray359[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte69 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt5943;
			@Pc(24) int local24 = local19 + this.anInt5943;
			local29 = arg1 * this.anInt5943;
			@Pc(34) int local34 = local29 + this.anInt5943;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte69 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray58[arg0][arg1];
				local61 = this.anIntArrayArray58[arg0 + 1][arg1];
				local222 = this.anIntArrayArray58[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray58[arg0][arg1 + 1];
				local78 = this.anInt5944 + (this.anInt5946 * local19 + this.anInt5950 * local56 + this.anInt5953 * local29 >> 15);
				if (local78 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local101 = this.anInt5944 + (this.anInt5946 * local24 + this.anInt5950 * local61 + this.anInt5953 * local29 >> 15);
				if (local101 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local124 = this.anInt5944 + (this.anInt5946 * local24 + this.anInt5950 * local222 + this.anInt5953 * local34 >> 15);
				if (local124 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local147 = this.anInt5944 + (this.anInt5946 * local19 + this.anInt5950 * local227 + this.anInt5953 * local34 >> 15);
				if (local147 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray57[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray57[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray57[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray57[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass92_Sub1_9.aBoolean223) {
					local163 = local78 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt5952 + (this.anInt5951 * local19 + this.anInt5956 * local56 + this.anInt5947 * local29 >> 15);
				local255 = arg3.anInt6652 + local244 * this.aClass92_Sub1_9.anInt2621 / local78;
				local272 = this.anInt5954 + (this.anInt5945 * local19 + this.anInt5949 * local56 + this.anInt5948 * local29 >> 15);
				local283 = arg3.anInt6649 + local272 * this.aClass92_Sub1_9.anInt2612 / local78;
				local300 = this.anInt5952 + (this.anInt5951 * local24 + this.anInt5956 * local61 + this.anInt5947 * local29 >> 15);
				local311 = arg3.anInt6652 + local300 * this.aClass92_Sub1_9.anInt2621 / local101;
				local328 = this.anInt5954 + (this.anInt5945 * local24 + this.anInt5949 * local61 + this.anInt5948 * local29 >> 15);
				local339 = arg3.anInt6649 + local328 * this.aClass92_Sub1_9.anInt2612 / local101;
				local356 = this.anInt5952 + (this.anInt5951 * local24 + this.anInt5956 * local222 + this.anInt5947 * local34 >> 15);
				local367 = arg3.anInt6652 + local356 * this.aClass92_Sub1_9.anInt2621 / local124;
				local384 = this.anInt5954 + (this.anInt5945 * local24 + this.anInt5949 * local222 + this.anInt5948 * local34 >> 15);
				local395 = arg3.anInt6649 + local384 * this.aClass92_Sub1_9.anInt2612 / local124;
				local412 = this.anInt5952 + (this.anInt5951 * local19 + this.anInt5956 * local227 + this.anInt5947 * local34 >> 15);
				local423 = arg3.anInt6652 + local412 * this.aClass92_Sub1_9.anInt2621 / local147;
				local440 = this.anInt5954 + (this.anInt5945 * local19 + this.anInt5949 * local227 + this.anInt5948 * local34 >> 15);
				local451 = arg3.anInt6649 + local440 * this.aClass92_Sub1_9.anInt2612 / local147;
			} else {
				local56 = this.anIntArrayArray58[arg0][arg1];
				local61 = this.anInt5950 * local56;
				local78 = this.anInt5944 + (this.anInt5946 * local19 + local61 + this.anInt5953 * local29 >> 15);
				if (local78 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local101 = this.anInt5944 + (this.anInt5946 * local24 + local61 + this.anInt5953 * local29 >> 15);
				if (local101 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local124 = this.anInt5944 + (this.anInt5946 * local24 + local61 + this.anInt5953 * local34 >> 15);
				if (local124 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local147 = this.anInt5944 + (this.anInt5946 * local19 + local61 + this.anInt5953 * local34 >> 15);
				if (local147 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				if (this.aClass92_Sub1_9.aBoolean223) {
					local163 = local78 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass92_Sub1_9.anInt2614;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt5956 * local56;
				local227 = this.anInt5949 * local56;
				local244 = this.anInt5952 + (this.anInt5951 * local19 + local222 + this.anInt5947 * local29 >> 15);
				local255 = arg3.anInt6652 + local244 * this.aClass92_Sub1_9.anInt2621 / local78;
				local272 = this.anInt5954 + (this.anInt5945 * local19 + local227 + this.anInt5948 * local29 >> 15);
				local283 = arg3.anInt6649 + local272 * this.aClass92_Sub1_9.anInt2612 / local78;
				local300 = this.anInt5952 + (this.anInt5951 * local24 + local222 + this.anInt5947 * local29 >> 15);
				local311 = arg3.anInt6652 + local300 * this.aClass92_Sub1_9.anInt2621 / local101;
				local328 = this.anInt5954 + (this.anInt5945 * local24 + local227 + this.anInt5948 * local29 >> 15);
				local339 = arg3.anInt6649 + local328 * this.aClass92_Sub1_9.anInt2612 / local101;
				local356 = this.anInt5952 + (this.anInt5951 * local24 + local222 + this.anInt5947 * local34 >> 15);
				local367 = arg3.anInt6652 + local356 * this.aClass92_Sub1_9.anInt2621 / local124;
				local384 = this.anInt5954 + (this.anInt5945 * local24 + local227 + this.anInt5948 * local34 >> 15);
				local395 = arg3.anInt6649 + local384 * this.aClass92_Sub1_9.anInt2612 / local124;
				local412 = this.anInt5952 + (this.anInt5951 * local19 + local222 + this.anInt5947 * local34 >> 15);
				local423 = arg3.anInt6652 + local412 * this.aClass92_Sub1_9.anInt2621 / local147;
				local440 = this.anInt5954 + (this.anInt5945 * local19 + local227 + this.anInt5948 * local34 >> 15);
				local451 = arg3.anInt6649 + local440 * this.aClass92_Sub1_9.anInt2612 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort79 != -1 && this.method5008(this.aClass92_Sub1_9.anInterface1_1.method5634(local6.aShort79).aByte49);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean574 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt6651 || local423 > arg3.anInt6651 || local311 > arg3.anInt6651;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt6654 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort79 >= 0) {
							arg3.method5522(local395, local451, local339, local367, local423, local311, this.aClass92_Sub1_9.anInt2630, local40, local42, local38, local6.anInt5847, local6.anInt5849, local6.anInt5848, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort79);
						} else {
							arg3.method5515(local395, local451, local339, local367, local423, local311, Static204.method3621(local40 << 24 | this.aClass92_Sub1_9.anInt2630, local6.anInt5847), Static204.method3621(local42 << 24 | this.aClass92_Sub1_9.anInt2630, local6.anInt5849), Static204.method3621(local38 << 24 | this.aClass92_Sub1_9.anInt2630, local6.anInt5848));
						}
					} else if (local6.aShort79 >= 0) {
						arg3.method5521(local395, local451, local339, local367, local423, local311, local6.anInt5847, local6.anInt5849, local6.anInt5848, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort79);
					} else {
						arg3.method5515(local395, local451, local339, local367, local423, local311, local6.anInt5847, local6.anInt5849, local6.anInt5848);
					}
					arg3.anInt6654 = 0;
				} else {
					arg3.method5523(local395, local451, local339, local367, local423, local311, this.aClass92_Sub1_9.anInt2630);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean574 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt6651 || local311 > arg3.anInt6651 || local423 > arg3.anInt6651;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt6654 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort79 >= 0) {
							arg3.method5522(local283, local339, local451, local255, local311, local423, this.aClass92_Sub1_9.anInt2630, local36, local38, local42, local6.anInt5851, local6.anInt5848, local6.anInt5849, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort79);
						} else {
							arg3.method5515(local283, local339, local451, local255, local311, local423, Static204.method3621(local36 << 24 | this.aClass92_Sub1_9.anInt2630, local6.anInt5851), Static204.method3621(local38 << 24 | this.aClass92_Sub1_9.anInt2630, local6.anInt5848), Static204.method3621(local42 << 24 | this.aClass92_Sub1_9.anInt2630, local6.anInt5849));
						}
					} else if (local6.aShort79 >= 0) {
						arg3.method5521(local283, local339, local451, local255, local311, local423, local6.anInt5851, local6.anInt5848, local6.anInt5849, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort79);
					} else {
						arg3.method5515(local283, local339, local451, local255, local311, local423, local6.anInt5851, local6.anInt5848, local6.anInt5849);
					}
					arg3.anInt6654 = 0;
					return;
				}
				arg3.method5523(local283, local339, local451, local255, local311, local423, this.aClass92_Sub1_9.anInt2630);
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILclient!ve;)Lclient!ve;")
	@Override
	public Class4_Sub1_Sub1 method4999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub1 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Z")
	private boolean method5008(@OriginalArg(0) int arg0) {
		if ((this.anInt5955 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ve;IIIIZ)V")
	@Override
	public void method4991(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII[[ZLclient!vh;[I[I)V")
	private void method5010(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class209 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean576 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass168ArrayArray1[local22][local25] != null) {
						@Pc(50) Class168 local50 = this.aClass168ArrayArray1[local22][local25];
						if (local50.aShort74 != -1 && (local50.aByte66 & 0x2) == 0 && local50.anInt5349 == -1) {
							local69 = this.aClass92_Sub1_9.method2351(local50.aShort74);
							arg5.method5524(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static91.method1636(local69, local50.aShort76 & 0xFFFF), Static91.method1636(local69, local50.aShort78 & 0xFFFF), Static91.method1636(local69, local50.aShort75 & 0xFFFF));
							arg5.method5524(local20, local20, local20 - 4, local16, local16 + 4, local16, Static91.method1636(local69, local50.aShort77 & 0xFFFF), Static91.method1636(local69, local50.aShort75 & 0xFFFF), Static91.method1636(local69, local50.aShort78 & 0xFFFF));
						} else if (local50.anInt5349 == -1) {
							arg5.method5524(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort76 & 0xFFFF, local50.aShort78 & 0xFFFF, local50.aShort75 & 0xFFFF);
							arg5.method5524(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort77 & 0xFFFF, local50.aShort75 & 0xFFFF, local50.aShort78 & 0xFFFF);
						} else {
							local69 = local50.anInt5349;
							arg5.method5524(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method5524(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass46ArrayArray1[local22][local25] != null) {
						@Pc(249) Class46 local249 = this.aClass46ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort30; local69++) {
							arg6[local69] = local16 + (local249.anIntArray134[local69] - local22 * this.anInt5943) * 4 / this.anInt5943;
							arg7[local69] = local20 - (local249.anIntArray133[local69] - local25 * this.anInt5943) * 4 / this.anInt5943;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort29; local297++) {
							@Pc(303) short local303 = local249.aShortArray37[local297];
							@Pc(308) short local308 = local249.aShortArray35[local297];
							@Pc(313) short local313 = local249.aShortArray32[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray130 != null && local249.anIntArray130[local297] != -1) {
								local351 = local249.anIntArray130[local297];
								arg5.method5524(local329, local333, local337, local317, local321, local325, Static91.method1636(local351, local249.aShortArray33[local303]), Static91.method1636(local351, local249.aShortArray33[local308]), Static91.method1636(local351, local249.aShortArray33[local313]));
							} else if (local249.aShortArray34 == null || local249.aShortArray34[local297] == -1) {
								local351 = local249.anIntArray132[local297];
								arg5.method5524(local329, local333, local337, local317, local321, local325, Static91.method1636(local351, local249.aShortArray33[local303]), Static91.method1636(local351, local249.aShortArray33[local308]), Static91.method1636(local351, local249.aShortArray33[local313]));
							} else {
								local351 = this.aClass92_Sub1_9.method2351(local249.aShortArray34[local297]);
								arg5.method5524(local329, local333, local337, local317, local321, local325, Static91.method1636(local351, local249.aShortArray33[local303]), Static91.method1636(local351, local249.aShortArray33[local308]), Static91.method1636(local351, local249.aShortArray33[local313]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean576 = true;
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)V")
	@Override
	public void method5001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class22 local4 = this.aClass92_Sub1_9.method2347(Thread.currentThread());
		local4.aClass209_2.anInt6654 = 0;
		if (this.aClass187ArrayArray1 != null) {
			this.method5007(arg0, arg1, this.aClass92_Sub1_9.aBoolean225, local4.aClass209_2, local4.anIntArray64, local4.anIntArray61, local4.anIntArray70);
		} else if (this.aClass168ArrayArray1 != null) {
			this.method5012(arg0, arg1, local4.aClass209_2, local4.anIntArray64, local4.anIntArray61, local4.anIntArray70);
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(Lclient!ve;IIIIZ)Z")
	@Override
	public boolean method5003(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(IIIIIII[[ZLclient!vh;[I[I)V")
	private void method5011(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class209 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean576 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass187ArrayArray1[local22][local25] != null) {
						@Pc(50) Class187 local50 = this.aClass187ArrayArray1[local22][local25];
						if (local50.aShort79 != -1 && (local50.aByte69 & 0x2) == 0 && local50.anInt5850 == 0) {
							local68 = this.aClass92_Sub1_9.method2351(local50.aShort79);
							arg5.method5524(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static91.method1636(local68, local50.anInt5847), Static91.method1636(local68, local50.anInt5849), Static91.method1636(local68, local50.anInt5848));
							arg5.method5524(local20, local20, local20 - 4, local16, local16 + 4, local16, Static91.method1636(local68, local50.anInt5851), Static91.method1636(local68, local50.anInt5848), Static91.method1636(local68, local50.anInt5849));
						} else if (local50.anInt5850 == 0) {
							arg5.method5515(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt5847, local50.anInt5849, local50.anInt5848);
							arg5.method5515(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt5851, local50.anInt5848, local50.anInt5849);
						} else {
							local68 = local50.anInt5850;
							arg5.method5515(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static204.method3621(local50.anInt5847 & 0xFF000000, local68), Static204.method3621(local50.anInt5849 & 0xFF000000, local68), Static204.method3621(local50.anInt5848 & 0xFF000000, local68));
							arg5.method5515(local20, local20, local20 - 4, local16, local16 + 4, local16, Static204.method3621(local50.anInt5851 & 0xFF000000, local68), Static204.method3621(local50.anInt5848 & 0xFF000000, local68), Static204.method3621(local50.anInt5849 & 0xFF000000, local68));
						}
					} else if (this.aClass131ArrayArray1[local22][local25] != null) {
						@Pc(259) Class131 local259 = this.aClass131ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort56; local68++) {
							arg6[local68] = local16 + (local259.aShortArray59[local68] - local22 * this.anInt5943) * 4 / this.anInt5943;
							arg7[local68] = local20 - (local259.aShortArray64[local68] - local25 * this.anInt5943) * 4 / this.anInt5943;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort55; local307++) {
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
							if (local259.anIntArray360 != null && local259.anIntArray360[local307] != 0 && (local259.aShortArray63 == null || local259.aShortArray63 != null && local259.aShortArray63[local307] == -1)) {
								local369 = local259.anIntArray360[local307];
								arg5.method5515(local336, local340, local344, local324, local328, local332, Static204.method3621(-(local259.anIntArray359[local312] & -16777216) - 16777216, local369), Static204.method3621(-(local259.anIntArray359[local316] & -16777216) - 16777216, local369), Static204.method3621(-(local259.anIntArray359[local320] & -16777216) - 16777216, local369));
							} else if (local259.aShortArray63 == null || local259.aShortArray63[local307] == -1) {
								arg5.method5515(local336, local340, local344, local324, local328, local332, local259.anIntArray359[local312], local259.anIntArray359[local316], local259.anIntArray359[local320]);
							} else {
								local369 = this.aClass92_Sub1_9.method2351(local259.aShortArray63[local307]);
								arg5.method5524(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean576 = true;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILclient!vh;[I[I[I)V")
	private void method5012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class168 local6 = this.aClass168ArrayArray1[arg0][arg1];
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
			@Pc(996) Class46 local996 = this.aClass46ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort30; local349++) {
					local24 = local996.anIntArray134[local349];
					local29 = local996.anIntArray131[local349];
					local34 = local996.anIntArray133[local349];
					local293 = this.anInt5944 + (this.anInt5946 * local24 + this.anInt5950 * local29 + this.anInt5953 * local34 >> 15);
					if (local293 <= this.aClass92_Sub1_9.anInt2617) {
						return;
					}
					local181 = this.anInt5952 + (this.anInt5951 * local24 + this.anInt5956 * local29 + this.anInt5947 * local34 >> 15);
					local237 = this.anInt5954 + (this.anInt5945 * local24 + this.anInt5949 * local29 + this.anInt5948 * local34 >> 15);
					arg3[local349] = arg2.anInt6652 + local181 * this.aClass92_Sub1_9.anInt2621 / local293;
					arg4[local349] = arg2.anInt6649 + local237 * this.aClass92_Sub1_9.anInt2612 / local293;
				}
				if (local996.aShortArray34 != null) {
					local209 = this.anIntArrayArray58[arg0][arg1];
					local265 = this.anIntArrayArray58[arg0 + 1][arg1];
					local321 = this.anIntArrayArray58[arg0][arg1 + 1];
					local377 = arg0 * this.anInt5943;
					local170 = local377 + this.anInt5943;
					local226 = arg1 * this.anInt5943;
					local282 = local226 + this.anInt5943;
					local338 = this.anInt5952 + (this.anInt5951 * local377 + this.anInt5956 * local209 + this.anInt5947 * local226 >> 15);
					local198 = this.anInt5954 + (this.anInt5945 * local377 + this.anInt5949 * local209 + this.anInt5948 * local226 >> 15);
					local254 = this.anInt5944 + (this.anInt5946 * local377 + this.anInt5950 * local209 + this.anInt5953 * local226 >> 15);
					local310 = this.anInt5952 + (this.anInt5951 * local170 + this.anInt5956 * local265 + this.anInt5947 * local226 >> 15);
					local366 = this.anInt5954 + (this.anInt5945 * local170 + this.anInt5949 * local265 + this.anInt5948 * local226 >> 15);
					local68 = this.anInt5944 + (this.anInt5946 * local170 + this.anInt5950 * local265 + this.anInt5953 * local226 >> 15);
					local91 = this.anInt5952 + (this.anInt5951 * local377 + this.anInt5956 * local321 + this.anInt5947 * local282 >> 15);
					local114 = this.anInt5954 + (this.anInt5945 * local377 + this.anInt5949 * local321 + this.anInt5948 * local282 >> 15);
					local137 = this.anInt5944 + (this.anInt5946 * local377 + this.anInt5950 * local321 + this.anInt5953 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort29; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray37[local46];
						@Pc(1354) short local1354 = local996.aShortArray35[local46];
						@Pc(1359) short local1359 = local996.aShortArray32[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean574 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt6651 || local1367 > arg2.anInt6651 || local1371 > arg2.anInt6651;
							@Pc(1427) short local1427 = local996.aShortArray34[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray132[local46];
								if (local1482 != -1) {
									arg2.method5524(local1375, local1379, local1383, local1363, local1367, local1371, Static91.method1636(local1482, local996.aShortArray33[local1349]), Static91.method1636(local1482, local996.aShortArray33[local1354]), Static91.method1636(local1482, local996.aShortArray33[local1359]));
								}
							} else {
								if (this.method5008(this.aClass92_Sub1_9.anInterface1_1.method5634(local1427).aByte49)) {
									arg2.anInt6654 = 100;
								}
								arg2.method5521(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray33[local1349], local996.aShortArray33[local1354], local996.aShortArray33[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt6654 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort29; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray37[local209];
					@Pc(1533) short local1533 = local996.aShortArray35[local209];
					@Pc(1538) short local1538 = local996.aShortArray32[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray132[local209];
						if (local310 != -1) {
							arg2.aBoolean574 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt6651 || local226 > arg2.anInt6651 || local282 > arg2.anInt6651;
							arg2.method5524(local338, local198, local254, local170, local226, local282, Static91.method1636(local310, local996.aShortArray33[local1528]), Static91.method1636(local310, local996.aShortArray33[local1533]), Static91.method1636(local310, local996.aShortArray33[local1538]));
						}
					}
				}
			}
		} else if ((local6.aByte66 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt5943;
			local24 = local19 + this.anInt5943;
			local29 = arg1 * this.anInt5943;
			local34 = local29 + this.anInt5943;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte66 & 0x1) == 0) {
				local46 = this.anIntArrayArray58[arg0][arg1];
				local51 = this.anIntArrayArray58[arg0 + 1][arg1];
				local148 = this.anIntArrayArray58[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray58[arg0][arg1 + 1];
				local68 = this.anInt5944 + (this.anInt5946 * local19 + this.anInt5950 * local46 + this.anInt5953 * local29 >> 15);
				if (local68 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local91 = this.anInt5944 + (this.anInt5946 * local24 + this.anInt5950 * local51 + this.anInt5953 * local29 >> 15);
				if (local91 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local114 = this.anInt5944 + (this.anInt5946 * local24 + this.anInt5950 * local148 + this.anInt5953 * local34 >> 15);
				if (local114 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local137 = this.anInt5944 + (this.anInt5946 * local19 + this.anInt5950 * local153 + this.anInt5953 * local34 >> 15);
				if (local137 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local170 = this.anInt5952 + (this.anInt5951 * local19 + this.anInt5956 * local46 + this.anInt5947 * local29 >> 15);
				local181 = arg2.anInt6652 + local170 * this.aClass92_Sub1_9.anInt2621 / local68;
				local198 = this.anInt5954 + (this.anInt5945 * local19 + this.anInt5949 * local46 + this.anInt5948 * local29 >> 15);
				local209 = arg2.anInt6649 + local198 * this.aClass92_Sub1_9.anInt2612 / local68;
				local226 = this.anInt5952 + (this.anInt5951 * local24 + this.anInt5956 * local51 + this.anInt5947 * local29 >> 15);
				local237 = arg2.anInt6652 + local226 * this.aClass92_Sub1_9.anInt2621 / local91;
				local254 = this.anInt5954 + (this.anInt5945 * local24 + this.anInt5949 * local51 + this.anInt5948 * local29 >> 15);
				local265 = arg2.anInt6649 + local254 * this.aClass92_Sub1_9.anInt2612 / local91;
				local282 = this.anInt5952 + (this.anInt5951 * local24 + this.anInt5956 * local148 + this.anInt5947 * local34 >> 15);
				local293 = arg2.anInt6652 + local282 * this.aClass92_Sub1_9.anInt2621 / local114;
				local310 = this.anInt5954 + (this.anInt5945 * local24 + this.anInt5949 * local148 + this.anInt5948 * local34 >> 15);
				local321 = arg2.anInt6649 + local310 * this.aClass92_Sub1_9.anInt2612 / local114;
				local338 = this.anInt5952 + (this.anInt5951 * local19 + this.anInt5956 * local153 + this.anInt5947 * local34 >> 15);
				local349 = arg2.anInt6652 + local338 * this.aClass92_Sub1_9.anInt2621 / local137;
				local366 = this.anInt5954 + (this.anInt5945 * local19 + this.anInt5949 * local153 + this.anInt5948 * local34 >> 15);
				local377 = arg2.anInt6649 + local366 * this.aClass92_Sub1_9.anInt2612 / local137;
			} else {
				local46 = this.anIntArrayArray58[arg0][arg1];
				local51 = this.anInt5950 * local46;
				local68 = this.anInt5944 + (this.anInt5946 * local19 + local51 + this.anInt5953 * local29 >> 15);
				if (local68 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local91 = this.anInt5944 + (this.anInt5946 * local24 + local51 + this.anInt5953 * local29 >> 15);
				if (local91 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local114 = this.anInt5944 + (this.anInt5946 * local24 + local51 + this.anInt5953 * local34 >> 15);
				if (local114 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local137 = this.anInt5944 + (this.anInt5946 * local19 + local51 + this.anInt5953 * local34 >> 15);
				if (local137 <= this.aClass92_Sub1_9.anInt2617) {
					return;
				}
				local148 = this.anInt5956 * local46;
				local153 = this.anInt5949 * local46;
				local170 = this.anInt5952 + (this.anInt5951 * local19 + local148 + this.anInt5947 * local29 >> 15);
				local181 = arg2.anInt6652 + local170 * this.aClass92_Sub1_9.anInt2621 / local68;
				local198 = this.anInt5954 + (this.anInt5945 * local19 + local153 + this.anInt5948 * local29 >> 15);
				local209 = arg2.anInt6649 + local198 * this.aClass92_Sub1_9.anInt2612 / local68;
				local226 = this.anInt5952 + (this.anInt5951 * local24 + local148 + this.anInt5947 * local29 >> 15);
				local237 = arg2.anInt6652 + local226 * this.aClass92_Sub1_9.anInt2621 / local91;
				local254 = this.anInt5954 + (this.anInt5945 * local24 + local153 + this.anInt5948 * local29 >> 15);
				local265 = arg2.anInt6649 + local254 * this.aClass92_Sub1_9.anInt2612 / local91;
				local282 = this.anInt5952 + (this.anInt5951 * local24 + local148 + this.anInt5947 * local34 >> 15);
				local293 = arg2.anInt6652 + local282 * this.aClass92_Sub1_9.anInt2621 / local114;
				local310 = this.anInt5954 + (this.anInt5945 * local24 + local153 + this.anInt5948 * local34 >> 15);
				local321 = arg2.anInt6649 + local310 * this.aClass92_Sub1_9.anInt2612 / local114;
				local338 = this.anInt5952 + (this.anInt5951 * local19 + local148 + this.anInt5947 * local34 >> 15);
				local349 = arg2.anInt6652 + local338 * this.aClass92_Sub1_9.anInt2621 / local137;
				local366 = this.anInt5954 + (this.anInt5945 * local19 + local153 + this.anInt5948 * local34 >> 15);
				local377 = arg2.anInt6649 + local366 * this.aClass92_Sub1_9.anInt2612 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean574 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt6651 || local349 > arg2.anInt6651 || local237 > arg2.anInt6651;
				if (local6.aShort74 >= 0) {
					if (this.method5008(this.aClass92_Sub1_9.anInterface1_1.method5634(local6.aShort74).aByte49)) {
						arg2.anInt6654 = 100;
					}
					arg2.method5521(local321, local377, local265, local293, local349, local237, local6.aShort76 & 0xFFFF, local6.aShort78 & 0xFFFF, local6.aShort75 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort74);
					arg2.anInt6654 = 0;
				} else {
					arg2.method5524(local321, local377, local265, local293, local349, local237, local6.aShort76 & 0xFFFF, local6.aShort78 & 0xFFFF, local6.aShort75 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean574 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt6651 || local237 > arg2.anInt6651 || local349 > arg2.anInt6651;
				if (local6.aShort74 >= 0) {
					if (this.method5008(this.aClass92_Sub1_9.anInterface1_1.method5634(local6.aShort74).aByte49)) {
						arg2.anInt6654 = 100;
					}
					arg2.method5521(local209, local265, local377, local181, local237, local349, local6.aShort77 & 0xFFFF, local6.aShort75 & 0xFFFF, local6.aShort78 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort74);
					arg2.anInt6654 = 0;
					return;
				}
				arg2.method5524(local209, local265, local377, local181, local237, local349, local6.aShort77 & 0xFFFF, local6.aShort75 & 0xFFFF, local6.aShort78 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5004(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class22 local4 = this.aClass92_Sub1_9.method2347(Thread.currentThread());
		@Pc(7) Class209 local7 = local4.aClass209_2;
		local7.anInt6654 = 0;
		local7.aBoolean574 = false;
		if (this.aClass187ArrayArray1 != null) {
			this.method5011(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray64, local4.anIntArray61);
		} else if (this.aClass168ArrayArray1 != null) {
			this.method5010(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray64, local4.anIntArray61);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class23_Sub2 local3 = this.aClass92_Sub1_9.aClass23_Sub2_3;
		this.anInt5951 = local3.anInt6063;
		this.anInt5956 = local3.anInt6060;
		this.anInt5947 = local3.anInt6065;
		this.anInt5952 = local3.anInt6064;
		this.anInt5945 = local3.anInt6061;
		this.anInt5949 = local3.anInt6069;
		this.anInt5948 = local3.anInt6068;
		this.anInt5954 = local3.anInt6071;
		this.anInt5946 = local3.anInt6067;
		this.anInt5950 = local3.anInt6062;
		this.anInt5953 = local3.anInt6070;
		this.anInt5944 = local3.anInt6066;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass187ArrayArray1 == null) {
			this.aClass187ArrayArray1 = new Class187[super.anInt5941][super.anInt5936];
			this.aClass131ArrayArray1 = new Class131[super.anInt5941][super.anInt5936];
		} else if (this.aClass168ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static56.anIntArray139[Static176.method3333(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static56.anIntArray139[Static176.method3333(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == this.anInt5943 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt5943 && arg4[local116] == this.anInt5943) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt5943) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt5943 && arg2[local244] != arg2[0] - this.anInt5943) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt5943 && arg4[local244] != arg4[0] - this.anInt5943) {
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
			@Pc(334) Class187 local334 = new Class187();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt5850 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte69 = (byte) (local334.aByte69 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0 + 1][arg1] && this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0 + 1][arg1 + 1] && this.anIntArrayArray58[arg0][arg1] == this.anIntArrayArray58[arg0][arg1 + 1]) {
				local334.aByte69 = (byte) (local334.aByte69 | 0x1);
			}
			if (local342 == -1 || (local334.aByte69 & 0x2) != 0 || this.aClass92_Sub1_9.anInterface1_1.method5634(local342).aBoolean359) {
				if (this.anIntArrayArray57 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray57[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt5851 = Static146.method2869(arg9, Static364.method5009(arg5[local104] >> 8, this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]), local531);
				if (local334.anInt5850 != 0) {
					local334.anInt5851 |= this.aByteArrayArray20[arg0][arg1] + 255 - this.aByteArrayArray21[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray57 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray57[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt5848 = Static146.method2869(arg9, Static364.method5009(arg5[local106] >> 8, this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]), local531);
				if (local334.anInt5850 != 0) {
					local334.anInt5848 |= this.aByteArrayArray20[arg0 + 1][arg1] + 255 - this.aByteArrayArray21[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray57 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray57[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt5847 = Static146.method2869(arg9, Static364.method5009(arg5[local108] >> 8, this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]), local531);
				if (local334.anInt5850 != 0) {
					local334.anInt5847 |= this.aByteArrayArray20[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray21[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray57 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray57[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt5849 = Static146.method2869(arg9, Static364.method5009(arg5[local110] >> 8, this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]), local531);
				if (local334.anInt5850 != 0) {
					local334.anInt5849 |= this.aByteArrayArray20[arg0][arg1 + 1] + 255 - this.aByteArrayArray21[arg0][arg1 + 1] << 25;
				}
				local334.aShort79 = -1;
			} else {
				local334.anInt5851 = this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray20[arg0][arg1];
				local334.anInt5848 = this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1];
				local334.anInt5847 = this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1];
				local334.anInt5849 = this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1];
				local334.aShort79 = (short) local342;
			}
			this.aClass187ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class131 local886 = new Class131();
		local886.aShort56 = (short) arg2.length;
		local886.aShort55 = (short) (arg2.length / 3);
		local886.aShortArray59 = new short[local886.aShort56];
		local886.aShortArray62 = new short[local886.aShort56];
		local886.aShortArray64 = new short[local886.aShort56];
		local886.anIntArray359 = new int[local886.aShort56];
		if (this.anIntArrayArray57 != null) {
			local886.aShortArray61 = new short[local886.aShort56];
		}
		@Pc(957) int local957;
		@Pc(1078) int local1078;
		@Pc(1125) int local1125;
		@Pc(1225) int local1225;
		@Pc(1344) int local1344;
		for (local244 = 0; local244 < local886.aShort56; local244++) {
			local342 = arg2[local244];
			local531 = arg4[local244];
			if (local342 == 0 && local531 == 0) {
				local957 = this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray20[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt5943) {
				local957 = this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1];
			} else if (local342 == this.anInt5943 && local531 == this.anInt5943) {
				local957 = this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt5943 && local531 == 0) {
				local957 = this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]) * (this.anInt5943 - local342) + (this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]) * (this.anInt5943 - local342) + (this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt5943 - local531) + local1125 * local531 >> this.anInt5942 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt5942) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt5942) + local531);
			local886.aShortArray59[local244] = local1149;
			local886.aShortArray64[local244] = local1157;
			local886.aShortArray62[local244] = (short) (this.method4990(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass92_Sub1_9.anInterface1_1.method5634(arg7[local244]).aBoolean359) {
				local886.anIntArray359[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray57 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray57[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt5943) {
						local1241 = this.anIntArrayArray57[arg0][arg1 + 1];
					} else if (local342 == this.anInt5943 && local531 == this.anInt5943) {
						local1241 = this.anIntArrayArray57[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt5943 && local531 == 0) {
						local1241 = this.anIntArrayArray57[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray57[arg0][arg1] * (this.anInt5943 - local342) + this.anIntArrayArray57[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray57[arg0][arg1 + 1] * (this.anInt5943 - local342) + this.anIntArrayArray57[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt5943 - local531) + local1344 * local531 >> this.anInt5942 * 2;
					}
					local886.aShortArray61[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray359[local244] = Static146.method2869(arg9, Static364.method5009(arg5[local244] >> 8, local957), local1225);
				if (arg6 != null) {
					local886.anIntArray359[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray359[local244] = 0;
			} else {
				local886.anIntArray359[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort55; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass92_Sub1_9.anInterface1_1.method5634(arg7[local531 * 3]).aBoolean359) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray360 = new int[local886.aShort55];
		}
		if (local1424) {
			local886.aShortArray63 = new short[local886.aShort55];
			local886.aShortArray60 = new short[local886.aShort55];
		}
		for (local957 = 0; local957 < local886.aShort55; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray360[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass92_Sub1_9.anInterface1_1.method5634(local1344).aBoolean359) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass92_Sub1_9.anInterface1_1.method5634(local1344).aBoolean359) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass92_Sub1_9.anInterface1_1.method5634(local1344).aBoolean359) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray63[local957] = (short) local1344;
					local886.aShortArray60[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass92_Sub1_9.anInterface1_1.method5634(local1344).aBoolean359) {
							local886.anIntArray359[local1078] = Static56.anIntArray139[Static176.method3333(this.aClass92_Sub1_9.anInterface1_1.method5634(local1344).aShort57 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass92_Sub1_9.anInterface1_1.method5634(local1344).aBoolean359) {
							local886.anIntArray359[local1125] = Static56.anIntArray139[Static176.method3333(this.aClass92_Sub1_9.anInterface1_1.method5634(local1344).aShort57 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass92_Sub1_9.anInterface1_1.method5634(local1344).aBoolean359) {
							local886.anIntArray359[local1225] = Static56.anIntArray139[Static176.method3333(this.aClass92_Sub1_9.anInterface1_1.method5634(local1344).aShort57 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray63[local957] = -1;
				}
			}
		}
		this.aClass131ArrayArray1[arg0][arg1] = local886;
	}
}
