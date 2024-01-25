import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class73 {

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!ha;")
	private final Class65 aClass65_14;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!ne;")
	private final Class247 aClass247_14;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!ne;)V")
	protected Class73(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class247 arg1) {
		this.aClass65_14 = arg0;
		this.aClass247_14 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([ILjava/lang/String;[IBI[I[Lclient!pu;I)V")
	private void method5772(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class50[] arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - this.aClass247_14.anInt6972;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg1.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(41) char local41 = (char) (Static651.method8726(arg1.charAt(local30)) & 0xFF);
			if (local41 == '<') {
				local21 = local30;
			} else {
				@Pc(125) int local125;
				@Pc(135) int local135;
				if (local41 == '>' && local21 != -1) {
					@Pc(63) String local63 = arg1.substring(local21 + 1, local30);
					local21 = -1;
					if (local63.equals("lt")) {
						local41 = '<';
					} else if (local63.equals("gt")) {
						local41 = '>';
					} else if (local63.equals("nbsp")) {
						local41 = ' ';
					} else if (local63.equals("shy")) {
						local41 = '\u00ad';
					} else if (local63.equals("times")) {
						local41 = '×';
					} else if (local63.equals("euro")) {
						local41 = '€';
					} else if (local63.equals("copy")) {
						local41 = '©';
					} else {
						if (!local63.equals("reg")) {
							if (local63.startsWith("img=")) {
								try {
									if (arg2 == null) {
										local125 = 0;
									} else {
										local125 = arg2[local25];
									}
									if (arg4 == null) {
										local135 = 0;
									} else {
										local135 = arg4[local25];
									}
									local25++;
									@Pc(146) int local146 = Static270.method4173(local63.substring(4));
									@Pc(150) Class50 local150 = arg5[local146];
									@Pc(159) int local159 = arg0 == null ? local150.method6010() : arg0[local146];
									local150.method5987(local125 + arg6, local7 + this.aClass247_14.anInt6972 + -local159 + local135, 1, 0, 1);
									local23 = -1;
									arg6 += arg5[local146].method6003();
								} catch (@Pc(188) Exception local188) {
								}
							} else {
								this.method5778(local63);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg6 += this.aClass247_14.method5761(local41, local23);
					}
					@Pc(230) int local230;
					if (arg2 == null) {
						local230 = 0;
					} else {
						local230 = arg2[local25];
					}
					if (arg4 == null) {
						local125 = 0;
					} else {
						local125 = arg4[local25];
					}
					local25++;
					if (local41 != ' ') {
						if ((Static29.anInt398 & 0xFF000000) != 0) {
							this.fa(local41, local230 + arg6 + 1, local125 + local7 + 1, Static29.anInt398, true);
						}
						this.fa(local41, local230 + arg6, local7 - -local125, Static11.anInt203, false);
					} else if (Static617.anInt9075 > 0) {
						Static625.anInt10224 += Static617.anInt9075;
						arg6 += Static625.anInt10224 >> 8;
						Static625.anInt10224 &= 0xFF;
					}
					local135 = this.aClass247_14.method5762(local41);
					if (Static230.anInt4198 != -1) {
						this.aClass65_14.method6948(local135, arg6, Static230.anInt4198, (int) ((double) this.aClass247_14.anInt6972 * 0.7D) + local7);
					}
					if (Static575.anInt9389 != -1) {
						this.aClass65_14.method6948(local135, arg6, Static575.anInt9389, this.aClass247_14.anInt6972 + local7);
					}
					local23 = local41;
					arg6 += local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method5773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method5788(arg1, arg4);
			this.method5777(0, arg2, 0, arg3, (Class1) null, (Class50[]) null, arg0, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/util/Random;Ljava/lang/String;[II[Lclient!pu;II)I")
	public final int method5774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Random arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) Class50[] arg6) {
		if (arg4 == null) {
			return 0;
		}
		arg3.setSeed((long) arg2);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method5788(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg4.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(53) int local53 = 0; local53 < local40; local53++) {
			local43[local53] = local45;
			if ((arg3.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method5772(arg5, arg4, local43, arg1, (int[]) null, arg6, arg0);
		return local45;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!pu;IIIII[IILjava/util/Random;II[IIILjava/lang/String;)I")
	public final int method5775(@OriginalArg(0) Class50[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Random arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) String arg13) {
		if (arg13 == null) {
			return 0;
		}
		arg7.setSeed((long) arg3);
		@Pc(20) int local20 = (arg7.nextInt() & 0x1F) + 192;
		this.method5788(local20 << 24 | arg11 & 0xFFFFFF, arg6 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg13.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg7.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(70) int local70 = arg8;
		@Pc(76) int local76 = this.aClass247_14.anInt6974 + arg9;
		@Pc(78) int local78 = -1;
		if (arg12 == 1) {
			local76 += (arg1 - this.aClass247_14.anInt6966 - this.aClass247_14.anInt6974) / 2;
		} else if (arg12 == 2) {
			local76 = arg1 + arg9 - this.aClass247_14.anInt6966;
		}
		if (arg2 == 1) {
			local78 = this.aClass247_14.method5759(arg13) + local45;
			local70 = arg8 + (arg4 - local78) / 2;
		} else if (arg2 == 2) {
			local78 = this.aClass247_14.method5759(arg13) + local45;
			local70 = arg8 + arg4 - local78;
		}
		this.method5772(arg5, arg13, local43, local76, (int[]) null, arg0, local70);
		if (arg10 != null) {
			if (local78 == -1) {
				local78 = this.aClass247_14.method5759(arg13) + local45;
			}
			arg10[0] = local70;
			arg10[3] = this.aClass247_14.anInt6974 + this.aClass247_14.anInt6966;
			arg10[1] = local76 - this.aClass247_14.anInt6974;
			arg10[2] = local78;
		}
		return local45;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IB)V")
	public final void method5776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg3 != null) {
			this.method5788(arg4, arg0);
			this.method5777(0, arg3, 0, arg2 - this.aClass247_14.method5759(arg3), (Class1) null, (Class50[]) null, arg1, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IBILclient!aa;[Lclient!pu;I[I)V")
	private void method5777(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) Class50[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		@Pc(5) int local5 = arg6 - this.aClass247_14.anInt6972;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(23) int local23 = arg1.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(35) char local35 = (char) (Static651.method8726(arg1.charAt(local25)) & 0xFF);
			if (local35 == '<') {
				local18 = local25;
			} else {
				if (local35 == '>' && local18 != -1) {
					@Pc(58) String local58 = arg1.substring(local18 + 1, local25);
					local18 = -1;
					if (local58.equals("lt")) {
						local35 = '<';
					} else if (local58.equals("gt")) {
						local35 = '>';
					} else if (local58.equals("nbsp")) {
						local35 = ' ';
					} else if (local58.equals("shy")) {
						local35 = '\u00ad';
					} else if (local58.equals("times")) {
						local35 = '×';
					} else if (local58.equals("euro")) {
						local35 = '€';
					} else if (local58.equals("copy")) {
						local35 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									@Pc(117) int local117 = Static270.method4173(local58.substring(4));
									@Pc(121) Class50 local121 = arg5[local117];
									@Pc(130) int local130 = arg7 == null ? local121.method6010() : arg7[local117];
									if ((-16777216 & Static11.anInt203) == -16777216) {
										local121.method5987(arg3, this.aClass247_14.anInt6972 + local5 - local130, 1, 0, 1);
									} else {
										local121.method5987(arg3, local5 + this.aClass247_14.anInt6972 - local130, 0, Static11.anInt203 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local20 = -1;
									arg3 += arg5[local117].method6003();
								} catch (@Pc(180) Exception local180) {
								}
							} else {
								this.method5778(local58);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local18 == -1) {
					if (local20 != -1) {
						arg3 += this.aClass247_14.method5761(local35, local20);
					}
					if (local35 == ' ') {
						if (Static617.anInt9075 > 0) {
							Static625.anInt10224 += Static617.anInt9075;
							arg3 += Static625.anInt10224 >> 8;
							Static625.anInt10224 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static29.anInt398 & 0xFF000000) != 0) {
							this.fa(local35, arg3 + 1, local5 + 1, Static29.anInt398, true);
						}
						this.fa(local35, arg3, local5, Static11.anInt203, false);
					} else {
						if ((Static29.anInt398 & 0xFF000000) != 0) {
							this.method5786(local35, arg3 + 1, local5 + 1, Static29.anInt398, true, arg4, arg2, arg0);
						}
						this.method5786(local35, arg3, local5, Static11.anInt203, false, arg4, arg2, arg0);
					}
					@Pc(298) int local298 = this.aClass247_14.method5762(local35);
					if (Static230.anInt4198 != -1) {
						this.aClass65_14.method6948(local298, arg3, Static230.anInt4198, (int) ((double) this.aClass247_14.anInt6972 * 0.7D) + local5);
					}
					if (Static575.anInt9389 != -1) {
						this.aClass65_14.method6948(local298, arg3, Static575.anInt9389, this.aClass247_14.anInt6972 + local5 + 1);
					}
					arg3 += local298;
					local20 = local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5778(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static11.anInt203 = Static11.anInt203 & 0xFF000000 | Static546.method7618(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static11.anInt203 = Static11.anInt203 & 0xFF000000 | Static451.anInt7699 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static11.anInt203 = Static546.method7618(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static11.anInt203 = Static451.anInt7699;
			} else if (arg0.startsWith("str=")) {
				Static230.anInt4198 = Static11.anInt203 & 0xFF000000 | Static546.method7618(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static230.anInt4198 = Static11.anInt203 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static230.anInt4198 = -1;
			} else if (arg0.startsWith("u=")) {
				Static575.anInt9389 = Static11.anInt203 & 0xFF000000 | Static546.method7618(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static575.anInt9389 = Static11.anInt203 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static575.anInt9389 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static29.anInt398 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static29.anInt398 = Static11.anInt203 & 0xFF000000 | Static546.method7618(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static29.anInt398 = Static11.anInt203 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static29.anInt398 = Static407.anInt7214;
			} else if (arg0.equals("br")) {
				this.method5788(Static451.anInt7699, Static407.anInt7214);
			}
		} catch (@Pc(170) Exception local170) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method5779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method5788(arg0, -16777216);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method5772((int[]) null, arg4, (int[]) null, arg2, local19, (Class50[]) null, arg3 - this.aClass247_14.method5759(arg4) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILclient!aa;IILjava/lang/String;II[Lclient!pu;IIIIII[I)I")
	public final int method5780(@OriginalArg(1) int arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class50[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int[] arg14) {
		return this.method5787(arg4, arg9, arg7, arg0, arg6, 0, arg11, arg1, arg5, arg12, arg8, arg2, arg10, arg14, arg13, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method5781(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5788(arg4, arg3);
			this.method5777(0, arg0, 0, arg2 - this.aClass247_14.method5759(arg0) / 2, (Class1) null, (Class50[]) null, arg1, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!pu;IIII[I)V")
	public final void method5784(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg0 != null) {
			this.method5788(arg1, 0);
			this.method5777(0, arg0, 0, arg3, (Class1) null, arg2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public final void method5785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method5788(arg5, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg3 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(35) int local35 = arg2.length();
		@Pc(38) int[] local38 = new int[local35];
		for (@Pc(40) int local40 = 0; local40 < local35; local40++) {
			local38[local40] = (int) (local20 * Math.sin((double) arg4 + (double) local40 / 1.5D));
		}
		this.method5772((int[]) null, arg2, (int[]) null, arg0, local38, (Class50[]) null, arg1 - this.aClass247_14.method5759(arg2) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method5786(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!pu;IIIBILclient!aa;IIIII[III)I")
	public final int method5787(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method5788(arg9, arg12);
		if (arg6 == 0) {
			arg6 = this.aClass247_14.anInt6972;
		}
		@Pc(49) int[] local49;
		if (arg14 < arg6 + this.aClass247_14.anInt6966 + this.aClass247_14.anInt6974 && arg14 < arg6 + arg6) {
			local49 = null;
		} else {
			local49 = new int[] { arg10 };
		}
		if (arg5 == -1) {
			arg5 = arg14 / arg6;
			if (arg5 <= 0) {
				arg5 = 1;
			}
		}
		@Pc(78) int local78 = this.aClass247_14.method5768(arg0, local49, Static88.aStringArray14, arg2);
		if (arg5 > 0 && local78 >= arg5) {
			local78 = arg5;
			Static88.aStringArray14[arg5 - 1] = this.aClass247_14.method5770(arg10, Static88.aStringArray14[arg5 - 1], arg2);
		}
		if (arg4 == 3 && local78 == 1) {
			arg4 = 1;
		}
		@Pc(144) int local144;
		@Pc(168) int local168;
		if (arg4 == 0) {
			local144 = this.aClass247_14.anInt6974 + arg15;
		} else if (arg4 == 1) {
			local144 = (arg14 - this.aClass247_14.anInt6966 - this.aClass247_14.anInt6974 - (local78 + -1) * arg6) / 2 + this.aClass247_14.anInt6974 + arg15;
		} else if (arg4 == 2) {
			local144 = arg15 + arg14 - this.aClass247_14.anInt6966 - (local78 + -1) * arg6;
		} else {
			local168 = (arg14 - this.aClass247_14.anInt6966 - this.aClass247_14.anInt6974 - arg6 * (local78 + -1)) / (local78 + 1);
			if (local168 < 0) {
				local168 = 0;
			}
			arg6 += local168;
			local144 = local168 + arg15 + this.aClass247_14.anInt6974;
		}
		for (local168 = 0; local168 < local78; local168++) {
			if (arg3 == 0) {
				this.method5777(arg1, Static88.aStringArray14[local168], arg8, arg11, arg7, arg2, local144, arg13);
			} else if (arg3 == 1) {
				this.method5777(arg1, Static88.aStringArray14[local168], arg8, (arg10 - this.aClass247_14.method5759(Static88.aStringArray14[local168])) / 2 + arg11, arg7, arg2, local144, arg13);
			} else if (arg3 == 2) {
				this.method5777(arg1, Static88.aStringArray14[local168], arg8, arg11 + arg10 - this.aClass247_14.method5759(Static88.aStringArray14[local168]), arg7, arg2, local144, arg13);
			} else if (local168 == local78 - 1) {
				this.method5777(arg1, Static88.aStringArray14[local168], arg8, arg11, arg7, arg2, local144, arg13);
			} else {
				this.method5790(arg10, Static88.aStringArray14[local168]);
				this.method5777(arg1, Static88.aStringArray14[local168], arg8, arg11, arg7, arg2, local144, arg13);
				Static617.anInt9075 = 0;
			}
			local144 += arg6;
		}
		return local78;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	private void method5788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static625.anInt10224 = 0;
		Static451.anInt7699 = arg0;
		Static11.anInt203 = arg0;
		Static575.anInt9389 = -1;
		Static230.anInt4198 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static617.anInt9075 = 0;
		Static407.anInt7214 = arg1;
		Static29.anInt398 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method5789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5788(arg4, -16777216);
		@Pc(20) int local20 = arg2.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(26) int[] local26 = new int[local20];
		for (@Pc(28) int local28 = 0; local28 < local20; local28++) {
			local23[local28] = (int) (Math.sin((double) arg0 / 5.0D + (double) local28 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method5772((int[]) null, arg2, local23, arg3, local26, (Class50[]) null, arg1 - this.aClass247_14.method5759(arg2) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLjava/lang/String;)V")
	private void method5790(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
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
			Static617.anInt9075 = (arg0 - this.aClass247_14.method5759(arg1) << 8) / local5;
		}
	}
}
