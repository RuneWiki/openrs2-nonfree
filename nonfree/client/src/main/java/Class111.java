import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public abstract class Class111 {

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!oa;")
	private final Class15 aClass15_14;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!sga;")
	private final Class297 aClass297_13;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!oa;Lclient!sga;)V")
	protected Class111(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class297 arg1) {
		this.aClass15_14 = arg0;
		this.aClass297_13 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;IIII)V")
	public final void method6666(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method6687(arg2, -1);
			this.method6677(null, 0, arg1, arg0, null, 0, arg3 - this.aClass297_13.method7314(arg0), null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIILjava/util/Random;II[IIZI[I[Lclient!xa;II)I")
	public final int method6668(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) Class37[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg4.setSeed((long) arg1);
		@Pc(19) int local19 = (arg4.nextInt() & 0x1F) + 192;
		this.method6687(arg13 & 0xFFFFFF | local19 << 24, arg3 & 0xFFFFFF | local19 << 24);
		@Pc(39) int local39 = arg0.length();
		@Pc(42) int[] local42 = new int[local39];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < local39; local46++) {
			local42[local46] = local44;
			if ((arg4.nextInt() & 0x3) == 0) {
				local44++;
			}
		}
		@Pc(70) int local70 = arg5;
		@Pc(76) int local76 = this.aClass297_13.anInt8936 + arg2;
		@Pc(78) int local78 = -1;
		if (arg9 == 1) {
			local76 += (arg8 - this.aClass297_13.anInt8935 - this.aClass297_13.anInt8936) / 2;
		} else if (arg9 == 2) {
			local76 = arg8 + arg2 - this.aClass297_13.anInt8935;
		}
		if (arg6 == 1) {
			local78 = local44 + this.aClass297_13.method7314(arg0);
			local70 = arg5 + (arg12 - local78) / 2;
		} else if (arg6 == 2) {
			local78 = local44 + this.aClass297_13.method7314(arg0);
			local70 = arg5 + arg12 - local78;
		}
		this.method6686(null, arg11, arg0, arg7, local76, local70, local42);
		if (arg10 != null) {
			if (local78 == -1) {
				local78 = local44 + this.aClass297_13.method7314(arg0);
			}
			arg10[0] = local70;
			arg10[2] = local78;
			arg10[1] = local76 - this.aClass297_13.anInt8936;
			arg10[3] = this.aClass297_13.anInt8935 + this.aClass297_13.anInt8936;
		}
		return local44;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;IIII[ILjava/lang/String;I)V")
	public final void method6670(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		if (arg4 != null) {
			this.method6687(arg1, 0);
			this.method6677(null, 0, arg2, arg4, arg0, 0, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	protected abstract void method6671(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class93 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method6672(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method6687(arg1, -16777216);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(26) int[] local26 = new int[local20];
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			local23[local28] = (int) (Math.sin((double) local28 / 5.0D + (double) arg2 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) arg2 / 5.0D + (double) local28 / 3.0D) * 5.0D);
		}
		this.method6686(local26, null, arg0, null, arg3, arg4 - this.aClass297_13.method7314(arg0) / 2, local23);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IIIIB)V")
	public final void method6673(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method6687(arg2, -16777216);
		@Pc(14) int local14 = arg1.length();
		@Pc(17) int[] local17 = new int[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			local17[local19] = (int) (Math.sin((double) local19 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method6686(local17, null, arg1, null, arg0, arg4 - this.aClass297_13.method7314(arg1) / 2, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIILjava/util/Random;[Lclient!xa;III[I)I")
	public final int method6674(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) Class37[] arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int[] arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg1);
		@Pc(18) int local18 = (arg3.nextInt() & 0x1F) + 192;
		this.method6687(local18 << 24 | 0xFFFFFF, (local18 | 0x0) << 24);
		@Pc(45) int local45 = arg0.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg3.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method6686(null, arg4, arg0, arg6, arg2, arg5, local48);
		return local50;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method6675(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method6687(arg3, arg4);
			this.method6677(null, 0, arg2, arg0, null, 0, arg1, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method6676(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static154.anInt3385 = Static154.anInt3385 & 0xFF000000 | Static357.method5926(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static154.anInt3385 = Static582.anInt10233 & 0xFFFFFF | Static154.anInt3385 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static154.anInt3385 = Static357.method5926(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static154.anInt3385 = Static582.anInt10233;
			} else if (arg0.startsWith("str=")) {
				Static48.anInt1206 = Static154.anInt3385 & 0xFF000000 | Static357.method5926(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static48.anInt1206 = Static154.anInt3385 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static48.anInt1206 = -1;
			} else if (arg0.startsWith("u=")) {
				Static590.anInt10325 = Static154.anInt3385 & 0xFF000000 | Static357.method5926(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static590.anInt10325 = Static154.anInt3385 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static590.anInt10325 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static19.anInt608 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static19.anInt608 = Static154.anInt3385 & 0xFF000000 | Static357.method5926(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static19.anInt608 = Static154.anInt3385 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static19.anInt608 = Static27.anInt848;
			} else if (arg0.equals("br")) {
				this.method6687(Static582.anInt10233, Static27.anInt848);
			}
		} catch (@Pc(168) Exception local168) {
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!fa;IIILjava/lang/String;[Lclient!xa;II[I)V")
	private void method6677(@OriginalArg(0) Class93 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Class37[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		@Pc(5) int local5 = arg2 - this.aClass297_13.anInt8933;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(24) int local24 = arg3.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(36) char local36 = (char) (Static99.method2137(arg3.charAt(local26)) & 0xFF);
			if (local36 == '<') {
				local19 = local26;
			} else {
				if (local36 == '>' && local19 != -1) {
					@Pc(57) String local57 = arg3.substring(local19 + 1, local26);
					local19 = -1;
					if (local57.equals("lt")) {
						local36 = '<';
					} else if (local57.equals("gt")) {
						local36 = '>';
					} else if (local57.equals("nbsp")) {
						local36 = ' ';
					} else if (local57.equals("shy")) {
						local36 = '\u00ad';
					} else if (local57.equals("times")) {
						local36 = '×';
					} else if (local57.equals("euro")) {
						local36 = '€';
					} else if (local57.equals("copy")) {
						local36 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									@Pc(118) int local118 = Static403.method6559(local57.substring(4));
									@Pc(122) Class37 local122 = arg4[local118];
									@Pc(131) int local131 = arg7 == null ? local122.a() : arg7[local118];
									if ((Static154.anInt3385 & 0xFF000000) == -16777216) {
										local122.I(arg6, local5 + this.aClass297_13.anInt8933 - local131, 1, 0, 1);
									} else {
										local122.I(arg6, this.aClass297_13.anInt8933 + local5 - local131, 0, Static154.anInt3385 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg6 += arg4[local118].AA();
									local21 = -1;
								} catch (@Pc(181) Exception local181) {
								}
							} else {
								this.method6676(local57);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local19 == -1) {
					if (local21 != -1) {
						arg6 += this.aClass297_13.method7315(local36, local21);
					}
					if (local36 == ' ') {
						if (Static199.anInt3885 > 0) {
							Static491.anInt8096 += Static199.anInt3885;
							arg6 += Static491.anInt8096 >> 8;
							Static491.anInt8096 &= 0xFF;
						}
					} else if (arg0 == null) {
						if ((Static19.anInt608 & 0xFF000000) != 0) {
							this.q(local36, arg6 + 1, local5 + 1, Static19.anInt608, true);
						}
						this.q(local36, arg6, local5, Static154.anInt3385, false);
					} else {
						if ((Static19.anInt608 & 0xFF000000) != 0) {
							this.method6671(local36, arg6 + 1, local5 - -1, Static19.anInt608, true, arg0, arg1, arg5);
						}
						this.method6671(local36, arg6, local5, Static154.anInt3385, false, arg0, arg1, arg5);
					}
					@Pc(300) int local300 = this.aClass297_13.method7317(local36);
					if (Static48.anInt1206 != -1) {
						this.aClass15_14.method5281((int) ((double) this.aClass297_13.anInt8933 * 0.7D) + local5, local300, Static48.anInt1206, arg6);
					}
					if (Static590.anInt10325 != -1) {
						this.aClass15_14.method5281(local5 + this.aClass297_13.anInt8933 + 1, local300, Static590.anInt10325, arg6);
					}
					arg6 += local300;
					local21 = local36;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
	protected abstract void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIILjava/lang/String;II)V")
	public final void method6681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method6687(arg0, arg4);
			this.method6677(null, 0, arg1, arg2, null, 0, arg3 - this.aClass297_13.method7314(arg2) / 2, null);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;[IILclient!fa;IIIIIIIILjava/lang/String;IIII)I")
	public final int method6682(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class93 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method6687(arg9, arg7);
		if (arg6 == 0) {
			arg6 = this.aClass297_13.anInt8933;
		}
		@Pc(47) int[] local47;
		if (arg10 < arg6 + this.aClass297_13.anInt8935 + this.aClass297_13.anInt8936 && arg10 < arg6 + arg6) {
			local47 = null;
		} else {
			local47 = new int[] { arg8 };
		}
		@Pc(64) int local64 = this.aClass297_13.method7320(local47, arg0, Static283.aStringArray24, arg11);
		if (arg14 == -1) {
			arg14 = arg10 / arg6;
			if (arg14 <= 0) {
				arg14 = 1;
			}
		}
		if (arg14 > 0 && local64 >= arg14) {
			local64 = arg14;
			Static283.aStringArray24[arg14 - 1] = this.aClass297_13.method7319(Static283.aStringArray24[arg14 - 1], arg0, arg8);
		}
		if (arg13 == 3 && local64 == 1) {
			arg13 = 1;
		}
		@Pc(162) int local162;
		@Pc(150) int local150;
		if (arg13 == 0) {
			local162 = this.aClass297_13.anInt8936 + arg5;
		} else if (arg13 == 1) {
			local162 = (arg10 - arg6 * (local64 - 1) - this.aClass297_13.anInt8935 - this.aClass297_13.anInt8936) / 2 + arg5 + this.aClass297_13.anInt8936;
		} else if (arg13 == 2) {
			local162 = arg10 + arg5 - (local64 - 1) * arg6 - this.aClass297_13.anInt8935;
		} else {
			local150 = (arg10 - (local64 - 1) * arg6 - this.aClass297_13.anInt8936 - this.aClass297_13.anInt8935) / (local64 + 1);
			if (local150 < 0) {
				local150 = 0;
			}
			local162 = local150 + arg5 + this.aClass297_13.anInt8936;
			arg6 += local150;
		}
		for (local150 = 0; local150 < local64; local150++) {
			if (arg15 == 0) {
				this.method6677(arg3, arg12, local162, Static283.aStringArray24[local150], arg0, arg4, arg2, arg1);
			} else if (arg15 == 1) {
				this.method6677(arg3, arg12, local162, Static283.aStringArray24[local150], arg0, arg4, arg2 + (arg8 - this.aClass297_13.method7314(Static283.aStringArray24[local150])) / 2, arg1);
			} else if (arg15 == 2) {
				this.method6677(arg3, arg12, local162, Static283.aStringArray24[local150], arg0, arg4, arg8 + arg2 - this.aClass297_13.method7314(Static283.aStringArray24[local150]), arg1);
			} else if (local64 - 1 == local150) {
				this.method6677(arg3, arg12, local162, Static283.aStringArray24[local150], arg0, arg4, arg2, arg1);
			} else {
				this.method6684(arg8, Static283.aStringArray24[local150]);
				this.method6677(arg3, arg12, local162, Static283.aStringArray24[local150], arg0, arg4, arg2, arg1);
				Static199.anInt3885 = 0;
			}
			local162 += arg6;
		}
		return local64;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method6684(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(17) int local17 = 0; local17 < arg1.length(); local17++) {
			@Pc(22) char local22 = arg1.charAt(local17);
			if (local22 == '<') {
				local7 = true;
			} else if (local22 == '>') {
				local7 = false;
			} else if (!local7 && local22 == ' ') {
				local5++;
			}
		}
		if (local5 > 0) {
			Static199.anInt3885 = (arg0 - this.aClass297_13.method7314(arg1) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method6685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method6687(arg0, -16777216);
		@Pc(18) double local18 = 7.0D - (double) arg1 / 8.0D;
		if (local18 < 0.0D) {
			local18 = 0.0D;
		}
		@Pc(27) int local27 = arg5.length();
		@Pc(30) int[] local30 = new int[local27];
		for (@Pc(32) int local32 = 0; local32 < local27; local32++) {
			local30[local32] = (int) (local18 * Math.sin((double) local32 / 1.5D + (double) arg3));
		}
		this.method6686(local30, null, arg5, null, arg4, arg2 - this.aClass297_13.method7314(arg5) / 2, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([I[Lclient!xa;ILjava/lang/String;[III[I)V")
	private void method6686(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class37[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(14) int local14 = arg4 - this.aClass297_13.anInt8933;
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg2.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(37) char local37 = (char) (Static99.method2137(arg2.charAt(local25)) & 0xFF);
			if (local37 == '<') {
				local16 = local25;
			} else {
				@Pc(119) int local119;
				@Pc(128) int local128;
				if (local37 == '>' && local16 != -1) {
					@Pc(58) String local58 = arg2.substring(local16 + 1, local25);
					local16 = -1;
					if (local58.equals("lt")) {
						local37 = '<';
					} else if (local58.equals("gt")) {
						local37 = '>';
					} else if (local58.equals("nbsp")) {
						local37 = ' ';
					} else if (local58.equals("shy")) {
						local37 = '\u00ad';
					} else if (local58.equals("times")) {
						local37 = '×';
					} else if (local58.equals("euro")) {
						local37 = '€';
					} else if (local58.equals("copy")) {
						local37 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local119 = 0;
									} else {
										local119 = arg6[local20];
									}
									if (arg0 == null) {
										local128 = 0;
									} else {
										local128 = arg0[local20];
									}
									local20++;
									@Pc(138) int local138 = Static403.method6559(local58.substring(4));
									@Pc(142) Class37 local142 = arg1[local138];
									@Pc(151) int local151 = arg3 == null ? local142.a() : arg3[local138];
									local142.I(arg5 + local119, local128 + -local151 + this.aClass297_13.anInt8933 + local14, 1, 0, 1);
									arg5 += arg1[local138].AA();
									local18 = -1;
								} catch (@Pc(181) Exception local181) {
								}
							} else {
								this.method6676(local58);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local16 == -1) {
					if (local18 != -1) {
						arg5 += this.aClass297_13.method7315(local37, local18);
					}
					@Pc(215) int local215;
					if (arg6 == null) {
						local215 = 0;
					} else {
						local215 = arg6[local20];
					}
					if (arg0 == null) {
						local119 = 0;
					} else {
						local119 = arg0[local20];
					}
					if (local37 != ' ') {
						if ((Static19.anInt608 & 0xFF000000) != 0) {
							this.q(local37, arg5 + local215 + 1, local119 + 1 + local14, Static19.anInt608, true);
						}
						this.q(local37, arg5 + local215, local119 + local14, Static154.anInt3385, false);
					} else if (Static199.anInt3885 > 0) {
						Static491.anInt8096 += Static199.anInt3885;
						arg5 += Static491.anInt8096 >> 8;
						Static491.anInt8096 &= 0xFF;
					}
					local20++;
					local128 = this.aClass297_13.method7317(local37);
					if (Static48.anInt1206 != -1) {
						this.aClass15_14.method5281((int) ((double) this.aClass297_13.anInt8933 * 0.7D) + local14, local128, Static48.anInt1206, arg5);
					}
					if (Static590.anInt10325 != -1) {
						this.aClass15_14.method5281(local14 + this.aClass297_13.anInt8933, local128, Static590.anInt10325, arg5);
					}
					local18 = local37;
					arg5 += local128;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	private void method6687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static199.anInt3885 = 0;
		Static491.anInt8096 = 0;
		Static48.anInt1206 = -1;
		Static582.anInt10233 = arg0;
		Static154.anInt3385 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static590.anInt10325 = -1;
		Static27.anInt848 = arg1;
		Static19.anInt608 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILjava/lang/String;Lclient!fa;I[II[Lclient!xa;IIII)I")
	public final int method6688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) Class93 arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class37[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method6682(arg10, arg8, arg4, arg7, arg0, arg3, arg5, arg9, arg12, arg1, arg2, arg6, arg11, arg14, 0, arg13);
	}
}
