import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "[[Lclient!hm;")
	private Class99[][] aClass99ArrayArray1;

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "[[Lclient!re;")
	private Class176[][] aClass176ArrayArray1;

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "[[Lclient!ff;")
	private Class67[][] aClass67ArrayArray1;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "[[Lclient!wn;")
	private Class218[][] aClass218ArrayArray1;

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Lclient!pq;")
	private final Class105_Sub2 aClass105_Sub2_2;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
	private final int anInt265;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "[[I")
	private final int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
	private final int anInt262;

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!pq;IIII[[I[[II)V")
	public Class12_Sub1(@OriginalArg(0) Class105_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass105_Sub2_2 = arg0;
		this.anInt265 = arg2;
		this.anIntArrayArray3 = arg5;
		this.anIntArrayArray4 = arg6;
		this.anInt262 = arg7;
		this.anInt269 = 0;
		while (arg7 > 1) {
			this.anInt269++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray2 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass105_Sub2_2.anInt4865 >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray3[local55 + 1][local52] - this.anIntArrayArray3[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray3[local55][local52 + 1] - this.anIntArrayArray3[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass105_Sub2_2.anInt4890 * local113 + this.aClass105_Sub2_2.anInt4878 * local117 + this.aClass105_Sub2_2.anInt4863 * local123 >> 17);
				local145 >>= 0x1;
				if (local145 < 2) {
					local145 = 2;
				} else if (local145 > 126) {
					local145 = 126;
				}
				this.aByteArrayArray2[local55][local52] = (byte) local145;
			}
		}
		this.aByteArrayArray1 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!wc;[I)V")
	@Override
	public void method2695(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ri;IIIIZ)V")
	@Override
	public void method2696(@OriginalArg(0) Class1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class31_Sub1 local3 = this.aClass105_Sub2_2.aClass31_Sub1_2;
		this.anInt273 = local3.anInt645;
		this.anInt264 = local3.anInt634;
		this.anInt271 = local3.anInt643;
		this.anInt263 = local3.anInt638;
		this.anInt274 = local3.anInt642;
		this.anInt267 = local3.anInt637;
		this.anInt266 = local3.anInt640;
		this.anInt260 = local3.anInt635;
		this.anInt270 = local3.anInt641;
		this.anInt272 = local3.anInt644;
		this.anInt268 = local3.anInt636;
		this.anInt261 = local3.anInt639;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)I")
	@Override
	public int method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray3[arg0][arg1];
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lclient!ri;IIIIZ)Z")
	@Override
	public boolean method2702(@OriginalArg(0) Class1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
	@Override
	public void method2701() {
		this.aByteArrayArray2 = null;
		this.aByteArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)I")
	@Override
	public int method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt269;
		@Pc(9) int local9 = arg1 >> this.anInt269;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt3162 - 1 || local9 > super.anInt3163 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt262 - 1;
		@Pc(41) int local41 = arg1 & this.anInt262 - 1;
		@Pc(67) int local67 = this.anIntArrayArray3[local4][local9] * (this.anInt262 - local34) + this.anIntArrayArray3[local4 + 1][local9] * local34 >> this.anInt269;
		@Pc(97) int local97 = this.anIntArrayArray3[local4][local9 + 1] * (this.anInt262 - local34) + this.anIntArrayArray3[local4 + 1][local9 + 1] * local34 >> this.anInt269;
		return local67 * (this.anInt262 - local41) + local97 * local41 >> this.anInt269;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
	@Override
	public void method2708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray1[arg0][arg1] < arg2) {
			this.aByteArrayArray1[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2694(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class197 local4 = this.aClass105_Sub2_2.method4312(Thread.currentThread());
		@Pc(7) Class119 local7 = local4.aClass119_2;
		local7.anInt3031 = 0;
		local7.aBoolean234 = false;
		if (this.aClass218ArrayArray1 != null) {
			this.method250(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray609, local4.anIntArray610);
		} else if (this.aClass67ArrayArray1 != null) {
			this.method248(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray609, local4.anIntArray610);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method2699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass67ArrayArray1 == null) {
			this.aClass67ArrayArray1 = new Class67[super.anInt3162][super.anInt3163];
			this.aClass99ArrayArray1 = new Class99[super.anInt3162][super.anInt3163];
		} else if (this.aClass218ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != this.anInt262 || local70 != 0 && local70 != this.anInt262) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class99 local95 = new Class99();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort48 = local99;
			local95.aShortArray25 = new short[local99];
			local95.anIntArray197 = new int[local99];
			local95.anIntArray199 = new int[local99];
			local95.anIntArray201 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray25[local124] = (short) (this.aByteArrayArray2[arg0][arg1] - this.aByteArrayArray1[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt262) {
					local95.aShortArray25[local124] = (short) (this.aByteArrayArray2[arg0][arg1 + 1] - this.aByteArrayArray1[arg0][arg1 + 1]);
				} else if (local129 == this.anInt262 && local133 == this.anInt262) {
					local95.aShortArray25[local124] = (short) (this.aByteArrayArray2[arg0 + 1][arg1 + 1] - this.aByteArrayArray1[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt262 && local133 == 0) {
					local95.aShortArray25[local124] = (short) (this.aByteArrayArray2[arg0 + 1][arg1] - this.aByteArrayArray1[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray2[arg0][arg1] - this.aByteArrayArray1[arg0][arg1]) * (this.anInt262 - local129) + (this.aByteArrayArray2[arg0 + 1][arg1] - this.aByteArrayArray1[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray2[arg0][arg1 + 1] - this.aByteArrayArray1[arg0][arg1 + 1]) * (this.anInt262 - local129) + (this.aByteArrayArray2[arg0 + 1][arg1 + 1] - this.aByteArrayArray1[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray25[local124] = (short) (local288 * (this.anInt262 - local133) + local335 * local133 >> this.anInt269 * 2);
				}
				local288 = (arg0 << this.anInt269) + local129;
				local335 = (arg1 << this.anInt269) + local133;
				local95.anIntArray197[local124] = local288;
				local95.anIntArray201[local124] = local335;
				local95.anIntArray199[local124] = this.method2698(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray25[local124] < 2) {
					local95.aShortArray25[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass105_Sub2_2.anInterface2_4.method951(arg10[local288]).aBoolean217) {
					local412 = true;
				}
			}
			local95.anIntArray198 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray200 = new int[local133];
			}
			local95.aShortArray21 = new short[local133];
			local95.aShortArray20 = new short[local133];
			local95.aShortArray22 = new short[local133];
			if (local412) {
				local95.aShortArray23 = new short[local133];
				local95.aShortArray24 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray198[local95.aShort47] = Static173.method3114(arg8[local335]);
					} else {
						local95.anIntArray198[local95.aShort47] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray200[local95.aShort47] = -1;
						} else {
							local95.anIntArray200[local95.aShort47] = Static173.method3114(arg9[local335]);
						}
					}
					local95.aShortArray21[local95.aShort47] = (short) arg5[local335];
					local95.aShortArray20[local95.aShort47] = (short) arg6[local335];
					local95.aShortArray22[local95.aShort47] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass105_Sub2_2.anInterface2_4.method951(arg10[local335]).aBoolean217) {
							local95.aShortArray23[local95.aShort47] = -1;
						} else {
							local95.aShortArray23[local95.aShort47] = (short) arg10[local335];
							local95.aShortArray24[local95.aShort47] = (short) arg11[local335];
						}
					}
					local95.aShort47++;
				}
			}
			this.aClass99ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class67 local641 = new Class67();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt1601 = Static152.method2662(this.aByteArrayArray2[arg0][arg1] - this.aByteArrayArray1[arg0][arg1], Static173.method3114(arg9[0]));
				if (local64 == -1) {
					local641.aByte18 = (byte) (local641.aByte18 | 0x2);
				}
			}
			if (this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0 + 1][arg1] && this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0 + 1][arg1 + 1] && this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0][arg1 + 1]) {
				local641.aByte18 = (byte) (local641.aByte18 | 0x1);
			}
			if (local70 == -1 || (local641.aByte18 & 0x2) != 0 || this.aClass105_Sub2_2.anInterface2_4.method951(local70).aBoolean217) {
				@Pc(842) short local842 = Static173.method3114(local64);
				local641.aShort34 = (short) Static152.method2662(this.aByteArrayArray2[arg0][arg1] - this.aByteArrayArray1[arg0][arg1], local842);
				local641.aShort31 = (short) Static152.method2662(this.aByteArrayArray2[arg0 + 1][arg1] - this.aByteArrayArray1[arg0 + 1][arg1], local842);
				local641.aShort33 = (short) Static152.method2662(this.aByteArrayArray2[arg0 + 1][arg1 + 1] - this.aByteArrayArray1[arg0 + 1][arg1 + 1], local842);
				local641.aShort30 = (short) Static152.method2662(this.aByteArrayArray2[arg0][arg1 + 1] - this.aByteArrayArray1[arg0][arg1 + 1], local842);
				local641.aShort32 = -1;
			} else {
				local641.aShort34 = (short) (this.aByteArrayArray2[arg0][arg1] - this.aByteArrayArray1[arg0][arg1]);
				local641.aShort31 = (short) (this.aByteArrayArray2[arg0 + 1][arg1] - this.aByteArrayArray1[arg0 + 1][arg1]);
				local641.aShort33 = (short) (this.aByteArrayArray2[arg0 + 1][arg1 + 1] - this.aByteArrayArray1[arg0 + 1][arg1 + 1]);
				local641.aShort30 = (short) (this.aByteArrayArray2[arg0][arg1 + 1] - this.aByteArrayArray1[arg0][arg1 + 1]);
				local641.aShort32 = (short) local70;
			}
			this.aClass67ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII[[ZLclient!jp;[I[I)V")
	private void method248(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class119 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean236 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass67ArrayArray1[local22][local25] != null) {
						@Pc(50) Class67 local50 = this.aClass67ArrayArray1[local22][local25];
						if (local50.aShort32 != -1 && (local50.aByte18 & 0x2) == 0 && local50.anInt1601 == -1) {
							local69 = this.aClass105_Sub2_2.method4314(local50.aShort32);
							arg5.method2598(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static152.method2662(local50.aShort33 & 0xFFFF, local69), Static152.method2662(local50.aShort30 & 0xFFFF, local69), Static152.method2662(local50.aShort31 & 0xFFFF, local69));
							arg5.method2598(local20, local20, local20 - 4, local16, local16 + 4, local16, Static152.method2662(local50.aShort34 & 0xFFFF, local69), Static152.method2662(local50.aShort31 & 0xFFFF, local69), Static152.method2662(local50.aShort30 & 0xFFFF, local69));
						} else if (local50.anInt1601 == -1) {
							arg5.method2598(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort33 & 0xFFFF, local50.aShort30 & 0xFFFF, local50.aShort31 & 0xFFFF);
							arg5.method2598(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort34 & 0xFFFF, local50.aShort31 & 0xFFFF, local50.aShort30 & 0xFFFF);
						} else {
							local69 = local50.anInt1601;
							arg5.method2598(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method2598(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass99ArrayArray1[local22][local25] != null) {
						@Pc(249) Class99 local249 = this.aClass99ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort48; local69++) {
							arg6[local69] = local16 + (local249.anIntArray197[local69] - local22 * this.anInt262) * 4 / this.anInt262;
							arg7[local69] = local20 - (local249.anIntArray201[local69] - local25 * this.anInt262) * 4 / this.anInt262;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort47; local297++) {
							@Pc(303) short local303 = local249.aShortArray21[local297];
							@Pc(308) short local308 = local249.aShortArray20[local297];
							@Pc(313) short local313 = local249.aShortArray22[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray200 != null && local249.anIntArray200[local297] != -1) {
								local351 = local249.anIntArray200[local297];
								arg5.method2598(local329, local333, local337, local317, local321, local325, Static152.method2662(local249.aShortArray25[local303], local351), Static152.method2662(local249.aShortArray25[local308], local351), Static152.method2662(local249.aShortArray25[local313], local351));
							} else if (local249.aShortArray23 == null || local249.aShortArray23[local297] == -1) {
								local351 = local249.anIntArray198[local297];
								arg5.method2598(local329, local333, local337, local317, local321, local325, Static152.method2662(local249.aShortArray25[local303], local351), Static152.method2662(local249.aShortArray25[local308], local351), Static152.method2662(local249.aShortArray25[local313], local351));
							} else {
								local351 = this.aClass105_Sub2_2.method4314(local249.aShortArray23[local297]);
								arg5.method2598(local329, local333, local337, local317, local321, local325, Static152.method2662(local249.aShortArray25[local303], local351), Static152.method2662(local249.aShortArray25[local308], local351), Static152.method2662(local249.aShortArray25[local313], local351));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean236 = true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method2700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass218ArrayArray1 == null) {
			this.aClass218ArrayArray1 = new Class218[super.anInt3162][super.anInt3163];
			this.aClass176ArrayArray1 = new Class176[super.anInt3162][super.anInt3163];
		} else if (this.aClass67ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static94.anIntArray150[Static173.method3114(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static94.anIntArray150[Static173.method3114(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == this.anInt262 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt262 && arg4[local116] == this.anInt262) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt262) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt262 && arg2[local244] != arg2[0] - this.anInt262) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt262 && arg4[local244] != arg4[0] - this.anInt262) {
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
			@Pc(334) Class218 local334 = new Class218();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt6711 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte72 = (byte) (local334.aByte72 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0 + 1][arg1] && this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0 + 1][arg1 + 1] && this.anIntArrayArray3[arg0][arg1] == this.anIntArrayArray3[arg0][arg1 + 1]) {
				local334.aByte72 = (byte) (local334.aByte72 | 0x1);
			}
			if (local342 == -1 || (local334.aByte72 & 0x2) != 0 || this.aClass105_Sub2_2.anInterface2_4.method951(local342).aBoolean217) {
				if (this.anIntArrayArray4 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray4[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt6714 = Static281.method4983(arg9, local531, Static356.method247(arg5[local104] >> 8, this.aByteArrayArray2[arg0][arg1] - this.aByteArrayArray1[arg0][arg1]));
				if (local334.anInt6711 != 0) {
					local334.anInt6714 |= this.aByteArrayArray1[arg0][arg1] + 255 - this.aByteArrayArray2[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray4 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray4[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt6715 = Static281.method4983(arg9, local531, Static356.method247(arg5[local106] >> 8, this.aByteArrayArray2[arg0 + 1][arg1] - this.aByteArrayArray1[arg0 + 1][arg1]));
				if (local334.anInt6711 != 0) {
					local334.anInt6715 |= this.aByteArrayArray1[arg0 + 1][arg1] + 255 - this.aByteArrayArray2[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray4 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray4[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt6713 = Static281.method4983(arg9, local531, Static356.method247(arg5[local108] >> 8, this.aByteArrayArray2[arg0 + 1][arg1 + 1] - this.aByteArrayArray1[arg0 + 1][arg1 + 1]));
				if (local334.anInt6711 != 0) {
					local334.anInt6713 |= this.aByteArrayArray1[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray2[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray4 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray4[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt6712 = Static281.method4983(arg9, local531, Static356.method247(arg5[local110] >> 8, this.aByteArrayArray2[arg0][arg1 + 1] - this.aByteArrayArray1[arg0][arg1 + 1]));
				if (local334.anInt6711 != 0) {
					local334.anInt6712 |= this.aByteArrayArray1[arg0][arg1 + 1] + 255 - this.aByteArrayArray2[arg0][arg1 + 1] << 25;
				}
				local334.aShort90 = -1;
			} else {
				local334.anInt6714 = this.aByteArrayArray2[arg0][arg1] - this.aByteArrayArray1[arg0][arg1];
				local334.anInt6715 = this.aByteArrayArray2[arg0 + 1][arg1] - this.aByteArrayArray1[arg0 + 1][arg1];
				local334.anInt6713 = this.aByteArrayArray2[arg0 + 1][arg1 + 1] - this.aByteArrayArray1[arg0 + 1][arg1 + 1];
				local334.anInt6712 = this.aByteArrayArray2[arg0][arg1 + 1] - this.aByteArrayArray1[arg0][arg1 + 1];
				local334.aShort90 = (short) local342;
			}
			this.aClass218ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class176 local886 = new Class176();
		local886.aShort87 = (short) arg2.length;
		local886.aShort86 = (short) (arg2.length / 3);
		local886.aShortArray81 = new short[local886.aShort87];
		local886.aShortArray85 = new short[local886.aShort87];
		local886.aShortArray82 = new short[local886.aShort87];
		local886.anIntArray504 = new int[local886.aShort87];
		if (this.anIntArrayArray4 != null) {
			local886.aShortArray84 = new short[local886.aShort87];
		}
		@Pc(957) int local957;
		@Pc(1078) int local1078;
		@Pc(1125) int local1125;
		@Pc(1225) int local1225;
		@Pc(1344) int local1344;
		for (local244 = 0; local244 < local886.aShort87; local244++) {
			local342 = arg2[local244];
			local531 = arg4[local244];
			if (local342 == 0 && local531 == 0) {
				local957 = this.aByteArrayArray2[arg0][arg1] - this.aByteArrayArray1[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt262) {
				local957 = this.aByteArrayArray2[arg0][arg1 + 1] - this.aByteArrayArray1[arg0][arg1 + 1];
			} else if (local342 == this.anInt262 && local531 == this.anInt262) {
				local957 = this.aByteArrayArray2[arg0 + 1][arg1 + 1] - this.aByteArrayArray1[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt262 && local531 == 0) {
				local957 = this.aByteArrayArray2[arg0 + 1][arg1] - this.aByteArrayArray1[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray2[arg0][arg1] - this.aByteArrayArray1[arg0][arg1]) * (this.anInt262 - local342) + (this.aByteArrayArray2[arg0 + 1][arg1] - this.aByteArrayArray1[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray2[arg0][arg1 + 1] - this.aByteArrayArray1[arg0][arg1 + 1]) * (this.anInt262 - local342) + (this.aByteArrayArray2[arg0 + 1][arg1 + 1] - this.aByteArrayArray1[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt262 - local531) + local1125 * local531 >> this.anInt269 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt269) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt269) + local531);
			local886.aShortArray81[local244] = local1149;
			local886.aShortArray82[local244] = local1157;
			local886.aShortArray85[local244] = (short) (this.method2698(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass105_Sub2_2.anInterface2_4.method951(arg7[local244]).aBoolean217) {
				local886.anIntArray504[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray4 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray4[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt262) {
						local1241 = this.anIntArrayArray4[arg0][arg1 + 1];
					} else if (local342 == this.anInt262 && local531 == this.anInt262) {
						local1241 = this.anIntArrayArray4[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt262 && local531 == 0) {
						local1241 = this.anIntArrayArray4[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray4[arg0][arg1] * (this.anInt262 - local342) + this.anIntArrayArray4[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray4[arg0][arg1 + 1] * (this.anInt262 - local342) + this.anIntArrayArray4[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt262 - local531) + local1344 * local531 >> this.anInt269 * 2;
					}
					local886.aShortArray84[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray504[local244] = Static281.method4983(arg9, local1225, Static356.method247(arg5[local244] >> 8, local957));
				if (arg6 != null) {
					local886.anIntArray504[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray504[local244] = 0;
			} else {
				local886.anIntArray504[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort86; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass105_Sub2_2.anInterface2_4.method951(arg7[local531 * 3]).aBoolean217) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray505 = new int[local886.aShort86];
		}
		if (local1424) {
			local886.aShortArray86 = new short[local886.aShort86];
			local886.aShortArray83 = new short[local886.aShort86];
		}
		for (local957 = 0; local957 < local886.aShort86; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray505[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass105_Sub2_2.anInterface2_4.method951(local1344).aBoolean217) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass105_Sub2_2.anInterface2_4.method951(local1344).aBoolean217) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass105_Sub2_2.anInterface2_4.method951(local1344).aBoolean217) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray86[local957] = (short) local1344;
					local886.aShortArray83[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass105_Sub2_2.anInterface2_4.method951(local1344).aBoolean217) {
							local886.anIntArray504[local1078] = Static94.anIntArray150[Static173.method3114(this.aClass105_Sub2_2.anInterface2_4.method951(local1344).aShort56 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass105_Sub2_2.anInterface2_4.method951(local1344).aBoolean217) {
							local886.anIntArray504[local1125] = Static94.anIntArray150[Static173.method3114(this.aClass105_Sub2_2.anInterface2_4.method951(local1344).aShort56 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass105_Sub2_2.anInterface2_4.method951(local1344).aBoolean217) {
							local886.anIntArray504[local1225] = Static94.anIntArray150[Static173.method3114(this.aClass105_Sub2_2.anInterface2_4.method951(local1344).aShort56 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray86[local957] = -1;
				}
			}
		}
		this.aClass176ArrayArray1[arg0][arg1] = local886;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)Z")
	private boolean method249(@OriginalArg(0) int arg0) {
		if ((this.anInt265 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)V")
	@Override
	public void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class197 local4 = this.aClass105_Sub2_2.method4312(Thread.currentThread());
		local4.aClass119_2.anInt3031 = 0;
		if (this.aClass218ArrayArray1 != null) {
			this.method252(arg0, arg1, this.aClass105_Sub2_2.aBoolean393, local4.aClass119_2, local4.anIntArray609, local4.anIntArray610, local4.anIntArray604);
		} else if (this.aClass67ArrayArray1 != null) {
			this.method251(arg0, arg1, local4.aClass119_2, local4.anIntArray609, local4.anIntArray610, local4.anIntArray604);
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIIIII[[ZLclient!jp;[I[I)V")
	private void method250(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class119 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean236 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass218ArrayArray1[local22][local25] != null) {
						@Pc(50) Class218 local50 = this.aClass218ArrayArray1[local22][local25];
						if (local50.aShort90 != -1 && (local50.aByte72 & 0x2) == 0 && local50.anInt6711 == 0) {
							local68 = this.aClass105_Sub2_2.method4314(local50.aShort90);
							arg5.method2598(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static152.method2662(local50.anInt6713, local68), Static152.method2662(local50.anInt6712, local68), Static152.method2662(local50.anInt6715, local68));
							arg5.method2598(local20, local20, local20 - 4, local16, local16 + 4, local16, Static152.method2662(local50.anInt6714, local68), Static152.method2662(local50.anInt6715, local68), Static152.method2662(local50.anInt6712, local68));
						} else if (local50.anInt6711 == 0) {
							arg5.method2588(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt6713, local50.anInt6712, local50.anInt6715);
							arg5.method2588(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt6714, local50.anInt6715, local50.anInt6712);
						} else {
							local68 = local50.anInt6711;
							arg5.method2588(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static41.method873(local68, local50.anInt6713 & 0xFF000000), Static41.method873(local68, local50.anInt6712 & 0xFF000000), Static41.method873(local68, local50.anInt6715 & 0xFF000000));
							arg5.method2588(local20, local20, local20 - 4, local16, local16 + 4, local16, Static41.method873(local68, local50.anInt6714 & 0xFF000000), Static41.method873(local68, local50.anInt6715 & 0xFF000000), Static41.method873(local68, local50.anInt6712 & 0xFF000000));
						}
					} else if (this.aClass176ArrayArray1[local22][local25] != null) {
						@Pc(259) Class176 local259 = this.aClass176ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort87; local68++) {
							arg6[local68] = local16 + (local259.aShortArray81[local68] - local22 * this.anInt262) * 4 / this.anInt262;
							arg7[local68] = local20 - (local259.aShortArray82[local68] - local25 * this.anInt262) * 4 / this.anInt262;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort86; local307++) {
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
							if (local259.anIntArray505 != null && local259.anIntArray505[local307] != 0 && (local259.aShortArray86 == null || local259.aShortArray86 != null && local259.aShortArray86[local307] == -1)) {
								local369 = local259.anIntArray505[local307];
								arg5.method2588(local336, local340, local344, local324, local328, local332, Static41.method873(local369, -(local259.anIntArray504[local312] & -16777216) - 16777216), Static41.method873(local369, -(local259.anIntArray504[local316] & -16777216) - 16777216), Static41.method873(local369, -(local259.anIntArray504[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray86 == null || local259.aShortArray86[local307] == -1) {
								arg5.method2588(local336, local340, local344, local324, local328, local332, local259.anIntArray504[local312], local259.anIntArray504[local316], local259.anIntArray504[local320]);
							} else {
								local369 = this.aClass105_Sub2_2.method4314(local259.aShortArray86[local307]);
								arg5.method2598(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean236 = true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILclient!jp;[I[I[I)V")
	private void method251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class119 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class67 local6 = this.aClass67ArrayArray1[arg0][arg1];
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
			@Pc(996) Class99 local996 = this.aClass99ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort48; local349++) {
					local24 = local996.anIntArray197[local349];
					local29 = local996.anIntArray199[local349];
					local34 = local996.anIntArray201[local349];
					local293 = this.anInt261 + (this.anInt270 * local24 + this.anInt272 * local29 + this.anInt268 * local34 >> 15);
					if (local293 <= this.aClass105_Sub2_2.anInt4882) {
						return;
					}
					local181 = this.anInt263 + (this.anInt273 * local24 + this.anInt264 * local29 + this.anInt271 * local34 >> 15);
					local237 = this.anInt260 + (this.anInt274 * local24 + this.anInt267 * local29 + this.anInt266 * local34 >> 15);
					arg3[local349] = arg2.anInt3032 + local181 * this.aClass105_Sub2_2.anInt4888 / local293;
					arg4[local349] = arg2.anInt3029 + local237 * this.aClass105_Sub2_2.anInt4879 / local293;
				}
				if (local996.aShortArray23 != null) {
					local209 = this.anIntArrayArray3[arg0][arg1];
					local265 = this.anIntArrayArray3[arg0 + 1][arg1];
					local321 = this.anIntArrayArray3[arg0][arg1 + 1];
					local377 = arg0 * this.anInt262;
					local170 = local377 + this.anInt262;
					local226 = arg1 * this.anInt262;
					local282 = local226 + this.anInt262;
					local338 = this.anInt263 + (this.anInt273 * local377 + this.anInt264 * local209 + this.anInt271 * local226 >> 15);
					local198 = this.anInt260 + (this.anInt274 * local377 + this.anInt267 * local209 + this.anInt266 * local226 >> 15);
					local254 = this.anInt261 + (this.anInt270 * local377 + this.anInt272 * local209 + this.anInt268 * local226 >> 15);
					local310 = this.anInt263 + (this.anInt273 * local170 + this.anInt264 * local265 + this.anInt271 * local226 >> 15);
					local366 = this.anInt260 + (this.anInt274 * local170 + this.anInt267 * local265 + this.anInt266 * local226 >> 15);
					local68 = this.anInt261 + (this.anInt270 * local170 + this.anInt272 * local265 + this.anInt268 * local226 >> 15);
					local91 = this.anInt263 + (this.anInt273 * local377 + this.anInt264 * local321 + this.anInt271 * local282 >> 15);
					local114 = this.anInt260 + (this.anInt274 * local377 + this.anInt267 * local321 + this.anInt266 * local282 >> 15);
					local137 = this.anInt261 + (this.anInt270 * local377 + this.anInt272 * local321 + this.anInt268 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort47; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray21[local46];
						@Pc(1354) short local1354 = local996.aShortArray20[local46];
						@Pc(1359) short local1359 = local996.aShortArray22[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean234 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt3030 || local1367 > arg2.anInt3030 || local1371 > arg2.anInt3030;
							@Pc(1427) short local1427 = local996.aShortArray23[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray198[local46];
								if (local1482 != -1) {
									arg2.method2598(local1375, local1379, local1383, local1363, local1367, local1371, Static152.method2662(local996.aShortArray25[local1349], local1482), Static152.method2662(local996.aShortArray25[local1354], local1482), Static152.method2662(local996.aShortArray25[local1359], local1482));
								}
							} else {
								if (this.method249(this.aClass105_Sub2_2.anInterface2_4.method951(local1427).aByte47)) {
									arg2.anInt3031 = 100;
								}
								arg2.method2587(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray25[local1349], local996.aShortArray25[local1354], local996.aShortArray25[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt3031 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort47; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray21[local209];
					@Pc(1533) short local1533 = local996.aShortArray20[local209];
					@Pc(1538) short local1538 = local996.aShortArray22[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray198[local209];
						if (local310 != -1) {
							arg2.aBoolean234 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt3030 || local226 > arg2.anInt3030 || local282 > arg2.anInt3030;
							arg2.method2598(local338, local198, local254, local170, local226, local282, Static152.method2662(local996.aShortArray25[local1528], local310), Static152.method2662(local996.aShortArray25[local1533], local310), Static152.method2662(local996.aShortArray25[local1538], local310));
						}
					}
				}
			}
		} else if ((local6.aByte18 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt262;
			local24 = local19 + this.anInt262;
			local29 = arg1 * this.anInt262;
			local34 = local29 + this.anInt262;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte18 & 0x1) == 0) {
				local46 = this.anIntArrayArray3[arg0][arg1];
				local51 = this.anIntArrayArray3[arg0 + 1][arg1];
				local148 = this.anIntArrayArray3[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray3[arg0][arg1 + 1];
				local68 = this.anInt261 + (this.anInt270 * local19 + this.anInt272 * local46 + this.anInt268 * local29 >> 15);
				if (local68 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local91 = this.anInt261 + (this.anInt270 * local24 + this.anInt272 * local51 + this.anInt268 * local29 >> 15);
				if (local91 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local114 = this.anInt261 + (this.anInt270 * local24 + this.anInt272 * local148 + this.anInt268 * local34 >> 15);
				if (local114 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local137 = this.anInt261 + (this.anInt270 * local19 + this.anInt272 * local153 + this.anInt268 * local34 >> 15);
				if (local137 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local170 = this.anInt263 + (this.anInt273 * local19 + this.anInt264 * local46 + this.anInt271 * local29 >> 15);
				local181 = arg2.anInt3032 + local170 * this.aClass105_Sub2_2.anInt4888 / local68;
				local198 = this.anInt260 + (this.anInt274 * local19 + this.anInt267 * local46 + this.anInt266 * local29 >> 15);
				local209 = arg2.anInt3029 + local198 * this.aClass105_Sub2_2.anInt4879 / local68;
				local226 = this.anInt263 + (this.anInt273 * local24 + this.anInt264 * local51 + this.anInt271 * local29 >> 15);
				local237 = arg2.anInt3032 + local226 * this.aClass105_Sub2_2.anInt4888 / local91;
				local254 = this.anInt260 + (this.anInt274 * local24 + this.anInt267 * local51 + this.anInt266 * local29 >> 15);
				local265 = arg2.anInt3029 + local254 * this.aClass105_Sub2_2.anInt4879 / local91;
				local282 = this.anInt263 + (this.anInt273 * local24 + this.anInt264 * local148 + this.anInt271 * local34 >> 15);
				local293 = arg2.anInt3032 + local282 * this.aClass105_Sub2_2.anInt4888 / local114;
				local310 = this.anInt260 + (this.anInt274 * local24 + this.anInt267 * local148 + this.anInt266 * local34 >> 15);
				local321 = arg2.anInt3029 + local310 * this.aClass105_Sub2_2.anInt4879 / local114;
				local338 = this.anInt263 + (this.anInt273 * local19 + this.anInt264 * local153 + this.anInt271 * local34 >> 15);
				local349 = arg2.anInt3032 + local338 * this.aClass105_Sub2_2.anInt4888 / local137;
				local366 = this.anInt260 + (this.anInt274 * local19 + this.anInt267 * local153 + this.anInt266 * local34 >> 15);
				local377 = arg2.anInt3029 + local366 * this.aClass105_Sub2_2.anInt4879 / local137;
			} else {
				local46 = this.anIntArrayArray3[arg0][arg1];
				local51 = this.anInt272 * local46;
				local68 = this.anInt261 + (this.anInt270 * local19 + local51 + this.anInt268 * local29 >> 15);
				if (local68 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local91 = this.anInt261 + (this.anInt270 * local24 + local51 + this.anInt268 * local29 >> 15);
				if (local91 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local114 = this.anInt261 + (this.anInt270 * local24 + local51 + this.anInt268 * local34 >> 15);
				if (local114 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local137 = this.anInt261 + (this.anInt270 * local19 + local51 + this.anInt268 * local34 >> 15);
				if (local137 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local148 = this.anInt264 * local46;
				local153 = this.anInt267 * local46;
				local170 = this.anInt263 + (this.anInt273 * local19 + local148 + this.anInt271 * local29 >> 15);
				local181 = arg2.anInt3032 + local170 * this.aClass105_Sub2_2.anInt4888 / local68;
				local198 = this.anInt260 + (this.anInt274 * local19 + local153 + this.anInt266 * local29 >> 15);
				local209 = arg2.anInt3029 + local198 * this.aClass105_Sub2_2.anInt4879 / local68;
				local226 = this.anInt263 + (this.anInt273 * local24 + local148 + this.anInt271 * local29 >> 15);
				local237 = arg2.anInt3032 + local226 * this.aClass105_Sub2_2.anInt4888 / local91;
				local254 = this.anInt260 + (this.anInt274 * local24 + local153 + this.anInt266 * local29 >> 15);
				local265 = arg2.anInt3029 + local254 * this.aClass105_Sub2_2.anInt4879 / local91;
				local282 = this.anInt263 + (this.anInt273 * local24 + local148 + this.anInt271 * local34 >> 15);
				local293 = arg2.anInt3032 + local282 * this.aClass105_Sub2_2.anInt4888 / local114;
				local310 = this.anInt260 + (this.anInt274 * local24 + local153 + this.anInt266 * local34 >> 15);
				local321 = arg2.anInt3029 + local310 * this.aClass105_Sub2_2.anInt4879 / local114;
				local338 = this.anInt263 + (this.anInt273 * local19 + local148 + this.anInt271 * local34 >> 15);
				local349 = arg2.anInt3032 + local338 * this.aClass105_Sub2_2.anInt4888 / local137;
				local366 = this.anInt260 + (this.anInt274 * local19 + local153 + this.anInt266 * local34 >> 15);
				local377 = arg2.anInt3029 + local366 * this.aClass105_Sub2_2.anInt4879 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean234 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt3030 || local349 > arg2.anInt3030 || local237 > arg2.anInt3030;
				if (local6.aShort32 >= 0) {
					if (this.method249(this.aClass105_Sub2_2.anInterface2_4.method951(local6.aShort32).aByte47)) {
						arg2.anInt3031 = 100;
					}
					arg2.method2587(local321, local377, local265, local293, local349, local237, local6.aShort33 & 0xFFFF, local6.aShort30 & 0xFFFF, local6.aShort31 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort32);
					arg2.anInt3031 = 0;
				} else {
					arg2.method2598(local321, local377, local265, local293, local349, local237, local6.aShort33 & 0xFFFF, local6.aShort30 & 0xFFFF, local6.aShort31 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean234 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt3030 || local237 > arg2.anInt3030 || local349 > arg2.anInt3030;
				if (local6.aShort32 >= 0) {
					if (this.method249(this.aClass105_Sub2_2.anInterface2_4.method951(local6.aShort32).aByte47)) {
						arg2.anInt3031 = 100;
					}
					arg2.method2587(local209, local265, local377, local181, local237, local349, local6.aShort34 & 0xFFFF, local6.aShort31 & 0xFFFF, local6.aShort30 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort32);
					arg2.anInt3031 = 0;
					return;
				}
				arg2.method2598(local209, local265, local377, local181, local237, local349, local6.aShort34 & 0xFFFF, local6.aShort31 & 0xFFFF, local6.aShort30 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZLclient!jp;[I[I[I)V")
	private void method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class119 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class218 local6 = this.aClass218ArrayArray1[arg0][arg1];
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
			@Pc(1450) Class176 local1450 = this.aClass176ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort87; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray81[local423];
					local29 = local1450.aShortArray85[local423];
					@Pc(1470) short local1470 = local1450.aShortArray82[local423];
					local367 = this.anInt261 + (this.anInt270 * local1460 + this.anInt272 * local29 + this.anInt268 * local1470 >> 15);
					if (local367 <= this.aClass105_Sub2_2.anInt4882) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass105_Sub2_2.anInt4894;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray84[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass105_Sub2_2.aBoolean392) {
						local283 = local367 - this.aClass105_Sub2_2.anInt4894;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt263 + (this.anInt273 * local1460 + this.anInt264 * local29 + this.anInt271 * local1470 >> 15);
					local311 = this.anInt260 + (this.anInt274 * local1460 + this.anInt267 * local29 + this.anInt266 * local1470 >> 15);
					arg4[local423] = arg3.anInt3032 + local255 * this.aClass105_Sub2_2.anInt4888 / local367;
					arg5[local423] = arg3.anInt3029 + local311 * this.aClass105_Sub2_2.anInt4879 / local367;
				}
				if (local1450.aShortArray86 != null) {
					local283 = this.anIntArrayArray3[arg0][arg1];
					local339 = this.anIntArrayArray3[arg0 + 1][arg1];
					local395 = this.anIntArrayArray3[arg0][arg1 + 1];
					local451 = arg0 * this.anInt262;
					local244 = local451 + this.anInt262;
					local300 = arg1 * this.anInt262;
					local356 = local300 + this.anInt262;
					local412 = this.anInt263 + (this.anInt273 * local451 + this.anInt264 * local283 + this.anInt271 * local300 >> 15);
					local272 = this.anInt260 + (this.anInt274 * local451 + this.anInt267 * local283 + this.anInt266 * local300 >> 15);
					local328 = this.anInt261 + (this.anInt270 * local451 + this.anInt272 * local283 + this.anInt268 * local300 >> 15);
					local384 = this.anInt263 + (this.anInt273 * local244 + this.anInt264 * local339 + this.anInt271 * local300 >> 15);
					local440 = this.anInt260 + (this.anInt274 * local244 + this.anInt267 * local339 + this.anInt266 * local300 >> 15);
					local78 = this.anInt261 + (this.anInt270 * local244 + this.anInt272 * local339 + this.anInt268 * local300 >> 15);
					local101 = this.anInt263 + (this.anInt273 * local451 + this.anInt264 * local395 + this.anInt271 * local356 >> 15);
					local124 = this.anInt260 + (this.anInt274 * local451 + this.anInt267 * local395 + this.anInt266 * local356 >> 15);
					local147 = this.anInt261 + (this.anInt270 * local451 + this.anInt272 * local395 + this.anInt268 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort86; local36++) {
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
							arg3.aBoolean234 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt3030 || local56 > arg3.anInt3030 || local61 > arg3.anInt3030;
							@Pc(1954) short local1954 = local1450.aShortArray86[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method249(this.aClass105_Sub2_2.anInterface2_4.method951(local1954).aByte47)) {
									arg3.anInt3031 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method2593(local222, local227, local620, local163, local56, local61, this.aClass105_Sub2_2.anInt4867, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray504[local38], local1450.anIntArray504[local40], local1450.anIntArray504[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray504[local38] & 0xFFFFFF) != 0) {
										arg3.method2588(local222, local227, local620, local163, local56, local61, Static41.method873(local1450.anIntArray504[local38], arg6[local38] << 24 | this.aClass105_Sub2_2.anInt4867), Static41.method873(local1450.anIntArray504[local40], arg6[local40] << 24 | this.aClass105_Sub2_2.anInt4867), Static41.method873(local1450.anIntArray504[local42], arg6[local42] << 24 | this.aClass105_Sub2_2.anInt4867));
									}
								} else if (local1954 != -1) {
									arg3.method2587(local222, local227, local620, local163, local56, local61, local1450.anIntArray504[local38], local1450.anIntArray504[local40], local1450.anIntArray504[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray504[local38] & 0xFFFFFF) != 0) {
									arg3.method2588(local222, local227, local620, local163, local56, local61, local1450.anIntArray504[local38], local1450.anIntArray504[local40], local1450.anIntArray504[local42]);
								}
								arg3.anInt3031 = 0;
							} else {
								arg3.method2589(local222, local227, local620, local163, local56, local61, this.aClass105_Sub2_2.anInt4867);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort86; local283++) {
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
						arg3.aBoolean234 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt3030 || local300 > arg3.anInt3030 || local356 > arg3.anInt3030;
						if (local384 >= 765) {
							arg3.method2589(local412, local272, local328, local244, local300, local356, this.aClass105_Sub2_2.anInt4867);
						} else if (local384 > 0) {
							if ((local1450.anIntArray504[local339] & 0xFFFFFF) != 0) {
								arg3.method2588(local412, local272, local328, local244, local300, local356, Static281.method4983(this.aClass105_Sub2_2.anInt4867, arg6[local339], local1450.anIntArray504[local339]), Static281.method4983(this.aClass105_Sub2_2.anInt4867, arg6[local395], local1450.anIntArray504[local395]), Static281.method4983(this.aClass105_Sub2_2.anInt4867, arg6[local451], local1450.anIntArray504[local451]));
							}
						} else if ((local1450.anIntArray504[local339] & 0xFFFFFF) != 0) {
							arg3.method2588(local412, local272, local328, local244, local300, local356, local1450.anIntArray504[local339], local1450.anIntArray504[local395], local1450.anIntArray504[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte72 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt262;
			@Pc(24) int local24 = local19 + this.anInt262;
			local29 = arg1 * this.anInt262;
			@Pc(34) int local34 = local29 + this.anInt262;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte72 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray3[arg0][arg1];
				local61 = this.anIntArrayArray3[arg0 + 1][arg1];
				local222 = this.anIntArrayArray3[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray3[arg0][arg1 + 1];
				local78 = this.anInt261 + (this.anInt270 * local19 + this.anInt272 * local56 + this.anInt268 * local29 >> 15);
				if (local78 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local101 = this.anInt261 + (this.anInt270 * local24 + this.anInt272 * local61 + this.anInt268 * local29 >> 15);
				if (local101 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local124 = this.anInt261 + (this.anInt270 * local24 + this.anInt272 * local222 + this.anInt268 * local34 >> 15);
				if (local124 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local147 = this.anInt261 + (this.anInt270 * local19 + this.anInt272 * local227 + this.anInt268 * local34 >> 15);
				if (local147 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray4[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray4[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray4[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray4[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass105_Sub2_2.aBoolean392) {
					local163 = local78 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt263 + (this.anInt273 * local19 + this.anInt264 * local56 + this.anInt271 * local29 >> 15);
				local255 = arg3.anInt3032 + local244 * this.aClass105_Sub2_2.anInt4888 / local78;
				local272 = this.anInt260 + (this.anInt274 * local19 + this.anInt267 * local56 + this.anInt266 * local29 >> 15);
				local283 = arg3.anInt3029 + local272 * this.aClass105_Sub2_2.anInt4879 / local78;
				local300 = this.anInt263 + (this.anInt273 * local24 + this.anInt264 * local61 + this.anInt271 * local29 >> 15);
				local311 = arg3.anInt3032 + local300 * this.aClass105_Sub2_2.anInt4888 / local101;
				local328 = this.anInt260 + (this.anInt274 * local24 + this.anInt267 * local61 + this.anInt266 * local29 >> 15);
				local339 = arg3.anInt3029 + local328 * this.aClass105_Sub2_2.anInt4879 / local101;
				local356 = this.anInt263 + (this.anInt273 * local24 + this.anInt264 * local222 + this.anInt271 * local34 >> 15);
				local367 = arg3.anInt3032 + local356 * this.aClass105_Sub2_2.anInt4888 / local124;
				local384 = this.anInt260 + (this.anInt274 * local24 + this.anInt267 * local222 + this.anInt266 * local34 >> 15);
				local395 = arg3.anInt3029 + local384 * this.aClass105_Sub2_2.anInt4879 / local124;
				local412 = this.anInt263 + (this.anInt273 * local19 + this.anInt264 * local227 + this.anInt271 * local34 >> 15);
				local423 = arg3.anInt3032 + local412 * this.aClass105_Sub2_2.anInt4888 / local147;
				local440 = this.anInt260 + (this.anInt274 * local19 + this.anInt267 * local227 + this.anInt266 * local34 >> 15);
				local451 = arg3.anInt3029 + local440 * this.aClass105_Sub2_2.anInt4879 / local147;
			} else {
				local56 = this.anIntArrayArray3[arg0][arg1];
				local61 = this.anInt272 * local56;
				local78 = this.anInt261 + (this.anInt270 * local19 + local61 + this.anInt268 * local29 >> 15);
				if (local78 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local101 = this.anInt261 + (this.anInt270 * local24 + local61 + this.anInt268 * local29 >> 15);
				if (local101 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local124 = this.anInt261 + (this.anInt270 * local24 + local61 + this.anInt268 * local34 >> 15);
				if (local124 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				local147 = this.anInt261 + (this.anInt270 * local19 + local61 + this.anInt268 * local34 >> 15);
				if (local147 <= this.aClass105_Sub2_2.anInt4882) {
					return;
				}
				if (this.aClass105_Sub2_2.aBoolean392) {
					local163 = local78 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass105_Sub2_2.anInt4894;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt264 * local56;
				local227 = this.anInt267 * local56;
				local244 = this.anInt263 + (this.anInt273 * local19 + local222 + this.anInt271 * local29 >> 15);
				local255 = arg3.anInt3032 + local244 * this.aClass105_Sub2_2.anInt4888 / local78;
				local272 = this.anInt260 + (this.anInt274 * local19 + local227 + this.anInt266 * local29 >> 15);
				local283 = arg3.anInt3029 + local272 * this.aClass105_Sub2_2.anInt4879 / local78;
				local300 = this.anInt263 + (this.anInt273 * local24 + local222 + this.anInt271 * local29 >> 15);
				local311 = arg3.anInt3032 + local300 * this.aClass105_Sub2_2.anInt4888 / local101;
				local328 = this.anInt260 + (this.anInt274 * local24 + local227 + this.anInt266 * local29 >> 15);
				local339 = arg3.anInt3029 + local328 * this.aClass105_Sub2_2.anInt4879 / local101;
				local356 = this.anInt263 + (this.anInt273 * local24 + local222 + this.anInt271 * local34 >> 15);
				local367 = arg3.anInt3032 + local356 * this.aClass105_Sub2_2.anInt4888 / local124;
				local384 = this.anInt260 + (this.anInt274 * local24 + local227 + this.anInt266 * local34 >> 15);
				local395 = arg3.anInt3029 + local384 * this.aClass105_Sub2_2.anInt4879 / local124;
				local412 = this.anInt263 + (this.anInt273 * local19 + local222 + this.anInt271 * local34 >> 15);
				local423 = arg3.anInt3032 + local412 * this.aClass105_Sub2_2.anInt4888 / local147;
				local440 = this.anInt260 + (this.anInt274 * local19 + local227 + this.anInt266 * local34 >> 15);
				local451 = arg3.anInt3029 + local440 * this.aClass105_Sub2_2.anInt4879 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort90 != -1 && this.method249(this.aClass105_Sub2_2.anInterface2_4.method951(local6.aShort90).aByte47);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean234 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt3030 || local423 > arg3.anInt3030 || local311 > arg3.anInt3030;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt3031 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort90 >= 0) {
							arg3.method2593(local395, local451, local339, local367, local423, local311, this.aClass105_Sub2_2.anInt4867, local40, local42, local38, local6.anInt6713, local6.anInt6712, local6.anInt6715, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort90);
						} else {
							arg3.method2588(local395, local451, local339, local367, local423, local311, Static41.method873(local6.anInt6713, local40 << 24 | this.aClass105_Sub2_2.anInt4867), Static41.method873(local6.anInt6712, local42 << 24 | this.aClass105_Sub2_2.anInt4867), Static41.method873(local6.anInt6715, local38 << 24 | this.aClass105_Sub2_2.anInt4867));
						}
					} else if (local6.aShort90 >= 0) {
						arg3.method2587(local395, local451, local339, local367, local423, local311, local6.anInt6713, local6.anInt6712, local6.anInt6715, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort90);
					} else {
						arg3.method2588(local395, local451, local339, local367, local423, local311, local6.anInt6713, local6.anInt6712, local6.anInt6715);
					}
					arg3.anInt3031 = 0;
				} else {
					arg3.method2589(local395, local451, local339, local367, local423, local311, this.aClass105_Sub2_2.anInt4867);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean234 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt3030 || local311 > arg3.anInt3030 || local423 > arg3.anInt3030;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt3031 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort90 >= 0) {
							arg3.method2593(local283, local339, local451, local255, local311, local423, this.aClass105_Sub2_2.anInt4867, local36, local38, local42, local6.anInt6714, local6.anInt6715, local6.anInt6712, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort90);
						} else {
							arg3.method2588(local283, local339, local451, local255, local311, local423, Static41.method873(local6.anInt6714, local36 << 24 | this.aClass105_Sub2_2.anInt4867), Static41.method873(local6.anInt6715, local38 << 24 | this.aClass105_Sub2_2.anInt4867), Static41.method873(local6.anInt6712, local42 << 24 | this.aClass105_Sub2_2.anInt4867));
						}
					} else if (local6.aShort90 >= 0) {
						arg3.method2587(local283, local339, local451, local255, local311, local423, local6.anInt6714, local6.anInt6715, local6.anInt6712, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort90);
					} else {
						arg3.method2588(local283, local339, local451, local255, local311, local423, local6.anInt6714, local6.anInt6715, local6.anInt6712);
					}
					arg3.anInt3031 = 0;
					return;
				}
				arg3.method2589(local283, local339, local451, local255, local311, local423, this.aClass105_Sub2_2.anInt4867);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILclient!ri;)Lclient!ri;")
	@Override
	public Class1_Sub2_Sub5 method2693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub5 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(Lclient!ri;IIIIZ)V")
	@Override
	public void method2706(@OriginalArg(0) Class1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}
}
