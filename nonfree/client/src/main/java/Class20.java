import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class20 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!za;")
	private final Class106 aClass106_11;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!qm;")
	private final Class209 aClass209_9;

	static {
		new Class158("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!za;Lclient!qm;)V")
	protected Class20(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class209 arg1) {
		this.aClass106_11 = arg0;
		this.aClass209_9 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	protected abstract void method5329(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class24 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method5330(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5336(arg4, -16777216);
		@Pc(24) int local24 = arg1.length();
		@Pc(27) int[] local27 = new int[local24];
		@Pc(30) int[] local30 = new int[local24];
		for (@Pc(32) int local32 = 0; local32 < local24; local32++) {
			local27[local32] = (int) (Math.sin((double) arg0 / 5.0D + (double) local32 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) local32 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method5335(arg3, local30, null, arg2 - this.aClass209_9.method4694(arg1) / 2, null, arg1, local27);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lclient!o;Ljava/lang/String;Lclient!ta;II[I)V")
	private void method5332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class137[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Class24 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		@Pc(5) int local5 = arg0 - this.aClass209_9.anInt6109;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(16) int local16 = arg3.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(31) char local31 = (char) (Static244.method3646(arg3.charAt(local18)) & 0xFF);
			if (local31 == '<') {
				local11 = local18;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(51) String local51 = arg3.substring(local11 + 1, local18);
					local11 = -1;
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
									@Pc(103) int local103 = Static293.method3599(local51.substring(4));
									@Pc(107) Class137 local107 = arg2[local103];
									@Pc(116) int local116 = arg7 == null ? local107.Q() : arg7[local103];
									if ((-16777216 & Static230.anInt4557) == -16777216) {
										local107.W(arg6, this.aClass209_9.anInt6109 + local5 - local116, 1, 0, 1);
									} else {
										local107.W(arg6, this.aClass209_9.anInt6109 + local5 - local116, 0, Static230.anInt4557 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg6 += arg2[local103].RA();
									local13 = -1;
								} catch (@Pc(165) Exception local165) {
								}
							} else {
								this.method5338(local51);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg6 += this.aClass209_9.method4691(local31, local13);
					}
					if (local31 == ' ') {
						if (Static293.anInt4680 > 0) {
							Static413.anInt7364 += Static293.anInt4680;
							arg6 += Static413.anInt7364 >> 8;
							Static413.anInt7364 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static221.anInt4420 & 0xFF000000) != 0) {
							this.B(local31, arg6 + 1, local5 + 1, Static221.anInt4420, true);
						}
						this.B(local31, arg6, local5, Static230.anInt4557, false);
					} else {
						if ((Static221.anInt4420 & 0xFF000000) != 0) {
							this.method5329(local31, arg6 + 1, local5 + 1, Static221.anInt4420, true, arg4, arg1, arg5);
						}
						this.method5329(local31, arg6, local5, Static230.anInt4557, false, arg4, arg1, arg5);
					}
					@Pc(296) int local296 = this.aClass209_9.method4697(local31);
					if (Static132.anInt2945 != -1) {
						this.aClass106_11.method5951(Static132.anInt2945, local296, arg6, local5 + (int) ((double) this.aClass209_9.anInt6109 * 0.7D));
					}
					if (Static96.anInt2299 != -1) {
						this.aClass106_11.method5951(Static96.anInt2299, local296, arg6, local5 + this.aClass209_9.anInt6109 + 1);
					}
					local13 = local31;
					arg6 += local296;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method5336(arg2, arg4);
			this.method5332(arg1, 0, null, arg3, null, 0, arg0 - this.aClass209_9.method4694(arg3) / 2, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[I[Lclient!o;I[IZLjava/lang/String;[I)V")
	private void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class137[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg0 - this.aClass209_9.anInt6109;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = 0;
		@Pc(22) int local22 = arg5.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(34) char local34 = (char) (Static244.method3646(arg5.charAt(local24)) & 0xFF);
			if (local34 == '<') {
				local15 = local24;
			} else {
				@Pc(111) int local111;
				@Pc(120) int local120;
				if (local34 == '>' && local15 != -1) {
					@Pc(55) String local55 = arg5.substring(local15 + 1, local24);
					local15 = -1;
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
									if (arg6 == null) {
										local111 = 0;
									} else {
										local111 = arg6[local19];
									}
									if (arg1 == null) {
										local120 = 0;
									} else {
										local120 = arg1[local19];
									}
									local19++;
									@Pc(132) int local132 = Static293.method3599(local55.substring(4));
									@Pc(136) Class137 local136 = arg2[local132];
									@Pc(145) int local145 = arg4 == null ? local136.Q() : arg4[local132];
									local136.W(local111 + arg3, local9 + this.aClass209_9.anInt6109 + -local145 - -local120, 1, 0, 1);
									arg3 += arg2[local132].RA();
									local17 = -1;
								} catch (@Pc(175) Exception local175) {
								}
							} else {
								this.method5338(local55);
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local15 == -1) {
					if (local17 != -1) {
						arg3 += this.aClass209_9.method4691(local34, local17);
					}
					@Pc(210) int local210;
					if (arg6 == null) {
						local210 = 0;
					} else {
						local210 = arg6[local19];
					}
					if (arg1 == null) {
						local111 = 0;
					} else {
						local111 = arg1[local19];
					}
					if (local34 != ' ') {
						if ((Static221.anInt4420 & 0xFF000000) != 0) {
							this.B(local34, local210 + arg3 + 1, local9 + 1 + local111, Static221.anInt4420, true);
						}
						this.B(local34, arg3 + local210, local111 + local9, Static230.anInt4557, false);
					} else if (Static293.anInt4680 > 0) {
						Static413.anInt7364 += Static293.anInt4680;
						arg3 += Static413.anInt7364 >> 8;
						Static413.anInt7364 &= 0xFF;
					}
					local19++;
					local120 = this.aClass209_9.method4697(local34);
					if (Static132.anInt2945 != -1) {
						this.aClass106_11.method5951(Static132.anInt2945, local120, arg3, local9 + (int) ((double) this.aClass209_9.anInt6109 * 0.7D));
					}
					if (Static96.anInt2299 != -1) {
						this.aClass106_11.method5951(Static96.anInt2299, local120, arg3, local9 + this.aClass209_9.anInt6109);
					}
					arg3 += local120;
					local17 = local34;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI)V")
	private void method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static293.anInt4680 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static132.anInt2945 = -1;
		Static96.anInt2299 = -1;
		Static126.anInt2793 = arg0;
		Static230.anInt4557 = arg0;
		Static413.anInt7364 = 0;
		Static166.anInt3466 = arg1;
		Static221.anInt4420 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;B)V")
	private void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; arg1.length() > local9; local9++) {
			@Pc(14) char local14 = arg1.charAt(local9);
			if (local14 == '<') {
				local7 = true;
			} else if (local14 == '>') {
				local7 = false;
			} else if (!local7 && local14 == ' ') {
				local5++;
			}
		}
		if (local5 > 0) {
			Static293.anInt4680 = (arg0 - this.aClass209_9.method4694(arg1) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5338(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static230.anInt4557 = Static230.anInt4557 & 0xFF000000 | Static104.method1750(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static230.anInt4557 = Static230.anInt4557 & 0xFF000000 | Static126.anInt2793 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static230.anInt4557 = Static104.method1750(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static230.anInt4557 = Static126.anInt2793;
			} else if (arg0.startsWith("str=")) {
				Static132.anInt2945 = Static230.anInt4557 & 0xFF000000 | Static104.method1750(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static132.anInt2945 = Static230.anInt4557 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static132.anInt2945 = -1;
			} else if (arg0.startsWith("u=")) {
				Static96.anInt2299 = Static230.anInt4557 & 0xFF000000 | Static104.method1750(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static96.anInt2299 = Static230.anInt4557 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static96.anInt2299 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static221.anInt4420 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static221.anInt4420 = Static230.anInt4557 & 0xFF000000 | Static104.method1750(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static221.anInt4420 = Static230.anInt4557 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static221.anInt4420 = Static166.anInt3466;
			} else if (arg0.equals("br")) {
				this.method5336(Static126.anInt2793, Static166.anInt3466);
			}
		} catch (@Pc(176) Exception local176) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5339(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 != null) {
			this.method5336(arg0, -1);
			this.method5332(arg3, 0, null, arg1, null, 0, arg2 - this.aClass209_9.method4694(arg1), null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method5340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5336(arg3, arg0);
			this.method5332(arg2, 0, null, arg4, null, 0, arg1, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lclient!o;I[IILjava/lang/String;IB)V")
	public final void method5341(@OriginalArg(0) int arg0, @OriginalArg(1) Class137[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		if (arg4 != null) {
			this.method5336(arg0, 0);
			this.method5332(arg5, 0, arg1, arg4, null, 0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method5342(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5336(arg0, -16777216);
		@Pc(14) int local14 = arg1.length();
		@Pc(22) int[] local22 = new int[local14];
		for (@Pc(24) int local24 = 0; local24 < local14; local24++) {
			local22[local24] = (int) (Math.sin((double) local24 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method5335(arg3, local22, null, arg4 - this.aClass209_9.method4694(arg1) / 2, null, arg1, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;[IIBIIII[Lclient!o;IIILjava/util/Random;[II)I")
	public final int method5344(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class137[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Random arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg11.setSeed((long) arg9);
		@Pc(20) int local20 = (arg11.nextInt() & 0x1F) + 192;
		this.method5336(local20 << 24 | arg2 & 0xFFFFFF, local20 << 24 | arg13 & 0xFFFFFF);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg11.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(72) int local72 = arg8;
		@Pc(84) int local84 = arg10 + this.aClass209_9.anInt6116;
		if (arg3 == 1) {
			local84 += (arg5 - this.aClass209_9.anInt6116 - this.aClass209_9.anInt6104) / 2;
		} else if (arg3 == 2) {
			local84 = arg10 + arg5 - this.aClass209_9.anInt6104;
		}
		@Pc(121) int local121 = -1;
		if (arg4 == 1) {
			local121 = this.aClass209_9.method4694(arg0) + local45;
			local72 = arg8 + (arg6 - local121) / 2;
		} else if (arg4 == 2) {
			local121 = local45 + this.aClass209_9.method4694(arg0);
			local72 = arg8 + arg6 - local121;
		}
		this.method5335(local84, null, arg7, local72, arg12, arg0, local43);
		if (arg1 != null) {
			if (local121 == -1) {
				local121 = this.aClass209_9.method4694(arg0) + local45;
			}
			arg1[3] = this.aClass209_9.anInt6104 + this.aClass209_9.anInt6116;
			arg1[1] = local84 - this.aClass209_9.anInt6116;
			arg1[2] = local121;
			arg1[0] = local72;
		}
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public final void method5345(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method5336(arg2, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg3 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg0.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(38) int local38 = 0; local38 < local29; local38++) {
			local32[local38] = (int) (Math.sin((double) arg4 + (double) local38 / 1.5D) * local20);
		}
		this.method5335(arg1, local32, null, arg5 - this.aClass209_9.method4694(arg0) / 2, null, arg0, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;IIII[Lclient!o;ILjava/lang/String;[II)I")
	public final int method5346(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137[] arg4, @OriginalArg(7) String arg5, @OriginalArg(8) int[] arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg0.setSeed((long) arg1);
		@Pc(20) int local20 = (arg0.nextInt() & 0x1F) + 192;
		this.method5336(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg5.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg0.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method5335(arg3, null, arg4, arg2, arg6, arg5, local43);
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IILjava/lang/String;IIIIIIII[Lclient!o;IIIILclient!ta;)I")
	public final int method5347(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class137[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class24 arg15) {
		if (arg2 == null) {
			return 0;
		}
		this.method5336(arg3, arg5);
		if (arg12 == 0) {
			arg12 = this.aClass209_9.anInt6109;
		}
		@Pc(45) int[] local45;
		if (this.aClass209_9.anInt6104 + this.aClass209_9.anInt6116 + arg12 > arg11 && arg11 < arg12 + arg12) {
			local45 = null;
		} else {
			local45 = new int[] { arg14 };
		}
		@Pc(67) int local67 = this.aClass209_9.method4692(arg10, arg2, local45, Static112.aStringArray17);
		if (arg9 == -1) {
			arg9 = arg11 / arg12;
			if (arg9 <= 0) {
				arg9 = 1;
			}
		}
		if (arg9 > 0 && arg9 <= local67) {
			local67 = arg9;
			Static112.aStringArray17[arg9 - 1] = this.aClass209_9.method4695(arg10, arg14, Static112.aStringArray17[arg9 - 1]);
		}
		if (arg4 == 3 && local67 == 1) {
			arg4 = 1;
		}
		@Pc(121) int local121;
		@Pc(181) int local181;
		if (arg4 == 0) {
			local121 = arg7 + this.aClass209_9.anInt6116;
		} else if (arg4 == 1) {
			local121 = this.aClass209_9.anInt6116 + arg7 + (-((local67 + -1) * arg12) + -this.aClass209_9.anInt6104 + -this.aClass209_9.anInt6116 + arg11) / 2;
		} else if (arg4 == 2) {
			local121 = arg11 + arg7 - (local67 - 1) * arg12 - this.aClass209_9.anInt6104;
		} else {
			local181 = (arg11 - this.aClass209_9.anInt6104 - this.aClass209_9.anInt6116 - arg12 * (local67 + -1)) / (local67 - -1);
			if (local181 < 0) {
				local181 = 0;
			}
			arg12 += local181;
			local121 = this.aClass209_9.anInt6116 + arg7 + local181;
		}
		for (local181 = 0; local181 < local67; local181++) {
			if (arg1 == 0) {
				this.method5332(local121, arg13, arg10, Static112.aStringArray17[local181], arg15, arg6, arg8, arg0);
			} else if (arg1 == 1) {
				this.method5332(local121, arg13, arg10, Static112.aStringArray17[local181], arg15, arg6, (arg14 - this.aClass209_9.method4694(Static112.aStringArray17[local181])) / 2 + arg8, arg0);
			} else if (arg1 == 2) {
				this.method5332(local121, arg13, arg10, Static112.aStringArray17[local181], arg15, arg6, arg14 + arg8 - this.aClass209_9.method4694(Static112.aStringArray17[local181]), arg0);
			} else if (local67 - 1 == local181) {
				this.method5332(local121, arg13, arg10, Static112.aStringArray17[local181], arg15, arg6, arg8, arg0);
			} else {
				this.method5337(arg14, Static112.aStringArray17[local181]);
				this.method5332(local121, arg13, arg10, Static112.aStringArray17[local181], arg15, arg6, arg8, arg0);
				Static293.anInt4680 = 0;
			}
			local121 += arg12;
		}
		return local67;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLjava/lang/String;III[Lclient!o;IILclient!ta;[IIIIII)I")
	public final int method5348(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class137[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class24 arg8, @OriginalArg(10) int[] arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		return this.method5347(arg9, 1, arg1, arg7, arg0, arg3, arg11, arg4, arg6, 0, arg5, arg10, 0, arg12, arg2, arg8);
	}

	@OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
