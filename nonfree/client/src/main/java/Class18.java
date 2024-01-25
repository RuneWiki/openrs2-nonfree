import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public abstract class Class18 {

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "Lclient!ea;")
	private final Class55 aClass55_10;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Lclient!ci;")
	private final Class36 aClass36_7;

	static {
		new Class85("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!ea;Lclient!ci;)V")
	protected Class18(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class36 arg1) {
		this.aClass55_10 = arg0;
		this.aClass36_7 = arg1;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;IIIIILjava/util/Random;[Lclient!wn;I[II[IIB)I")
	public final int method4170(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Random arg7, @OriginalArg(8) Class95[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13) {
		if (arg1 == null) {
			return 0;
		}
		arg7.setSeed((long) arg5);
		@Pc(33) int local33 = (arg7.nextInt() & 0x1F) + 192;
		this.method4171(arg4 & 0xFFFFFF | local33 << 24, arg6 & 0xFFFFFF | local33 << 24);
		@Pc(53) int local53 = arg1.length();
		@Pc(56) int[] local56 = new int[local53];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local53; local60++) {
			local56[local60] = local58;
			if ((arg7.nextInt() & 0x3) == 0) {
				local58++;
			}
		}
		@Pc(82) int local82 = arg0;
		@Pc(88) int local88 = this.aClass36_7.anInt728 + arg9;
		@Pc(90) int local90 = -1;
		if (arg2 == 1) {
			local88 += (arg13 - this.aClass36_7.anInt737 - this.aClass36_7.anInt728) / 2;
		} else if (arg2 == 2) {
			local88 = arg13 + arg9 - this.aClass36_7.anInt737;
		}
		if (arg11 == 1) {
			local90 = this.aClass36_7.method640(arg1) + local58;
			local82 = arg0 + (arg3 - local90) / 2;
		} else if (arg11 == 2) {
			local90 = this.aClass36_7.method640(arg1) + local58;
			local82 = arg0 + arg3 - local90;
		}
		this.method4180(local82, arg1, null, local56, arg12, local88, arg8);
		if (arg10 != null) {
			if (local90 == -1) {
				local90 = local58 + this.aClass36_7.method640(arg1);
			}
			arg10[1] = local88 - this.aClass36_7.anInt728;
			arg10[2] = local90;
			arg10[3] = this.aClass36_7.anInt737 + this.aClass36_7.anInt728;
			arg10[0] = local82;
		}
		return local58;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
	private void method4171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static37.anInt663 = arg1;
		Static299.anInt6807 = arg1;
		Static136.anInt2608 = -1;
		Static74.anInt1432 = -1;
		Static240.anInt4827 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static166.anInt3325 = 0;
		Static52.anInt970 = arg0;
		Static114.anInt2106 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 != null) {
			this.method4171(arg0, arg2);
			this.method4181(arg4, null, 0, arg1, 0, arg3 - this.aClass36_7.method640(arg1) / 2, null, null);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([ILjava/lang/String;BI[Lclient!wn;III)V")
	public final void method4173(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(4) Class95[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 != null) {
			this.method4171(0, arg3);
			this.method4181(arg4, arg2, 0, arg1, 0, arg5, arg0, null);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public final void method4174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method4171(arg3, arg1);
			this.method4181(arg2, null, 0, arg4, 0, arg0, null, null);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBIIILjava/lang/String;I)V")
	public final void method4175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method4171(-16777216, arg2);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			local19[local28] = (int) (Math.sin((double) local28 / 5.0D + (double) arg1 / 5.0D) * 5.0D);
			local22[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method4180(arg0 - this.aClass36_7.method640(arg4) / 2, arg4, local22, local19, null, arg3, null);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([Lclient!wn;IIII[IILjava/lang/String;ILjava/util/Random;)I")
	public final int method4176(@OriginalArg(0) Class95[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5, @OriginalArg(9) Random arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg6.setSeed((long) arg4);
		@Pc(20) int local20 = (arg6.nextInt() & 0x1F) + 192;
		this.method4171((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(42) int local42 = arg5.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < local42; local49++) {
			local45[local49] = local47;
			if ((arg6.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		this.method4180(arg1, arg5, null, local45, arg3, arg2, arg0);
		return local47;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method4177(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(13) int local13 = 0; local13 < arg1.length(); local13++) {
			@Pc(18) char local18 = arg1.charAt(local13);
			if (local18 == '<') {
				local7 = true;
			} else if (local18 == '>') {
				local7 = false;
			} else if (!local7 && local18 == ' ') {
				local5++;
			}
		}
		if (local5 > 0) {
			Static240.anInt4827 = (arg0 - this.aClass36_7.method640(arg1) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILjava/lang/String;IIII[IIBLclient!de;[Lclient!wn;IIII)I")
	public final int method4178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class46 arg9, @OriginalArg(11) Class95[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg2 == null) {
			return 0;
		}
		this.method4171(arg0, arg3);
		if (arg4 == 0) {
			arg4 = this.aClass36_7.anInt729;
		}
		@Pc(57) int[] local57;
		if (arg5 < this.aClass36_7.anInt728 + this.aClass36_7.anInt737 + arg4 && arg4 + arg4 > arg5) {
			local57 = null;
		} else {
			local57 = new int[] { arg14 };
		}
		@Pc(69) int local69 = this.aClass36_7.method644(arg10, Static152.aStringArray58, arg2, local57);
		if (arg1 == 3 && local69 == 1) {
			arg1 = 1;
		}
		@Pc(110) int local110;
		@Pc(134) int local134;
		if (arg1 == 0) {
			local110 = this.aClass36_7.anInt728 + arg11;
		} else if (arg1 == 1) {
			local110 = (arg5 - arg4 * (local69 - 1) - this.aClass36_7.anInt728 - this.aClass36_7.anInt737) / 2 + this.aClass36_7.anInt728 + arg11;
		} else if (arg1 == 2) {
			local110 = arg5 + arg11 - this.aClass36_7.anInt737 - (local69 + -1) * arg4;
		} else {
			local134 = (arg5 - this.aClass36_7.anInt737 - this.aClass36_7.anInt728 - arg4 * (local69 - 1)) / (local69 + 1);
			if (local134 < 0) {
				local134 = 0;
			}
			local110 = arg11 + this.aClass36_7.anInt728 + local134;
			arg4 += local134;
		}
		for (local134 = 0; local134 < local69; local134++) {
			if (arg6 == 0) {
				this.method4181(local110, arg10, arg12, Static152.aStringArray58[local134], arg13, arg8, arg7, arg9);
			} else if (arg6 == 1) {
				this.method4181(local110, arg10, arg12, Static152.aStringArray58[local134], arg13, (arg14 - this.aClass36_7.method640(Static152.aStringArray58[local134])) / 2 + arg8, arg7, arg9);
			} else if (arg6 == 2) {
				this.method4181(local110, arg10, arg12, Static152.aStringArray58[local134], arg13, arg14 + arg8 - this.aClass36_7.method640(Static152.aStringArray58[local134]), arg7, arg9);
			} else if (local69 - 1 == local134) {
				this.method4181(local110, arg10, arg12, Static152.aStringArray58[local134], arg13, arg8, arg7, arg9);
			} else {
				this.method4177(arg14, Static152.aStringArray58[local134]);
				this.method4181(local110, arg10, arg12, Static152.aStringArray58[local134], arg13, arg8, arg7, arg9);
				Static240.anInt4827 = 0;
			}
			local110 += arg4;
		}
		return local69;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(CIIIZLclient!de;II)V")
	protected abstract void method4179(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class46 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;I[I[I[II[Lclient!wn;)V")
	private void method4180(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class95[] arg6) {
		@Pc(15) int local15 = arg5 - this.aClass36_7.anInt729;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) char local37 = (char) (Static338.method6009(arg1.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local17 = local26;
			} else {
				@Pc(135) int local135;
				@Pc(145) int local145;
				if (local37 == '>' && local17 != -1) {
					@Pc(61) String local61 = arg1.substring(local17 + 1, local26);
					local17 = -1;
					if (local61.equals("lt")) {
						local37 = '<';
					} else if (local61.equals("gt")) {
						local37 = '>';
					} else if (local61.equals("nbsp")) {
						local37 = ' ';
					} else if (local61.equals("shy")) {
						local37 = '\u00ad';
					} else if (local61.equals("times")) {
						local37 = '×';
					} else if (local61.equals("euro")) {
						local37 = '€';
					} else if (local61.equals("copy")) {
						local37 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local135 = 0;
									} else {
										local135 = arg3[local21];
									}
									if (arg2 == null) {
										local145 = 0;
									} else {
										local145 = arg2[local21];
									}
									local21++;
									@Pc(158) int local158 = Static36.method580(local61.substring(4));
									@Pc(162) Class95 local162 = arg6[local158];
									@Pc(171) int local171 = arg4 == null ? local162.method5494() : arg4[local158];
									local162.method5492(local135 + arg0, local145 + -local171 + local15 + this.aClass36_7.anInt729, 0, 0);
									arg0 += arg6[local158].method5507();
									local19 = -1;
								} catch (@Pc(200) Exception local200) {
								}
							} else {
								this.method4189(local61);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg0 += this.aClass36_7.method648(local37, local19);
					}
					@Pc(230) int local230;
					if (arg3 == null) {
						local230 = 0;
					} else {
						local230 = arg3[local21];
					}
					if (arg2 == null) {
						local135 = 0;
					} else {
						local135 = arg2[local21];
					}
					local21++;
					if (local37 != ' ') {
						if ((Static114.anInt2106 & 0xFF000000) != 0) {
							this.method4190(local37, local230 + arg0 + 1, local15 + 1 - -local135, Static114.anInt2106, true);
						}
						this.method4190(local37, local230 + arg0, local135 + local15, Static299.anInt6807, false);
					} else if (Static240.anInt4827 > 0) {
						Static166.anInt3325 += Static240.anInt4827;
						arg0 += Static166.anInt3325 >> 8;
						Static166.anInt3325 &= 0xFF;
					}
					local145 = this.aClass36_7.method649(local37);
					if (Static136.anInt2608 != -1) {
						this.aClass55_10.method5243(local145, (int) ((double) this.aClass36_7.anInt729 * 0.7D) + local15, Static136.anInt2608, arg0);
					}
					if (Static74.anInt1432 != -1) {
						this.aClass55_10.method5243(local145, local15 + this.aClass36_7.anInt729, Static74.anInt1432, arg0);
					}
					arg0 += local145;
					local19 = local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[Lclient!wn;ILjava/lang/String;II[ILclient!de;)V")
	private void method4181(@OriginalArg(1) int arg0, @OriginalArg(2) Class95[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Class46 arg7) {
		@Pc(15) int local15 = arg0 - this.aClass36_7.anInt729;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(22) int local22 = arg3.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(34) char local34 = (char) (Static338.method6009(arg3.charAt(local24)) & 0xFF);
			if (local34 == '<') {
				local17 = local24;
			} else {
				if (local34 == '>' && local17 != -1) {
					@Pc(57) String local57 = arg3.substring(local17 + 1, local24);
					local17 = -1;
					if (local57.equals("lt")) {
						local34 = '<';
					} else if (local57.equals("gt")) {
						local34 = '>';
					} else if (local57.equals("nbsp")) {
						local34 = ' ';
					} else if (local57.equals("shy")) {
						local34 = '\u00ad';
					} else if (local57.equals("times")) {
						local34 = '×';
					} else if (local57.equals("euro")) {
						local34 = '€';
					} else if (local57.equals("copy")) {
						local34 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									@Pc(115) int local115 = Static36.method580(local57.substring(4));
									@Pc(119) Class95 local119 = arg1[local115];
									@Pc(128) int local128 = arg6 == null ? local119.method5494() : arg6[local115];
									if ((Static299.anInt6807 & 0xFF000000) == -16777216) {
										local119.method5492(arg5, local15 + this.aClass36_7.anInt729 - local128, 0, 0);
									} else {
										local119.method5492(arg5, local15 + this.aClass36_7.anInt729 - local128, 1, Static299.anInt6807 & 0xFF000000 | 0xFFFFFF);
									}
									arg5 += arg1[local115].method5507();
									local19 = -1;
								} catch (@Pc(180) Exception local180) {
								}
							} else {
								this.method4189(local57);
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg5 += this.aClass36_7.method648(local34, local19);
					}
					if (local34 == ' ') {
						if (Static240.anInt4827 > 0) {
							Static166.anInt3325 += Static240.anInt4827;
							arg5 += Static166.anInt3325 >> 8;
							Static166.anInt3325 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static114.anInt2106 & 0xFF000000) != 0) {
							this.method4190(local34, arg5 + 1, local15 + 1, Static114.anInt2106, true);
						}
						this.method4190(local34, arg5, local15, Static299.anInt6807, false);
					} else {
						if ((Static114.anInt2106 & 0xFF000000) != 0) {
							this.method4179(local34, arg5 + 1, local15 + 1, Static114.anInt2106, true, arg7, arg4, arg2);
						}
						this.method4179(local34, arg5, local15, Static299.anInt6807, false, arg7, arg4, arg2);
					}
					@Pc(298) int local298 = this.aClass36_7.method649(local34);
					if (Static136.anInt2608 != -1) {
						this.aClass55_10.method5243(local298, local15 + (int) ((double) this.aClass36_7.anInt729 * 0.7D), Static136.anInt2608, arg5);
					}
					if (Static74.anInt1432 != -1) {
						this.aClass55_10.method5243(local298, this.aClass36_7.anInt729 + local15 + 1, Static74.anInt1432, arg5);
					}
					arg5 += local298;
					local19 = local34;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method4182(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method4171(-16777216, arg2);
		@Pc(18) int local18 = arg1.length();
		@Pc(21) int[] local21 = new int[local18];
		for (@Pc(23) int local23 = 0; local23 < local18; local23++) {
			local21[local23] = (int) (Math.sin((double) local23 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method4180(arg4 - this.aClass36_7.method640(arg1) / 2, arg1, local21, null, null, arg0, null);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method4184(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 != null) {
			this.method4171(-1, arg3);
			this.method4181(arg0, null, 0, arg1, 0, arg2 - this.aClass36_7.method640(arg1), null, null);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBILjava/lang/String;III)V")
	public final void method4186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method4171(-16777216, arg0);
		@Pc(21) double local21 = 7.0D - (double) arg5 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(36) int local36 = arg2.length();
		@Pc(39) int[] local39 = new int[local36];
		for (@Pc(41) int local41 = 0; local41 < local36; local41++) {
			local39[local41] = (int) (Math.sin((double) arg3 + (double) local41 / 1.5D) * local21);
		}
		this.method4180(arg4 - this.aClass36_7.method640(arg2) / 2, arg2, local39, null, null, arg1, null);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4189(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static299.anInt6807 = Static299.anInt6807 & 0xFF000000 | Static221.method4021(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static299.anInt6807 = Static299.anInt6807 & 0xFF000000 | Static37.anInt663 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static299.anInt6807 = Static221.method4021(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static299.anInt6807 = Static37.anInt663;
			} else if (arg0.startsWith("str=")) {
				Static136.anInt2608 = Static221.method4021(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static136.anInt2608 = -8388608;
			} else if (arg0.equals("/str")) {
				Static136.anInt2608 = -1;
			} else if (arg0.startsWith("u=")) {
				Static74.anInt1432 = Static221.method4021(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static74.anInt1432 = -16777216;
			} else if (arg0.equals("/u")) {
				Static74.anInt1432 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static114.anInt2106 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static114.anInt2106 = Static221.method4021(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static114.anInt2106 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static114.anInt2106 = Static52.anInt970;
				return;
			} else if (arg0.equals("br")) {
				this.method4171(Static52.anInt970, Static37.anInt663);
				return;
			}
		} catch (@Pc(161) Exception local161) {
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method4190(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
