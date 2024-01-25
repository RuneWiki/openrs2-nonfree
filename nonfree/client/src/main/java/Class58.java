import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class58 {

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!gda;")
	private final Class114 aClass114_13;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!r;")
	private final Class44 aClass44_15;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!r;Lclient!gda;)V")
	protected Class58(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class114 arg1) {
		this.aClass114_13 = arg1;
		this.aClass44_15 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIILjava/util/Random;II[Lclient!f;III[I[I)I")
	public final int method8154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class78[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int[] arg13) {
		if (arg2 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(20) int local20 = (arg5.nextInt() & 0x1F) + 192;
		this.method8170(local20 << 24 | arg3 & 0xFFFFFF, arg10 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg2.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg5.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(69) int local69 = arg9;
		@Pc(75) int local75 = this.aClass114_13.anInt3289 + arg7;
		@Pc(77) int local77 = -1;
		if (arg0 == 1) {
			local75 += (arg11 - this.aClass114_13.anInt3289 - this.aClass114_13.anInt3291) / 2;
		} else if (arg0 == 2) {
			local75 = arg11 + arg7 - this.aClass114_13.anInt3291;
		}
		if (arg4 == 1) {
			local77 = this.aClass114_13.method2950(arg2) + local45;
			local69 = arg9 + (arg1 - local77) / 2;
		} else if (arg4 == 2) {
			local77 = this.aClass114_13.method2950(arg2) + local45;
			local69 = arg9 + arg1 - local77;
		}
		this.method8158(arg12, local75, null, local69, arg2, arg8, local43);
		if (arg13 != null) {
			if (local77 == -1) {
				local77 = this.aClass114_13.method2950(arg2) + local45;
			}
			arg13[0] = local69;
			arg13[1] = local75 - this.aClass114_13.anInt3289;
			arg13[2] = local77;
			arg13[3] = this.aClass114_13.anInt3291 + this.aClass114_13.anInt3289;
		}
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method8156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method8170(arg1, arg0);
			this.method8157(arg4, null, 0, arg2, 0, null, arg3, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IIILjava/lang/String;ILclient!ua;I[Lclient!f;)V")
	private void method8157(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class6 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class78[] arg7) {
		@Pc(19) int local19 = arg6 - this.aClass114_13.anInt3290;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(26) int local26 = arg3.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static558.method8030(arg3.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local21 = local28;
			} else {
				if (local39 == '>' && local21 != -1) {
					@Pc(61) String local61 = arg3.substring(local21 + 1, local28);
					local21 = -1;
					if (local61.equals("lt")) {
						local39 = '<';
					} else if (local61.equals("gt")) {
						local39 = '>';
					} else if (local61.equals("nbsp")) {
						local39 = ' ';
					} else if (local61.equals("shy")) {
						local39 = '\u00ad';
					} else if (local61.equals("times")) {
						local39 = '×';
					} else if (local61.equals("euro")) {
						local39 = '€';
					} else if (local61.equals("copy")) {
						local39 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=")) {
								try {
									@Pc(127) int local127 = Static82.method1379(local61.substring(4));
									@Pc(131) Class78 local131 = arg7[local127];
									@Pc(140) int local140 = arg1 == null ? local131.ca() : arg1[local127];
									if ((Static471.anInt8700 & 0xFF000000) == -16777216) {
										local131.V(arg0, local19 + this.aClass114_13.anInt3290 - local140, 1, 0, 1);
									} else {
										local131.V(arg0, local19 + this.aClass114_13.anInt3290 - local140, 0, Static471.anInt8700 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local23 = -1;
									arg0 += arg7[local127].A();
								} catch (@Pc(192) Exception local192) {
								}
							} else {
								this.method8164(local61);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg0 += this.aClass114_13.method2946(local39, local23);
					}
					if (local39 == ' ') {
						if (Static387.anInt7403 > 0) {
							Static246.anInt4515 += Static387.anInt7403;
							arg0 += Static246.anInt4515 >> 8;
							Static246.anInt4515 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static544.anInt9661 & 0xFF000000) != 0) {
							this.OA(local39, arg0 + 1, local19 + 1, Static544.anInt9661, true);
						}
						this.OA(local39, arg0, local19, Static471.anInt8700, false);
					} else {
						if ((Static544.anInt9661 & 0xFF000000) != 0) {
							this.method8163(local39, arg0 + 1, local19 + 1, Static544.anInt9661, true, arg5, arg2, arg4);
						}
						this.method8163(local39, arg0, local19, Static471.anInt8700, false, arg5, arg2, arg4);
					}
					@Pc(313) int local313 = this.aClass114_13.method2944(local39);
					if (Static144.anInt3006 != -1) {
						this.aClass44_15.method4974(local313, Static144.anInt3006, local19 + (int) ((double) this.aClass114_13.anInt3290 * 0.7D), arg0);
					}
					if (Static36.anInt9785 != -1) {
						this.aClass44_15.method4974(local313, Static36.anInt9785, local19 + this.aClass114_13.anInt3290 + 1, arg0);
					}
					local23 = local39;
					arg0 += local313;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([III[IILjava/lang/String;[Lclient!f;[I)V")
	private void method8158(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class78[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(24) int local24 = arg1 - this.aClass114_13.anInt3290;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg4.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(46) char local46 = (char) (Static558.method8030(arg4.charAt(local35)) & 0xFF);
			if (local46 == '<') {
				local26 = local35;
			} else {
				@Pc(135) int local135;
				@Pc(145) int local145;
				if (local46 == '>' && local26 != -1) {
					@Pc(69) String local69 = arg4.substring(local26 + 1, local35);
					local26 = -1;
					if (local69.equals("lt")) {
						local46 = '<';
					} else if (local69.equals("gt")) {
						local46 = '>';
					} else if (local69.equals("nbsp")) {
						local46 = ' ';
					} else if (local69.equals("shy")) {
						local46 = '\u00ad';
					} else if (local69.equals("times")) {
						local46 = '×';
					} else if (local69.equals("euro")) {
						local46 = '€';
					} else if (local69.equals("copy")) {
						local46 = '©';
					} else {
						if (!local69.equals("reg")) {
							if (local69.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local135 = 0;
									} else {
										local135 = arg6[local30];
									}
									if (arg2 == null) {
										local145 = 0;
									} else {
										local145 = arg2[local30];
									}
									local30++;
									@Pc(156) int local156 = Static82.method1379(local69.substring(4));
									@Pc(160) Class78 local160 = arg5[local156];
									@Pc(169) int local169 = arg0 == null ? local160.ca() : arg0[local156];
									local160.V(local135 + arg3, local145 + local24 + this.aClass114_13.anInt3290 + -local169, 1, 0, 1);
									arg3 += arg5[local156].A();
									local28 = -1;
								} catch (@Pc(198) Exception local198) {
								}
							} else {
								this.method8164(local69);
							}
							continue;
						}
						local46 = '®';
					}
				}
				if (local26 == -1) {
					if (local28 != -1) {
						arg3 += this.aClass114_13.method2946(local46, local28);
					}
					@Pc(235) int local235;
					if (arg6 == null) {
						local235 = 0;
					} else {
						local235 = arg6[local30];
					}
					if (arg2 == null) {
						local135 = 0;
					} else {
						local135 = arg2[local30];
					}
					local30++;
					if (local46 != ' ') {
						if ((Static544.anInt9661 & 0xFF000000) != 0) {
							this.OA(local46, local235 + arg3 + 1, local135 + 1 + local24, Static544.anInt9661, true);
						}
						this.OA(local46, arg3 + local235, local135 + local24, Static471.anInt8700, false);
					} else if (Static387.anInt7403 > 0) {
						Static246.anInt4515 += Static387.anInt7403;
						arg3 += Static246.anInt4515 >> 8;
						Static246.anInt4515 &= 0xFF;
					}
					local145 = this.aClass114_13.method2944(local46);
					if (Static144.anInt3006 != -1) {
						this.aClass44_15.method4974(local145, Static144.anInt3006, (int) ((double) this.aClass114_13.anInt3290 * 0.7D) + local24, arg3);
					}
					if (Static36.anInt9785 != -1) {
						this.aClass44_15.method4974(local145, Static36.anInt9785, local24 + this.aClass114_13.anInt3290, arg3);
					}
					local28 = local46;
					arg3 += local145;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lclient!f;Ljava/lang/String;IIBILclient!ua;I[IIIII)I")
	public final int method8159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class78[] arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class6 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method8168(arg8, arg1, arg0, arg10, arg11, arg4, arg6, arg14, arg2, arg12, arg3, arg5, 0, arg9, arg13, arg7);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[I[Lclient!f;ILjava/lang/String;Ljava/util/Random;III)I")
	public final int method8160(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class78[] arg2, @OriginalArg(5) String arg3, @OriginalArg(6) Random arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg4.setSeed((long) arg0);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method8170(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(45) int local45 = arg3.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg4.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method8158(arg1, arg6, null, arg5, arg3, arg2, local48);
		return local50;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;BI)V")
	public final void method8161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method8170(arg2, -16777216);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(37) int local37 = 0; local37 < local16; local37++) {
			local19[local37] = (int) (Math.sin((double) local37 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local22[local37] = (int) (Math.sin((double) local37 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method8158(null, arg1, local22, arg3 - this.aClass114_13.method2950(arg4) / 2, arg4, null, local19);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method8162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 != null) {
			this.method8170(arg1, arg3);
			this.method8157(arg0 - this.aClass114_13.method2950(arg4), null, 0, arg4, 0, null, arg2, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	protected abstract void method8163(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method8164(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static471.anInt8700 = Static471.anInt8700 & 0xFF000000 | Static48.method633(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static471.anInt8700 = Static471.anInt8700 & 0xFF000000 | Static133.anInt2856 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static471.anInt8700 = Static48.method633(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static471.anInt8700 = Static133.anInt2856;
			} else if (arg0.startsWith("str=")) {
				Static144.anInt3006 = Static471.anInt8700 & 0xFF000000 | Static48.method633(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static144.anInt3006 = Static471.anInt8700 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static144.anInt3006 = -1;
			} else if (arg0.startsWith("u=")) {
				Static36.anInt9785 = Static471.anInt8700 & 0xFF000000 | Static48.method633(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static36.anInt9785 = Static471.anInt8700 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static36.anInt9785 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static544.anInt9661 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static544.anInt9661 = Static471.anInt8700 & 0xFF000000 | Static48.method633(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static544.anInt9661 = Static471.anInt8700 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static544.anInt9661 = Static103.anInt2315;
			} else if (arg0.equals("br")) {
				this.method8170(Static133.anInt2856, Static103.anInt2315);
			}
		} catch (@Pc(192) Exception local192) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBLjava/lang/String;)V")
	private void method8166(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) int local13 = 0;
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < arg1.length(); local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 == '<') {
				local15 = true;
			} else if (local23 == '>') {
				local15 = false;
			} else if (!local15 && local23 == ' ') {
				local13++;
			}
		}
		if (local13 > 0) {
			Static387.anInt7403 = (arg0 - this.aClass114_13.method2950(arg1) << 8) / local13;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method8170(arg3, arg4);
			this.method8157(arg0 - this.aClass114_13.method2950(arg2) / 2, null, 0, arg2, 0, null, arg1, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ua;II[IILjava/lang/String;IIBII[Lclient!f;IIIII)I")
	public final int method8168(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class78[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg5 == null) {
			return 0;
		}
		this.method8170(arg1, arg6);
		if (arg14 == 0) {
			arg14 = this.aClass114_13.anInt3290;
		}
		@Pc(44) int[] local44;
		if (this.aClass114_13.anInt3289 + this.aClass114_13.anInt3291 + arg14 > arg4 && arg14 + arg14 > arg4) {
			local44 = null;
		} else {
			local44 = new int[] { arg11 };
		}
		if (arg12 == -1) {
			arg12 = arg4 / arg14;
			if (arg12 <= 0) {
				arg12 = 1;
			}
		}
		@Pc(71) int local71 = this.aClass114_13.method2947(arg5, Static428.aStringArray56, arg10, local44);
		if (arg12 > 0 && arg12 <= local71) {
			Static428.aStringArray56[arg12 - 1] = this.aClass114_13.method2953(Static428.aStringArray56[arg12 - 1], arg10, arg11);
			local71 = arg12;
		}
		if (arg2 == 3 && local71 == 1) {
			arg2 = 1;
		}
		@Pc(151) int local151;
		@Pc(195) int local195;
		if (arg2 == 0) {
			local151 = arg13 + this.aClass114_13.anInt3289;
		} else if (arg2 == 1) {
			local151 = (arg4 - arg14 * (local71 - 1) - this.aClass114_13.anInt3289 - this.aClass114_13.anInt3291) / 2 + arg13 + this.aClass114_13.anInt3289;
		} else if (arg2 == 2) {
			local151 = arg4 + arg13 - this.aClass114_13.anInt3291 - arg14 * (local71 + -1);
		} else {
			local195 = (arg4 - this.aClass114_13.anInt3291 - this.aClass114_13.anInt3289 - (local71 - 1) * arg14) / (local71 + 1);
			if (local195 < 0) {
				local195 = 0;
			}
			arg14 += local195;
			local151 = local195 + arg13 + this.aClass114_13.anInt3289;
		}
		for (local195 = 0; local195 < local71; local195++) {
			if (arg7 == 0) {
				this.method8157(arg9, arg3, arg15, Static428.aStringArray56[local195], arg8, arg0, local151, arg10);
			} else if (arg7 == 1) {
				this.method8157((arg11 - this.aClass114_13.method2950(Static428.aStringArray56[local195])) / 2 + arg9, arg3, arg15, Static428.aStringArray56[local195], arg8, arg0, local151, arg10);
			} else if (arg7 == 2) {
				this.method8157(arg11 + arg9 - this.aClass114_13.method2950(Static428.aStringArray56[local195]), arg3, arg15, Static428.aStringArray56[local195], arg8, arg0, local151, arg10);
			} else if (local71 - 1 == local195) {
				this.method8157(arg9, arg3, arg15, Static428.aStringArray56[local195], arg8, arg0, local151, arg10);
			} else {
				this.method8166(arg11, Static428.aStringArray56[local195]);
				this.method8157(arg9, arg3, arg15, Static428.aStringArray56[local195], arg8, arg0, local151, arg10);
				Static387.anInt7403 = 0;
			}
			local151 += arg14;
		}
		return local71;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public final void method8169(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method8170(arg5, -16777216);
		@Pc(21) double local21 = 7.0D - (double) arg4 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg0.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (Math.sin((double) arg2 + (double) local35 / 1.5D) * local21);
		}
		this.method8158(null, arg1, local33, arg3 - this.aClass114_13.method2950(arg0) / 2, arg0, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method8170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static246.anInt4515 = 0;
		Static133.anInt2856 = arg0;
		Static471.anInt8700 = arg0;
		Static144.anInt3006 = -1;
		Static387.anInt7403 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static36.anInt9785 = -1;
		Static103.anInt2315 = arg1;
		Static544.anInt9661 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIBI)V")
	public final void method8173(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method8170(arg4, -16777216);
		@Pc(18) int local18 = arg0.length();
		@Pc(21) int[] local21 = new int[local18];
		for (@Pc(23) int local23 = 0; local23 < local18; local23++) {
			local21[local23] = (int) (Math.sin((double) arg1 / 5.0D + (double) local23 / 2.0D) * 5.0D);
		}
		this.method8158(null, arg3, local21, arg2 - this.aClass114_13.method2950(arg0) / 2, arg0, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IILjava/lang/String;II[Lclient!f;ZI)V")
	public final void method8174(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class78[] arg5) {
		if (arg2 != null) {
			this.method8170(arg3, 0);
			this.method8157(arg1, arg0, 0, arg2, 0, null, arg4, arg5);
		}
	}
}
