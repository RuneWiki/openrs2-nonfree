import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public abstract class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "[Lclient!lc;")
	private Class41[] aClass41Array5;

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!jb", name = "lb", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!jb", name = "nb", descriptor = "I")
	public int anInt2600 = 0;

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!jb", name = "kb", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
	private int anInt2598;

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
	private int anInt2599;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class1_Sub2_Sub11(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray154 = arg1;
		this.anIntArray156 = arg2;
		this.anIntArray152 = arg3;
		this.anIntArray151 = arg4;
		this.method2017(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray156[local25] < local21 && this.anIntArray151[local25] != 0) {
				local21 = this.anIntArray156[local25];
			}
			if (this.anIntArray156[local25] + this.anIntArray151[local25] > local23) {
				local23 = this.anIntArray156[local25] + this.anIntArray151[local25];
			}
		}
		this.anInt2598 = this.anInt2600 - local21;
		this.anInt2599 = local23 - this.anInt2600;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub11(@OriginalArg(0) byte[] arg0) {
		this.method2017(arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method2015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([B)V")
	private void method2017(@OriginalArg(0) byte[] arg0) {
		this.anIntArray153 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray153.length; local9++) {
				this.anIntArray153[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2600 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray153[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray22 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray22[(local182 << 8) + local150] = (byte) Static94.method2031(local93, local136, local58, this.anIntArray153, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2600 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	private void method2019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static94.anInt2607 = -1;
		Static94.anInt2609 = -1;
		Static94.anInt2602 = arg1;
		Static94.anInt2606 = arg1;
		Static94.anInt2601 = arg0;
		Static94.anInt2608 = arg0;
		Static94.anInt2610 = arg2;
		Static94.anInt2603 = arg2;
		Static94.anInt2605 = 0;
		Static94.anInt2604 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;I)V")
	private void method2020(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1399(); local5++) {
			@Pc(11) int local11 = arg0.method1408(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static94.anInt2605 = (arg1 - this.method2040(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;IIII)V")
	public final void method2021(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2035(arg3, arg4);
			this.method2025(arg0, arg1 - this.method2040(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([Lclient!lc;[I)V")
	public final void method2022(@OriginalArg(0) Class41[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass41Array5 = arg0;
		this.anIntArray155 = arg1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;IIIIIIIII)I")
	public final int method2023(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method2027(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lclient!ia;I)I")
	public final int method2024(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method2026(arg0, new int[] { arg1 }, Static94.aClass51Array17);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method2040(Static94.aClass51Array17[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;II)V")
	private void method2025(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2600;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1858; local10++) {
			@Pc(18) int local18 = arg0.aByteArray17[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class51 local38 = arg0.method1433(local6 + 1, local10);
					local6 = -1;
					if (local38.method1426(Static94.aClass51_915)) {
						local18 = 60;
					} else if (local38.method1426(Static94.aClass51_908)) {
						local18 = 62;
					} else if (local38.method1426(Static94.aClass51_920)) {
						local18 = 160;
					} else if (local38.method1426(Static94.aClass51_906)) {
						local18 = 173;
					} else if (local38.method1426(Static94.aClass51_910)) {
						local18 = 215;
					} else if (local38.method1426(Static94.aClass51_912)) {
						local18 = 128;
					} else if (local38.method1426(Static94.aClass51_911)) {
						local18 = 169;
					} else {
						if (!local38.method1426(Static94.aClass51_914)) {
							if (local38.method1393(Static94.aClass51_913)) {
								try {
									local116 = local38.method1394(4).method1428();
									@Pc(121) Class41 local121 = this.aClass41Array5[local116];
									@Pc(132) int local132 = this.anIntArray155 == null ? local121.anInt1301 : this.anIntArray155[local116];
									if (Static94.anInt2603 == 256) {
										local121.method969(arg1, local4 + this.anInt2600 - local132);
									} else {
										local121.method966(arg1, local4 + this.anInt2600 - local132, Static94.anInt2603);
									}
									arg1 += local121.anInt1296;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method2033(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray22 != null && local8 != -1) {
						arg1 += this.aByteArray22[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray152[local18];
					local116 = this.anIntArray151[local18];
					if (local18 == 32) {
						if (Static94.anInt2605 > 0) {
							Static94.anInt2604 += Static94.anInt2605;
							arg1 += Static94.anInt2604 >> 8;
							Static94.anInt2604 &= 0xFF;
						}
					} else if (Static94.anInt2603 == 256) {
						if (Static94.anInt2606 != -1) {
							this.method2034(local18, arg1 + this.anIntArray154[local18] + 1, local4 + this.anIntArray156[local18] + 1, local194, local116, Static94.anInt2606);
						}
						this.method2016(local18, arg1 + this.anIntArray154[local18], local4 + this.anIntArray156[local18], local194, local116, Static94.anInt2608);
					} else {
						if (Static94.anInt2606 != -1) {
							this.method2015(local18, arg1 + this.anIntArray154[local18] + 1, local4 + this.anIntArray156[local18] + 1, local194, local116, Static94.anInt2606, Static94.anInt2603);
						}
						this.method2037(local18, arg1 + this.anIntArray154[local18], local4 + this.anIntArray156[local18], local194, local116, Static94.anInt2608, Static94.anInt2603);
					}
					@Pc(316) int local316 = this.anIntArray153[local18];
					if (Static94.anInt2607 != -1) {
						Static96.method1622(arg1, local4 + (int) ((double) this.anInt2600 * 0.7D), local316, Static94.anInt2607);
					}
					if (Static94.anInt2609 != -1) {
						Static96.method1622(arg1, local4 + this.anInt2600 + 1, local316, Static94.anInt2609);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;[I[Lclient!ia;)I")
	private int method2026(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class51[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static94.aClass51_924.method1435();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1399();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1408(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class51 local55 = arg0.method1433(local19 + 1, local29);
					local19 = -1;
					Static94.aClass51_924.method1423(60);
					Static94.aClass51_924.method1404(local55);
					Static94.aClass51_924.method1423(62);
					if (local55.method1426(Static94.aClass51_902)) {
						if (arg2[local23] == null) {
							arg2[local23] = Static94.aClass51_924.method1433(local11, Static94.aClass51_924.method1399());
						} else {
							arg2[local23].method1435();
							arg2[local23] = arg2[local23].method1413(local11, Static94.aClass51_924.method1399(), Static94.aClass51_924);
						}
						local23++;
						local11 = Static94.aClass51_924.method1399();
						local9 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1426(Static94.aClass51_915)) {
						local9 += this.method2028(60);
						if (this.aByteArray22 != null && local21 != -1) {
							local9 += this.aByteArray22[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1426(Static94.aClass51_908)) {
						local9 += this.method2028(62);
						if (this.aByteArray22 != null && local21 != -1) {
							local9 += this.aByteArray22[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1426(Static94.aClass51_920)) {
						local9 += this.method2028(160);
						if (this.aByteArray22 != null && local21 != -1) {
							local9 += this.aByteArray22[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method1426(Static94.aClass51_906)) {
						local9 += this.method2028(173);
						if (this.aByteArray22 != null && local21 != -1) {
							local9 += this.aByteArray22[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method1426(Static94.aClass51_910)) {
						local9 += this.method2028(215);
						if (this.aByteArray22 != null && local21 != -1) {
							local9 += this.aByteArray22[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method1426(Static94.aClass51_912)) {
						local9 += this.method2028(128);
						if (this.aByteArray22 != null && local21 != -1) {
							local9 += this.aByteArray22[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method1426(Static94.aClass51_911)) {
						local9 += this.method2028(169);
						if (this.aByteArray22 != null && local21 != -1) {
							local9 += this.aByteArray22[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method1426(Static94.aClass51_914)) {
						local9 += this.method2028(174);
						if (this.aByteArray22 != null && local21 != -1) {
							local9 += this.aByteArray22[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method1393(Static94.aClass51_913)) {
						try {
							@Pc(383) int local383 = local55.method1394(4).method1428();
							local9 += this.aClass41Array5[local383].anInt1296;
							local21 = -1;
						} catch (@Pc(395) Exception local395) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						Static94.aClass51_924.method1423(local35);
						local9 += this.method2028(local35);
						if (this.aByteArray22 != null && local21 != -1) {
							local9 += this.aByteArray22[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = Static94.aClass51_924.method1399();
						local15 = local9;
						local17 = 1;
					}
					if (arg1 != null && local9 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						if (arg2[local23] == null) {
							arg2[local23] = Static94.aClass51_924.method1433(local11, local13 - local17);
						} else {
							arg2[local23].method1435();
							arg2[local23] = arg2[local23].method1413(local11, local13 - local17, Static94.aClass51_924);
						}
						local23++;
						local11 = local13;
						local13 = -1;
						local9 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = Static94.aClass51_924.method1399();
						local15 = local9;
						local17 = 0;
					}
				}
			}
		}
		if (Static94.aClass51_924.method1399() > local11) {
			if (arg2[local23] == null) {
				arg2[local23] = Static94.aClass51_924.method1433(local11, Static94.aClass51_924.method1399());
			} else {
				arg2[local23].method1435();
				arg2[local23] = arg2[local23].method1413(local11, Static94.aClass51_924.method1399(), Static94.aClass51_924);
			}
			local23++;
		}
		return local23;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;IIIIIIIIII)I")
	private int method2027(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method2019(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt2600;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt2598 + this.anInt2599 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method2026(arg0, local20, Static94.aClass51Array17);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt2598;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt2598 + (arg4 - this.anInt2598 - this.anInt2599 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt2599 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt2598 - this.anInt2599 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt2598 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method2025(Static94.aClass51Array17[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method2025(Static94.aClass51Array17[local118], arg1 + (arg3 - this.method2040(Static94.aClass51Array17[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method2025(Static94.aClass51Array17[local118], arg1 + arg3 - this.method2040(Static94.aClass51Array17[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method2025(Static94.aClass51Array17[local118], arg1, local57);
			} else {
				this.method2020(Static94.aClass51Array17[local118], arg3);
				this.method2025(Static94.aClass51Array17[local118], arg1, local57);
				Static94.anInt2605 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)I")
	private int method2028(@OriginalArg(0) int arg0) {
		return this.anIntArray153[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Lclient!ia;I)I")
	public final int method2029(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		return this.method2026(arg0, new int[] { arg1 }, Static94.aClass51Array17);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;IIIIII)V")
	public final void method2030(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method2035(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1858];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1858; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method2036(arg0, arg1 - this.method2040(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;IIIII)V")
	public final void method2032(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2035(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1858];
		@Pc(14) int[] local14 = new int[arg0.anInt1858];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1858; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2036(arg0, arg1 - this.method2040(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lclient!ia;)V")
	private void method2033(@OriginalArg(0) Class51 arg0) {
		try {
			if (arg0.method1393(Static94.aClass51_916)) {
				Static94.anInt2608 = arg0.method1394(4).method1392(16);
				return;
			}
			if (arg0.method1426(Static94.aClass51_919)) {
				Static94.anInt2608 = Static94.anInt2601;
				return;
			}
			if (arg0.method1393(Static94.aClass51_903)) {
				Static94.anInt2603 = arg0.method1394(6).method1428();
				return;
			}
			if (arg0.method1426(Static94.aClass51_904)) {
				Static94.anInt2603 = Static94.anInt2610;
				return;
			}
			if (arg0.method1393(Static94.aClass51_909)) {
				Static94.anInt2607 = arg0.method1394(4).method1392(16);
				return;
			}
			if (arg0.method1426(Static94.aClass51_907)) {
				Static94.anInt2607 = 8388608;
				return;
			}
			if (arg0.method1426(Static94.aClass51_918)) {
				Static94.anInt2607 = -1;
				return;
			}
			if (arg0.method1393(Static94.aClass51_922)) {
				Static94.anInt2609 = arg0.method1394(2).method1392(16);
				return;
			}
			if (arg0.method1426(Static94.aClass51_917)) {
				Static94.anInt2609 = 0;
				return;
			}
			if (arg0.method1426(Static94.aClass51_901)) {
				Static94.anInt2609 = -1;
				return;
			}
			if (arg0.method1393(Static94.aClass51_905)) {
				Static94.anInt2606 = arg0.method1394(5).method1392(16);
				return;
			}
			if (arg0.method1426(Static94.aClass51_921)) {
				Static94.anInt2606 = 0;
				return;
			}
			if (arg0.method1426(Static94.aClass51_923)) {
				Static94.anInt2606 = Static94.anInt2602;
				return;
			}
			if (arg0.method1426(Static94.aClass51_902)) {
				this.method2019(Static94.anInt2601, Static94.anInt2602, Static94.anInt2610);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method2034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)V")
	private void method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static94.anInt2607 = -1;
		Static94.anInt2609 = -1;
		Static94.anInt2602 = arg1;
		Static94.anInt2606 = arg1;
		Static94.anInt2601 = arg0;
		Static94.anInt2608 = arg0;
		Static94.anInt2610 = 256;
		Static94.anInt2603 = 256;
		Static94.anInt2605 = 0;
		Static94.anInt2604 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;II[I[I)V")
	private void method2036(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2600;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1858; local12++) {
			@Pc(20) int local20 = arg0.aByteArray17[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class51 local40 = arg0.method1433(local6 + 1, local12);
					local6 = -1;
					if (local40.method1426(Static94.aClass51_915)) {
						local20 = 60;
					} else if (local40.method1426(Static94.aClass51_908)) {
						local20 = 62;
					} else if (local40.method1426(Static94.aClass51_920)) {
						local20 = 160;
					} else if (local40.method1426(Static94.aClass51_906)) {
						local20 = 173;
					} else if (local40.method1426(Static94.aClass51_910)) {
						local20 = 215;
					} else if (local40.method1426(Static94.aClass51_912)) {
						local20 = 128;
					} else if (local40.method1426(Static94.aClass51_911)) {
						local20 = 169;
					} else {
						if (!local40.method1426(Static94.aClass51_914)) {
							if (local40.method1393(Static94.aClass51_913)) {
								try {
									if (arg3 == null) {
										local117 = 0;
									} else {
										local117 = arg3[local10];
									}
									if (arg4 == null) {
										local126 = 0;
									} else {
										local126 = arg4[local10];
									}
									local10++;
									local137 = local40.method1394(4).method1428();
									@Pc(142) Class41 local142 = this.aClass41Array5[local137];
									@Pc(153) int local153 = this.anIntArray155 == null ? local142.anInt1301 : this.anIntArray155[local137];
									if (Static94.anInt2603 == 256) {
										local142.method969(arg1 + local117, local4 + this.anInt2600 - local153 + local126);
									} else {
										local142.method966(arg1 + local117, local4 + this.anInt2600 - local153 + local126, Static94.anInt2603);
									}
									arg1 += local142.anInt1296;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method2033(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray22 != null && local8 != -1) {
						arg1 += this.aByteArray22[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray152[local20];
					local117 = this.anIntArray151[local20];
					if (arg3 == null) {
						local126 = 0;
					} else {
						local126 = arg3[local10];
					}
					if (arg4 == null) {
						local137 = 0;
					} else {
						local137 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static94.anInt2605 > 0) {
							Static94.anInt2604 += Static94.anInt2605;
							arg1 += Static94.anInt2604 >> 8;
							Static94.anInt2604 &= 0xFF;
						}
					} else if (Static94.anInt2603 == 256) {
						if (Static94.anInt2606 != -1) {
							this.method2034(local20, arg1 + this.anIntArray154[local20] + local126 + 1, local4 + this.anIntArray156[local20] + 1 + local137, local223, local117, Static94.anInt2606);
						}
						this.method2016(local20, arg1 + this.anIntArray154[local20] + local126, local4 + this.anIntArray156[local20] + local137, local223, local117, Static94.anInt2608);
					} else {
						if (Static94.anInt2606 != -1) {
							this.method2015(local20, arg1 + this.anIntArray154[local20] + local126 + 1, local4 + this.anIntArray156[local20] + 1 + local137, local223, local117, Static94.anInt2606, Static94.anInt2603);
						}
						this.method2037(local20, arg1 + this.anIntArray154[local20] + local126, local4 + this.anIntArray156[local20] + local137, local223, local117, Static94.anInt2608, Static94.anInt2603);
					}
					@Pc(380) int local380 = this.anIntArray153[local20];
					if (Static94.anInt2607 != -1) {
						Static96.method1622(arg1, local4 + (int) ((double) this.anInt2600 * 0.7D), local380, Static94.anInt2607);
					}
					if (Static94.anInt2609 != -1) {
						Static96.method1622(arg1, local4 + this.anInt2600, local380, Static94.anInt2609);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lclient!ia;IIII)V")
	public final void method2038(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2035(arg3, arg4);
			this.method2025(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Lclient!ia;)I")
	public final int method2040(@OriginalArg(0) Class51 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1858; local11++) {
			@Pc(19) int local19 = arg0.aByteArray17[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class51 local39 = arg0.method1433(local5 + 1, local11);
					local5 = -1;
					if (local39.method1426(Static94.aClass51_915)) {
						local19 = 60;
					} else if (local39.method1426(Static94.aClass51_908)) {
						local19 = 62;
					} else if (local39.method1426(Static94.aClass51_920)) {
						local19 = 160;
					} else if (local39.method1426(Static94.aClass51_906)) {
						local19 = 173;
					} else if (local39.method1426(Static94.aClass51_910)) {
						local19 = 215;
					} else if (local39.method1426(Static94.aClass51_912)) {
						local19 = 128;
					} else if (local39.method1426(Static94.aClass51_911)) {
						local19 = 169;
					} else {
						if (!local39.method1426(Static94.aClass51_914)) {
							if (local39.method1393(Static94.aClass51_913)) {
								try {
									@Pc(117) int local117 = local39.method1394(4).method1428();
									local9 += this.aClass41Array5[local117].anInt1296;
									local7 = -1;
								} catch (@Pc(129) Exception local129) {
								}
							}
							continue;
						}
						local19 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray153[local19];
					if (this.aByteArray22 != null && local7 != -1) {
						local9 += this.aByteArray22[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;IIIILjava/util/Random;I)I")
	public final int method2041(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method2019(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt1858];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1858; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method2036(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Lclient!ia;IIII)V")
	public final void method2042(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2035(arg3, arg4);
			this.method2025(arg0, arg1 - this.method2040(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lclient!ia;IIIII)V")
	public final void method2043(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2035(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1858];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1858; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2036(arg0, arg1 - this.method2040(arg0) / 2, arg2, null, local10);
	}
}
