import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class64 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Lclient!fp;")
	private final Class114 aClass114_41;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Lclient!ha;")
	private final Class87 aClass87_13;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!fp;)V")
	protected Class64(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class114 arg1) {
		this.aClass114_41 = arg1;
		this.aClass87_13 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[IIILclient!aa;IIIILjava/lang/String;III[Lclient!kr;)I")
	public final int method7490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class20[] arg14) {
		return this.method7500(arg2, arg0, arg3, arg7, arg1, arg14, arg9, arg12, arg5, arg11, arg4, arg10, arg6, arg8, 0, arg13);
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method7491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static9.anInt176 = 0;
		Static407.anInt7439 = -1;
		Static585.anInt9590 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static287.anInt5385 = -1;
		Static304.anInt5623 = arg1;
		Static196.anInt4203 = arg1;
		Static290.anInt5466 = arg0;
		Static582.anInt9559 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/util/Random;IILjava/lang/String;IZ[II[Lclient!kr;I)I")
	public final int method7492(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(8) Class20[] arg5, @OriginalArg(9) int arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg0.setSeed((long) arg1);
		@Pc(24) int local24 = (arg0.nextInt() & 0x1F) + 192;
		this.method7491((local24 | 0x0) << 24, local24 << 24 | 0xFFFFFF);
		@Pc(44) int local44 = arg2.length();
		@Pc(47) int[] local47 = new int[local44];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < local44; local51++) {
			local47[local51] = local49;
			if ((arg0.nextInt() & 0x3) == 0) {
				local49++;
			}
		}
		this.method7501(arg5, local47, arg6, arg3, null, arg2, arg4);
		return local49;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IBI)V")
	public final void method7493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7491(arg4, arg3);
			this.method7497(arg1, null, arg2, 0, null, 0, arg0 - this.aClass114_41.method3015(arg2) / 2, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method7494(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method7491(-16777216, arg0);
		@Pc(14) int local14 = arg1.length();
		@Pc(17) int[] local17 = new int[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			local17[local19] = (int) (Math.sin((double) local19 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method7501(null, null, arg4 - this.aClass114_41.method3015(arg1) / 2, arg3, local17, arg1, null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method7495(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
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
			Static585.anInt9590 = (arg0 - this.aClass114_41.method3015(arg1) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;[II[I[Lclient!kr;ILjava/util/Random;IIII)I")
	public final int method7496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) Class20[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Random arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg4 == null) {
			return 0;
		}
		arg10.setSeed((long) arg1);
		@Pc(18) int local18 = (arg10.nextInt() & 0x1F) + 192;
		this.method7491(arg11 & 0xFFFFFF | local18 << 24, arg6 & 0xFFFFFF | local18 << 24);
		@Pc(38) int local38 = arg4.length();
		@Pc(41) int[] local41 = new int[local38];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local38; local45++) {
			local41[local45] = local43;
			if ((arg10.nextInt() & 0x3) == 0) {
				local43++;
			}
		}
		@Pc(70) int local70 = arg0;
		@Pc(76) int local76 = arg3 + this.aClass114_41.anInt3638;
		@Pc(78) int local78 = -1;
		if (arg13 == 1) {
			local76 += (arg9 - this.aClass114_41.anInt3638 - this.aClass114_41.anInt3631) / 2;
		} else if (arg13 == 2) {
			local76 = arg9 + arg3 - this.aClass114_41.anInt3631;
		}
		if (arg12 == 1) {
			local78 = this.aClass114_41.method3015(arg4) + local43;
			local70 = arg0 + (arg2 - local78) / 2;
		} else if (arg12 == 2) {
			local78 = local43 + this.aClass114_41.method3015(arg4);
			local70 = arg0 + arg2 - local78;
		}
		this.method7501(arg8, local41, local70, local76, null, arg4, arg5);
		if (arg7 != null) {
			if (local78 == -1) {
				local78 = this.aClass114_41.method3015(arg4) + local43;
			}
			arg7[0] = local70;
			arg7[1] = local76 - this.aClass114_41.anInt3638;
			arg7[2] = local78;
			arg7[3] = this.aClass114_41.anInt3638 + this.aClass114_41.anInt3631;
		}
		return local43;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[ILjava/lang/String;BILclient!aa;II[Lclient!kr;)V")
	private void method7497(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class20[] arg7) {
		@Pc(5) int local5 = arg0 - this.aClass114_41.anInt3643;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(16) int local16 = arg2.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(28) char local28 = (char) (Static124.method2512(arg2.charAt(local18)) & 0xFF);
			if (local28 == '<') {
				local11 = local18;
			} else {
				if (local28 == '>' && local11 != -1) {
					@Pc(49) String local49 = arg2.substring(local11 + 1, local18);
					local11 = -1;
					if (local49.equals("lt")) {
						local28 = '<';
					} else if (local49.equals("gt")) {
						local28 = '>';
					} else if (local49.equals("nbsp")) {
						local28 = ' ';
					} else if (local49.equals("shy")) {
						local28 = '\u00ad';
					} else if (local49.equals("times")) {
						local28 = '×';
					} else if (local49.equals("euro")) {
						local28 = '€';
					} else if (local49.equals("copy")) {
						local28 = '©';
					} else {
						if (!local49.equals("reg")) {
							if (local49.startsWith("img=")) {
								try {
									@Pc(114) int local114 = Static56.method1026(local49.substring(4));
									@Pc(118) Class20 local118 = arg7[local114];
									@Pc(127) int local127 = arg1 == null ? local118.method4576() : arg1[local114];
									if ((Static196.anInt4203 & 0xFF000000) == -16777216) {
										local118.method4581(arg6, this.aClass114_41.anInt3643 + local5 - local127, 1, 0, 1);
									} else {
										local118.method4581(arg6, this.aClass114_41.anInt3643 + local5 - local127, 0, Static196.anInt4203 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg6 += arg7[local114].method4588();
									local13 = -1;
								} catch (@Pc(178) Exception local178) {
								}
							} else {
								this.method7498(local49);
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg6 += this.aClass114_41.method3009(local13, local28);
					}
					if (local28 == ' ') {
						if (Static585.anInt9590 > 0) {
							Static9.anInt176 += Static585.anInt9590;
							arg6 += Static9.anInt176 >> 8;
							Static9.anInt176 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static582.anInt9559 & 0xFF000000) != 0) {
							this.fa(local28, arg6 + 1, local5 + 1, Static582.anInt9559, true);
						}
						this.fa(local28, arg6, local5, Static196.anInt4203, false);
					} else {
						if ((Static582.anInt9559 & 0xFF000000) != 0) {
							this.method7507(local28, arg6 + 1, local5 + 1, Static582.anInt9559, true, arg4, arg5, arg3);
						}
						this.method7507(local28, arg6, local5, Static196.anInt4203, false, arg4, arg5, arg3);
					}
					@Pc(283) int local283 = this.aClass114_41.method3011(local28);
					if (Static287.anInt5385 != -1) {
						this.aClass87_13.method7888((int) ((double) this.aClass114_41.anInt3643 * 0.7D) + local5, local283, Static287.anInt5385, arg6);
					}
					if (Static407.anInt7439 != -1) {
						this.aClass87_13.method7888(local5 + this.aClass114_41.anInt3643 + 1, local283, Static407.anInt7439, arg6);
					}
					arg6 += local283;
					local13 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method7498(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static196.anInt4203 = Static196.anInt4203 & 0xFF000000 | Static193.method3439(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static196.anInt4203 = Static304.anInt5623 & 0xFFFFFF | Static196.anInt4203 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static196.anInt4203 = Static193.method3439(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static196.anInt4203 = Static304.anInt5623;
			} else if (arg0.startsWith("str=")) {
				Static287.anInt5385 = Static196.anInt4203 & 0xFF000000 | Static193.method3439(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static287.anInt5385 = Static196.anInt4203 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static287.anInt5385 = -1;
			} else if (arg0.startsWith("u=")) {
				Static407.anInt7439 = Static196.anInt4203 & 0xFF000000 | Static193.method3439(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static407.anInt7439 = Static196.anInt4203 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static407.anInt7439 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static582.anInt9559 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static582.anInt9559 = Static196.anInt4203 & 0xFF000000 | Static193.method3439(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static582.anInt9559 = Static196.anInt4203 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static582.anInt9559 = Static290.anInt5466;
			} else if (arg0.equals("br")) {
				this.method7491(Static290.anInt5466, Static304.anInt5623);
				return;
			}
		} catch (@Pc(174) Exception local174) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[III[Lclient!kr;ZIIIIILjava/lang/String;Lclient!aa;III)I")
	public final int method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) Class1 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method7491(arg3, arg6);
		if (arg1 == 0) {
			arg1 = this.aClass114_41.anInt3643;
		}
		@Pc(45) int[] local45;
		if (arg8 < this.aClass114_41.anInt3631 + this.aClass114_41.anInt3638 + arg1 && arg8 < arg1 + arg1) {
			local45 = null;
		} else {
			local45 = new int[] { arg13 };
		}
		@Pc(62) int local62 = this.aClass114_41.method3010(arg5, local45, Static447.aStringArray32, arg11);
		if (arg14 == -1) {
			arg14 = arg8 / arg1;
			if (arg14 <= 0) {
				arg14 = 1;
			}
		}
		if (arg14 > 0 && arg14 <= local62) {
			Static447.aStringArray32[arg14 - 1] = this.aClass114_41.method3018(arg13, arg5, Static447.aStringArray32[arg14 - 1]);
			local62 = arg14;
		}
		if (arg7 == 3 && local62 == 1) {
			arg7 = 1;
		}
		@Pc(156) int local156;
		@Pc(143) int local143;
		if (arg7 == 0) {
			local156 = this.aClass114_41.anInt3638 + arg10;
		} else if (arg7 == 1) {
			local156 = (arg8 - arg1 * (local62 - 1) - this.aClass114_41.anInt3638 - this.aClass114_41.anInt3631) / 2 + arg10 + this.aClass114_41.anInt3638;
		} else if (arg7 == 2) {
			local156 = arg8 + arg10 - this.aClass114_41.anInt3631 - (local62 + -1) * arg1;
		} else {
			local143 = (arg8 - arg1 * (local62 - 1) - this.aClass114_41.anInt3631 - this.aClass114_41.anInt3638) / (local62 + 1);
			if (local143 < 0) {
				local143 = 0;
			}
			local156 = this.aClass114_41.anInt3638 + arg10 + local143;
			arg1 += local143;
		}
		for (local143 = 0; local143 < local62; local143++) {
			if (arg9 == 0) {
				this.method7497(local156, arg2, Static447.aStringArray32[local143], arg15, arg12, arg4, arg0, arg5);
			} else if (arg9 == 1) {
				this.method7497(local156, arg2, Static447.aStringArray32[local143], arg15, arg12, arg4, (arg13 - this.aClass114_41.method3015(Static447.aStringArray32[local143])) / 2 + arg0, arg5);
			} else if (arg9 == 2) {
				this.method7497(local156, arg2, Static447.aStringArray32[local143], arg15, arg12, arg4, arg0 + arg13 - this.aClass114_41.method3015(Static447.aStringArray32[local143]), arg5);
			} else if (local143 == local62 - 1) {
				this.method7497(local156, arg2, Static447.aStringArray32[local143], arg15, arg12, arg4, arg0, arg5);
			} else {
				this.method7495(arg13, Static447.aStringArray32[local143]);
				this.method7497(local156, arg2, Static447.aStringArray32[local143], arg15, arg12, arg4, arg0, arg5);
				Static585.anInt9590 = 0;
			}
			local156 += arg1;
		}
		return local62;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!kr;[III[IILjava/lang/String;[I)V")
	private void method7501(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg3 - this.aClass114_41.anInt3643;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg5.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(36) char local36 = (char) (Static124.method2512(arg5.charAt(local26)) & 0xFF);
			if (local36 == '<') {
				local11 = local26;
			} else {
				@Pc(116) int local116;
				@Pc(125) int local125;
				if (local36 == '>' && local11 != -1) {
					@Pc(57) String local57 = arg5.substring(local11 + 1, local26);
					local11 = -1;
					if (local57.equals("lt")) {
						local36 = '<';
					} else if (local57.equals("gt")) {
						local36 = '>';
					} else if (local57.equals("nbsp")) {
						local36 = ' ';
					} else if (local57.equals("shy")) {
						local36 = '\u00ad';
					} else if (local57.equals("times")) {
						local36 = '×';
					} else if (local57.equals("euro")) {
						local36 = '€';
					} else if (local57.equals("copy")) {
						local36 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local116 = 0;
									} else {
										local116 = arg1[local21];
									}
									if (arg4 == null) {
										local125 = 0;
									} else {
										local125 = arg4[local21];
									}
									local21++;
									@Pc(137) int local137 = Static56.method1026(local57.substring(4));
									@Pc(141) Class20 local141 = arg0[local137];
									@Pc(150) int local150 = arg6 == null ? local141.method4576() : arg6[local137];
									local141.method4581(local116 + arg2, this.aClass114_41.anInt3643 + (local9 - (local150 + -local125)), 1, 0, 1);
									arg2 += arg0[local137].method4588();
									local13 = -1;
								} catch (@Pc(179) Exception local179) {
								}
							} else {
								this.method7498(local57);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg2 += this.aClass114_41.method3009(local13, local36);
					}
					@Pc(213) int local213;
					if (arg1 == null) {
						local213 = 0;
					} else {
						local213 = arg1[local21];
					}
					if (arg4 == null) {
						local116 = 0;
					} else {
						local116 = arg4[local21];
					}
					local21++;
					if (local36 != ' ') {
						if ((Static582.anInt9559 & 0xFF000000) != 0) {
							this.fa(local36, arg2 + local213 + 1, local116 + local9 + 1, Static582.anInt9559, true);
						}
						this.fa(local36, local213 + arg2, local116 + local9, Static196.anInt4203, false);
					} else if (Static585.anInt9590 > 0) {
						Static9.anInt176 += Static585.anInt9590;
						arg2 += Static9.anInt176 >> 8;
						Static9.anInt176 &= 0xFF;
					}
					local125 = this.aClass114_41.method3011(local36);
					if (Static287.anInt5385 != -1) {
						this.aClass87_13.method7888((int) ((double) this.aClass114_41.anInt3643 * 0.7D) + local9, local125, Static287.anInt5385, arg2);
					}
					if (Static407.anInt7439 != -1) {
						this.aClass87_13.method7888(this.aClass114_41.anInt3643 + local9, local125, Static407.anInt7439, arg2);
					}
					local13 = local36;
					arg2 += local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIILjava/lang/String;I)V")
	public final void method7502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method7491(-16777216, arg0);
		@Pc(14) int local14 = arg3.length();
		@Pc(17) int[] local17 = new int[local14];
		@Pc(20) int[] local20 = new int[local14];
		for (@Pc(28) int local28 = 0; local28 < local14; local28++) {
			local17[local28] = (int) (Math.sin((double) local28 / 5.0D + (double) arg1 / 5.0D) * 5.0D);
			local20[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method7501(null, local17, arg2 - this.aClass114_41.method3015(arg3) / 2, arg4, local20, arg3, null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIIIILjava/lang/String;)V")
	public final void method7503(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method7491(-16777216, arg1);
		@Pc(18) double local18 = 7.0D - (double) arg3 / 8.0D;
		if (local18 < 0.0D) {
			local18 = 0.0D;
		}
		@Pc(27) int local27 = arg5.length();
		@Pc(30) int[] local30 = new int[local27];
		for (@Pc(38) int local38 = 0; local38 < local27; local38++) {
			local30[local38] = (int) (Math.sin((double) arg4 + (double) local38 / 1.5D) * local18);
		}
		this.method7501(null, null, arg2 - this.aClass114_41.method3015(arg5) / 2, arg0, local30, arg5, null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IB)V")
	public final void method7504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg3 != null) {
			this.method7491(arg1, arg2);
			this.method7497(arg4, null, arg3, 0, null, 0, arg0 - this.aClass114_41.method3015(arg3), null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;[Lclient!kr;[II)V")
	public final void method7506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Class20[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg3 != null) {
			this.method7491(0, arg0);
			this.method7497(arg2, arg5, arg3, 0, null, 0, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method7507(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method7508(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7491(arg2, arg4);
			this.method7497(arg0, null, arg1, 0, null, 0, arg3, null);
		}
	}
}
