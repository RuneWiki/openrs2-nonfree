import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public abstract class Class51 {

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!vq;")
	private final Class47 aClass47_7;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Lclient!bb;")
	private final Class16 aClass16_6;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!vq;Lclient!bb;)V")
	protected Class51(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class16 arg1) {
		this.aClass47_7 = arg0;
		this.aClass16_6 = arg1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI[ILjava/lang/String;IIILclient!sg;[Lclient!vj;)V")
	private void method4231(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class118 arg6, @OriginalArg(8) Class58[] arg7) {
		@Pc(11) int local11 = arg4 - this.aClass16_6.anInt376;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg2.length();
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(38) char local38 = (char) (Static93.method2208(arg2.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local13 = local27;
			} else {
				if (local38 == '>' && local13 != -1) {
					@Pc(62) String local62 = arg2.substring(local13 + 1, local27);
					local13 = -1;
					if (local62.equals("lt")) {
						local38 = '<';
					} else if (local62.equals("gt")) {
						local38 = '>';
					} else if (local62.equals("nbsp")) {
						local38 = ' ';
					} else if (local62.equals("shy")) {
						local38 = '\u00ad';
					} else if (local62.equals("times")) {
						local38 = '×';
					} else if (local62.equals("euro")) {
						local38 = '€';
					} else if (local62.equals("copy")) {
						local38 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									@Pc(122) int local122 = Static246.method4383(local62.substring(4));
									@Pc(126) Class58 local126 = arg7[local122];
									@Pc(135) int local135 = arg1 == null ? local126.method4286() : arg1[local122];
									if ((-16777216 & Static255.anInt5167) == -16777216) {
										local126.method4276(arg0, local11 + this.aClass16_6.anInt376 - local135, 0, 0);
									} else {
										local126.method4276(arg0, this.aClass16_6.anInt376 + local11 - local135, 1, Static255.anInt5167 & 0xFF000000 | 0xFFFFFF);
									}
									arg0 += arg7[local122].method4282();
									local15 = -1;
								} catch (@Pc(185) Exception local185) {
								}
							} else {
								this.method4240(local62);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass16_6.method319(local38, local15);
					}
					if (local38 == ' ') {
						if (Static206.anInt4319 > 0) {
							Static225.anInt4572 += Static206.anInt4319;
							arg0 += Static225.anInt4572 >> 8;
							Static225.anInt4572 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static212.anInt2903 & 0xFF000000) != 0) {
							this.method4236(local38, arg0 + 1, local11 + 1, Static212.anInt2903, true);
						}
						this.method4236(local38, arg0, local11, Static255.anInt5167, false);
					} else {
						if ((Static212.anInt2903 & 0xFF000000) != 0) {
							this.method4246(local38, arg0 + 1, local11 + 1, Static212.anInt2903, true, arg6, arg5, arg3);
						}
						this.method4246(local38, arg0, local11, Static255.anInt5167, false, arg6, arg5, arg3);
					}
					@Pc(308) int local308 = this.aClass16_6.method322(local38);
					if (Static119.anInt2860 != -1) {
						this.aClass47_7.method2747(arg0, Static119.anInt2860, local308, local11 + (int) ((double) this.aClass16_6.anInt376 * 0.7D));
					}
					if (Static127.anInt3019 != -1) {
						this.aClass47_7.method2747(arg0, Static127.anInt3019, local308, this.aClass16_6.anInt376 + local11 + 1);
					}
					local15 = local38;
					arg0 += local308;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method4232(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(14) boolean local14 = false;
		for (@Pc(16) int local16 = 0; arg1.length() > local16; local16++) {
			@Pc(22) char local22 = arg1.charAt(local16);
			if (local22 == '<') {
				local14 = true;
			} else if (local22 == '>') {
				local14 = false;
			} else if (!local14 && local22 == ' ') {
				local12++;
			}
		}
		if (local12 > 0) {
			Static206.anInt4319 = (arg0 - this.aClass16_6.method327(arg1) << 8) / local12;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method4233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method4243(arg3, arg0);
			this.method4231(arg4 - this.aClass16_6.method327(arg2) / 2, null, arg2, 0, arg1, 0, null, null);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII[III[Lclient!vj;I[IIILjava/util/Random;ILjava/lang/String;)I")
	public final int method4234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class58[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Random arg11, @OriginalArg(13) int arg12, @OriginalArg(14) String arg13) {
		if (arg13 == null) {
			return 0;
		}
		arg11.setSeed((long) arg0);
		@Pc(20) int local20 = (arg11.nextInt() & 0x1F) + 192;
		this.method4243(local20 << 24 | arg10 & 0xFFFFFF, arg9 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg13.length();
		@Pc(51) int[] local51 = new int[local40];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local40; local55++) {
			local51[local55] = local53;
			if ((arg11.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		@Pc(80) int local80 = arg7;
		@Pc(86) int local86 = this.aClass16_6.anInt382 + arg2;
		@Pc(88) int local88 = -1;
		if (arg1 == 1) {
			local86 += (arg12 - this.aClass16_6.anInt383 - this.aClass16_6.anInt382) / 2;
		} else if (arg1 == 2) {
			local86 = arg2 + arg12 - this.aClass16_6.anInt383;
		}
		if (arg5 == 1) {
			local88 = this.aClass16_6.method327(arg13) + local53;
			local80 = arg7 + (arg4 - local88) / 2;
		} else if (arg5 == 2) {
			local88 = this.aClass16_6.method327(arg13) + local53;
			local80 = arg7 + arg4 - local88;
		}
		this.method4241(local51, arg6, arg3, local80, null, arg13, local86);
		if (arg8 != null) {
			if (local88 == -1) {
				local88 = local53 + this.aClass16_6.method327(arg13);
			}
			arg8[1] = local86 - this.aClass16_6.anInt382;
			arg8[2] = local88;
			arg8[3] = this.aClass16_6.anInt383 + this.aClass16_6.anInt382;
			arg8[0] = local80;
		}
		return local53;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[I[Lclient!vj;IILjava/lang/String;I)V")
	public final void method4235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class58[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 != null) {
			this.method4243(0, arg4);
			this.method4231(arg1, arg2, arg5, 0, arg0, 0, null, arg3);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method4236(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIBLjava/lang/String;I)V")
	public final void method4237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method4243(arg1, arg0);
			this.method4231(arg2, null, arg3, 0, arg4, 0, null, null);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public final void method4239(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method4243(-16777216, arg4);
		@Pc(20) double local20 = 7.0D - (double) arg1 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg0.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(38) int local38 = 0; local38 < local29; local38++) {
			local32[local38] = (int) (local20 * Math.sin((double) arg3 + (double) local38 / 1.5D));
		}
		this.method4241(null, null, null, arg5 - this.aClass16_6.method327(arg0) / 2, local32, arg0, arg2);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method4240(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static255.anInt5167 = Static255.anInt5167 & 0xFF000000 | Static167.method3261(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static255.anInt5167 = Static255.anInt5167 & 0xFF000000 | Static270.anInt5396 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static255.anInt5167 = Static167.method3261(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static255.anInt5167 = Static270.anInt5396;
			} else if (arg0.startsWith("str=")) {
				Static119.anInt2860 = Static167.method3261(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static119.anInt2860 = -8388608;
			} else if (arg0.equals("/str")) {
				Static119.anInt2860 = -1;
			} else if (arg0.startsWith("u=")) {
				Static127.anInt3019 = Static167.method3261(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static127.anInt3019 = -16777216;
			} else if (arg0.equals("/u")) {
				Static127.anInt3019 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static212.anInt2903 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static212.anInt2903 = Static167.method3261(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static212.anInt2903 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static212.anInt2903 = Static215.anInt4411;
			} else if (arg0.equals("br")) {
				this.method4243(Static215.anInt4411, Static270.anInt5396);
			}
		} catch (@Pc(169) Exception local169) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([I[Lclient!vj;[IZI[ILjava/lang/String;I)V")
	private void method4241(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class58[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg6 - this.aClass16_6.anInt376;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg5.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) char local38 = (char) (Static93.method2208(arg5.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local18 = local27;
			} else {
				@Pc(136) int local136;
				@Pc(144) int local144;
				if (local38 == '>' && local18 != -1) {
					@Pc(62) String local62 = arg5.substring(local18 + 1, local27);
					local18 = -1;
					if (local62.equals("lt")) {
						local38 = '<';
					} else if (local62.equals("gt")) {
						local38 = '>';
					} else if (local62.equals("nbsp")) {
						local38 = ' ';
					} else if (local62.equals("shy")) {
						local38 = '\u00ad';
					} else if (local62.equals("times")) {
						local38 = '×';
					} else if (local62.equals("euro")) {
						local38 = '€';
					} else if (local62.equals("copy")) {
						local38 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local136 = 0;
									} else {
										local136 = arg0[local22];
									}
									if (arg4 == null) {
										local144 = 0;
									} else {
										local144 = arg4[local22];
									}
									local22++;
									@Pc(157) int local157 = Static246.method4383(local62.substring(4));
									@Pc(161) Class58 local161 = arg1[local157];
									@Pc(170) int local170 = arg2 == null ? local161.method4286() : arg2[local157];
									local161.method4276(local136 + arg3, this.aClass16_6.anInt376 + local11 - (local170 + -local144), 0, 0);
									local20 = -1;
									arg3 += arg1[local157].method4282();
								} catch (@Pc(199) Exception local199) {
								}
							} else {
								this.method4240(local62);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local18 == -1) {
					if (local20 != -1) {
						arg3 += this.aClass16_6.method319(local38, local20);
					}
					@Pc(227) int local227;
					if (arg0 == null) {
						local227 = 0;
					} else {
						local227 = arg0[local22];
					}
					if (arg4 == null) {
						local136 = 0;
					} else {
						local136 = arg4[local22];
					}
					local22++;
					if (local38 != ' ') {
						if ((Static212.anInt2903 & 0xFF000000) != 0) {
							this.method4236(local38, local227 + arg3 + 1, local11 + 1 + local136, Static212.anInt2903, true);
						}
						this.method4236(local38, arg3 + local227, local11 + local136, Static255.anInt5167, false);
					} else if (Static206.anInt4319 > 0) {
						Static225.anInt4572 += Static206.anInt4319;
						arg3 += Static225.anInt4572 >> 8;
						Static225.anInt4572 &= 0xFF;
					}
					local144 = this.aClass16_6.method322(local38);
					if (Static119.anInt2860 != -1) {
						this.aClass47_7.method2747(arg3, Static119.anInt2860, local144, local11 + (int) ((double) this.aClass16_6.anInt376 * 0.7D));
					}
					if (Static127.anInt3019 != -1) {
						this.aClass47_7.method2747(arg3, Static127.anInt3019, local144, local11 + this.aClass16_6.anInt376);
					}
					local20 = local38;
					arg3 += local144;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method4242(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method4243(-16777216, arg2);
		@Pc(16) int local16 = arg0.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg3 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) local24 / 3.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method4241(local19, null, null, arg1 - this.aClass16_6.method327(arg0) / 2, local22, arg0, arg4);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BII)V")
	private void method4243(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static270.anInt5396 = arg1;
		Static255.anInt5167 = arg1;
		Static225.anInt4572 = 0;
		Static206.anInt4319 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static119.anInt2860 = -1;
		Static127.anInt3019 = -1;
		Static215.anInt4411 = arg0;
		Static212.anInt2903 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILjava/lang/String;IIIILclient!sg;III[III[Lclient!vj;)I")
	public final int method4244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class118 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class58[] arg14) {
		if (arg3 == null) {
			return 0;
		}
		this.method4243(arg9, arg2);
		if (arg0 == 0) {
			arg0 = this.aClass16_6.anInt376;
		}
		@Pc(52) int[] local52;
		if (arg0 + this.aClass16_6.anInt383 + this.aClass16_6.anInt382 > arg6 && arg6 < arg0 + arg0) {
			local52 = null;
		} else {
			local52 = new int[] { arg13 };
		}
		@Pc(65) int local65 = this.aClass16_6.method328(local52, Static209.aStringArray52, arg14, arg3);
		if (arg4 == 3 && local65 == 1) {
			arg4 = 1;
		}
		@Pc(105) int local105;
		@Pc(130) int local130;
		if (arg4 == 0) {
			local105 = arg8 + this.aClass16_6.anInt382;
		} else if (arg4 == 1) {
			local105 = (arg6 - arg0 * (local65 - 1) - this.aClass16_6.anInt383 - this.aClass16_6.anInt382) / 2 + arg8 + this.aClass16_6.anInt382;
		} else if (arg4 == 2) {
			local105 = arg8 + arg6 - this.aClass16_6.anInt383 - arg0 * (local65 + -1);
		} else {
			local130 = (arg6 - this.aClass16_6.anInt382 - this.aClass16_6.anInt383 - arg0 * (local65 - 1)) / (local65 + 1);
			if (local130 < 0) {
				local130 = 0;
			}
			local105 = this.aClass16_6.anInt382 + arg8 + local130;
			arg0 += local130;
		}
		for (local130 = 0; local130 < local65; local130++) {
			if (arg1 == 0) {
				this.method4231(arg5, arg11, Static209.aStringArray52[local130], arg12, local105, arg10, arg7, arg14);
			} else if (arg1 == 1) {
				this.method4231((arg13 - this.aClass16_6.method327(Static209.aStringArray52[local130])) / 2 + arg5, arg11, Static209.aStringArray52[local130], arg12, local105, arg10, arg7, arg14);
			} else if (arg1 == 2) {
				this.method4231(arg13 + arg5 - this.aClass16_6.method327(Static209.aStringArray52[local130]), arg11, Static209.aStringArray52[local130], arg12, local105, arg10, arg7, arg14);
			} else if (local130 == local65 - 1) {
				this.method4231(arg5, arg11, Static209.aStringArray52[local130], arg12, local105, arg10, arg7, arg14);
			} else {
				this.method4232(arg13, Static209.aStringArray52[local130]);
				this.method4231(arg5, arg11, Static209.aStringArray52[local130], arg12, local105, arg10, arg7, arg14);
				Static206.anInt4319 = 0;
			}
			local105 += arg0;
		}
		return local65;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILjava/lang/String;BII)V")
	public final void method4245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method4243(-16777216, arg0);
		@Pc(16) int local16 = arg2.length();
		@Pc(27) int[] local27 = new int[local16];
		for (@Pc(29) int local29 = 0; local29 < local16; local29++) {
			local27[local29] = (int) (Math.sin((double) arg3 / 5.0D + (double) local29 / 2.0D) * 5.0D);
		}
		this.method4241(null, null, null, arg1 - this.aClass16_6.method327(arg2) / 2, local27, arg2, arg4);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(CIIIZLclient!sg;II)V")
	protected abstract void method4246(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class118 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILjava/lang/String;BII)V")
	public final void method4247(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 != null) {
			this.method4243(-1, arg3);
			this.method4231(arg0 - this.aClass16_6.method327(arg1), null, arg1, 0, arg2, 0, null, null);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!vj;[IILjava/util/Random;IIII)I")
	public final int method4248(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(7) int arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg1);
		@Pc(20) int local20 = (arg5.nextInt() & 0x1F) + 192;
		this.method4243((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg5.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method4241(local43, arg2, arg3, arg4, null, arg0, arg6);
		return local45;
	}
}
