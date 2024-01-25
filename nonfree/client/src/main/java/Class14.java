import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class14 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!za;")
	private final Class75 aClass75_11;

	@OriginalMember(owner = "client!la", name = "A", descriptor = "Lclient!aq;")
	private final Class15 aClass15_8;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!za;Lclient!aq;)V")
	protected Class14(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class15 arg1) {
		this.aClass75_11 = arg0;
		this.aClass15_8 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIZI)V")
	public final void method4877(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method4885(-16777216, arg3);
		@Pc(24) int local24 = arg1.length();
		@Pc(27) int[] local27 = new int[local24];
		@Pc(30) int[] local30 = new int[local24];
		for (@Pc(32) int local32 = 0; local32 < local24; local32++) {
			local27[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg2 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) arg2 / 5.0D + (double) local32 / 3.0D) * 5.0D);
		}
		this.method4889(arg4 - this.aClass15_8.method320(arg1) / 2, arg1, local27, local30, null, null, arg0);
	}

	@OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
	protected abstract void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method4880(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(16) int local16 = 0; local16 < arg1.length(); local16++) {
			@Pc(22) char local22 = arg1.charAt(local16);
			if (local22 == '<') {
				local9 = true;
			} else if (local22 == '>') {
				local9 = false;
			} else if (!local9 && local22 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static15.anInt352 = (arg0 - this.aClass15_8.method320(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[I[Lclient!o;IILjava/lang/String;IILclient!ta;)V")
	private void method4881(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class41[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class102 arg7) {
		@Pc(15) int local15 = arg5 - this.aClass15_8.anInt324;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(22) int local22 = arg4.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(34) char local34 = (char) (Static13.method316(arg4.charAt(local24)) & 0xFF);
			if (local34 == '<') {
				local17 = local24;
			} else {
				if (local34 == '>' && local17 != -1) {
					@Pc(54) String local54 = arg4.substring(local17 + 1, local24);
					local17 = -1;
					if (local54.equals("lt")) {
						local34 = '<';
					} else if (local54.equals("gt")) {
						local34 = '>';
					} else if (local54.equals("nbsp")) {
						local34 = ' ';
					} else if (local54.equals("shy")) {
						local34 = '\u00ad';
					} else if (local54.equals("times")) {
						local34 = '×';
					} else if (local54.equals("euro")) {
						local34 = '€';
					} else if (local54.equals("copy")) {
						local34 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=")) {
								try {
									@Pc(104) int local104 = Static389.method5412(local54.substring(4));
									@Pc(108) Class41 local108 = arg2[local104];
									@Pc(117) int local117 = arg1 == null ? local108.Q() : arg1[local104];
									if ((Static45.anInt721 & 0xFF000000) == -16777216) {
										local108.W(arg0, local15 + this.aClass15_8.anInt324 - local117, 1, 0, 1);
									} else {
										local108.W(arg0, local15 + this.aClass15_8.anInt324 - local117, 0, Static45.anInt721 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local19 = -1;
									arg0 += arg2[local104].RA();
								} catch (@Pc(169) Exception local169) {
								}
							} else {
								this.method4892(local54);
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg0 += this.aClass15_8.method325(local34, local19);
					}
					if (local34 == ' ') {
						if (Static15.anInt352 > 0) {
							Static119.anInt2051 += Static15.anInt352;
							arg0 += Static119.anInt2051 >> 8;
							Static119.anInt2051 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static342.anInt6098 & 0xFF000000) != 0) {
							this.B(local34, arg0 + 1, local15 + 1, Static342.anInt6098, true);
						}
						this.B(local34, arg0, local15, Static45.anInt721, false);
					} else {
						if ((Static342.anInt6098 & 0xFF000000) != 0) {
							this.method4896(local34, arg0 + 1, local15 + 1, Static342.anInt6098, true, arg7, arg3, arg6);
						}
						this.method4896(local34, arg0, local15, Static45.anInt721, false, arg7, arg3, arg6);
					}
					@Pc(292) int local292 = this.aClass15_8.method324(local34);
					if (Static201.anInt3446 != -1) {
						this.aClass75_11.method6022((int) ((double) this.aClass15_8.anInt324 * 0.7D) + local15, Static201.anInt3446, arg0, local292);
					}
					if (Static385.anInt6677 != -1) {
						this.aClass75_11.method6022(this.aClass15_8.anInt324 + local15 + 1, Static385.anInt6677, arg0, local292);
					}
					arg0 += local292;
					local19 = local34;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBIIILjava/lang/String;)V")
	public final void method4882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method4885(-1, arg0);
			this.method4881(arg1 - this.aClass15_8.method320(arg3), null, null, 0, arg3, arg2, 0, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
	public final void method4883(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method4885(arg4, arg3);
			this.method4881(arg1 - this.aClass15_8.method320(arg0) / 2, null, null, 0, arg0, arg2, 0, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIIILjava/lang/String;)V")
	public final void method4884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method4885(-16777216, arg1);
		@Pc(21) int local21 = arg4.length();
		@Pc(24) int[] local24 = new int[local21];
		for (@Pc(26) int local26 = 0; local26 < local21; local26++) {
			local24[local26] = (int) (Math.sin((double) arg2 / 5.0D + (double) local26 / 2.0D) * 5.0D);
		}
		this.method4889(arg3 - this.aClass15_8.method320(arg4) / 2, arg4, null, local24, null, null, arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method4885(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static201.anInt3446 = -1;
		Static230.anInt3827 = arg1;
		Static45.anInt721 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static385.anInt6677 = -1;
		Static15.anInt352 = 0;
		Static119.anInt2051 = 0;
		Static451.anInt7180 = arg0;
		Static342.anInt6098 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
	public final void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method4885(arg1, arg0);
			this.method4881(arg3, null, null, 0, arg2, arg4, 0, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;[I[I[I[Lclient!o;I)V")
	private void method4889(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class41[] arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg6 - this.aClass15_8.anInt324;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = 0;
		@Pc(22) int local22 = arg1.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(34) char local34 = (char) (Static13.method316(arg1.charAt(local24)) & 0xFF);
			if (local34 == '<') {
				local15 = local24;
			} else {
				@Pc(118) int local118;
				@Pc(125) int local125;
				if (local34 == '>' && local15 != -1) {
					@Pc(54) String local54 = arg1.substring(local15 + 1, local24);
					local15 = -1;
					if (local54.equals("lt")) {
						local34 = '<';
					} else if (local54.equals("gt")) {
						local34 = '>';
					} else if (local54.equals("nbsp")) {
						local34 = ' ';
					} else if (local54.equals("shy")) {
						local34 = '\u00ad';
					} else if (local54.equals("times")) {
						local34 = '×';
					} else if (local54.equals("euro")) {
						local34 = '€';
					} else if (local54.equals("copy")) {
						local34 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=")) {
								try {
									if (arg2 == null) {
										local118 = 0;
									} else {
										local118 = arg2[local19];
									}
									if (arg3 == null) {
										local125 = 0;
									} else {
										local125 = arg3[local19];
									}
									local19++;
									@Pc(137) int local137 = Static389.method5412(local54.substring(4));
									@Pc(141) Class41 local141 = arg5[local137];
									@Pc(150) int local150 = arg4 == null ? local141.Q() : arg4[local137];
									local141.W(arg0 + local118, -local150 + local5 + this.aClass15_8.anInt324 + local125, 1, 0, 1);
									local17 = -1;
									arg0 += arg5[local137].RA();
								} catch (@Pc(179) Exception local179) {
								}
							} else {
								this.method4892(local54);
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local15 == -1) {
					if (local17 != -1) {
						arg0 += this.aClass15_8.method325(local34, local17);
					}
					@Pc(208) int local208;
					if (arg2 == null) {
						local208 = 0;
					} else {
						local208 = arg2[local19];
					}
					if (arg3 == null) {
						local118 = 0;
					} else {
						local118 = arg3[local19];
					}
					local19++;
					if (local34 != ' ') {
						if ((Static342.anInt6098 & 0xFF000000) != 0) {
							this.B(local34, arg0 + local208 + 1, local5 - (-1 - local118), Static342.anInt6098, true);
						}
						this.B(local34, arg0 + local208, local118 + local5, Static45.anInt721, false);
					} else if (Static15.anInt352 > 0) {
						Static119.anInt2051 += Static15.anInt352;
						arg0 += Static119.anInt2051 >> 8;
						Static119.anInt2051 &= 0xFF;
					}
					local125 = this.aClass15_8.method324(local34);
					if (Static201.anInt3446 != -1) {
						this.aClass75_11.method6022((int) ((double) this.aClass15_8.anInt324 * 0.7D) + local5, Static201.anInt3446, arg0, local125);
					}
					if (Static385.anInt6677 != -1) {
						this.aClass75_11.method6022(local5 + this.aClass15_8.anInt324, Static385.anInt6677, arg0, local125);
					}
					local17 = local34;
					arg0 += local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILclient!ta;I[II[Lclient!o;Ljava/lang/String;IIII)I")
	public final int method4891(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class102 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class41[] arg8, @OriginalArg(11) String arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method4897(arg4, arg12, arg9, 0, arg7, arg8, arg6, arg3, arg1, arg2, arg11, 0, 1, arg5, arg0, arg10);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method4892(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static45.anInt721 = Static45.anInt721 & 0xFF000000 | Static72.method1120(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static45.anInt721 = Static230.anInt3827 & 0xFFFFFF | Static45.anInt721 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static45.anInt721 = Static72.method1120(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static45.anInt721 = Static230.anInt3827;
			} else if (arg0.startsWith("str=")) {
				Static201.anInt3446 = Static45.anInt721 & 0xFF000000 | Static72.method1120(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static201.anInt3446 = Static45.anInt721 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static201.anInt3446 = -1;
			} else if (arg0.startsWith("u=")) {
				Static385.anInt6677 = Static45.anInt721 & 0xFF000000 | Static72.method1120(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static385.anInt6677 = Static45.anInt721 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static385.anInt6677 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static342.anInt6098 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static342.anInt6098 = Static45.anInt721 & 0xFF000000 | Static72.method1120(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static342.anInt6098 = Static45.anInt721 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static342.anInt6098 = Static451.anInt7180;
			} else if (arg0.equals("br")) {
				this.method4885(Static451.anInt7180, Static230.anInt3827);
			}
		} catch (@Pc(184) Exception local184) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lclient!o;IILjava/lang/String;I[II[ILjava/util/Random;III)I")
	public final int method4893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class41[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) Random arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == null) {
			return 0;
		}
		arg11.setSeed((long) arg12);
		@Pc(21) int local21 = (arg11.nextInt() & 0x1F) + 192;
		this.method4885(arg1 & 0xFFFFFF | local21 << 24, arg2 & 0xFFFFFF | local21 << 24);
		@Pc(41) int local41 = arg6.length();
		@Pc(49) int[] local49 = new int[local41];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local41; local53++) {
			local49[local53] = local51;
			if ((arg11.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		@Pc(74) int local74 = arg4;
		@Pc(81) int local81 = arg13 + this.aClass15_8.anInt326;
		@Pc(83) int local83 = -1;
		if (arg5 == 1) {
			local81 += (arg9 - this.aClass15_8.anInt318 - this.aClass15_8.anInt326) / 2;
		} else if (arg5 == 2) {
			local81 = arg9 + arg13 - this.aClass15_8.anInt318;
		}
		if (arg7 == 1) {
			local83 = this.aClass15_8.method320(arg6) + local51;
			local74 = arg4 + (arg0 - local83) / 2;
		} else if (arg7 == 2) {
			local83 = local51 + this.aClass15_8.method320(arg6);
			local74 = arg4 + arg0 - local83;
		}
		this.method4889(local74, arg6, local49, null, arg8, arg3, local81);
		if (arg10 != null) {
			if (local83 == -1) {
				local83 = this.aClass15_8.method320(arg6) + local51;
			}
			arg10[3] = this.aClass15_8.anInt326 + this.aClass15_8.anInt318;
			arg10[1] = local81 - this.aClass15_8.anInt326;
			arg10[0] = local74;
			arg10[2] = local83;
		}
		return local51;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI[IIILjava/lang/String;[Lclient!o;I)V")
	public final void method4894(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class41[] arg5) {
		if (arg4 != null) {
			this.method4885(0, arg3);
			this.method4881(arg2, arg1, arg5, 0, arg4, arg0, 0, null);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	protected abstract void method4896(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class102 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ta;ILjava/lang/String;II[Lclient!o;[IIIIIIIIIII)I")
	public final int method4897(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class41[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg2 == null) {
			return 0;
		}
		this.method4885(arg4, arg8);
		if (arg3 == 0) {
			arg3 = this.aClass15_8.anInt324;
		}
		@Pc(56) int[] local56;
		if (this.aClass15_8.anInt318 + this.aClass15_8.anInt326 + arg3 > arg14 && arg14 < arg3 + arg3) {
			local56 = null;
		} else {
			local56 = new int[] { arg9 };
		}
		@Pc(69) int local69 = this.aClass15_8.method328(arg2, arg5, Static396.aStringArray64, local56);
		if (arg11 == -1) {
			arg11 = arg14 / arg3;
			if (arg11 <= 0) {
				arg11 = 1;
			}
		}
		if (arg11 > 0 && arg11 <= local69) {
			Static396.aStringArray64[arg11 - 1] = this.aClass15_8.method319(arg5, Static396.aStringArray64[arg11 - 1], arg9);
			local69 = arg11;
		}
		if (arg13 == 3 && local69 == 1) {
			arg13 = 1;
		}
		@Pc(154) int local154;
		@Pc(182) int local182;
		if (arg13 == 0) {
			local154 = arg15 + this.aClass15_8.anInt326;
		} else if (arg13 == 1) {
			local154 = arg15 + this.aClass15_8.anInt326 + (-(arg3 * (local69 - 1)) + -this.aClass15_8.anInt318 + -this.aClass15_8.anInt326 + arg14) / 2;
		} else if (arg13 == 2) {
			local154 = arg15 + arg14 - (local69 - 1) * arg3 - this.aClass15_8.anInt318;
		} else {
			local182 = (arg14 - this.aClass15_8.anInt326 - this.aClass15_8.anInt318 - (local69 + -1) * arg3) / (local69 - -1);
			if (local182 < 0) {
				local182 = 0;
			}
			local154 = local182 + this.aClass15_8.anInt326 + arg15;
			arg3 += local182;
		}
		for (local182 = 0; local182 < local69; local182++) {
			if (arg12 == 0) {
				this.method4881(arg7, arg6, arg5, arg10, Static396.aStringArray64[local182], local154, arg1, arg0);
			} else if (arg12 == 1) {
				this.method4881(arg7 + (arg9 - this.aClass15_8.method320(Static396.aStringArray64[local182])) / 2, arg6, arg5, arg10, Static396.aStringArray64[local182], local154, arg1, arg0);
			} else if (arg12 == 2) {
				this.method4881(arg7 + arg9 - this.aClass15_8.method320(Static396.aStringArray64[local182]), arg6, arg5, arg10, Static396.aStringArray64[local182], local154, arg1, arg0);
			} else if (local69 - 1 == local182) {
				this.method4881(arg7, arg6, arg5, arg10, Static396.aStringArray64[local182], local154, arg1, arg0);
			} else {
				this.method4880(arg9, Static396.aStringArray64[local182]);
				this.method4881(arg7, arg6, arg5, arg10, Static396.aStringArray64[local182], local154, arg1, arg0);
				Static15.anInt352 = 0;
			}
			local154 += arg3;
		}
		return local69;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public final void method4898(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method4885(-16777216, arg2);
		@Pc(20) double local20 = 7.0D - (double) arg1 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg0.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (Math.sin((double) local34 / 1.5D + (double) arg5) * local20);
		}
		this.method4889(arg4 - this.aClass15_8.method320(arg0) / 2, arg0, null, local32, null, null, arg3);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;IB[Lclient!o;[IIIILjava/lang/String;I)I")
	public final int method4899(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class41[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(8) String arg5, @OriginalArg(9) int arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg0.setSeed((long) arg1);
		@Pc(18) int local18 = (arg0.nextInt() & 0x1F) + 192;
		this.method4885((local18 | 0x0) << 24, local18 << 24 | 0xFFFFFF);
		@Pc(38) int local38 = arg5.length();
		@Pc(41) int[] local41 = new int[local38];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local38; local53++) {
			local41[local53] = local51;
			if ((arg0.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		this.method4889(arg6, arg5, local41, null, arg3, arg2, arg4);
		return local51;
	}
}
