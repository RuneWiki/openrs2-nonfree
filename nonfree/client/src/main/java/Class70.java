import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class70 {

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Lclient!ha;")
	private Class100 aClass100_15;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!kaa;")
	private final Class196 aClass196_37;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!kaa;)V")
	protected Class70(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class196 arg1) {
		this.aClass100_15 = arg0;
		this.aClass196_37 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;ILjava/util/Random;II[IIIIII[III[Lclient!hk;)I")
	public final int method8424(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class155[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg2.setSeed((long) arg7);
		@Pc(21) int local21 = (arg2.nextInt() & 0x1F) + 192;
		this.method8431(arg1 & 0xFFFFFF | local21 << 24, local21 << 24 | arg8 & 0xFFFFFF);
		@Pc(41) int local41 = arg0.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg2.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(75) int local75 = arg11;
		@Pc(81) int local81 = this.aClass196_37.anInt5054 + arg3;
		if (arg6 == 1) {
			local81 += (arg12 - this.aClass196_37.anInt5056 - this.aClass196_37.anInt5054) / 2;
		} else if (arg6 == 2) {
			local81 = arg12 + arg3 - this.aClass196_37.anInt5056;
		}
		@Pc(134) int local134 = -1;
		if (arg4 == 1) {
			local134 = local46 + this.aClass196_37.method4556(arg0);
			local75 = arg11 + (arg9 - local134) / 2;
		} else if (arg4 == 2) {
			local134 = local46 + this.aClass196_37.method4556(arg0);
			local75 = arg11 + arg9 - local134;
		}
		this.method8441(local44, arg5, arg13, (int[]) null, local81, arg0, local75);
		if (arg10 != null) {
			if (local134 == -1) {
				local134 = this.aClass196_37.method4556(arg0) + local46;
			}
			arg10[0] = local75;
			arg10[3] = this.aClass196_37.anInt5056 + this.aClass196_37.anInt5054;
			arg10[2] = local134;
			arg10[1] = local81 - this.aClass196_37.anInt5054;
		}
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8425(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method8426(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg0.length() > local11; local11++) {
			@Pc(19) char local19 = arg0.charAt(local11);
			if (local19 == '<') {
				local9 = true;
			} else if (local19 == '>') {
				local9 = false;
			} else if (!local9 && local19 == ' ') {
				local7++;
			}
		}
		if (127 <= 126) {
			this.aClass100_15 = null;
		}
		if (local7 > 0) {
			Static511.anInt9800 = (arg1 - this.aClass196_37.method4556(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8427(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static130.anInt2168 = Static130.anInt2168 & 0xFF000000 | Static592.method8150(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static130.anInt2168 = Static130.anInt2168 & 0xFF000000 | Static276.anInt5572 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static130.anInt2168 = Static592.method8150(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static130.anInt2168 = Static276.anInt5572;
			} else if (arg0.startsWith("str=")) {
				Class254.lb = Static130.anInt2168 & 0xFF000000 | Static592.method8150(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Class254.lb = Static130.anInt2168 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Class254.lb = -1;
			} else if (arg0.startsWith("u=")) {
				Static334.anInt9965 = Static130.anInt2168 & 0xFF000000 | Static592.method8150(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static334.anInt9965 = Static130.anInt2168 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static334.anInt9965 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static220.anInt3839 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static220.anInt3839 = Static130.anInt2168 & 0xFF000000 | Static592.method8150(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static220.anInt3839 = Static130.anInt2168 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static220.anInt3839 = Static434.anInt7179;
			} else if (arg0.equals("br")) {
				this.method8431(Static434.anInt7179, Static276.anInt5572);
			}
		} catch (@Pc(271) Exception local271) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method8428(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method8431(arg3, arg1);
			this.method8437(arg4 - this.aClass196_37.method4556(arg0), 0, (int[]) null, (Class1) null, arg2, (Class155[]) null, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;[Lclient!hk;[IIIILjava/util/Random;I)I")
	public final int method8430(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class155[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Random arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg6.setSeed((long) arg5);
		@Pc(22) int local22 = (arg6.nextInt() & 0x1F) + 192;
		this.method8431((local22 | 0x0) << 24, local22 << 24 | 0xFFFFFF);
		@Pc(48) int local48 = arg1.length();
		@Pc(51) int[] local51 = new int[local48];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local51[local55] = local53;
			if ((arg6.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		this.method8441(local51, arg3, arg2, (int[]) null, arg4, arg1, arg0);
		return local53;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	private void method8431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static277.anInt4945 = 0;
		Static334.anInt9965 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static511.anInt9800 = 0;
		Class254.lb = -1;
		Static276.anInt5572 = arg1;
		Static130.anInt2168 = arg1;
		Static434.anInt7179 = arg0;
		Static220.anInt3839 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII[ILclient!aa;[Lclient!hk;IBIIIILjava/lang/String;III)I")
	public final int method8432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) Class155[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) String arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg12 == null) {
			return 0;
		}
		this.method8431(arg1, arg8);
		if (arg11 == 0) {
			arg11 = this.aClass196_37.anInt5057;
		}
		@Pc(58) int[] local58;
		if (arg11 + this.aClass196_37.anInt5056 + this.aClass196_37.anInt5054 > arg2 && arg11 + arg11 > arg2) {
			local58 = null;
		} else {
			local58 = new int[] { arg13 };
		}
		@Pc(76) int local76 = this.aClass196_37.method4565(Static287.aStringArray25, arg12, arg6, local58);
		if (arg15 == -1) {
			arg15 = arg2 / arg11;
			if (arg15 <= 0) {
				arg15 = 1;
			}
		}
		if (arg15 > 0 && arg15 <= local76) {
			Static287.aStringArray25[arg15 - 1] = this.aClass196_37.method4557(arg13, arg6, Static287.aStringArray25[arg15 - 1]);
			local76 = arg15;
		}
		if (arg10 == 3 && local76 == 1) {
			arg10 = 1;
		}
		@Pc(133) int local133;
		@Pc(200) int local200;
		if (arg10 == 0) {
			local133 = this.aClass196_37.anInt5054 + arg9;
		} else if (arg10 == 1) {
			local133 = arg9 + this.aClass196_37.anInt5054 + (arg2 - arg11 * (local76 - 1) - this.aClass196_37.anInt5054 - this.aClass196_37.anInt5056) / 2;
		} else if (arg10 == 2) {
			local133 = arg9 + arg2 - this.aClass196_37.anInt5056 - (local76 - 1) * arg11;
		} else {
			local200 = (arg2 - (local76 - 1) * arg11 - this.aClass196_37.anInt5054 - this.aClass196_37.anInt5056) / (local76 - -1);
			if (local200 < 0) {
				local200 = 0;
			}
			local133 = arg9 + this.aClass196_37.anInt5054 + local200;
			arg11 += local200;
		}
		for (local200 = 0; local200 < local76; local200++) {
			if (arg7 == 0) {
				this.method8437(arg0, arg14, arg4, arg5, local133, arg6, arg3, Static287.aStringArray25[local200]);
			} else if (arg7 == 1) {
				this.method8437((arg13 - this.aClass196_37.method4556(Static287.aStringArray25[local200])) / 2 + arg0, arg14, arg4, arg5, local133, arg6, arg3, Static287.aStringArray25[local200]);
			} else if (arg7 == 2) {
				this.method8437(arg0 + arg13 - this.aClass196_37.method4556(Static287.aStringArray25[local200]), arg14, arg4, arg5, local133, arg6, arg3, Static287.aStringArray25[local200]);
			} else if (local200 == local76 - 1) {
				this.method8437(arg0, arg14, arg4, arg5, local133, arg6, arg3, Static287.aStringArray25[local200]);
			} else {
				this.method8426(Static287.aStringArray25[local200], arg13);
				this.method8437(arg0, arg14, arg4, arg5, local133, arg6, arg3, Static287.aStringArray25[local200]);
				Static511.anInt9800 = 0;
			}
			local133 += arg11;
		}
		return local76;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method8433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method8431(arg1, arg2);
			this.method8437(arg0, 0, (int[]) null, (Class1) null, arg4, (Class155[]) null, 0, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIIILjava/lang/String;)V")
	public final void method8434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method8431(arg1, arg3);
			this.method8437(arg2 - this.aClass196_37.method4556(arg4) / 2, 0, (int[]) null, (Class1) null, arg0, (Class155[]) null, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!aa;IILjava/lang/String;IIII[Lclient!hk;III[III)I")
	public final int method8435(@OriginalArg(1) Class1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class155[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method8432(arg7, arg10, arg4, arg2, arg12, arg0, arg8, arg1, arg6, arg14, arg13, arg11, arg3, arg5, arg9, 0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method8436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method8431(-16777216, arg2);
		@Pc(27) double local27 = 7.0D - (double) arg0 / 8.0D;
		if (local27 < 0.0D) {
			local27 = 0.0D;
		}
		@Pc(36) int local36 = arg3.length();
		@Pc(39) int[] local39 = new int[local36];
		for (@Pc(41) int local41 = 0; local41 < local36; local41++) {
			local39[local41] = (int) (local27 * Math.sin((double) local41 / 1.5D + (double) arg4));
		}
		this.method8441((int[]) null, (int[]) null, (Class155[]) null, local39, arg1, arg3, arg5 - this.aClass196_37.method4556(arg3) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ILclient!aa;II[Lclient!hk;ILjava/lang/String;)V")
	private void method8437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class155[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(11) int local11 = arg4 - this.aClass196_37.anInt5057;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg7.length();
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(39) char local39 = (char) (Static571.method7687(arg7.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local13 = local28;
			} else {
				if (local39 == '>' && local13 != -1) {
					@Pc(64) String local64 = arg7.substring(local13 + 1, local28);
					local13 = -1;
					if (local64.equals("lt")) {
						local39 = '<';
					} else if (local64.equals("gt")) {
						local39 = '>';
					} else if (local64.equals("nbsp")) {
						local39 = ' ';
					} else if (local64.equals("shy")) {
						local39 = '\u00ad';
					} else if (local64.equals("times")) {
						local39 = '×';
					} else if (local64.equals("euro")) {
						local39 = '€';
					} else if (local64.equals("copy")) {
						local39 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									@Pc(158) int local158 = Static407.method5956(local64.substring(4));
									@Pc(162) Class155 local162 = arg5[local158];
									@Pc(172) int local172 = arg2 == null ? local162.method7209() : arg2[local158];
									if ((-16777216 & Static130.anInt2168) == -16777216) {
										local162.method7205(arg0, this.aClass196_37.anInt5057 + local11 - local172, 1, 0, 1);
									} else {
										local162.method7205(arg0, this.aClass196_37.anInt5057 + local11 - local172, 0, Static130.anInt2168 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg0 += arg5[local158].method7206();
								} catch (@Pc(226) Exception local226) {
								}
							} else {
								this.method8427(local64);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass196_37.method4561(local39, local15);
					}
					if (local39 == ' ') {
						if (Static511.anInt9800 > 0) {
							Static277.anInt4945 += Static511.anInt9800;
							arg0 += Static277.anInt4945 >> 8;
							Static277.anInt4945 &= 0xFF;
						}
					} else if (arg3 == null) {
						if ((Static220.anInt3839 & 0xFF000000) != 0) {
							this.fa(local39, arg0 + 1, local11 + 1, Static220.anInt3839, true);
						}
						this.fa(local39, arg0, local11, Static130.anInt2168, false);
					} else {
						if ((Static220.anInt3839 & 0xFF000000) != 0) {
							this.method8425(local39, arg0 + 1, local11 + 1, Static220.anInt3839, true, arg3, arg6, arg1);
						}
						this.method8425(local39, arg0, local11, Static130.anInt2168, false, arg3, arg6, arg1);
					}
					@Pc(366) int local366 = this.aClass196_37.method4559(local39);
					if (Class254.lb != -1) {
						this.aClass100_15.method8615(local366, arg0, local11 + (int) ((double) this.aClass196_37.anInt5057 * 0.7D), Class254.lb);
					}
					if (Static334.anInt9965 != -1) {
						this.aClass100_15.method8615(local366, arg0, this.aClass196_37.anInt5057 + local11 + 1, Static334.anInt9965);
					}
					local15 = local39;
					arg0 += local366;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!hk;IILjava/lang/String;III[I)V")
	public final void method8438(@OriginalArg(0) Class155[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg3 != null) {
			this.method8431(0, arg2);
			this.method8437(arg1, 0, arg5, (Class1) null, arg4, arg0, 0, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method8439(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method8431(-16777216, arg0);
		@Pc(17) int local17 = arg1.length();
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			local20[local22] = (int) (Math.sin((double) local22 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method8441((int[]) null, (int[]) null, (Class155[]) null, local20, arg4, arg1, arg2 - this.aClass196_37.method4556(arg1) / 2);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method8440(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method8431(-16777216, arg2);
		@Pc(17) int local17 = arg1.length();
		@Pc(20) int[] local20 = new int[local17];
		@Pc(23) int[] local23 = new int[local17];
		for (@Pc(30) int local30 = 0; local30 < local17; local30++) {
			local20[local30] = (int) (Math.sin((double) local30 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local23[local30] = (int) (Math.sin((double) local30 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method8441(local20, (int[]) null, (Class155[]) null, local23, arg4, arg1, arg3 - this.aClass196_37.method4556(arg1) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([II[I[Lclient!hk;[IILjava/lang/String;I)V")
	private void method8441(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class155[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - this.aClass196_37.anInt5057;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg5.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(36) char local36 = (char) (Static571.method7687(arg5.charAt(local22)) & 0xFF);
			if (local36 == '<') {
				local13 = local22;
			} else {
				@Pc(154) int local154;
				@Pc(162) int local162;
				if (local36 == '>' && local13 != -1) {
					@Pc(64) String local64 = arg5.substring(local13 + 1, local22);
					local13 = -1;
					if (local64.equals("lt")) {
						local36 = '<';
					} else if (local64.equals("gt")) {
						local36 = '>';
					} else if (local64.equals("nbsp")) {
						local36 = ' ';
					} else if (local64.equals("shy")) {
						local36 = '\u00ad';
					} else if (local64.equals("times")) {
						local36 = '×';
					} else if (local64.equals("euro")) {
						local36 = '€';
					} else if (local64.equals("copy")) {
						local36 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local154 = 0;
									} else {
										local154 = arg0[local17];
									}
									if (arg3 == null) {
										local162 = 0;
									} else {
										local162 = arg3[local17];
									}
									local17++;
									@Pc(175) int local175 = Static407.method5956(local64.substring(4));
									@Pc(179) Class155 local179 = arg2[local175];
									@Pc(189) int local189 = arg1 == null ? local179.method7209() : arg1[local175];
									local179.method7205(arg6 + local154, local7 - -this.aClass196_37.anInt5057 + (-local189 - -local162), 1, 0, 1);
									arg6 += arg2[local175].method7206();
									local15 = -1;
								} catch (@Pc(220) Exception local220) {
								}
							} else {
								this.method8427(local64);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass196_37.method4561(local36, local15);
					}
					@Pc(271) int local271;
					if (arg0 == null) {
						local271 = 0;
					} else {
						local271 = arg0[local17];
					}
					if (arg3 == null) {
						local154 = 0;
					} else {
						local154 = arg3[local17];
					}
					if (local36 != ' ') {
						if ((Static220.anInt3839 & 0xFF000000) != 0) {
							this.fa(local36, arg6 + local271 + 1, local154 + local7 + 1, Static220.anInt3839, true);
						}
						this.fa(local36, arg6 + local271, local7 - -local154, Static130.anInt2168, false);
					} else if (Static511.anInt9800 > 0) {
						Static277.anInt4945 += Static511.anInt9800;
						arg6 += Static277.anInt4945 >> 8;
						Static277.anInt4945 &= 0xFF;
					}
					local17++;
					local162 = this.aClass196_37.method4559(local36);
					if (Class254.lb != -1) {
						this.aClass100_15.method8615(local162, arg6, local7 + (int) ((double) this.aClass196_37.anInt5057 * 0.7D), Class254.lb);
					}
					if (Static334.anInt9965 != -1) {
						this.aClass100_15.method8615(local162, arg6, local7 + this.aClass196_37.anInt5057, Static334.anInt9965);
					}
					local15 = local36;
					arg6 += local162;
				}
			}
		}
	}
}
