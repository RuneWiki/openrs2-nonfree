import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class105 {

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!se;")
	private final Class215 aClass215_10;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!qa;")
	private final Class30 aClass30_13;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!qa;Lclient!se;)V")
	protected Class105(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class215 arg1) {
		this.aClass215_10 = arg1;
		this.aClass30_13 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method5600(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5602(arg1, arg3);
			this.method5614(arg2, null, arg0, 0, null, null, arg4, 0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!f;[IIILjava/lang/String;[II[I)V")
	private void method5601(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg5 - this.aClass215_10.anInt6383;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg3.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static257.method3522(arg3.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(116) int local116;
				@Pc(128) int local128;
				if (local33 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg3.substring(local13 + 1, local22);
					local13 = -1;
					if (local56.equals("lt")) {
						local33 = '<';
					} else if (local56.equals("gt")) {
						local33 = '>';
					} else if (local56.equals("nbsp")) {
						local33 = ' ';
					} else if (local56.equals("shy")) {
						local33 = '\u00ad';
					} else if (local56.equals("times")) {
						local33 = '×';
					} else if (local56.equals("euro")) {
						local33 = '€';
					} else if (local56.equals("copy")) {
						local33 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=")) {
								try {
									if (arg4 == null) {
										local116 = 0;
									} else {
										local116 = arg4[local17];
									}
									if (arg6 == null) {
										local128 = 0;
									} else {
										local128 = arg6[local17];
									}
									local17++;
									@Pc(139) int local139 = Static297.method4115(local56.substring(4));
									@Pc(143) Class3 local143 = arg0[local139];
									@Pc(152) int local152 = arg1 == null ? local143.JA() : arg1[local139];
									local143.YA(local116 + arg2, local128 + -local152 + this.aClass215_10.anInt6383 + local11, 1, 0, 1);
									local15 = -1;
									arg2 += arg0[local139].ja();
								} catch (@Pc(181) Exception local181) {
								}
							} else {
								this.method5611(local56);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass215_10.method4970(local33, local15);
					}
					@Pc(224) int local224;
					if (arg4 == null) {
						local224 = 0;
					} else {
						local224 = arg4[local17];
					}
					if (arg6 == null) {
						local116 = 0;
					} else {
						local116 = arg6[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static368.anInt6523 & 0xFF000000) != 0) {
							this.B(local33, arg2 + local224 + 1, local11 - -local116 + 1, Static368.anInt6523, true);
						}
						this.B(local33, arg2 + local224, local11 + local116, Static81.anInt1881, false);
					} else if (Static349.anInt6301 > 0) {
						Static239.anInt4368 += Static349.anInt6301;
						arg2 += Static239.anInt4368 >> 8;
						Static239.anInt4368 &= 0xFF;
					}
					local128 = this.aClass215_10.method4971(local33);
					if (Static22.anInt6847 != -1) {
						this.aClass30_13.method4658(arg2, Static22.anInt6847, (int) ((double) this.aClass215_10.anInt6383 * 0.7D) + local11, local128);
					}
					if (Static336.anInt5909 != -1) {
						this.aClass30_13.method4658(arg2, Static336.anInt5909, this.aClass215_10.anInt6383 + local11, local128);
					}
					arg2 += local128;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII)V")
	private void method5602(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static336.anInt5909 = -1;
		Static349.anInt6301 = 0;
		Static239.anInt4368 = 0;
		Static22.anInt6847 = -1;
		Static304.anInt5458 = arg0;
		Static81.anInt1881 = arg0;
		Static451.anInt7534 = arg1;
		Static368.anInt6523 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method5603(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method5602(arg1, -16777216);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method5601(null, null, arg2 - this.aClass215_10.method4976(arg3) / 2, arg3, null, arg4, local19);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method5604(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5602(arg2, arg0);
			this.method5614(arg3 - this.aClass215_10.method4976(arg1) / 2, null, arg1, 0, null, null, arg4, 0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/lang/String;IBI)V")
	public final void method5605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		if (arg2 != null) {
			this.method5602(arg3, -1);
			this.method5614(arg1 - this.aClass215_10.method4976(arg2), null, arg2, 0, null, null, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;II[I[Lclient!f;II)V")
	public final void method5606(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class3[] arg4, @OriginalArg(6) int arg5) {
		if (arg1 != null) {
			this.method5602(arg5, 0);
			this.method5614(arg2, arg3, arg1, 0, null, arg4, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5607(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(15) int local15 = 0; arg0.length() > local15; local15++) {
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
			Static349.anInt6301 = (arg1 - this.aClass215_10.method4976(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	protected abstract void method5608(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class57 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[Lclient!f;IBLclient!ea;IIIIIIIILjava/lang/String;I)I")
	public final int method5609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class3[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) String arg14, @OriginalArg(16) int arg15) {
		if (arg14 == null) {
			return 0;
		}
		this.method5602(arg0, arg9);
		if (arg7 == 0) {
			arg7 = this.aClass215_10.anInt6383;
		}
		@Pc(50) int[] local50;
		if (arg7 + this.aClass215_10.anInt6387 + this.aClass215_10.anInt6376 > arg6 && arg6 < arg7 + arg7) {
			local50 = null;
		} else {
			local50 = new int[] { arg4 };
		}
		@Pc(68) int local68 = this.aClass215_10.method4966(local50, Static50.aStringArray6, arg14, arg3);
		if (arg8 == -1) {
			arg8 = arg6 / arg7;
			if (arg8 <= 0) {
				arg8 = 1;
			}
		}
		if (arg8 > 0 && arg8 <= local68) {
			Static50.aStringArray6[arg8 - 1] = this.aClass215_10.method4972(arg3, arg4, Static50.aStringArray6[arg8 - 1]);
			local68 = arg8;
		}
		if (arg11 == 3 && local68 == 1) {
			arg11 = 1;
		}
		@Pc(128) int local128;
		@Pc(187) int local187;
		if (arg11 == 0) {
			local128 = this.aClass215_10.anInt6387 + arg13;
		} else if (arg11 == 1) {
			local128 = (arg6 - this.aClass215_10.anInt6387 - this.aClass215_10.anInt6376 - arg7 * (local68 + -1)) / 2 + this.aClass215_10.anInt6387 + arg13;
		} else if (arg11 == 2) {
			local128 = arg6 + arg13 - (local68 - 1) * arg7 - this.aClass215_10.anInt6376;
		} else {
			local187 = (arg6 - this.aClass215_10.anInt6376 - this.aClass215_10.anInt6387 - (local68 + -1) * arg7) / (local68 - -1);
			if (local187 < 0) {
				local187 = 0;
			}
			arg7 += local187;
			local128 = arg13 + this.aClass215_10.anInt6387 + local187;
		}
		for (local187 = 0; local187 < local68; local187++) {
			if (arg12 == 0) {
				this.method5614(arg10, arg2, Static50.aStringArray6[local187], arg1, arg5, arg3, local128, arg15);
			} else if (arg12 == 1) {
				this.method5614((arg4 - this.aClass215_10.method4976(Static50.aStringArray6[local187])) / 2 + arg10, arg2, Static50.aStringArray6[local187], arg1, arg5, arg3, local128, arg15);
			} else if (arg12 == 2) {
				this.method5614(arg4 + arg10 - this.aClass215_10.method4976(Static50.aStringArray6[local187]), arg2, Static50.aStringArray6[local187], arg1, arg5, arg3, local128, arg15);
			} else if (local187 == local68 - 1) {
				this.method5614(arg10, arg2, Static50.aStringArray6[local187], arg1, arg5, arg3, local128, arg15);
			} else {
				this.method5607(Static50.aStringArray6[local187], arg4);
				this.method5614(arg10, arg2, Static50.aStringArray6[local187], arg1, arg5, arg3, local128, arg15);
				Static349.anInt6301 = 0;
			}
			local128 += arg7;
		}
		return local68;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII[IILclient!ea;I[Lclient!f;IILjava/lang/String;II)I")
	public final int method5610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(8) Class57 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class3[] arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) String arg11, @OriginalArg(14) int arg12) {
		return this.method5609(arg1, arg2, arg5, arg8, arg12, arg6, arg0, 0, 0, arg7, arg10, arg4, 1, arg9, arg11, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5611(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static81.anInt1881 = Static81.anInt1881 & 0xFF000000 | Static345.method4814(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static81.anInt1881 = Static304.anInt5458 & 0xFFFFFF | Static81.anInt1881 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static81.anInt1881 = Static345.method4814(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static81.anInt1881 = Static304.anInt5458;
			} else if (arg0.startsWith("str=")) {
				Static22.anInt6847 = Static345.method4814(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static22.anInt6847 = -8388608;
			} else if (arg0.equals("/str")) {
				Static22.anInt6847 = -1;
			} else if (arg0.startsWith("u=")) {
				Static336.anInt5909 = Static345.method4814(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static336.anInt5909 = -16777216;
			} else if (arg0.equals("/u")) {
				Static336.anInt5909 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static368.anInt6523 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static368.anInt6523 = Static345.method4814(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static368.anInt6523 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static368.anInt6523 = Static451.anInt7534;
			} else if (arg0.equals("br")) {
				this.method5602(Static304.anInt5458, Static451.anInt7534);
				return;
			}
		} catch (@Pc(168) Exception local168) {
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;II[IIIII[Lclient!f;II[ILjava/util/Random;I)I")
	public final int method5613(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class3[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) Random arg12, @OriginalArg(14) int arg13) {
		if (arg1 == null) {
			return 0;
		}
		arg12.setSeed((long) arg0);
		@Pc(20) int local20 = (arg12.nextInt() & 0x1F) + 192;
		this.method5602(local20 << 24 | arg5 & 0xFFFFFF, local20 << 24 | arg6 & 0xFFFFFF);
		@Pc(40) int local40 = arg1.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg12.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(72) int local72 = arg10;
		@Pc(78) int local78 = this.aClass215_10.anInt6387 + arg13;
		if (arg2 == 1) {
			local78 += (arg3 - this.aClass215_10.anInt6387 - this.aClass215_10.anInt6376) / 2;
		} else if (arg2 == 2) {
			local78 = arg13 + arg3 - this.aClass215_10.anInt6376;
		}
		@Pc(114) int local114 = -1;
		if (arg9 == 1) {
			local114 = this.aClass215_10.method4976(arg1) + local45;
			local72 = arg10 + (arg7 - local114) / 2;
		} else if (arg9 == 2) {
			local114 = local45 + this.aClass215_10.method4976(arg1);
			local72 = arg10 + arg7 - local114;
		}
		this.method5601(arg8, arg11, local72, arg1, local43, local78, null);
		if (arg4 != null) {
			if (local114 == -1) {
				local114 = local45 + this.aClass215_10.method4976(arg1);
			}
			arg4[3] = this.aClass215_10.anInt6387 + this.aClass215_10.anInt6376;
			arg4[2] = local114;
			arg4[1] = local78 - this.aClass215_10.anInt6387;
			arg4[0] = local72;
		}
		return local45;
	}

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[ILjava/lang/String;ILclient!ea;B[Lclient!f;II)V")
	private void method5614(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class57 arg4, @OriginalArg(6) Class3[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg6 - this.aClass215_10.anInt6383;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(29) int local29 = arg2.length();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(42) char local42 = (char) (Static257.method3522(arg2.charAt(local31)) & 0xFF);
			if (local42 == '<') {
				local24 = local31;
			} else {
				if (local42 == '>' && local24 != -1) {
					@Pc(66) String local66 = arg2.substring(local24 + 1, local31);
					local24 = -1;
					if (local66.equals("lt")) {
						local42 = '<';
					} else if (local66.equals("gt")) {
						local42 = '>';
					} else if (local66.equals("nbsp")) {
						local42 = ' ';
					} else if (local66.equals("shy")) {
						local42 = '\u00ad';
					} else if (local66.equals("times")) {
						local42 = '×';
					} else if (local66.equals("euro")) {
						local42 = '€';
					} else if (local66.equals("copy")) {
						local42 = '©';
					} else {
						if (!local66.equals("reg")) {
							if (local66.startsWith("img=")) {
								try {
									@Pc(140) int local140 = Static297.method4115(local66.substring(4));
									@Pc(144) Class3 local144 = arg5[local140];
									@Pc(153) int local153 = arg1 == null ? local144.JA() : arg1[local140];
									if ((Static81.anInt1881 & 0xFF000000) == -16777216) {
										local144.YA(arg0, this.aClass215_10.anInt6383 + local7 - local153, 1, 0, 1);
									} else {
										local144.YA(arg0, local7 + this.aClass215_10.anInt6383 - local153, 0, Static81.anInt1881 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local26 = -1;
									arg0 += arg5[local140].ja();
								} catch (@Pc(205) Exception local205) {
								}
							} else {
								this.method5611(local66);
							}
							continue;
						}
						local42 = '®';
					}
				}
				if (local24 == -1) {
					if (local26 != -1) {
						arg0 += this.aClass215_10.method4970(local42, local26);
					}
					if (local42 == ' ') {
						if (Static349.anInt6301 > 0) {
							Static239.anInt4368 += Static349.anInt6301;
							arg0 += Static239.anInt4368 >> 8;
							Static239.anInt4368 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static368.anInt6523 & 0xFF000000) != 0) {
							this.B(local42, arg0 + 1, local7 + 1, Static368.anInt6523, true);
						}
						this.B(local42, arg0, local7, Static81.anInt1881, false);
					} else {
						if ((Static368.anInt6523 & 0xFF000000) != 0) {
							this.method5608(local42, arg0 + 1, local7 + 1, Static368.anInt6523, true, arg4, arg7, arg3);
						}
						this.method5608(local42, arg0, local7, Static81.anInt1881, false, arg4, arg7, arg3);
					}
					@Pc(322) int local322 = this.aClass215_10.method4971(local42);
					if (Static22.anInt6847 != -1) {
						this.aClass30_13.method4658(arg0, Static22.anInt6847, (int) ((double) this.aClass215_10.anInt6383 * 0.7D) + local7, local322);
					}
					if (Static336.anInt5909 != -1) {
						this.aClass30_13.method4658(arg0, Static336.anInt5909, local7 + this.aClass215_10.anInt6383 + 1, local322);
					}
					arg0 += local322;
					local26 = local42;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;BIIII)V")
	public final void method5615(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5602(arg2, -16777216);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			local19[local28] = (int) (Math.sin((double) arg0 / 5.0D + (double) local28 / 5.0D) * 5.0D);
			local22[local28] = (int) (Math.sin((double) arg0 / 5.0D + (double) local28 / 3.0D) * 5.0D);
		}
		this.method5601(null, null, arg3 - this.aClass215_10.method4976(arg1) / 2, arg1, local19, arg4, local22);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;I[III[Lclient!f;ILjava/util/Random;II)I")
	public final int method5616(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) Class3[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Random arg5, @OriginalArg(8) int arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(21) int local21 = (arg5.nextInt() & 0x1F) + 192;
		this.method5602(local21 << 24 | 0xFFFFFF, (local21 | 0x0) << 24);
		@Pc(41) int local41 = arg0.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg5.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		this.method5601(arg3, arg2, arg4, arg0, local44, arg1, null);
		return local46;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;IIZI)V")
	public final void method5618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method5602(arg0, -16777216);
		@Pc(21) double local21 = 7.0D - (double) arg2 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg3.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (Math.sin((double) arg4 + (double) local35 / 1.5D) * local21);
		}
		this.method5601(null, null, arg1 - this.aClass215_10.method4976(arg3) / 2, arg3, null, arg5, local33);
	}
}
