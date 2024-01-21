import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public abstract class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "[Lclient!hh;")
	private Class42[] aClass42Array8;

	@OriginalMember(owner = "client!ji", name = "Y", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!ji", name = "ib", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!ji", name = "jb", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
	public int anInt2021 = 0;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!ji", name = "mb", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!ji", name = "S", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!ji", name = "kb", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!ji", name = "ob", descriptor = "I")
	private int anInt2024;

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
	private int anInt2018;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class2_Sub1_Sub12(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray189 = arg1;
		this.anIntArray194 = arg2;
		this.anIntArray190 = arg3;
		this.anIntArray193 = arg4;
		this.method1362(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray194[local25] < local21 && this.anIntArray193[local25] != 0) {
				local21 = this.anIntArray194[local25];
			}
			if (this.anIntArray194[local25] + this.anIntArray193[local25] > local23) {
				local23 = this.anIntArray194[local25] + this.anIntArray193[local25];
			}
		}
		this.anInt2024 = this.anInt2021 - local21;
		this.anInt2018 = local23 - this.anInt2021;
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub12(@OriginalArg(0) byte[] arg0) {
		this.method1362(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;IIIILjava/util/Random;I)I")
	public final int method1356(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1377(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt2653];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2653; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1359(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;IIIII)V")
	public final void method1358(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1369(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2653];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2653; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1359(arg0, arg1 - this.method1384(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;II[I[I)V")
	private void method1359(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2021;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2653; local12++) {
			@Pc(20) int local20 = arg0.aByteArray28[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class62 local40 = arg0.method1862(local6 + 1, local12);
					local6 = -1;
					if (local40.method1870(Static98.aClass62_698)) {
						local20 = 60;
					} else if (local40.method1870(Static98.aClass62_710)) {
						local20 = 62;
					} else if (local40.method1870(Static98.aClass62_711)) {
						local20 = 160;
					} else if (local40.method1870(Static98.aClass62_702)) {
						local20 = 173;
					} else if (local40.method1870(Static98.aClass62_707)) {
						local20 = 215;
					} else if (local40.method1870(Static98.aClass62_690)) {
						local20 = 128;
					} else if (local40.method1870(Static98.aClass62_697)) {
						local20 = 169;
					} else {
						if (!local40.method1870(Static98.aClass62_712)) {
							if (local40.method1880(Static98.aClass62_694)) {
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
									local137 = local40.method1849(4).method1853();
									@Pc(142) Class42 local142 = this.aClass42Array8[local137];
									@Pc(153) int local153 = this.anIntArray191 == null ? local142.anInt3589 : this.anIntArray191[local137];
									if (Static98.anInt2022 == 256) {
										local142.method2468(arg1 + local117, local4 + this.anInt2021 - local153 + local126);
									} else {
										local142.method2470(arg1 + local117, local4 + this.anInt2021 - local153 + local126, Static98.anInt2022);
									}
									arg1 += local142.anInt3592;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method1368(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray24 != null && local8 != -1) {
						arg1 += this.aByteArray24[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray190[local20];
					local117 = this.anIntArray193[local20];
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
						if (Static98.anInt2014 > 0) {
							Static98.anInt2020 += Static98.anInt2014;
							arg1 += Static98.anInt2020 >> 8;
							Static98.anInt2020 &= 0xFF;
						}
					} else if (Static98.anInt2022 == 256) {
						if (Static98.anInt2026 != -1) {
							this.method1364(local20, arg1 + this.anIntArray189[local20] + local126 + 1, local4 + this.anIntArray194[local20] + 1 + local137, local223, local117, Static98.anInt2026);
						}
						this.method1361(local20, arg1 + this.anIntArray189[local20] + local126, local4 + this.anIntArray194[local20] + local137, local223, local117, Static98.anInt2016);
					} else {
						if (Static98.anInt2026 != -1) {
							this.method1357(local20, arg1 + this.anIntArray189[local20] + local126 + 1, local4 + this.anIntArray194[local20] + 1 + local137, local223, local117, Static98.anInt2026, Static98.anInt2022);
						}
						this.method1379(local20, arg1 + this.anIntArray189[local20] + local126, local4 + this.anIntArray194[local20] + local137, local223, local117, Static98.anInt2016, Static98.anInt2022);
					}
					@Pc(380) int local380 = this.anIntArray192[local20];
					if (Static98.anInt2017 != -1) {
						Static212.method3090(arg1, local4 + (int) ((double) this.anInt2021 * 0.7D), local380, Static98.anInt2017);
					}
					if (Static98.anInt2023 != -1) {
						Static212.method3090(arg1, local4 + this.anInt2021, local380, Static98.anInt2023);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;I)I")
	public final int method1360(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1373(arg0, new int[] { arg1 }, Static98.aClass62Array61);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1384(Static98.aClass62Array61[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method1361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([B)V")
	private void method1362(@OriginalArg(0) byte[] arg0) {
		this.anIntArray192 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray192.length; local9++) {
				this.anIntArray192[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2021 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray192[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray24 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray24[(local182 << 8) + local150] = (byte) Static98.method1376(local93, local136, local58, this.anIntArray192, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2021 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Lclient!mb;IIIII)V")
	public final void method1363(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1369(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2653];
		@Pc(14) int[] local14 = new int[arg0.anInt2653];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2653; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1359(arg0, arg1 - this.method1384(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Lclient!mb;I)I")
	public final int method1365(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		return this.method1373(arg0, new int[] { arg1 }, Static98.aClass62Array61);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;IIII)V")
	public final void method1366(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1369(arg3, arg4);
			this.method1367(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method1367(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2021;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2653; local10++) {
			@Pc(18) int local18 = arg0.aByteArray28[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class62 local38 = arg0.method1862(local6 + 1, local10);
					local6 = -1;
					if (local38.method1870(Static98.aClass62_698)) {
						local18 = 60;
					} else if (local38.method1870(Static98.aClass62_710)) {
						local18 = 62;
					} else if (local38.method1870(Static98.aClass62_711)) {
						local18 = 160;
					} else if (local38.method1870(Static98.aClass62_702)) {
						local18 = 173;
					} else if (local38.method1870(Static98.aClass62_707)) {
						local18 = 215;
					} else if (local38.method1870(Static98.aClass62_690)) {
						local18 = 128;
					} else if (local38.method1870(Static98.aClass62_697)) {
						local18 = 169;
					} else {
						if (!local38.method1870(Static98.aClass62_712)) {
							if (local38.method1880(Static98.aClass62_694)) {
								try {
									local116 = local38.method1849(4).method1853();
									@Pc(121) Class42 local121 = this.aClass42Array8[local116];
									@Pc(132) int local132 = this.anIntArray191 == null ? local121.anInt3589 : this.anIntArray191[local116];
									if (Static98.anInt2022 == 256) {
										local121.method2468(arg1, local4 + this.anInt2021 - local132);
									} else {
										local121.method2470(arg1, local4 + this.anInt2021 - local132, Static98.anInt2022);
									}
									arg1 += local121.anInt3592;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method1368(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray24 != null && local8 != -1) {
						arg1 += this.aByteArray24[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray190[local18];
					local116 = this.anIntArray193[local18];
					if (local18 == 32) {
						if (Static98.anInt2014 > 0) {
							Static98.anInt2020 += Static98.anInt2014;
							arg1 += Static98.anInt2020 >> 8;
							Static98.anInt2020 &= 0xFF;
						}
					} else if (Static98.anInt2022 == 256) {
						if (Static98.anInt2026 != -1) {
							this.method1364(local18, arg1 + this.anIntArray189[local18] + 1, local4 + this.anIntArray194[local18] + 1, local194, local116, Static98.anInt2026);
						}
						this.method1361(local18, arg1 + this.anIntArray189[local18], local4 + this.anIntArray194[local18], local194, local116, Static98.anInt2016);
					} else {
						if (Static98.anInt2026 != -1) {
							this.method1357(local18, arg1 + this.anIntArray189[local18] + 1, local4 + this.anIntArray194[local18] + 1, local194, local116, Static98.anInt2026, Static98.anInt2022);
						}
						this.method1379(local18, arg1 + this.anIntArray189[local18], local4 + this.anIntArray194[local18], local194, local116, Static98.anInt2016, Static98.anInt2022);
					}
					@Pc(316) int local316 = this.anIntArray192[local18];
					if (Static98.anInt2017 != -1) {
						Static212.method3090(arg1, local4 + (int) ((double) this.anInt2021 * 0.7D), local316, Static98.anInt2017);
					}
					if (Static98.anInt2023 != -1) {
						Static212.method3090(arg1, local4 + this.anInt2021 + 1, local316, Static98.anInt2023);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;)V")
	private void method1368(@OriginalArg(0) Class62 arg0) {
		try {
			if (arg0.method1880(Static98.aClass62_700)) {
				Static98.anInt2016 = arg0.method1849(4).method1873(16);
				return;
			}
			if (arg0.method1870(Static98.aClass62_699)) {
				Static98.anInt2016 = Static98.anInt2019;
				return;
			}
			if (arg0.method1880(Static98.aClass62_709)) {
				Static98.anInt2022 = arg0.method1849(6).method1853();
				return;
			}
			if (arg0.method1870(Static98.aClass62_701)) {
				Static98.anInt2022 = Static98.anInt2025;
				return;
			}
			if (arg0.method1880(Static98.aClass62_704)) {
				Static98.anInt2017 = arg0.method1849(4).method1873(16);
				return;
			}
			if (arg0.method1870(Static98.aClass62_692)) {
				Static98.anInt2017 = 8388608;
				return;
			}
			if (arg0.method1870(Static98.aClass62_691)) {
				Static98.anInt2017 = -1;
				return;
			}
			if (arg0.method1880(Static98.aClass62_708)) {
				Static98.anInt2023 = arg0.method1849(2).method1873(16);
				return;
			}
			if (arg0.method1870(Static98.aClass62_706)) {
				Static98.anInt2023 = 0;
				return;
			}
			if (arg0.method1870(Static98.aClass62_696)) {
				Static98.anInt2023 = -1;
				return;
			}
			if (arg0.method1880(Static98.aClass62_703)) {
				Static98.anInt2026 = arg0.method1849(5).method1873(16);
				return;
			}
			if (arg0.method1870(Static98.aClass62_705)) {
				Static98.anInt2026 = 0;
				return;
			}
			if (arg0.method1870(Static98.aClass62_693)) {
				Static98.anInt2026 = Static98.anInt2015;
				return;
			}
			if (arg0.method1870(Static98.aClass62_695)) {
				this.method1377(Static98.anInt2019, Static98.anInt2015, Static98.anInt2025);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V")
	private void method1369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static98.anInt2017 = -1;
		Static98.anInt2023 = -1;
		Static98.anInt2015 = arg1;
		Static98.anInt2026 = arg1;
		Static98.anInt2019 = arg0;
		Static98.anInt2016 = arg0;
		Static98.anInt2025 = 256;
		Static98.anInt2022 = 256;
		Static98.anInt2014 = 0;
		Static98.anInt2020 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Lclient!mb;IIII)V")
	public final void method1370(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1369(arg3, arg4);
			this.method1367(arg0, arg1 - this.method1384(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)I")
	private int method1371(@OriginalArg(0) int arg0) {
		return this.anIntArray192[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;[I[Lclient!mb;)I")
	private int method1373(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class62[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class62 local11 = Static206.method277(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1878();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1857(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class62 local55 = arg0.method1862(local19 + 1, local29);
					local19 = -1;
					local11.method1859(60);
					local11.method1871(local55);
					local11.method1859(62);
					if (local55.method1870(Static98.aClass62_695)) {
						arg2[local23++] = local11.method1862(local7, local11.method1878());
						local7 = local11.method1878();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1870(Static98.aClass62_698)) {
						local5 += this.method1371(60);
						if (this.aByteArray24 != null && local21 != -1) {
							local5 += this.aByteArray24[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1870(Static98.aClass62_710)) {
						local5 += this.method1371(62);
						if (this.aByteArray24 != null && local21 != -1) {
							local5 += this.aByteArray24[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1870(Static98.aClass62_711)) {
						local5 += this.method1371(160);
						if (this.aByteArray24 != null && local21 != -1) {
							local5 += this.aByteArray24[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method1870(Static98.aClass62_702)) {
						local5 += this.method1371(173);
						if (this.aByteArray24 != null && local21 != -1) {
							local5 += this.aByteArray24[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method1870(Static98.aClass62_707)) {
						local5 += this.method1371(215);
						if (this.aByteArray24 != null && local21 != -1) {
							local5 += this.aByteArray24[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method1870(Static98.aClass62_690)) {
						local5 += this.method1371(128);
						if (this.aByteArray24 != null && local21 != -1) {
							local5 += this.aByteArray24[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method1870(Static98.aClass62_697)) {
						local5 += this.method1371(169);
						if (this.aByteArray24 != null && local21 != -1) {
							local5 += this.aByteArray24[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method1870(Static98.aClass62_712)) {
						local5 += this.method1371(174);
						if (this.aByteArray24 != null && local21 != -1) {
							local5 += this.aByteArray24[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method1880(Static98.aClass62_694)) {
						try {
							@Pc(359) int local359 = local55.method1849(4).method1853();
							local5 += this.aClass42Array8[local359].anInt3592;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1859(local35);
						local5 += this.method1371(local35);
						if (this.aByteArray24 != null && local21 != -1) {
							local5 += this.aByteArray24[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1878();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1862(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1878();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1878() > local7) {
			arg2[local23++] = local11.method1862(local7, local11.method1878());
		}
		return local23;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(Lclient!mb;IIII)V")
	public final void method1374(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1369(arg3, arg4);
			this.method1367(arg0, arg1 - this.method1384(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(Lclient!mb;I)V")
	private void method1375(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1878(); local5++) {
			@Pc(11) int local11 = arg0.method1857(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static98.anInt2014 = (arg1 - this.method1384(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
	private void method1377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static98.anInt2017 = -1;
		Static98.anInt2023 = -1;
		Static98.anInt2015 = arg1;
		Static98.anInt2026 = arg1;
		Static98.anInt2019 = arg0;
		Static98.anInt2016 = arg0;
		Static98.anInt2025 = arg2;
		Static98.anInt2022 = arg2;
		Static98.anInt2014 = 0;
		Static98.anInt2020 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method1379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;IIIIIIIIII)I")
	private int method1380(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1377(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt2021;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt2024 + this.anInt2018 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1373(arg0, local20, Static98.aClass62Array61);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt2024;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt2024 + (arg4 - this.anInt2024 - this.anInt2018 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt2018 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt2024 - this.anInt2018 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt2024 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1367(Static98.aClass62Array61[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1367(Static98.aClass62Array61[local118], arg1 + (arg3 - this.method1384(Static98.aClass62Array61[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1367(Static98.aClass62Array61[local118], arg1 + arg3 - this.method1384(Static98.aClass62Array61[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1367(Static98.aClass62Array61[local118], arg1, local57);
			} else {
				this.method1375(Static98.aClass62Array61[local118], arg3);
				this.method1367(Static98.aClass62Array61[local118], arg1, local57);
				Static98.anInt2014 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;IIIIII)V")
	public final void method1381(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1369(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2653];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2653; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1359(arg0, arg1 - this.method1384(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mb;IIIIIIIII)I")
	public final int method1382(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([Lclient!hh;[I)V")
	public final void method1383(@OriginalArg(0) Class42[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass42Array8 = arg0;
		this.anIntArray191 = arg1;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(Lclient!mb;)I")
	public final int method1384(@OriginalArg(0) Class62 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2653; local11++) {
			@Pc(19) int local19 = arg0.aByteArray28[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class62 local39 = arg0.method1862(local5 + 1, local11);
					local5 = -1;
					if (local39.method1870(Static98.aClass62_698)) {
						local19 = 60;
					} else if (local39.method1870(Static98.aClass62_710)) {
						local19 = 62;
					} else if (local39.method1870(Static98.aClass62_711)) {
						local19 = 160;
					} else if (local39.method1870(Static98.aClass62_702)) {
						local19 = 173;
					} else if (local39.method1870(Static98.aClass62_707)) {
						local19 = 215;
					} else if (local39.method1870(Static98.aClass62_690)) {
						local19 = 128;
					} else if (local39.method1870(Static98.aClass62_697)) {
						local19 = 169;
					} else {
						if (!local39.method1870(Static98.aClass62_712)) {
							if (local39.method1880(Static98.aClass62_694)) {
								try {
									@Pc(117) int local117 = local39.method1849(4).method1853();
									local9 += this.aClass42Array8[local117].anInt3592;
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
					local9 += this.anIntArray192[local19];
					if (this.aByteArray24 != null && local7 != -1) {
						local9 += this.aByteArray24[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}
}
