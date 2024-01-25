import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class64 {

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!r;")
	private final Class134 aClass134_13;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!uq;")
	private final Class334 aClass334_15;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!r;Lclient!uq;)V")
	protected Class64(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class334 arg1) {
		this.aClass134_13 = arg0;
		this.aClass334_15 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;II[IB[Lclient!f;)V")
	public final void method6600(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) Class22[] arg5) {
		if (arg1 != null) {
			this.method6619(0, arg2);
			this.method6613(arg4, arg0, arg1, 0, arg3, arg5, null, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIIB)V")
	public final void method6601(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method6619(-16777216, arg0);
		@Pc(24) int local24 = arg1.length();
		@Pc(27) int[] local27 = new int[local24];
		@Pc(30) int[] local30 = new int[local24];
		for (@Pc(32) int local32 = 0; local32 < local24; local32++) {
			local27[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg2 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) arg2 / 5.0D + (double) local32 / 3.0D) * 5.0D);
		}
		this.method6606(arg4, null, arg1, arg3 - this.aClass334_15.method7354(arg1) / 2, local27, null, local30);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
	public final void method6602(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method6619(arg3, arg0);
			this.method6613(null, arg2, arg1, 0, arg4, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	protected abstract void method6603(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class204 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method6604(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static110.anInt2166 = Static110.anInt2166 & 0xFF000000 | Static394.method5449(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static110.anInt2166 = Static456.anInt7840 & 0xFFFFFF | Static110.anInt2166 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static110.anInt2166 = Static394.method5449(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static110.anInt2166 = Static456.anInt7840;
			} else if (arg0.startsWith("str=")) {
				Static394.anInt6866 = Static110.anInt2166 & 0xFF000000 | Static394.method5449(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static394.anInt6866 = Static110.anInt2166 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static394.anInt6866 = -1;
			} else if (arg0.startsWith("u=")) {
				Static384.anInt6618 = Static110.anInt2166 & 0xFF000000 | Static394.method5449(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static384.anInt6618 = Static110.anInt2166 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static384.anInt6618 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static564.anInt6805 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static564.anInt6805 = Static110.anInt2166 & 0xFF000000 | Static394.method5449(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static564.anInt6805 = Static110.anInt2166 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static564.anInt6805 = Static303.anInt5262;
			} else if (arg0.equals("br")) {
				this.method6619(Static303.anInt5262, Static456.anInt7840);
			}
		} catch (@Pc(190) Exception local190) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method6605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method6619(arg0, arg1);
			this.method6613(null, arg2 - this.aClass334_15.method7354(arg3) / 2, arg3, 0, arg4, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[ILjava/lang/String;I[I[Lclient!f;[II)V")
	private void method6606(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class22[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg0 - this.aClass334_15.anInt9012;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg2.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static514.method7147(arg2.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(125) int local125;
				@Pc(135) int local135;
				if (local33 == '>' && local13 != -1) {
					@Pc(55) String local55 = arg2.substring(local13 + 1, local22);
					local13 = -1;
					if (local55.equals("lt")) {
						local33 = '<';
					} else if (local55.equals("gt")) {
						local33 = '>';
					} else if (local55.equals("nbsp")) {
						local33 = ' ';
					} else if (local55.equals("shy")) {
						local33 = '\u00ad';
					} else if (local55.equals("times")) {
						local33 = '×';
					} else if (local55.equals("euro")) {
						local33 = '€';
					} else if (local55.equals("copy")) {
						local33 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=")) {
								try {
									if (arg4 == null) {
										local125 = 0;
									} else {
										local125 = arg4[local17];
									}
									if (arg6 == null) {
										local135 = 0;
									} else {
										local135 = arg6[local17];
									}
									local17++;
									@Pc(148) int local148 = Static21.method7701(local55.substring(4));
									@Pc(152) Class22 local152 = arg5[local148];
									@Pc(161) int local161 = arg1 == null ? local152.ca() : arg1[local148];
									local152.V(arg3 + local125, -local161 + this.aClass334_15.anInt9012 + local7 - -local135, 1, 0, 1);
									local15 = -1;
									arg3 += arg5[local148].A();
								} catch (@Pc(191) Exception local191) {
								}
							} else {
								this.method6604(local55);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass334_15.method7353(local15, local33);
					}
					@Pc(225) int local225;
					if (arg4 == null) {
						local225 = 0;
					} else {
						local225 = arg4[local17];
					}
					if (arg6 == null) {
						local125 = 0;
					} else {
						local125 = arg6[local17];
					}
					if (local33 != ' ') {
						if ((Static564.anInt6805 & 0xFF000000) != 0) {
							this.OA(local33, arg3 + local225 + 1, local7 - (-local125 + -1), Static564.anInt6805, true);
						}
						this.OA(local33, local225 + arg3, local7 + local125, Static110.anInt2166, false);
					} else if (Static229.anInt4306 > 0) {
						Static563.anInt9386 += Static229.anInt4306;
						arg3 += Static563.anInt9386 >> 8;
						Static563.anInt9386 &= 0xFF;
					}
					local17++;
					local135 = this.aClass334_15.method7360(local33);
					if (Static394.anInt6866 != -1) {
						this.aClass134_13.method6894((int) ((double) this.aClass334_15.anInt9012 * 0.7D) + local7, Static394.anInt6866, arg3, local135);
					}
					if (Static384.anInt6618 != -1) {
						this.aClass134_13.method6894(local7 + this.aClass334_15.anInt9012, Static384.anInt6618, arg3, local135);
					}
					arg3 += local135;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;IBI)V")
	public final void method6608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method6619(-16777216, arg1);
		@Pc(24) double local24 = 7.0D - (double) arg0 / 8.0D;
		if (local24 < 0.0D) {
			local24 = 0.0D;
		}
		@Pc(33) int local33 = arg3.length();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = (int) (Math.sin((double) arg2 + (double) local38 / 1.5D) * local24);
		}
		this.method6606(arg5, null, arg3, arg4 - this.aClass334_15.method7354(arg3) / 2, null, null, local36);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;III[III[Lclient!f;II[ILjava/lang/String;BII)I")
	public final int method6609(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class22[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg11 == null) {
			return 0;
		}
		arg0.setSeed((long) arg13);
		@Pc(20) int local20 = (arg0.nextInt() & 0x1F) + 192;
		this.method6619(arg3 & 0xFFFFFF | local20 << 24, arg9 & 0xFFFFFF | local20 << 24);
		@Pc(48) int local48 = arg11.length();
		@Pc(51) int[] local51 = new int[local48];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local51[local55] = local53;
			if ((arg0.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		@Pc(77) int local77 = arg5;
		@Pc(83) int local83 = this.aClass334_15.anInt9005 + arg12;
		@Pc(85) int local85 = -1;
		if (arg2 == 1) {
			local83 += (arg8 - this.aClass334_15.anInt9005 - this.aClass334_15.anInt9008) / 2;
		} else if (arg2 == 2) {
			local83 = arg12 + arg8 - this.aClass334_15.anInt9008;
		}
		if (arg1 == 1) {
			local85 = local53 + this.aClass334_15.method7354(arg11);
			local77 = arg5 + (arg6 - local85) / 2;
		} else if (arg1 == 2) {
			local85 = this.aClass334_15.method7354(arg11) + local53;
			local77 = arg5 + arg6 - local85;
		}
		this.method6606(local83, arg10, arg11, local77, local51, arg7, null);
		if (arg4 != null) {
			if (local85 == -1) {
				local85 = local53 + this.aClass334_15.method7354(arg11);
			}
			arg4[1] = local83 - this.aClass334_15.anInt9005;
			arg4[0] = local77;
			arg4[2] = local85;
			arg4[3] = this.aClass334_15.anInt9005 + this.aClass334_15.anInt9008;
		}
		return local53;
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!f;ILjava/util/Random;IIIII[ILjava/lang/String;)I")
	public final int method6610(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int[] arg5, @OriginalArg(9) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg2.setSeed((long) arg3);
		@Pc(25) int local25 = (arg2.nextInt() & 0x1F) + 192;
		this.method6619((local25 | 0x0) << 24, local25 << 24 | 0xFFFFFF);
		@Pc(45) int local45 = arg6.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg2.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method6606(arg1, arg5, arg6, arg4, local48, arg0, null);
		return local50;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIIILjava/lang/String;IIIILclient!ua;II[Lclient!f;I[I)I")
	public final int method6611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class204 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class22[] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int[] arg15) {
		if (arg5 == null) {
			return 0;
		}
		this.method6619(arg8, arg12);
		if (arg2 == 0) {
			arg2 = this.aClass334_15.anInt9012;
		}
		@Pc(52) int[] local52;
		if (this.aClass334_15.anInt9008 + this.aClass334_15.anInt9005 + arg2 > arg3 && arg3 < arg2 + arg2) {
			local52 = null;
		} else {
			local52 = new int[] { arg4 };
		}
		if (arg1 == -1) {
			arg1 = arg3 / arg2;
			if (arg1 <= 0) {
				arg1 = 1;
			}
		}
		@Pc(76) int local76 = this.aClass334_15.method7357(local52, arg13, arg5, Static111.aStringArray13);
		if (arg1 > 0 && local76 >= arg1) {
			Static111.aStringArray13[arg1 - 1] = this.aClass334_15.method7359(arg13, Static111.aStringArray13[arg1 - 1], arg4);
			local76 = arg1;
		}
		if (arg6 == 3 && local76 == 1) {
			arg6 = 1;
		}
		@Pc(119) int local119;
		@Pc(178) int local178;
		if (arg6 == 0) {
			local119 = this.aClass334_15.anInt9005 + arg11;
		} else if (arg6 == 1) {
			local119 = (arg3 - this.aClass334_15.anInt9008 - this.aClass334_15.anInt9005 - arg2 * (local76 - 1)) / 2 + this.aClass334_15.anInt9005 + arg11;
		} else if (arg6 == 2) {
			local119 = arg11 + arg3 - (local76 - 1) * arg2 - this.aClass334_15.anInt9008;
		} else {
			local178 = (arg3 - this.aClass334_15.anInt9005 - this.aClass334_15.anInt9008 - (local76 - 1) * arg2) / (local76 - -1);
			if (local178 < 0) {
				local178 = 0;
			}
			arg2 += local178;
			local119 = local178 + arg11 + this.aClass334_15.anInt9005;
		}
		for (local178 = 0; local178 < local76; local178++) {
			if (arg7 == 0) {
				this.method6613(arg15, arg9, Static111.aStringArray13[local178], arg0, local119, arg13, arg10, arg14);
			} else if (arg7 == 1) {
				this.method6613(arg15, (arg4 - this.aClass334_15.method7354(Static111.aStringArray13[local178])) / 2 + arg9, Static111.aStringArray13[local178], arg0, local119, arg13, arg10, arg14);
			} else if (arg7 == 2) {
				this.method6613(arg15, arg4 + arg9 - this.aClass334_15.method7354(Static111.aStringArray13[local178]), Static111.aStringArray13[local178], arg0, local119, arg13, arg10, arg14);
			} else if (local178 == local76 - 1) {
				this.method6613(arg15, arg9, Static111.aStringArray13[local178], arg0, local119, arg13, arg10, arg14);
			} else {
				this.method6615(arg4, Static111.aStringArray13[local178]);
				this.method6613(arg15, arg9, Static111.aStringArray13[local178], arg0, local119, arg13, arg10, arg14);
				Static229.anInt4306 = 0;
			}
			local119 += arg2;
		}
		return local76;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IIIIILclient!ua;Ljava/lang/String;I[Lclient!f;IIIIIII)I")
	public final int method6612(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class204 arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class22[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method6611(arg10, 0, arg1, arg3, arg12, arg6, arg7, arg14, arg4, arg2, arg5, arg11, arg13, arg8, arg9, arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IILjava/lang/String;II[Lclient!f;Lclient!ua;BI)V")
	private void method6613(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class22[] arg5, @OriginalArg(6) Class204 arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg4 - this.aClass334_15.anInt9012;
		@Pc(13) int local13 = -1;
		@Pc(20) int local20 = -1;
		@Pc(23) int local23 = arg2.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) char local36 = (char) (Static514.method7147(arg2.charAt(local25)) & 0xFF);
			if (local36 == '<') {
				local13 = local25;
			} else {
				if (local36 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg2.substring(local13 + 1, local25);
					local13 = -1;
					if (local56.equals("lt")) {
						local36 = '<';
					} else if (local56.equals("gt")) {
						local36 = '>';
					} else if (local56.equals("nbsp")) {
						local36 = ' ';
					} else if (local56.equals("shy")) {
						local36 = '\u00ad';
					} else if (local56.equals("times")) {
						local36 = '×';
					} else if (local56.equals("euro")) {
						local36 = '€';
					} else if (local56.equals("copy")) {
						local36 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=")) {
								try {
									@Pc(114) int local114 = Static21.method7701(local56.substring(4));
									@Pc(118) Class22 local118 = arg5[local114];
									@Pc(127) int local127 = arg0 == null ? local118.ca() : arg0[local114];
									if ((Static110.anInt2166 & 0xFF000000) == -16777216) {
										local118.V(arg1, local7 + this.aClass334_15.anInt9012 - local127, 1, 0, 1);
									} else {
										local118.V(arg1, local7 + this.aClass334_15.anInt9012 - local127, 0, Static110.anInt2166 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg5[local114].A();
									local20 = -1;
								} catch (@Pc(179) Exception local179) {
								}
							} else {
								this.method6604(local56);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local13 == -1) {
					if (local20 != -1) {
						arg1 += this.aClass334_15.method7353(local20, local36);
					}
					if (local36 == ' ') {
						if (Static229.anInt4306 > 0) {
							Static563.anInt9386 += Static229.anInt4306;
							arg1 += Static563.anInt9386 >> 8;
							Static563.anInt9386 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static564.anInt6805 & 0xFF000000) != 0) {
							this.OA(local36, arg1 + 1, local7 + 1, Static564.anInt6805, true);
						}
						this.OA(local36, arg1, local7, Static110.anInt2166, false);
					} else {
						if ((Static564.anInt6805 & 0xFF000000) != 0) {
							this.method6603(local36, arg1 + 1, local7 + 1, Static564.anInt6805, true, arg6, arg3, arg7);
						}
						this.method6603(local36, arg1, local7, Static110.anInt2166, false, arg6, arg3, arg7);
					}
					@Pc(307) int local307 = this.aClass334_15.method7360(local36);
					if (Static394.anInt6866 != -1) {
						this.aClass134_13.method6894(local7 + (int) ((double) this.aClass334_15.anInt9012 * 0.7D), Static394.anInt6866, arg1, local307);
					}
					if (Static384.anInt6618 != -1) {
						this.aClass134_13.method6894(local7 + this.aClass334_15.anInt9012 + 1, Static384.anInt6618, arg1, local307);
					}
					arg1 += local307;
					local20 = local36;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method6615(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg1.length() > local11; local11++) {
			@Pc(17) char local17 = arg1.charAt(local11);
			if (local17 == '<') {
				local9 = true;
			} else if (local17 == '>') {
				local9 = false;
			} else if (!local9 && local17 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static229.anInt4306 = (arg0 - this.aClass334_15.method7354(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;BIII)V")
	public final void method6617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method6619(-16777216, arg4);
		@Pc(16) int local16 = arg2.length();
		@Pc(27) int[] local27 = new int[local16];
		for (@Pc(29) int local29 = 0; local29 < local16; local29++) {
			local27[local29] = (int) (Math.sin((double) arg0 / 5.0D + (double) local29 / 2.0D) * 5.0D);
		}
		this.method6606(arg1, null, arg2, arg3 - this.aClass334_15.method7354(arg2) / 2, null, null, local27);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method6618(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method6619(arg2, arg4);
			this.method6613(null, arg3 - this.aClass334_15.method7354(arg1), arg1, 0, arg0, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(III)V")
	private void method6619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static563.anInt9386 = 0;
		Static456.anInt7840 = arg1;
		Static110.anInt2166 = arg1;
		Static394.anInt6866 = -1;
		Static384.anInt6618 = -1;
		Static229.anInt4306 = 0;
		Static303.anInt5262 = arg0;
		Static564.anInt6805 = arg0;
	}
}
