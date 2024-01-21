import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class3_Sub1_Sub2_Sub2 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!gd", name = "sb", descriptor = "[[B")
	private byte[][] aByteArrayArray9 = new byte[256][];

	@OriginalMember(owner = "client!gd", name = "Jb", descriptor = "I")
	public int anInt1258 = 0;

	@OriginalMember(owner = "client!gd", name = "wb", descriptor = "[I")
	private int[] anIntArray145;

	@OriginalMember(owner = "client!gd", name = "Ab", descriptor = "[I")
	private final int[] anIntArray147;

	@OriginalMember(owner = "client!gd", name = "xb", descriptor = "[I")
	private int[] anIntArray146;

	@OriginalMember(owner = "client!gd", name = "Fb", descriptor = "I")
	private int anInt1256;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
	private int anInt1247;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class3_Sub1_Sub2_Sub2(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray145 = arg0;
		this.anIntArray147 = arg1;
		this.anIntArray146 = arg2;
		@Pc(19) byte local19 = 0;
		for (@Pc(21) int local21 = 1; local21 < arg3.length; local21++) {
			if (arg3[local21] == 1) {
				local19 = (byte) local21;
			}
		}
		this.aByteArrayArray9 = arg4;
		@Pc(40) int local40 = Integer.MAX_VALUE;
		@Pc(42) int local42 = Integer.MIN_VALUE;
		for (@Pc(44) int local44 = 0; local44 < 256; local44++) {
			if (this.anIntArray145[local44] < local40 && this.anIntArray146[local44] != 0) {
				local40 = this.anIntArray145[local44];
			}
			if (this.anIntArray145[local44] + this.anIntArray146[local44] > local42) {
				local42 = this.anIntArray145[local44] + this.anIntArray146[local44];
			}
			@Pc(87) byte[] local87 = this.aByteArrayArray9[local44];
			@Pc(90) int local90 = local87.length;
			for (@Pc(92) int local92 = 0; local92 < local90; local92++) {
				local87[local92] = (byte) (local87[local92] == local19 ? 0 : 1);
			}
		}
		this.anInt1258 = this.anIntArray145[32] + this.anIntArray146[32];
		this.anInt1256 = this.anInt1258 - local40;
		this.anInt1247 = local42 - this.anInt1258;
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0) {
		this.anIntArray147 = new int[arg0.length];
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray147.length; local15++) {
			this.anIntArray147[local15] = arg0[local15] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V")
	private void method830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static37.anInt1250 = -1;
		Static37.anInt1253 = -1;
		Static37.anInt1254 = arg1;
		Static37.anInt1249 = arg1;
		Static37.anInt1255 = arg0;
		Static37.anInt1248 = arg0;
		Static37.anInt1257 = 256;
		Static37.anInt1252 = 0;
		Static37.anInt1251 = 0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!qf;IIIII)V")
	public void method831(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method830(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2817];
		@Pc(14) int[] local14 = new int[arg0.anInt2817];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2817; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method846(arg0, arg1 - this.method848(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!qf;IIII)V")
	public void method832(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method830(arg3, arg4);
			this.method852(arg0, arg1 - this.method848(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!qf;I)I")
	public int method833(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		return this.method839(arg0, new int[] { arg1 }, Static37.aClass60Array3);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!qf;I)V")
	private void method835(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1836(); local5++) {
			@Pc(11) int local11 = arg0.method1832(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static37.anInt1252 = (arg1 - this.method848(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!qf;IIIIIIIII)V")
	public void method836(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		this.method830(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt1258;
		}
		@Pc(18) int[] local18 = new int[] { arg3 };
		if (arg4 < this.anInt1256 + this.anInt1247 + arg9 && arg4 < arg9 + arg9) {
			local18 = null;
		}
		@Pc(40) int local40 = this.method839(arg0, local18, Static37.aClass60Array3);
		if (arg8 == 3 && local40 == 1) {
			arg8 = 1;
		}
		@Pc(55) int local55;
		@Pc(116) int local116;
		if (arg8 == 0) {
			local55 = arg2 + this.anInt1256;
		} else if (arg8 == 1) {
			local55 = arg2 + this.anInt1256 + (arg4 - this.anInt1256 - this.anInt1247 - (local40 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local55 = arg2 + arg4 - this.anInt1247 - (local40 - 1) * arg9;
		} else {
			local116 = (arg4 - this.anInt1256 - this.anInt1247 - (local40 - 1) * arg9) / (local40 + 1);
			if (local116 < 0) {
				local116 = 0;
			}
			local55 = arg2 + this.anInt1256 + local116;
			arg9 += local116;
		}
		for (local116 = 0; local116 < local40; local116++) {
			if (arg7 == 0) {
				this.method852(Static37.aClass60Array3[local116], arg1, local55);
			} else if (arg7 == 1) {
				this.method852(Static37.aClass60Array3[local116], arg1 + (arg3 - this.method848(Static37.aClass60Array3[local116])) / 2, local55);
			} else if (arg7 == 2) {
				this.method852(Static37.aClass60Array3[local116], arg1 + arg3 - this.method848(Static37.aClass60Array3[local116]), local55);
			} else if (local116 == local40 - 1) {
				this.method852(Static37.aClass60Array3[local116], arg1, local55);
			} else {
				this.method835(Static37.aClass60Array3[local116], arg3);
				this.method852(Static37.aClass60Array3[local116], arg1, local55);
				Static37.anInt1252 = 0;
			}
			local55 += arg9;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!qf;IIIII)V")
	public void method838(@OriginalArg(0) Class60 arg0, @OriginalArg(5) int arg1) {
		if (arg0 == null) {
			return;
		}
		this.method830(16777215, 0);
		Static37.aRandom1.setSeed((long) arg1);
		Static37.anInt1257 = (Static37.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt2817];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2817; local25++) {
			local21[local25] = local23;
			if ((Static37.aRandom1.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method846(arg0, 4, 15, local21, null);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!qf;[I[Lclient!qf;)I")
	private int method839(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class60[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class60 local11 = Static82.method1656(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method1836();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method1832(local27);
			if (local33 == 60) {
				local19 = local27;
			} else {
				if (local33 == 62 && local19 != -1) {
					@Pc(53) Class60 local53 = arg0.method1864(local19 + 1, local27);
					local19 = -1;
					local11.method1828(60);
					local11.method1830(local53);
					local11.method1828(62);
					if (local53.method1839(Static37.aClass60_509)) {
						arg2[local21++] = local11.method1864(local7, local11.method1836());
						local7 = local11.method1836();
						local5 = 0;
						local13 = -1;
					} else if (local53.method1839(Static37.aClass60_507)) {
						local5 += this.method850(60);
					} else if (local53.method1839(Static37.aClass60_502)) {
						local5 += this.method850(62);
					} else if (local53.method1853(Static37.aClass60_497)) {
						try {
							@Pc(131) int local131 = local53.method1829(4).method1833();
							local5 += Static37.aClass3_Sub1_Sub2_Sub4Array2[local131].anInt2860;
						} catch (@Pc(140) Exception local140) {
						}
					}
					local33 = -1;
				}
				if (local19 == -1) {
					if (local33 != -1) {
						local11.method1828(local33);
						local5 += this.method850(local33);
					}
					if (local33 == 32) {
						local13 = local11.method1836();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local21 < arg1.length ? local21 : arg1.length - 1] && local13 >= 0) {
						arg2[local21++] = local11.method1864(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
					}
					if (local33 == 45) {
						local13 = local11.method1836();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1836() > local7) {
			arg2[local21++] = local11.method1864(local7, local11.method1836());
		}
		return local21;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!qf;IIIII)V")
	public void method841(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method830(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2817];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2817; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method846(arg0, arg1 - this.method848(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!qf;IIII)V")
	public void method842(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method830(arg3, arg4);
			this.method852(arg0, arg1 - this.method848(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!qf;)V")
	private void method844(@OriginalArg(0) Class60 arg0) {
		try {
			if (arg0.method1853(Static37.aClass60_503)) {
				Static37.anInt1248 = arg0.method1829(4).method1845(16);
				return;
			}
			if (arg0.method1839(Static37.aClass60_506)) {
				Static37.anInt1248 = Static37.anInt1255;
				return;
			}
			if (arg0.method1853(Static37.aClass60_498)) {
				Static37.anInt1250 = arg0.method1829(4).method1845(16);
				return;
			}
			if (arg0.method1839(Static37.aClass60_508)) {
				Static37.anInt1250 = 8388608;
				return;
			}
			if (arg0.method1839(Static37.aClass60_493)) {
				Static37.anInt1250 = -1;
				return;
			}
			if (!arg0.method1839(Static37.aClass60_492) && !arg0.method1839(Static37.aClass60_499) && !arg0.method1839(Static37.aClass60_500) && !arg0.method1839(Static37.aClass60_504)) {
				if (arg0.method1853(Static37.aClass60_505)) {
					Static37.anInt1253 = arg0.method1829(2).method1845(16);
					return;
				}
				if (arg0.method1839(Static37.aClass60_496)) {
					Static37.anInt1253 = 0;
					return;
				}
				if (arg0.method1839(Static37.aClass60_491)) {
					Static37.anInt1253 = -1;
					return;
				}
				if (arg0.method1853(Static37.aClass60_494)) {
					Static37.anInt1249 = arg0.method1829(5).method1845(16);
					return;
				}
				if (arg0.method1839(Static37.aClass60_501)) {
					Static37.anInt1249 = 0;
					return;
				}
				if (arg0.method1839(Static37.aClass60_495)) {
					Static37.anInt1249 = Static37.anInt1254;
					return;
				}
				if (arg0.method1839(Static37.aClass60_509)) {
					this.method830(Static37.anInt1255, Static37.anInt1254);
					return;
				}
			}
		} catch (@Pc(142) Exception local142) {
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!qf;I)I")
	public int method845(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method839(arg0, new int[] { arg1 }, Static37.aClass60Array3);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method848(Static37.aClass60Array3[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!qf;II[I[I)V")
	private void method846(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1258;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2817; local10++) {
			@Pc(18) int local18 = arg0.aByteArray73[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(67) int local67;
				@Pc(76) int local76;
				@Pc(87) int local87;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class60 local38 = arg0.method1864(local6 + 1, local10);
					local6 = -1;
					if (local38.method1839(Static37.aClass60_507)) {
						local18 = 60;
					} else {
						if (!local38.method1839(Static37.aClass60_502)) {
							if (local38.method1853(Static37.aClass60_497)) {
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
									local87 = local38.method1829(4).method1833();
									@Pc(91) Class3_Sub1_Sub2_Sub4 local91 = Static37.aClass3_Sub1_Sub2_Sub4Array2[local87];
									local91.method1903(arg1 + local67, local4 + this.anInt1258 - local91.anInt2858 + local76);
									arg1 += local91.anInt2860;
								} catch (@Pc(112) Exception local112) {
								}
							} else {
								this.method844(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(125) int local125 = this.anIntArray147[local18];
					local67 = this.anIntArray146[local18];
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
						if (Static37.anInt1252 > 0) {
							Static37.anInt1251 += Static37.anInt1252;
							arg1 += Static37.anInt1251 >> 8;
							Static37.anInt1251 &= 0xFF;
						}
					} else if (Static37.anInt1257 == 256) {
						if (Static37.anInt1249 != -1) {
							Static37.method851(this.aByteArrayArray9[local18], arg1 + local76 + 1, local4 + this.anIntArray145[local18] + 1 + local87, local125, local67, Static37.anInt1249);
						}
						Static37.method851(this.aByteArrayArray9[local18], arg1 + local76, local4 + this.anIntArray145[local18] + local87, local125, local67, Static37.anInt1248);
					} else {
						if (Static37.anInt1249 != -1) {
							Static37.method837(this.aByteArrayArray9[local18], arg1 + local76 + 1, local4 + this.anIntArray145[local18] + 1 + local87, local125, local67, Static37.anInt1249, Static37.anInt1257);
						}
						Static37.method837(this.aByteArrayArray9[local18], arg1 + local76, local4 + this.anIntArray145[local18] + local87, local125, local67, Static37.anInt1248, Static37.anInt1257);
					}
					if (Static37.anInt1250 != -1) {
						Static40.method1885(arg1, local4 + (int) ((double) this.anInt1258 * 0.7D), local125, Static37.anInt1250);
					}
					if (Static37.anInt1253 != -1) {
						Static40.method1885(arg1, local4 + this.anInt1258, local125, Static37.anInt1253);
					}
					arg1 += local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!qf;IIII)V")
	public void method847(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method830(arg3, arg4);
			this.method852(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!qf;)I")
	public int method848(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt2817; local9++) {
			@Pc(17) int local17 = arg0.aByteArray73[local9] & 0xFF;
			if (local17 == 60) {
				local5 = local9;
			} else if (local17 == 62 && local5 != -1) {
				@Pc(37) Class60 local37 = arg0.method1864(local5 + 1, local9);
				local5 = -1;
				if (local37.method1839(Static37.aClass60_507)) {
					local7 += this.anIntArray147[60];
				} else if (local37.method1839(Static37.aClass60_502)) {
					local7 += this.anIntArray147[62];
				} else if (local37.method1853(Static37.aClass60_497)) {
					try {
						@Pc(77) int local77 = local37.method1829(4).method1833();
						local7 += Static37.aClass3_Sub1_Sub2_Sub4Array2[local77].anInt2860;
					} catch (@Pc(86) Exception local86) {
					}
				}
			} else if (local5 == -1) {
				local7 += this.anIntArray147[local17];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!qf;IIIIII)V")
	public void method849(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method830(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2817];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2817; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method846(arg0, arg1 - this.method848(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)I")
	public int method850(@OriginalArg(0) int arg0) {
		return this.anIntArray147[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!qf;II)V")
	private void method852(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1258;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < arg0.anInt2817; local8++) {
			@Pc(16) int local16 = arg0.aByteArray73[local8] & 0xFF;
			if (local16 == 60) {
				local6 = local8;
			} else {
				@Pc(66) int local66;
				if (local16 == 62 && local6 != -1) {
					@Pc(36) Class60 local36 = arg0.method1864(local6 + 1, local8);
					local6 = -1;
					if (local36.method1839(Static37.aClass60_507)) {
						local16 = 60;
					} else {
						if (!local36.method1839(Static37.aClass60_502)) {
							if (local36.method1853(Static37.aClass60_497)) {
								try {
									local66 = local36.method1829(4).method1833();
									@Pc(70) Class3_Sub1_Sub2_Sub4 local70 = Static37.aClass3_Sub1_Sub2_Sub4Array2[local66];
									local70.method1903(arg1, local4 + this.anInt1258 - local70.anInt2858);
									arg1 += local70.anInt2860;
								} catch (@Pc(87) Exception local87) {
								}
							} else {
								this.method844(local36);
							}
							continue;
						}
						local16 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(100) int local100 = this.anIntArray147[local16];
					local66 = this.anIntArray146[local16];
					if (local16 == 32) {
						if (Static37.anInt1252 > 0) {
							Static37.anInt1251 += Static37.anInt1252;
							arg1 += Static37.anInt1251 >> 8;
							Static37.anInt1251 &= 0xFF;
						}
					} else if (Static37.anInt1257 == 256) {
						if (Static37.anInt1249 != -1) {
							Static37.method851(this.aByteArrayArray9[local16], arg1 + 1, local4 + this.anIntArray145[local16] + 1, local100, local66, Static37.anInt1249);
						}
						Static37.method851(this.aByteArrayArray9[local16], arg1, local4 + this.anIntArray145[local16], local100, local66, Static37.anInt1248);
					} else {
						if (Static37.anInt1249 != -1) {
							Static37.method837(this.aByteArrayArray9[local16], arg1 + 1, local4 + this.anIntArray145[local16] + 1, local100, local66, Static37.anInt1249, Static37.anInt1257);
						}
						Static37.method837(this.aByteArrayArray9[local16], arg1, local4 + this.anIntArray145[local16], local100, local66, Static37.anInt1248, Static37.anInt1257);
					}
					if (Static37.anInt1250 != -1) {
						Static40.method1885(arg1, local4 + (int) ((double) this.anInt1258 * 0.7D), local100, Static37.anInt1250);
					}
					if (Static37.anInt1253 != -1) {
						Static40.method1885(arg1, local4 + this.anInt1258 + 1, local100, Static37.anInt1253);
					}
					arg1 += local100;
				}
			}
		}
	}
}
