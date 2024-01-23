import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public abstract class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "[Lclient!ne;")
	private Class78[] aClass78Array4;

	@OriginalMember(owner = "client!oh", name = "W", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!oh", name = "jb", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!oh", name = "hb", descriptor = "I")
	public int anInt2264 = 0;

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!oh", name = "ab", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!oh", name = "db", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!oh", name = "V", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!oh", name = "kb", descriptor = "I")
	private int anInt2265;

	@OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
	private int anInt2263;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class1_Sub1_Sub10(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray248 = arg1;
		this.anIntArray251 = arg2;
		this.anIntArray252 = arg3;
		this.anIntArray249 = arg4;
		this.method1827(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray251[local25] < local21 && this.anIntArray249[local25] != 0) {
				local21 = this.anIntArray251[local25];
			}
			if (this.anIntArray251[local25] + this.anIntArray249[local25] > local23) {
				local23 = this.anIntArray251[local25] + this.anIntArray249[local25];
			}
		}
		this.anInt2265 = this.anInt2264 - local21;
		this.anInt2263 = local23 - this.anInt2264;
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub10(@OriginalArg(0) byte[] arg0) {
		this.method1827(arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;IIIIIIIIII)I")
	public final int method1809(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1812(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt2264;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt2265 + this.anInt2263 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1815(arg0, local20, Static154.aClass50Array41);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt2265;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt2265 + (arg4 - this.anInt2265 - this.anInt2263 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt2263 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt2265 - this.anInt2263 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt2265 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1825(Static154.aClass50Array41[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1825(Static154.aClass50Array41[local118], arg1 + (arg3 - this.method1810(Static154.aClass50Array41[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1825(Static154.aClass50Array41[local118], arg1 + arg3 - this.method1810(Static154.aClass50Array41[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1825(Static154.aClass50Array41[local118], arg1, local57);
			} else {
				this.method1833(Static154.aClass50Array41[local118], arg3);
				this.method1825(Static154.aClass50Array41[local118], arg1, local57);
				Static154.anInt2268 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;)I")
	public final int method1810(@OriginalArg(0) Class50 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1705; local11++) {
			@Pc(19) int local19 = arg0.aByteArray12[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class50 local39 = arg0.method1216(local11, local5 + 1);
					local5 = -1;
					if (local39.method1236(Static154.aClass50_769)) {
						local19 = 60;
					} else if (local39.method1236(Static154.aClass50_772)) {
						local19 = 62;
					} else if (local39.method1236(Static154.aClass50_771)) {
						local19 = 160;
					} else if (local39.method1236(Static154.aClass50_765)) {
						local19 = 173;
					} else if (local39.method1236(Static154.aClass50_763)) {
						local19 = 215;
					} else if (local39.method1236(Static154.aClass50_776)) {
						local19 = 128;
					} else if (local39.method1236(Static154.aClass50_762)) {
						local19 = 169;
					} else {
						if (!local39.method1236(Static154.aClass50_760)) {
							if (local39.method1240(Static154.aClass50_761)) {
								try {
									@Pc(117) int local117 = local39.method1244(4).method1235();
									local9 += this.aClass78Array4[local117].anInt3814;
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
					local9 += this.anIntArray253[local19];
					if (this.aByteArray35 != null && local7 != -1) {
						local9 += this.aByteArray35[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;II[I[I)V")
	private void method1811(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2264;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1705; local12++) {
			@Pc(20) int local20 = arg0.aByteArray12[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class50 local40 = arg0.method1216(local12, local6 + 1);
					local6 = -1;
					if (local40.method1236(Static154.aClass50_769)) {
						local20 = 60;
					} else if (local40.method1236(Static154.aClass50_772)) {
						local20 = 62;
					} else if (local40.method1236(Static154.aClass50_771)) {
						local20 = 160;
					} else if (local40.method1236(Static154.aClass50_765)) {
						local20 = 173;
					} else if (local40.method1236(Static154.aClass50_763)) {
						local20 = 215;
					} else if (local40.method1236(Static154.aClass50_776)) {
						local20 = 128;
					} else if (local40.method1236(Static154.aClass50_762)) {
						local20 = 169;
					} else {
						if (!local40.method1236(Static154.aClass50_760)) {
							if (local40.method1240(Static154.aClass50_761)) {
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
									local137 = local40.method1244(4).method1235();
									@Pc(142) Class78 local142 = this.aClass78Array4[local137];
									@Pc(153) int local153 = this.anIntArray250 == null ? local142.anInt3807 : this.anIntArray250[local137];
									if (Static154.anInt2275 == 256) {
										local142.method3017(arg1 + local117, local4 + this.anInt2264 - local153 + local126);
									} else {
										local142.method3014(arg1 + local117, local4 + this.anInt2264 - local153 + local126, Static154.anInt2275);
									}
									arg1 += local142.anInt3814;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method1819(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray35 != null && local8 != -1) {
						arg1 += this.aByteArray35[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray252[local20];
					local117 = this.anIntArray249[local20];
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
						if (Static154.anInt2268 > 0) {
							Static154.anInt2269 += Static154.anInt2268;
							arg1 += Static154.anInt2269 >> 8;
							Static154.anInt2269 &= 0xFF;
						}
					} else if (Static154.anInt2275 == 256) {
						if (Static154.anInt2267 != -1) {
							this.method1835(local20, arg1 + this.anIntArray248[local20] + local126 + 1, local4 + this.anIntArray251[local20] + 1 + local137, local223, local117, Static154.anInt2267);
						}
						this.method1835(local20, arg1 + this.anIntArray248[local20] + local126, local4 + this.anIntArray251[local20] + local137, local223, local117, Static154.anInt2274);
					} else {
						if (Static154.anInt2267 != -1) {
							this.method1830(local20, arg1 + this.anIntArray248[local20] + local126 + 1, local4 + this.anIntArray251[local20] + 1 + local137, local223, local117, Static154.anInt2267, Static154.anInt2275);
						}
						this.method1830(local20, arg1 + this.anIntArray248[local20] + local126, local4 + this.anIntArray251[local20] + local137, local223, local117, Static154.anInt2274, Static154.anInt2275);
					}
					@Pc(384) int local384 = this.anIntArray253[local20];
					if (Static154.anInt2266 != -1) {
						Static29.method415(arg1, local4 + (int) ((double) this.anInt2264 * 0.7D), local384, Static154.anInt2266);
					}
					if (Static154.anInt2272 != -1) {
						Static29.method415(arg1, local4 + this.anInt2264, local384, Static154.anInt2272);
					}
					arg1 += local384;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)V")
	private void method1812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static154.anInt2266 = -1;
		Static154.anInt2272 = -1;
		Static154.anInt2273 = arg1;
		Static154.anInt2267 = arg1;
		Static154.anInt2271 = arg0;
		Static154.anInt2274 = arg0;
		Static154.anInt2270 = arg2;
		Static154.anInt2275 = arg2;
		Static154.anInt2268 = 0;
		Static154.anInt2269 = 0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;IIIILjava/util/Random;I)I")
	public final int method1814(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1812(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt1705];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1705; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1811(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;[I[Lclient!hh;)I")
	public final int method1815(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class50[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static154.aClass50_775.method1247();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1249();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1241(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class50 local55 = arg0.method1216(local29, local19 + 1);
					local19 = -1;
					Static154.aClass50_775.method1255(60);
					Static154.aClass50_775.method1259(local55);
					Static154.aClass50_775.method1255(62);
					if (local55.method1236(Static154.aClass50_778)) {
						if (arg2[local23] == null) {
							arg2[local23] = Static154.aClass50_775.method1216(Static154.aClass50_775.method1249(), local11);
						} else {
							arg2[local23].method1247();
							arg2[local23] = arg2[local23].method1238(Static154.aClass50_775, Static154.aClass50_775.method1249(), local11);
						}
						local23++;
						local11 = Static154.aClass50_775.method1249();
						local9 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1236(Static154.aClass50_769)) {
						local9 += this.method1821(60);
						if (this.aByteArray35 != null && local21 != -1) {
							local9 += this.aByteArray35[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1236(Static154.aClass50_772)) {
						local9 += this.method1821(62);
						if (this.aByteArray35 != null && local21 != -1) {
							local9 += this.aByteArray35[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1236(Static154.aClass50_771)) {
						local9 += this.method1821(160);
						if (this.aByteArray35 != null && local21 != -1) {
							local9 += this.aByteArray35[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method1236(Static154.aClass50_765)) {
						local9 += this.method1821(173);
						if (this.aByteArray35 != null && local21 != -1) {
							local9 += this.aByteArray35[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method1236(Static154.aClass50_763)) {
						local9 += this.method1821(215);
						if (this.aByteArray35 != null && local21 != -1) {
							local9 += this.aByteArray35[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method1236(Static154.aClass50_776)) {
						local9 += this.method1821(128);
						if (this.aByteArray35 != null && local21 != -1) {
							local9 += this.aByteArray35[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method1236(Static154.aClass50_762)) {
						local9 += this.method1821(169);
						if (this.aByteArray35 != null && local21 != -1) {
							local9 += this.aByteArray35[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method1236(Static154.aClass50_760)) {
						local9 += this.method1821(174);
						if (this.aByteArray35 != null && local21 != -1) {
							local9 += this.aByteArray35[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method1240(Static154.aClass50_761)) {
						try {
							@Pc(383) int local383 = local55.method1244(4).method1235();
							local9 += this.aClass78Array4[local383].anInt3814;
							local21 = -1;
						} catch (@Pc(395) Exception local395) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						Static154.aClass50_775.method1255(local35);
						local9 += this.method1821(local35);
						if (this.aByteArray35 != null && local21 != -1) {
							local9 += this.aByteArray35[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = Static154.aClass50_775.method1249();
						local15 = local9;
						local17 = 1;
					}
					if (arg1 != null && local9 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						if (arg2[local23] == null) {
							arg2[local23] = Static154.aClass50_775.method1216(local13 - local17, local11);
						} else {
							arg2[local23].method1247();
							arg2[local23] = arg2[local23].method1238(Static154.aClass50_775, local13 - local17, local11);
						}
						local23++;
						local11 = local13;
						local13 = -1;
						local9 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = Static154.aClass50_775.method1249();
						local15 = local9;
						local17 = 0;
					}
				}
			}
		}
		if (Static154.aClass50_775.method1249() > local11) {
			if (arg2[local23] == null) {
				arg2[local23] = Static154.aClass50_775.method1216(Static154.aClass50_775.method1249(), local11);
			} else {
				arg2[local23].method1247();
				arg2[local23] = arg2[local23].method1238(Static154.aClass50_775, Static154.aClass50_775.method1249(), local11);
			}
			local23++;
		}
		return local23;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	private void method1816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static154.anInt2266 = -1;
		Static154.anInt2272 = -1;
		Static154.anInt2273 = arg1;
		Static154.anInt2267 = arg1;
		Static154.anInt2271 = arg0;
		Static154.anInt2274 = arg0;
		Static154.anInt2270 = 256;
		Static154.anInt2275 = 256;
		Static154.anInt2268 = 0;
		Static154.anInt2269 = 0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;IIIIII)V")
	public final void method1817(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1816(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1705];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1705; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1811(arg0, arg1 - this.method1810(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;IIIIIIIII)I")
	public final int method1818(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1809(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Lclient!hh;)V")
	private void method1819(@OriginalArg(0) Class50 arg0) {
		try {
			if (arg0.method1240(Static154.aClass50_757)) {
				Static154.anInt2274 = arg0.method1244(4).method1225(16);
				return;
			}
			if (arg0.method1236(Static154.aClass50_770)) {
				Static154.anInt2274 = Static154.anInt2271;
				return;
			}
			if (arg0.method1240(Static154.aClass50_773)) {
				Static154.anInt2275 = arg0.method1244(6).method1235();
				return;
			}
			if (arg0.method1236(Static154.aClass50_779)) {
				Static154.anInt2275 = Static154.anInt2270;
				return;
			}
			if (arg0.method1240(Static154.aClass50_767)) {
				Static154.anInt2266 = arg0.method1244(4).method1225(16);
				return;
			}
			if (arg0.method1236(Static154.aClass50_758)) {
				Static154.anInt2266 = 8388608;
				return;
			}
			if (arg0.method1236(Static154.aClass50_759)) {
				Static154.anInt2266 = -1;
				return;
			}
			if (arg0.method1240(Static154.aClass50_764)) {
				Static154.anInt2272 = arg0.method1244(2).method1225(16);
				return;
			}
			if (arg0.method1236(Static154.aClass50_766)) {
				Static154.anInt2272 = 0;
				return;
			}
			if (arg0.method1236(Static154.aClass50_768)) {
				Static154.anInt2272 = -1;
				return;
			}
			if (arg0.method1240(Static154.aClass50_780)) {
				Static154.anInt2267 = arg0.method1244(5).method1225(16);
				return;
			}
			if (arg0.method1236(Static154.aClass50_777)) {
				Static154.anInt2267 = 0;
				return;
			}
			if (arg0.method1236(Static154.aClass50_774)) {
				Static154.anInt2267 = Static154.anInt2273;
				return;
			}
			if (arg0.method1236(Static154.aClass50_778)) {
				this.method1812(Static154.anInt2271, Static154.anInt2273, Static154.anInt2270);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;IIII)V")
	public final void method1820(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1816(arg3, arg4);
			this.method1825(arg0, arg1 - this.method1810(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)I")
	private int method1821(@OriginalArg(0) int arg0) {
		return this.anIntArray253[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;I)I")
	public final int method1822(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1815(arg0, new int[] { arg1 }, Static154.aClass50Array41);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1810(Static154.aClass50Array41[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;IIIII)V")
	public final void method1823(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1816(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1705];
		@Pc(14) int[] local14 = new int[arg0.anInt1705];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1705; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1811(arg0, arg1 - this.method1810(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hh;II)V")
	private void method1825(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2264;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1705; local10++) {
			@Pc(18) int local18 = arg0.aByteArray12[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class50 local38 = arg0.method1216(local10, local6 + 1);
					local6 = -1;
					if (local38.method1236(Static154.aClass50_769)) {
						local18 = 60;
					} else if (local38.method1236(Static154.aClass50_772)) {
						local18 = 62;
					} else if (local38.method1236(Static154.aClass50_771)) {
						local18 = 160;
					} else if (local38.method1236(Static154.aClass50_765)) {
						local18 = 173;
					} else if (local38.method1236(Static154.aClass50_763)) {
						local18 = 215;
					} else if (local38.method1236(Static154.aClass50_776)) {
						local18 = 128;
					} else if (local38.method1236(Static154.aClass50_762)) {
						local18 = 169;
					} else {
						if (!local38.method1236(Static154.aClass50_760)) {
							if (local38.method1240(Static154.aClass50_761)) {
								try {
									local116 = local38.method1244(4).method1235();
									@Pc(121) Class78 local121 = this.aClass78Array4[local116];
									@Pc(132) int local132 = this.anIntArray250 == null ? local121.anInt3807 : this.anIntArray250[local116];
									if (Static154.anInt2275 == 256) {
										local121.method3017(arg1, local4 + this.anInt2264 - local132);
									} else {
										local121.method3014(arg1, local4 + this.anInt2264 - local132, Static154.anInt2275);
									}
									arg1 += local121.anInt3814;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method1819(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray35 != null && local8 != -1) {
						arg1 += this.aByteArray35[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray252[local18];
					local116 = this.anIntArray249[local18];
					if (local18 == 32) {
						if (Static154.anInt2268 > 0) {
							Static154.anInt2269 += Static154.anInt2268;
							arg1 += Static154.anInt2269 >> 8;
							Static154.anInt2269 &= 0xFF;
						}
					} else if (Static154.anInt2275 == 256) {
						if (Static154.anInt2267 != -1) {
							this.method1835(local18, arg1 + this.anIntArray248[local18] + 1, local4 + this.anIntArray251[local18] + 1, local194, local116, Static154.anInt2267);
						}
						this.method1835(local18, arg1 + this.anIntArray248[local18], local4 + this.anIntArray251[local18], local194, local116, Static154.anInt2274);
					} else {
						if (Static154.anInt2267 != -1) {
							this.method1830(local18, arg1 + this.anIntArray248[local18] + 1, local4 + this.anIntArray251[local18] + 1, local194, local116, Static154.anInt2267, Static154.anInt2275);
						}
						this.method1830(local18, arg1 + this.anIntArray248[local18], local4 + this.anIntArray251[local18], local194, local116, Static154.anInt2274, Static154.anInt2275);
					}
					@Pc(320) int local320 = this.anIntArray253[local18];
					if (Static154.anInt2266 != -1) {
						Static29.method415(arg1, local4 + (int) ((double) this.anInt2264 * 0.7D), local320, Static154.anInt2266);
					}
					if (Static154.anInt2272 != -1) {
						Static29.method415(arg1, local4 + this.anInt2264 + 1, local320, Static154.anInt2272);
					}
					arg1 += local320;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Lclient!hh;IIII)V")
	public final void method1826(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1816(arg3, arg4);
			this.method1825(arg0, arg1 - this.method1810(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([B)V")
	private void method1827(@OriginalArg(0) byte[] arg0) {
		this.anIntArray253 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray253.length; local9++) {
				this.anIntArray253[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2264 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray253[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray35 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray35[(local182 << 8) + local150] = (byte) Static154.method1831(local93, local136, local58, this.anIntArray253, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2264 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Lclient!hh;IIIII)V")
	public final void method1828(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1816(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1705];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1705; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1811(arg0, arg1 - this.method1810(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Lclient!hh;I)I")
	public final int method1829(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1) {
		return this.method1815(arg0, new int[] { arg1 }, Static154.aClass50Array41);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([Lclient!ne;[I)V")
	public final void method1832(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass78Array4 = arg0;
		this.anIntArray250 = arg1;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(Lclient!hh;I)V")
	private void method1833(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1249(); local5++) {
			@Pc(11) int local11 = arg0.method1241(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static154.anInt2268 = (arg1 - this.method1810(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(Lclient!hh;IIII)V")
	public final void method1834(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1816(arg3, arg4);
			this.method1825(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
