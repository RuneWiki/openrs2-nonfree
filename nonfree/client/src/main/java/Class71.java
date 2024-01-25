import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class71 {

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!ya;")
	private final Class39 aClass39_10;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!lm;")
	private final Class151 aClass151_125;

	static {
		new Class7("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ya;Lclient!lm;)V")
	protected Class71(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class151 arg1) {
		this.aClass39_10 = arg0;
		this.aClass151_125 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;II[IIII[IILjava/lang/String;II[Lclient!l;BI)I")
	public final int method5442(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class143[] arg12, @OriginalArg(14) int arg13) {
		if (arg9 == null) {
			return 0;
		}
		arg0.setSeed((long) arg10);
		@Pc(19) int local19 = (arg0.nextInt() & 0x1F) + 192;
		this.method5449(local19 << 24 | arg6 & 0xFFFFFF, local19 << 24 | arg5 & 0xFFFFFF);
		@Pc(39) int local39 = arg9.length();
		@Pc(42) int[] local42 = new int[local39];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local39; local52++) {
			local42[local52] = local50;
			if ((arg0.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(73) int local73 = arg1;
		@Pc(80) int local80 = arg8 + this.aClass151_125.anInt4134;
		if (arg13 == 1) {
			local80 += (arg4 - this.aClass151_125.anInt4134 - this.aClass151_125.anInt4125) / 2;
		} else if (arg13 == 2) {
			local80 = arg8 + arg4 - this.aClass151_125.anInt4125;
		}
		@Pc(115) int local115 = -1;
		if (arg11 == 1) {
			local115 = local50 + this.aClass151_125.method3475(arg9);
			local73 = arg1 + (arg2 - local115) / 2;
		} else if (arg11 == 2) {
			local115 = local50 + this.aClass151_125.method3475(arg9);
			local73 = arg1 + arg2 - local115;
		}
		this.method5455(local73, local80, arg9, arg12, null, arg7, local42);
		if (arg3 != null) {
			if (local115 == -1) {
				local115 = local50 + this.aClass151_125.method3475(arg9);
			}
			arg3[3] = this.aClass151_125.anInt4134 + this.aClass151_125.anInt4125;
			arg3[1] = local80 - this.aClass151_125.anInt4134;
			arg3[2] = local115;
			arg3[0] = local73;
		}
		return local50;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5443(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
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
			Static407.anInt6567 = (arg1 - this.aClass151_125.method3475(arg0) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	protected abstract void method5444(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class133 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5445(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static50.anInt972 = Static50.anInt972 & 0xFF000000 | Static263.method3887(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static50.anInt972 = Static436.anInt7051 & 0xFFFFFF | Static50.anInt972 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static50.anInt972 = Static263.method3887(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static50.anInt972 = Static436.anInt7051;
			} else if (arg0.startsWith("str=")) {
				Static261.anInt4660 = Static50.anInt972 & 0xFF000000 | Static263.method3887(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static261.anInt4660 = Static50.anInt972 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static261.anInt4660 = -1;
			} else if (arg0.startsWith("u=")) {
				Static193.anInt3453 = Static50.anInt972 & 0xFF000000 | Static263.method3887(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static193.anInt3453 = Static50.anInt972 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static193.anInt3453 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static356.anInt5876 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static356.anInt5876 = Static50.anInt972 & 0xFF000000 | Static263.method3887(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static356.anInt5876 = Static50.anInt972 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static356.anInt5876 = Static238.anInt4360;
			} else if (arg0.equals("br")) {
				this.method5449(Static238.anInt4360, Static436.anInt7051);
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5446(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5449(arg2, arg3);
			this.method5456(null, null, arg0, arg1, null, arg4 - this.aClass151_125.method3475(arg1) / 2, 0, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIBLjava/lang/String;I)V")
	public final void method5447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method5449(-16777216, arg4);
		@Pc(22) int local22 = arg3.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) local27 / 2.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method5455(arg1 - this.aClass151_125.method3475(arg3) / 2, arg2, arg3, null, local25, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;IIILclient!ma;I[Lclient!l;I[IIIIIIII)I")
	public final int method5448(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class133 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class143[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method5449(arg11, arg2);
		if (arg1 == 0) {
			arg1 = this.aClass151_125.anInt4135;
		}
		@Pc(36) int[] local36;
		if (arg15 < arg1 + this.aClass151_125.anInt4125 + this.aClass151_125.anInt4134 && arg15 < arg1 + arg1) {
			local36 = null;
		} else {
			local36 = new int[] { arg14 };
		}
		if (arg10 == -1) {
			arg10 = arg15 / arg1;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		@Pc(64) int local64 = this.aClass151_125.method3465(arg6, arg0, local36, Static61.aStringArray10);
		if (arg10 > 0 && local64 >= arg10) {
			Static61.aStringArray10[arg10 - 1] = this.aClass151_125.method3468(arg6, arg14, Static61.aStringArray10[arg10 - 1]);
			local64 = arg10;
		}
		if (arg9 == 3 && local64 == 1) {
			arg9 = 1;
		}
		@Pc(155) int local155;
		@Pc(198) int local198;
		if (arg9 == 0) {
			local155 = this.aClass151_125.anInt4134 + arg3;
		} else if (arg9 == 1) {
			local155 = arg3 + this.aClass151_125.anInt4134 + (arg15 - (local64 - 1) * arg1 - this.aClass151_125.anInt4134 - this.aClass151_125.anInt4125) / 2;
		} else if (arg9 == 2) {
			local155 = arg3 + arg15 - (local64 - 1) * arg1 - this.aClass151_125.anInt4125;
		} else {
			local198 = (arg15 - this.aClass151_125.anInt4125 - this.aClass151_125.anInt4134 - arg1 * (local64 + -1)) / (local64 + 1);
			if (local198 < 0) {
				local198 = 0;
			}
			arg1 += local198;
			local155 = arg3 + this.aClass151_125.anInt4134 + local198;
		}
		for (local198 = 0; local198 < local64; local198++) {
			if (arg13 == 0) {
				this.method5456(arg6, arg4, local155, Static61.aStringArray10[local198], arg8, arg7, arg12, arg5);
			} else if (arg13 == 1) {
				this.method5456(arg6, arg4, local155, Static61.aStringArray10[local198], arg8, (arg14 - this.aClass151_125.method3475(Static61.aStringArray10[local198])) / 2 + arg7, arg12, arg5);
			} else if (arg13 == 2) {
				this.method5456(arg6, arg4, local155, Static61.aStringArray10[local198], arg8, arg7 + arg14 - this.aClass151_125.method3475(Static61.aStringArray10[local198]), arg12, arg5);
			} else if (local198 == local64 - 1) {
				this.method5456(arg6, arg4, local155, Static61.aStringArray10[local198], arg8, arg7, arg12, arg5);
			} else {
				this.method5443(Static61.aStringArray10[local198], arg14);
				this.method5456(arg6, arg4, local155, Static61.aStringArray10[local198], arg8, arg7, arg12, arg5);
				Static407.anInt6567 = 0;
			}
			local155 += arg1;
		}
		return local64;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)V")
	private void method5449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static407.anInt6567 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static381.anInt6918 = 0;
		Static261.anInt4660 = -1;
		Static436.anInt7051 = arg1;
		Static50.anInt972 = arg1;
		Static193.anInt3453 = -1;
		Static238.anInt4360 = arg0;
		Static356.anInt5876 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method5449(-16777216, arg1);
		@Pc(14) int local14 = arg3.length();
		@Pc(29) int[] local29 = new int[local14];
		@Pc(32) int[] local32 = new int[local14];
		for (@Pc(34) int local34 = 0; local34 < local14; local34++) {
			local29[local34] = (int) (Math.sin((double) arg4 / 5.0D + (double) local34 / 5.0D) * 5.0D);
			local32[local34] = (int) (Math.sin((double) arg4 / 5.0D + (double) local34 / 3.0D) * 5.0D);
		}
		this.method5455(arg2 - this.aClass151_125.method3475(arg3) / 2, arg0, arg3, null, local32, null, local29);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5451(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 != null) {
			this.method5449(-1, arg3);
			this.method5456(null, null, arg0, arg1, null, arg2 - this.aClass151_125.method3475(arg1), 0, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;II[Lclient!l;I[IIIILjava/lang/String;)I")
	public final int method5452(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class143[] arg2, @OriginalArg(5) int[] arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg0.setSeed((long) arg5);
		@Pc(20) int local20 = (arg0.nextInt() & 0x1F) + 192;
		this.method5449((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg6.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg0.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method5455(arg1, arg4, arg6, arg2, null, arg3, local43);
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!l;[IIILjava/lang/String;III)V")
	public final void method5453(@OriginalArg(0) Class143[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5) {
		if (arg4 != null) {
			this.method5449(0, arg3);
			this.method5456(arg0, null, arg5, arg4, arg1, arg2, 0, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIIILjava/lang/String;)V")
	public final void method5454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5449(arg1, arg2);
			this.method5456(null, null, arg3, arg4, null, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;[Lclient!l;[I[IB[I)V")
	private void method5455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class143[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg1 - this.aClass151_125.anInt4135;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg2.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(30) char local30 = (char) (Static372.method5075(arg2.charAt(local20)) & 0xFF);
			if (local30 == '<') {
				local11 = local20;
			} else {
				@Pc(111) int local111;
				@Pc(122) int local122;
				if (local30 == '>' && local11 != -1) {
					@Pc(49) String local49 = arg2.substring(local11 + 1, local20);
					local11 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '€';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							if (local49.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local111 = 0;
									} else {
										local111 = arg6[local15];
									}
									if (arg4 == null) {
										local122 = 0;
									} else {
										local122 = arg4[local15];
									}
									local15++;
									@Pc(132) int local132 = Static313.method4460(local49.substring(4));
									@Pc(136) Class143 local136 = arg3[local132];
									@Pc(145) int local145 = arg5 == null ? local136.T() : arg5[local132];
									local136.r(local111 + arg0, -local145 + local9 - (-this.aClass151_125.anInt4135 - local122), 1, 0, 1);
									local13 = -1;
									arg0 += arg3[local132].j();
								} catch (@Pc(175) Exception local175) {
								}
							} else {
								this.method5445(local49);
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg0 += this.aClass151_125.method3469(local13, local30);
					}
					@Pc(204) int local204;
					if (arg6 == null) {
						local204 = 0;
					} else {
						local204 = arg6[local15];
					}
					if (arg4 == null) {
						local111 = 0;
					} else {
						local111 = arg4[local15];
					}
					local15++;
					if (local30 != ' ') {
						if ((Static356.anInt5876 & 0xFF000000) != 0) {
							this.OA(local30, arg0 + local204 + 1, local9 - -local111 + 1, Static356.anInt5876, true);
						}
						this.OA(local30, arg0 + local204, local9 + local111, Static50.anInt972, false);
					} else if (Static407.anInt6567 > 0) {
						Static381.anInt6918 += Static407.anInt6567;
						arg0 += Static381.anInt6918 >> 8;
						Static381.anInt6918 &= 0xFF;
					}
					local122 = this.aClass151_125.method3472(local30);
					if (Static261.anInt4660 != -1) {
						this.aClass39_10.method4501(arg0, local122, Static261.anInt4660, local9 + (int) ((double) this.aClass151_125.anInt4135 * 0.7D));
					}
					if (Static193.anInt3453 != -1) {
						this.aClass39_10.method4501(arg0, local122, Static193.anInt3453, this.aClass151_125.anInt4135 + local9);
					}
					local13 = local30;
					arg0 += local122;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!l;Lclient!ma;IILjava/lang/String;[IIII)V")
	private void method5456(@OriginalArg(0) Class143[] arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg2 - this.aClass151_125.anInt4135;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(16) int local16 = arg3.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(28) char local28 = (char) (Static372.method5075(arg3.charAt(local18)) & 0xFF);
			if (local28 == '<') {
				local11 = local18;
			} else {
				if (local28 == '>' && local11 != -1) {
					@Pc(50) String local50 = arg3.substring(local11 + 1, local18);
					local11 = -1;
					if (local50.equals("lt")) {
						local28 = '<';
					} else if (local50.equals("gt")) {
						local28 = '>';
					} else if (local50.equals("nbsp")) {
						local28 = ' ';
					} else if (local50.equals("shy")) {
						local28 = '\u00ad';
					} else if (local50.equals("times")) {
						local28 = '×';
					} else if (local50.equals("euro")) {
						local28 = '€';
					} else if (local50.equals("copy")) {
						local28 = '©';
					} else {
						if (!local50.equals("reg")) {
							if (local50.startsWith("img=")) {
								try {
									@Pc(103) int local103 = Static313.method4460(local50.substring(4));
									@Pc(107) Class143 local107 = arg0[local103];
									@Pc(116) int local116 = arg4 == null ? local107.T() : arg4[local103];
									if ((Static50.anInt972 & 0xFF000000) == -16777216) {
										local107.r(arg5, local9 + this.aClass151_125.anInt4135 - local116, 1, 0, 1);
									} else {
										local107.r(arg5, local9 + this.aClass151_125.anInt4135 - local116, 0, Static50.anInt972 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local13 = -1;
									arg5 += arg0[local103].j();
								} catch (@Pc(168) Exception local168) {
								}
							} else {
								this.method5445(local50);
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg5 += this.aClass151_125.method3469(local13, local28);
					}
					if (local28 == ' ') {
						if (Static407.anInt6567 > 0) {
							Static381.anInt6918 += Static407.anInt6567;
							arg5 += Static381.anInt6918 >> 8;
							Static381.anInt6918 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static356.anInt5876 & 0xFF000000) != 0) {
							this.OA(local28, arg5 + 1, local9 + 1, Static356.anInt5876, true);
						}
						this.OA(local28, arg5, local9, Static50.anInt972, false);
					} else {
						if ((Static356.anInt5876 & 0xFF000000) != 0) {
							this.method5444(local28, arg5 + 1, local9 + 1, Static356.anInt5876, true, arg1, arg7, arg6);
						}
						this.method5444(local28, arg5, local9, Static50.anInt972, false, arg1, arg7, arg6);
					}
					@Pc(292) int local292 = this.aClass151_125.method3472(local28);
					if (Static261.anInt4660 != -1) {
						this.aClass39_10.method4501(arg5, local292, Static261.anInt4660, local9 + (int) ((double) this.aClass151_125.anInt4135 * 0.7D));
					}
					if (Static193.anInt3453 != -1) {
						this.aClass39_10.method4501(arg5, local292, Static193.anInt3453, local9 + this.aClass151_125.anInt4135 + 1);
					}
					local13 = local28;
					arg5 += local292;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIIIILjava/lang/String;)V")
	public final void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method5449(-16777216, arg0);
		@Pc(20) double local20 = 7.0D - (double) arg1 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg5.length();
		@Pc(43) int[] local43 = new int[local29];
		for (@Pc(45) int local45 = 0; local45 < local29; local45++) {
			local43[local45] = (int) (local20 * Math.sin((double) local45 / 1.5D + (double) arg3));
		}
		this.method5455(arg4 - this.aClass151_125.method3475(arg5) / 2, arg2, arg5, null, local43, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[Lclient!l;Ljava/lang/String;ILclient!ma;[IIIIIIII)I")
	public final int method5459(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class143[] arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class133 arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method5448(arg3, 0, arg4, arg10, arg5, arg8, arg2, arg9, arg6, arg11, 0, arg12, arg0, 1, arg1, arg7);
	}
}
