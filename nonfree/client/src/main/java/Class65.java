import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class65 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!ov;")
	private final Class179 aClass179_13;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!qa;")
	private final Class75 aClass75_11;

	static {
		new Class175("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!qa;Lclient!ov;)V")
	protected Class65(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class179 arg1) {
		this.aClass179_13 = arg1;
		this.aClass75_11 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method5801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5815(-16777216, arg4);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg1 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg1 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method5810(local22, local19, null, arg2, arg3, arg0 - this.aClass179_13.method4385(arg2) / 2, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!f;[IZIILjava/lang/String;II)V")
	public final void method5802(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 != null) {
			this.method5815(0, arg4);
			this.method5814(arg0, arg1, null, 0, 0, arg5, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[Lclient!f;ILjava/lang/String;[IIILjava/util/Random;)I")
	public final int method5803(@OriginalArg(2) int arg0, @OriginalArg(3) Class22[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5, @OriginalArg(9) Random arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg6.setSeed((long) arg5);
		@Pc(20) int local20 = (arg6.nextInt() & 0x1F) + 192;
		this.method5815((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg3.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(55) int local55 = 0; local55 < local40; local55++) {
			local43[local55] = local45;
			if ((arg6.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method5810(null, local43, arg1, arg3, arg2, arg0, arg4);
		return local45;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IIBII)V")
	public final void method5804(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5815(arg4, arg3);
			this.method5814(null, null, null, 0, 0, arg2, arg0, arg1 - this.aClass179_13.method4385(arg0) / 2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	private void method5805(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(32) int local32 = 0; arg0.length() > local32; local32++) {
			@Pc(37) char local37 = arg0.charAt(local32);
			if (local37 == '<') {
				local7 = true;
			} else if (local37 == '>') {
				local7 = false;
			} else if (!local7 && local37 == ' ') {
				local5++;
			}
		}
		if (local5 > 0) {
			Static451.anInt7605 = (arg1 - this.aClass179_13.method4385(arg0) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method5806(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static152.anInt3315 = Static152.anInt3315 & 0xFF000000 | Static239.method3737(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static152.anInt3315 = Static152.anInt3315 & 0xFF000000 | Static16.anInt531 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static152.anInt3315 = Static239.method3737(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static152.anInt3315 = Static16.anInt531;
			} else if (arg0.startsWith("str=")) {
				Static54.anInt1288 = Static239.method3737(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static54.anInt1288 = -8388608;
			} else if (arg0.equals("/str")) {
				Static54.anInt1288 = -1;
			} else if (arg0.startsWith("u=")) {
				Static398.anInt6899 = Static239.method3737(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static398.anInt6899 = -16777216;
			} else if (arg0.equals("/u")) {
				Static398.anInt6899 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static2.anInt62 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static2.anInt62 = Static239.method3737(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static2.anInt62 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static2.anInt62 = Static187.anInt3760;
			} else if (arg0.equals("br")) {
				this.method5815(Static187.anInt3760, Static16.anInt531);
			}
		} catch (@Pc(154) Exception local154) {
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	protected abstract void method5807(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class32 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILjava/util/Random;III[Lclient!f;[IBLjava/lang/String;[I)I")
	public final int method5808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Random arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class22[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(13) String arg12, @OriginalArg(14) int[] arg13) {
		if (arg12 == null) {
			return 0;
		}
		arg6.setSeed((long) arg9);
		@Pc(19) int local19 = (arg6.nextInt() & 0x1F) + 192;
		this.method5815(arg3 & 0xFFFFFF | local19 << 24, local19 << 24 | arg7 & 0xFFFFFF);
		@Pc(45) int local45 = arg12.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg6.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(76) int local76 = arg5;
		@Pc(82) int local82 = this.aClass179_13.anInt5455 + arg1;
		@Pc(84) int local84 = -1;
		if (arg8 == 1) {
			local82 += (arg2 - this.aClass179_13.anInt5455 - this.aClass179_13.anInt5440) / 2;
		} else if (arg8 == 2) {
			local82 = arg2 + arg1 - this.aClass179_13.anInt5440;
		}
		if (arg0 == 1) {
			local84 = local50 + this.aClass179_13.method4385(arg12);
			local76 = arg5 + (arg4 - local84) / 2;
		} else if (arg0 == 2) {
			local84 = this.aClass179_13.method4385(arg12) + local50;
			local76 = arg5 + arg4 - local84;
		}
		this.method5810(null, local48, arg10, arg12, local82, local76, arg13);
		if (arg11 != null) {
			if (local84 == -1) {
				local84 = this.aClass179_13.method4385(arg12) + local50;
			}
			arg11[0] = local76;
			arg11[3] = this.aClass179_13.anInt5440 + this.aClass179_13.anInt5455;
			arg11[2] = local84;
			arg11[1] = local82 - this.aClass179_13.anInt5455;
		}
		return local50;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILclient!ea;ILjava/lang/String;III[IIII[Lclient!f;III)I")
	public final int method5809(@OriginalArg(2) Class32 arg0, @OriginalArg(4) String arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int[] arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) Class22[] arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method5816(arg3, arg5, arg0, arg10, arg9, arg8, 0, arg11, arg7, 1, arg1, arg4, arg2, arg6, arg12, 0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I[II[Lclient!f;Ljava/lang/String;II[I)V")
	private void method5810(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class22[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(5) int local5 = arg4 - this.aClass179_13.anInt5456;
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = 0;
		@Pc(22) int local22 = arg3.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(34) char local34 = (char) (Static278.method5344(arg3.charAt(local24)) & 0xFF);
			if (local34 == '<') {
				local11 = local24;
			} else {
				@Pc(115) int local115;
				@Pc(124) int local124;
				if (local34 == '>' && local11 != -1) {
					@Pc(56) String local56 = arg3.substring(local11 + 1, local24);
					local11 = -1;
					if (local56.equals("lt")) {
						local34 = '<';
					} else if (local56.equals("gt")) {
						local34 = '>';
					} else if (local56.equals("nbsp")) {
						local34 = ' ';
					} else if (local56.equals("shy")) {
						local34 = '\u00ad';
					} else if (local56.equals("times")) {
						local34 = '×';
					} else if (local56.equals("euro")) {
						local34 = '€';
					} else if (local56.equals("copy")) {
						local34 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local115 = 0;
									} else {
										local115 = arg1[local19];
									}
									if (arg0 == null) {
										local124 = 0;
									} else {
										local124 = arg0[local19];
									}
									local19++;
									@Pc(134) int local134 = Static110.method1873(local56.substring(4));
									@Pc(138) Class22 local138 = arg2[local134];
									@Pc(147) int local147 = arg6 == null ? local138.JA() : arg6[local134];
									local138.YA(local115 + arg5, -local147 + local5 - (-this.aClass179_13.anInt5456 - local124), 1, 0, 1);
									local17 = -1;
									arg5 += arg2[local134].ja();
								} catch (@Pc(177) Exception local177) {
								}
							} else {
								this.method5806(local56);
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					if (local17 != -1) {
						arg5 += this.aClass179_13.method4393(local34, local17);
					}
					@Pc(211) int local211;
					if (arg1 == null) {
						local211 = 0;
					} else {
						local211 = arg1[local19];
					}
					if (arg0 == null) {
						local115 = 0;
					} else {
						local115 = arg0[local19];
					}
					if (local34 != ' ') {
						if ((Static2.anInt62 & 0xFF000000) != 0) {
							this.B(local34, arg5 + local211 + 1, local5 + 1 + local115, Static2.anInt62, true);
						}
						this.B(local34, local211 + arg5, local5 + local115, Static152.anInt3315, false);
					} else if (Static451.anInt7605 > 0) {
						Static18.anInt568 += Static451.anInt7605;
						arg5 += Static18.anInt568 >> 8;
						Static18.anInt568 &= 0xFF;
					}
					local19++;
					local124 = this.aClass179_13.method4394(local34);
					if (Static54.anInt1288 != -1) {
						this.aClass75_11.method2639(arg5, local5 + (int) ((double) this.aClass179_13.anInt5456 * 0.7D), Static54.anInt1288, local124);
					}
					if (Static398.anInt6899 != -1) {
						this.aClass75_11.method2639(arg5, this.aClass179_13.anInt5456 + local5, Static398.anInt6899, local124);
					}
					local17 = local34;
					arg5 += local124;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;BIIIIII)V")
	public final void method5811(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method5815(-16777216, arg1);
		@Pc(20) double local20 = 7.0D - (double) arg2 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg0.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(40) int local40 = 0; local40 < local29; local40++) {
			local32[local40] = (int) (local20 * Math.sin((double) local40 / 1.5D + (double) arg3));
		}
		this.method5810(local32, null, null, arg0, arg4, arg5 - this.aClass179_13.method4385(arg0) / 2, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIZLjava/lang/String;)V")
	public final void method5812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method5815(-16777216, arg3);
		@Pc(20) int local20 = arg4.length();
		@Pc(23) int[] local23 = new int[local20];
		for (@Pc(25) int local25 = 0; local25 < local20; local25++) {
			local23[local25] = (int) (Math.sin((double) arg2 / 5.0D + (double) local25 / 2.0D) * 5.0D);
		}
		this.method5810(local23, null, null, arg4, arg1, arg0 - this.aClass179_13.method4385(arg4) / 2, null);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method5813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		if (arg2 != null) {
			this.method5815(-1, arg3);
			this.method5814(null, null, null, 0, 0, arg1, arg2, arg0 - this.aClass179_13.method4385(arg2));
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!f;[IILclient!ea;IIILjava/lang/String;I)V")
	private void method5814(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class32 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(5) int local5 = arg5 - this.aClass179_13.anInt5456;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(16) int local16 = arg6.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(28) char local28 = (char) (Static278.method5344(arg6.charAt(local18)) & 0xFF);
			if (local28 == '<') {
				local11 = local18;
			} else {
				if (local28 == '>' && local11 != -1) {
					@Pc(51) String local51 = arg6.substring(local11 + 1, local18);
					local11 = -1;
					if (local51.equals("lt")) {
						local28 = '<';
					} else if (local51.equals("gt")) {
						local28 = '>';
					} else if (local51.equals("nbsp")) {
						local28 = ' ';
					} else if (local51.equals("shy")) {
						local28 = '\u00ad';
					} else if (local51.equals("times")) {
						local28 = '×';
					} else if (local51.equals("euro")) {
						local28 = '€';
					} else if (local51.equals("copy")) {
						local28 = '©';
					} else {
						if (!local51.equals("reg")) {
							if (local51.startsWith("img=")) {
								try {
									@Pc(109) int local109 = Static110.method1873(local51.substring(4));
									@Pc(113) Class22 local113 = arg0[local109];
									@Pc(122) int local122 = arg1 == null ? local113.JA() : arg1[local109];
									if ((Static152.anInt3315 & 0xFF000000) == -16777216) {
										local113.YA(arg7, local5 + this.aClass179_13.anInt5456 - local122, 1, 0, 1);
									} else {
										local113.YA(arg7, this.aClass179_13.anInt5456 + local5 - local122, 0, Static152.anInt3315 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local13 = -1;
									arg7 += arg0[local109].ja();
								} catch (@Pc(173) Exception local173) {
								}
							} else {
								this.method5806(local51);
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg7 += this.aClass179_13.method4393(local28, local13);
					}
					if (local28 == ' ') {
						if (Static451.anInt7605 > 0) {
							Static18.anInt568 += Static451.anInt7605;
							arg7 += Static18.anInt568 >> 8;
							Static18.anInt568 &= 0xFF;
						}
					} else if (arg2 == null) {
						if ((Static2.anInt62 & 0xFF000000) != 0) {
							this.B(local28, arg7 + 1, local5 - -1, Static2.anInt62, true);
						}
						this.B(local28, arg7, local5, Static152.anInt3315, false);
					} else {
						if ((Static2.anInt62 & 0xFF000000) != 0) {
							this.method5807(local28, arg7 + 1, local5 + 1, Static2.anInt62, true, arg2, arg3, arg4);
						}
						this.method5807(local28, arg7, local5, Static152.anInt3315, false, arg2, arg3, arg4);
					}
					@Pc(288) int local288 = this.aClass179_13.method4394(local28);
					if (Static54.anInt1288 != -1) {
						this.aClass75_11.method2639(arg7, (int) ((double) this.aClass179_13.anInt5456 * 0.7D) + local5, Static54.anInt1288, local288);
					}
					if (Static398.anInt6899 != -1) {
						this.aClass75_11.method2639(arg7, local5 + this.aClass179_13.anInt5456 + 1, Static398.anInt6899, local288);
					}
					arg7 += local288;
					local13 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI)V")
	private void method5815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static18.anInt568 = 0;
		Static16.anInt531 = arg1;
		Static152.anInt3315 = arg1;
		Static451.anInt7605 = 0;
		Static54.anInt1288 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static398.anInt6899 = -1;
		Static187.anInt3760 = arg0;
		Static2.anInt62 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[ILclient!ea;I[Lclient!f;IIIIILjava/lang/String;IIIIII)I")
	public final int method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) String arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg10 == null) {
			return 0;
		}
		this.method5815(arg0, arg12);
		if (arg15 == 0) {
			arg15 = this.aClass179_13.anInt5456;
		}
		@Pc(49) int[] local49;
		if (arg15 + this.aClass179_13.anInt5440 + this.aClass179_13.anInt5455 > arg7 && arg15 + arg15 > arg7) {
			local49 = null;
		} else {
			local49 = new int[] { arg5 };
		}
		if (arg6 == -1) {
			arg6 = arg7 / arg15;
			if (arg6 <= 0) {
				arg6 = 1;
			}
		}
		@Pc(72) int local72 = this.aClass179_13.method4391(local49, arg4, arg10, Static315.aStringArray135);
		if (arg6 > 0 && local72 >= arg6) {
			local72 = arg6;
			Static315.aStringArray135[arg6 - 1] = this.aClass179_13.method4384(Static315.aStringArray135[arg6 - 1], arg5, arg4);
		}
		if (arg3 == 3 && local72 == 1) {
			arg3 = 1;
		}
		@Pc(163) int local163;
		@Pc(144) int local144;
		if (arg3 == 0) {
			local163 = arg11 + this.aClass179_13.anInt5455;
		} else if (arg3 == 1) {
			local163 = (arg7 - this.aClass179_13.anInt5455 - this.aClass179_13.anInt5440 - arg15 * (local72 + -1)) / 2 + arg11 + this.aClass179_13.anInt5455;
		} else if (arg3 == 2) {
			local163 = arg11 + arg7 - this.aClass179_13.anInt5440 - arg15 * (local72 - 1);
		} else {
			local144 = (arg7 - this.aClass179_13.anInt5455 - this.aClass179_13.anInt5440 - (local72 + -1) * arg15) / (local72 + 1);
			if (local144 < 0) {
				local144 = 0;
			}
			arg15 += local144;
			local163 = local144 + this.aClass179_13.anInt5455 + arg11;
		}
		for (local144 = 0; local144 < local72; local144++) {
			if (arg9 == 0) {
				this.method5814(arg4, arg1, arg2, arg14, arg13, local163, Static315.aStringArray135[local144], arg8);
			} else if (arg9 == 1) {
				this.method5814(arg4, arg1, arg2, arg14, arg13, local163, Static315.aStringArray135[local144], arg8 + (arg5 - this.aClass179_13.method4385(Static315.aStringArray135[local144])) / 2);
			} else if (arg9 == 2) {
				this.method5814(arg4, arg1, arg2, arg14, arg13, local163, Static315.aStringArray135[local144], arg5 + arg8 - this.aClass179_13.method4385(Static315.aStringArray135[local144]));
			} else if (local144 == local72 - 1) {
				this.method5814(arg4, arg1, arg2, arg14, arg13, local163, Static315.aStringArray135[local144], arg8);
			} else {
				this.method5805(Static315.aStringArray135[local144], arg5);
				this.method5814(arg4, arg1, arg2, arg14, arg13, local163, Static315.aStringArray135[local144], arg8);
				Static451.anInt7605 = 0;
			}
			local163 += arg15;
		}
		return local72;
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method5818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5815(arg2, arg3);
			this.method5814(null, null, null, 0, 0, arg0, arg4, arg1);
		}
	}
}
