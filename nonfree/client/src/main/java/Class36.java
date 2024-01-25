import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public abstract class Class36 {

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!qa;")
	private final Class4 aClass4_12;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!fc;")
	private final Class96 aClass96_13;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!qa;Lclient!fc;)V")
	protected Class36(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class96 arg1) {
		this.aClass4_12 = arg0;
		this.aClass96_13 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method7948(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7958(arg1, arg3);
			this.method7955(arg2, arg0, null, arg4 - this.aClass96_13.method2370(arg0) / 2, 0, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method7949(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method7958(-1, arg1);
			this.method7955(arg3, arg0, null, arg2 - this.aClass96_13.method2370(arg0), 0, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;[Lclient!ha;IIII[I)V")
	public final void method7950(@OriginalArg(1) String arg0, @OriginalArg(2) Class104[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg0 != null) {
			this.method7958(0, arg4);
			this.method7955(arg2, arg0, null, arg3, 0, arg1, arg5, 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method7951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method7958(-16777216, arg3);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			local19[local25] = (int) (Math.sin((double) local25 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method7959(null, arg1 - this.aClass96_13.method2370(arg4) / 2, arg0, null, local19, null, arg4);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method7958(-16777216, arg4);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(29) int local29 = 0; local29 < local16; local29++) {
			local19[local29] = (int) (Math.sin((double) local29 / 5.0D + (double) arg2 / 5.0D) * 5.0D);
			local22[local29] = (int) (Math.sin((double) arg2 / 5.0D + (double) local29 / 3.0D) * 5.0D);
		}
		this.method7959(null, arg0 - this.aClass96_13.method2370(arg3) / 2, arg1, local19, local22, null, arg3);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method7953(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static115.anInt2347 = Static115.anInt2347 & 0xFF000000 | Static88.method1876(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static115.anInt2347 = Static115.anInt2347 & 0xFF000000 | Static106.anInt2237 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static115.anInt2347 = Static88.method1876(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static115.anInt2347 = Static106.anInt2237;
			} else if (arg0.startsWith("str=")) {
				Static219.anInt4317 = Static115.anInt2347 & 0xFF000000 | Static88.method1876(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static219.anInt4317 = Static115.anInt2347 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static219.anInt4317 = -1;
			} else if (arg0.startsWith("u=")) {
				Static143.anInt2846 = Static115.anInt2347 & 0xFF000000 | Static88.method1876(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static143.anInt2846 = Static115.anInt2347 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static143.anInt2846 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static285.anInt5494 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static285.anInt5494 = Static115.anInt2347 & 0xFF000000 | Static88.method1876(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static285.anInt5494 = Static115.anInt2347 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static285.anInt5494 = Static369.anInt6643;
				return;
			} else if (arg0.equals("br")) {
				this.method7958(Static369.anInt6643, Static106.anInt2237);
				return;
			}
		} catch (@Pc(173) Exception local173) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/lang/String;IIZ)V")
	public final void method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method7958(arg4, arg0);
			this.method7955(arg1, arg2, null, arg3, 0, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
	protected abstract void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILjava/lang/String;Lclient!pa;II[Lclient!ha;[II)V")
	private void method7955(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class104[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg0 - this.aClass96_13.anInt2544;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(31) int local31 = arg1.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(44) char local44 = (char) (Static310.method5796(arg1.charAt(local33)) & 0xFF);
			if (local44 == '<') {
				local26 = local33;
			} else {
				if (local44 == '>' && local26 != -1) {
					@Pc(65) String local65 = arg1.substring(local26 + 1, local33);
					local26 = -1;
					if (local65.equals("lt")) {
						local44 = '<';
					} else if (local65.equals("gt")) {
						local44 = '>';
					} else if (local65.equals("nbsp")) {
						local44 = ' ';
					} else if (local65.equals("shy")) {
						local44 = '\u00ad';
					} else if (local65.equals("times")) {
						local44 = '×';
					} else if (local65.equals("euro")) {
						local44 = '€';
					} else if (local65.equals("copy")) {
						local44 = '©';
					} else {
						if (!local65.equals("reg")) {
							if (local65.startsWith("img=")) {
								try {
									@Pc(135) int local135 = Static302.method8211(local65.substring(4));
									@Pc(139) Class104 local139 = arg5[local135];
									@Pc(148) int local148 = arg6 == null ? local139.ma() : arg6[local135];
									if ((Static115.anInt2347 & 0xFF000000) == -16777216) {
										local139.DA(arg3, local7 + this.aClass96_13.anInt2544 - local148, 1, 0, 1);
									} else {
										local139.DA(arg3, this.aClass96_13.anInt2544 + local7 - local148, 0, Static115.anInt2347 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg3 += arg5[local135].EA();
									local28 = -1;
								} catch (@Pc(199) Exception local199) {
								}
							} else {
								this.method7953(local65);
							}
							continue;
						}
						local44 = '®';
					}
				}
				if (local26 == -1) {
					if (local28 != -1) {
						arg3 += this.aClass96_13.method2365(local44, local28);
					}
					if (local44 == ' ') {
						if (Static212.anInt4238 > 0) {
							Static524.anInt9252 += Static212.anInt4238;
							arg3 += Static524.anInt9252 >> 8;
							Static524.anInt9252 &= 0xFF;
						}
					} else if (arg2 == null) {
						if ((Static285.anInt5494 & 0xFF000000) != 0) {
							this.HA(local44, arg3 + 1, local7 + 1, Static285.anInt5494, true);
						}
						this.HA(local44, arg3, local7, Static115.anInt2347, false);
					} else {
						if ((Static285.anInt5494 & 0xFF000000) != 0) {
							this.method7956(local44, arg3 + 1, local7 + 1, Static285.anInt5494, true, arg2, arg7, arg4);
						}
						this.method7956(local44, arg3, local7, Static115.anInt2347, false, arg2, arg7, arg4);
					}
					@Pc(314) int local314 = this.aClass96_13.method2369(local44);
					if (Static219.anInt4317 != -1) {
						this.aClass4_12.method7157(local314, Static219.anInt4317, local7 + (int) ((double) this.aClass96_13.anInt2544 * 0.7D), arg3);
					}
					if (Static143.anInt2846 != -1) {
						this.aClass4_12.method7157(local314, Static143.anInt2846, this.aClass96_13.anInt2544 + local7 + 1, arg3);
					}
					arg3 += local314;
					local28 = local44;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	protected abstract void method7956(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class28 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([II[Lclient!ha;Ljava/lang/String;IILjava/util/Random;III)I")
	public final int method7957(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class104[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Random arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg4.setSeed((long) arg6);
		@Pc(21) int local21 = (arg4.nextInt() & 0x1F) + 192;
		this.method7958((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg2.length();
		@Pc(52) int[] local52 = new int[local41];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < local41; local56++) {
			local52[local56] = local54;
			if ((arg4.nextInt() & 0x3) == 0) {
				local54++;
			}
		}
		this.method7959(arg1, arg3, arg5, local52, null, arg0, arg2);
		return local54;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	private void method7958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static524.anInt9252 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static106.anInt2237 = arg1;
		Static115.anInt2347 = arg1;
		Static219.anInt4317 = -1;
		Static143.anInt2846 = -1;
		Static212.anInt4238 = 0;
		Static369.anInt6643 = arg0;
		Static285.anInt5494 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;III[I[I[ILjava/lang/String;)V")
	private void method7959(@OriginalArg(0) Class104[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) String arg6) {
		@Pc(11) int local11 = arg2 - this.aClass96_13.anInt2544;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg6.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static310.method5796(arg6.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(126) int local126;
				@Pc(136) int local136;
				if (local33 == '>' && local13 != -1) {
					@Pc(58) String local58 = arg6.substring(local13 + 1, local22);
					local13 = -1;
					if (local58.equals("lt")) {
						local33 = '<';
					} else if (local58.equals("gt")) {
						local33 = '>';
					} else if (local58.equals("nbsp")) {
						local33 = ' ';
					} else if (local58.equals("shy")) {
						local33 = '\u00ad';
					} else if (local58.equals("times")) {
						local33 = '×';
					} else if (local58.equals("euro")) {
						local33 = '€';
					} else if (local58.equals("copy")) {
						local33 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local126 = 0;
									} else {
										local126 = arg3[local17];
									}
									if (arg4 == null) {
										local136 = 0;
									} else {
										local136 = arg4[local17];
									}
									local17++;
									@Pc(147) int local147 = Static302.method8211(local58.substring(4));
									@Pc(151) Class104 local151 = arg0[local147];
									@Pc(160) int local160 = arg5 == null ? local151.ma() : arg5[local147];
									local151.DA(arg1 + local126, -local160 + this.aClass96_13.anInt2544 + local11 - -local136, 1, 0, 1);
									local15 = -1;
									arg1 += arg0[local147].EA();
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method7953(local58);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass96_13.method2365(local33, local15);
					}
					@Pc(227) int local227;
					if (arg3 == null) {
						local227 = 0;
					} else {
						local227 = arg3[local17];
					}
					if (arg4 == null) {
						local126 = 0;
					} else {
						local126 = arg4[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static285.anInt5494 & 0xFF000000) != 0) {
							this.HA(local33, arg1 + local227 + 1, local126 + local11 - -1, Static285.anInt5494, true);
						}
						this.HA(local33, local227 + arg1, local11 + local126, Static115.anInt2347, false);
					} else if (Static212.anInt4238 > 0) {
						Static524.anInt9252 += Static212.anInt4238;
						arg1 += Static524.anInt9252 >> 8;
						Static524.anInt9252 &= 0xFF;
					}
					local136 = this.aClass96_13.method2369(local33);
					if (Static219.anInt4317 != -1) {
						this.aClass4_12.method7157(local136, Static219.anInt4317, (int) ((double) this.aClass96_13.anInt2544 * 0.7D) + local11, arg1);
					}
					if (Static143.anInt2846 != -1) {
						this.aClass4_12.method7157(local136, Static143.anInt2846, local11 + this.aClass96_13.anInt2544, arg1);
					}
					local15 = local33;
					arg1 += local136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IBI[I[IIIIII[Lclient!ha;Ljava/util/Random;I)I")
	public final int method7960(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class104[] arg11, @OriginalArg(13) Random arg12, @OriginalArg(14) int arg13) {
		if (arg1 == null) {
			return 0;
		}
		arg12.setSeed((long) arg3);
		@Pc(20) int local20 = (arg12.nextInt() & 0x1F) + 192;
		this.method7958(arg9 & 0xFFFFFF | local20 << 24, local20 << 24 | arg7 & 0xFFFFFF);
		@Pc(40) int local40 = arg1.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg12.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(73) int local73 = arg0;
		@Pc(80) int local80 = arg6 + this.aClass96_13.anInt2545;
		if (arg8 == 1) {
			local80 += (arg10 - this.aClass96_13.anInt2538 - this.aClass96_13.anInt2545) / 2;
		} else if (arg8 == 2) {
			local80 = arg6 + arg10 - this.aClass96_13.anInt2538;
		}
		@Pc(117) int local117 = -1;
		if (arg2 == 1) {
			local117 = this.aClass96_13.method2370(arg1) + local45;
			local73 = arg0 + (arg13 - local117) / 2;
		} else if (arg2 == 2) {
			local117 = this.aClass96_13.method2370(arg1) + local45;
			local73 = arg0 + arg13 - local117;
		}
		this.method7959(arg11, local73, local80, local43, null, arg4, arg1);
		if (arg5 != null) {
			if (local117 == -1) {
				local117 = this.aClass96_13.method2370(arg1) + local45;
			}
			arg5[2] = local117;
			arg5[1] = local80 - this.aClass96_13.anInt2545;
			arg5[0] = local73;
			arg5[3] = this.aClass96_13.anInt2538 + this.aClass96_13.anInt2545;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public final void method7961(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7958(-16777216, arg4);
		@Pc(20) double local20 = 7.0D - (double) arg2 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg0.length();
		@Pc(40) int[] local40 = new int[local29];
		for (@Pc(42) int local42 = 0; local42 < local29; local42++) {
			local40[local42] = (int) (local20 * Math.sin((double) local42 / 1.5D + (double) arg5));
		}
		this.method7959(null, arg1 - this.aClass96_13.method2370(arg0) / 2, arg3, null, local40, null, arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!pa;I[Lclient!ha;IIIIILjava/lang/String;II[IIIIII)I")
	public final int method7962(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg7 == null) {
			return 0;
		}
		this.method7958(arg3, arg15);
		if (arg5 == 0) {
			arg5 = this.aClass96_13.anInt2544;
		}
		@Pc(46) int[] local46;
		if (arg5 + this.aClass96_13.anInt2538 + this.aClass96_13.anInt2545 > arg6 && arg5 + arg5 > arg6) {
			local46 = null;
		} else {
			local46 = new int[] { arg13 };
		}
		if (arg12 == -1) {
			arg12 = arg6 / arg5;
			if (arg12 <= 0) {
				arg12 = 1;
			}
		}
		@Pc(79) int local79 = this.aClass96_13.method2371(arg7, Static246.aStringArray25, arg2, local46);
		if (arg12 > 0 && arg12 <= local79) {
			local79 = arg12;
			Static246.aStringArray25[arg12 - 1] = this.aClass96_13.method2372(Static246.aStringArray25[arg12 - 1], arg2, arg13);
		}
		if (arg11 == 3 && local79 == 1) {
			arg11 = 1;
		}
		@Pc(148) int local148;
		@Pc(172) int local172;
		if (arg11 == 0) {
			local148 = arg4 + this.aClass96_13.anInt2545;
		} else if (arg11 == 1) {
			local148 = this.aClass96_13.anInt2545 + arg4 + (arg6 - this.aClass96_13.anInt2538 - this.aClass96_13.anInt2545 - (local79 - 1) * arg5) / 2;
		} else if (arg11 == 2) {
			local148 = arg6 + arg4 - (local79 - 1) * arg5 - this.aClass96_13.anInt2538;
		} else {
			local172 = (arg6 - this.aClass96_13.anInt2545 - this.aClass96_13.anInt2538 - (local79 - 1) * arg5) / (local79 - -1);
			if (local172 < 0) {
				local172 = 0;
			}
			local148 = arg4 + this.aClass96_13.anInt2545 + local172;
			arg5 += local172;
		}
		for (local172 = 0; local172 < local79; local172++) {
			if (arg14 == 0) {
				this.method7955(local148, Static246.aStringArray25[local172], arg0, arg8, arg1, arg2, arg10, arg9);
			} else if (arg14 == 1) {
				this.method7955(local148, Static246.aStringArray25[local172], arg0, arg8 + (arg13 - this.aClass96_13.method2370(Static246.aStringArray25[local172])) / 2, arg1, arg2, arg10, arg9);
			} else if (arg14 == 2) {
				this.method7955(local148, Static246.aStringArray25[local172], arg0, arg13 + arg8 - this.aClass96_13.method2370(Static246.aStringArray25[local172]), arg1, arg2, arg10, arg9);
			} else if (local79 - 1 == local172) {
				this.method7955(local148, Static246.aStringArray25[local172], arg0, arg8, arg1, arg2, arg10, arg9);
			} else {
				this.method7964(Static246.aStringArray25[local172], arg13);
				this.method7955(local148, Static246.aStringArray25[local172], arg0, arg8, arg1, arg2, arg10, arg9);
				Static212.anInt4238 = 0;
			}
			local148 += arg5;
		}
		return local79;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;I[IILclient!pa;Ljava/lang/String;IIIZIIIIII)I")
	public final int method7963(@OriginalArg(0) Class104[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class28 arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(15) int arg12) {
		return this.method7962(arg3, arg6, arg0, arg8, arg1, 0, arg5, arg4, arg10, arg7, arg2, arg12, 0, arg9, 1, arg11);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method7964(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; arg0.length() > local19; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '<') {
				local17 = true;
			} else if (local25 == '>') {
				local17 = false;
			} else if (!local17 && local25 == ' ') {
				local15++;
			}
		}
		if (local15 > 0) {
			Static212.anInt4238 = (arg1 - this.aClass96_13.method2370(arg0) << 8) / local15;
		}
	}
}
