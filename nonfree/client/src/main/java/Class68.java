import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class68 {

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!oea;")
	private final Class239 aClass239_16;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!ha;")
	private final Class20 aClass20_14;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!oea;)V")
	protected Class68(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class239 arg1) {
		this.aClass239_16 = arg1;
		this.aClass20_14 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!mi;[II[I[IILjava/lang/String;I)V")
	private void method8097(@OriginalArg(0) Class46[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		@Pc(7) int local7 = arg5 - this.aClass239_16.anInt7563;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(24) int local24 = arg6.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) char local37 = (char) (Static132.method3029(arg6.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local13 = local26;
			} else {
				@Pc(123) int local123;
				@Pc(133) int local133;
				if (local37 == '>' && local13 != -1) {
					@Pc(59) String local59 = arg6.substring(local13 + 1, local26);
					local13 = -1;
					if (local59.equals("lt")) {
						local37 = '<';
					} else if (local59.equals("gt")) {
						local37 = '>';
					} else if (local59.equals("nbsp")) {
						local37 = ' ';
					} else if (local59.equals("shy")) {
						local37 = '\u00ad';
					} else if (local59.equals("times")) {
						local37 = '×';
					} else if (local59.equals("euro")) {
						local37 = '€';
					} else if (local59.equals("copy")) {
						local37 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=")) {
								try {
									if (arg4 == null) {
										local123 = 0;
									} else {
										local123 = arg4[local17];
									}
									if (arg1 == null) {
										local133 = 0;
									} else {
										local133 = arg1[local17];
									}
									local17++;
									@Pc(144) int local144 = Static562.method8436(local59.substring(4));
									@Pc(148) Class46 local148 = arg0[local144];
									@Pc(157) int local157 = arg3 == null ? local148.method6219() : arg3[local144];
									local148.method6203(arg2 + local123, -local157 + this.aClass239_16.anInt7563 + (local7 - -local133), 1, 0, 1);
									arg2 += arg0[local144].method6205();
									local15 = -1;
								} catch (@Pc(187) Exception local187) {
								}
							} else {
								this.method8104(local59);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass239_16.method6481(local15, local37);
					}
					@Pc(225) int local225;
					if (arg4 == null) {
						local225 = 0;
					} else {
						local225 = arg4[local17];
					}
					if (arg1 == null) {
						local123 = 0;
					} else {
						local123 = arg1[local17];
					}
					if (local37 != ' ') {
						if ((Static213.anInt4834 & 0xFF000000) != 0) {
							this.fa(local37, arg2 + local225 + 1, local7 - -1 + local123, Static213.anInt4834, true);
						}
						this.fa(local37, arg2 + local225, local7 + local123, Static35.anInt776, false);
					} else if (Static379.anInt7417 > 0) {
						Static565.anInt10891 += Static379.anInt7417;
						arg2 += Static565.anInt10891 >> 8;
						Static565.anInt10891 &= 0xFF;
					}
					local17++;
					local133 = this.aClass239_16.method6483(local37);
					if (Static287.anInt6144 != -1) {
						this.aClass20_14.method7252(local133, local7 + (int) ((double) this.aClass239_16.anInt7563 * 0.7D), Static287.anInt6144, arg2);
					}
					if (Static175.anInt4200 != -1) {
						this.aClass20_14.method7252(local133, this.aClass239_16.anInt7563 + local7, Static175.anInt4200, arg2);
					}
					local15 = local37;
					arg2 += local133;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;BIII[Lclient!mi;[I)V")
	public final void method8098(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class46[] arg4, @OriginalArg(7) int[] arg5) {
		if (arg1 != null) {
			this.method8110(0, arg2);
			this.method8114(0, arg0, 0, arg4, null, arg1, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIBLclient!aa;I[Lclient!mi;IIIILjava/lang/String;IIIIII)I")
	public final int method8099(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class46[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg9 == null) {
			return 0;
		}
		this.method8110(arg13, arg5);
		if (arg15 == 0) {
			arg15 = this.aClass239_16.anInt7563;
		}
		@Pc(48) int[] local48;
		if (this.aClass239_16.anInt7564 + this.aClass239_16.anInt7559 + arg15 > arg1 && arg1 < arg15 + arg15) {
			local48 = null;
		} else {
			local48 = new int[] { arg7 };
		}
		@Pc(61) int local61 = this.aClass239_16.method6487(arg9, local48, Static408.aStringArray35, arg4);
		if (arg14 == -1) {
			arg14 = arg1 / arg15;
			if (arg14 <= 0) {
				arg14 = 1;
			}
		}
		if (arg14 > 0 && local61 >= arg14) {
			Static408.aStringArray35[arg14 - 1] = this.aClass239_16.method6480(arg4, arg7, Static408.aStringArray35[arg14 - 1]);
			local61 = arg14;
		}
		if (arg8 == 3 && local61 == 1) {
			arg8 = 1;
		}
		@Pc(128) int local128;
		@Pc(163) int local163;
		if (arg8 == 0) {
			local128 = this.aClass239_16.anInt7559 + arg6;
		} else if (arg8 == 1) {
			local128 = (arg1 - this.aClass239_16.anInt7564 - this.aClass239_16.anInt7559 - arg15 * (local61 + -1)) / 2 + this.aClass239_16.anInt7559 + arg6;
		} else if (arg8 == 2) {
			local128 = arg1 + arg6 - this.aClass239_16.anInt7564 - (local61 + -1) * arg15;
		} else {
			local163 = (arg1 - arg15 * (local61 - 1) - this.aClass239_16.anInt7559 - this.aClass239_16.anInt7564) / (local61 + 1);
			if (local163 < 0) {
				local163 = 0;
			}
			arg15 += local163;
			local128 = this.aClass239_16.anInt7559 + arg6 + local163;
		}
		for (local163 = 0; local163 < local61; local163++) {
			if (arg12 == 0) {
				this.method8114(arg10, local128, arg3, arg4, arg2, Static408.aStringArray35[local163], arg0, arg11);
			} else if (arg12 == 1) {
				this.method8114(arg10, local128, arg3, arg4, arg2, Static408.aStringArray35[local163], arg0, (arg7 - this.aClass239_16.method6482(Static408.aStringArray35[local163])) / 2 + arg11);
			} else if (arg12 == 2) {
				this.method8114(arg10, local128, arg3, arg4, arg2, Static408.aStringArray35[local163], arg0, arg7 + arg11 - this.aClass239_16.method6482(Static408.aStringArray35[local163]));
			} else if (local163 == local61 - 1) {
				this.method8114(arg10, local128, arg3, arg4, arg2, Static408.aStringArray35[local163], arg0, arg11);
			} else {
				this.method8111(Static408.aStringArray35[local163], arg7);
				this.method8114(arg10, local128, arg3, arg4, arg2, Static408.aStringArray35[local163], arg0, arg11);
				Static379.anInt7417 = 0;
			}
			local128 += arg15;
		}
		return local61;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method8100(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method8110(arg4, arg2);
			this.method8114(0, arg1, 0, null, null, arg0, null, arg3 - this.aClass239_16.method6482(arg0));
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ILjava/lang/String;II[Lclient!mi;IILjava/util/Random;)I")
	public final int method8102(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(6) Class46[] arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Random arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg6.setSeed((long) arg0);
		@Pc(20) int local20 = (arg6.nextInt() & 0x1F) + 192;
		this.method8110((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(42) int local42 = arg2.length();
		@Pc(50) int[] local50 = new int[local42];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local42; local54++) {
			local50[local54] = local52;
			if ((arg6.nextInt() & 0x3) == 0) {
				local52++;
			}
		}
		this.method8097(arg3, null, arg5, arg1, local50, arg4, arg2);
		return local52;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method8104(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static35.anInt776 = Static35.anInt776 & 0xFF000000 | Static248.method4589(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static35.anInt776 = Static35.anInt776 & 0xFF000000 | Static310.anInt6424 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static35.anInt776 = Static248.method4589(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static35.anInt776 = Static310.anInt6424;
			} else if (arg0.startsWith("str=")) {
				Static287.anInt6144 = Static35.anInt776 & 0xFF000000 | Static248.method4589(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static287.anInt6144 = Static35.anInt776 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static287.anInt6144 = -1;
			} else if (arg0.startsWith("u=")) {
				Static175.anInt4200 = Static35.anInt776 & 0xFF000000 | Static248.method4589(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static175.anInt4200 = Static35.anInt776 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static175.anInt4200 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static213.anInt4834 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static213.anInt4834 = Static35.anInt776 & 0xFF000000 | Static248.method4589(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static213.anInt4834 = Static35.anInt776 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static213.anInt4834 = Static402.anInt7653;
			} else if (arg0.equals("br")) {
				this.method8110(Static402.anInt7653, Static310.anInt6424);
				return;
			}
		} catch (@Pc(173) Exception local173) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIZ)V")
	public final void method8105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method8110(-16777216, arg0);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(27) int local27 = 0; local27 < local16; local27++) {
			local19[local27] = (int) (Math.sin((double) local27 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method8097(null, local19, arg3 - this.aClass239_16.method6482(arg2) / 2, null, null, arg1, arg2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILjava/lang/String;II)V")
	public final void method8106(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method8110(arg3, arg1);
			this.method8114(0, arg4, 0, null, null, arg2, null, arg0 - this.aClass239_16.method6482(arg2) / 2);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method8107(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method8110(arg4, arg1);
			this.method8114(0, arg2, 0, null, null, arg0, null, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public final void method8108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method8110(-16777216, arg3);
		@Pc(20) double local20 = 7.0D - (double) arg4 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg2.length();
		@Pc(42) int[] local42 = new int[local29];
		for (@Pc(44) int local44 = 0; local44 < local29; local44++) {
			local42[local44] = (int) (Math.sin((double) arg0 + (double) local44 / 1.5D) * local20);
		}
		this.method8097(null, local42, arg5 - this.aClass239_16.method6482(arg2) / 2, null, null, arg1, arg2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8109(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method8110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static175.anInt4200 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static310.anInt6424 = arg1;
		Static35.anInt776 = arg1;
		Static565.anInt10891 = 0;
		Static379.anInt7417 = 0;
		Static287.anInt6144 = -1;
		Static402.anInt7653 = arg0;
		Static213.anInt4834 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method8111(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
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
			Static379.anInt7417 = (arg1 - this.aClass239_16.method6482(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V")
	public final void method8112(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method8110(-16777216, arg1);
		@Pc(22) int local22 = arg0.length();
		@Pc(25) int[] local25 = new int[local22];
		@Pc(28) int[] local28 = new int[local22];
		for (@Pc(30) int local30 = 0; local30 < local22; local30++) {
			local25[local30] = (int) (Math.sin((double) arg2 / 5.0D + (double) local30 / 5.0D) * 5.0D);
			local28[local30] = (int) (Math.sin((double) local30 / 3.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method8097(null, local28, arg4 - this.aClass239_16.method6482(arg0) / 2, null, local25, arg3, arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[Lclient!mi;Lclient!aa;Ljava/lang/String;[III)V")
	private void method8114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class46[] arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg1 - this.aClass239_16.anInt7563;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg5.length();
		for (@Pc(24) int local24 = 0; local24 < local18; local24++) {
			@Pc(35) char local35 = (char) (Static132.method3029(arg5.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local13 = local24;
			} else {
				if (local35 == '>' && local13 != -1) {
					@Pc(57) String local57 = arg5.substring(local13 + 1, local24);
					local13 = -1;
					if (local57.equals("lt")) {
						local35 = '<';
					} else if (local57.equals("gt")) {
						local35 = '>';
					} else if (local57.equals("nbsp")) {
						local35 = ' ';
					} else if (local57.equals("shy")) {
						local35 = '\u00ad';
					} else if (local57.equals("times")) {
						local35 = '×';
					} else if (local57.equals("euro")) {
						local35 = '€';
					} else if (local57.equals("copy")) {
						local35 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									@Pc(121) int local121 = Static562.method8436(local57.substring(4));
									@Pc(125) Class46 local125 = arg3[local121];
									@Pc(134) int local134 = arg6 == null ? local125.method6219() : arg6[local121];
									if ((Static35.anInt776 & -16777216) == -16777216) {
										local125.method6203(arg7, this.aClass239_16.anInt7563 + local7 - local134, 1, 0, 1);
									} else {
										local125.method6203(arg7, this.aClass239_16.anInt7563 + local7 - local134, 0, Static35.anInt776 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg7 += arg3[local121].method6205();
								} catch (@Pc(183) Exception local183) {
								}
							} else {
								this.method8104(local57);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg7 += this.aClass239_16.method6481(local15, local35);
					}
					if (local35 == ' ') {
						if (Static379.anInt7417 > 0) {
							Static565.anInt10891 += Static379.anInt7417;
							arg7 += Static565.anInt10891 >> 8;
							Static565.anInt10891 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static213.anInt4834 & 0xFF000000) != 0) {
							this.fa(local35, arg7 + 1, local7 + 1, Static213.anInt4834, true);
						}
						this.fa(local35, arg7, local7, Static35.anInt776, false);
					} else {
						if ((Static213.anInt4834 & 0xFF000000) != 0) {
							this.method8109(local35, arg7 + 1, local7 + 1, Static213.anInt4834, true, arg4, arg2, arg0);
						}
						this.method8109(local35, arg7, local7, Static35.anInt776, false, arg4, arg2, arg0);
					}
					@Pc(298) int local298 = this.aClass239_16.method6483(local35);
					if (Static287.anInt6144 != -1) {
						this.aClass20_14.method7252(local298, (int) ((double) this.aClass239_16.anInt7563 * 0.7D) + local7, Static287.anInt6144, arg7);
					}
					if (Static175.anInt4200 != -1) {
						this.aClass20_14.method7252(local298, this.aClass239_16.anInt7563 + local7 + 1, Static175.anInt4200, arg7);
					}
					arg7 += local298;
					local15 = local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([III[Lclient!mi;IIILclient!aa;IIIIIZILjava/lang/String;)I")
	public final int method8115(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class46[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class1 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) String arg14) {
		return this.method8099(arg0, arg6, arg7, arg9, arg3, arg4, arg8, arg11, arg5, arg14, arg10, arg12, arg13, arg2, 0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([II[Lclient!mi;IIIILjava/util/Random;IIIIILjava/lang/String;[I)I")
	public final int method8116(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Random arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) String arg12, @OriginalArg(14) int[] arg13) {
		if (arg12 == null) {
			return 0;
		}
		arg7.setSeed((long) arg10);
		@Pc(20) int local20 = (arg7.nextInt() & 0x1F) + 192;
		this.method8110(local20 << 24 | arg6 & 0xFFFFFF, arg4 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg12.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg7.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(72) int local72 = arg11;
		@Pc(78) int local78 = this.aClass239_16.anInt7559 + arg9;
		@Pc(80) int local80 = -1;
		if (arg3 == 1) {
			local78 += (arg5 - this.aClass239_16.anInt7559 - this.aClass239_16.anInt7564) / 2;
		} else if (arg3 == 2) {
			local78 = arg5 + arg9 - this.aClass239_16.anInt7564;
		}
		if (arg8 == 1) {
			local80 = this.aClass239_16.method6482(arg12) + local45;
			local72 = arg11 + (arg1 - local80) / 2;
		} else if (arg8 == 2) {
			local80 = this.aClass239_16.method6482(arg12) + local45;
			local72 = arg11 + arg1 - local80;
		}
		this.method8097(arg2, null, local72, arg0, local43, local78, arg12);
		if (arg13 != null) {
			if (local80 == -1) {
				local80 = this.aClass239_16.method6482(arg12) + local45;
			}
			arg13[2] = local80;
			arg13[3] = this.aClass239_16.anInt7564 + this.aClass239_16.anInt7559;
			arg13[0] = local72;
			arg13[1] = local78 - this.aClass239_16.anInt7559;
		}
		return local45;
	}
}
