import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class34 {

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!mv;")
	private final Class213 aClass213_14;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!ha;")
	private final Class5 aClass5_15;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!mv;)V")
	protected Class34(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class213 arg1) {
		this.aClass213_14 = arg1;
		this.aClass5_15 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILclient!aa;ILjava/lang/String;[Lclient!ufa;[I)V")
	private void method8583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(6) String arg5, @OriginalArg(7) Class4[] arg6, @OriginalArg(8) int[] arg7) {
		@Pc(11) int local11 = arg2 - this.aClass213_14.anInt6975;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg5.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static598.method8291(arg5.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(51) String local51 = arg5.substring(local13 + 1, local20);
					local13 = -1;
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
									@Pc(115) int local115 = Static533.method7565(local51.substring(4));
									@Pc(119) Class4 local119 = arg6[local115];
									@Pc(128) int local128 = arg7 == null ? local119.method7712() : arg7[local115];
									if ((Static398.anInt7412 & -16777216) == -16777216) {
										local119.method7711(arg3, this.aClass213_14.anInt6975 + local11 - local128, 1, 0, 1);
									} else {
										local119.method7711(arg3, local11 + this.aClass213_14.anInt6975 - local128, 0, Static398.anInt7412 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg3 += arg6[local115].method7700();
									local15 = -1;
								} catch (@Pc(179) Exception local179) {
								}
							} else {
								this.method8587(local51);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass213_14.method5828(local31, local15);
					}
					if (local31 == ' ') {
						if (Static243.anInt4637 > 0) {
							Static565.anInt9728 += Static243.anInt4637;
							arg3 += Static565.anInt9728 >> 8;
							Static565.anInt9728 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static379.anInt7162 & 0xFF000000) != 0) {
							this.fa(local31, arg3 + 1, local11 - -1, Static379.anInt7162, true);
						}
						this.fa(local31, arg3, local11, Static398.anInt7412, false);
					} else {
						if ((Static379.anInt7162 & 0xFF000000) != 0) {
							this.method8596(local31, arg3 + 1, local11 + 1, Static379.anInt7162, true, arg4, arg0, arg1);
						}
						this.method8596(local31, arg3, local11, Static398.anInt7412, false, arg4, arg0, arg1);
					}
					@Pc(297) int local297 = this.aClass213_14.method5830(local31);
					if (Static89.anInt2681 != -1) {
						this.aClass5_15.method6116(local297, Static89.anInt2681, local11 + (int) ((double) this.aClass213_14.anInt6975 * 0.7D), arg3);
					}
					if (Static164.anInt3681 != -1) {
						this.aClass5_15.method6116(local297, Static164.anInt3681, this.aClass213_14.anInt6975 + local11 + 1, arg3);
					}
					local15 = local31;
					arg3 += local297;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method8584(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method8586(arg2, arg0);
			this.method8583(0, 0, arg4, arg1 - this.aClass213_14.method5831(arg3), (Class1) null, arg3, (Class4[]) null, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
	private void method8586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static164.anInt3681 = -1;
		Static89.anInt2681 = -1;
		Static48.anInt1663 = arg1;
		Static398.anInt7412 = arg1;
		Static565.anInt9728 = 0;
		Static243.anInt4637 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static492.anInt8595 = arg0;
		Static379.anInt7162 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8587(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static398.anInt7412 = Static398.anInt7412 & 0xFF000000 | Static626.method8559(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static398.anInt7412 = Static48.anInt1663 & 0xFFFFFF | Static398.anInt7412 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static398.anInt7412 = Static626.method8559(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static398.anInt7412 = Static48.anInt1663;
			} else if (arg0.startsWith("str=")) {
				Static89.anInt2681 = Static398.anInt7412 & 0xFF000000 | Static626.method8559(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static89.anInt2681 = Static398.anInt7412 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static89.anInt2681 = -1;
			} else if (arg0.startsWith("u=")) {
				Static164.anInt3681 = Static398.anInt7412 & 0xFF000000 | Static626.method8559(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static164.anInt3681 = Static398.anInt7412 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static164.anInt3681 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static379.anInt7162 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static379.anInt7162 = Static398.anInt7412 & 0xFF000000 | Static626.method8559(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static379.anInt7162 = Static398.anInt7412 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static379.anInt7162 = Static492.anInt8595;
			} else if (arg0.equals("br")) {
				this.method8586(Static492.anInt8595, Static48.anInt1663);
			}
		} catch (@Pc(191) Exception local191) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;B)V")
	private void method8589(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length(); local11++) {
			@Pc(17) char local17 = arg1.charAt(local11);
			if (local17 == '<') {
				local9 = true;
			} else if (local17 == '>') {
				local9 = false;
			} else if (!local9 && local17 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static243.anInt4637 = (arg0 - this.aClass213_14.method5831(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method8590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method8586(-16777216, arg4);
		@Pc(22) int local22 = arg3.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) arg2 / 5.0D + (double) local27 / 2.0D) * 5.0D);
		}
		this.method8597(local25, arg0 - this.aClass213_14.method5831(arg3) / 2, (int[]) null, (Class4[]) null, arg3, (int[]) null, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!aa;IIIIIIB[Lclient!ufa;IILjava/lang/String;I[I)I")
	public final int method8592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class4[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) String arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int[] arg15) {
		if (arg13 == null) {
			return 0;
		}
		this.method8586(arg6, arg11);
		if (arg7 == 0) {
			arg7 = this.aClass213_14.anInt6975;
		}
		@Pc(52) int[] local52;
		if (this.aClass213_14.anInt6973 + this.aClass213_14.anInt6972 + arg7 > arg2 && arg7 + arg7 > arg2) {
			local52 = null;
		} else {
			local52 = new int[] { arg5 };
		}
		@Pc(65) int local65 = this.aClass213_14.method5832(arg13, Static626.aStringArray40, local52, arg10);
		if (arg1 == -1) {
			arg1 = arg2 / arg7;
			if (arg1 <= 0) {
				arg1 = 1;
			}
		}
		if (arg1 > 0 && local65 >= arg1) {
			local65 = arg1;
			Static626.aStringArray40[arg1 - 1] = this.aClass213_14.method5834(Static626.aStringArray40[arg1 - 1], arg10, arg5);
		}
		if (arg8 == 3 && local65 == 1) {
			arg8 = 1;
		}
		@Pc(160) int local160;
		@Pc(189) int local189;
		if (arg8 == 0) {
			local160 = arg9 + this.aClass213_14.anInt6973;
		} else if (arg8 == 1) {
			local160 = this.aClass213_14.anInt6973 + arg9 + (arg2 - (local65 - 1) * arg7 - this.aClass213_14.anInt6972 - this.aClass213_14.anInt6973) / 2;
		} else if (arg8 == 2) {
			local160 = arg2 + arg9 - arg7 * (local65 - 1) - this.aClass213_14.anInt6972;
		} else {
			local189 = (arg2 - this.aClass213_14.anInt6972 - this.aClass213_14.anInt6973 - arg7 * (local65 + -1)) / (local65 + 1);
			if (local189 < 0) {
				local189 = 0;
			}
			local160 = local189 + this.aClass213_14.anInt6973 + arg9;
			arg7 += local189;
		}
		for (local189 = 0; local189 < local65; local189++) {
			if (arg14 == 0) {
				this.method8583(arg12, arg4, local160, arg0, arg3, Static626.aStringArray40[local189], arg10, arg15);
			} else if (arg14 == 1) {
				this.method8583(arg12, arg4, local160, (arg5 - this.aClass213_14.method5831(Static626.aStringArray40[local189])) / 2 + arg0, arg3, Static626.aStringArray40[local189], arg10, arg15);
			} else if (arg14 == 2) {
				this.method8583(arg12, arg4, local160, arg0 + arg5 - this.aClass213_14.method5831(Static626.aStringArray40[local189]), arg3, Static626.aStringArray40[local189], arg10, arg15);
			} else if (local65 - 1 == local189) {
				this.method8583(arg12, arg4, local160, arg0, arg3, Static626.aStringArray40[local189], arg10, arg15);
			} else {
				this.method8589(arg5, Static626.aStringArray40[local189]);
				this.method8583(arg12, arg4, local160, arg0, arg3, Static626.aStringArray40[local189], arg10, arg15);
				Static243.anInt4637 = 0;
			}
			local160 += arg7;
		}
		return local65;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method8593(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method8586(-16777216, arg1);
		@Pc(21) double local21 = 7.0D - (double) arg2 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg5.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (local21 * Math.sin((double) arg3 + (double) local35 / 1.5D));
		}
		this.method8597(local33, arg4 - this.aClass213_14.method5831(arg5) / 2, (int[]) null, (Class4[]) null, arg5, (int[]) null, arg0);
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;Ljava/util/Random;[III[Lclient!ufa;I)I")
	public final int method8594(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) Random arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class4[] arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg2.setSeed((long) arg4);
		@Pc(33) int local33 = (arg2.nextInt() & 0x1F) + 192;
		this.method8586((local33 | 0x0) << 24, local33 << 24 | 0xFFFFFF);
		@Pc(53) int local53 = arg1.length();
		@Pc(56) int[] local56 = new int[local53];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local53; local60++) {
			local56[local60] = local58;
			if ((arg2.nextInt() & 0x3) == 0) {
				local58++;
			}
		}
		this.method8597((int[]) null, arg5, local56, arg6, arg1, arg3, arg0);
		return local58;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!ufa;ILjava/lang/String;IILclient!aa;IBI[IIIIII)I")
	public final int method8595(@OriginalArg(0) int arg0, @OriginalArg(1) Class4[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method8592(arg0, 0, arg14, arg6, arg11, arg2, arg5, arg10, arg12, arg13, arg1, arg8, arg4, arg3, arg7, arg9);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8596(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIZ[I[Lclient!ufa;Ljava/lang/String;[II)V")
	private void method8597(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class4[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg6 - this.aClass213_14.anInt6975;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(32) int local32 = arg4.length();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(45) char local45 = (char) (Static598.method8291(arg4.charAt(local34)) & 0xFF);
			if (local45 == '<') {
				local13 = local34;
			} else {
				@Pc(136) int local136;
				@Pc(148) int local148;
				if (local45 == '>' && local13 != -1) {
					@Pc(68) String local68 = arg4.substring(local13 + 1, local34);
					local13 = -1;
					if (local68.equals("lt")) {
						local45 = '<';
					} else if (local68.equals("gt")) {
						local45 = '>';
					} else if (local68.equals("nbsp")) {
						local45 = ' ';
					} else if (local68.equals("shy")) {
						local45 = '\u00ad';
					} else if (local68.equals("times")) {
						local45 = '×';
					} else if (local68.equals("euro")) {
						local45 = '€';
					} else if (local68.equals("copy")) {
						local45 = '©';
					} else {
						if (!local68.equals("reg")) {
							if (local68.startsWith("img=")) {
								try {
									if (arg2 == null) {
										local136 = 0;
									} else {
										local136 = arg2[local17];
									}
									if (arg0 == null) {
										local148 = 0;
									} else {
										local148 = arg0[local17];
									}
									local17++;
									@Pc(159) int local159 = Static533.method7565(local68.substring(4));
									@Pc(163) Class4 local163 = arg3[local159];
									@Pc(172) int local172 = arg5 == null ? local163.method7712() : arg5[local159];
									local163.method7711(arg1 + local136, local11 + (this.aClass213_14.anInt6975 - local172 - -local148), 1, 0, 1);
									arg1 += arg3[local159].method7700();
									local15 = -1;
								} catch (@Pc(202) Exception local202) {
								}
							} else {
								this.method8587(local68);
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass213_14.method5828(local45, local15);
					}
					@Pc(237) int local237;
					if (arg2 == null) {
						local237 = 0;
					} else {
						local237 = arg2[local17];
					}
					if (arg0 == null) {
						local136 = 0;
					} else {
						local136 = arg0[local17];
					}
					local17++;
					if (local45 != ' ') {
						if ((Static379.anInt7162 & 0xFF000000) != 0) {
							this.fa(local45, arg1 + local237 + 1, local136 + local11 + 1, Static379.anInt7162, true);
						}
						this.fa(local45, local237 + arg1, local136 + local11, Static398.anInt7412, false);
					} else if (Static243.anInt4637 > 0) {
						Static565.anInt9728 += Static243.anInt4637;
						arg1 += Static565.anInt9728 >> 8;
						Static565.anInt9728 &= 0xFF;
					}
					local148 = this.aClass213_14.method5830(local45);
					if (Static89.anInt2681 != -1) {
						this.aClass5_15.method6116(local148, Static89.anInt2681, (int) ((double) this.aClass213_14.anInt6975 * 0.7D) + local11, arg1);
					}
					if (Static164.anInt3681 != -1) {
						this.aClass5_15.method6116(local148, Static164.anInt3681, local11 + this.aClass213_14.anInt6975, arg1);
					}
					local15 = local45;
					arg1 += local148;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/lang/String;III)V")
	public final void method8598(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method8586(arg3, arg2);
			this.method8583(0, 0, arg0, arg4, (Class1) null, arg1, (Class4[]) null, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method8599(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method8586(-16777216, arg0);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) arg4 / 5.0D + (double) local24 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg4 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method8597(local22, arg1 - this.aClass213_14.method5831(arg3) / 2, local19, (Class4[]) null, arg3, (int[]) null, arg2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IILjava/lang/String;IIB[Lclient!ufa;)V")
	public final void method8600(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class4[] arg5) {
		if (arg2 != null) {
			this.method8586(0, arg3);
			this.method8583(0, 0, arg0, arg4, (Class1) null, arg2, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
	public final void method8602(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method8586(arg3, arg0);
			this.method8583(0, 0, arg4, arg2 - this.aClass213_14.method5831(arg1) / 2, (Class1) null, arg1, (Class4[]) null, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/util/Random;I[IILjava/lang/String;I[II[Lclient!ufa;I)I")
	public final int method8603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(13) Class4[] arg12, @OriginalArg(14) int arg13) {
		if (arg9 == null) {
			return 0;
		}
		arg5.setSeed((long) arg2);
		@Pc(20) int local20 = (arg5.nextInt() & 0x1F) + 192;
		this.method8586(arg3 & 0xFFFFFF | local20 << 24, local20 << 24 | arg1 & 0xFFFFFF);
		@Pc(40) int local40 = arg9.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg5.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(80) int local80 = arg0;
		@Pc(86) int local86 = this.aClass213_14.anInt6973 + arg13;
		@Pc(88) int local88 = -1;
		if (arg10 == 1) {
			local86 += (arg4 - this.aClass213_14.anInt6972 - this.aClass213_14.anInt6973) / 2;
		} else if (arg10 == 2) {
			local86 = arg13 + arg4 - this.aClass213_14.anInt6972;
		}
		if (arg6 == 1) {
			local88 = local45 + this.aClass213_14.method5831(arg9);
			local80 = arg0 + (arg8 - local88) / 2;
		} else if (arg6 == 2) {
			local88 = this.aClass213_14.method5831(arg9) + local45;
			local80 = arg0 + arg8 - local88;
		}
		this.method8597((int[]) null, local80, local43, arg12, arg9, arg11, local86);
		if (arg7 != null) {
			if (local88 == -1) {
				local88 = local45 + this.aClass213_14.method5831(arg9);
			}
			arg7[1] = local86 - this.aClass213_14.anInt6973;
			arg7[0] = local80;
			arg7[3] = this.aClass213_14.anInt6972 + this.aClass213_14.anInt6973;
			arg7[2] = local88;
		}
		return local45;
	}
}
