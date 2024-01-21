import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public abstract class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!ie", name = "mb", descriptor = "[Lclient!pf;")
	private Class1_Sub1_Sub1_Sub3[] aClass1_Sub1_Sub1_Sub3Array8;

	@OriginalMember(owner = "client!ie", name = "xb", descriptor = "[I")
	private int[] anIntArray311;

	@OriginalMember(owner = "client!ie", name = "Bb", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!ie", name = "eb", descriptor = "[[B")
	protected byte[][] aByteArrayArray6 = new byte[256][];

	@OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
	public int anInt3198 = 0;

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "[I")
	private int[] anIntArray309;

	@OriginalMember(owner = "client!ie", name = "Eb", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!ie", name = "rb", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!ie", name = "zb", descriptor = "[I")
	private int[] anIntArray312;

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
	private int anInt3194;

	@OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
	private int anInt3196;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray309 = arg1;
		this.anIntArray314 = arg2;
		this.anIntArray310 = arg3;
		this.anIntArray312 = arg4;
		this.method2376(arg0);
		this.aByteArrayArray6 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray314[local32] < local28 && this.anIntArray312[local32] != 0) {
				local28 = this.anIntArray314[local32];
			}
			if (this.anIntArray314[local32] + this.anIntArray312[local32] > local30) {
				local30 = this.anIntArray314[local32] + this.anIntArray312[local32];
			}
		}
		this.anInt3194 = this.anInt3198 - local28;
		this.anInt3196 = local30 - this.anInt3198;
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) byte[] arg0) {
		this.method2376(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)I")
	private int method2369(@OriginalArg(0) int arg0) {
		return this.anIntArray313[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(IIIIII)V")
	protected abstract void method2371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;IIIII)V")
	public final void method2372(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2395(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3915];
		@Pc(14) int[] local14 = new int[arg0.anInt3915];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt3915; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2388(arg0, arg1 - this.method2374(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
	private void method2373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static76.anInt3195 = -1;
		Static76.anInt3202 = -1;
		Static76.anInt3201 = arg1;
		Static76.anInt3204 = arg1;
		Static76.anInt3192 = arg0;
		Static76.anInt3199 = arg0;
		Static76.anInt3200 = arg2;
		Static76.anInt3203 = arg2;
		Static76.anInt3193 = 0;
		Static76.anInt3197 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;)I")
	public final int method2374(@OriginalArg(0) Class70 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt3915; local11++) {
			@Pc(19) int local19 = arg0.aByteArray46[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class70 local39 = arg0.method2903(local11, local5 + 1);
					local5 = -1;
					if (local39.method2910(Static76.aClass70_1061)) {
						local19 = 60;
					} else if (local39.method2910(Static76.aClass70_1069)) {
						local19 = 62;
					} else if (local39.method2910(Static76.aClass70_1059)) {
						local19 = 160;
					} else if (local39.method2910(Static76.aClass70_1058)) {
						local19 = 173;
					} else if (local39.method2910(Static76.aClass70_1052)) {
						local19 = 215;
					} else if (local39.method2910(Static76.aClass70_1062)) {
						local19 = 128;
					} else if (local39.method2910(Static76.aClass70_1063)) {
						local19 = 169;
					} else {
						if (!local39.method2910(Static76.aClass70_1067)) {
							if (local39.method2891(Static76.aClass70_1048)) {
								try {
									@Pc(117) int local117 = local39.method2906(4).method2892();
									local9 += this.aClass1_Sub1_Sub1_Sub3Array8[local117].anInt3505;
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
					local9 += this.anIntArray313[local19];
					if (this.aByteArray41 != null && local7 != -1) {
						local9 += this.aByteArray41[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;I)V")
	private void method2375(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method2896(); local5++) {
			@Pc(11) int local11 = arg0.method2899(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static76.anInt3193 = (arg1 - this.method2374(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([B)V")
	private void method2376(@OriginalArg(0) byte[] arg0) {
		this.anIntArray313 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray313.length; local9++) {
				this.anIntArray313[local9] = arg0[local9] & 0xFF;
			}
			this.anInt3198 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray313[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray41 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray41[(local182 << 8) + local150] = (byte) Static76.method2378(local93, local136, local58, this.anIntArray313, local55, local182, local150);
					}
				}
			}
		}
		this.anInt3198 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method2377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;IIIIIIIIII)I")
	private int method2379(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method2373(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt3198;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt3194 + this.anInt3196 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method2386(arg0, local20, Static76.aClass70Array16);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt3194;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt3194 + (arg4 - this.anInt3194 - this.anInt3196 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt3196 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt3194 - this.anInt3196 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt3194 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method2398(Static76.aClass70Array16[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method2398(Static76.aClass70Array16[local118], arg1 + (arg3 - this.method2374(Static76.aClass70Array16[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method2398(Static76.aClass70Array16[local118], arg1 + arg3 - this.method2374(Static76.aClass70Array16[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method2398(Static76.aClass70Array16[local118], arg1, local57);
			} else {
				this.method2375(Static76.aClass70Array16[local118], arg3);
				this.method2398(Static76.aClass70Array16[local118], arg1, local57);
				Static76.anInt3193 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;IIIILjava/util/Random;I)I")
	public final int method2380(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method2373(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt3915];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3915; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method2388(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!rf;)V")
	private void method2381(@OriginalArg(0) Class70 arg0) {
		try {
			if (arg0.method2891(Static76.aClass70_1068)) {
				Static76.anInt3199 = arg0.method2906(4).method2908(16);
				return;
			}
			if (arg0.method2910(Static76.aClass70_1054)) {
				Static76.anInt3199 = Static76.anInt3192;
				return;
			}
			if (arg0.method2891(Static76.aClass70_1057)) {
				Static76.anInt3203 = arg0.method2906(6).method2892();
				return;
			}
			if (arg0.method2910(Static76.aClass70_1064)) {
				Static76.anInt3203 = Static76.anInt3200;
				return;
			}
			if (arg0.method2891(Static76.aClass70_1051)) {
				Static76.anInt3195 = arg0.method2906(4).method2908(16);
				return;
			}
			if (arg0.method2910(Static76.aClass70_1060)) {
				Static76.anInt3195 = 8388608;
				return;
			}
			if (arg0.method2910(Static76.aClass70_1056)) {
				Static76.anInt3195 = -1;
				return;
			}
			if (arg0.method2891(Static76.aClass70_1049)) {
				Static76.anInt3202 = arg0.method2906(2).method2908(16);
				return;
			}
			if (arg0.method2910(Static76.aClass70_1055)) {
				Static76.anInt3202 = 0;
				return;
			}
			if (arg0.method2910(Static76.aClass70_1065)) {
				Static76.anInt3202 = -1;
				return;
			}
			if (arg0.method2891(Static76.aClass70_1066)) {
				Static76.anInt3204 = arg0.method2906(5).method2908(16);
				return;
			}
			if (arg0.method2910(Static76.aClass70_1070)) {
				Static76.anInt3204 = 0;
				return;
			}
			if (arg0.method2910(Static76.aClass70_1050)) {
				Static76.anInt3204 = Static76.anInt3201;
				return;
			}
			if (arg0.method2910(Static76.aClass70_1053)) {
				this.method2373(Static76.anInt3192, Static76.anInt3201, Static76.anInt3200);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;IIIIIIIII)I")
	public final int method2382(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method2379(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!rf;I)I")
	public final int method2385(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1) {
		return this.method2386(arg0, new int[] { arg1 }, Static76.aClass70Array16);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;[I[Lclient!rf;)I")
	private int method2386(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class70[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class70 local11 = Static83.method3494(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method2896();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method2899(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class70 local55 = arg0.method2903(local29, local19 + 1);
					local19 = -1;
					local11.method2889(60);
					local11.method2901(local55);
					local11.method2889(62);
					if (local55.method2910(Static76.aClass70_1053)) {
						arg2[local23++] = local11.method2903(local11.method2896(), local7);
						local7 = local11.method2896();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method2910(Static76.aClass70_1061)) {
						local5 += this.method2369(60);
						if (this.aByteArray41 != null && local21 != -1) {
							local5 += this.aByteArray41[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method2910(Static76.aClass70_1069)) {
						local5 += this.method2369(62);
						if (this.aByteArray41 != null && local21 != -1) {
							local5 += this.aByteArray41[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method2910(Static76.aClass70_1059)) {
						local5 += this.method2369(160);
						if (this.aByteArray41 != null && local21 != -1) {
							local5 += this.aByteArray41[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method2910(Static76.aClass70_1058)) {
						local5 += this.method2369(173);
						if (this.aByteArray41 != null && local21 != -1) {
							local5 += this.aByteArray41[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method2910(Static76.aClass70_1052)) {
						local5 += this.method2369(215);
						if (this.aByteArray41 != null && local21 != -1) {
							local5 += this.aByteArray41[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method2910(Static76.aClass70_1062)) {
						local5 += this.method2369(128);
						if (this.aByteArray41 != null && local21 != -1) {
							local5 += this.aByteArray41[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method2910(Static76.aClass70_1063)) {
						local5 += this.method2369(169);
						if (this.aByteArray41 != null && local21 != -1) {
							local5 += this.aByteArray41[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method2910(Static76.aClass70_1067)) {
						local5 += this.method2369(174);
						if (this.aByteArray41 != null && local21 != -1) {
							local5 += this.aByteArray41[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method2891(Static76.aClass70_1048)) {
						try {
							@Pc(359) int local359 = local55.method2906(4).method2892();
							local5 += this.aClass1_Sub1_Sub1_Sub3Array8[local359].anInt3505;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method2889(local35);
						local5 += this.method2369(local35);
						if (this.aByteArray41 != null && local21 != -1) {
							local5 += this.aByteArray41[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method2896();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method2903(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method2896();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method2896() > local7) {
			arg2[local23++] = local11.method2903(local11.method2896(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;IIII)V")
	public final void method2387(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2395(arg3, arg4);
			this.method2398(arg0, arg1 - this.method2374(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;II[I[I)V")
	private void method2388(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt3198;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3915; local12++) {
			@Pc(20) int local20 = arg0.aByteArray46[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class70 local40 = arg0.method2903(local12, local6 + 1);
					local6 = -1;
					if (local40.method2910(Static76.aClass70_1061)) {
						local20 = 60;
					} else if (local40.method2910(Static76.aClass70_1069)) {
						local20 = 62;
					} else if (local40.method2910(Static76.aClass70_1059)) {
						local20 = 160;
					} else if (local40.method2910(Static76.aClass70_1058)) {
						local20 = 173;
					} else if (local40.method2910(Static76.aClass70_1052)) {
						local20 = 215;
					} else if (local40.method2910(Static76.aClass70_1062)) {
						local20 = 128;
					} else if (local40.method2910(Static76.aClass70_1063)) {
						local20 = 169;
					} else {
						if (!local40.method2910(Static76.aClass70_1067)) {
							if (local40.method2891(Static76.aClass70_1048)) {
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
									local137 = local40.method2906(4).method2892();
									@Pc(142) Class1_Sub1_Sub1_Sub3 local142 = this.aClass1_Sub1_Sub1_Sub3Array8[local137];
									@Pc(153) int local153 = this.anIntArray311 == null ? local142.anInt3503 : this.anIntArray311[local137];
									if (Static76.anInt3203 == 256) {
										local142.method2618(arg1 + local117, local4 + this.anInt3198 - local153 + local126);
									} else {
										local142.method2616(arg1 + local117, local4 + this.anInt3198 - local153 + local126, Static76.anInt3203);
									}
									arg1 += local142.anInt3505;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method2381(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray41 != null && local8 != -1) {
						arg1 += this.aByteArray41[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray310[local20];
					local117 = this.anIntArray312[local20];
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
						if (Static76.anInt3193 > 0) {
							Static76.anInt3197 += Static76.anInt3193;
							arg1 += Static76.anInt3197 >> 8;
							Static76.anInt3197 &= 0xFF;
						}
					} else if (Static76.anInt3203 == 256) {
						if (Static76.anInt3204 != -1) {
							this.method2389(local20, arg1 + this.anIntArray309[local20] + local126 + 1, local4 + this.anIntArray314[local20] + 1 + local137, local223, local117, Static76.anInt3204);
						}
						this.method2371(local20, arg1 + this.anIntArray309[local20] + local126, local4 + this.anIntArray314[local20] + local137, local223, local117, Static76.anInt3199);
					} else {
						if (Static76.anInt3204 != -1) {
							this.method2392(local20, arg1 + this.anIntArray309[local20] + local126 + 1, local4 + this.anIntArray314[local20] + 1 + local137, local223, local117, Static76.anInt3204, Static76.anInt3203);
						}
						this.method2377(local20, arg1 + this.anIntArray309[local20] + local126, local4 + this.anIntArray314[local20] + local137, local223, local117, Static76.anInt3199, Static76.anInt3203);
					}
					@Pc(380) int local380 = this.anIntArray313[local20];
					if (Static76.anInt3195 != -1) {
						Static155.method3002(arg1, local4 + (int) ((double) this.anInt3198 * 0.7D), local380, Static76.anInt3195);
					}
					if (Static76.anInt3202 != -1) {
						Static155.method3002(arg1, local4 + this.anInt3198, local380, Static76.anInt3202);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(IIIIII)V")
	private void method2389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static155.anInt3963;
		@Pc(9) int local9 = Static155.anInt3963 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static155.anInt3965) {
			local20 = Static155.anInt3965 - arg2;
			arg4 -= local20;
			arg2 = Static155.anInt3965;
			local13 = local20 * arg3;
			local5 += local20 * Static155.anInt3963;
		}
		if (arg2 + arg4 > Static155.anInt3961) {
			arg4 -= arg2 + arg4 - Static155.anInt3961;
		}
		if (arg1 < Static155.anInt3962) {
			local20 = Static155.anInt3962 - arg1;
			arg3 -= local20;
			arg1 = Static155.anInt3962;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static155.anInt3966) {
			local20 = arg1 + arg3 - Static155.anInt3966;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static76.method2384(Static155.anIntArray373, this.aByteArrayArray6[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([Lclient!pf;[I)V")
	public final void method2390(@OriginalArg(0) Class1_Sub1_Sub1_Sub3[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass1_Sub1_Sub1_Sub3Array8 = arg0;
		this.anIntArray311 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!rf;IIII)V")
	public final void method2391(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2395(arg3, arg4);
			this.method2398(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIIIIII)V")
	private void method2392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static155.anInt3963;
		@Pc(9) int local9 = Static155.anInt3963 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static155.anInt3965) {
			local20 = Static155.anInt3965 - arg2;
			arg4 -= local20;
			arg2 = Static155.anInt3965;
			local13 = local20 * arg3;
			local5 += local20 * Static155.anInt3963;
		}
		if (arg2 + arg4 > Static155.anInt3961) {
			arg4 -= arg2 + arg4 - Static155.anInt3961;
		}
		if (arg1 < Static155.anInt3962) {
			local20 = Static155.anInt3962 - arg1;
			arg3 -= local20;
			arg1 = Static155.anInt3962;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static155.anInt3966) {
			local20 = arg1 + arg3 - Static155.anInt3966;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static76.method2383(Static155.anIntArray373, this.aByteArrayArray6[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;IIIIII)V")
	public final void method2393(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method2395(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt3915];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3915; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method2388(arg0, arg1 - this.method2374(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
	private void method2395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static76.anInt3195 = -1;
		Static76.anInt3202 = -1;
		Static76.anInt3201 = arg1;
		Static76.anInt3204 = arg1;
		Static76.anInt3192 = arg0;
		Static76.anInt3199 = arg0;
		Static76.anInt3200 = 256;
		Static76.anInt3203 = 256;
		Static76.anInt3193 = 0;
		Static76.anInt3197 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lclient!rf;I)I")
	public final int method2396(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method2386(arg0, new int[] { arg1 }, Static76.aClass70Array16);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method2374(Static76.aClass70Array16[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lclient!rf;IIII)V")
	public final void method2397(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2395(arg3, arg4);
			this.method2398(arg0, arg1 - this.method2374(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rf;II)V")
	private void method2398(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt3198;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt3915; local10++) {
			@Pc(18) int local18 = arg0.aByteArray46[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class70 local38 = arg0.method2903(local10, local6 + 1);
					local6 = -1;
					if (local38.method2910(Static76.aClass70_1061)) {
						local18 = 60;
					} else if (local38.method2910(Static76.aClass70_1069)) {
						local18 = 62;
					} else if (local38.method2910(Static76.aClass70_1059)) {
						local18 = 160;
					} else if (local38.method2910(Static76.aClass70_1058)) {
						local18 = 173;
					} else if (local38.method2910(Static76.aClass70_1052)) {
						local18 = 215;
					} else if (local38.method2910(Static76.aClass70_1062)) {
						local18 = 128;
					} else if (local38.method2910(Static76.aClass70_1063)) {
						local18 = 169;
					} else {
						if (!local38.method2910(Static76.aClass70_1067)) {
							if (local38.method2891(Static76.aClass70_1048)) {
								try {
									local116 = local38.method2906(4).method2892();
									@Pc(121) Class1_Sub1_Sub1_Sub3 local121 = this.aClass1_Sub1_Sub1_Sub3Array8[local116];
									@Pc(132) int local132 = this.anIntArray311 == null ? local121.anInt3503 : this.anIntArray311[local116];
									if (Static76.anInt3203 == 256) {
										local121.method2618(arg1, local4 + this.anInt3198 - local132);
									} else {
										local121.method2616(arg1, local4 + this.anInt3198 - local132, Static76.anInt3203);
									}
									arg1 += local121.anInt3505;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method2381(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray41 != null && local8 != -1) {
						arg1 += this.aByteArray41[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray310[local18];
					local116 = this.anIntArray312[local18];
					if (local18 == 32) {
						if (Static76.anInt3193 > 0) {
							Static76.anInt3197 += Static76.anInt3193;
							arg1 += Static76.anInt3197 >> 8;
							Static76.anInt3197 &= 0xFF;
						}
					} else if (Static76.anInt3203 == 256) {
						if (Static76.anInt3204 != -1) {
							this.method2389(local18, arg1 + this.anIntArray309[local18] + 1, local4 + this.anIntArray314[local18] + 1, local194, local116, Static76.anInt3204);
						}
						this.method2371(local18, arg1 + this.anIntArray309[local18], local4 + this.anIntArray314[local18], local194, local116, Static76.anInt3199);
					} else {
						if (Static76.anInt3204 != -1) {
							this.method2392(local18, arg1 + this.anIntArray309[local18] + 1, local4 + this.anIntArray314[local18] + 1, local194, local116, Static76.anInt3204, Static76.anInt3203);
						}
						this.method2377(local18, arg1 + this.anIntArray309[local18], local4 + this.anIntArray314[local18], local194, local116, Static76.anInt3199, Static76.anInt3203);
					}
					@Pc(316) int local316 = this.anIntArray313[local18];
					if (Static76.anInt3195 != -1) {
						Static155.method3002(arg1, local4 + (int) ((double) this.anInt3198 * 0.7D), local316, Static76.anInt3195);
					}
					if (Static76.anInt3202 != -1) {
						Static155.method3002(arg1, local4 + this.anInt3198 + 1, local316, Static76.anInt3202);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!rf;IIIII)V")
	public final void method2399(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2395(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3915];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3915; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2388(arg0, arg1 - this.method2374(arg0) / 2, arg2, null, local10);
	}
}
