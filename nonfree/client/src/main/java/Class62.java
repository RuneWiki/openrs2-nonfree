import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class62 {

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!oq;")
	private final Class256 aClass256_14;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!ha;")
	private final Class95 aClass95_13;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!oq;)V")
	protected Class62(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class256 arg1) {
		this.aClass256_14 = arg1;
		this.aClass95_13 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method5679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5683(arg2, arg0);
			this.method5686(arg3, 0, null, arg4, null, arg1 - this.aClass256_14.method5534(arg4), null, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!cw;IBIIIII[IILjava/lang/String;IILclient!aa;II)I")
	public final int method5680(@OriginalArg(0) Class61[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class1 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method5695(arg11, arg13, 0, arg12, arg3, arg7, arg1, arg4, arg14, arg5, arg6, arg9, arg0, arg10, arg8, arg2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method5681(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method5683(-16777216, arg4);
		@Pc(32) int local32 = arg0.length();
		@Pc(35) int[] local35 = new int[local32];
		for (@Pc(37) int local37 = 0; local37 < local32; local37++) {
			local35[local37] = (int) (Math.sin((double) local37 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method5685(null, null, arg1, arg0, arg3 - this.aClass256_14.method5534(arg0) / 2, local35, null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;Z)V")
	public final void method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method5683(-16777216, arg3);
		@Pc(21) double local21 = 7.0D - (double) arg0 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg5.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (Math.sin((double) arg2 + (double) local35 / 1.5D) * local21);
		}
		this.method5685(null, null, arg1, arg5, arg4 - this.aClass256_14.method5534(arg5) / 2, local33, null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	private void method5683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static581.anInt9453 = -1;
		Static143.anInt2620 = arg1;
		Static440.anInt7077 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static418.anInt6552 = -1;
		Static263.anInt4235 = 0;
		Static258.anInt4071 = 0;
		Static635.anInt10187 = arg0;
		Static304.anInt10280 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method5684(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5683(arg4, arg3);
			this.method5686(arg2, 0, null, arg1, null, arg0, null, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([I[IILjava/lang/String;ZI[I[Lclient!cw;)V")
	private void method5685(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class61[] arg6) {
		@Pc(15) int local15 = arg2 - this.aClass256_14.anInt6425;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg3.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) char local37 = (char) (Static373.method5028(arg3.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local17 = local26;
			} else {
				@Pc(125) int local125;
				@Pc(135) int local135;
				if (local37 == '>' && local17 != -1) {
					@Pc(59) String local59 = arg3.substring(local17 + 1, local26);
					local17 = -1;
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
									if (arg1 == null) {
										local125 = 0;
									} else {
										local125 = arg1[local21];
									}
									if (arg5 == null) {
										local135 = 0;
									} else {
										local135 = arg5[local21];
									}
									local21++;
									@Pc(146) int local146 = Static445.method6066(local59.substring(4));
									@Pc(150) Class61 local150 = arg6[local146];
									@Pc(159) int local159 = arg0 == null ? local150.method6438() : arg0[local146];
									local150.method6434(arg4 + local125, -local159 + local15 - (-this.aClass256_14.anInt6425 - local135), 1, 0, 1);
									local19 = -1;
									arg4 += arg6[local146].method6446();
								} catch (@Pc(189) Exception local189) {
								}
							} else {
								this.method5688(local59);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg4 += this.aClass256_14.method5538(local37, local19);
					}
					@Pc(224) int local224;
					if (arg1 == null) {
						local224 = 0;
					} else {
						local224 = arg1[local21];
					}
					if (arg5 == null) {
						local125 = 0;
					} else {
						local125 = arg5[local21];
					}
					if (local37 != ' ') {
						if ((Static304.anInt10280 & 0xFF000000) != 0) {
							this.fa(local37, arg4 + local224 + 1, local125 + 1 + local15, Static304.anInt10280, true);
						}
						this.fa(local37, local224 + arg4, local125 + local15, Static440.anInt7077, false);
					} else if (Static258.anInt4071 > 0) {
						Static263.anInt4235 += Static258.anInt4071;
						arg4 += Static263.anInt4235 >> 8;
						Static263.anInt4235 &= 0xFF;
					}
					local21++;
					local135 = this.aClass256_14.method5535(local37);
					if (Static581.anInt9453 != -1) {
						this.aClass95_13.method6990((int) ((double) this.aClass256_14.anInt6425 * 0.7D) + local15, Static581.anInt9453, arg4, local135);
					}
					if (Static418.anInt6552 != -1) {
						this.aClass95_13.method6990(this.aClass256_14.anInt6425 + local15, Static418.anInt6552, arg4, local135);
					}
					local19 = local37;
					arg4 += local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ILjava/lang/String;[Lclient!cw;IILclient!aa;I)V")
	private void method5686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Class61[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg0 - this.aClass256_14.anInt6425;
		@Pc(13) int local13 = -1;
		@Pc(23) int local23 = -1;
		@Pc(26) int local26 = arg3.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static373.method5028(arg3.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local13 = local28;
			} else {
				if (local39 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg3.substring(local13 + 1, local28);
					local13 = -1;
					if (local60.equals("lt")) {
						local39 = '<';
					} else if (local60.equals("gt")) {
						local39 = '>';
					} else if (local60.equals("nbsp")) {
						local39 = ' ';
					} else if (local60.equals("shy")) {
						local39 = '\u00ad';
					} else if (local60.equals("times")) {
						local39 = '×';
					} else if (local60.equals("euro")) {
						local39 = '€';
					} else if (local60.equals("copy")) {
						local39 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									@Pc(126) int local126 = Static445.method6066(local60.substring(4));
									@Pc(130) Class61 local130 = arg4[local126];
									@Pc(139) int local139 = arg2 == null ? local130.method6438() : arg2[local126];
									if ((Static440.anInt7077 & 0xFF000000) == -16777216) {
										local130.method6434(arg5, local7 + this.aClass256_14.anInt6425 - local139, 1, 0, 1);
									} else {
										local130.method6434(arg5, local7 + this.aClass256_14.anInt6425 - local139, 0, Static440.anInt7077 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg5 += arg4[local126].method6446();
									local23 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method5688(local60);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local23 != -1) {
						arg5 += this.aClass256_14.method5538(local39, local23);
					}
					if (local39 == ' ') {
						if (Static258.anInt4071 > 0) {
							Static263.anInt4235 += Static258.anInt4071;
							arg5 += Static263.anInt4235 >> 8;
							Static263.anInt4235 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static304.anInt10280 & 0xFF000000) != 0) {
							this.fa(local39, arg5 + 1, local7 + 1, Static304.anInt10280, true);
						}
						this.fa(local39, arg5, local7, Static440.anInt7077, false);
					} else {
						if ((Static304.anInt10280 & 0xFF000000) != 0) {
							this.method5696(local39, arg5 + 1, local7 + 1, Static304.anInt10280, true, arg6, arg1, arg7);
						}
						this.method5696(local39, arg5, local7, Static440.anInt7077, false, arg6, arg1, arg7);
					}
					@Pc(316) int local316 = this.aClass256_14.method5535(local39);
					if (Static581.anInt9453 != -1) {
						this.aClass95_13.method6990((int) ((double) this.aClass256_14.anInt6425 * 0.7D) + local7, Static581.anInt9453, arg5, local316);
					}
					if (Static418.anInt6552 != -1) {
						this.aClass95_13.method6990(local7 + this.aClass256_14.anInt6425 + 1, Static418.anInt6552, arg5, local316);
					}
					local23 = local39;
					arg5 += local316;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(16) int local16 = 0; arg1.length() > local16; local16++) {
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
			Static258.anInt4071 = (arg0 - this.aClass256_14.method5534(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5688(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static440.anInt7077 = Static440.anInt7077 & 0xFF000000 | Static515.method7206(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static440.anInt7077 = Static440.anInt7077 & 0xFF000000 | Static143.anInt2620 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static440.anInt7077 = Static515.method7206(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static440.anInt7077 = Static143.anInt2620;
			} else if (arg0.startsWith("str=")) {
				Static581.anInt9453 = Static440.anInt7077 & 0xFF000000 | Static515.method7206(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static581.anInt9453 = Static440.anInt7077 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static581.anInt9453 = -1;
			} else if (arg0.startsWith("u=")) {
				Static418.anInt6552 = Static440.anInt7077 & 0xFF000000 | Static515.method7206(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static418.anInt6552 = Static440.anInt7077 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static418.anInt6552 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static304.anInt10280 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static304.anInt10280 = Static440.anInt7077 & 0xFF000000 | Static515.method7206(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static304.anInt10280 = Static440.anInt7077 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static304.anInt10280 = Static635.anInt10187;
			} else if (arg0.equals("br")) {
				this.method5683(Static635.anInt10187, Static143.anInt2620);
				return;
			}
		} catch (@Pc(177) Exception local177) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method5689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5683(-16777216, arg3);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(26) int[] local26 = new int[local16];
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			local19[local28] = (int) (Math.sin((double) arg0 / 5.0D + (double) local28 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method5685(null, local19, arg4, arg2, arg1 - this.aClass256_14.method5534(arg2) / 2, local26, null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;ZII)V")
	public final void method5691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method5683(arg3, arg1);
			this.method5686(arg4, 0, null, arg2, null, arg0 - this.aClass256_14.method5534(arg2) / 2, null, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIILjava/lang/String;IIILjava/util/Random;II[I[Lclient!cw;II)I")
	public final int method5692(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Random arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) Class61[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg4 == null) {
			return 0;
		}
		arg8.setSeed((long) arg3);
		@Pc(20) int local20 = (arg8.nextInt() & 0x1F) + 192;
		this.method5683(local20 << 24 | arg1 & 0xFFFFFF, arg7 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg4.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg8.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(72) int local72 = arg12;
		@Pc(78) int local78 = this.aClass256_14.anInt6414 + arg13;
		@Pc(80) int local80 = -1;
		if (arg9 == 1) {
			local78 += (arg5 - this.aClass256_14.anInt6420 - this.aClass256_14.anInt6414) / 2;
		} else if (arg9 == 2) {
			local78 = arg13 + arg5 - this.aClass256_14.anInt6420;
		}
		if (arg2 == 1) {
			local80 = local45 + this.aClass256_14.method5534(arg4);
			local72 = arg12 + (arg6 - local80) / 2;
		} else if (arg2 == 2) {
			local80 = local45 + this.aClass256_14.method5534(arg4);
			local72 = arg12 + arg6 - local80;
		}
		this.method5685(arg0, local43, local78, arg4, local72, null, arg11);
		if (arg10 != null) {
			if (local80 == -1) {
				local80 = this.aClass256_14.method5534(arg4) + local45;
			}
			arg10[0] = local72;
			arg10[3] = this.aClass256_14.anInt6420 + this.aClass256_14.anInt6414;
			arg10[1] = local78 - this.aClass256_14.anInt6414;
			arg10[2] = local80;
		}
		return local45;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lclient!cw;[IILjava/lang/String;IILjava/util/Random;I)I")
	public final int method5693(@OriginalArg(1) int arg0, @OriginalArg(2) Class61[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(8) Random arg5, @OriginalArg(9) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg5.setSeed((long) arg0);
		@Pc(21) int local21 = (arg5.nextInt() & 0x1F) + 192;
		this.method5683((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg3.length();
		@Pc(49) int[] local49 = new int[local41];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local41; local53++) {
			local49[local53] = local51;
			if ((arg5.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		this.method5685(arg2, local49, arg4, arg3, arg6, null, arg1);
		return local51;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;[Lclient!cw;III[I)V")
	public final void method5694(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class61[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg1 != null) {
			this.method5683(0, arg4);
			this.method5686(arg3, 0, arg5, arg1, arg2, arg0, null, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!aa;I[IIIIIIILjava/lang/String;[Lclient!cw;III)I")
	public final int method5695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) Class61[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method5683(arg10, arg7);
		if (arg4 == 0) {
			arg4 = this.aClass256_14.anInt6425;
		}
		@Pc(47) int[] local47;
		if (arg8 < arg4 + this.aClass256_14.anInt6414 + this.aClass256_14.anInt6420 && arg4 + arg4 > arg8) {
			local47 = null;
		} else {
			local47 = new int[] { arg1 };
		}
		@Pc(65) int local65 = this.aClass256_14.method5541(arg11, Static187.aStringArray12, arg12, local47);
		if (arg2 == -1) {
			arg2 = arg8 / arg4;
			if (arg2 <= 0) {
				arg2 = 1;
			}
		}
		if (arg2 > 0 && arg2 <= local65) {
			local65 = arg2;
			Static187.aStringArray12[arg2 - 1] = this.aClass256_14.method5539(Static187.aStringArray12[arg2 - 1], arg12, arg1);
		}
		if (arg0 == 3 && local65 == 1) {
			arg0 = 1;
		}
		@Pc(124) int local124;
		@Pc(173) int local173;
		if (arg0 == 0) {
			local124 = this.aClass256_14.anInt6414 + arg13;
		} else if (arg0 == 1) {
			local124 = (arg8 - this.aClass256_14.anInt6414 - this.aClass256_14.anInt6420 - arg4 * (local65 - 1)) / 2 + arg13 + this.aClass256_14.anInt6414;
		} else if (arg0 == 2) {
			local124 = arg8 + arg13 - arg4 * (local65 - 1) - this.aClass256_14.anInt6420;
		} else {
			local173 = (arg8 - this.aClass256_14.anInt6414 - this.aClass256_14.anInt6420 - (local65 - 1) * arg4) / (local65 + 1);
			if (local173 < 0) {
				local173 = 0;
			}
			arg4 += local173;
			local124 = local173 + arg13 + this.aClass256_14.anInt6414;
		}
		for (local173 = 0; local173 < local65; local173++) {
			if (arg6 == 0) {
				this.method5686(local124, arg9, arg5, Static187.aStringArray12[local173], arg12, arg15, arg3, arg14);
			} else if (arg6 == 1) {
				this.method5686(local124, arg9, arg5, Static187.aStringArray12[local173], arg12, (arg1 - this.aClass256_14.method5534(Static187.aStringArray12[local173])) / 2 + arg15, arg3, arg14);
			} else if (arg6 == 2) {
				this.method5686(local124, arg9, arg5, Static187.aStringArray12[local173], arg12, arg1 + arg15 - this.aClass256_14.method5534(Static187.aStringArray12[local173]), arg3, arg14);
			} else if (local173 == local65 - 1) {
				this.method5686(local124, arg9, arg5, Static187.aStringArray12[local173], arg12, arg15, arg3, arg14);
			} else {
				this.method5687(arg1, Static187.aStringArray12[local173]);
				this.method5686(local124, arg9, arg5, Static187.aStringArray12[local173], arg12, arg15, arg3, arg14);
				Static258.anInt4071 = 0;
			}
			local124 += arg4;
		}
		return local65;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method5696(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
