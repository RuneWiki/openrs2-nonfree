import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class18 {

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!gg;")
	private final Class84 aClass84_11;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Lclient!qa;")
	private final Class30 aClass30_19;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!qa;Lclient!gg;)V")
	protected Class18(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class84 arg1) {
		this.aClass84_11 = arg1;
		this.aClass30_19 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(CIIIZLclient!i;II)V")
	protected abstract void method5756(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class74 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
	private void method5758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static204.anInt4198 = 0;
		Static239.anInt4704 = -1;
		Static224.anInt4461 = arg0;
		Static19.anInt369 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static260.anInt4983 = 0;
		Static172.anInt3375 = -1;
		Static159.anInt3240 = arg1;
		Static408.anInt7134 = arg1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;IBIII)V")
	public final void method5759(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method5758(arg2, -1);
			this.method5771(0, null, null, arg1, null, 0, arg3 - this.aClass84_11.method2381(arg0), arg0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;[Lclient!aa;IZI[I[I[I)V")
	private void method5760(@OriginalArg(0) String arg0, @OriginalArg(1) Class2[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(18) int local18 = arg3 - this.aClass84_11.anInt2631;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(44) char local44 = (char) (Static170.method2991(arg0.charAt(local33)) & 0xFF);
			if (local44 == '<') {
				local24 = local33;
			} else {
				@Pc(131) int local131;
				@Pc(143) int local143;
				if (local44 == '>' && local24 != -1) {
					@Pc(65) String local65 = arg0.substring(local24 + 1, local33);
					local24 = -1;
					if (local65.equals("lt")) {
						local44 = '<';
					} else if (local65.equals("gt")) {
						local44 = '>';
					} else if (local65.equals("nbsp")) {
						local44 = ' ';
					} else if (local65.equals("shy")) {
						local44 = '\u00ad';
					} else if (local65.equals("times")) {
						local44 = '×';
					} else if (local65.equals("euro")) {
						local44 = '€';
					} else if (local65.equals("copy")) {
						local44 = '©';
					} else {
						if (!local65.equals("reg")) {
							if (local65.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local131 = 0;
									} else {
										local131 = arg5[local28];
									}
									if (arg6 == null) {
										local143 = 0;
									} else {
										local143 = arg6[local28];
									}
									local28++;
									@Pc(154) int local154 = Static269.method4335(local65.substring(4));
									@Pc(158) Class2 local158 = arg1[local154];
									@Pc(167) int local167 = arg4 == null ? local158.ga() : arg4[local154];
									local158.E(arg2 + local131, local18 + (this.aClass84_11.anInt2631 - (local167 - local143)), 1, 0, 1);
									local26 = -1;
									arg2 += arg1[local154].d();
								} catch (@Pc(196) Exception local196) {
								}
							} else {
								this.method5775(local65);
							}
							continue;
						}
						local44 = '®';
					}
				}
				if (local24 == -1) {
					if (local26 != -1) {
						arg2 += this.aClass84_11.method2379(local44, local26);
					}
					@Pc(230) int local230;
					if (arg5 == null) {
						local230 = 0;
					} else {
						local230 = arg5[local28];
					}
					if (arg6 == null) {
						local131 = 0;
					} else {
						local131 = arg6[local28];
					}
					if (local44 != ' ') {
						if ((Static408.anInt7134 & 0xFF000000) != 0) {
							this.g(local44, local230 + arg2 + 1, local18 + 1 + local131, Static408.anInt7134, true);
						}
						this.g(local44, local230 + arg2, local18 + local131, Static19.anInt369, false);
					} else if (Static204.anInt4198 > 0) {
						Static260.anInt4983 += Static204.anInt4198;
						arg2 += Static260.anInt4983 >> 8;
						Static260.anInt4983 &= 0xFF;
					}
					local28++;
					local143 = this.aClass84_11.method2382(local44);
					if (Static172.anInt3375 != -1) {
						this.aClass30_19.method2037((int) ((double) this.aClass84_11.anInt2631 * 0.7D) + local18, Static172.anInt3375, arg2, local143);
					}
					if (Static239.anInt4704 != -1) {
						this.aClass30_19.method2037(this.aClass84_11.anInt2631 + local18, Static239.anInt4704, arg2, local143);
					}
					local26 = local44;
					arg2 += local143;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method5761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5758(arg3, -16777216);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg4 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method5760(arg2, null, arg0 - this.aClass84_11.method2381(arg2) / 2, arg1, null, local19, local22);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIII[ILjava/util/Random;[ILjava/lang/String;[Lclient!aa;IIBI)I")
	public final int method5762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) Random arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) String arg9, @OriginalArg(10) Class2[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13) {
		if (arg9 == null) {
			return 0;
		}
		arg7.setSeed((long) arg4);
		@Pc(21) int local21 = (arg7.nextInt() & 0x1F) + 192;
		this.method5758(local21 << 24 | arg12 & 0xFFFFFF, local21 << 24 | arg0 & 0xFFFFFF);
		@Pc(49) int local49 = arg9.length();
		@Pc(52) int[] local52 = new int[local49];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local52[local56] = local54;
			if ((arg7.nextInt() & 0x3) == 0) {
				local54++;
			}
		}
		@Pc(78) int local78 = arg11;
		@Pc(84) int local84 = arg5 + this.aClass84_11.anInt2628;
		if (arg1 == 1) {
			local84 += (arg2 - this.aClass84_11.anInt2634 - this.aClass84_11.anInt2628) / 2;
		} else if (arg1 == 2) {
			local84 = arg2 + arg5 - this.aClass84_11.anInt2634;
		}
		@Pc(119) int local119 = -1;
		if (arg13 == 1) {
			local119 = local54 + this.aClass84_11.method2381(arg9);
			local78 = arg11 + (arg3 - local119) / 2;
		} else if (arg13 == 2) {
			local119 = this.aClass84_11.method2381(arg9) + local54;
			local78 = arg11 + arg3 - local119;
		}
		this.method5760(arg9, arg10, local78, local84, arg6, local52, null);
		if (arg8 != null) {
			if (local119 == -1) {
				local119 = local54 + this.aClass84_11.method2381(arg9);
			}
			arg8[0] = local78;
			arg8[3] = this.aClass84_11.anInt2628 + this.aClass84_11.anInt2634;
			arg8[1] = local84 - this.aClass84_11.anInt2628;
			arg8[2] = local119;
		}
		return local54;
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(CIIIZ)V")
	protected abstract void g(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([Lclient!aa;BILjava/lang/String;II[II)V")
	public final void method5764(@OriginalArg(0) Class2[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg2 != null) {
			this.method5758(arg1, 0);
			this.method5771(0, null, arg4, arg5, arg0, 0, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	private void method5765(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		@Pc(14) boolean local14 = false;
		for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
			@Pc(22) char local22 = arg0.charAt(local16);
			if (local22 == '<') {
				local14 = true;
			} else if (local22 == '>') {
				local14 = false;
			} else if (!local14 && local22 == ' ') {
				local12++;
			}
		}
		if (local12 > 0) {
			Static204.anInt4198 = (arg1 - this.aClass84_11.method2381(arg0) << 8) / local12;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public final void method5767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method5758(arg5, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg0 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg2.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (local20 * Math.sin((double) local34 / 1.5D + (double) arg3));
		}
		this.method5760(arg2, null, arg4 - this.aClass84_11.method2381(arg2) / 2, arg1, null, null, local32);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIILclient!i;I[IIIILjava/lang/String;[Lclient!aa;)I")
	public final int method5768(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class74 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(14) String arg11, @OriginalArg(15) Class2[] arg12) {
		return this.method5773(0, arg8, arg2, arg6, arg9, arg7, 0, arg0, arg11, arg4, arg3, arg1, arg10, arg5, arg12, 1);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V")
	public final void method5769(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method5758(arg4, arg2);
			this.method5771(0, null, null, arg3, null, 0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;III[Lclient!aa;IILjava/util/Random;I[I)I")
	public final int method5770(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Random arg5, @OriginalArg(9) int[] arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg2);
		@Pc(26) int local26 = (arg5.nextInt() & 0x1F) + 192;
		this.method5758(local26 << 24 | 0xFFFFFF, (local26 | 0x0) << 24);
		@Pc(46) int local46 = arg0.length();
		@Pc(49) int[] local49 = new int[local46];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local46; local53++) {
			local49[local53] = local51;
			if ((arg5.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		this.method5760(arg0, arg3, arg1, arg4, arg6, local49, null);
		return local51;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!i;[III[Lclient!aa;IILjava/lang/String;)V")
	private void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(15) int local15 = arg3 - this.aClass84_11.anInt2631;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(26) int local26 = arg7.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static170.method2991(arg7.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local21 = local28;
			} else {
				if (local39 == '>' && local21 != -1) {
					@Pc(61) String local61 = arg7.substring(local21 + 1, local28);
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
									@Pc(135) int local135 = Static269.method4335(local61.substring(4));
									@Pc(139) Class2 local139 = arg4[local135];
									@Pc(148) int local148 = arg2 == null ? local139.ga() : arg2[local135];
									if ((Static19.anInt369 & 0xFF000000) == -16777216) {
										local139.E(arg6, local15 + this.aClass84_11.anInt2631 - local148, 1, 0, 1);
									} else {
										local139.E(arg6, local15 + this.aClass84_11.anInt2631 - local148, 0, Static19.anInt369 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local23 = -1;
									arg6 += arg4[local135].d();
								} catch (@Pc(201) Exception local201) {
								}
							} else {
								this.method5775(local61);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg6 += this.aClass84_11.method2379(local39, local23);
					}
					if (local39 == ' ') {
						if (Static204.anInt4198 > 0) {
							Static260.anInt4983 += Static204.anInt4198;
							arg6 += Static260.anInt4983 >> 8;
							Static260.anInt4983 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static408.anInt7134 & 0xFF000000) != 0) {
							this.g(local39, arg6 + 1, local15 - -1, Static408.anInt7134, true);
						}
						this.g(local39, arg6, local15, Static19.anInt369, false);
					} else {
						if ((Static408.anInt7134 & 0xFF000000) != 0) {
							this.method5756(local39, arg6 + 1, local15 - -1, Static408.anInt7134, true, arg1, arg0, arg5);
						}
						this.method5756(local39, arg6, local15, Static19.anInt369, false, arg1, arg0, arg5);
					}
					@Pc(310) int local310 = this.aClass84_11.method2382(local39);
					if (Static172.anInt3375 != -1) {
						this.aClass30_19.method2037(local15 + (int) ((double) this.aClass84_11.anInt2631 * 0.7D), Static172.anInt3375, arg6, local310);
					}
					if (Static239.anInt4704 != -1) {
						this.aClass30_19.method2037(local15 + this.aClass84_11.anInt2631 + 1, Static239.anInt4704, arg6, local310);
					}
					arg6 += local310;
					local23 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIILjava/lang/String;I)V")
	public final void method5772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method5758(arg0, arg4);
			this.method5771(0, null, null, arg2, null, 0, arg1 - this.aClass84_11.method2381(arg3) / 2, arg3);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII[ILclient!i;IILjava/lang/String;IIIII[Lclient!aa;I)I")
	public final int method5773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class74 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class2[] arg14, @OriginalArg(16) int arg15) {
		if (arg8 == null) {
			return 0;
		}
		this.method5758(arg1, arg7);
		if (arg0 == 0) {
			arg0 = this.aClass84_11.anInt2631;
		}
		@Pc(41) int[] local41;
		if (arg3 < arg0 + this.aClass84_11.anInt2634 + this.aClass84_11.anInt2628 && arg0 + arg0 > arg3) {
			local41 = null;
		} else {
			local41 = new int[] { arg12 };
		}
		@Pc(59) int local59 = this.aClass84_11.method2376(local41, arg8, Static326.aStringArray30, arg14);
		if (arg6 == -1) {
			arg6 = arg3 / arg0;
			if (arg6 <= 0) {
				arg6 = 1;
			}
		}
		if (arg6 > 0 && local59 >= arg6) {
			local59 = arg6;
			Static326.aStringArray30[arg6 - 1] = this.aClass84_11.method2374(arg12, Static326.aStringArray30[arg6 - 1], arg14);
		}
		if (arg2 == 3 && local59 == 1) {
			arg2 = 1;
		}
		@Pc(113) int local113;
		@Pc(164) int local164;
		if (arg2 == 0) {
			local113 = this.aClass84_11.anInt2628 + arg10;
		} else if (arg2 == 1) {
			local113 = this.aClass84_11.anInt2628 + arg10 + (-this.aClass84_11.anInt2634 + (-this.aClass84_11.anInt2628 + arg3 - arg0 * (local59 + -1))) / 2;
		} else if (arg2 == 2) {
			local113 = arg10 + arg3 - this.aClass84_11.anInt2634 - (local59 - 1) * arg0;
		} else {
			local164 = (arg3 - arg0 * (local59 - 1) - this.aClass84_11.anInt2634 - this.aClass84_11.anInt2628) / (local59 + 1);
			if (local164 < 0) {
				local164 = 0;
			}
			arg0 += local164;
			local113 = arg10 + this.aClass84_11.anInt2628 + local164;
		}
		for (local164 = 0; local164 < local59; local164++) {
			if (arg15 == 0) {
				this.method5771(arg13, arg5, arg4, local113, arg14, arg9, arg11, Static326.aStringArray30[local164]);
			} else if (arg15 == 1) {
				this.method5771(arg13, arg5, arg4, local113, arg14, arg9, arg11 + (arg12 - this.aClass84_11.method2381(Static326.aStringArray30[local164])) / 2, Static326.aStringArray30[local164]);
			} else if (arg15 == 2) {
				this.method5771(arg13, arg5, arg4, local113, arg14, arg9, arg12 + arg11 - this.aClass84_11.method2381(Static326.aStringArray30[local164]), Static326.aStringArray30[local164]);
			} else if (local164 == local59 - 1) {
				this.method5771(arg13, arg5, arg4, local113, arg14, arg9, arg11, Static326.aStringArray30[local164]);
			} else {
				this.method5765(Static326.aStringArray30[local164], arg12);
				this.method5771(arg13, arg5, arg4, local113, arg14, arg9, arg11, Static326.aStringArray30[local164]);
				Static204.anInt4198 = 0;
			}
			local113 += arg0;
		}
		return local59;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5775(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static19.anInt369 = Static19.anInt369 & 0xFF000000 | Static107.method2121(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static19.anInt369 = Static224.anInt4461 & 0xFFFFFF | Static19.anInt369 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static19.anInt369 = Static107.method2121(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static19.anInt369 = Static224.anInt4461;
			} else if (arg0.startsWith("str=")) {
				Static172.anInt3375 = Static19.anInt369 & 0xFF000000 | Static107.method2121(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static172.anInt3375 = Static19.anInt369 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static172.anInt3375 = -1;
			} else if (arg0.startsWith("u=")) {
				Static239.anInt4704 = Static19.anInt369 & 0xFF000000 | Static107.method2121(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static239.anInt4704 = Static19.anInt369 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static239.anInt4704 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static408.anInt7134 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static408.anInt7134 = Static19.anInt369 & 0xFF000000 | Static107.method2121(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static408.anInt7134 = Static19.anInt369 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static408.anInt7134 = Static159.anInt3240;
			} else if (arg0.equals("br")) {
				this.method5758(Static224.anInt4461, Static159.anInt3240);
			}
		} catch (@Pc(187) Exception local187) {
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method5776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method5758(arg0, -16777216);
		@Pc(21) int local21 = arg4.length();
		@Pc(24) int[] local24 = new int[local21];
		for (@Pc(26) int local26 = 0; local26 < local21; local26++) {
			local24[local26] = (int) (Math.sin((double) local26 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method5760(arg4, null, arg1 - this.aClass84_11.method2381(arg4) / 2, arg2, null, null, local24);
	}
}
