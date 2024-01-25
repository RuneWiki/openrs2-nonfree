import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public abstract class Class29 {

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "Lclient!eq;")
	private final Class66 aClass66_9;

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "Lclient!mo;")
	private final Class166 aClass166_9;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!eq;Lclient!mo;)V")
	protected Class29(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class166 arg1) {
		this.aClass66_9 = arg0;
		this.aClass166_9 = arg1;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILclient!fs;III[Lclient!qg;IIIIILjava/lang/String;[IIII)I")
	public final int method4785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class87[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) String arg12, @OriginalArg(13) int[] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg12 == null) {
			return 0;
		}
		this.method4789(arg8, arg7);
		if (arg9 == 0) {
			arg9 = this.aClass166_9.anInt4594;
		}
		@Pc(42) int[] local42;
		if (arg9 + this.aClass166_9.anInt4593 + this.aClass166_9.anInt4596 > arg10 && arg10 < arg9 + arg9) {
			local42 = null;
		} else {
			local42 = new int[] { arg0 };
		}
		@Pc(60) int local60 = this.aClass166_9.method3883(arg6, arg12, Static154.aStringArray16, local42);
		if (arg3 == -1) {
			arg3 = arg10 / arg9;
			if (arg3 <= 0) {
				arg3 = 1;
			}
		}
		if (arg3 > 0 && local60 >= arg3) {
			local60 = arg3;
			Static154.aStringArray16[arg3 - 1] = this.aClass166_9.method3888(Static154.aStringArray16[arg3 - 1], arg6, arg0);
		}
		if (arg1 == 3 && local60 == 1) {
			arg1 = 1;
		}
		@Pc(113) int local113;
		@Pc(173) int local173;
		if (arg1 == 0) {
			local113 = arg15 + this.aClass166_9.anInt4596;
		} else if (arg1 == 1) {
			local113 = arg15 + this.aClass166_9.anInt4596 + (arg10 - this.aClass166_9.anInt4596 - this.aClass166_9.anInt4593 - (local60 - 1) * arg9) / 2;
		} else if (arg1 == 2) {
			local113 = arg10 + arg15 - this.aClass166_9.anInt4593 - arg9 * (local60 + -1);
		} else {
			local173 = (arg10 - this.aClass166_9.anInt4596 - this.aClass166_9.anInt4593 - (local60 - 1) * arg9) / (local60 + 1);
			if (local173 < 0) {
				local173 = 0;
			}
			arg9 += local173;
			local113 = local173 + this.aClass166_9.anInt4596 + arg15;
		}
		for (local173 = 0; local173 < local60; local173++) {
			if (arg5 == 0) {
				this.method4803(arg6, Static154.aStringArray16[local173], arg4, arg11, arg13, arg2, arg14, local113);
			} else if (arg5 == 1) {
				this.method4803(arg6, Static154.aStringArray16[local173], arg4, arg11, arg13, arg2, (arg0 - this.aClass166_9.method3892(Static154.aStringArray16[local173])) / 2 + arg14, local113);
			} else if (arg5 == 2) {
				this.method4803(arg6, Static154.aStringArray16[local173], arg4, arg11, arg13, arg2, arg0 + arg14 - this.aClass166_9.method3892(Static154.aStringArray16[local173]), local113);
			} else if (local60 - 1 == local173) {
				this.method4803(arg6, Static154.aStringArray16[local173], arg4, arg11, arg13, arg2, arg14, local113);
			} else {
				this.method4788(Static154.aStringArray16[local173], arg0);
				this.method4803(arg6, Static154.aStringArray16[local173], arg4, arg11, arg13, arg2, arg14, local113);
				Static229.anInt4188 = 0;
			}
			local113 += arg9;
		}
		return local60;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method4787(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLjava/lang/String;I)V")
	private void method4788(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg0.length() > local11; local11++) {
			@Pc(17) char local17 = arg0.charAt(local11);
			if (local17 == '<') {
				local9 = true;
			} else if (local17 == '>') {
				local9 = false;
			} else if (!local9 && local17 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static229.anInt4188 = (arg1 - this.aClass166_9.method3892(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)V")
	private void method4789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static392.anInt5066 = -1;
		Static183.anInt4659 = -1;
		Static229.anInt4188 = 0;
		Static6.anInt249 = arg0;
		Static406.anInt7279 = arg0;
		Static317.anInt2330 = 0;
		Static27.anInt813 = arg1;
		Static33.anInt1053 = arg1;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZLjava/lang/String;III)V")
	public final void method4790(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 != null) {
			this.method4789(arg3, -1);
			this.method4803(null, arg1, 0, 0, null, null, arg2 - this.aClass166_9.method3892(arg1), arg0);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public final void method4791(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method4789(arg0, -16777216);
		@Pc(25) double local25 = 7.0D - (double) arg2 / 8.0D;
		if (local25 < 0.0D) {
			local25 = 0.0D;
		}
		@Pc(34) int local34 = arg1.length();
		@Pc(37) int[] local37 = new int[local34];
		for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
			local37[local39] = (int) (Math.sin((double) arg4 + (double) local39 / 1.5D) * local25);
		}
		this.method4800(arg3 - this.aClass166_9.method3892(arg1) / 2, arg1, arg5, local37, null, null, null);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method4789(arg4, -16777216);
		@Pc(16) int local16 = arg2.length();
		@Pc(23) int[] local23 = new int[local16];
		@Pc(26) int[] local26 = new int[local16];
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			local23[local28] = (int) (Math.sin((double) local28 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) arg0 / 5.0D + (double) local28 / 3.0D) * 5.0D);
		}
		this.method4800(arg3 - this.aClass166_9.method3892(arg2) / 2, arg2, arg1, local26, local23, null, null);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method4793(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static406.anInt7279 = Static406.anInt7279 & 0xFF000000 | Static329.method4765(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static406.anInt7279 = Static6.anInt249 & 0xFFFFFF | Static406.anInt7279 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static406.anInt7279 = Static329.method4765(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static406.anInt7279 = Static6.anInt249;
			} else if (arg0.startsWith("str=")) {
				Static392.anInt5066 = Static329.method4765(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static392.anInt5066 = -8388608;
			} else if (arg0.equals("/str")) {
				Static392.anInt5066 = -1;
			} else if (arg0.startsWith("u=")) {
				Static183.anInt4659 = Static329.method4765(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static183.anInt4659 = -16777216;
			} else if (arg0.equals("/u")) {
				Static183.anInt4659 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static33.anInt1053 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static33.anInt1053 = Static329.method4765(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static33.anInt1053 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static33.anInt1053 = Static27.anInt813;
			} else if (arg0.equals("br")) {
				this.method4789(Static6.anInt249, Static27.anInt813);
				return;
			}
		} catch (@Pc(160) Exception local160) {
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(CIIIZLclient!fs;II)V")
	protected abstract void method4794(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class22 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method4795(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method4789(arg3, arg4);
			this.method4803(null, arg1, 0, 0, null, null, arg0 - this.aClass166_9.method3892(arg1) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/util/Random;[II[Lclient!qg;IILjava/lang/String;III)I")
	public final int method4796(@OriginalArg(0) Random arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class87[] arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg4 == null) {
			return 0;
		}
		arg0.setSeed((long) arg5);
		@Pc(20) int local20 = (arg0.nextInt() & 0x1F) + 192;
		this.method4789(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg4.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg0.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method4800(arg6, arg4, arg2, null, local43, arg1, arg3);
		return local45;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method4797(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method4789(arg0, -16777216);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method4800(arg4 - this.aClass166_9.method3892(arg1) / 2, arg1, arg3, local19, null, null, null);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!fs;IIIIIIILjava/lang/String;II[Lclient!qg;IIB[I)I")
	public final int method4798(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class87[] arg10, @OriginalArg(13) int arg11, @OriginalArg(15) int[] arg12) {
		return this.method4785(arg9, arg2, arg0, 0, arg4, 1, arg10, arg11, arg3, 0, arg5, arg1, arg7, arg12, arg6, arg8);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;ILjava/util/Random;I[IIII[IIIIII[Lclient!qg;)I")
	public final int method4799(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class87[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg2.setSeed((long) arg1);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method4789(local20 << 24 | arg8 & 0xFFFFFF, arg9 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg2.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(75) int local75 = arg11;
		@Pc(82) int local82 = arg5 + this.aClass166_9.anInt4596;
		if (arg12 == 1) {
			local82 += (arg10 - this.aClass166_9.anInt4596 - this.aClass166_9.anInt4593) / 2;
		} else if (arg12 == 2) {
			local82 = arg5 + arg10 - this.aClass166_9.anInt4593;
		}
		@Pc(121) int local121 = -1;
		if (arg6 == 1) {
			local121 = local45 + this.aClass166_9.method3892(arg0);
			local75 = arg11 + (arg3 - local121) / 2;
		} else if (arg6 == 2) {
			local121 = this.aClass166_9.method3892(arg0) + local45;
			local75 = arg11 + arg3 - local121;
		}
		this.method4800(local75, arg0, local82, null, local43, arg4, arg13);
		if (arg7 != null) {
			if (local121 == -1) {
				local121 = local45 + this.aClass166_9.method3892(arg0);
			}
			arg7[1] = local82 - this.aClass166_9.anInt4596;
			arg7[3] = this.aClass166_9.anInt4596 + this.aClass166_9.anInt4593;
			arg7[2] = local121;
			arg7[0] = local75;
		}
		return local45;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/lang/String;I[II[I[I[Lclient!qg;)V")
	private void method4800(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class87[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass166_9.anInt4594;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg1.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static240.method3701(arg1.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(108) int local108;
				@Pc(120) int local120;
				if (local33 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg1.substring(local13 + 1, local22);
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
										local108 = 0;
									} else {
										local108 = arg4[local17];
									}
									if (arg3 == null) {
										local120 = 0;
									} else {
										local120 = arg3[local17];
									}
									local17++;
									@Pc(131) int local131 = Static221.method3333(local56.substring(4));
									@Pc(135) Class87 local135 = arg6[local131];
									@Pc(144) int local144 = arg5 == null ? local135.method6561() : arg5[local131];
									local135.method6560(arg0 + local108, local120 + -local144 + this.aClass166_9.anInt4594 + local7, 1, 0);
									local15 = -1;
									arg0 += arg6[local131].method6565();
								} catch (@Pc(173) Exception local173) {
								}
							} else {
								this.method4793(local56);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass166_9.method3885(local33, local15);
					}
					@Pc(225) int local225;
					if (arg4 == null) {
						local225 = 0;
					} else {
						local225 = arg4[local17];
					}
					if (arg3 == null) {
						local108 = 0;
					} else {
						local108 = arg3[local17];
					}
					if (local33 != ' ') {
						if ((Static33.anInt1053 & 0xFF000000) != 0) {
							this.method4787(local33, arg0 + local225 + 1, local108 + 1 + local7, Static33.anInt1053, true);
						}
						this.method4787(local33, local225 + arg0, local7 + local108, Static406.anInt7279, false);
					} else if (Static229.anInt4188 > 0) {
						Static317.anInt2330 += Static229.anInt4188;
						arg0 += Static317.anInt2330 >> 8;
						Static317.anInt2330 &= 0xFF;
					}
					local17++;
					local120 = this.aClass166_9.method3886(local33);
					if (Static392.anInt5066 != -1) {
						this.aClass66_9.method4975(local120, arg0, (int) ((double) this.aClass166_9.anInt4594 * 0.7D) + local7, Static392.anInt5066);
					}
					if (Static183.anInt4659 != -1) {
						this.aClass66_9.method4975(local120, arg0, this.aClass166_9.anInt4594 + local7, Static183.anInt4659);
					}
					arg0 += local120;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([Lclient!qg;Ljava/lang/String;III[ILclient!fs;II)V")
	private void method4803(@OriginalArg(0) Class87[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class22 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg7 - this.aClass166_9.anInt4594;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static240.method3701(arg1.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local21 = local28;
			} else {
				if (local39 == '>' && local21 != -1) {
					@Pc(61) String local61 = arg1.substring(local21 + 1, local28);
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
									@Pc(127) int local127 = Static221.method3333(local61.substring(4));
									@Pc(131) Class87 local131 = arg0[local127];
									@Pc(140) int local140 = arg4 == null ? local131.method6561() : arg4[local127];
									if ((-16777216 & Static406.anInt7279) == -16777216) {
										local131.method6560(arg6, local7 + this.aClass166_9.anInt4594 - local140, 1, 0);
									} else {
										local131.method6560(arg6, local7 + this.aClass166_9.anInt4594 - local140, 0, Static406.anInt7279 & 0xFF000000 | 0xFFFFFF);
									}
									local23 = -1;
									arg6 += arg0[local127].method6565();
								} catch (@Pc(191) Exception local191) {
								}
							} else {
								this.method4793(local61);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg6 += this.aClass166_9.method3885(local39, local23);
					}
					if (local39 == ' ') {
						if (Static229.anInt4188 > 0) {
							Static317.anInt2330 += Static229.anInt4188;
							arg6 += Static317.anInt2330 >> 8;
							Static317.anInt2330 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static33.anInt1053 & 0xFF000000) != 0) {
							this.method4787(local39, arg6 + 1, local7 - -1, Static33.anInt1053, true);
						}
						this.method4787(local39, arg6, local7, Static406.anInt7279, false);
					} else {
						if ((Static33.anInt1053 & 0xFF000000) != 0) {
							this.method4794(local39, arg6 + 1, local7 + 1, Static33.anInt1053, true, arg5, arg3, arg2);
						}
						this.method4794(local39, arg6, local7, Static406.anInt7279, false, arg5, arg3, arg2);
					}
					@Pc(307) int local307 = this.aClass166_9.method3886(local39);
					if (Static392.anInt5066 != -1) {
						this.aClass66_9.method4975(local307, arg6, (int) ((double) this.aClass166_9.anInt4594 * 0.7D) + local7, Static392.anInt5066);
					}
					if (Static183.anInt4659 != -1) {
						this.aClass66_9.method4975(local307, arg6, this.aClass166_9.anInt4594 + local7 + 1, Static183.anInt4659);
					}
					local23 = local39;
					arg6 += local307;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIILjava/lang/String;B)V")
	public final void method4804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 != null) {
			this.method4789(arg0, arg1);
			this.method4803(null, arg4, 0, 0, null, null, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIILjava/lang/String;II[Lclient!qg;[I)V")
	public final void method4805(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class87[] arg4, @OriginalArg(7) int[] arg5) {
		if (arg1 != null) {
			this.method4789(arg0, 0);
			this.method4803(arg4, arg1, 0, 0, arg5, null, arg2, arg3);
		}
	}
}
