import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class4_Sub2_Sub3_Sub3 extends Class4_Sub2_Sub3 {

	@OriginalMember(owner = "client!mf", name = "Cb", descriptor = "[[B")
	private byte[][] aByteArrayArray7 = new byte[256][];

	@OriginalMember(owner = "client!mf", name = "zb", descriptor = "I")
	public int anInt1833 = 0;

	@OriginalMember(owner = "client!mf", name = "cb", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!mf", name = "pb", descriptor = "[I")
	private final int[] anIntArray202;

	@OriginalMember(owner = "client!mf", name = "Hb", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!mf", name = "sb", descriptor = "I")
	private int anInt1829;

	@OriginalMember(owner = "client!mf", name = "Eb", descriptor = "I")
	private int anInt1835;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class4_Sub2_Sub3_Sub3(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray201 = arg0;
		this.anIntArray202 = arg1;
		this.anIntArray203 = arg2;
		@Pc(19) byte local19 = 0;
		for (@Pc(21) int local21 = 1; local21 < arg3.length; local21++) {
			if (arg3[local21] == 1) {
				local19 = (byte) local21;
			}
		}
		this.aByteArrayArray7 = arg4;
		@Pc(40) int local40 = Integer.MAX_VALUE;
		@Pc(42) int local42 = Integer.MIN_VALUE;
		for (@Pc(44) int local44 = 0; local44 < 256; local44++) {
			if (this.anIntArray201[local44] < local40 && this.anIntArray203[local44] != 0) {
				local40 = this.anIntArray201[local44];
			}
			if (this.anIntArray201[local44] + this.anIntArray203[local44] > local42) {
				local42 = this.anIntArray201[local44] + this.anIntArray203[local44];
			}
			@Pc(87) byte[] local87 = this.aByteArrayArray7[local44];
			@Pc(90) int local90 = local87.length;
			for (@Pc(92) int local92 = 0; local92 < local90; local92++) {
				local87[local92] = (byte) (local87[local92] == local19 ? 0 : 1);
			}
		}
		this.anInt1833 = this.anIntArray201[32] + this.anIntArray203[32];
		this.anInt1829 = this.anInt1833 - local40;
		this.anInt1835 = local42 - this.anInt1833;
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "([B)V")
	public Class4_Sub2_Sub3_Sub3(@OriginalArg(0) byte[] arg0) {
		this.anIntArray202 = new int[arg0.length];
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray202.length; local15++) {
			this.anIntArray202[local15] = arg0[local15] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ja;IIIIIIIII)V")
	public void method1261(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		this.method1279(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt1833;
		}
		@Pc(18) int[] local18 = new int[] { arg3 };
		if (arg4 < this.anInt1829 + this.anInt1835 + arg9 && arg4 < arg9 + arg9) {
			local18 = null;
		}
		@Pc(40) int local40 = this.method1276(arg0, local18, Static76.aClass39Array14);
		if (arg8 == 3 && local40 == 1) {
			arg8 = 1;
		}
		@Pc(55) int local55;
		@Pc(116) int local116;
		if (arg8 == 0) {
			local55 = arg2 + this.anInt1829;
		} else if (arg8 == 1) {
			local55 = arg2 + this.anInt1829 + (arg4 - this.anInt1829 - this.anInt1835 - (local40 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local55 = arg2 + arg4 - this.anInt1835 - (local40 - 1) * arg9;
		} else {
			local116 = (arg4 - this.anInt1829 - this.anInt1835 - (local40 - 1) * arg9) / (local40 + 1);
			if (local116 < 0) {
				local116 = 0;
			}
			local55 = arg2 + this.anInt1829 + local116;
			arg9 += local116;
		}
		for (local116 = 0; local116 < local40; local116++) {
			if (arg7 == 0) {
				this.method1284(Static76.aClass39Array14[local116], arg1, local55);
			} else if (arg7 == 1) {
				this.method1284(Static76.aClass39Array14[local116], arg1 + (arg3 - this.method1265(Static76.aClass39Array14[local116])) / 2, local55);
			} else if (arg7 == 2) {
				this.method1284(Static76.aClass39Array14[local116], arg1 + arg3 - this.method1265(Static76.aClass39Array14[local116]), local55);
			} else if (local116 == local40 - 1) {
				this.method1284(Static76.aClass39Array14[local116], arg1, local55);
			} else {
				this.method1270(Static76.aClass39Array14[local116], arg3);
				this.method1284(Static76.aClass39Array14[local116], arg1, local55);
				Static76.anInt1837 = 0;
			}
			local55 += arg9;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ja;II[I[I)V")
	private void method1262(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1833;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1481; local10++) {
			@Pc(18) int local18 = arg0.aByteArray10[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(67) int local67;
				@Pc(76) int local76;
				@Pc(87) int local87;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class39 local38 = arg0.method938(local10, local6 + 1);
					local6 = -1;
					if (local38.method968(Static76.aClass39_979)) {
						local18 = 60;
					} else {
						if (!local38.method968(Static76.aClass39_963)) {
							if (local38.method943(Static76.aClass39_970)) {
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
									local87 = local38.method964(4).method932();
									@Pc(91) Class4_Sub2_Sub3_Sub4 local91 = Static76.aClass4_Sub2_Sub3_Sub4Array4[local87];
									local91.method1688(arg1 + local67, local4 + this.anInt1833 - local91.anInt2264 + local76);
									arg1 += local91.anInt2263;
								} catch (@Pc(112) Exception local112) {
								}
							} else {
								this.method1264(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(125) int local125 = this.anIntArray202[local18];
					local67 = this.anIntArray203[local18];
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
						if (Static76.anInt1837 > 0) {
							Static76.anInt1828 += Static76.anInt1837;
							arg1 += Static76.anInt1828 >> 8;
							Static76.anInt1828 &= 0xFF;
						}
					} else if (Static76.anInt1836 == 256) {
						if (Static76.anInt1830 != -1) {
							Static76.method1274(this.aByteArrayArray7[local18], arg1 + local76 + 1, local4 + this.anIntArray201[local18] + 1 + local87, local125, local67, Static76.anInt1830);
						}
						Static76.method1274(this.aByteArrayArray7[local18], arg1 + local76, local4 + this.anIntArray201[local18] + local87, local125, local67, Static76.anInt1834);
					} else {
						if (Static76.anInt1830 != -1) {
							Static76.method1269(this.aByteArrayArray7[local18], arg1 + local76 + 1, local4 + this.anIntArray201[local18] + 1 + local87, local125, local67, Static76.anInt1830, Static76.anInt1836);
						}
						Static76.method1269(this.aByteArrayArray7[local18], arg1 + local76, local4 + this.anIntArray201[local18] + local87, local125, local67, Static76.anInt1834, Static76.anInt1836);
					}
					if (Static76.anInt1831 != -1) {
						Static17.method1669(arg1, local4 + (int) ((double) this.anInt1833 * 0.7D), local125, Static76.anInt1831);
					}
					if (Static76.anInt1838 != -1) {
						Static17.method1669(arg1, local4 + this.anInt1833, local125, Static76.anInt1838);
					}
					arg1 += local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lclient!ja;)V")
	private void method1264(@OriginalArg(0) Class39 arg0) {
		try {
			if (arg0.method943(Static76.aClass39_972)) {
				Static76.anInt1834 = arg0.method964(4).method969(16);
				return;
			}
			if (arg0.method968(Static76.aClass39_976)) {
				Static76.anInt1834 = Static76.anInt1832;
				return;
			}
			if (arg0.method943(Static76.aClass39_971)) {
				Static76.anInt1831 = arg0.method964(4).method969(16);
				return;
			}
			if (arg0.method968(Static76.aClass39_966)) {
				Static76.anInt1831 = 8388608;
				return;
			}
			if (arg0.method968(Static76.aClass39_969)) {
				Static76.anInt1831 = -1;
				return;
			}
			if (!arg0.method968(Static76.aClass39_977) && !arg0.method968(Static76.aClass39_964) && !arg0.method968(Static76.aClass39_980) && !arg0.method968(Static76.aClass39_965)) {
				if (arg0.method943(Static76.aClass39_973)) {
					Static76.anInt1838 = arg0.method964(2).method969(16);
					return;
				}
				if (arg0.method968(Static76.aClass39_968)) {
					Static76.anInt1838 = 0;
					return;
				}
				if (arg0.method968(Static76.aClass39_978)) {
					Static76.anInt1838 = -1;
					return;
				}
				if (arg0.method943(Static76.aClass39_975)) {
					Static76.anInt1830 = arg0.method964(5).method969(16);
					return;
				}
				if (arg0.method968(Static76.aClass39_962)) {
					Static76.anInt1830 = 0;
					return;
				}
				if (arg0.method968(Static76.aClass39_974)) {
					Static76.anInt1830 = Static76.anInt1827;
					return;
				}
				if (arg0.method968(Static76.aClass39_967)) {
					this.method1279(Static76.anInt1832, Static76.anInt1827);
					return;
				}
			}
		} catch (@Pc(142) Exception local142) {
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(Lclient!ja;)I")
	public int method1265(@OriginalArg(0) Class39 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt1481; local9++) {
			@Pc(17) int local17 = arg0.aByteArray10[local9] & 0xFF;
			if (local17 == 60) {
				local5 = local9;
			} else if (local17 == 62 && local5 != -1) {
				@Pc(37) Class39 local37 = arg0.method938(local9, local5 + 1);
				local5 = -1;
				if (local37.method968(Static76.aClass39_979)) {
					local7 += this.anIntArray202[60];
				} else if (local37.method968(Static76.aClass39_963)) {
					local7 += this.anIntArray202[62];
				} else if (local37.method943(Static76.aClass39_970)) {
					try {
						@Pc(77) int local77 = local37.method964(4).method932();
						local7 += Static76.aClass4_Sub2_Sub3_Sub4Array4[local77].anInt2263;
					} catch (@Pc(86) Exception local86) {
					}
				}
			} else if (local5 == -1) {
				local7 += this.anIntArray202[local17];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ja;IIIIII)V")
	public void method1267(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1279(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1481];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1481; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1262(arg0, arg1 - this.method1265(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ja;I)V")
	private void method1270(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method953(); local5++) {
			@Pc(11) int local11 = arg0.method939(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static76.anInt1837 = (arg1 - this.method1265(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lclient!ja;I)I")
	public int method1271(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1276(arg0, new int[] { arg1 }, Static76.aClass39Array14);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1265(Static76.aClass39Array14[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ja;IIII)V")
	public void method1272(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1279(arg3, arg4);
			this.method1284(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ja;IIIII)V")
	public void method1273(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.method1279(16777215, 0);
		Static76.aRandom1.setSeed((long) arg3);
		Static76.anInt1836 = (Static76.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt1481];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1481; local25++) {
			local21[local25] = local23;
			if ((Static76.aRandom1.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1262(arg0, arg1, arg2, local21, null);
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I")
	private int method1275(@OriginalArg(0) int arg0) {
		return this.anIntArray202[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ja;[I[Lclient!ja;)I")
	private int method1276(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class39[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class39 local11 = Static126.method2191(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method953();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method939(local27);
			if (local33 == 60) {
				local19 = local27;
			} else {
				if (local33 == 62 && local19 != -1) {
					@Pc(53) Class39 local53 = arg0.method938(local27, local19 + 1);
					local19 = -1;
					local11.method946(60);
					local11.method944(local53);
					local11.method946(62);
					if (local53.method968(Static76.aClass39_967)) {
						arg2[local21++] = local11.method938(local11.method953(), local7);
						local7 = local11.method953();
						local5 = 0;
						local13 = -1;
					} else if (local53.method968(Static76.aClass39_979)) {
						local5 += this.method1275(60);
					} else if (local53.method968(Static76.aClass39_963)) {
						local5 += this.method1275(62);
					} else if (local53.method943(Static76.aClass39_970)) {
						try {
							@Pc(131) int local131 = local53.method964(4).method932();
							local5 += Static76.aClass4_Sub2_Sub3_Sub4Array4[local131].anInt2263;
						} catch (@Pc(140) Exception local140) {
						}
					}
					local33 = -1;
				}
				if (local19 == -1) {
					if (local33 != -1) {
						local11.method946(local33);
						local5 += this.method1275(local33);
					}
					if (local33 == 32) {
						local13 = local11.method953();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local21 < arg1.length ? local21 : arg1.length - 1] && local13 >= 0) {
						arg2[local21++] = local11.method938(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
					}
					if (local33 == 45) {
						local13 = local11.method953();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method953() > local7) {
			arg2[local21++] = local11.method938(local11.method953(), local7);
		}
		return local21;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(Lclient!ja;I)I")
	public int method1277(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		return this.method1276(arg0, new int[] { arg1 }, Static76.aClass39Array14);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lclient!ja;IIIII)V")
	public void method1278(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1279(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1481];
		@Pc(14) int[] local14 = new int[arg0.anInt1481];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1481; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1262(arg0, arg1 - this.method1265(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)V")
	private void method1279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static76.anInt1831 = -1;
		Static76.anInt1838 = -1;
		Static76.anInt1827 = arg1;
		Static76.anInt1830 = arg1;
		Static76.anInt1832 = arg0;
		Static76.anInt1834 = arg0;
		Static76.anInt1836 = 256;
		Static76.anInt1837 = 0;
		Static76.anInt1828 = 0;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lclient!ja;IIII)V")
	public void method1280(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1279(arg3, arg4);
			this.method1284(arg0, arg1 - this.method1265(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(Lclient!ja;IIIII)V")
	public void method1281(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1279(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1481];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1481; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1262(arg0, arg1 - this.method1265(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(Lclient!ja;IIII)V")
	public void method1283(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1279(arg3, arg4);
			this.method1284(arg0, arg1 - this.method1265(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ja;II)V")
	private void method1284(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1833;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < arg0.anInt1481; local8++) {
			@Pc(16) int local16 = arg0.aByteArray10[local8] & 0xFF;
			if (local16 == 60) {
				local6 = local8;
			} else {
				@Pc(66) int local66;
				if (local16 == 62 && local6 != -1) {
					@Pc(36) Class39 local36 = arg0.method938(local8, local6 + 1);
					local6 = -1;
					if (local36.method968(Static76.aClass39_979)) {
						local16 = 60;
					} else {
						if (!local36.method968(Static76.aClass39_963)) {
							if (local36.method943(Static76.aClass39_970)) {
								try {
									local66 = local36.method964(4).method932();
									@Pc(70) Class4_Sub2_Sub3_Sub4 local70 = Static76.aClass4_Sub2_Sub3_Sub4Array4[local66];
									local70.method1688(arg1, local4 + this.anInt1833 - local70.anInt2264);
									arg1 += local70.anInt2263;
								} catch (@Pc(87) Exception local87) {
								}
							} else {
								this.method1264(local36);
							}
							continue;
						}
						local16 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(100) int local100 = this.anIntArray202[local16];
					local66 = this.anIntArray203[local16];
					if (local16 == 32) {
						if (Static76.anInt1837 > 0) {
							Static76.anInt1828 += Static76.anInt1837;
							arg1 += Static76.anInt1828 >> 8;
							Static76.anInt1828 &= 0xFF;
						}
					} else if (Static76.anInt1836 == 256) {
						if (Static76.anInt1830 != -1) {
							Static76.method1274(this.aByteArrayArray7[local16], arg1 + 1, local4 + this.anIntArray201[local16] + 1, local100, local66, Static76.anInt1830);
						}
						Static76.method1274(this.aByteArrayArray7[local16], arg1, local4 + this.anIntArray201[local16], local100, local66, Static76.anInt1834);
					} else {
						if (Static76.anInt1830 != -1) {
							Static76.method1269(this.aByteArrayArray7[local16], arg1 + 1, local4 + this.anIntArray201[local16] + 1, local100, local66, Static76.anInt1830, Static76.anInt1836);
						}
						Static76.method1269(this.aByteArrayArray7[local16], arg1, local4 + this.anIntArray201[local16], local100, local66, Static76.anInt1834, Static76.anInt1836);
					}
					if (Static76.anInt1831 != -1) {
						Static17.method1669(arg1, local4 + (int) ((double) this.anInt1833 * 0.7D), local100, Static76.anInt1831);
					}
					if (Static76.anInt1838 != -1) {
						Static17.method1669(arg1, local4 + this.anInt1833 + 1, local100, Static76.anInt1838);
					}
					arg1 += local100;
				}
			}
		}
	}
}
