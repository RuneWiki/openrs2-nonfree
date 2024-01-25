import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class35 {

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!r;")
	private final Class12 aClass12_12;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!aga;")
	private final Class13 aClass13_8;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!r;Lclient!aga;)V")
	protected Class35(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class13 arg1) {
		this.aClass12_12 = arg0;
		this.aClass13_8 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method4935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg3 != null) {
			this.method4938(arg1, arg4);
			this.method4946(arg0, null, null, arg3, 0, 0, arg2, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBII[I[Lclient!f;ILjava/lang/String;)V")
	public final void method4936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) Class10[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 != null) {
			this.method4938(arg4, 0);
			this.method4946(arg1, arg3, null, arg5, 0, 0, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Lclient!f;IIIII[ILjava/lang/String;III[ILjava/util/Random;)I")
	public final int method4937(@OriginalArg(0) int arg0, @OriginalArg(2) Class10[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) Random arg13) {
		if (arg8 == null) {
			return 0;
		}
		arg13.setSeed((long) arg10);
		@Pc(20) int local20 = (arg13.nextInt() & 0x1F) + 192;
		this.method4938(local20 << 24 | arg0 & 0xFFFFFF, arg11 & 0xFFFFFF | local20 << 24);
		@Pc(42) int local42 = arg8.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < local42; local49++) {
			local45[local49] = local47;
			if ((arg13.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		@Pc(74) int local74 = arg6;
		@Pc(80) int local80 = arg9 + this.aClass13_8.anInt517;
		@Pc(82) int local82 = -1;
		if (arg3 == 1) {
			local80 += (arg4 - this.aClass13_8.anInt517 - this.aClass13_8.anInt510) / 2;
		} else if (arg3 == 2) {
			local80 = arg9 + arg4 - this.aClass13_8.anInt510;
		}
		if (arg2 == 1) {
			local82 = local47 + this.aClass13_8.method463(arg8);
			local74 = arg6 + (arg5 - local82) / 2;
		} else if (arg2 == 2) {
			local82 = local47 + this.aClass13_8.method463(arg8);
			local74 = arg6 + arg5 - local82;
		}
		this.method4953(arg8, local45, null, local80, local74, arg7, arg1);
		if (arg12 != null) {
			if (local82 == -1) {
				local82 = local47 + this.aClass13_8.method463(arg8);
			}
			arg12[0] = local74;
			arg12[1] = local80 - this.aClass13_8.anInt517;
			arg12[2] = local82;
			arg12[3] = this.aClass13_8.anInt517 + this.aClass13_8.anInt510;
		}
		return local47;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method4938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static519.anInt8574 = 0;
		Static569.anInt9285 = arg0;
		Static446.anInt7728 = arg0;
		Static8.anInt144 = -1;
		Static394.anInt6809 = 0;
		Static445.anInt3933 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static174.anInt3159 = arg1;
		Static301.anInt5523 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4940(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static446.anInt7728 = Static446.anInt7728 & 0xFF000000 | Static64.method1427(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static446.anInt7728 = Static446.anInt7728 & 0xFF000000 | Static569.anInt9285 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static446.anInt7728 = Static64.method1427(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static446.anInt7728 = Static569.anInt9285;
			} else if (arg0.startsWith("str=")) {
				Static8.anInt144 = Static446.anInt7728 & 0xFF000000 | Static64.method1427(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static8.anInt144 = Static446.anInt7728 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static8.anInt144 = -1;
			} else if (arg0.startsWith("u=")) {
				Static445.anInt3933 = Static446.anInt7728 & 0xFF000000 | Static64.method1427(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static445.anInt3933 = Static446.anInt7728 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static445.anInt3933 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static301.anInt5523 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static301.anInt5523 = Static446.anInt7728 & 0xFF000000 | Static64.method1427(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static301.anInt5523 = Static446.anInt7728 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static301.anInt5523 = Static174.anInt3159;
			} else if (arg0.equals("br")) {
				this.method4938(Static569.anInt9285, Static174.anInt3159);
			}
		} catch (@Pc(187) Exception local187) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method4941(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method4938(arg0, -16777216);
		@Pc(22) int local22 = arg1.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) arg2 / 5.0D + (double) local27 / 2.0D) * 5.0D);
		}
		this.method4953(arg1, null, local25, arg4, arg3 - this.aClass13_8.method463(arg1) / 2, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method4942(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method4938(arg2, arg0);
			this.method4946(arg1 - this.aClass13_8.method463(arg3) / 2, null, null, arg3, 0, 0, arg4, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBLjava/lang/String;II)V")
	public final void method4943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method4938(arg0, arg1);
			this.method4946(arg4 - this.aClass13_8.method463(arg2), null, null, arg2, 0, 0, arg3, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IIIIZLjava/lang/String;I[Lclient!f;IILclient!ua;IIIII)I")
	public final int method4944(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class10[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class200 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg5 == null) {
			return 0;
		}
		this.method4938(arg4, arg14);
		if (arg0 == 0) {
			arg0 = this.aClass13_8.anInt522;
		}
		@Pc(54) int[] local54;
		if (arg0 + this.aClass13_8.anInt510 + this.aClass13_8.anInt517 > arg9 && arg0 + arg0 > arg9) {
			local54 = null;
		} else {
			local54 = new int[] { arg12 };
		}
		@Pc(67) int local67 = this.aClass13_8.method458(local54, Static485.aStringArray33, arg5, arg7);
		if (arg6 == -1) {
			arg6 = arg9 / arg0;
			if (arg6 <= 0) {
				arg6 = 1;
			}
		}
		if (arg6 > 0 && local67 >= arg6) {
			Static485.aStringArray33[arg6 - 1] = this.aClass13_8.method462(arg12, Static485.aStringArray33[arg6 - 1], arg7);
			local67 = arg6;
		}
		if (arg15 == 3 && local67 == 1) {
			arg15 = 1;
		}
		@Pc(125) int local125;
		@Pc(156) int local156;
		if (arg15 == 0) {
			local125 = arg8 + this.aClass13_8.anInt517;
		} else if (arg15 == 1) {
			local125 = this.aClass13_8.anInt517 + arg8 + (-((local67 - 1) * arg0) + (-this.aClass13_8.anInt517 + arg9 - this.aClass13_8.anInt510)) / 2;
		} else if (arg15 == 2) {
			local125 = arg9 + arg8 - this.aClass13_8.anInt510 - (local67 - 1) * arg0;
		} else {
			local156 = (arg9 - this.aClass13_8.anInt510 - this.aClass13_8.anInt517 - (local67 - 1) * arg0) / (local67 + 1);
			if (local156 < 0) {
				local156 = 0;
			}
			local125 = local156 + arg8 + this.aClass13_8.anInt517;
			arg0 += local156;
		}
		for (local156 = 0; local156 < local67; local156++) {
			if (arg13 == 0) {
				this.method4946(arg11, arg7, arg10, Static485.aStringArray33[local156], arg2, arg3, local125, arg1);
			} else if (arg13 == 1) {
				this.method4946(arg11 + (arg12 - this.aClass13_8.method463(Static485.aStringArray33[local156])) / 2, arg7, arg10, Static485.aStringArray33[local156], arg2, arg3, local125, arg1);
			} else if (arg13 == 2) {
				this.method4946(arg12 + arg11 - this.aClass13_8.method463(Static485.aStringArray33[local156]), arg7, arg10, Static485.aStringArray33[local156], arg2, arg3, local125, arg1);
			} else if (local67 - 1 == local156) {
				this.method4946(arg11, arg7, arg10, Static485.aStringArray33[local156], arg2, arg3, local125, arg1);
			} else {
				this.method4949(Static485.aStringArray33[local156], arg12);
				this.method4946(arg11, arg7, arg10, Static485.aStringArray33[local156], arg2, arg3, local125, arg1);
				Static519.anInt8574 = 0;
			}
			local125 += arg0;
		}
		return local67;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Lclient!f;Lclient!ua;Ljava/lang/String;III[I)V")
	private void method4946(@OriginalArg(1) int arg0, @OriginalArg(2) Class10[] arg1, @OriginalArg(3) Class200 arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		@Pc(11) int local11 = arg6 - this.aClass13_8.anInt522;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg3.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static366.method5367(arg3.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(51) String local51 = arg3.substring(local13 + 1, local20);
					local13 = -1;
					if (local51.equals("lt")) {
						local31 = '<';
					} else if (local51.equals("gt")) {
						local31 = '>';
					} else if (local51.equals("nbsp")) {
						local31 = ' ';
					} else if (local51.equals("shy")) {
						local31 = '\u00ad';
					} else if (local51.equals("times")) {
						local31 = '×';
					} else if (local51.equals("euro")) {
						local31 = '€';
					} else if (local51.equals("copy")) {
						local31 = '©';
					} else {
						if (!local51.equals("reg")) {
							if (local51.startsWith("img=")) {
								try {
									@Pc(103) int local103 = Static480.method6741(local51.substring(4));
									@Pc(107) Class10 local107 = arg1[local103];
									@Pc(116) int local116 = arg7 == null ? local107.ca() : arg7[local103];
									if ((Static446.anInt7728 & -16777216) == -16777216) {
										local107.V(arg0, this.aClass13_8.anInt522 + local11 - local116, 1, 0, 1);
									} else {
										local107.V(arg0, local11 + this.aClass13_8.anInt522 - local116, 0, Static446.anInt7728 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg0 += arg1[local103].A();
								} catch (@Pc(166) Exception local166) {
								}
							} else {
								this.method4940(local51);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass13_8.method455(local15, local31);
					}
					if (local31 == ' ') {
						if (Static519.anInt8574 > 0) {
							Static394.anInt6809 += Static519.anInt8574;
							arg0 += Static394.anInt6809 >> 8;
							Static394.anInt6809 &= 0xFF;
						}
					} else if (arg2 == null) {
						if ((Static301.anInt5523 & 0xFF000000) != 0) {
							this.OA(local31, arg0 + 1, local11 + 1, Static301.anInt5523, true);
						}
						this.OA(local31, arg0, local11, Static446.anInt7728, false);
					} else {
						if ((Static301.anInt5523 & 0xFF000000) != 0) {
							this.method4950(local31, arg0 + 1, local11 + 1, Static301.anInt5523, true, arg2, arg5, arg4);
						}
						this.method4950(local31, arg0, local11, Static446.anInt7728, false, arg2, arg5, arg4);
					}
					@Pc(301) int local301 = this.aClass13_8.method460(local31);
					if (Static8.anInt144 != -1) {
						this.aClass12_12.method6443(arg0, local11 + (int) ((double) this.aClass13_8.anInt522 * 0.7D), Static8.anInt144, local301);
					}
					if (Static445.anInt3933 != -1) {
						this.aClass12_12.method6443(arg0, local11 + this.aClass13_8.anInt522 + 1, Static445.anInt3933, local301);
					}
					local15 = local31;
					arg0 += local301;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!f;I[ILjava/lang/String;ILjava/util/Random;IIII)I")
	public final int method4947(@OriginalArg(0) Class10[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg4.setSeed((long) arg6);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method4938(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg2.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg4.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method4953(arg2, local43, null, arg3, arg5, arg1, arg0);
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method4948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method4938(arg4, -16777216);
		@Pc(21) double local21 = 7.0D - (double) arg2 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg5.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(43) int local43 = 0; local43 < local30; local43++) {
			local33[local43] = (int) (Math.sin((double) arg1 + (double) local43 / 1.5D) * local21);
		}
		this.method4953(arg5, null, local33, arg0, arg3 - this.aClass13_8.method463(arg5) / 2, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	private void method4949(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
			@Pc(21) char local21 = arg0.charAt(local15);
			if (local21 == '<') {
				local13 = true;
			} else if (local21 == '>') {
				local13 = false;
			} else if (!local13 && local21 == ' ') {
				local11++;
			}
		}
		if (local11 > 0) {
			Static519.anInt8574 = (arg1 - this.aClass13_8.method463(arg0) << 8) / local11;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	protected abstract void method4950(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class200 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method4951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method4938(arg4, -16777216);
		@Pc(20) int local20 = arg3.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(26) int[] local26 = new int[local20];
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			local23[local28] = (int) (Math.sin((double) arg1 / 5.0D + (double) local28 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method4953(arg3, local23, local26, arg2, arg0 - this.aClass13_8.method463(arg3) / 2, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[IILjava/lang/String;Lclient!ua;IIIIII[Lclient!f;III)I")
	public final int method4952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Class200 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class10[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method4944(arg5, arg2, arg6, arg7, arg10, arg3, 0, arg11, arg1, arg8, arg4, arg12, arg0, arg14, arg13, arg9);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;[I[III[I[Lclient!f;I)V")
	private void method4953(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) Class10[] arg6) {
		@Pc(11) int local11 = arg3 - this.aClass13_8.anInt522;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg0.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(41) char local41 = (char) (Static366.method5367(arg0.charAt(local30)) & 0xFF);
			if (local41 == '<') {
				local21 = local30;
			} else {
				@Pc(119) int local119;
				@Pc(131) int local131;
				if (local41 == '>' && local21 != -1) {
					@Pc(61) String local61 = arg0.substring(local21 + 1, local30);
					local21 = -1;
					if (local61.equals("lt")) {
						local41 = '<';
					} else if (local61.equals("gt")) {
						local41 = '>';
					} else if (local61.equals("nbsp")) {
						local41 = ' ';
					} else if (local61.equals("shy")) {
						local41 = '\u00ad';
					} else if (local61.equals("times")) {
						local41 = '×';
					} else if (local61.equals("euro")) {
						local41 = '€';
					} else if (local61.equals("copy")) {
						local41 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local119 = 0;
									} else {
										local119 = arg1[local25];
									}
									if (arg2 == null) {
										local131 = 0;
									} else {
										local131 = arg2[local25];
									}
									local25++;
									@Pc(144) int local144 = Static480.method6741(local61.substring(4));
									@Pc(148) Class10 local148 = arg6[local144];
									@Pc(157) int local157 = arg5 == null ? local148.ca() : arg5[local144];
									local148.V(local119 + arg4, -local157 + this.aClass13_8.anInt522 + local11 + local131, 1, 0, 1);
									arg4 += arg6[local144].A();
									local23 = -1;
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method4940(local61);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg4 += this.aClass13_8.method455(local23, local41);
					}
					@Pc(230) int local230;
					if (arg1 == null) {
						local230 = 0;
					} else {
						local230 = arg1[local25];
					}
					if (arg2 == null) {
						local119 = 0;
					} else {
						local119 = arg2[local25];
					}
					if (local41 != ' ') {
						if ((Static301.anInt5523 & 0xFF000000) != 0) {
							this.OA(local41, local230 + arg4 + 1, local119 + local11 - -1, Static301.anInt5523, true);
						}
						this.OA(local41, local230 + arg4, local119 + local11, Static446.anInt7728, false);
					} else if (Static519.anInt8574 > 0) {
						Static394.anInt6809 += Static519.anInt8574;
						arg4 += Static394.anInt6809 >> 8;
						Static394.anInt6809 &= 0xFF;
					}
					local25++;
					local131 = this.aClass13_8.method460(local41);
					if (Static8.anInt144 != -1) {
						this.aClass12_12.method6443(arg4, local11 + (int) ((double) this.aClass13_8.anInt522 * 0.7D), Static8.anInt144, local131);
					}
					if (Static445.anInt3933 != -1) {
						this.aClass12_12.method6443(arg4, local11 + this.aClass13_8.anInt522, Static445.anInt3933, local131);
					}
					local23 = local41;
					arg4 += local131;
				}
			}
		}
	}
}
