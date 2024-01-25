import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class67 {

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!eb;")
	private final Class91 aClass91_13;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!ha;")
	private final Class95 aClass95_14;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!eb;)V")
	protected Class67(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class91 arg1) {
		this.aClass91_13 = arg1;
		this.aClass95_14 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lclient!hh;[IIBLjava/lang/String;IIILclient!aa;IIIII)I")
	public final int method7672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class1 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method7686(arg7, arg6, arg1, arg5, arg11, arg3, arg14, arg0, arg8, arg12, 0, arg2, arg13, arg4, arg10, arg9);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[Lclient!hh;IIILjava/lang/String;)V")
	public final void method7673(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class6[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 != null) {
			this.method7682(arg0, 0);
			this.method7680(0, arg1, 0, arg4, arg3, arg2, (Class1) null, arg5);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7674(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method7682(arg4, -16777216);
		@Pc(22) int local22 = arg0.length();
		@Pc(25) int[] local25 = new int[local22];
		@Pc(28) int[] local28 = new int[local22];
		for (@Pc(30) int local30 = 0; local30 < local22; local30++) {
			local25[local30] = (int) (Math.sin((double) arg2 / 5.0D + (double) local30 / 5.0D) * 5.0D);
			local28[local30] = (int) (Math.sin((double) arg2 / 5.0D + (double) local30 / 3.0D) * 5.0D);
		}
		this.method7681((Class6[]) null, arg0, arg3, local28, arg1 - this.aClass91_13.method1849(arg0) / 2, local25, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public final void method7675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method7682(arg3, arg2);
			this.method7680(0, (int[]) null, 0, arg1 - this.aClass91_13.method1849(arg4), arg0, (Class6[]) null, (Class1) null, arg4);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method7676(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7682(arg0, arg2);
			this.method7680(0, (int[]) null, 0, arg4 - this.aClass91_13.method1849(arg1) / 2, arg3, (Class6[]) null, (Class1) null, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method7677(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;[IIBIIILjava/util/Random;[Lclient!hh;I)I")
	public final int method7678(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Random arg4, @OriginalArg(8) Class6[] arg5, @OriginalArg(9) int arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg4.setSeed((long) arg3);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method7682(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(45) int local45 = arg0.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg4.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method7681(arg5, arg0, arg6, (int[]) null, arg2, local48, arg1);
		return local50;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIILjava/util/Random;IZ[I[Lclient!hh;IILjava/lang/String;III)I")
	public final int method7679(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Class6[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg10 == null) {
			return 0;
		}
		arg4.setSeed((long) arg5);
		@Pc(21) int local21 = (arg4.nextInt() & 0x1F) + 192;
		this.method7682(local21 << 24 | arg0 & 0xFFFFFF, arg8 & 0xFFFFFF | local21 << 24);
		@Pc(41) int local41 = arg10.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg4.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(70) int local70 = arg3;
		@Pc(77) int local77 = arg2 + this.aClass91_13.anInt2198;
		@Pc(79) int local79 = -1;
		if (arg11 == 1) {
			local77 += (arg9 - this.aClass91_13.anInt2205 - this.aClass91_13.anInt2198) / 2;
		} else if (arg11 == 2) {
			local77 = arg9 + arg2 - this.aClass91_13.anInt2205;
		}
		if (arg12 == 1) {
			local79 = local46 + this.aClass91_13.method1849(arg10);
			local70 = arg3 + (arg13 - local79) / 2;
		} else if (arg12 == 2) {
			local79 = local46 + this.aClass91_13.method1849(arg10);
			local70 = arg3 + arg13 - local79;
		}
		this.method7681(arg7, arg10, local77, (int[]) null, local70, local44, arg6);
		if (arg1 != null) {
			if (local79 == -1) {
				local79 = local46 + this.aClass91_13.method1849(arg10);
			}
			arg1[3] = this.aClass91_13.anInt2198 + this.aClass91_13.anInt2205;
			arg1[2] = local79;
			arg1[1] = local77 - this.aClass91_13.anInt2198;
			arg1[0] = local70;
		}
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI[IIII[Lclient!hh;Lclient!aa;Ljava/lang/String;)V")
	private void method7680(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class6[] arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) String arg7) {
		@Pc(7) int local7 = arg4 - this.aClass91_13.anInt2208;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg7.length();
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
			@Pc(37) char local37 = (char) (Static225.method3318(arg7.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local13 = local26;
			} else {
				if (local37 == '>' && local13 != -1) {
					@Pc(57) String local57 = arg7.substring(local13 + 1, local26);
					local13 = -1;
					if (local57.equals("lt")) {
						local37 = '<';
					} else if (local57.equals("gt")) {
						local37 = '>';
					} else if (local57.equals("nbsp")) {
						local37 = ' ';
					} else if (local57.equals("shy")) {
						local37 = '\u00ad';
					} else if (local57.equals("times")) {
						local37 = '×';
					} else if (local57.equals("euro")) {
						local37 = '€';
					} else if (local57.equals("copy")) {
						local37 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									@Pc(117) int local117 = Static505.method6599(local57.substring(4));
									@Pc(121) Class6 local121 = arg5[local117];
									@Pc(130) int local130 = arg1 == null ? local121.method5134() : arg1[local117];
									if ((Static638.anInt10506 & 0xFF000000) == -16777216) {
										local121.method5133(arg3, local7 + this.aClass91_13.anInt2208 - local130, 1, 0, 1);
									} else {
										local121.method5133(arg3, local7 + this.aClass91_13.anInt2208 - local130, 0, Static638.anInt10506 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg3 += arg5[local117].method5130();
								} catch (@Pc(183) Exception local183) {
								}
							} else {
								this.method7689(local57);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass91_13.method1855(local37, local15);
					}
					if (local37 == ' ') {
						if (Static393.anInt6536 > 0) {
							Static570.anInt9194 += Static393.anInt6536;
							arg3 += Static570.anInt9194 >> 8;
							Static570.anInt9194 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static116.anInt2120 & 0xFF000000) != 0) {
							this.fa(local37, arg3 + 1, local7 + 1, Static116.anInt2120, true);
						}
						this.fa(local37, arg3, local7, Static638.anInt10506, false);
					} else {
						if ((Static116.anInt2120 & 0xFF000000) != 0) {
							this.method7677(local37, arg3 + 1, local7 + 1, Static116.anInt2120, true, arg6, arg2, arg0);
						}
						this.method7677(local37, arg3, local7, Static638.anInt10506, false, arg6, arg2, arg0);
					}
					@Pc(304) int local304 = this.aClass91_13.method1853(local37);
					if (Static422.anInt6867 != -1) {
						this.aClass95_14.method8066(arg3, local304, local7 + (int) ((double) this.aClass91_13.anInt2208 * 0.7D), Static422.anInt6867);
					}
					if (Static268.anInt4647 != -1) {
						this.aClass95_14.method8066(arg3, local304, this.aClass91_13.anInt2208 + local7 + 1, Static268.anInt4647);
					}
					arg3 += local304;
					local15 = local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!hh;Ljava/lang/String;I[IIB[I[I)V")
	private void method7681(@OriginalArg(0) Class6[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass91_13.anInt2208;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			@Pc(39) char local39 = (char) (Static225.method3318(arg1.charAt(local26)) & 0xFF);
			if (local39 == '<') {
				local13 = local26;
			} else {
				@Pc(123) int local123;
				@Pc(131) int local131;
				if (local39 == '>' && local13 != -1) {
					@Pc(59) String local59 = arg1.substring(local13 + 1, local26);
					local13 = -1;
					if (local59.equals("lt")) {
						local39 = '<';
					} else if (local59.equals("gt")) {
						local39 = '>';
					} else if (local59.equals("nbsp")) {
						local39 = ' ';
					} else if (local59.equals("shy")) {
						local39 = '\u00ad';
					} else if (local59.equals("times")) {
						local39 = '×';
					} else if (local59.equals("euro")) {
						local39 = '€';
					} else if (local59.equals("copy")) {
						local39 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local123 = 0;
									} else {
										local123 = arg5[local17];
									}
									if (arg3 == null) {
										local131 = 0;
									} else {
										local131 = arg3[local17];
									}
									local17++;
									@Pc(144) int local144 = Static505.method6599(local59.substring(4));
									@Pc(148) Class6 local148 = arg0[local144];
									@Pc(157) int local157 = arg6 == null ? local148.method5134() : arg6[local144];
									local148.method5133(arg4 + local123, this.aClass91_13.anInt2208 + local7 - local157 - -local131, 1, 0, 1);
									arg4 += arg0[local144].method5130();
									local15 = -1;
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method7689(local59);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass91_13.method1855(local39, local15);
					}
					@Pc(226) int local226;
					if (arg5 == null) {
						local226 = 0;
					} else {
						local226 = arg5[local17];
					}
					if (arg3 == null) {
						local123 = 0;
					} else {
						local123 = arg3[local17];
					}
					if (local39 != ' ') {
						if ((Static116.anInt2120 & 0xFF000000) != 0) {
							this.fa(local39, arg4 + local226 + 1, local123 + local7 - -1, Static116.anInt2120, true);
						}
						this.fa(local39, arg4 + local226, local123 + local7, Static638.anInt10506, false);
					} else if (Static393.anInt6536 > 0) {
						Static570.anInt9194 += Static393.anInt6536;
						arg4 += Static570.anInt9194 >> 8;
						Static570.anInt9194 &= 0xFF;
					}
					local17++;
					local131 = this.aClass91_13.method1853(local39);
					if (Static422.anInt6867 != -1) {
						this.aClass95_14.method8066(arg4, local131, local7 + (int) ((double) this.aClass91_13.anInt2208 * 0.7D), Static422.anInt6867);
					}
					if (Static268.anInt4647 != -1) {
						this.aClass95_14.method8066(arg4, local131, this.aClass91_13.anInt2208 + local7, Static268.anInt4647);
					}
					local15 = local39;
					arg4 += local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method7682(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static570.anInt9194 = 0;
		Static422.anInt6867 = -1;
		Static268.anInt4647 = -1;
		Static393.anInt6536 = 0;
		Static481.anInt10584 = arg0;
		Static638.anInt10506 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static327.anInt5431 = arg1;
		Static116.anInt2120 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method7683(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
			@Pc(25) char local25 = arg1.charAt(local19);
			if (local25 == '<') {
				local9 = true;
			} else if (local25 == '>') {
				local9 = false;
			} else if (!local9 && local25 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static393.anInt6536 = (arg0 - this.aClass91_13.method1849(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
	public final void method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg3 != null) {
			this.method7682(arg0, arg4);
			this.method7680(0, (int[]) null, 0, arg1, arg2, (Class6[]) null, (Class1) null, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I[IIIIII[Lclient!hh;IIILclient!aa;)I")
	public final int method7686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class6[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class1 arg15) {
		if (arg3 == null) {
			return 0;
		}
		this.method7682(arg9, arg0);
		if (arg8 == 0) {
			arg8 = this.aClass91_13.anInt2208;
		}
		@Pc(44) int[] local44;
		if (arg6 < arg8 + this.aClass91_13.anInt2198 + this.aClass91_13.anInt2205 && arg6 < arg8 + arg8) {
			local44 = null;
		} else {
			local44 = new int[] { arg1 };
		}
		@Pc(62) int local62 = this.aClass91_13.method1851(arg11, local44, Static395.aStringArray48, arg3);
		if (arg10 == -1) {
			arg10 = arg6 / arg8;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local62 >= arg10) {
			local62 = arg10;
			Static395.aStringArray48[arg10 - 1] = this.aClass91_13.method1847(arg11, arg1, Static395.aStringArray48[arg10 - 1]);
		}
		if (arg12 == 3 && local62 == 1) {
			arg12 = 1;
		}
		@Pc(123) int local123;
		@Pc(176) int local176;
		if (arg12 == 0) {
			local123 = arg7 + this.aClass91_13.anInt2198;
		} else if (arg12 == 1) {
			local123 = arg7 + this.aClass91_13.anInt2198 + (-(arg8 * (local62 - 1)) + -this.aClass91_13.anInt2205 + arg6 + -this.aClass91_13.anInt2198) / 2;
		} else if (arg12 == 2) {
			local123 = arg7 + arg6 - (local62 - 1) * arg8 - this.aClass91_13.anInt2205;
		} else {
			local176 = (arg6 - (local62 - 1) * arg8 - this.aClass91_13.anInt2205 - this.aClass91_13.anInt2198) / (local62 - -1);
			if (local176 < 0) {
				local176 = 0;
			}
			local123 = arg7 + this.aClass91_13.anInt2198 + local176;
			arg8 += local176;
		}
		for (local176 = 0; local176 < local62; local176++) {
			if (arg13 == 0) {
				this.method7680(arg14, arg5, arg4, arg2, local123, arg11, arg15, Static395.aStringArray48[local176]);
			} else if (arg13 == 1) {
				this.method7680(arg14, arg5, arg4, arg2 + (arg1 - this.aClass91_13.method1849(Static395.aStringArray48[local176])) / 2, local123, arg11, arg15, Static395.aStringArray48[local176]);
			} else if (arg13 == 2) {
				this.method7680(arg14, arg5, arg4, arg1 + arg2 - this.aClass91_13.method1849(Static395.aStringArray48[local176]), local123, arg11, arg15, Static395.aStringArray48[local176]);
			} else if (local176 == local62 - 1) {
				this.method7680(arg14, arg5, arg4, arg2, local123, arg11, arg15, Static395.aStringArray48[local176]);
			} else {
				this.method7683(arg1, Static395.aStringArray48[local176]);
				this.method7680(arg14, arg5, arg4, arg2, local123, arg11, arg15, Static395.aStringArray48[local176]);
				Static393.anInt6536 = 0;
			}
			local123 += arg8;
		}
		return local62;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method7687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method7682(arg0, -16777216);
		@Pc(22) double local22 = 7.0D - (double) arg1 / 8.0D;
		if (local22 < 0.0D) {
			local22 = 0.0D;
		}
		@Pc(31) int local31 = arg5.length();
		@Pc(34) int[] local34 = new int[local31];
		for (@Pc(36) int local36 = 0; local36 < local31; local36++) {
			local34[local36] = (int) (local22 * Math.sin((double) arg3 + (double) local36 / 1.5D));
		}
		this.method7681((Class6[]) null, arg5, arg4, local34, arg2 - this.aClass91_13.method1849(arg5) / 2, (int[]) null, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method7688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method7682(arg3, -16777216);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) arg1 / 5.0D + (double) local21 / 2.0D) * 5.0D);
		}
		this.method7681((Class6[]) null, arg2, arg4, local19, arg0 - this.aClass91_13.method1849(arg2) / 2, (int[]) null, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method7689(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static638.anInt10506 = Static638.anInt10506 & 0xFF000000 | Static80.method1318(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static638.anInt10506 = Static481.anInt10584 & 0xFFFFFF | Static638.anInt10506 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static638.anInt10506 = Static80.method1318(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static638.anInt10506 = Static481.anInt10584;
			} else if (arg0.startsWith("str=")) {
				Static422.anInt6867 = Static638.anInt10506 & 0xFF000000 | Static80.method1318(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static422.anInt6867 = Static638.anInt10506 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static422.anInt6867 = -1;
			} else if (arg0.startsWith("u=")) {
				Static268.anInt4647 = Static638.anInt10506 & 0xFF000000 | Static80.method1318(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static268.anInt4647 = Static638.anInt10506 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static268.anInt4647 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static116.anInt2120 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static116.anInt2120 = Static638.anInt10506 & 0xFF000000 | Static80.method1318(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static116.anInt2120 = Static638.anInt10506 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static116.anInt2120 = Static327.anInt5431;
			} else if (arg0.equals("br")) {
				this.method7682(Static481.anInt10584, Static327.anInt5431);
			}
		} catch (@Pc(183) Exception local183) {
		}
	}
}
