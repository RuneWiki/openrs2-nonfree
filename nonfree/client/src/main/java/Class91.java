import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public abstract class Class91 {

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!nm;")
	private final Class138 aClass138_9;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Lclient!en;")
	private final Class59 aClass59_9;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!en;Lclient!nm;)V")
	protected Class91(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class138 arg1) {
		this.aClass138_9 = arg1;
		this.aClass59_9 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILclient!hm;Ljava/lang/String;III[IIIII[Lclient!kh;I)I")
	public final int method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class54[] arg13, @OriginalArg(15) int arg14) {
		if (arg5 == null) {
			return 0;
		}
		this.method5307(arg14, arg6);
		if (arg7 == 0) {
			arg7 = this.aClass138_9.anInt4172;
		}
		@Pc(55) int[] local55;
		if (arg1 < arg7 + this.aClass138_9.anInt4175 + this.aClass138_9.anInt4180 && arg1 < arg7 + arg7) {
			local55 = null;
		} else {
			local55 = new int[] { arg11 };
		}
		@Pc(67) int local67 = this.aClass138_9.method3729(local55, arg5, Static244.aStringArray34, arg13);
		if (arg3 == 3 && local67 == 1) {
			arg3 = 1;
		}
		@Pc(88) int local88;
		@Pc(119) int local119;
		if (arg3 == 0) {
			local88 = this.aClass138_9.anInt4180 + arg2;
		} else if (arg3 == 1) {
			local88 = arg2 + this.aClass138_9.anInt4180 + (-this.aClass138_9.anInt4175 + -this.aClass138_9.anInt4180 + (arg1 - (local67 + -1) * arg7)) / 2;
		} else if (arg3 == 2) {
			local88 = arg1 + arg2 - (local67 - 1) * arg7 - this.aClass138_9.anInt4175;
		} else {
			local119 = (arg1 - arg7 * (local67 - 1) - this.aClass138_9.anInt4180 - this.aClass138_9.anInt4175) / (local67 + 1);
			if (local119 < 0) {
				local119 = 0;
			}
			arg7 += local119;
			local88 = local119 + this.aClass138_9.anInt4180 + arg2;
		}
		for (local119 = 0; local119 < local67; local119++) {
			if (arg10 == 0) {
				this.method5297(arg4, arg13, arg8, arg0, arg12, Static244.aStringArray34[local119], arg9, local88);
			} else if (arg10 == 1) {
				this.method5297(arg4, arg13, arg8, arg0, arg12, Static244.aStringArray34[local119], arg9 + (arg11 - this.aClass138_9.method3725(Static244.aStringArray34[local119])) / 2, local88);
			} else if (arg10 == 2) {
				this.method5297(arg4, arg13, arg8, arg0, arg12, Static244.aStringArray34[local119], arg11 + arg9 - this.aClass138_9.method3725(Static244.aStringArray34[local119]), local88);
			} else if (local67 - 1 == local119) {
				this.method5297(arg4, arg13, arg8, arg0, arg12, Static244.aStringArray34[local119], arg9, local88);
			} else {
				this.method5315(Static244.aStringArray34[local119], arg11);
				this.method5297(arg4, arg13, arg8, arg0, arg12, Static244.aStringArray34[local119], arg9, local88);
				Static220.anInt4364 = 0;
			}
			local88 += arg7;
		}
		return local67;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!hm;[Lclient!kh;[IBIILjava/lang/String;II)V")
	private void method5297(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class54[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(5) int local5 = arg7 - this.aClass138_9.anInt4172;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(22) int local22 = arg5.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(34) char local34 = (char) (Static17.method5328(arg5.charAt(local24)) & 0xFF);
			if (local34 == '<') {
				local17 = local24;
			} else {
				if (local34 == '>' && local17 != -1) {
					@Pc(55) String local55 = arg5.substring(local17 + 1, local24);
					local17 = -1;
					if (local55.equals("lt")) {
						local34 = '<';
					} else if (local55.equals("gt")) {
						local34 = '>';
					} else if (local55.equals("nbsp")) {
						local34 = ' ';
					} else if (local55.equals("shy")) {
						local34 = '\u00ad';
					} else if (local55.equals("times")) {
						local34 = '×';
					} else if (local55.equals("euro")) {
						local34 = '€';
					} else if (local55.equals("copy")) {
						local34 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=")) {
								try {
									@Pc(116) int local116 = Static269.method4544(local55.substring(4));
									@Pc(120) Class54 local120 = arg1[local116];
									@Pc(129) int local129 = arg2 == null ? local120.method5576() : arg2[local116];
									if ((Static64.anInt1548 & 0xFF000000) == -16777216) {
										local120.method5575(arg6, this.aClass138_9.anInt4172 + local5 - local129, 0, 0);
									} else {
										local120.method5575(arg6, this.aClass138_9.anInt4172 + local5 - local129, 1, Static64.anInt1548 & 0xFF000000 | 0xFFFFFF);
									}
									arg6 += arg1[local116].method5560();
									local19 = -1;
								} catch (@Pc(180) Exception local180) {
								}
							} else {
								this.method5310(local55);
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg6 += this.aClass138_9.method3723(local19, local34);
					}
					if (local34 == ' ') {
						if (Static220.anInt4364 > 0) {
							Static272.anInt5241 += Static220.anInt4364;
							arg6 += Static272.anInt5241 >> 8;
							Static272.anInt5241 &= 0xFF;
						}
					} else if (arg0 == null) {
						if ((Static303.anInt5837 & 0xFF000000) != 0) {
							this.method5309(local34, arg6 + 1, local5 + 1, Static303.anInt5837, true);
						}
						this.method5309(local34, arg6, local5, Static64.anInt1548, false);
					} else {
						if ((Static303.anInt5837 & 0xFF000000) != 0) {
							this.method5316(local34, arg6 + 1, local5 + 1, Static303.anInt5837, true, arg0, arg3, arg4);
						}
						this.method5316(local34, arg6, local5, Static64.anInt1548, false, arg0, arg3, arg4);
					}
					@Pc(294) int local294 = this.aClass138_9.method3721(local34);
					if (Static40.anInt988 != -1) {
						this.aClass59_9.method4797(Static40.anInt988, local5 + (int) ((double) this.aClass138_9.anInt4172 * 0.7D), local294, arg6);
					}
					if (Static343.anInt6410 != -1) {
						this.aClass59_9.method4797(Static343.anInt6410, this.aClass138_9.anInt4172 + local5 + 1, local294, arg6);
					}
					local19 = local34;
					arg6 += local294;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method5298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method5307(-16777216, arg2);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method5312(arg3, arg0 - this.aClass138_9.method3725(arg3) / 2, arg1, null, null, local19, null);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[IIIIIIILjava/lang/String;[Lclient!kh;II[IILjava/util/Random;)I")
	public final int method5299(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) Class54[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Random arg13) {
		if (arg7 == null) {
			return 0;
		}
		arg13.setSeed((long) arg9);
		@Pc(21) int local21 = (arg13.nextInt() & 0x1F) + 192;
		this.method5307(local21 << 24 | arg1 & 0xFFFFFF, arg12 & 0xFFFFFF | local21 << 24);
		@Pc(43) int local43 = arg7.length();
		@Pc(46) int[] local46 = new int[local43];
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < local43; local50++) {
			local46[local50] = local48;
			if ((arg13.nextInt() & 0x3) == 0) {
				local48++;
			}
		}
		@Pc(68) int local68 = arg10;
		@Pc(75) int local75 = arg6 + this.aClass138_9.anInt4180;
		if (arg5 == 1) {
			local75 += (arg2 - this.aClass138_9.anInt4175 - this.aClass138_9.anInt4180) / 2;
		} else if (arg5 == 2) {
			local75 = arg6 + arg2 - this.aClass138_9.anInt4175;
		}
		@Pc(112) int local112 = -1;
		if (arg3 == 1) {
			local112 = this.aClass138_9.method3725(arg7) + local48;
			local68 = arg10 + (arg4 - local112) / 2;
		} else if (arg3 == 2) {
			local112 = local48 + this.aClass138_9.method3725(arg7);
			local68 = arg10 + arg4 - local112;
		}
		this.method5312(arg7, local68, local75, local46, arg0, null, arg8);
		if (arg11 != null) {
			if (local112 == -1) {
				local112 = local48 + this.aClass138_9.method3725(arg7);
			}
			arg11[1] = local75 - this.aClass138_9.anInt4180;
			arg11[3] = this.aClass138_9.anInt4175 + this.aClass138_9.anInt4180;
			arg11[2] = local112;
			arg11[0] = local68;
		}
		return local48;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILjava/lang/String;ZII)V")
	public final void method5300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method5307(arg0, arg3);
			this.method5297(null, null, null, 0, 0, arg2, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public final void method5301(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method5307(-16777216, arg3);
		@Pc(20) double local20 = 7.0D - (double) arg0 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg1.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (local20 * Math.sin((double) arg5 + (double) local34 / 1.5D));
		}
		this.method5312(arg1, arg4 - this.aClass138_9.method3725(arg1) / 2, arg2, null, null, local32, null);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/util/Random;[Lclient!kh;Ljava/lang/String;III[III)I")
	public final int method5302(@OriginalArg(1) Random arg0, @OriginalArg(2) Class54[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int[] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg0.setSeed((long) arg5);
		@Pc(21) int local21 = (arg0.nextInt() & 0x1F) + 192;
		this.method5307((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg2.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < local41; local56++) {
			local44[local56] = local54;
			if ((arg0.nextInt() & 0x3) == 0) {
				local54++;
			}
		}
		this.method5312(arg2, arg6, arg3, local44, arg4, null, arg1);
		return local54;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;II[IIII[Lclient!kh;)V")
	public final void method5303(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class54[] arg6) {
		if (arg0 != null) {
			this.method5307(arg1, arg2);
			this.method5297(null, arg6, arg3, 0, 0, arg0, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBIIILjava/lang/String;)V")
	public final void method5306(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method5307(-1, arg1);
			this.method5297(null, null, null, 0, 0, arg3, arg0 - this.aClass138_9.method3725(arg3), arg2);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
	private void method5307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static220.anInt4364 = 0;
		Static310.anInt5948 = arg1;
		Static64.anInt1548 = arg1;
		Static272.anInt5241 = 0;
		Static40.anInt988 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static343.anInt6410 = -1;
		Static274.anInt5376 = arg0;
		Static303.anInt5837 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method5308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method5307(arg1, arg3);
			this.method5297(null, null, null, 0, 0, arg2, arg4 - this.aClass138_9.method3725(arg2) / 2, arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5309(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5310(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static64.anInt1548 = Static64.anInt1548 & 0xFF000000 | Static297.method5043(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static64.anInt1548 = Static64.anInt1548 & 0xFF000000 | Static310.anInt5948 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static64.anInt1548 = Static297.method5043(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static64.anInt1548 = Static310.anInt5948;
			} else if (arg0.startsWith("str=")) {
				Static40.anInt988 = Static297.method5043(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static40.anInt988 = -8388608;
			} else if (arg0.equals("/str")) {
				Static40.anInt988 = -1;
			} else if (arg0.startsWith("u=")) {
				Static343.anInt6410 = Static297.method5043(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static343.anInt6410 = -16777216;
			} else if (arg0.equals("/u")) {
				Static343.anInt6410 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static303.anInt5837 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static303.anInt5837 = Static297.method5043(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static303.anInt5837 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static303.anInt5837 = Static274.anInt5376;
			} else if (arg0.equals("br")) {
				this.method5307(Static274.anInt5376, Static310.anInt5948);
			}
		} catch (@Pc(157) Exception local157) {
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([IILjava/lang/String;[Lclient!kh;IIII)V")
	public final void method5311(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class54[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 != null) {
			this.method5307(arg1, arg4);
			this.method5297(null, arg3, arg0, 0, 0, arg2, arg6 - this.aClass138_9.method3725(arg2) / 2, arg5);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;III[I[I[I[Lclient!kh;)V")
	private void method5312(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class54[] arg6) {
		@Pc(11) int local11 = arg2 - this.aClass138_9.anInt4172;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static17.method5328(arg0.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local13 = local28;
			} else {
				@Pc(129) int local129;
				@Pc(137) int local137;
				if (local39 == '>' && local13 != -1) {
					@Pc(63) String local63 = arg0.substring(local13 + 1, local28);
					local13 = -1;
					if (local63.equals("lt")) {
						local39 = '<';
					} else if (local63.equals("gt")) {
						local39 = '>';
					} else if (local63.equals("nbsp")) {
						local39 = ' ';
					} else if (local63.equals("shy")) {
						local39 = '\u00ad';
					} else if (local63.equals("times")) {
						local39 = '×';
					} else if (local63.equals("euro")) {
						local39 = '€';
					} else if (local63.equals("copy")) {
						local39 = '©';
					} else {
						if (!local63.equals("reg")) {
							if (local63.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local129 = 0;
									} else {
										local129 = arg3[local23];
									}
									if (arg5 == null) {
										local137 = 0;
									} else {
										local137 = arg5[local23];
									}
									local23++;
									@Pc(150) int local150 = Static269.method4544(local63.substring(4));
									@Pc(154) Class54 local154 = arg6[local150];
									@Pc(163) int local163 = arg4 == null ? local154.method5576() : arg4[local150];
									local154.method5575(local129 + arg1, local11 + this.aClass138_9.anInt4172 - (local163 + -local137), 0, 0);
									arg1 += arg6[local150].method5560();
									local15 = -1;
								} catch (@Pc(192) Exception local192) {
								}
							} else {
								this.method5310(local63);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass138_9.method3723(local15, local39);
					}
					@Pc(229) int local229;
					if (arg3 == null) {
						local229 = 0;
					} else {
						local229 = arg3[local23];
					}
					if (arg5 == null) {
						local129 = 0;
					} else {
						local129 = arg5[local23];
					}
					if (local39 != ' ') {
						if ((Static303.anInt5837 & 0xFF000000) != 0) {
							this.method5309(local39, arg1 + local229 + 1, local11 + 1 - -local129, Static303.anInt5837, true);
						}
						this.method5309(local39, arg1 + local229, local11 - -local129, Static64.anInt1548, false);
					} else if (Static220.anInt4364 > 0) {
						Static272.anInt5241 += Static220.anInt4364;
						arg1 += Static272.anInt5241 >> 8;
						Static272.anInt5241 &= 0xFF;
					}
					local23++;
					local137 = this.aClass138_9.method3721(local39);
					if (Static40.anInt988 != -1) {
						this.aClass59_9.method4797(Static40.anInt988, local11 + (int) ((double) this.aClass138_9.anInt4172 * 0.7D), local137, arg1);
					}
					if (Static343.anInt6410 != -1) {
						this.aClass59_9.method4797(Static343.anInt6410, local11 + this.aClass138_9.anInt4172, local137, arg1);
					}
					arg1 += local137;
					local15 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZLjava/lang/String;IIII)V")
	public final void method5313(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5307(-16777216, arg3);
		@Pc(21) int local21 = arg1.length();
		@Pc(24) int[] local24 = new int[local21];
		@Pc(27) int[] local27 = new int[local21];
		for (@Pc(29) int local29 = 0; local29 < local21; local29++) {
			local24[local29] = (int) (Math.sin((double) arg0 / 5.0D + (double) local29 / 5.0D) * 5.0D);
			local27[local29] = (int) (Math.sin((double) local29 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method5312(arg1, arg4 - this.aClass138_9.method3725(arg1) / 2, arg2, local24, null, local27, null);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([Lclient!kh;ILjava/lang/String;IIII[I)V")
	public final void method5314(@OriginalArg(0) Class54[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		if (arg2 != null) {
			this.method5307(arg4, arg1);
			this.method5297(null, arg0, arg6, 0, 0, arg2, arg5 - this.aClass138_9.method3725(arg2), arg3);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method5315(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
			@Pc(14) char local14 = arg0.charAt(local9);
			if (local14 == '<') {
				local7 = true;
			} else if (local14 == '>') {
				local7 = false;
			} else if (!local7 && local14 == ' ') {
				local5++;
			}
		}
		if (local5 > 0) {
			Static220.anInt4364 = (arg1 - this.aClass138_9.method3725(arg0) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(CIIIZLclient!hm;II)V")
	protected abstract void method5316(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
