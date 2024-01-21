import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public abstract class Class3_Sub2_Sub2_Sub1 extends Class3_Sub2_Sub2 {

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "[I")
	private int[] anIntArray378;

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
	public int anInt2310 = 0;

	@OriginalMember(owner = "client!bb", name = "mb", descriptor = "[[B")
	protected byte[][] aByteArrayArray58 = new byte[256][];

	@OriginalMember(owner = "client!bb", name = "db", descriptor = "[I")
	private int[] anIntArray376;

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "[I")
	private int[] anIntArray379;

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
	private int anInt2311;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
	private int anInt2308;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class3_Sub2_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray376 = arg1;
		this.anIntArray379 = arg2;
		this.anIntArray375 = arg3;
		this.anIntArray377 = arg4;
		this.method1791(arg0);
		this.aByteArrayArray58 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray379[local32] < local28 && this.anIntArray377[local32] != 0) {
				local28 = this.anIntArray379[local32];
			}
			if (this.anIntArray379[local32] + this.anIntArray377[local32] > local30) {
				local30 = this.anIntArray379[local32] + this.anIntArray377[local32];
			}
		}
		this.anInt2311 = this.anInt2310 - local28;
		this.anInt2308 = local30 - this.anInt2310;
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub2_Sub2_Sub1(@OriginalArg(0) byte[] arg0) {
		this.method1791(arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;IIIILjava/util/Random;I)I")
	public final int method1782(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1807(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt1118];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1118; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1790(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;IIIIII)V")
	public final void method1783(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1800(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1118];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1118; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1790(arg0, arg1 - this.method1805(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V")
	private void method1784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static147.anInt2304;
		@Pc(9) int local9 = Static147.anInt2304 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static147.anInt2299) {
			local20 = Static147.anInt2299 - arg2;
			arg4 -= local20;
			arg2 = Static147.anInt2299;
			local13 = local20 * arg3;
			local5 += local20 * Static147.anInt2304;
		}
		if (arg2 + arg4 > Static147.anInt2300) {
			arg4 -= arg2 + arg4 - Static147.anInt2300;
		}
		if (arg1 < Static147.anInt2301) {
			local20 = Static147.anInt2301 - arg1;
			arg3 -= local20;
			arg1 = Static147.anInt2301;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static147.anInt2303) {
			local20 = arg1 + arg3 - Static147.anInt2303;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static10.method1806(Static147.anIntArray374, this.aByteArrayArray58[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;I)I")
	public final int method1785(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1801(arg0, new int[] { arg1 }, Static10.aClass28Array14);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1805(Static10.aClass28Array14[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;IIII)V")
	public final void method1787(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1800(arg3, arg4);
			this.method1792(arg0, arg1 - this.method1805(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method1788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;II[I[I)V")
	private void method1790(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2310;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1118; local12++) {
			@Pc(20) int local20 = arg0.aByteArray15[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class28 local40 = arg0.method926(local12, local6 + 1);
					local6 = -1;
					if (local40.method934(Static10.aClass28_710)) {
						local20 = 60;
					} else if (local40.method934(Static10.aClass28_717)) {
						local20 = 62;
					} else if (local40.method934(Static10.aClass28_715)) {
						local20 = 160;
					} else if (local40.method934(Static10.aClass28_728)) {
						local20 = 173;
					} else if (local40.method934(Static10.aClass28_716)) {
						local20 = 215;
					} else if (local40.method934(Static10.aClass28_711)) {
						local20 = 128;
					} else if (local40.method934(Static10.aClass28_719)) {
						local20 = 169;
					} else {
						if (!local40.method934(Static10.aClass28_723)) {
							if (local40.method918(Static10.aClass28_713)) {
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
									local137 = local40.method905(4).method929();
									@Pc(141) Class3_Sub2_Sub2_Sub3 local141 = Static10.aClass3_Sub2_Sub2_Sub3Array6[local137];
									if (Static10.anInt2305 == 256) {
										local141.method840(arg1 + local117, local4 + this.anInt2310 - local141.anInt1015 + local126);
									} else {
										local141.method841(arg1 + local117, local4 + this.anInt2310 - local141.anInt1015 + local126, Static10.anInt2305);
									}
									arg1 += local141.anInt1010;
									local8 = -1;
								} catch (@Pc(183) Exception local183) {
								}
							} else {
								this.method1793(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray21 != null && local8 != -1) {
						arg1 += this.aByteArray21[(local8 << 8) + local20];
					}
					@Pc(213) int local213 = this.anIntArray375[local20];
					local117 = this.anIntArray377[local20];
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
						if (Static10.anInt2314 > 0) {
							Static10.anInt2312 += Static10.anInt2314;
							arg1 += Static10.anInt2312 >> 8;
							Static10.anInt2312 &= 0xFF;
						}
					} else if (Static10.anInt2305 == 256) {
						if (Static10.anInt2313 != -1) {
							this.method1809(local20, arg1 + this.anIntArray376[local20] + local126 + 1, local4 + this.anIntArray379[local20] + 1 + local137, local213, local117, Static10.anInt2313);
						}
						this.method1804(local20, arg1 + this.anIntArray376[local20] + local126, local4 + this.anIntArray379[local20] + local137, local213, local117, Static10.anInt2307);
					} else {
						if (Static10.anInt2313 != -1) {
							this.method1784(local20, arg1 + this.anIntArray376[local20] + local126 + 1, local4 + this.anIntArray379[local20] + 1 + local137, local213, local117, Static10.anInt2313, Static10.anInt2305);
						}
						this.method1788(local20, arg1 + this.anIntArray376[local20] + local126, local4 + this.anIntArray379[local20] + local137, local213, local117, Static10.anInt2307, Static10.anInt2305);
					}
					@Pc(370) int local370 = this.anIntArray378[local20];
					if (Static10.anInt2315 != -1) {
						Static147.method1767(arg1, local4 + (int) ((double) this.anInt2310 * 0.7D), local370, Static10.anInt2315);
					}
					if (Static10.anInt2306 != -1) {
						Static147.method1767(arg1, local4 + this.anInt2310, local370, Static10.anInt2306);
					}
					arg1 += local370;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([B)V")
	private void method1791(@OriginalArg(0) byte[] arg0) {
		this.anIntArray378 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray378.length; local9++) {
				this.anIntArray378[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2310 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray378[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray21 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray21[(local182 << 8) + local150] = (byte) Static10.method1789(local93, local136, local58, this.anIntArray378, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2310 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;II)V")
	private void method1792(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2310;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1118; local10++) {
			@Pc(18) int local18 = arg0.aByteArray15[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class28 local38 = arg0.method926(local10, local6 + 1);
					local6 = -1;
					if (local38.method934(Static10.aClass28_710)) {
						local18 = 60;
					} else if (local38.method934(Static10.aClass28_717)) {
						local18 = 62;
					} else if (local38.method934(Static10.aClass28_715)) {
						local18 = 160;
					} else if (local38.method934(Static10.aClass28_728)) {
						local18 = 173;
					} else if (local38.method934(Static10.aClass28_716)) {
						local18 = 215;
					} else if (local38.method934(Static10.aClass28_711)) {
						local18 = 128;
					} else if (local38.method934(Static10.aClass28_719)) {
						local18 = 169;
					} else {
						if (!local38.method934(Static10.aClass28_723)) {
							if (local38.method918(Static10.aClass28_713)) {
								try {
									local116 = local38.method905(4).method929();
									@Pc(120) Class3_Sub2_Sub2_Sub3 local120 = Static10.aClass3_Sub2_Sub2_Sub3Array6[local116];
									if (Static10.anInt2305 == 256) {
										local120.method840(arg1, local4 + this.anInt2310 - local120.anInt1015);
									} else {
										local120.method841(arg1, local4 + this.anInt2310 - local120.anInt1015, Static10.anInt2305);
									}
									arg1 += local120.anInt1010;
									local8 = -1;
								} catch (@Pc(154) Exception local154) {
								}
							} else {
								this.method1793(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray21 != null && local8 != -1) {
						arg1 += this.aByteArray21[(local8 << 8) + local18];
					}
					@Pc(184) int local184 = this.anIntArray375[local18];
					local116 = this.anIntArray377[local18];
					if (local18 == 32) {
						if (Static10.anInt2314 > 0) {
							Static10.anInt2312 += Static10.anInt2314;
							arg1 += Static10.anInt2312 >> 8;
							Static10.anInt2312 &= 0xFF;
						}
					} else if (Static10.anInt2305 == 256) {
						if (Static10.anInt2313 != -1) {
							this.method1809(local18, arg1 + this.anIntArray376[local18] + 1, local4 + this.anIntArray379[local18] + 1, local184, local116, Static10.anInt2313);
						}
						this.method1804(local18, arg1 + this.anIntArray376[local18], local4 + this.anIntArray379[local18], local184, local116, Static10.anInt2307);
					} else {
						if (Static10.anInt2313 != -1) {
							this.method1784(local18, arg1 + this.anIntArray376[local18] + 1, local4 + this.anIntArray379[local18] + 1, local184, local116, Static10.anInt2313, Static10.anInt2305);
						}
						this.method1788(local18, arg1 + this.anIntArray376[local18], local4 + this.anIntArray379[local18], local184, local116, Static10.anInt2307, Static10.anInt2305);
					}
					@Pc(306) int local306 = this.anIntArray378[local18];
					if (Static10.anInt2315 != -1) {
						Static147.method1767(arg1, local4 + (int) ((double) this.anInt2310 * 0.7D), local306, Static10.anInt2315);
					}
					if (Static10.anInt2306 != -1) {
						Static147.method1767(arg1, local4 + this.anInt2310 + 1, local306, Static10.anInt2306);
					}
					arg1 += local306;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lclient!eh;)V")
	private void method1793(@OriginalArg(0) Class28 arg0) {
		try {
			if (arg0.method918(Static10.aClass28_722)) {
				Static10.anInt2307 = arg0.method905(4).method932(16);
				return;
			}
			if (arg0.method934(Static10.aClass28_726)) {
				Static10.anInt2307 = Static10.anInt2316;
				return;
			}
			if (arg0.method918(Static10.aClass28_725)) {
				Static10.anInt2315 = arg0.method905(4).method932(16);
				return;
			}
			if (arg0.method934(Static10.aClass28_712)) {
				Static10.anInt2315 = 8388608;
				return;
			}
			if (arg0.method934(Static10.aClass28_709)) {
				Static10.anInt2315 = -1;
				return;
			}
			if (arg0.method918(Static10.aClass28_718)) {
				Static10.anInt2306 = arg0.method905(2).method932(16);
				return;
			}
			if (arg0.method934(Static10.aClass28_721)) {
				Static10.anInt2306 = 0;
				return;
			}
			if (arg0.method934(Static10.aClass28_720)) {
				Static10.anInt2306 = -1;
				return;
			}
			if (arg0.method918(Static10.aClass28_714)) {
				Static10.anInt2313 = arg0.method905(5).method932(16);
				return;
			}
			if (arg0.method934(Static10.aClass28_724)) {
				Static10.anInt2313 = 0;
				return;
			}
			if (arg0.method934(Static10.aClass28_708)) {
				Static10.anInt2313 = Static10.anInt2309;
				return;
			}
			if (arg0.method934(Static10.aClass28_727)) {
				this.method1807(Static10.anInt2316, Static10.anInt2309, Static10.anInt2317);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;IIIIIIIIII)I")
	private int method1794(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1807(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt2310;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt2311 + this.anInt2308 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1801(arg0, local20, Static10.aClass28Array14);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt2311;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt2311 + (arg4 - this.anInt2311 - this.anInt2308 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt2308 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt2311 - this.anInt2308 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt2311 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1792(Static10.aClass28Array14[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1792(Static10.aClass28Array14[local118], arg1 + (arg3 - this.method1805(Static10.aClass28Array14[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1792(Static10.aClass28Array14[local118], arg1 + arg3 - this.method1805(Static10.aClass28Array14[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1792(Static10.aClass28Array14[local118], arg1, local57);
			} else {
				this.method1808(Static10.aClass28Array14[local118], arg3);
				this.method1792(Static10.aClass28Array14[local118], arg1, local57);
				Static10.anInt2314 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;IIIII)V")
	public final void method1795(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1800(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1118];
		@Pc(14) int[] local14 = new int[arg0.anInt1118];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1118; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1790(arg0, arg1 - this.method1805(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lclient!eh;IIIII)V")
	public final void method1796(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1800(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1118];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1118; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1790(arg0, arg1 - this.method1805(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lclient!eh;I)I")
	public final int method1799(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		return this.method1801(arg0, new int[] { arg1 }, Static10.aClass28Array14);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	private void method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static10.anInt2315 = -1;
		Static10.anInt2306 = -1;
		Static10.anInt2309 = arg1;
		Static10.anInt2313 = arg1;
		Static10.anInt2316 = arg0;
		Static10.anInt2307 = arg0;
		Static10.anInt2317 = 256;
		Static10.anInt2305 = 256;
		Static10.anInt2314 = 0;
		Static10.anInt2312 = 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;[I[Lclient!eh;)I")
	private int method1801(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class28[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class28 local11 = Static128.method2515(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method901();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method917(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class28 local55 = arg0.method926(local29, local19 + 1);
					local19 = -1;
					local11.method907(60);
					local11.method930(local55);
					local11.method907(62);
					if (local55.method934(Static10.aClass28_727)) {
						arg2[local23++] = local11.method926(local11.method901(), local7);
						local7 = local11.method901();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method934(Static10.aClass28_710)) {
						local5 += this.method1802(60);
						if (this.aByteArray21 != null && local21 != -1) {
							local5 += this.aByteArray21[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method934(Static10.aClass28_717)) {
						local5 += this.method1802(62);
						if (this.aByteArray21 != null && local21 != -1) {
							local5 += this.aByteArray21[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method934(Static10.aClass28_715)) {
						local5 += this.method1802(160);
						if (this.aByteArray21 != null && local21 != -1) {
							local5 += this.aByteArray21[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method934(Static10.aClass28_728)) {
						local5 += this.method1802(173);
						if (this.aByteArray21 != null && local21 != -1) {
							local5 += this.aByteArray21[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method934(Static10.aClass28_716)) {
						local5 += this.method1802(215);
						if (this.aByteArray21 != null && local21 != -1) {
							local5 += this.aByteArray21[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method934(Static10.aClass28_711)) {
						local5 += this.method1802(128);
						if (this.aByteArray21 != null && local21 != -1) {
							local5 += this.aByteArray21[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method934(Static10.aClass28_719)) {
						local5 += this.method1802(169);
						if (this.aByteArray21 != null && local21 != -1) {
							local5 += this.aByteArray21[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method934(Static10.aClass28_723)) {
						local5 += this.method1802(174);
						if (this.aByteArray21 != null && local21 != -1) {
							local5 += this.aByteArray21[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method918(Static10.aClass28_713)) {
						try {
							@Pc(359) int local359 = local55.method905(4).method929();
							local5 += Static10.aClass3_Sub2_Sub2_Sub3Array6[local359].anInt1010;
							local21 = -1;
						} catch (@Pc(370) Exception local370) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method907(local35);
						local5 += this.method1802(local35);
						if (this.aByteArray21 != null && local21 != -1) {
							local5 += this.aByteArray21[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method901();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method926(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method901();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method901() > local7) {
			arg2[local23++] = local11.method926(local11.method901(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)I")
	private int method1802(@OriginalArg(0) int arg0) {
		return this.anIntArray378[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lclient!eh;IIII)V")
	public final void method1803(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1800(arg3, arg4);
			this.method1792(arg0, arg1 - this.method1805(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(IIIIII)V")
	protected abstract void method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(Lclient!eh;)I")
	public final int method1805(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1118; local11++) {
			@Pc(19) int local19 = arg0.aByteArray15[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class28 local39 = arg0.method926(local11, local5 + 1);
					local5 = -1;
					if (local39.method934(Static10.aClass28_710)) {
						local19 = 60;
					} else if (local39.method934(Static10.aClass28_717)) {
						local19 = 62;
					} else if (local39.method934(Static10.aClass28_715)) {
						local19 = 160;
					} else if (local39.method934(Static10.aClass28_728)) {
						local19 = 173;
					} else if (local39.method934(Static10.aClass28_716)) {
						local19 = 215;
					} else if (local39.method934(Static10.aClass28_711)) {
						local19 = 128;
					} else if (local39.method934(Static10.aClass28_719)) {
						local19 = 169;
					} else {
						if (!local39.method934(Static10.aClass28_723)) {
							if (local39.method918(Static10.aClass28_713)) {
								try {
									@Pc(117) int local117 = local39.method905(4).method929();
									local9 += Static10.aClass3_Sub2_Sub2_Sub3Array6[local117].anInt1010;
									local7 = -1;
								} catch (@Pc(128) Exception local128) {
								}
							}
							continue;
						}
						local19 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray378[local19];
					if (this.aByteArray21 != null && local7 != -1) {
						local9 += this.aByteArray21[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)V")
	private void method1807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static10.anInt2315 = -1;
		Static10.anInt2306 = -1;
		Static10.anInt2309 = arg1;
		Static10.anInt2313 = arg1;
		Static10.anInt2316 = arg0;
		Static10.anInt2307 = arg0;
		Static10.anInt2317 = arg2;
		Static10.anInt2305 = arg2;
		Static10.anInt2314 = 0;
		Static10.anInt2312 = 0;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(Lclient!eh;I)V")
	private void method1808(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method901(); local5++) {
			@Pc(11) int local11 = arg0.method917(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static10.anInt2314 = (arg1 - this.method1805(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(IIIIII)V")
	private void method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static147.anInt2304;
		@Pc(9) int local9 = Static147.anInt2304 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static147.anInt2299) {
			local20 = Static147.anInt2299 - arg2;
			arg4 -= local20;
			arg2 = Static147.anInt2299;
			local13 = local20 * arg3;
			local5 += local20 * Static147.anInt2304;
		}
		if (arg2 + arg4 > Static147.anInt2300) {
			arg4 -= arg2 + arg4 - Static147.anInt2300;
		}
		if (arg1 < Static147.anInt2301) {
			local20 = Static147.anInt2301 - arg1;
			arg3 -= local20;
			arg1 = Static147.anInt2301;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static147.anInt2303) {
			local20 = arg1 + arg3 - Static147.anInt2303;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static10.method1798(Static147.anIntArray374, this.aByteArrayArray58[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;IIIIIIIII)I")
	public final int method1810(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1794(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(Lclient!eh;IIII)V")
	public final void method1811(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1800(arg3, arg4);
			this.method1792(arg0, arg1, arg2);
		}
	}
}
