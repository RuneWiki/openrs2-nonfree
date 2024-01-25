import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class68 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Lclient!ha;")
	private final Class145 aClass145_13;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!pga;")
	private final Class289 aClass289_16;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!pga;)V")
	protected Class68(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class289 arg1) {
		this.aClass145_13 = arg0;
		this.aClass289_16 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method7882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7886(arg4, arg1);
			this.method7891(0, arg0, arg3, (Class43[]) null, (int[]) null, 0, (Class1) null, arg2);
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method7883(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method7886(-16777216, arg0);
		@Pc(17) int local17 = arg2.length();
		@Pc(20) int[] local20 = new int[local17];
		@Pc(23) int[] local23 = new int[local17];
		for (@Pc(25) int local25 = 0; local25 < local17; local25++) {
			local20[local25] = (int) (Math.sin((double) local25 / 5.0D + (double) arg1 / 5.0D) * 5.0D);
			local23[local25] = (int) (Math.sin((double) arg1 / 5.0D + (double) local25 / 3.0D) * 5.0D);
		}
		this.method7897(local20, local23, arg2, (Class43[]) null, (int[]) null, arg4, arg3 - this.aClass289_16.method6935(arg2) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBLjava/lang/String;III)V")
	public final void method7884(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7886(arg4, arg2);
			this.method7891(0, arg0 - this.aClass289_16.method6935(arg1), arg3, (Class43[]) null, (int[]) null, 0, (Class1) null, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	private void method7886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static515.anInt8192 = arg1;
		Static163.anInt2769 = arg1;
		Static528.anInt8385 = -1;
		Static7.anInt83 = -1;
		Static51.anInt853 = 0;
		Static359.anInt5736 = 0;
		Static206.anInt3339 = arg0;
		Static402.anInt6610 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method7887(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static163.anInt2769 = Static163.anInt2769 & 0xFF000000 | Static663.method8152(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static163.anInt2769 = Static163.anInt2769 & 0xFF000000 | Static515.anInt8192 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static163.anInt2769 = Static663.method8152(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static163.anInt2769 = Static515.anInt8192;
			} else if (arg0.startsWith("str=")) {
				Static7.anInt83 = Static163.anInt2769 & 0xFF000000 | Static663.method8152(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static7.anInt83 = Static163.anInt2769 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static7.anInt83 = -1;
			} else if (arg0.startsWith("u=")) {
				Static528.anInt8385 = Static163.anInt2769 & 0xFF000000 | Static663.method8152(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static528.anInt8385 = Static163.anInt2769 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static528.anInt8385 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static402.anInt6610 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static402.anInt6610 = Static163.anInt2769 & 0xFF000000 | Static663.method8152(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static402.anInt6610 = Static163.anInt2769 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static402.anInt6610 = Static206.anInt3339;
				return;
			} else if (arg0.equals("br")) {
				this.method7886(Static206.anInt3339, Static515.anInt8192);
				return;
			}
		} catch (@Pc(233) Exception local233) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7888(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7886(arg2, arg4);
			this.method7891(0, arg1 - this.aClass289_16.method6935(arg0) / 2, arg3, (Class43[]) null, (int[]) null, 0, (Class1) null, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method7889(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method7886(-16777216, arg2);
		@Pc(17) int local17 = arg3.length();
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			local20[local22] = (int) (Math.sin((double) local22 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method7897((int[]) null, local20, arg3, (Class43[]) null, (int[]) null, arg0, arg1 - this.aClass289_16.method6935(arg3) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[Lclient!ug;[IIZLclient!aa;Ljava/lang/String;)V")
	private void method7891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class43[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) String arg7) {
		@Pc(11) int local11 = arg2 - this.aClass289_16.anInt7755;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg7.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(33) char local33 = (char) (Static575.method7988(arg7.charAt(local20)) & 0xFF);
			if (local33 == '<') {
				local13 = local20;
			} else {
				if (local33 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg7.substring(local13 + 1, local20);
					local13 = -1;
					if (local60.equals("lt")) {
						local33 = '<';
					} else if (local60.equals("gt")) {
						local33 = '>';
					} else if (local60.equals("nbsp")) {
						local33 = ' ';
					} else if (local60.equals("shy")) {
						local33 = '\u00ad';
					} else if (local60.equals("times")) {
						local33 = '×';
					} else if (local60.equals("euro")) {
						local33 = '€';
					} else if (local60.equals("copy")) {
						local33 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									@Pc(150) int local150 = Static171.method2545(local60.substring(4));
									@Pc(154) Class43 local154 = arg3[local150];
									@Pc(164) int local164 = arg4 == null ? local154.method9600() : arg4[local150];
									if ((Static163.anInt2769 & 0xFF000000) == -16777216) {
										local154.method9583(arg1, this.aClass289_16.anInt7755 + local11 - local164, 1, 0, 1);
									} else {
										local154.method9583(arg1, this.aClass289_16.anInt7755 + local11 - local164, 0, Static163.anInt2769 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg1 += arg3[local150].method9587();
								} catch (@Pc(219) Exception local219) {
								}
							} else {
								this.method7887(local60);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass289_16.method6938(local33, local15);
					}
					if (local33 == ' ') {
						if (Static51.anInt853 > 0) {
							Static359.anInt5736 += Static51.anInt853;
							arg1 += Static359.anInt5736 >> 8;
							Static359.anInt5736 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static402.anInt6610 & 0xFF000000) != 0) {
							this.fa(local33, arg1 + 1, local11 + 1, Static402.anInt6610, true);
						}
						this.fa(local33, arg1, local11, Static163.anInt2769, false);
					} else {
						if ((Static402.anInt6610 & 0xFF000000) != 0) {
							this.method7894(local33, arg1 + 1, local11 + 1, Static402.anInt6610, true, arg6, arg0, arg5);
						}
						this.method7894(local33, arg1, local11, Static163.anInt2769, false, arg6, arg0, arg5);
					}
					@Pc(357) int local357 = this.aClass289_16.method6941(local33);
					if (Static7.anInt83 != -1) {
						this.aClass145_13.method9641((int) ((double) this.aClass289_16.anInt7755 * 0.7D) + local11, Static7.anInt83, local357, arg1);
					}
					if (Static528.anInt8385 != -1) {
						this.aClass145_13.method9641(this.aClass289_16.anInt7755 + local11 + 1, Static528.anInt8385, local357, arg1);
					}
					arg1 += local357;
					local15 = local33;
				}
			}
		}
		if (false) {
			Static101.aClass100_12 = null;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/util/Random;ILjava/lang/String;IIII[IB[Lclient!ug;)I")
	public final int method7892(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(9) Class43[] arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg0.setSeed((long) arg4);
		@Pc(29) int local29 = (arg0.nextInt() & 0x1F) + 192;
		this.method7886((local29 | 0x0) << 24, local29 << 24 | 0xFFFFFF);
		@Pc(49) int local49 = arg2.length();
		@Pc(52) int[] local52 = new int[local49];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local52[local56] = local54;
			if ((arg0.nextInt() & 0x3) == 0) {
				local54++;
			}
		}
		this.method7897(local52, (int[]) null, arg2, arg6, arg5, arg1, arg3);
		return local54;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public final void method7893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method7886(-16777216, arg5);
		@Pc(21) double local21 = 7.0D - (double) arg4 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg2.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (local21 * Math.sin((double) local35 / 1.5D + (double) arg0));
		}
		this.method7897((int[]) null, local33, arg2, (Class43[]) null, (int[]) null, arg1, arg3 - this.aClass289_16.method6935(arg2) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method7894(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;[Lclient!ug;[II)V")
	public final void method7895(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) Class43[] arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg2 != null) {
			this.method7886(0, arg0);
			this.method7891(0, arg5, arg1, arg3, arg4, 0, (Class1) null, arg2);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method7896(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg1.length() > local11; local11++) {
			@Pc(19) char local19 = arg1.charAt(local11);
			if (local19 == '<') {
				local9 = true;
			} else if (local19 == '>') {
				local9 = false;
			} else if (!local9 && local19 == ' ') {
				local7++;
			}
		}
		if (arg0 != 60) {
			this.method7896(73, (String) null, 127);
		}
		if (local7 > 0) {
			Static51.anInt853 = (arg2 - this.aClass289_16.method6935(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B[I[ILjava/lang/String;[Lclient!ug;[III)V")
	private void method7897(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class43[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg5 - this.aClass289_16.anInt7755;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(27) int local27 = arg2.length();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(40) char local40 = (char) (Static575.method7988(arg2.charAt(local29)) & 0xFF);
			if (local40 == '<') {
				local20 = local29;
			} else {
				@Pc(171) int local171;
				@Pc(179) int local179;
				if (local40 == '>' && local20 != -1) {
					@Pc(69) String local69 = arg2.substring(local20 + 1, local29);
					local20 = -1;
					if (local69.equals("lt")) {
						local40 = '<';
					} else if (local69.equals("gt")) {
						local40 = '>';
					} else if (local69.equals("nbsp")) {
						local40 = ' ';
					} else if (local69.equals("shy")) {
						local40 = '\u00ad';
					} else if (local69.equals("times")) {
						local40 = '×';
					} else if (local69.equals("euro")) {
						local40 = '€';
					} else if (local69.equals("copy")) {
						local40 = '©';
					} else {
						if (!local69.equals("reg")) {
							if (local69.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local171 = 0;
									} else {
										local171 = arg0[local24];
									}
									if (arg1 == null) {
										local179 = 0;
									} else {
										local179 = arg1[local24];
									}
									local24++;
									@Pc(192) int local192 = Static171.method2545(local69.substring(4));
									@Pc(196) Class43 local196 = arg3[local192];
									@Pc(206) int local206 = arg4 == null ? local196.method9600() : arg4[local192];
									local196.method9583(arg6 + local171, local179 + this.aClass289_16.anInt7755 + local14 + -local206, 1, 0, 1);
									arg6 += arg3[local192].method9587();
									local22 = -1;
								} catch (@Pc(236) Exception local236) {
								}
							} else {
								this.method7887(local69);
							}
							continue;
						}
						local40 = '®';
					}
				}
				if (local20 == -1) {
					if (local22 != -1) {
						arg6 += this.aClass289_16.method6938(local40, local22);
					}
					@Pc(276) int local276;
					if (arg0 == null) {
						local276 = 0;
					} else {
						local276 = arg0[local24];
					}
					if (arg1 == null) {
						local171 = 0;
					} else {
						local171 = arg1[local24];
					}
					local24++;
					if (local40 != ' ') {
						if ((Static402.anInt6610 & 0xFF000000) != 0) {
							this.fa(local40, arg6 + local276 + 1, local171 + 1 + local14, Static402.anInt6610, true);
						}
						this.fa(local40, local276 + arg6, local171 + local14, Static163.anInt2769, false);
					} else if (Static51.anInt853 > 0) {
						Static359.anInt5736 += Static51.anInt853;
						arg6 += Static359.anInt5736 >> 8;
						Static359.anInt5736 &= 0xFF;
					}
					local179 = this.aClass289_16.method6941(local40);
					if (Static7.anInt83 != -1) {
						this.aClass145_13.method9641(local14 + (int) ((double) this.aClass289_16.anInt7755 * 0.7D), Static7.anInt83, local179, arg6);
					}
					if (Static528.anInt8385 != -1) {
						this.aClass145_13.method9641(local14 + this.aClass289_16.anInt7755, Static528.anInt8385, local179, arg6);
					}
					arg6 += local179;
					local22 = local40;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIILjava/lang/String;IIILclient!aa;I[Lclient!ug;IIIII)I")
	public final int method7898(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class1 arg9, @OriginalArg(11) Class43[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg5 == null) {
			return 0;
		}
		this.method7886(arg11, arg12);
		if (arg2 == 0) {
			arg2 = this.aClass289_16.anInt7755;
		}
		@Pc(46) int[] local46;
		if (this.aClass289_16.anInt7763 + this.aClass289_16.anInt7758 + arg2 > arg6 && arg6 < arg2 + arg2) {
			local46 = null;
		} else {
			local46 = new int[] { arg8 };
		}
		@Pc(64) int local64 = this.aClass289_16.method6931(arg5, local46, Static687.aStringArray42, arg10);
		if (arg0 == -1) {
			arg0 = arg6 / arg2;
			if (arg0 <= 0) {
				arg0 = 1;
			}
		}
		if (arg0 > 0 && arg0 <= local64) {
			local64 = arg0;
			Static687.aStringArray42[arg0 - 1] = this.aClass289_16.method6940(arg10, arg8, Static687.aStringArray42[arg0 - 1]);
		}
		if (arg15 == 3 && local64 == 1) {
			arg15 = 1;
		}
		@Pc(159) int local159;
		@Pc(206) int local206;
		if (arg15 == 0) {
			local159 = this.aClass289_16.anInt7758 + arg7;
		} else if (arg15 == 1) {
			local159 = (arg6 - arg2 * (local64 - 1) - this.aClass289_16.anInt7763 - this.aClass289_16.anInt7758) / 2 + arg7 + this.aClass289_16.anInt7758;
		} else if (arg15 == 2) {
			local159 = arg6 + arg7 - arg2 * (local64 - 1) - this.aClass289_16.anInt7763;
		} else {
			local206 = (arg6 - arg2 * (local64 - 1) - this.aClass289_16.anInt7763 - this.aClass289_16.anInt7758) / (local64 - -1);
			if (local206 < 0) {
				local206 = 0;
			}
			local159 = local206 + arg7 + this.aClass289_16.anInt7758;
			arg2 += local206;
		}
		for (local206 = 0; local206 < local64; local206++) {
			if (arg14 == 0) {
				this.method7891(arg4, arg3, local159, arg10, arg1, arg13, arg9, Static687.aStringArray42[local206]);
			} else if (arg14 == 1) {
				this.method7891(arg4, (arg8 - this.aClass289_16.method6935(Static687.aStringArray42[local206])) / 2 + arg3, local159, arg10, arg1, arg13, arg9, Static687.aStringArray42[local206]);
			} else if (arg14 == 2) {
				this.method7891(arg4, arg8 + arg3 - this.aClass289_16.method6935(Static687.aStringArray42[local206]), local159, arg10, arg1, arg13, arg9, Static687.aStringArray42[local206]);
			} else if (local206 == local64 - 1) {
				this.method7891(arg4, arg3, local159, arg10, arg1, arg13, arg9, Static687.aStringArray42[local206]);
			} else {
				this.method7896(60, Static687.aStringArray42[local206], arg8);
				this.method7891(arg4, arg3, local159, arg10, arg1, arg13, arg9, Static687.aStringArray42[local206]);
				Static51.anInt853 = 0;
			}
			local159 += arg2;
		}
		return local64;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IILjava/lang/String;IIII[Lclient!ug;[ILjava/util/Random;IIII)I")
	public final int method7899(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class43[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Random arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return 0;
		}
		arg10.setSeed((long) arg5);
		@Pc(21) int local21 = (arg10.nextInt() & 0x1F) + 192;
		this.method7886(arg4 & 0xFFFFFF | local21 << 24, local21 << 24 | arg6 & 0xFFFFFF);
		@Pc(41) int local41 = arg3.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg10.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(74) int local74 = arg7;
		@Pc(80) int local80 = arg0 + this.aClass289_16.anInt7758;
		if (arg11 == 1) {
			local80 += (arg12 - this.aClass289_16.anInt7758 - this.aClass289_16.anInt7763) / 2;
		} else if (arg11 == 2) {
			local80 = arg12 + arg0 - this.aClass289_16.anInt7763;
		}
		@Pc(134) int local134 = -1;
		if (arg13 == 1) {
			local134 = this.aClass289_16.method6935(arg3) + local46;
			local74 = arg7 + (arg2 - local134) / 2;
		} else if (arg13 == 2) {
			local134 = local46 + this.aClass289_16.method6935(arg3);
			local74 = arg7 + arg2 - local134;
		}
		this.method7897(local44, (int[]) null, arg3, arg8, arg1, local80, local74);
		if (arg9 != null) {
			if (local134 == -1) {
				local134 = this.aClass289_16.method6935(arg3) + local46;
			}
			arg9[0] = local74;
			arg9[3] = this.aClass289_16.anInt7758 + this.aClass289_16.anInt7763;
			arg9[2] = local134;
			arg9[1] = local80 - this.aClass289_16.anInt7758;
		}
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIILclient!aa;ILjava/lang/String;III[Lclient!ug;III)I")
	public final int method7900(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) String arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class43[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method7898(0, arg1, arg7, arg11, arg13, arg8, arg0, arg4, arg5, arg6, arg12, arg9, arg2, arg3, arg10, arg14);
	}
}
