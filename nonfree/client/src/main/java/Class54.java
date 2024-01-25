import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class54 {

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!ho;")
	private final Class134 aClass134_13;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!r;")
	private final Class45 aClass45_14;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!r;Lclient!ho;)V")
	protected Class54(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class134 arg1) {
		this.aClass134_13 = arg1;
		this.aClass45_14 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lclient!f;B[ILjava/lang/String;III)V")
	public final void method7788(@OriginalArg(1) Class14[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 != null) {
			this.method7805(arg3, 0);
			this.method7799(arg2, 0, null, arg5, arg4, arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIB)V")
	public final void method7789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method7805(arg0, arg3);
			this.method7799(arg2, 0, null, arg1 - this.aClass134_13.method3348(arg2), arg4, null, 0, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([ILclient!ua;IIIIIIIIIIILjava/lang/String;I[Lclient!f;)I")
	public final int method7790(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) String arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class14[] arg14) {
		return this.method7797(arg5, arg2, arg1, arg8, arg4, arg14, arg6, arg7, arg12, arg9, arg11, arg10, 0, arg13, arg0, arg3);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IILjava/lang/String;BIIII[IILjava/util/Random;II[Lclient!f;I)I")
	public final int method7791(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Random arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class14[] arg12, @OriginalArg(14) int arg13) {
		if (arg2 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(20) int local20 = (arg9.nextInt() & 0x1F) + 192;
		this.method7805(arg3 & 0xFFFFFF | local20 << 24, local20 << 24 | arg1 & 0xFFFFFF);
		@Pc(40) int local40 = arg2.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(65) int local65 = arg11;
		@Pc(72) int local72 = arg5 + this.aClass134_13.anInt3765;
		@Pc(74) int local74 = -1;
		if (arg4 == 1) {
			local72 += (arg6 - this.aClass134_13.anInt3765 - this.aClass134_13.anInt3760) / 2;
		} else if (arg4 == 2) {
			local72 = arg5 + arg6 - this.aClass134_13.anInt3760;
		}
		if (arg8 == 1) {
			local74 = this.aClass134_13.method3348(arg2) + local45;
			local65 = arg11 + (arg13 - local74) / 2;
		} else if (arg8 == 2) {
			local74 = this.aClass134_13.method3348(arg2) + local45;
			local65 = arg11 + arg13 - local74;
		}
		this.method7801(local43, local72, null, local65, arg2, arg0, arg12);
		if (arg7 != null) {
			if (local74 == -1) {
				local74 = this.aClass134_13.method3348(arg2) + local45;
			}
			arg7[3] = this.aClass134_13.anInt3760 + this.aClass134_13.anInt3765;
			arg7[2] = local74;
			arg7[0] = local65;
			arg7[1] = local72 - this.aClass134_13.anInt3765;
		}
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V")
	public final void method7793(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method7805(arg3, -16777216);
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		@Pc(30) int[] local30 = new int[local24];
		for (@Pc(32) int local32 = 0; local32 < local24; local32++) {
			local27[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) local32 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method7801(local27, arg1, local30, arg2 - this.aClass134_13.method3348(arg0) / 2, arg0, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	protected abstract void method7794(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class81 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method7795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method7805(arg1, -16777216);
		@Pc(21) double local21 = 7.0D - (double) arg2 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg5.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (local21 * Math.sin((double) local35 / 1.5D + (double) arg3));
		}
		this.method7801(null, arg4, local33, arg0 - this.aClass134_13.method3348(arg5) / 2, arg5, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7796(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7805(arg3, arg1);
			this.method7799(arg0, 0, null, arg2, arg4, null, 0, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!ua;II[Lclient!f;IILjava/lang/String;IIIIII[II)I")
	public final int method7797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class14[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) String arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(15) int[] arg14, @OriginalArg(16) int arg15) {
		if (arg8 == null) {
			return 0;
		}
		this.method7805(arg11, arg4);
		if (arg9 == 0) {
			arg9 = this.aClass134_13.anInt3766;
		}
		@Pc(44) int[] local44;
		if (this.aClass134_13.anInt3760 + this.aClass134_13.anInt3765 + arg9 > arg7 && arg7 < arg9 + arg9) {
			local44 = null;
		} else {
			local44 = new int[] { arg0 };
		}
		@Pc(57) int local57 = this.aClass134_13.method3350(arg5, local44, arg8, Static136.aStringArray10);
		if (arg12 == -1) {
			arg12 = arg7 / arg9;
			if (arg12 <= 0) {
				arg12 = 1;
			}
		}
		if (arg12 > 0 && local57 >= arg12) {
			Static136.aStringArray10[arg12 - 1] = this.aClass134_13.method3345(arg0, arg5, Static136.aStringArray10[arg12 - 1]);
			local57 = arg12;
		}
		if (arg3 == 3 && local57 == 1) {
			arg3 = 1;
		}
		@Pc(161) int local161;
		@Pc(148) int local148;
		if (arg3 == 0) {
			local161 = arg6 + this.aClass134_13.anInt3765;
		} else if (arg3 == 1) {
			local161 = (arg7 - this.aClass134_13.anInt3765 - this.aClass134_13.anInt3760 - arg9 * (local57 - 1)) / 2 + arg6 + this.aClass134_13.anInt3765;
		} else if (arg3 == 2) {
			local161 = arg7 + arg6 - this.aClass134_13.anInt3760 - (local57 + -1) * arg9;
		} else {
			local148 = (arg7 - this.aClass134_13.anInt3765 - this.aClass134_13.anInt3760 - arg9 * (local57 - 1)) / (local57 - -1);
			if (local148 < 0) {
				local148 = 0;
			}
			local161 = local148 + arg6 + this.aClass134_13.anInt3765;
			arg9 += local148;
		}
		for (local148 = 0; local148 < local57; local148++) {
			if (arg15 == 0) {
				this.method7799(Static136.aStringArray10[local148], arg13, arg2, arg10, local161, arg14, arg1, arg5);
			} else if (arg15 == 1) {
				this.method7799(Static136.aStringArray10[local148], arg13, arg2, (arg0 - this.aClass134_13.method3348(Static136.aStringArray10[local148])) / 2 + arg10, local161, arg14, arg1, arg5);
			} else if (arg15 == 2) {
				this.method7799(Static136.aStringArray10[local148], arg13, arg2, arg0 + arg10 - this.aClass134_13.method3348(Static136.aStringArray10[local148]), local161, arg14, arg1, arg5);
			} else if (local148 == local57 - 1) {
				this.method7799(Static136.aStringArray10[local148], arg13, arg2, arg10, local161, arg14, arg1, arg5);
			} else {
				this.method7798(Static136.aStringArray10[local148], arg0);
				this.method7799(Static136.aStringArray10[local148], arg13, arg2, arg10, local161, arg14, arg1, arg5);
				Static52.anInt997 = 0;
			}
			local161 += arg9;
		}
		return local57;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	private void method7798(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; arg0.length() > local19; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '<') {
				local17 = true;
			} else if (local25 == '>') {
				local17 = false;
			} else if (!local17 && local25 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static52.anInt997 = (arg1 - this.aClass134_13.method3348(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;ILclient!ua;II[III[Lclient!f;)V")
	private void method7799(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class14[] arg7) {
		@Pc(11) int local11 = arg4 - this.aClass134_13.anInt3766;
		@Pc(13) int local13 = -1;
		@Pc(31) int local31 = -1;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(47) char local47 = (char) (Static253.method3901(arg0.charAt(local36)) & 0xFF);
			if (local47 == '<') {
				local13 = local36;
			} else {
				if (local47 == '>' && local13 != -1) {
					@Pc(71) String local71 = arg0.substring(local13 + 1, local36);
					local13 = -1;
					if (local71.equals("lt")) {
						local47 = '<';
					} else if (local71.equals("gt")) {
						local47 = '>';
					} else if (local71.equals("nbsp")) {
						local47 = ' ';
					} else if (local71.equals("shy")) {
						local47 = '\u00ad';
					} else if (local71.equals("times")) {
						local47 = '×';
					} else if (local71.equals("euro")) {
						local47 = '€';
					} else if (local71.equals("copy")) {
						local47 = '©';
					} else {
						if (!local71.equals("reg")) {
							if (local71.startsWith("img=")) {
								try {
									@Pc(133) int local133 = Static213.method6524(local71.substring(4));
									@Pc(137) Class14 local137 = arg7[local133];
									@Pc(146) int local146 = arg5 == null ? local137.ca() : arg5[local133];
									if ((Static534.anInt8566 & 0xFF000000) == -16777216) {
										local137.V(arg3, local11 + this.aClass134_13.anInt3766 - local146, 1, 0, 1);
									} else {
										local137.V(arg3, local11 + this.aClass134_13.anInt3766 - local146, 0, Static534.anInt8566 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local31 = -1;
									arg3 += arg7[local133].A();
								} catch (@Pc(198) Exception local198) {
								}
							} else {
								this.method7800(local71);
							}
							continue;
						}
						local47 = '®';
					}
				}
				if (local13 == -1) {
					if (local31 != -1) {
						arg3 += this.aClass134_13.method3354(local31, local47);
					}
					if (local47 == ' ') {
						if (Static52.anInt997 > 0) {
							Static529.anInt8474 += Static52.anInt997;
							arg3 += Static529.anInt8474 >> 8;
							Static529.anInt8474 &= 0xFF;
						}
					} else if (arg2 == null) {
						if ((Static399.anInt6952 & 0xFF000000) != 0) {
							this.OA(local47, arg3 + 1, local11 + 1, Static399.anInt6952, true);
						}
						this.OA(local47, arg3, local11, Static534.anInt8566, false);
					} else {
						if ((Static399.anInt6952 & 0xFF000000) != 0) {
							this.method7794(local47, arg3 + 1, local11 - -1, Static399.anInt6952, true, arg2, arg1, arg6);
						}
						this.method7794(local47, arg3, local11, Static534.anInt8566, false, arg2, arg1, arg6);
					}
					@Pc(320) int local320 = this.aClass134_13.method3353(local47);
					if (Static592.anInt9689 != -1) {
						this.aClass45_14.method7427(arg3, local11 + (int) ((double) this.aClass134_13.anInt3766 * 0.7D), local320, Static592.anInt9689);
					}
					if (Static191.anInt3633 != -1) {
						this.aClass45_14.method7427(arg3, local11 + this.aClass134_13.anInt3766 + 1, local320, Static191.anInt3633);
					}
					arg3 += local320;
					local31 = local47;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method7800(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static534.anInt8566 = Static534.anInt8566 & 0xFF000000 | Static561.method2427(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static534.anInt8566 = Static82.anInt8696 & 0xFFFFFF | Static534.anInt8566 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static534.anInt8566 = Static561.method2427(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static534.anInt8566 = Static82.anInt8696;
			} else if (arg0.startsWith("str=")) {
				Static592.anInt9689 = Static534.anInt8566 & 0xFF000000 | Static561.method2427(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static592.anInt9689 = Static534.anInt8566 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static592.anInt9689 = -1;
			} else if (arg0.startsWith("u=")) {
				Static191.anInt3633 = Static534.anInt8566 & 0xFF000000 | Static561.method2427(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static191.anInt3633 = Static534.anInt8566 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static191.anInt3633 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static399.anInt6952 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static399.anInt6952 = Static534.anInt8566 & 0xFF000000 | Static561.method2427(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static399.anInt6952 = Static534.anInt8566 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static399.anInt6952 = Static534.anInt8565;
			} else if (arg0.equals("br")) {
				this.method7805(Static82.anInt8696, Static534.anInt8565);
			}
		} catch (@Pc(183) Exception local183) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([II[IILjava/lang/String;[IZ[Lclient!f;)V")
	private void method7801(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) Class14[] arg6) {
		@Pc(11) int local11 = arg1 - this.aClass134_13.anInt3766;
		@Pc(13) int local13 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg4.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(41) char local41 = (char) (Static253.method3901(arg4.charAt(local30)) & 0xFF);
			if (local41 == '<') {
				local13 = local30;
			} else {
				@Pc(129) int local129;
				@Pc(137) int local137;
				if (local41 == '>' && local13 != -1) {
					@Pc(63) String local63 = arg4.substring(local13 + 1, local30);
					local13 = -1;
					if (local63.equals("lt")) {
						local41 = '<';
					} else if (local63.equals("gt")) {
						local41 = '>';
					} else if (local63.equals("nbsp")) {
						local41 = ' ';
					} else if (local63.equals("shy")) {
						local41 = '\u00ad';
					} else if (local63.equals("times")) {
						local41 = '×';
					} else if (local63.equals("euro")) {
						local41 = '€';
					} else if (local63.equals("copy")) {
						local41 = '©';
					} else {
						if (!local63.equals("reg")) {
							if (local63.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local129 = 0;
									} else {
										local129 = arg0[local25];
									}
									if (arg2 == null) {
										local137 = 0;
									} else {
										local137 = arg2[local25];
									}
									local25++;
									@Pc(150) int local150 = Static213.method6524(local63.substring(4));
									@Pc(154) Class14 local154 = arg6[local150];
									@Pc(163) int local163 = arg5 == null ? local154.ca() : arg5[local150];
									local154.V(arg3 + local129, local11 - (-this.aClass134_13.anInt3766 - -local163) - -local137, 1, 0, 1);
									local23 = -1;
									arg3 += arg6[local150].A();
								} catch (@Pc(194) Exception local194) {
								}
							} else {
								this.method7800(local63);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local13 == -1) {
					if (local23 != -1) {
						arg3 += this.aClass134_13.method3354(local23, local41);
					}
					@Pc(233) int local233;
					if (arg0 == null) {
						local233 = 0;
					} else {
						local233 = arg0[local25];
					}
					if (arg2 == null) {
						local129 = 0;
					} else {
						local129 = arg2[local25];
					}
					if (local41 != ' ') {
						if ((Static399.anInt6952 & 0xFF000000) != 0) {
							this.OA(local41, arg3 + local233 + 1, local129 + 1 + local11, Static399.anInt6952, true);
						}
						this.OA(local41, local233 + arg3, local11 - -local129, Static534.anInt8566, false);
					} else if (Static52.anInt997 > 0) {
						Static529.anInt8474 += Static52.anInt997;
						arg3 += Static529.anInt8474 >> 8;
						Static529.anInt8474 &= 0xFF;
					}
					local25++;
					local137 = this.aClass134_13.method3353(local41);
					if (Static592.anInt9689 != -1) {
						this.aClass45_14.method7427(arg3, local11 + (int) ((double) this.aClass134_13.anInt3766 * 0.7D), local137, Static592.anInt9689);
					}
					if (Static191.anInt3633 != -1) {
						this.aClass45_14.method7427(arg3, this.aClass134_13.anInt3766 + local11, local137, Static191.anInt3633);
					}
					local23 = local41;
					arg3 += local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;IILjava/lang/String;BII[Lclient!f;I[I)I")
	public final int method7802(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class14[] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int[] arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg0.setSeed((long) arg5);
		@Pc(25) int local25 = (arg0.nextInt() & 0x1F) + 192;
		this.method7805(local25 << 24 | 0xFFFFFF, (local25 | 0x0) << 24);
		@Pc(45) int local45 = arg2.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg0.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method7801(local48, arg3, null, arg1, arg2, arg6, arg4);
		return local50;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7803(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7805(arg1, arg2);
			this.method7799(arg0, 0, null, arg4 - this.aClass134_13.method3348(arg0) / 2, arg3, null, 0, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method7805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static592.anInt9689 = -1;
		Static191.anInt3633 = -1;
		Static82.anInt8696 = arg0;
		Static534.anInt8566 = arg0;
		Static52.anInt997 = 0;
		Static529.anInt8474 = 0;
		Static534.anInt8565 = arg1;
		Static399.anInt6952 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method7806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method7805(arg0, -16777216);
		@Pc(23) int local23 = arg4.length();
		@Pc(26) int[] local26 = new int[local23];
		for (@Pc(28) int local28 = 0; local28 < local23; local28++) {
			local26[local28] = (int) (Math.sin((double) local28 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method7801(null, arg1, local26, arg2 - this.aClass134_13.method3348(arg4) / 2, arg4, null, null);
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
