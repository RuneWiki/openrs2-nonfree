import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public abstract class Class13 {

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!qa;")
	private final Class62 aClass62_38;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!rl;")
	private final Class256 aClass256_11;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!qa;Lclient!rl;)V")
	protected Class13(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class256 arg1) {
		this.aClass62_38 = arg0;
		this.aClass256_11 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method7201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		if (arg2 != null) {
			this.method7217(arg3, -1);
			this.method7207(0, arg2, null, null, arg0, 0, arg1 - this.aClass256_11.method6113(arg2), null);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method7202(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method7217(arg0, -16777216);
		@Pc(16) int local16 = arg2.length();
		@Pc(30) int[] local30 = new int[local16];
		@Pc(33) int[] local33 = new int[local16];
		for (@Pc(35) int local35 = 0; local35 < local16; local35++) {
			local30[local35] = (int) (Math.sin((double) arg4 / 5.0D + (double) local35 / 5.0D) * 5.0D);
			local33[local35] = (int) (Math.sin((double) arg4 / 5.0D + (double) local35 / 3.0D) * 5.0D);
		}
		this.method7216(null, local30, local33, arg3 - this.aClass256_11.method6113(arg2) / 2, arg1, null, arg2);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIILjava/util/Random;IZ[Lclient!ha;I[I)I")
	public final int method7203(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class25[] arg5, @OriginalArg(9) int[] arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg2);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method7217(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg3.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method7216(arg5, local43, null, arg4, arg1, arg6, arg0);
		return local45;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7204(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7217(arg4, arg2);
			this.method7207(0, arg0, null, null, arg3, 0, arg1 - this.aClass256_11.method6113(arg0) / 2, null);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;[ILjava/lang/String;BIIII)V")
	public final void method7206(@OriginalArg(0) Class25[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 != null) {
			this.method7217(arg3, 0);
			this.method7207(0, arg2, arg0, arg1, arg5, 0, arg4, null);
		}
	}

	@OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
	protected abstract void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;Z[Lclient!ha;[IIIILclient!pa;)V")
	private void method7207(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class25[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class87 arg7) {
		@Pc(11) int local11 = arg4 - this.aClass256_11.anInt7544;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static410.method5971(arg1.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(54) String local54 = arg1.substring(local13 + 1, local20);
					local13 = -1;
					if (local54.equals("lt")) {
						local31 = '<';
					} else if (local54.equals("gt")) {
						local31 = '>';
					} else if (local54.equals("nbsp")) {
						local31 = ' ';
					} else if (local54.equals("shy")) {
						local31 = '\u00ad';
					} else if (local54.equals("times")) {
						local31 = '×';
					} else if (local54.equals("euro")) {
						local31 = '€';
					} else if (local54.equals("copy")) {
						local31 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=")) {
								try {
									@Pc(110) int local110 = Static412.method5992(local54.substring(4));
									@Pc(114) Class25 local114 = arg2[local110];
									@Pc(123) int local123 = arg3 == null ? local114.ma() : arg3[local110];
									if ((-16777216 & Static264.anInt5212) == -16777216) {
										local114.DA(arg6, this.aClass256_11.anInt7544 + local11 - local123, 1, 0, 1);
									} else {
										local114.DA(arg6, local11 + this.aClass256_11.anInt7544 - local123, 0, Static264.anInt5212 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg6 += arg2[local110].EA();
								} catch (@Pc(172) Exception local172) {
								}
							} else {
								this.method7209(local54);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass256_11.method6124(local31, local15);
					}
					if (local31 == ' ') {
						if (Static253.anInt8443 > 0) {
							Static292.anInt5882 += Static253.anInt8443;
							arg6 += Static292.anInt5882 >> 8;
							Static292.anInt5882 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static264.anInt5214 & 0xFF000000) != 0) {
							this.HA(local31, arg6 + 1, local11 + 1, Static264.anInt5214, true);
						}
						this.HA(local31, arg6, local11, Static264.anInt5212, false);
					} else {
						if ((Static264.anInt5214 & 0xFF000000) != 0) {
							this.method7218(local31, arg6 + 1, local11 + 1, Static264.anInt5214, true, arg7, arg5, arg0);
						}
						this.method7218(local31, arg6, local11, Static264.anInt5212, false, arg7, arg5, arg0);
					}
					@Pc(297) int local297 = this.aClass256_11.method6121(local31);
					if (Static317.anInt6139 != -1) {
						this.aClass62_38.method7042(local297, local11 + (int) ((double) this.aClass256_11.anInt7544 * 0.7D), arg6, Static317.anInt6139);
					}
					if (Static209.anInt3899 != -1) {
						this.aClass62_38.method7042(local297, local11 + this.aClass256_11.anInt7544 + 1, arg6, Static209.anInt3899);
					}
					arg6 += local297;
					local15 = local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!pa;IIIIIIII[Lclient!ha;II[IILjava/lang/String;)I")
	public final int method7208(@OriginalArg(1) Class87 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) Class25[] arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int[] arg10, @OriginalArg(14) int arg11, @OriginalArg(15) String arg12) {
		return this.method7215(arg8, arg1, arg12, 0, arg10, arg7, arg5, arg6, arg11, arg9, arg4, 0, 1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method7209(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static264.anInt5212 = Static264.anInt5212 & 0xFF000000 | Static200.method3290(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static264.anInt5212 = Static38.anInt899 & 0xFFFFFF | Static264.anInt5212 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static264.anInt5212 = Static200.method3290(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static264.anInt5212 = Static38.anInt899;
			} else if (arg0.startsWith("str=")) {
				Static317.anInt6139 = Static264.anInt5212 & 0xFF000000 | Static200.method3290(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static317.anInt6139 = Static264.anInt5212 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static317.anInt6139 = -1;
			} else if (arg0.startsWith("u=")) {
				Static209.anInt3899 = Static264.anInt5212 & 0xFF000000 | Static200.method3290(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static209.anInt3899 = Static264.anInt5212 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static209.anInt3899 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static264.anInt5214 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static264.anInt5214 = Static264.anInt5212 & 0xFF000000 | Static200.method3290(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static264.anInt5214 = Static264.anInt5212 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static264.anInt5214 = Static185.anInt3576;
				return;
			} else if (arg0.equals("br")) {
				this.method7217(Static38.anInt899, Static185.anInt3576);
				return;
			}
		} catch (@Pc(177) Exception local177) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method7210(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(15) int local15 = 0; arg1.length() > local15; local15++) {
			@Pc(21) char local21 = arg1.charAt(local15);
			if (local21 == '<') {
				local9 = true;
			} else if (local21 == '>') {
				local9 = false;
			} else if (!local9 && local21 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static253.anInt8443 = (arg0 - this.aClass256_11.method6113(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBIILjava/lang/String;I)V")
	public final void method7211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method7217(arg4, arg0);
			this.method7207(0, arg3, null, null, arg2, 0, arg1, null);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIILjava/lang/String;III)V")
	public final void method7212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method7217(arg0, -16777216);
		@Pc(16) int local16 = arg2.length();
		@Pc(23) int[] local23 = new int[local16];
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			local23[local25] = (int) (Math.sin((double) arg1 / 5.0D + (double) local25 / 2.0D) * 5.0D);
		}
		this.method7216(null, null, local23, arg3 - this.aClass256_11.method6113(arg2) / 2, arg4, null, arg2);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIZIIILjava/lang/String;)V")
	public final void method7213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method7217(arg3, -16777216);
		@Pc(32) double local32 = 7.0D - (double) arg1 / 8.0D;
		if (local32 < 0.0D) {
			local32 = 0.0D;
		}
		@Pc(41) int local41 = arg5.length();
		@Pc(44) int[] local44 = new int[local41];
		for (@Pc(46) int local46 = 0; local46 < local41; local46++) {
			local44[local46] = (int) (Math.sin((double) local46 / 1.5D + (double) arg0) * local32);
		}
		this.method7216(null, null, local44, arg4 - this.aClass256_11.method6113(arg5) / 2, arg2, null, arg5);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;IBLjava/util/Random;IILjava/lang/String;III[IIII[I)I")
	public final int method7214(@OriginalArg(0) Class25[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		if (arg5 == null) {
			return 0;
		}
		arg2.setSeed((long) arg11);
		@Pc(28) int local28 = (arg2.nextInt() & 0x1F) + 192;
		this.method7217(local28 << 24 | arg3 & 0xFFFFFF, arg7 & 0xFFFFFF | local28 << 24);
		@Pc(48) int local48 = arg5.length();
		@Pc(51) int[] local51 = new int[local48];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local51[local55] = local53;
			if ((arg2.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		@Pc(77) int local77 = arg10;
		@Pc(84) int local84 = arg8 + this.aClass256_11.anInt7541;
		if (arg4 == 1) {
			local84 += (arg6 - this.aClass256_11.anInt7540 - this.aClass256_11.anInt7541) / 2;
		} else if (arg4 == 2) {
			local84 = arg6 + arg8 - this.aClass256_11.anInt7540;
		}
		@Pc(121) int local121 = -1;
		if (arg12 == 1) {
			local121 = this.aClass256_11.method6113(arg5) + local53;
			local77 = arg10 + (arg1 - local121) / 2;
		} else if (arg12 == 2) {
			local121 = this.aClass256_11.method6113(arg5) + local53;
			local77 = arg10 + arg1 - local121;
		}
		this.method7216(arg0, local51, null, local77, local84, arg13, arg5);
		if (arg9 != null) {
			if (local121 == -1) {
				local121 = this.aClass256_11.method6113(arg5) + local53;
			}
			arg9[1] = local84 - this.aClass256_11.anInt7541;
			arg9[0] = local77;
			arg9[3] = this.aClass256_11.anInt7541 + this.aClass256_11.anInt7540;
			arg9[2] = local121;
		}
		return local53;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBLjava/lang/String;I[I[Lclient!ha;IIIIIIIIILclient!pa;)I")
	public final int method7215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class25[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class87 arg15) {
		if (arg2 == null) {
			return 0;
		}
		this.method7217(arg13, arg1);
		if (arg3 == 0) {
			arg3 = this.aClass256_11.anInt7544;
		}
		@Pc(41) int[] local41;
		if (arg7 < arg3 + this.aClass256_11.anInt7541 + this.aClass256_11.anInt7540 && arg7 < arg3 + arg3) {
			local41 = null;
		} else {
			local41 = new int[] { arg14 };
		}
		@Pc(71) int local71 = this.aClass256_11.method6122(arg2, arg5, local41, Static247.aStringArray21);
		if (arg11 == -1) {
			arg11 = arg7 / arg3;
			if (arg11 <= 0) {
				arg11 = 1;
			}
		}
		if (arg11 > 0 && arg11 <= local71) {
			local71 = arg11;
			Static247.aStringArray21[arg11 - 1] = this.aClass256_11.method6117(Static247.aStringArray21[arg11 - 1], arg14, arg5);
		}
		if (arg6 == 3 && local71 == 1) {
			arg6 = 1;
		}
		@Pc(124) int local124;
		@Pc(156) int local156;
		if (arg6 == 0) {
			local124 = this.aClass256_11.anInt7541 + arg9;
		} else if (arg6 == 1) {
			local124 = this.aClass256_11.anInt7541 + arg9 + (-(arg3 * (local71 + -1)) + -this.aClass256_11.anInt7540 + -this.aClass256_11.anInt7541 + arg7) / 2;
		} else if (arg6 == 2) {
			local124 = arg9 + arg7 - this.aClass256_11.anInt7540 - arg3 * (local71 - 1);
		} else {
			local156 = (arg7 - arg3 * (local71 - 1) - this.aClass256_11.anInt7541 - this.aClass256_11.anInt7540) / (local71 + 1);
			if (local156 < 0) {
				local156 = 0;
			}
			local124 = this.aClass256_11.anInt7541 + arg9 + local156;
			arg3 += local156;
		}
		for (local156 = 0; local156 < local71; local156++) {
			if (arg12 == 0) {
				this.method7207(arg0, Static247.aStringArray21[local156], arg5, arg4, local124, arg8, arg10, arg15);
			} else if (arg12 == 1) {
				this.method7207(arg0, Static247.aStringArray21[local156], arg5, arg4, local124, arg8, (arg14 - this.aClass256_11.method6113(Static247.aStringArray21[local156])) / 2 + arg10, arg15);
			} else if (arg12 == 2) {
				this.method7207(arg0, Static247.aStringArray21[local156], arg5, arg4, local124, arg8, arg10 + arg14 - this.aClass256_11.method6113(Static247.aStringArray21[local156]), arg15);
			} else if (local71 - 1 == local156) {
				this.method7207(arg0, Static247.aStringArray21[local156], arg5, arg4, local124, arg8, arg10, arg15);
			} else {
				this.method7210(arg14, Static247.aStringArray21[local156]);
				this.method7207(arg0, Static247.aStringArray21[local156], arg5, arg4, local124, arg8, arg10, arg15);
				Static253.anInt8443 = 0;
			}
			local124 += arg3;
		}
		return local71;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;[I[IIII[ILjava/lang/String;)V")
	private void method7216(@OriginalArg(0) Class25[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) String arg6) {
		@Pc(11) int local11 = arg4 - this.aClass256_11.anInt7544;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(28) int local28 = arg6.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(41) char local41 = (char) (Static410.method5971(arg6.charAt(local30)) & 0xFF);
			if (local41 == '<') {
				local13 = local30;
			} else {
				@Pc(126) int local126;
				@Pc(136) int local136;
				if (local41 == '>' && local13 != -1) {
					@Pc(64) String local64 = arg6.substring(local13 + 1, local30);
					local13 = -1;
					if (local64.equals("lt")) {
						local41 = '<';
					} else if (local64.equals("gt")) {
						local41 = '>';
					} else if (local64.equals("nbsp")) {
						local41 = ' ';
					} else if (local64.equals("shy")) {
						local41 = '\u00ad';
					} else if (local64.equals("times")) {
						local41 = '×';
					} else if (local64.equals("euro")) {
						local41 = '€';
					} else if (local64.equals("copy")) {
						local41 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local126 = 0;
									} else {
										local126 = arg1[local17];
									}
									if (arg2 == null) {
										local136 = 0;
									} else {
										local136 = arg2[local17];
									}
									local17++;
									@Pc(147) int local147 = Static412.method5992(local64.substring(4));
									@Pc(151) Class25 local151 = arg0[local147];
									@Pc(160) int local160 = arg5 == null ? local151.ma() : arg5[local147];
									local151.DA(arg3 + local126, local136 + -local160 + this.aClass256_11.anInt7544 + local11, 1, 0, 1);
									local15 = -1;
									arg3 += arg0[local147].EA();
								} catch (@Pc(189) Exception local189) {
								}
							} else {
								this.method7209(local64);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass256_11.method6124(local41, local15);
					}
					@Pc(231) int local231;
					if (arg1 == null) {
						local231 = 0;
					} else {
						local231 = arg1[local17];
					}
					if (arg2 == null) {
						local126 = 0;
					} else {
						local126 = arg2[local17];
					}
					if (local41 != ' ') {
						if ((Static264.anInt5214 & 0xFF000000) != 0) {
							this.HA(local41, arg3 + local231 + 1, local126 + 1 + local11, Static264.anInt5214, true);
						}
						this.HA(local41, arg3 + local231, local11 - -local126, Static264.anInt5212, false);
					} else if (Static253.anInt8443 > 0) {
						Static292.anInt5882 += Static253.anInt8443;
						arg3 += Static292.anInt5882 >> 8;
						Static292.anInt5882 &= 0xFF;
					}
					local17++;
					local136 = this.aClass256_11.method6121(local41);
					if (Static317.anInt6139 != -1) {
						this.aClass62_38.method7042(local136, local11 + (int) ((double) this.aClass256_11.anInt7544 * 0.7D), arg3, Static317.anInt6139);
					}
					if (Static209.anInt3899 != -1) {
						this.aClass62_38.method7042(local136, this.aClass256_11.anInt7544 + local11, arg3, Static209.anInt3899);
					}
					local15 = local41;
					arg3 += local136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	private void method7217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static209.anInt3899 = -1;
		Static317.anInt6139 = -1;
		Static38.anInt899 = arg0;
		Static264.anInt5212 = arg0;
		Static253.anInt8443 = 0;
		Static292.anInt5882 = 0;
		Static185.anInt3576 = arg1;
		Static264.anInt5214 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	protected abstract void method7218(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class87 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
