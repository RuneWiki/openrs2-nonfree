import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class4_Sub4_Sub3_Sub4 extends Class4_Sub4_Sub3 {

	@OriginalMember(owner = "client!qf", name = "vb", descriptor = "I")
	public int anInt2387 = 0;

	@OriginalMember(owner = "client!qf", name = "qb", descriptor = "[[B")
	private byte[][] aByteArrayArray6 = new byte[256][];

	@OriginalMember(owner = "client!qf", name = "eb", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!qf", name = "mb", descriptor = "[I")
	private final int[] anIntArray239;

	@OriginalMember(owner = "client!qf", name = "ib", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
	private int anInt2384;

	@OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
	private int anInt2382;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class4_Sub4_Sub3_Sub4(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray237 = arg0;
		this.anIntArray239 = arg1;
		this.anIntArray238 = arg2;
		@Pc(19) byte local19 = 0;
		for (@Pc(21) int local21 = 1; local21 < arg3.length; local21++) {
			if (arg3[local21] == 1) {
				local19 = (byte) local21;
			}
		}
		this.aByteArrayArray6 = arg4;
		@Pc(40) int local40 = Integer.MAX_VALUE;
		@Pc(42) int local42 = Integer.MIN_VALUE;
		for (@Pc(44) int local44 = 0; local44 < 256; local44++) {
			if (this.anIntArray237[local44] < local40 && this.anIntArray238[local44] != 0) {
				local40 = this.anIntArray237[local44];
			}
			if (this.anIntArray237[local44] + this.anIntArray238[local44] > local42) {
				local42 = this.anIntArray237[local44] + this.anIntArray238[local44];
			}
			@Pc(87) byte[] local87 = this.aByteArrayArray6[local44];
			@Pc(90) int local90 = local87.length;
			for (@Pc(92) int local92 = 0; local92 < local90; local92++) {
				local87[local92] = (byte) (local87[local92] == local19 ? 0 : 1);
			}
		}
		this.anInt2387 = this.anIntArray237[32] + this.anIntArray238[32];
		this.anInt2384 = this.anInt2387 - local40;
		this.anInt2382 = local42 - this.anInt2387;
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
	public Class4_Sub4_Sub3_Sub4(@OriginalArg(0) byte[] arg0) {
		this.anIntArray239 = new int[arg0.length];
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray239.length; local15++) {
			this.anIntArray239[local15] = arg0[local15] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)V")
	private void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static97.anInt2380 = -1;
		Static97.anInt2381 = -1;
		Static97.anInt2385 = arg1;
		Static97.anInt2386 = arg1;
		Static97.anInt2388 = arg0;
		Static97.anInt2389 = arg0;
		Static97.anInt2383 = 256;
		Static97.anInt2378 = 0;
		Static97.anInt2379 = 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qc;I)I")
	public int method1727(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1746(arg0, new int[] { arg1 }, Static97.aClass60Array22);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1743(Static97.aClass60Array22[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qc;II[I[I)V")
	private void method1728(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2387;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2310; local10++) {
			@Pc(18) int local18 = arg0.aByteArray89[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(67) int local67;
				@Pc(76) int local76;
				@Pc(87) int local87;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class60 local38 = arg0.method1657(local10, local6 + 1);
					local6 = -1;
					if (local38.method1660(Static97.aClass60_967)) {
						local18 = 60;
					} else {
						if (!local38.method1660(Static97.aClass60_964)) {
							if (local38.method1646(Static97.aClass60_969)) {
								try {
									if (arg3 == null) {
										local67 = 0;
									} else {
										local67 = arg3[local8];
									}
									if (arg4 == null) {
										local76 = 0;
									} else {
										local76 = arg4[local8];
									}
									local8++;
									local87 = local38.method1662(4).method1639();
									@Pc(91) Class4_Sub4_Sub3_Sub1 local91 = Static97.aClass4_Sub4_Sub3_Sub1Array8[local87];
									local91.method431(arg1 + local67, local4 + this.anInt2387 - local91.anInt638 + local76);
									arg1 += local91.anInt636;
								} catch (@Pc(112) Exception local112) {
								}
							} else {
								this.method1741(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(125) int local125 = this.anIntArray239[local18];
					local67 = this.anIntArray238[local18];
					if (arg3 == null) {
						local76 = 0;
					} else {
						local76 = arg3[local8];
					}
					if (arg4 == null) {
						local87 = 0;
					} else {
						local87 = arg4[local8];
					}
					local8++;
					if (local18 == 32) {
						if (Static97.anInt2378 > 0) {
							Static97.anInt2379 += Static97.anInt2378;
							arg1 += Static97.anInt2379 >> 8;
							Static97.anInt2379 &= 0xFF;
						}
					} else if (Static97.anInt2383 == 256) {
						if (Static97.anInt2386 != -1) {
							Static97.method1737(this.aByteArrayArray6[local18], arg1 + local76 + 1, local4 + this.anIntArray237[local18] + 1 + local87, local125, local67, Static97.anInt2386);
						}
						Static97.method1737(this.aByteArrayArray6[local18], arg1 + local76, local4 + this.anIntArray237[local18] + local87, local125, local67, Static97.anInt2389);
					} else {
						if (Static97.anInt2386 != -1) {
							Static97.method1724(this.aByteArrayArray6[local18], arg1 + local76 + 1, local4 + this.anIntArray237[local18] + 1 + local87, local125, local67, Static97.anInt2386, Static97.anInt2383);
						}
						Static97.method1724(this.aByteArrayArray6[local18], arg1 + local76, local4 + this.anIntArray237[local18] + local87, local125, local67, Static97.anInt2389, Static97.anInt2383);
					}
					if (Static97.anInt2380 != -1) {
						Static80.method1720(arg1, local4 + (int) ((double) this.anInt2387 * 0.7D), local125, Static97.anInt2380);
					}
					if (Static97.anInt2381 != -1) {
						Static80.method1720(arg1, local4 + this.anInt2387, local125, Static97.anInt2381);
					}
					arg1 += local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qc;IIII)V")
	public void method1729(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1725(arg3, arg4);
			this.method1734(arg0, arg1 - this.method1743(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qc;IIIIIIIII)V")
	public void method1730(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		this.method1725(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt2387;
		}
		@Pc(18) int[] local18 = new int[] { arg3 };
		if (arg4 < this.anInt2384 + this.anInt2382 + arg9 && arg4 < arg9 + arg9) {
			local18 = null;
		}
		@Pc(40) int local40 = this.method1746(arg0, local18, Static97.aClass60Array22);
		if (arg8 == 3 && local40 == 1) {
			arg8 = 1;
		}
		@Pc(55) int local55;
		@Pc(116) int local116;
		if (arg8 == 0) {
			local55 = arg2 + this.anInt2384;
		} else if (arg8 == 1) {
			local55 = arg2 + this.anInt2384 + (arg4 - this.anInt2384 - this.anInt2382 - (local40 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local55 = arg2 + arg4 - this.anInt2382 - (local40 - 1) * arg9;
		} else {
			local116 = (arg4 - this.anInt2384 - this.anInt2382 - (local40 - 1) * arg9) / (local40 + 1);
			if (local116 < 0) {
				local116 = 0;
			}
			local55 = arg2 + this.anInt2384 + local116;
			arg9 += local116;
		}
		for (local116 = 0; local116 < local40; local116++) {
			if (arg7 == 0) {
				this.method1734(Static97.aClass60Array22[local116], arg1, local55);
			} else if (arg7 == 1) {
				this.method1734(Static97.aClass60Array22[local116], arg1 + (arg3 - this.method1743(Static97.aClass60Array22[local116])) / 2, local55);
			} else if (arg7 == 2) {
				this.method1734(Static97.aClass60Array22[local116], arg1 + arg3 - this.method1743(Static97.aClass60Array22[local116]), local55);
			} else if (local116 == local40 - 1) {
				this.method1734(Static97.aClass60Array22[local116], arg1, local55);
			} else {
				this.method1742(Static97.aClass60Array22[local116], arg3);
				this.method1734(Static97.aClass60Array22[local116], arg1, local55);
				Static97.anInt2378 = 0;
			}
			local55 += arg9;
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!qc;IIII)V")
	public void method1732(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1725(arg3, arg4);
			this.method1734(arg0, arg1 - this.method1743(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qc;IIIIII)V")
	public void method1733(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1725(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2310];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2310; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1728(arg0, arg1 - this.method1743(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qc;II)V")
	private void method1734(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2387;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < arg0.anInt2310; local8++) {
			@Pc(16) int local16 = arg0.aByteArray89[local8] & 0xFF;
			if (local16 == 60) {
				local6 = local8;
			} else {
				@Pc(66) int local66;
				if (local16 == 62 && local6 != -1) {
					@Pc(36) Class60 local36 = arg0.method1657(local8, local6 + 1);
					local6 = -1;
					if (local36.method1660(Static97.aClass60_967)) {
						local16 = 60;
					} else {
						if (!local36.method1660(Static97.aClass60_964)) {
							if (local36.method1646(Static97.aClass60_969)) {
								try {
									local66 = local36.method1662(4).method1639();
									@Pc(70) Class4_Sub4_Sub3_Sub1 local70 = Static97.aClass4_Sub4_Sub3_Sub1Array8[local66];
									local70.method431(arg1, local4 + this.anInt2387 - local70.anInt638);
									arg1 += local70.anInt636;
								} catch (@Pc(87) Exception local87) {
								}
							} else {
								this.method1741(local36);
							}
							continue;
						}
						local16 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(100) int local100 = this.anIntArray239[local16];
					local66 = this.anIntArray238[local16];
					if (local16 == 32) {
						if (Static97.anInt2378 > 0) {
							Static97.anInt2379 += Static97.anInt2378;
							arg1 += Static97.anInt2379 >> 8;
							Static97.anInt2379 &= 0xFF;
						}
					} else if (Static97.anInt2383 == 256) {
						if (Static97.anInt2386 != -1) {
							Static97.method1737(this.aByteArrayArray6[local16], arg1 + 1, local4 + this.anIntArray237[local16] + 1, local100, local66, Static97.anInt2386);
						}
						Static97.method1737(this.aByteArrayArray6[local16], arg1, local4 + this.anIntArray237[local16], local100, local66, Static97.anInt2389);
					} else {
						if (Static97.anInt2386 != -1) {
							Static97.method1724(this.aByteArrayArray6[local16], arg1 + 1, local4 + this.anIntArray237[local16] + 1, local100, local66, Static97.anInt2386, Static97.anInt2383);
						}
						Static97.method1724(this.aByteArrayArray6[local16], arg1, local4 + this.anIntArray237[local16], local100, local66, Static97.anInt2389, Static97.anInt2383);
					}
					if (Static97.anInt2380 != -1) {
						Static80.method1720(arg1, local4 + (int) ((double) this.anInt2387 * 0.7D), local100, Static97.anInt2380);
					}
					if (Static97.anInt2381 != -1) {
						Static80.method1720(arg1, local4 + this.anInt2387 + 1, local100, Static97.anInt2381);
					}
					arg1 += local100;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qc;IIIII)V")
	public void method1736(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1725(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2310];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2310; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1728(arg0, arg1 - this.method1743(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!qc;IIIII)V")
	public void method1738(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.method1725(16777215, 0);
		Static97.aRandom1.setSeed((long) arg3);
		Static97.anInt2383 = (Static97.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt2310];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2310; local25++) {
			local21[local25] = local23;
			if ((Static97.aRandom1.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1728(arg0, arg1, arg2, local21, null);
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Lclient!qc;IIIII)V")
	public void method1739(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1725(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2310];
		@Pc(14) int[] local14 = new int[arg0.anInt2310];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2310; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1728(arg0, arg1 - this.method1743(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!qc;I)I")
	public int method1740(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		return this.method1746(arg0, new int[] { arg1 }, Static97.aClass60Array22);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qc;)V")
	private void method1741(@OriginalArg(0) Class60 arg0) {
		try {
			if (arg0.method1646(Static97.aClass60_966)) {
				Static97.anInt2389 = arg0.method1662(4).method1654(16);
				return;
			}
			if (arg0.method1660(Static97.aClass60_974)) {
				Static97.anInt2389 = Static97.anInt2388;
				return;
			}
			if (arg0.method1646(Static97.aClass60_973)) {
				Static97.anInt2380 = arg0.method1662(4).method1654(16);
				return;
			}
			if (arg0.method1660(Static97.aClass60_962)) {
				Static97.anInt2380 = 8388608;
				return;
			}
			if (arg0.method1660(Static97.aClass60_970)) {
				Static97.anInt2380 = -1;
				return;
			}
			if (!arg0.method1660(Static97.aClass60_963) && !arg0.method1660(Static97.aClass60_965) && !arg0.method1660(Static97.aClass60_976) && !arg0.method1660(Static97.aClass60_961)) {
				if (arg0.method1646(Static97.aClass60_975)) {
					Static97.anInt2381 = arg0.method1662(2).method1654(16);
					return;
				}
				if (arg0.method1660(Static97.aClass60_972)) {
					Static97.anInt2381 = 0;
					return;
				}
				if (arg0.method1660(Static97.aClass60_971)) {
					Static97.anInt2381 = -1;
					return;
				}
				if (arg0.method1646(Static97.aClass60_959)) {
					Static97.anInt2386 = arg0.method1662(5).method1654(16);
					return;
				}
				if (arg0.method1660(Static97.aClass60_958)) {
					Static97.anInt2386 = 0;
					return;
				}
				if (arg0.method1660(Static97.aClass60_960)) {
					Static97.anInt2386 = Static97.anInt2385;
					return;
				}
				if (arg0.method1660(Static97.aClass60_968)) {
					this.method1725(Static97.anInt2388, Static97.anInt2385);
					return;
				}
			}
		} catch (@Pc(142) Exception local142) {
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Lclient!qc;I)V")
	private void method1742(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1644(); local5++) {
			@Pc(11) int local11 = arg0.method1634(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static97.anInt2378 = (arg1 - this.method1743(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!qc;)I")
	public int method1743(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt2310; local9++) {
			@Pc(17) int local17 = arg0.aByteArray89[local9] & 0xFF;
			if (local17 == 60) {
				local5 = local9;
			} else if (local17 == 62 && local5 != -1) {
				@Pc(37) Class60 local37 = arg0.method1657(local9, local5 + 1);
				local5 = -1;
				if (local37.method1660(Static97.aClass60_967)) {
					local7 += this.anIntArray239[60];
				} else if (local37.method1660(Static97.aClass60_964)) {
					local7 += this.anIntArray239[62];
				} else if (local37.method1646(Static97.aClass60_969)) {
					try {
						@Pc(77) int local77 = local37.method1662(4).method1639();
						local7 += Static97.aClass4_Sub4_Sub3_Sub1Array8[local77].anInt636;
					} catch (@Pc(86) Exception local86) {
					}
				}
			} else if (local5 == -1) {
				local7 += this.anIntArray239[local17];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I")
	private int method1744(@OriginalArg(0) int arg0) {
		return this.anIntArray239[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Lclient!qc;IIII)V")
	public void method1745(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1725(arg3, arg4);
			this.method1734(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qc;[I[Lclient!qc;)I")
	private int method1746(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class60[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class60 local11 = Static33.method613(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method1644();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method1634(local27);
			if (local33 == 60) {
				local19 = local27;
			} else {
				if (local33 == 62 && local19 != -1) {
					@Pc(53) Class60 local53 = arg0.method1657(local27, local19 + 1);
					local19 = -1;
					local11.method1658(60);
					local11.method1659(local53);
					local11.method1658(62);
					if (local53.method1660(Static97.aClass60_968)) {
						arg2[local21++] = local11.method1657(local11.method1644(), local7);
						local7 = local11.method1644();
						local5 = 0;
						local13 = -1;
					} else if (local53.method1660(Static97.aClass60_967)) {
						local5 += this.method1744(60);
					} else if (local53.method1660(Static97.aClass60_964)) {
						local5 += this.method1744(62);
					} else if (local53.method1646(Static97.aClass60_969)) {
						try {
							@Pc(131) int local131 = local53.method1662(4).method1639();
							local5 += Static97.aClass4_Sub4_Sub3_Sub1Array8[local131].anInt636;
						} catch (@Pc(140) Exception local140) {
						}
					}
					local33 = -1;
				}
				if (local19 == -1) {
					if (local33 != -1) {
						local11.method1658(local33);
						local5 += this.method1744(local33);
					}
					if (local33 == 32) {
						local13 = local11.method1644();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local21 < arg1.length ? local21 : arg1.length - 1] && local13 >= 0) {
						arg2[local21++] = local11.method1657(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
					}
					if (local33 == 45) {
						local13 = local11.method1644();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1644() > local7) {
			arg2[local21++] = local11.method1657(local11.method1644(), local7);
		}
		return local21;
	}
}
