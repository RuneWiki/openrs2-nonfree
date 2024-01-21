import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public abstract class Class1_Sub2_Sub8_Sub1 extends Class1_Sub2_Sub8 {

	@OriginalMember(owner = "client!f", name = "T", descriptor = "[Lclient!le;")
	private Class1_Sub2_Sub8_Sub2[] aClass1_Sub2_Sub8_Sub2Array7;

	@OriginalMember(owner = "client!f", name = "mb", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!f", name = "qb", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!f", name = "ub", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!f", name = "rb", descriptor = "I")
	public int anInt1588 = 0;

	@OriginalMember(owner = "client!f", name = "Hb", descriptor = "[[B")
	protected byte[][] aByteArrayArray6 = new byte[256][];

	@OriginalMember(owner = "client!f", name = "W", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!f", name = "Ab", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!f", name = "lb", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!f", name = "Kb", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
	private int anInt1584;

	@OriginalMember(owner = "client!f", name = "S", descriptor = "I")
	private int anInt1582;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class1_Sub2_Sub8_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray133 = arg1;
		this.anIntArray137 = arg2;
		this.anIntArray134 = arg3;
		this.anIntArray138 = arg4;
		this.method1259(arg0);
		this.aByteArrayArray6 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray137[local32] < local28 && this.anIntArray138[local32] != 0) {
				local28 = this.anIntArray137[local32];
			}
			if (this.anIntArray137[local32] + this.anIntArray138[local32] > local30) {
				local30 = this.anIntArray137[local32] + this.anIntArray138[local32];
			}
		}
		this.anInt1584 = this.anInt1588 - local28;
		this.anInt1582 = local30 - this.anInt1588;
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub8_Sub1(@OriginalArg(0) byte[] arg0) {
		this.method1259(arg0);
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)I")
	private int method1243(@OriginalArg(0) int arg0) {
		return this.anIntArray135[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(III)V")
	private void method1245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static51.anInt1586 = -1;
		Static51.anInt1593 = -1;
		Static51.anInt1590 = arg1;
		Static51.anInt1592 = arg1;
		Static51.anInt1583 = arg0;
		Static51.anInt1591 = arg0;
		Static51.anInt1587 = arg2;
		Static51.anInt1585 = arg2;
		Static51.anInt1589 = 0;
		Static51.anInt1581 = 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;IIII)V")
	public final void method1246(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1263(arg3, arg4);
			this.method1257(arg0, arg1 - this.method1269(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;IIIIIIIII)I")
	public final int method1248(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1260(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V")
	private void method1249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static90.anInt4601;
		@Pc(9) int local9 = Static90.anInt4601 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static90.anInt4604) {
			local20 = Static90.anInt4604 - arg2;
			arg4 -= local20;
			arg2 = Static90.anInt4604;
			local13 = local20 * arg3;
			local5 += local20 * Static90.anInt4601;
		}
		if (arg2 + arg4 > Static90.anInt4603) {
			arg4 -= arg2 + arg4 - Static90.anInt4603;
		}
		if (arg1 < Static90.anInt4602) {
			local20 = Static90.anInt4602 - arg1;
			arg3 -= local20;
			arg1 = Static90.anInt4602;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static90.anInt4600) {
			local20 = arg1 + arg3 - Static90.anInt4600;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static51.method1244(Static90.anIntArray406, this.aByteArrayArray6[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;[I[Lclient!dj;)I")
	private int method1251(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class24[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class24 local11 = Static122.method2071(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method781();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method743(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class24 local55 = arg0.method759(local29, local19 + 1);
					local19 = -1;
					local11.method748(60);
					local11.method778(local55);
					local11.method748(62);
					if (local55.method755(Static51.aClass24_432)) {
						arg2[local23++] = local11.method759(local11.method781(), local7);
						local7 = local11.method781();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method755(Static51.aClass24_443)) {
						local5 += this.method1243(60);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method755(Static51.aClass24_449)) {
						local5 += this.method1243(62);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method755(Static51.aClass24_442)) {
						local5 += this.method1243(160);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method755(Static51.aClass24_446)) {
						local5 += this.method1243(173);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method755(Static51.aClass24_444)) {
						local5 += this.method1243(215);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method755(Static51.aClass24_438)) {
						local5 += this.method1243(128);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method755(Static51.aClass24_431)) {
						local5 += this.method1243(169);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method755(Static51.aClass24_436)) {
						local5 += this.method1243(174);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method764(Static51.aClass24_435)) {
						try {
							@Pc(359) int local359 = local55.method773(4).method772();
							local5 += this.aClass1_Sub2_Sub8_Sub2Array7[local359].anInt2564;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method748(local35);
						local5 += this.method1243(local35);
						if (this.aByteArray17 != null && local21 != -1) {
							local5 += this.aByteArray17[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method781();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method759(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method781();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method781() > local7) {
			arg2[local23++] = local11.method759(local11.method781(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(IIIIII)V")
	protected abstract void method1252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method1253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;II[I[I)V")
	private void method1254(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1588;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1084; local12++) {
			@Pc(20) int local20 = arg0.aByteArray13[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class24 local40 = arg0.method759(local12, local6 + 1);
					local6 = -1;
					if (local40.method755(Static51.aClass24_443)) {
						local20 = 60;
					} else if (local40.method755(Static51.aClass24_449)) {
						local20 = 62;
					} else if (local40.method755(Static51.aClass24_442)) {
						local20 = 160;
					} else if (local40.method755(Static51.aClass24_446)) {
						local20 = 173;
					} else if (local40.method755(Static51.aClass24_444)) {
						local20 = 215;
					} else if (local40.method755(Static51.aClass24_438)) {
						local20 = 128;
					} else if (local40.method755(Static51.aClass24_431)) {
						local20 = 169;
					} else {
						if (!local40.method755(Static51.aClass24_436)) {
							if (local40.method764(Static51.aClass24_435)) {
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
									local137 = local40.method773(4).method772();
									@Pc(142) Class1_Sub2_Sub8_Sub2 local142 = this.aClass1_Sub2_Sub8_Sub2Array7[local137];
									@Pc(153) int local153 = this.anIntArray136 == null ? local142.anInt2560 : this.anIntArray136[local137];
									if (Static51.anInt1585 == 256) {
										local142.method1960(arg1 + local117, local4 + this.anInt1588 - local153 + local126);
									} else {
										local142.method1958(arg1 + local117, local4 + this.anInt1588 - local153 + local126, Static51.anInt1585);
									}
									arg1 += local142.anInt2564;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method1256(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray17 != null && local8 != -1) {
						arg1 += this.aByteArray17[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray134[local20];
					local117 = this.anIntArray138[local20];
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
						if (Static51.anInt1589 > 0) {
							Static51.anInt1581 += Static51.anInt1589;
							arg1 += Static51.anInt1581 >> 8;
							Static51.anInt1581 &= 0xFF;
						}
					} else if (Static51.anInt1585 == 256) {
						if (Static51.anInt1592 != -1) {
							this.method1265(local20, arg1 + this.anIntArray133[local20] + local126 + 1, local4 + this.anIntArray137[local20] + 1 + local137, local223, local117, Static51.anInt1592);
						}
						this.method1252(local20, arg1 + this.anIntArray133[local20] + local126, local4 + this.anIntArray137[local20] + local137, local223, local117, Static51.anInt1591);
					} else {
						if (Static51.anInt1592 != -1) {
							this.method1249(local20, arg1 + this.anIntArray133[local20] + local126 + 1, local4 + this.anIntArray137[local20] + 1 + local137, local223, local117, Static51.anInt1592, Static51.anInt1585);
						}
						this.method1253(local20, arg1 + this.anIntArray133[local20] + local126, local4 + this.anIntArray137[local20] + local137, local223, local117, Static51.anInt1591, Static51.anInt1585);
					}
					@Pc(380) int local380 = this.anIntArray135[local20];
					if (Static51.anInt1586 != -1) {
						Static90.method3498(arg1, local4 + (int) ((double) this.anInt1588 * 0.7D), local380, Static51.anInt1586);
					}
					if (Static51.anInt1593 != -1) {
						Static90.method3498(arg1, local4 + this.anInt1588, local380, Static51.anInt1593);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;I)I")
	public final int method1255(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1) {
		return this.method1251(arg0, new int[] { arg1 }, Static51.aClass24Array10);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;)V")
	private void method1256(@OriginalArg(0) Class24 arg0) {
		try {
			if (arg0.method764(Static51.aClass24_439)) {
				Static51.anInt1591 = arg0.method773(4).method760(16);
				return;
			}
			if (arg0.method755(Static51.aClass24_445)) {
				Static51.anInt1591 = Static51.anInt1583;
				return;
			}
			if (arg0.method764(Static51.aClass24_448)) {
				Static51.anInt1585 = arg0.method773(6).method772();
				return;
			}
			if (arg0.method755(Static51.aClass24_433)) {
				Static51.anInt1585 = Static51.anInt1587;
				return;
			}
			if (arg0.method764(Static51.aClass24_452)) {
				Static51.anInt1586 = arg0.method773(4).method760(16);
				return;
			}
			if (arg0.method755(Static51.aClass24_447)) {
				Static51.anInt1586 = 8388608;
				return;
			}
			if (arg0.method755(Static51.aClass24_450)) {
				Static51.anInt1586 = -1;
				return;
			}
			if (arg0.method764(Static51.aClass24_451)) {
				Static51.anInt1593 = arg0.method773(2).method760(16);
				return;
			}
			if (arg0.method755(Static51.aClass24_453)) {
				Static51.anInt1593 = 0;
				return;
			}
			if (arg0.method755(Static51.aClass24_441)) {
				Static51.anInt1593 = -1;
				return;
			}
			if (arg0.method764(Static51.aClass24_440)) {
				Static51.anInt1592 = arg0.method773(5).method760(16);
				return;
			}
			if (arg0.method755(Static51.aClass24_434)) {
				Static51.anInt1592 = 0;
				return;
			}
			if (arg0.method755(Static51.aClass24_437)) {
				Static51.anInt1592 = Static51.anInt1590;
				return;
			}
			if (arg0.method755(Static51.aClass24_432)) {
				this.method1245(Static51.anInt1583, Static51.anInt1590, Static51.anInt1587);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;II)V")
	private void method1257(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1588;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1084; local10++) {
			@Pc(18) int local18 = arg0.aByteArray13[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class24 local38 = arg0.method759(local10, local6 + 1);
					local6 = -1;
					if (local38.method755(Static51.aClass24_443)) {
						local18 = 60;
					} else if (local38.method755(Static51.aClass24_449)) {
						local18 = 62;
					} else if (local38.method755(Static51.aClass24_442)) {
						local18 = 160;
					} else if (local38.method755(Static51.aClass24_446)) {
						local18 = 173;
					} else if (local38.method755(Static51.aClass24_444)) {
						local18 = 215;
					} else if (local38.method755(Static51.aClass24_438)) {
						local18 = 128;
					} else if (local38.method755(Static51.aClass24_431)) {
						local18 = 169;
					} else {
						if (!local38.method755(Static51.aClass24_436)) {
							if (local38.method764(Static51.aClass24_435)) {
								try {
									local116 = local38.method773(4).method772();
									@Pc(121) Class1_Sub2_Sub8_Sub2 local121 = this.aClass1_Sub2_Sub8_Sub2Array7[local116];
									@Pc(132) int local132 = this.anIntArray136 == null ? local121.anInt2560 : this.anIntArray136[local116];
									if (Static51.anInt1585 == 256) {
										local121.method1960(arg1, local4 + this.anInt1588 - local132);
									} else {
										local121.method1958(arg1, local4 + this.anInt1588 - local132, Static51.anInt1585);
									}
									arg1 += local121.anInt2564;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method1256(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray17 != null && local8 != -1) {
						arg1 += this.aByteArray17[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray134[local18];
					local116 = this.anIntArray138[local18];
					if (local18 == 32) {
						if (Static51.anInt1589 > 0) {
							Static51.anInt1581 += Static51.anInt1589;
							arg1 += Static51.anInt1581 >> 8;
							Static51.anInt1581 &= 0xFF;
						}
					} else if (Static51.anInt1585 == 256) {
						if (Static51.anInt1592 != -1) {
							this.method1265(local18, arg1 + this.anIntArray133[local18] + 1, local4 + this.anIntArray137[local18] + 1, local194, local116, Static51.anInt1592);
						}
						this.method1252(local18, arg1 + this.anIntArray133[local18], local4 + this.anIntArray137[local18], local194, local116, Static51.anInt1591);
					} else {
						if (Static51.anInt1592 != -1) {
							this.method1249(local18, arg1 + this.anIntArray133[local18] + 1, local4 + this.anIntArray137[local18] + 1, local194, local116, Static51.anInt1592, Static51.anInt1585);
						}
						this.method1253(local18, arg1 + this.anIntArray133[local18], local4 + this.anIntArray137[local18], local194, local116, Static51.anInt1591, Static51.anInt1585);
					}
					@Pc(316) int local316 = this.anIntArray135[local18];
					if (Static51.anInt1586 != -1) {
						Static90.method3498(arg1, local4 + (int) ((double) this.anInt1588 * 0.7D), local316, Static51.anInt1586);
					}
					if (Static51.anInt1593 != -1) {
						Static90.method3498(arg1, local4 + this.anInt1588 + 1, local316, Static51.anInt1593);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;IIIII)V")
	public final void method1258(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1263(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1084];
		@Pc(14) int[] local14 = new int[arg0.anInt1084];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1084; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1254(arg0, arg1 - this.method1269(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([B)V")
	private void method1259(@OriginalArg(0) byte[] arg0) {
		this.anIntArray135 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray135.length; local9++) {
				this.anIntArray135[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1588 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray135[local37] = arg0[local9++] & 0xFF;
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
						this.aByteArray17[(local182 << 8) + local150] = (byte) Static51.method1250(local93, local136, local58, this.anIntArray135, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1588 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;IIIIIIIIII)I")
	private int method1260(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1245(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt1588;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt1584 + this.anInt1582 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1251(arg0, local20, Static51.aClass24Array10);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt1584;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt1584 + (arg4 - this.anInt1584 - this.anInt1582 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt1582 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt1584 - this.anInt1582 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt1584 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1257(Static51.aClass24Array10[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1257(Static51.aClass24Array10[local118], arg1 + (arg3 - this.method1269(Static51.aClass24Array10[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1257(Static51.aClass24Array10[local118], arg1 + arg3 - this.method1269(Static51.aClass24Array10[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1257(Static51.aClass24Array10[local118], arg1, local57);
			} else {
				this.method1266(Static51.aClass24Array10[local118], arg3);
				this.method1257(Static51.aClass24Array10[local118], arg1, local57);
				Static51.anInt1589 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Lclient!dj;I)I")
	public final int method1261(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1251(arg0, new int[] { arg1 }, Static51.aClass24Array10);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1269(Static51.aClass24Array10[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;IIIILjava/util/Random;I)I")
	public final int method1262(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1245(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt1084];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1084; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1254(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(II)V")
	private void method1263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static51.anInt1586 = -1;
		Static51.anInt1593 = -1;
		Static51.anInt1590 = arg1;
		Static51.anInt1592 = arg1;
		Static51.anInt1583 = arg0;
		Static51.anInt1591 = arg0;
		Static51.anInt1587 = 256;
		Static51.anInt1585 = 256;
		Static51.anInt1589 = 0;
		Static51.anInt1581 = 0;
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(IIIIII)V")
	private void method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static90.anInt4601;
		@Pc(9) int local9 = Static90.anInt4601 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static90.anInt4604) {
			local20 = Static90.anInt4604 - arg2;
			arg4 -= local20;
			arg2 = Static90.anInt4604;
			local13 = local20 * arg3;
			local5 += local20 * Static90.anInt4601;
		}
		if (arg2 + arg4 > Static90.anInt4603) {
			arg4 -= arg2 + arg4 - Static90.anInt4603;
		}
		if (arg1 < Static90.anInt4602) {
			local20 = Static90.anInt4602 - arg1;
			arg3 -= local20;
			arg1 = Static90.anInt4602;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static90.anInt4600) {
			local20 = arg1 + arg3 - Static90.anInt4600;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static51.method1247(Static90.anIntArray406, this.aByteArrayArray6[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(Lclient!dj;I)V")
	private void method1266(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method781(); local5++) {
			@Pc(11) int local11 = arg0.method743(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static51.anInt1589 = (arg1 - this.method1269(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dj;IIIIII)V")
	public final void method1267(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1263(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1084];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1084; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1254(arg0, arg1 - this.method1269(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(Lclient!dj;)I")
	public final int method1269(@OriginalArg(0) Class24 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1084; local11++) {
			@Pc(19) int local19 = arg0.aByteArray13[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class24 local39 = arg0.method759(local11, local5 + 1);
					local5 = -1;
					if (local39.method755(Static51.aClass24_443)) {
						local19 = 60;
					} else if (local39.method755(Static51.aClass24_449)) {
						local19 = 62;
					} else if (local39.method755(Static51.aClass24_442)) {
						local19 = 160;
					} else if (local39.method755(Static51.aClass24_446)) {
						local19 = 173;
					} else if (local39.method755(Static51.aClass24_444)) {
						local19 = 215;
					} else if (local39.method755(Static51.aClass24_438)) {
						local19 = 128;
					} else if (local39.method755(Static51.aClass24_431)) {
						local19 = 169;
					} else {
						if (!local39.method755(Static51.aClass24_436)) {
							if (local39.method764(Static51.aClass24_435)) {
								try {
									@Pc(117) int local117 = local39.method773(4).method772();
									local9 += this.aClass1_Sub2_Sub8_Sub2Array7[local117].anInt2564;
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
					local9 += this.anIntArray135[local19];
					if (this.aByteArray17 != null && local7 != -1) {
						local9 += this.aByteArray17[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Lclient!dj;IIIII)V")
	public final void method1270(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1263(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1084];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1084; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1254(arg0, arg1 - this.method1269(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Lclient!dj;IIII)V")
	public final void method1271(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1263(arg3, arg4);
			this.method1257(arg0, arg1 - this.method1269(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([Lclient!le;[I)V")
	public final void method1272(@OriginalArg(0) Class1_Sub2_Sub8_Sub2[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass1_Sub2_Sub8_Sub2Array7 = arg0;
		this.anIntArray136 = arg1;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(Lclient!dj;IIII)V")
	public final void method1273(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1263(arg3, arg4);
			this.method1257(arg0, arg1, arg2);
		}
	}
}
