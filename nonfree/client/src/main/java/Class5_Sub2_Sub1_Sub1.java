import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public abstract class Class5_Sub2_Sub1_Sub1 extends Class5_Sub2_Sub1 {

	@OriginalMember(owner = "client!b", name = "U", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!b", name = "fb", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!b", name = "bb", descriptor = "[[B")
	protected byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
	public int anInt773 = 0;

	@OriginalMember(owner = "client!b", name = "nb", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!b", name = "yb", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!b", name = "W", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!b", name = "rb", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!b", name = "X", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class5_Sub2_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray136 = arg1;
		this.anIntArray138 = arg2;
		this.anIntArray135 = arg3;
		this.anIntArray137 = arg4;
		this.method548(arg0);
		this.aByteArrayArray4 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray138[local32] < local28 && this.anIntArray137[local32] != 0) {
				local28 = this.anIntArray138[local32];
			}
			if (this.anIntArray138[local32] + this.anIntArray137[local32] > local30) {
				local30 = this.anIntArray138[local32] + this.anIntArray137[local32];
			}
		}
		this.anInt776 = this.anInt773 - local28;
		this.anInt770 = local30 - this.anInt773;
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		this.method548(arg0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;)I")
	public final int method544(@OriginalArg(0) Class61 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2675; local11++) {
			@Pc(19) int local19 = arg0.aByteArray38[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class61 local39 = arg0.method1730(local11, local5 + 1);
					local5 = -1;
					if (local39.method1736(Static7.aClass61_246)) {
						local19 = 60;
					} else {
						if (!local39.method1736(Static7.aClass61_234)) {
							if (local39.method1713(Static7.aClass61_244)) {
								try {
									@Pc(69) int local69 = local39.method1724(4).method1704();
									local9 += Static7.aClass5_Sub2_Sub1_Sub3Array13[local69].anInt2088;
									local7 = -1;
								} catch (@Pc(80) Exception local80) {
								}
							}
							continue;
						}
						local19 = 62;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray134[local19];
					if (this.aByteArray17 != null && local7 != -1) {
						local9 += this.aByteArray17[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(IIIIII)V")
	private void method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static46.anInt3188;
		@Pc(9) int local9 = Static46.anInt3188 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static46.anInt3189) {
			local20 = Static46.anInt3189 - arg2;
			arg4 -= local20;
			arg2 = Static46.anInt3189;
			local13 = local20 * arg3;
			local5 += local20 * Static46.anInt3188;
		}
		if (arg2 + arg4 > Static46.anInt3190) {
			arg4 -= arg2 + arg4 - Static46.anInt3190;
		}
		if (arg1 < Static46.anInt3186) {
			local20 = Static46.anInt3186 - arg1;
			arg3 -= local20;
			arg1 = Static46.anInt3186;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static46.anInt3185) {
			local20 = arg1 + arg3 - Static46.anInt3185;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static7.method559(Static46.anIntArray385, this.aByteArrayArray4[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(IIIIII)V")
	protected abstract void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([B)V")
	private void method548(@OriginalArg(0) byte[] arg0) {
		this.anIntArray134 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray134.length; local9++) {
				this.anIntArray134[local9] = arg0[local9] & 0xFF;
			}
			this.anInt773 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray134[local37] = arg0[local9++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local9++] & 0xFF;
		}
		for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
			local58[local76] = arg0[local9++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		@Pc(107) int local107;
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(105) byte local105 = 0;
			for (local107 = 0; local107 < local93[local95].length; local107++) {
				local105 += arg0[local9++];
				local93[local95][local107] = local105;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		@Pc(150) int local150;
		for (local107 = 0; local107 < 256; local107++) {
			local136[local107] = new byte[local55[local107]];
			@Pc(148) byte local148 = 0;
			for (local150 = 0; local150 < local136[local107].length; local150++) {
				local148 += arg0[local9++];
				local136[local107][local150] = local148;
			}
		}
		this.aByteArray17 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray17[(local182 << 8) + local150] = (byte) Static7.method549(local93, local136, local58, this.anIntArray134, local55, local182, local150);
					}
				}
			}
		}
		this.anInt773 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
	private void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static7.anInt777 = -1;
		Static7.anInt780 = -1;
		Static7.anInt771 = arg1;
		Static7.anInt772 = arg1;
		Static7.anInt781 = arg0;
		Static7.anInt779 = arg0;
		Static7.anInt769 = 256;
		Static7.anInt774 = 256;
		Static7.anInt778 = 0;
		Static7.anInt775 = 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public final void method551(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method550(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2675];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2675; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method565(arg0, arg1 - this.method544(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;I)I")
	public final int method552(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method571(arg0, new int[] { arg1 }, Static7.aClass61Array5);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method544(Static7.aClass61Array5[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;II)V")
	private void method553(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt773;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2675; local10++) {
			@Pc(18) int local18 = arg0.aByteArray38[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class61 local38 = arg0.method1730(local10, local6 + 1);
					local6 = -1;
					if (local38.method1736(Static7.aClass61_246)) {
						local18 = 60;
					} else {
						if (!local38.method1736(Static7.aClass61_234)) {
							if (local38.method1713(Static7.aClass61_244)) {
								try {
									local68 = local38.method1724(4).method1704();
									@Pc(72) Class5_Sub2_Sub1_Sub3 local72 = Static7.aClass5_Sub2_Sub1_Sub3Array13[local68];
									local72.method1354(arg1, local4 + this.anInt773 - local72.anInt2086);
									arg1 += local72.anInt2088;
									local8 = -1;
								} catch (@Pc(91) Exception local91) {
								}
							} else {
								this.method562(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray17 != null && local8 != -1) {
						arg1 += this.aByteArray17[(local8 << 8) + local18];
					}
					@Pc(121) int local121 = this.anIntArray135[local18];
					local68 = this.anIntArray137[local18];
					if (local18 == 32) {
						if (Static7.anInt778 > 0) {
							Static7.anInt775 += Static7.anInt778;
							arg1 += Static7.anInt775 >> 8;
							Static7.anInt775 &= 0xFF;
						}
					} else if (Static7.anInt774 == 256) {
						if (Static7.anInt772 != -1) {
							this.method546(local18, arg1 + this.anIntArray136[local18] + 1, local4 + this.anIntArray138[local18] + 1, local121, local68, Static7.anInt772);
						}
						this.method547(local18, arg1 + this.anIntArray136[local18], local4 + this.anIntArray138[local18], local121, local68, Static7.anInt779);
					} else {
						if (Static7.anInt772 != -1) {
							this.method569(local18, arg1 + this.anIntArray136[local18] + 1, local4 + this.anIntArray138[local18] + 1, local121, local68, Static7.anInt772, Static7.anInt774);
						}
						this.method545(local18, arg1 + this.anIntArray136[local18], local4 + this.anIntArray138[local18], local121, local68, Static7.anInt779, Static7.anInt774);
					}
					@Pc(243) int local243 = this.anIntArray134[local18];
					if (Static7.anInt777 != -1) {
						Static46.method2005(arg1, local4 + (int) ((double) this.anInt773 * 0.7D), local243, Static7.anInt777);
					}
					if (Static7.anInt780 != -1) {
						Static46.method2005(arg1, local4 + this.anInt773 + 1, local243, Static7.anInt780);
					}
					arg1 += local243;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;IIIILjava/util/Random;I)I")
	public final int method554(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method573(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt2675];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2675; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method565(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;IIII)V")
	public final void method555(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method550(arg3, arg4);
			this.method553(arg0, arg1 - this.method544(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;IIIIIIIIII)I")
	private int method556(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method573(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt773;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt776 + this.anInt770 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method571(arg0, local20, Static7.aClass61Array5);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt776;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt776 + (arg4 - this.anInt776 - this.anInt770 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt770 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt776 - this.anInt770 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt776 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method553(Static7.aClass61Array5[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method553(Static7.aClass61Array5[local118], arg1 + (arg3 - this.method544(Static7.aClass61Array5[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method553(Static7.aClass61Array5[local118], arg1 + arg3 - this.method544(Static7.aClass61Array5[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method553(Static7.aClass61Array5[local118], arg1, local57);
			} else {
				this.method572(Static7.aClass61Array5[local118], arg3);
				this.method553(Static7.aClass61Array5[local118], arg1, local57);
				Static7.anInt778 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Lclient!r;IIII)V")
	public final void method558(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method550(arg3, arg4);
			this.method553(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;IIIII)V")
	public final void method560(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method550(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2675];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2675; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method565(arg0, arg1 - this.method544(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;IIIIIIIII)I")
	public final int method561(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method556(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Lclient!r;)V")
	private void method562(@OriginalArg(0) Class61 arg0) {
		try {
			if (arg0.method1713(Static7.aClass61_238)) {
				Static7.anInt779 = arg0.method1724(4).method1712(16);
				return;
			}
			if (arg0.method1736(Static7.aClass61_241)) {
				Static7.anInt779 = Static7.anInt781;
				return;
			}
			if (arg0.method1713(Static7.aClass61_242)) {
				Static7.anInt777 = arg0.method1724(4).method1712(16);
				return;
			}
			if (arg0.method1736(Static7.aClass61_233)) {
				Static7.anInt777 = 8388608;
				return;
			}
			if (arg0.method1736(Static7.aClass61_236)) {
				Static7.anInt777 = -1;
				return;
			}
			if (arg0.method1713(Static7.aClass61_237)) {
				Static7.anInt780 = arg0.method1724(2).method1712(16);
				return;
			}
			if (arg0.method1736(Static7.aClass61_245)) {
				Static7.anInt780 = 0;
				return;
			}
			if (arg0.method1736(Static7.aClass61_240)) {
				Static7.anInt780 = -1;
				return;
			}
			if (arg0.method1713(Static7.aClass61_239)) {
				Static7.anInt772 = arg0.method1724(5).method1712(16);
				return;
			}
			if (arg0.method1736(Static7.aClass61_232)) {
				Static7.anInt772 = 0;
				return;
			}
			if (arg0.method1736(Static7.aClass61_235)) {
				Static7.anInt772 = Static7.anInt771;
				return;
			}
			if (arg0.method1736(Static7.aClass61_243)) {
				this.method573(Static7.anInt781, Static7.anInt771, Static7.anInt769);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)I")
	private int method564(@OriginalArg(0) int arg0) {
		return this.anIntArray134[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;II[I[I)V")
	private void method565(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt773;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2675; local12++) {
			@Pc(20) int local20 = arg0.aByteArray38[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class61 local40 = arg0.method1730(local12, local6 + 1);
					local6 = -1;
					if (local40.method1736(Static7.aClass61_246)) {
						local20 = 60;
					} else {
						if (!local40.method1736(Static7.aClass61_234)) {
							if (local40.method1713(Static7.aClass61_244)) {
								try {
									if (arg3 == null) {
										local69 = 0;
									} else {
										local69 = arg3[local10];
									}
									if (arg4 == null) {
										local78 = 0;
									} else {
										local78 = arg4[local10];
									}
									local10++;
									local89 = local40.method1724(4).method1704();
									@Pc(93) Class5_Sub2_Sub1_Sub3 local93 = Static7.aClass5_Sub2_Sub1_Sub3Array13[local89];
									local93.method1354(arg1 + local69, local4 + this.anInt773 - local93.anInt2086 + local78);
									arg1 += local93.anInt2088;
									local8 = -1;
								} catch (@Pc(116) Exception local116) {
								}
							} else {
								this.method562(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray17 != null && local8 != -1) {
						arg1 += this.aByteArray17[(local8 << 8) + local20];
					}
					@Pc(146) int local146 = this.anIntArray135[local20];
					local69 = this.anIntArray137[local20];
					if (arg3 == null) {
						local78 = 0;
					} else {
						local78 = arg3[local10];
					}
					if (arg4 == null) {
						local89 = 0;
					} else {
						local89 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static7.anInt778 > 0) {
							Static7.anInt775 += Static7.anInt778;
							arg1 += Static7.anInt775 >> 8;
							Static7.anInt775 &= 0xFF;
						}
					} else if (Static7.anInt774 == 256) {
						if (Static7.anInt772 != -1) {
							this.method546(local20, arg1 + this.anIntArray136[local20] + local78 + 1, local4 + this.anIntArray138[local20] + 1 + local89, local146, local69, Static7.anInt772);
						}
						this.method547(local20, arg1 + this.anIntArray136[local20] + local78, local4 + this.anIntArray138[local20] + local89, local146, local69, Static7.anInt779);
					} else {
						if (Static7.anInt772 != -1) {
							this.method569(local20, arg1 + this.anIntArray136[local20] + local78 + 1, local4 + this.anIntArray138[local20] + 1 + local89, local146, local69, Static7.anInt772, Static7.anInt774);
						}
						this.method545(local20, arg1 + this.anIntArray136[local20] + local78, local4 + this.anIntArray138[local20] + local89, local146, local69, Static7.anInt779, Static7.anInt774);
					}
					@Pc(303) int local303 = this.anIntArray134[local20];
					if (Static7.anInt777 != -1) {
						Static46.method2005(arg1, local4 + (int) ((double) this.anInt773 * 0.7D), local303, Static7.anInt777);
					}
					if (Static7.anInt780 != -1) {
						Static46.method2005(arg1, local4 + this.anInt773, local303, Static7.anInt780);
					}
					arg1 += local303;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Lclient!r;IIIII)V")
	public final void method566(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method550(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2675];
		@Pc(14) int[] local14 = new int[arg0.anInt2675];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2675; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method565(arg0, arg1 - this.method544(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Lclient!r;I)I")
	public final int method567(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1) {
		return this.method571(arg0, new int[] { arg1 }, Static7.aClass61Array5);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Lclient!r;IIII)V")
	public final void method568(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method550(arg3, arg4);
			this.method553(arg0, arg1 - this.method544(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IIIIIII)V")
	private void method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static46.anInt3188;
		@Pc(9) int local9 = Static46.anInt3188 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static46.anInt3189) {
			local20 = Static46.anInt3189 - arg2;
			arg4 -= local20;
			arg2 = Static46.anInt3189;
			local13 = local20 * arg3;
			local5 += local20 * Static46.anInt3188;
		}
		if (arg2 + arg4 > Static46.anInt3190) {
			arg4 -= arg2 + arg4 - Static46.anInt3190;
		}
		if (arg1 < Static46.anInt3186) {
			local20 = Static46.anInt3186 - arg1;
			arg3 -= local20;
			arg1 = Static46.anInt3186;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static46.anInt3185) {
			local20 = arg1 + arg3 - Static46.anInt3185;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static7.method563(Static46.anIntArray385, this.aByteArrayArray4[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;[I[Lclient!r;)I")
	private int method571(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class61[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class61 local11 = Static27.method1858(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1733();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1714(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class61 local55 = arg0.method1730(local29, local19 + 1);
					local19 = -1;
					local11.method1703(60);
					local11.method1721(local55);
					local11.method1703(62);
					if (local55.method1736(Static7.aClass61_243)) {
						arg2[local23++] = local11.method1730(local11.method1733(), local7);
						local7 = local11.method1733();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1736(Static7.aClass61_246)) {
						local5 += this.method564(60);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1736(Static7.aClass61_234)) {
						local5 += this.method564(62);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1713(Static7.aClass61_244)) {
						try {
							@Pc(173) int local173 = local55.method1724(4).method1704();
							local5 += Static7.aClass5_Sub2_Sub1_Sub3Array13[local173].anInt2088;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1703(local35);
						local5 += this.method564(local35);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1733();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1730(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1733();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1733() > local7) {
			arg2[local23++] = local11.method1730(local11.method1733(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Lclient!r;I)V")
	private void method572(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1733(); local5++) {
			@Pc(11) int local11 = arg0.method1714(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static7.anInt778 = (arg1 - this.method544(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	private void method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static7.anInt777 = -1;
		Static7.anInt780 = -1;
		Static7.anInt771 = arg1;
		Static7.anInt772 = arg1;
		Static7.anInt781 = arg0;
		Static7.anInt779 = arg0;
		Static7.anInt769 = arg2;
		Static7.anInt774 = arg2;
		Static7.anInt778 = 0;
		Static7.anInt775 = 0;
	}
}
