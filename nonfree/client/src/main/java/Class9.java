import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public abstract class Class9 {

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!uo;")
	private final Class32 aClass32_13;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "Lclient!fa;")
	private final Class63 aClass63_8;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!uo;Lclient!fa;)V")
	protected Class9(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class63 arg1) {
		this.aClass32_13 = arg0;
		this.aClass63_8 = arg1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/String;[Lclient!c;[IIB)V")
	public final void method5002(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class5[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (arg2 != null) {
			this.method5012(0, arg5);
			this.method5017(arg4, 0, 0, arg3, null, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(CIIIZLclient!em;II)V")
	protected abstract void method5003(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class52 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BILjava/lang/String;IIII)V")
	public final void method5004(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5012(-16777216, arg0);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			local19[local25] = (int) (Math.sin((double) local25 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method5009(local19, arg2 - this.aClass63_8.method1746(arg1) / 2, null, arg1, null, arg4, null);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIILjava/lang/String;Z)V")
	public final void method5006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method5012(-16777216, arg3);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) arg1 / 5.0D + (double) local24 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) local24 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method5009(local22, arg2 - this.aClass63_8.method1746(arg4) / 2, null, arg4, null, arg0, local19);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5008(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static59.anInt1745 = Static59.anInt1745 & 0xFF000000 | Static74.method1706(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static59.anInt1745 = Static59.anInt1745 & 0xFF000000 | Static8.anInt5866 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static59.anInt1745 = Static74.method1706(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static59.anInt1745 = Static8.anInt5866;
			} else if (arg0.startsWith("str=")) {
				Static136.anInt3011 = Static74.method1706(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static136.anInt3011 = -8388608;
			} else if (arg0.equals("/str")) {
				Static136.anInt3011 = -1;
			} else if (arg0.startsWith("u=")) {
				Static275.anInt5612 = Static74.method1706(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static275.anInt5612 = -16777216;
			} else if (arg0.equals("/u")) {
				Static275.anInt5612 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static152.anInt4543 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static152.anInt4543 = Static74.method1706(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static152.anInt4543 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static152.anInt4543 = Static223.anInt6314;
			} else if (arg0.equals("br")) {
				this.method5012(Static223.anInt6314, Static8.anInt5866);
			}
		} catch (@Pc(169) Exception local169) {
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([II[Lclient!c;BLjava/lang/String;[II[I)V")
	private void method5009(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg5 - this.aClass63_8.anInt2003;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg3.length();
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			@Pc(39) char local39 = (char) (Static104.method2136(arg3.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local13 = local28;
			} else {
				@Pc(124) int local124;
				@Pc(136) int local136;
				if (local39 == '>' && local13 != -1) {
					@Pc(62) String local62 = arg3.substring(local13 + 1, local28);
					local13 = -1;
					if (local62.equals("lt")) {
						local39 = '<';
					} else if (local62.equals("gt")) {
						local39 = '>';
					} else if (local62.equals("nbsp")) {
						local39 = ' ';
					} else if (local62.equals("shy")) {
						local39 = '\u00ad';
					} else if (local62.equals("times")) {
						local39 = '×';
					} else if (local62.equals("euro")) {
						local39 = '€';
					} else if (local62.equals("copy")) {
						local39 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local124 = 0;
									} else {
										local124 = arg6[local17];
									}
									if (arg0 == null) {
										local136 = 0;
									} else {
										local136 = arg0[local17];
									}
									local17++;
									@Pc(149) int local149 = Static89.method1943(local62.substring(4));
									@Pc(153) Class5 local153 = arg2[local149];
									@Pc(162) int local162 = arg4 == null ? local153.method3630() : arg4[local149];
									local153.method3619(arg1 + local124, -local162 + this.aClass63_8.anInt2003 + local11 + local136, 0, 0);
									local15 = -1;
									arg1 += arg2[local149].method3632();
								} catch (@Pc(191) Exception local191) {
								}
							} else {
								this.method5008(local62);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass63_8.method1757(local39, local15);
					}
					@Pc(231) int local231;
					if (arg6 == null) {
						local231 = 0;
					} else {
						local231 = arg6[local17];
					}
					if (arg0 == null) {
						local124 = 0;
					} else {
						local124 = arg0[local17];
					}
					local17++;
					if (local39 != ' ') {
						if ((Static152.anInt4543 & 0xFF000000) != 0) {
							this.method5016(local39, arg1 + local231 + 1, local124 + local11 + 1, Static152.anInt4543, true);
						}
						this.method5016(local39, local231 + arg1, local124 + local11, Static59.anInt1745, false);
					} else if (Static175.anInt3794 > 0) {
						Static355.anInt6787 += Static175.anInt3794;
						arg1 += Static355.anInt6787 >> 8;
						Static355.anInt6787 &= 0xFF;
					}
					local136 = this.aClass63_8.method1756(local39);
					if (Static136.anInt3011 != -1) {
						this.aClass32_13.method2157(local136, (int) ((double) this.aClass63_8.anInt2003 * 0.7D) + local11, arg1, Static136.anInt3011);
					}
					if (Static275.anInt5612 != -1) {
						this.aClass32_13.method2157(local136, local11 + this.aClass63_8.anInt2003, arg1, Static275.anInt5612);
					}
					arg1 += local136;
					local15 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method5010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method5012(-16777216, arg5);
		@Pc(20) double local20 = 7.0D - (double) arg1 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg3.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (Math.sin((double) arg2 + (double) local34 / 1.5D) * local20);
		}
		this.method5009(local32, arg0 - this.aClass63_8.method1746(arg3) / 2, null, arg3, null, arg4, null);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZI)V")
	private void method5012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static275.anInt5612 = -1;
		Static136.anInt3011 = -1;
		Static175.anInt3794 = 0;
		Static8.anInt5866 = arg1;
		Static59.anInt1745 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static355.anInt6787 = 0;
		Static223.anInt6314 = arg0;
		Static152.anInt4543 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II[IIIII[Lclient!c;IILjava/lang/String;IIIILclient!em;)I")
	public final int method5014(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class52 arg14) {
		if (arg9 == null) {
			return 0;
		}
		this.method5012(arg5, arg13);
		if (arg4 == 0) {
			arg4 = this.aClass63_8.anInt2003;
		}
		@Pc(56) int[] local56;
		if (arg2 < arg4 + this.aClass63_8.anInt1998 + this.aClass63_8.anInt1997 && arg4 + arg4 > arg2) {
			local56 = null;
		} else {
			local56 = new int[] { arg7 };
		}
		@Pc(69) int local69 = this.aClass63_8.method1745(Static130.aStringArray25, arg6, local56, arg9);
		if (arg8 == 3 && local69 == 1) {
			arg8 = 1;
		}
		@Pc(110) int local110;
		@Pc(135) int local135;
		if (arg8 == 0) {
			local110 = this.aClass63_8.anInt1998 + arg3;
		} else if (arg8 == 1) {
			local110 = arg3 + this.aClass63_8.anInt1998 + (arg2 - this.aClass63_8.anInt1998 - this.aClass63_8.anInt1997 - (local69 + -1) * arg4) / 2;
		} else if (arg8 == 2) {
			local110 = arg2 + arg3 - (local69 - 1) * arg4 - this.aClass63_8.anInt1997;
		} else {
			local135 = (arg2 - this.aClass63_8.anInt1997 - this.aClass63_8.anInt1998 - arg4 * (local69 + -1)) / (local69 + 1);
			if (local135 < 0) {
				local135 = 0;
			}
			arg4 += local135;
			local110 = local135 + arg3 + this.aClass63_8.anInt1998;
		}
		for (local135 = 0; local135 < local69; local135++) {
			if (arg0 == 0) {
				this.method5017(arg1, arg12, arg10, arg6, arg14, arg11, Static130.aStringArray25[local135], local110);
			} else if (arg0 == 1) {
				this.method5017(arg1, arg12, arg10, arg6, arg14, (arg7 - this.aClass63_8.method1746(Static130.aStringArray25[local135])) / 2 + arg11, Static130.aStringArray25[local135], local110);
			} else if (arg0 == 2) {
				this.method5017(arg1, arg12, arg10, arg6, arg14, arg7 + arg11 - this.aClass63_8.method1746(Static130.aStringArray25[local135]), Static130.aStringArray25[local135], local110);
			} else if (local135 == local69 - 1) {
				this.method5017(arg1, arg12, arg10, arg6, arg14, arg11, Static130.aStringArray25[local135], local110);
			} else {
				this.method5024(arg7, Static130.aStringArray25[local135]);
				this.method5017(arg1, arg12, arg10, arg6, arg14, arg11, Static130.aStringArray25[local135], local110);
				Static175.anInt3794 = 0;
			}
			local110 += arg4;
		}
		return local69;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III[Lclient!c;[ILjava/util/Random;Ljava/lang/String;III)I")
	public final int method5015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg4.setSeed((long) arg6);
		@Pc(27) int local27 = (arg4.nextInt() & 0x1F) + 192;
		this.method5012((local27 | 0x0) << 24, local27 << 24 | 0xFFFFFF);
		@Pc(47) int local47 = arg5.length();
		@Pc(50) int[] local50 = new int[local47];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local47; local54++) {
			local50[local54] = local52;
			if ((arg4.nextInt() & 0x3) == 0) {
				local52++;
			}
		}
		this.method5009(null, arg1, arg2, arg5, arg3, arg0, local50);
		return local52;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5016(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([IIII[Lclient!c;Lclient!em;ILjava/lang/String;I)V")
	private void method5017(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5[] arg3, @OriginalArg(5) Class52 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg7 - this.aClass63_8.anInt2003;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(23) int local23 = arg6.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) char local36 = (char) (Static104.method2136(arg6.charAt(local25)) & 0xFF);
			if (local36 == '<') {
				local13 = local25;
			} else {
				if (local36 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg6.substring(local13 + 1, local25);
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
									@Pc(112) int local112 = Static89.method1943(local56.substring(4));
									@Pc(116) Class5 local116 = arg3[local112];
									@Pc(125) int local125 = arg0 == null ? local116.method3630() : arg0[local112];
									if ((Static59.anInt1745 & 0xFF000000) == -16777216) {
										local116.method3619(arg5, this.aClass63_8.anInt2003 + local7 - local125, 0, 0);
									} else {
										local116.method3619(arg5, local7 + this.aClass63_8.anInt2003 - local125, 1, Static59.anInt1745 & 0xFF000000 | 0xFFFFFF);
									}
									local15 = -1;
									arg5 += arg3[local112].method3632();
								} catch (@Pc(177) Exception local177) {
								}
							} else {
								this.method5008(local56);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg5 += this.aClass63_8.method1757(local36, local15);
					}
					if (local36 == ' ') {
						if (Static175.anInt3794 > 0) {
							Static355.anInt6787 += Static175.anInt3794;
							arg5 += Static355.anInt6787 >> 8;
							Static355.anInt6787 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static152.anInt4543 & 0xFF000000) != 0) {
							this.method5016(local36, arg5 + 1, local7 + 1, Static152.anInt4543, true);
						}
						this.method5016(local36, arg5, local7, Static59.anInt1745, false);
					} else {
						if ((Static152.anInt4543 & 0xFF000000) != 0) {
							this.method5003(local36, arg5 + 1, local7 + 1, Static152.anInt4543, true, arg4, arg1, arg2);
						}
						this.method5003(local36, arg5, local7, Static59.anInt1745, false, arg4, arg1, arg2);
					}
					@Pc(306) int local306 = this.aClass63_8.method1756(local36);
					if (Static136.anInt3011 != -1) {
						this.aClass32_13.method2157(local306, local7 + (int) ((double) this.aClass63_8.anInt2003 * 0.7D), arg5, Static136.anInt3011);
					}
					if (Static275.anInt5612 != -1) {
						this.aClass32_13.method2157(local306, this.aClass63_8.anInt2003 + local7 + 1, arg5, Static275.anInt5612);
					}
					arg5 += local306;
					local15 = local36;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIZLjava/lang/String;)V")
	public final void method5019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5012(arg0, arg2);
			this.method5017(null, 0, 0, null, null, arg1 - this.aClass63_8.method1746(arg4) / 2, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/util/Random;IIII[III[Lclient!c;[IILjava/lang/String;)I")
	public final int method5020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class5[] arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) String arg13) {
		if (arg13 == null) {
			return 0;
		}
		arg2.setSeed((long) arg9);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method5012(arg8 & 0xFFFFFF | local20 << 24, arg0 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg13.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg2.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(73) int local73 = arg3;
		@Pc(80) int local80 = arg12 + this.aClass63_8.anInt1998;
		if (arg5 == 1) {
			local80 += (arg6 - this.aClass63_8.anInt1997 - this.aClass63_8.anInt1998) / 2;
		} else if (arg5 == 2) {
			local80 = arg6 + arg12 - this.aClass63_8.anInt1997;
		}
		@Pc(117) int local117 = -1;
		if (arg4 == 1) {
			local117 = local45 + this.aClass63_8.method1746(arg13);
			local73 = arg3 + (arg1 - local117) / 2;
		} else if (arg4 == 2) {
			local117 = this.aClass63_8.method1746(arg13) + local45;
			local73 = arg3 + arg1 - local117;
		}
		this.method5009(null, local73, arg10, arg13, arg7, local80, local43);
		if (arg11 != null) {
			if (local117 == -1) {
				local117 = local45 + this.aClass63_8.method1746(arg13);
			}
			arg11[1] = local80 - this.aClass63_8.anInt1998;
			arg11[2] = local117;
			arg11[3] = this.aClass63_8.anInt1997 + this.aClass63_8.anInt1998;
			arg11[0] = local73;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(IIIIZLjava/lang/String;)V")
	public final void method5021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5012(arg3, arg0);
			this.method5017(null, 0, 0, null, null, arg1, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBILjava/lang/String;II)V")
	public final void method5023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		if (arg2 != null) {
			this.method5012(-1, arg3);
			this.method5017(null, 0, 0, null, null, arg0 - this.aClass63_8.method1746(arg2), arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;B)V")
	private void method5024(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
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
			Static175.anInt3794 = (arg0 - this.aClass63_8.method1746(arg1) << 8) / local7;
		}
	}
}
