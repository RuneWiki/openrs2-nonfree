import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class27 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!ha;")
	private final Class16 aClass16_16;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!ur;")
	private final Class345 aClass345_14;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!ur;)V")
	protected Class27(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class345 arg1) {
		this.aClass16_16 = arg0;
		this.aClass345_14 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
	public final void method6992(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method6997(arg0, arg3);
			this.method7009(arg2, null, arg4 - this.aClass345_14.method8112(arg1), null, arg1, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method6993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 != null) {
			this.method6997(arg3, arg1);
			this.method7009(arg2, null, arg0, null, arg4, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILjava/lang/String;III)V")
	public final void method6994(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method6997(arg3, -16777216);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method7000(arg4 - this.aClass345_14.method8112(arg1) / 2, arg0, null, arg1, null, null, local19);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method6997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static546.anInt9446 = 0;
		Static355.anInt6836 = arg0;
		Static388.anInt7524 = arg0;
		Static34.anInt8117 = -1;
		Static367.anInt6975 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static456.anInt8380 = 0;
		Static629.anInt10498 = arg1;
		Static235.anInt5297 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method6998(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/util/Random;ILjava/lang/String;IIIIII[I[Lclient!hu;[III)I")
	public final int method6999(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) Class21[] arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg2 == null) {
			return 0;
		}
		arg0.setSeed((long) arg1);
		@Pc(25) int local25 = (arg0.nextInt() & 0x1F) + 192;
		this.method6997(arg6 & 0xFFFFFF | local25 << 24, arg3 & 0xFFFFFF | local25 << 24);
		@Pc(45) int local45 = arg2.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg0.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(70) int local70 = arg5;
		@Pc(77) int local77 = arg12 + this.aClass345_14.anInt10013;
		if (arg7 == 1) {
			local77 += (arg8 - this.aClass345_14.anInt10013 - this.aClass345_14.anInt10003) / 2;
		} else if (arg7 == 2) {
			local77 = arg12 + arg8 - this.aClass345_14.anInt10003;
		}
		@Pc(114) int local114 = -1;
		if (arg4 == 1) {
			local114 = local50 + this.aClass345_14.method8112(arg2);
			local70 = arg5 + (arg13 - local114) / 2;
		} else if (arg4 == 2) {
			local114 = local50 + this.aClass345_14.method8112(arg2);
			local70 = arg5 + arg13 - local114;
		}
		this.method7000(local70, local77, arg10, arg2, local48, arg9, null);
		if (arg11 != null) {
			if (local114 == -1) {
				local114 = this.aClass345_14.method8112(arg2) + local50;
			}
			arg11[1] = local77 - this.aClass345_14.anInt10013;
			arg11[3] = this.aClass345_14.anInt10013 + this.aClass345_14.anInt10003;
			arg11[0] = local70;
			arg11[2] = local114;
		}
		return local50;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lclient!hu;Ljava/lang/String;[I[I[IZ)V")
	private void method7000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21[] arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(11) int local11 = arg1 - this.aClass345_14.anInt10004;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg3.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) char local38 = (char) (Static418.method6566(arg3.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local13 = local27;
			} else {
				@Pc(127) int local127;
				@Pc(139) int local139;
				if (local38 == '>' && local13 != -1) {
					@Pc(59) String local59 = arg3.substring(local13 + 1, local27);
					local13 = -1;
					if (local59.equals("lt")) {
						local38 = '<';
					} else if (local59.equals("gt")) {
						local38 = '>';
					} else if (local59.equals("nbsp")) {
						local38 = ' ';
					} else if (local59.equals("shy")) {
						local38 = '\u00ad';
					} else if (local59.equals("times")) {
						local38 = '×';
					} else if (local59.equals("euro")) {
						local38 = '€';
					} else if (local59.equals("copy")) {
						local38 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=")) {
								try {
									if (arg4 == null) {
										local127 = 0;
									} else {
										local127 = arg4[local22];
									}
									if (arg6 == null) {
										local139 = 0;
									} else {
										local139 = arg6[local22];
									}
									local22++;
									@Pc(150) int local150 = Static82.method2080(local59.substring(4));
									@Pc(154) Class21 local154 = arg2[local150];
									@Pc(163) int local163 = arg5 == null ? local154.method5785() : arg5[local150];
									local154.method5791(local127 + arg0, local139 + -local163 + local11 + this.aClass345_14.anInt10004, 1, 0, 1);
									arg0 += arg2[local150].method5779();
									local15 = -1;
								} catch (@Pc(192) Exception local192) {
								}
							} else {
								this.method7003(local59);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass345_14.method8113(local38, local15);
					}
					@Pc(224) int local224;
					if (arg4 == null) {
						local224 = 0;
					} else {
						local224 = arg4[local22];
					}
					if (arg6 == null) {
						local127 = 0;
					} else {
						local127 = arg6[local22];
					}
					local22++;
					if (local38 != ' ') {
						if ((Static235.anInt5297 & 0xFF000000) != 0) {
							this.fa(local38, arg0 + local224 + 1, local127 + local11 + 1, Static235.anInt5297, true);
						}
						this.fa(local38, arg0 + local224, local11 + local127, Static388.anInt7524, false);
					} else if (Static546.anInt9446 > 0) {
						Static456.anInt8380 += Static546.anInt9446;
						arg0 += Static456.anInt8380 >> 8;
						Static456.anInt8380 &= 0xFF;
					}
					local139 = this.aClass345_14.method8119(local38);
					if (Static34.anInt8117 != -1) {
						this.aClass16_16.method6089(local139, arg0, local11 + (int) ((double) this.aClass345_14.anInt10004 * 0.7D), Static34.anInt8117);
					}
					if (Static367.anInt6975 != -1) {
						this.aClass16_16.method6089(local139, arg0, this.aClass345_14.anInt10004 + local11, Static367.anInt6975);
					}
					local15 = local38;
					arg0 += local139;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI[Lclient!hu;IILjava/lang/String;IIIIILclient!aa;I[III)I")
	public final int method7001(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class21[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class1 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg5 == null) {
			return 0;
		}
		this.method6997(arg7, arg8);
		if (arg10 == 0) {
			arg10 = this.aClass345_14.anInt10004;
		}
		@Pc(41) int[] local41;
		if (arg3 < this.aClass345_14.anInt10003 + this.aClass345_14.anInt10013 + arg10 && arg3 < arg10 + arg10) {
			local41 = null;
		} else {
			local41 = new int[] { arg15 };
		}
		@Pc(59) int local59 = this.aClass345_14.method8117(Static179.aStringArray8, arg5, local41, arg2);
		if (arg0 == -1) {
			arg0 = arg3 / arg10;
			if (arg0 <= 0) {
				arg0 = 1;
			}
		}
		if (arg0 > 0 && local59 >= arg0) {
			local59 = arg0;
			Static179.aStringArray8[arg0 - 1] = this.aClass345_14.method8115(arg2, Static179.aStringArray8[arg0 - 1], arg15);
		}
		if (arg9 == 3 && local59 == 1) {
			arg9 = 1;
		}
		@Pc(143) int local143;
		@Pc(170) int local170;
		if (arg9 == 0) {
			local143 = this.aClass345_14.anInt10013 + arg6;
		} else if (arg9 == 1) {
			local143 = this.aClass345_14.anInt10013 + arg6 + (-(arg10 * (local59 - 1)) + -this.aClass345_14.anInt10003 + -this.aClass345_14.anInt10013 + arg3) / 2;
		} else if (arg9 == 2) {
			local143 = arg3 + arg6 - this.aClass345_14.anInt10003 - (local59 + -1) * arg10;
		} else {
			local170 = (arg3 - this.aClass345_14.anInt10013 - this.aClass345_14.anInt10003 - arg10 * (local59 + -1)) / (local59 - -1);
			if (local170 < 0) {
				local170 = 0;
			}
			local143 = local170 + arg6 + this.aClass345_14.anInt10013;
			arg10 += local170;
		}
		for (local170 = 0; local170 < local59; local170++) {
			if (arg4 == 0) {
				this.method7009(local143, arg2, arg1, arg13, Static179.aStringArray8[local170], arg14, arg12, arg11);
			} else if (arg4 == 1) {
				this.method7009(local143, arg2, (arg15 - this.aClass345_14.method8112(Static179.aStringArray8[local170])) / 2 + arg1, arg13, Static179.aStringArray8[local170], arg14, arg12, arg11);
			} else if (arg4 == 2) {
				this.method7009(local143, arg2, arg1 + arg15 - this.aClass345_14.method8112(Static179.aStringArray8[local170]), arg13, Static179.aStringArray8[local170], arg14, arg12, arg11);
			} else if (local59 - 1 == local170) {
				this.method7009(local143, arg2, arg1, arg13, Static179.aStringArray8[local170], arg14, arg12, arg11);
			} else {
				this.method7008(arg15, Static179.aStringArray8[local170]);
				this.method7009(local143, arg2, arg1, arg13, Static179.aStringArray8[local170], arg14, arg12, arg11);
				Static546.anInt9446 = 0;
			}
			local143 += arg10;
		}
		return local59;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method7002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method6997(arg1, arg0);
			this.method7009(arg4, null, arg3 - this.aClass345_14.method8112(arg2) / 2, null, arg2, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method7003(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static388.anInt7524 = Static388.anInt7524 & 0xFF000000 | Static345.method5492(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static388.anInt7524 = Static388.anInt7524 & 0xFF000000 | Static355.anInt6836 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static388.anInt7524 = Static345.method5492(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static388.anInt7524 = Static355.anInt6836;
			} else if (arg0.startsWith("str=")) {
				Static34.anInt8117 = Static388.anInt7524 & 0xFF000000 | Static345.method5492(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static34.anInt8117 = Static388.anInt7524 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static34.anInt8117 = -1;
			} else if (arg0.startsWith("u=")) {
				Static367.anInt6975 = Static388.anInt7524 & 0xFF000000 | Static345.method5492(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static367.anInt6975 = Static388.anInt7524 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static367.anInt6975 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static235.anInt5297 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static235.anInt5297 = Static388.anInt7524 & 0xFF000000 | Static345.method5492(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static235.anInt5297 = Static388.anInt7524 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static235.anInt5297 = Static629.anInt10498;
			} else if (arg0.equals("br")) {
				this.method6997(Static355.anInt6836, Static629.anInt10498);
				return;
			}
		} catch (@Pc(173) Exception local173) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IILjava/lang/String;I[Lclient!hu;BI)V")
	public final void method7004(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class21[] arg5) {
		if (arg3 != null) {
			this.method6997(arg0, 0);
			this.method7009(arg2, arg5, arg4, arg1, arg3, 0, 0, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;ILjava/util/Random;II[IIII[Lclient!hu;)I")
	public final int method7005(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class21[] arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg2.setSeed((long) arg5);
		@Pc(43) int local43 = (arg2.nextInt() & 0x1F) + 192;
		this.method6997(local43 << 24 | 0xFFFFFF, (local43 | 0x0) << 24);
		@Pc(63) int local63 = arg0.length();
		@Pc(66) int[] local66 = new int[local63];
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < local63; local70++) {
			local66[local70] = local68;
			if ((arg2.nextInt() & 0x3) == 0) {
				local68++;
			}
		}
		this.method7000(arg4, arg1, arg6, arg0, local66, arg3, null);
		return local68;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method7006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method6997(arg2, -16777216);
		@Pc(18) int local18 = arg3.length();
		@Pc(26) int[] local26 = new int[local18];
		@Pc(29) int[] local29 = new int[local18];
		for (@Pc(31) int local31 = 0; local31 < local18; local31++) {
			local26[local31] = (int) (Math.sin((double) local31 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local29[local31] = (int) (Math.sin((double) local31 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method7000(arg1 - this.aClass345_14.method8112(arg3) / 2, arg4, null, arg3, local26, null, local29);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;B)V")
	private void method7008(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < arg1.length(); local15++) {
			@Pc(21) char local21 = arg1.charAt(local15);
			if (local21 == '<') {
				local13 = true;
			} else if (local21 == '>') {
				local13 = false;
			} else if (!local13 && local21 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static546.anInt9446 = (arg0 - this.aClass345_14.method8112(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!hu;I[ILjava/lang/String;IIILclient!aa;)V")
	private void method7009(@OriginalArg(0) int arg0, @OriginalArg(1) Class21[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(7) int local7 = arg0 - this.aClass345_14.anInt10004;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(26) int local26 = arg4.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static418.method6566(arg4.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local21 = local28;
			} else {
				if (local39 == '>' && local21 != -1) {
					@Pc(62) String local62 = arg4.substring(local21 + 1, local28);
					local21 = -1;
					if (local62.equals("lt")) {
						local39 = '<';
					} else if (local62.equals("gt")) {
						local39 = '>';
					} else if (local62.equals("nbsp")) {
						local39 = ' ';
					} else if (local62.equals("shy")) {
						local39 = '\u00ad';
					} else if (local62.equals("times")) {
						local39 = '×';
					} else if (local62.equals("euro")) {
						local39 = '€';
					} else if (local62.equals("copy")) {
						local39 = '©';
					} else {
						if (!local62.equals("reg")) {
							if (local62.startsWith("img=")) {
								try {
									@Pc(126) int local126 = Static82.method2080(local62.substring(4));
									@Pc(130) Class21 local130 = arg1[local126];
									@Pc(139) int local139 = arg3 == null ? local130.method5785() : arg3[local126];
									if ((Static388.anInt7524 & -16777216) == -16777216) {
										local130.method5791(arg2, this.aClass345_14.anInt10004 + local7 - local139, 1, 0, 1);
									} else {
										local130.method5791(arg2, local7 + this.aClass345_14.anInt10004 - local139, 0, Static388.anInt7524 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg2 += arg1[local126].method5779();
									local23 = -1;
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method7003(local62);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg2 += this.aClass345_14.method8113(local39, local23);
					}
					if (local39 == ' ') {
						if (Static546.anInt9446 > 0) {
							Static456.anInt8380 += Static546.anInt9446;
							arg2 += Static456.anInt8380 >> 8;
							Static456.anInt8380 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static235.anInt5297 & 0xFF000000) != 0) {
							this.fa(local39, arg2 + 1, local7 - -1, Static235.anInt5297, true);
						}
						this.fa(local39, arg2, local7, Static388.anInt7524, false);
					} else {
						if ((Static235.anInt5297 & 0xFF000000) != 0) {
							this.method6998(local39, arg2 + 1, local7 + 1, Static235.anInt5297, true, arg7, arg6, arg5);
						}
						this.method6998(local39, arg2, local7, Static388.anInt7524, false, arg7, arg6, arg5);
					}
					@Pc(312) int local312 = this.aClass345_14.method8119(local39);
					if (Static34.anInt8117 != -1) {
						this.aClass16_16.method6089(local312, arg2, (int) ((double) this.aClass345_14.anInt10004 * 0.7D) + local7, Static34.anInt8117);
					}
					if (Static367.anInt6975 != -1) {
						this.aClass16_16.method6089(local312, arg2, this.aClass345_14.anInt10004 + local7 + 1, Static367.anInt6975);
					}
					arg2 += local312;
					local23 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIIIILjava/lang/String;)V")
	public final void method7010(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method6997(arg1, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg2 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(29) int local29 = arg5.length();
		@Pc(32) int[] local32 = new int[local29];
		for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
			local32[local34] = (int) (Math.sin((double) local34 / 1.5D + (double) arg4) * local20);
		}
		this.method7000(arg0 - this.aClass345_14.method8112(arg5) / 2, arg3, null, arg5, null, null, local32);
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lclient!hu;[IILclient!aa;IIIIIILjava/lang/String;III)I")
	public final int method7011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) String arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method7001(0, arg9, arg2, arg13, arg1, arg12, arg14, arg8, arg0, arg6, arg11, arg5, arg10, arg3, arg7, arg4);
	}
}
