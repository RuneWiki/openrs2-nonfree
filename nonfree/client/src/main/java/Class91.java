import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public abstract class Class91 {

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!kga;")
	private final Class196 aClass196_12;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Lclient!oa;")
	private final Class66 aClass66_16;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!oa;Lclient!kga;)V")
	protected Class91(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class196 arg1) {
		this.aClass196_12 = arg1;
		this.aClass66_16 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;I[Lclient!xa;I[IILclient!fa;)V")
	private void method7450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class13[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class98 arg7) {
		@Pc(7) int local7 = arg6 - this.aClass196_12.anInt5167;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(22) int local22 = arg2.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) char local35 = (char) (Static22.method428(arg2.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local17 = local24;
			} else {
				if (local35 == '>' && local17 != -1) {
					@Pc(58) String local58 = arg2.substring(local17 + 1, local24);
					local17 = -1;
					if (local58.equals("lt")) {
						local35 = '<';
					} else if (local58.equals("gt")) {
						local35 = '>';
					} else if (local58.equals("nbsp")) {
						local35 = ' ';
					} else if (local58.equals("shy")) {
						local35 = '\u00ad';
					} else if (local58.equals("times")) {
						local35 = '×';
					} else if (local58.equals("euro")) {
						local35 = '€';
					} else if (local58.equals("copy")) {
						local35 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									@Pc(128) int local128 = Static272.method4392(local58.substring(4));
									@Pc(132) Class13 local132 = arg3[local128];
									@Pc(141) int local141 = arg5 == null ? local132.a() : arg5[local128];
									if ((-16777216 & Static405.anInt7039) == -16777216) {
										local132.I(arg4, this.aClass196_12.anInt5167 + local7 - local141, 1, 0, 1);
									} else {
										local132.I(arg4, this.aClass196_12.anInt5167 + local7 - local141, 0, Static405.anInt7039 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local19 = -1;
									arg4 += arg3[local128].AA();
								} catch (@Pc(191) Exception local191) {
								}
							} else {
								this.method7455(local58);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg4 += this.aClass196_12.method4384(local19, local35);
					}
					if (local35 == ' ') {
						if (Static447.anInt7631 > 0) {
							Static214.anInt5681 += Static447.anInt7631;
							arg4 += Static214.anInt5681 >> 8;
							Static214.anInt5681 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static80.anInt1668 & 0xFF000000) != 0) {
							this.q(local35, arg4 + 1, local7 + 1, Static80.anInt1668, true);
						}
						this.q(local35, arg4, local7, Static405.anInt7039, false);
					} else {
						if ((Static80.anInt1668 & 0xFF000000) != 0) {
							this.method7459(local35, arg4 + 1, local7 + 1, Static80.anInt1668, true, arg7, arg0, arg1);
						}
						this.method7459(local35, arg4, local7, Static405.anInt7039, false, arg7, arg0, arg1);
					}
					@Pc(303) int local303 = this.aClass196_12.method4376(local35);
					if (Static162.anInt3565 != -1) {
						this.aClass66_16.method6817(arg4, Static162.anInt3565, (int) ((double) this.aClass196_12.anInt5167 * 0.7D) + local7, local303);
					}
					if (Static57.anInt961 != -1) {
						this.aClass66_16.method6817(arg4, Static57.anInt961, local7 + this.aClass196_12.anInt5167 + 1, local303);
					}
					arg4 += local303;
					local19 = local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIIILjava/lang/String;I)V")
	public final void method7451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method7458(arg1, arg2);
			this.method7450(0, 0, arg3, null, arg0, null, arg4, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
	protected abstract void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([II[I[Lclient!xa;I[ILjava/lang/String;I)V")
	private void method7454(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class13[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) String arg6) {
		@Pc(13) int local13 = arg1 - this.aClass196_12.anInt5167;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg6.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static22.method428(arg6.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local19 = local28;
			} else {
				@Pc(116) int local116;
				@Pc(126) int local126;
				if (local39 == '>' && local19 != -1) {
					@Pc(64) String local64 = arg6.substring(local19 + 1, local28);
					local19 = -1;
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
									if (arg0 == null) {
										local116 = 0;
									} else {
										local116 = arg0[local23];
									}
									if (arg2 == null) {
										local126 = 0;
									} else {
										local126 = arg2[local23];
									}
									local23++;
									@Pc(139) int local139 = Static272.method4392(local64.substring(4));
									@Pc(143) Class13 local143 = arg3[local139];
									@Pc(152) int local152 = arg5 == null ? local143.a() : arg5[local139];
									local143.I(local116 + arg4, local126 + this.aClass196_12.anInt5167 + local13 - local152, 1, 0, 1);
									local21 = -1;
									arg4 += arg3[local139].AA();
								} catch (@Pc(180) Exception local180) {
								}
							} else {
								this.method7455(local64);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local19 == -1) {
					if (local21 != -1) {
						arg4 += this.aClass196_12.method4384(local21, local39);
					}
					@Pc(230) int local230;
					if (arg0 == null) {
						local230 = 0;
					} else {
						local230 = arg0[local23];
					}
					if (arg2 == null) {
						local116 = 0;
					} else {
						local116 = arg2[local23];
					}
					if (local39 != ' ') {
						if ((Static80.anInt1668 & 0xFF000000) != 0) {
							this.q(local39, arg4 + local230 + 1, local116 + 1 + local13, Static80.anInt1668, true);
						}
						this.q(local39, local230 + arg4, local116 + local13, Static405.anInt7039, false);
					} else if (Static447.anInt7631 > 0) {
						Static214.anInt5681 += Static447.anInt7631;
						arg4 += Static214.anInt5681 >> 8;
						Static214.anInt5681 &= 0xFF;
					}
					local23++;
					local126 = this.aClass196_12.method4376(local39);
					if (Static162.anInt3565 != -1) {
						this.aClass66_16.method6817(arg4, Static162.anInt3565, (int) ((double) this.aClass196_12.anInt5167 * 0.7D) + local13, local126);
					}
					if (Static57.anInt961 != -1) {
						this.aClass66_16.method6817(arg4, Static57.anInt961, this.aClass196_12.anInt5167 + local13, local126);
					}
					arg4 += local126;
					local21 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method7455(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static405.anInt7039 = Static405.anInt7039 & 0xFF000000 | Static406.method5862(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static405.anInt7039 = Static405.anInt7039 & 0xFF000000 | Static51.anInt907 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static405.anInt7039 = Static406.method5862(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static405.anInt7039 = Static51.anInt907;
			} else if (arg0.startsWith("str=")) {
				Static162.anInt3565 = Static405.anInt7039 & 0xFF000000 | Static406.method5862(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static162.anInt3565 = Static405.anInt7039 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static162.anInt3565 = -1;
			} else if (arg0.startsWith("u=")) {
				Static57.anInt961 = Static405.anInt7039 & 0xFF000000 | Static406.method5862(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static57.anInt961 = Static405.anInt7039 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static57.anInt961 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static80.anInt1668 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static80.anInt1668 = Static405.anInt7039 & 0xFF000000 | Static406.method5862(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static80.anInt1668 = Static405.anInt7039 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static80.anInt1668 = Static402.anInt6977;
			} else if (arg0.equals("br")) {
				this.method7458(Static51.anInt907, Static402.anInt6977);
			}
		} catch (@Pc(185) Exception local185) {
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 != null) {
			this.method7458(arg3, -1);
			this.method7450(0, 0, arg1, null, arg0 - this.aClass196_12.method4386(arg1), null, arg2, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;ILjava/lang/String;[IBIII[IIIIIILjava/util/Random;)I")
	public final int method7457(@OriginalArg(0) Class13[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Random arg13) {
		if (arg2 == null) {
			return 0;
		}
		arg13.setSeed((long) arg1);
		@Pc(21) int local21 = (arg13.nextInt() & 0x1F) + 192;
		this.method7458(arg12 & 0xFFFFFF | local21 << 24, local21 << 24 | arg4 & 0xFFFFFF);
		@Pc(49) int local49 = arg2.length();
		@Pc(52) int[] local52 = new int[local49];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local52[local56] = local54;
			if ((arg13.nextInt() & 0x3) == 0) {
				local54++;
			}
		}
		@Pc(74) int local74 = arg6;
		@Pc(80) int local80 = arg10 + this.aClass196_12.anInt5173;
		@Pc(82) int local82 = -1;
		if (arg5 == 1) {
			local80 += (arg11 - this.aClass196_12.anInt5173 - this.aClass196_12.anInt5177) / 2;
		} else if (arg5 == 2) {
			local80 = arg10 + arg11 - this.aClass196_12.anInt5177;
		}
		if (arg8 == 1) {
			local82 = this.aClass196_12.method4386(arg2) + local54;
			local74 = arg6 + (arg9 - local82) / 2;
		} else if (arg8 == 2) {
			local82 = local54 + this.aClass196_12.method4386(arg2);
			local74 = arg6 + arg9 - local82;
		}
		this.method7454(local52, local80, null, arg0, local74, arg7, arg2);
		if (arg3 != null) {
			if (local82 == -1) {
				local82 = local54 + this.aClass196_12.method4386(arg2);
			}
			arg3[3] = this.aClass196_12.anInt5173 + this.aClass196_12.anInt5177;
			arg3[1] = local80 - this.aClass196_12.anInt5173;
			arg3[2] = local82;
			arg3[0] = local74;
		}
		return local54;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	private void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static162.anInt3565 = -1;
		Static57.anInt961 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static214.anInt5681 = 0;
		Static447.anInt7631 = 0;
		Static51.anInt907 = arg0;
		Static405.anInt7039 = arg0;
		Static402.anInt6977 = arg1;
		Static80.anInt1668 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	protected abstract void method7459(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[ILjava/util/Random;IILjava/lang/String;II[Lclient!xa;)I")
	public final int method7460(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Random arg2, @OriginalArg(6) String arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class13[] arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg2.setSeed((long) arg5);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method7458(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(42) int local42 = arg3.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < local42; local49++) {
			local45[local49] = local47;
			if ((arg2.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		this.method7454(local45, arg4, null, arg6, arg0, arg1, arg3);
		return local47;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;II[III[Lclient!xa;IBIILclient!fa;II)I")
	public final int method7462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class13[] arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class98 arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg3 == null) {
			return 0;
		}
		this.method7458(arg2, arg7);
		if (arg4 == 0) {
			arg4 = this.aClass196_12.anInt5167;
		}
		@Pc(49) int[] local49;
		if (arg11 < this.aClass196_12.anInt5173 + this.aClass196_12.anInt5177 + arg4 && arg4 + arg4 > arg11) {
			local49 = null;
		} else {
			local49 = new int[] { arg1 };
		}
		if (arg8 == -1) {
			arg8 = arg11 / arg4;
			if (arg8 <= 0) {
				arg8 = 1;
			}
		}
		@Pc(81) int local81 = this.aClass196_12.method4385(local49, Static149.aStringArray10, arg9, arg3);
		if (arg8 > 0 && local81 >= arg8) {
			local81 = arg8;
			Static149.aStringArray10[arg8 - 1] = this.aClass196_12.method4375(Static149.aStringArray10[arg8 - 1], arg9, arg1);
		}
		if (arg15 == 3 && local81 == 1) {
			arg15 = 1;
		}
		@Pc(160) int local160;
		@Pc(148) int local148;
		if (arg15 == 0) {
			local160 = this.aClass196_12.anInt5173 + arg10;
		} else if (arg15 == 1) {
			local160 = arg10 + this.aClass196_12.anInt5173 + (-((local81 + -1) * arg4) + -this.aClass196_12.anInt5173 + arg11 + -this.aClass196_12.anInt5177) / 2;
		} else if (arg15 == 2) {
			local160 = arg10 + arg11 - (local81 - 1) * arg4 - this.aClass196_12.anInt5177;
		} else {
			local148 = (arg11 - this.aClass196_12.anInt5177 - this.aClass196_12.anInt5173 - (local81 - 1) * arg4) / (local81 + 1);
			if (local148 < 0) {
				local148 = 0;
			}
			local160 = this.aClass196_12.anInt5173 + arg10 + local148;
			arg4 += local148;
		}
		for (local148 = 0; local148 < local81; local148++) {
			if (arg0 == 0) {
				this.method7450(arg12, arg5, Static149.aStringArray10[local148], arg9, arg14, arg6, local160, arg13);
			} else if (arg0 == 1) {
				this.method7450(arg12, arg5, Static149.aStringArray10[local148], arg9, arg14 + (arg1 - this.aClass196_12.method4386(Static149.aStringArray10[local148])) / 2, arg6, local160, arg13);
			} else if (arg0 == 2) {
				this.method7450(arg12, arg5, Static149.aStringArray10[local148], arg9, arg14 + arg1 - this.aClass196_12.method4386(Static149.aStringArray10[local148]), arg6, local160, arg13);
			} else if (local148 == local81 - 1) {
				this.method7450(arg12, arg5, Static149.aStringArray10[local148], arg9, arg14, arg6, local160, arg13);
			} else {
				this.method7466(Static149.aStringArray10[local148], arg1);
				this.method7450(arg12, arg5, Static149.aStringArray10[local148], arg9, arg14, arg6, local160, arg13);
				Static447.anInt7631 = 0;
			}
			local160 += arg4;
		}
		return local81;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III[Lclient!xa;I[ILjava/lang/String;I)V")
	public final void method7464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13[] arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		if (arg4 != null) {
			this.method7458(arg5, 0);
			this.method7450(0, 0, arg4, arg2, arg1, arg3, arg0, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIBIIILjava/lang/String;I[I[Lclient!xa;IIIILclient!fa;)I")
	public final int method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) Class13[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class98 arg14) {
		return this.method7462(arg13, arg11, arg12, arg6, arg4, arg10, arg8, arg0, 0, arg9, arg2, arg3, arg7, arg14, arg5, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	private void method7466(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
			@Pc(21) char local21 = arg0.charAt(local15);
			if (local21 == '<') {
				local9 = true;
			} else if (local21 == '>') {
				local9 = false;
			} else if (!local9 && local21 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static447.anInt7631 = (arg1 - this.aClass196_12.method4386(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7467(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7458(arg3, arg4);
			this.method7450(0, 0, arg0, null, arg1 - this.aClass196_12.method4386(arg0) / 2, null, arg2, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IZIII)V")
	public final void method7468(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method7458(arg2, -16777216);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			local19[local28] = (int) (Math.sin((double) arg4 / 5.0D + (double) local28 / 5.0D) * 5.0D);
			local22[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method7454(local19, arg3, local22, null, arg0 - this.aClass196_12.method4386(arg1) / 2, null, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method7469(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method7458(arg4, -16777216);
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) arg3 / 5.0D + (double) local29 / 2.0D) * 5.0D);
		}
		this.method7454(null, arg2, local27, null, arg1 - this.aClass196_12.method4386(arg0) / 2, null, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IIBIII)V")
	public final void method7470(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7458(arg1, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg5 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg0.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(46) int local46 = 0; local46 < local29; local46++) {
			local32[local46] = (int) (local20 * Math.sin((double) local46 / 1.5D + (double) arg4));
		}
		this.method7454(null, arg2, local32, null, arg3 - this.aClass196_12.method4386(arg0) / 2, null, arg0);
	}
}
