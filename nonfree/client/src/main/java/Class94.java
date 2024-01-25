import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public abstract class Class94 {

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "Lclient!pe;")
	private final Class89 aClass89_9;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "Lclient!vm;")
	private final Class208 aClass208_8;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!pe;Lclient!vm;)V")
	protected Class94(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class208 arg1) {
		this.aClass89_9 = arg0;
		this.aClass208_8 = arg1;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5675(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method5676(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
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
			Static325.anInt6177 = (arg0 - this.aClass208_8.method5385(arg1) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(CIIIZLclient!vj;II)V")
	protected abstract void method5677(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class64 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIZIILjava/lang/String;)V")
	public final void method5678(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method5691(arg0, -1);
			this.method5680(null, arg3, null, 0, 0, arg1, null, arg2 - this.aClass208_8.method5385(arg3));
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III[IZ[Lclient!kb;Ljava/lang/String;I)V")
	public final void method5679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) Class52[] arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		if (arg5 != null) {
			this.method5691(arg1, arg2);
			this.method5680(arg3, arg5, arg4, 0, 0, arg6, null, arg0 - this.aClass208_8.method5385(arg5) / 2);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([ILjava/lang/String;[Lclient!kb;IIILclient!vj;ZI)V")
	private void method5680(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class52[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class64 arg6, @OriginalArg(8) int arg7) {
		@Pc(5) int local5 = arg5 - this.aClass208_8.anInt6377;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(16) int local16 = arg1.length();
		for (@Pc(31) int local31 = 0; local31 < local16; local31++) {
			@Pc(41) char local41 = (char) (Static138.method2796(arg1.charAt(local31)) & 0xFF);
			if (local41 == '<') {
				local11 = local31;
			} else {
				if (local41 == '>' && local11 != -1) {
					@Pc(64) String local64 = arg1.substring(local11 + 1, local31);
					local11 = -1;
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
									@Pc(114) int local114 = Static281.method4414(local64.substring(4));
									@Pc(118) Class52 local118 = arg2[local114];
									@Pc(127) int local127 = arg0 == null ? local118.method4140() : arg0[local114];
									if ((Static21.anInt445 & 0xFF000000) == -16777216) {
										local118.method4131(arg7, this.aClass208_8.anInt6377 + local5 - local127, 0, 0);
									} else {
										local118.method4131(arg7, local5 + this.aClass208_8.anInt6377 - local127, 1, Static21.anInt445 & 0xFF000000 | 0xFFFFFF);
									}
									arg7 += arg2[local114].method4141();
									local13 = -1;
								} catch (@Pc(178) Exception local178) {
								}
							} else {
								this.method5686(local64);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg7 += this.aClass208_8.method5379(local13, local41);
					}
					if (local41 == ' ') {
						if (Static325.anInt6177 > 0) {
							Static349.anInt6595 += Static325.anInt6177;
							arg7 += Static349.anInt6595 >> 8;
							Static349.anInt6595 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static226.anInt4547 & 0xFF000000) != 0) {
							this.method5675(local41, arg7 + 1, local5 + 1, Static226.anInt4547, true);
						}
						this.method5675(local41, arg7, local5, Static21.anInt445, false);
					} else {
						if ((Static226.anInt4547 & 0xFF000000) != 0) {
							this.method5677(local41, arg7 + 1, local5 - -1, Static226.anInt4547, true, arg6, arg3, arg4);
						}
						this.method5677(local41, arg7, local5, Static21.anInt445, false, arg6, arg3, arg4);
					}
					@Pc(306) int local306 = this.aClass208_8.method5372(local41);
					if (Static130.anInt2843 != -1) {
						this.aClass89_9.method5448(arg7, local306, (int) ((double) this.aClass208_8.anInt6377 * 0.7D) + local5, Static130.anInt2843);
					}
					if (Static250.anInt4913 != -1) {
						this.aClass89_9.method5448(arg7, local306, this.aClass208_8.anInt6377 + local5 + 1, Static250.anInt4913);
					}
					local13 = local41;
					arg7 += local306;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method5682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		this.method5691(arg2, 0);
		@Pc(23) double local23 = 7.0D - (double) arg5 / 8.0D;
		if (local23 < 0.0D) {
			local23 = 0.0D;
		}
		@Pc(32) int local32 = arg4.length();
		@Pc(35) int[] local35 = new int[local32];
		for (@Pc(37) int local37 = 0; local37 < local32; local37++) {
			local35[local37] = (int) (Math.sin((double) arg3 + (double) local37 / 1.5D) * local23);
		}
		this.method5684(null, local35, null, arg0, arg1 - this.aClass208_8.method5385(arg4) / 2, null, arg4);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB[ILjava/util/Random;Ljava/lang/String;I[Lclient!kb;III)I")
	public final int method5683(@OriginalArg(2) int[] arg0, @OriginalArg(3) Random arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class52[] arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg1.setSeed((long) arg5);
		@Pc(19) int local19 = (arg1.nextInt() & 0x1F) + 192;
		this.method5691(local19 << 24 | 0xFFFFFF, (local19 | 0x0) << 24);
		@Pc(39) int local39 = arg2.length();
		@Pc(42) int[] local42 = new int[local39];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < local39; local46++) {
			local42[local46] = local44;
			if ((arg1.nextInt() & 0x3) == 0) {
				local44++;
			}
		}
		this.method5684(local42, null, arg0, arg6, arg3, arg4, arg2);
		return local44;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([I[I[IIII[Lclient!kb;Ljava/lang/String;)V")
	private void method5684(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class52[] arg5, @OriginalArg(7) String arg6) {
		@Pc(9) int local9 = arg3 - this.aClass208_8.anInt6377;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg6.length();
		for (@Pc(36) int local36 = 0; local36 < local18; local36++) {
			@Pc(46) char local46 = (char) (Static138.method2796(arg6.charAt(local36)) & 0xFF);
			if (local46 == '<') {
				local11 = local36;
			} else {
				@Pc(129) int local129;
				@Pc(138) int local138;
				if (local46 == '>' && local11 != -1) {
					@Pc(67) String local67 = arg6.substring(local11 + 1, local36);
					local11 = -1;
					if (local67.equals("lt")) {
						local46 = '<';
					} else if (local67.equals("gt")) {
						local46 = '>';
					} else if (local67.equals("nbsp")) {
						local46 = ' ';
					} else if (local67.equals("shy")) {
						local46 = '\u00ad';
					} else if (local67.equals("times")) {
						local46 = '×';
					} else if (local67.equals("euro")) {
						local46 = '€';
					} else if (local67.equals("copy")) {
						local46 = '©';
					} else {
						if (!local67.equals("reg")) {
							if (local67.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local129 = 0;
									} else {
										local129 = arg0[local15];
									}
									if (arg1 == null) {
										local138 = 0;
									} else {
										local138 = arg1[local15];
									}
									local15++;
									@Pc(148) int local148 = Static281.method4414(local67.substring(4));
									@Pc(152) Class52 local152 = arg5[local148];
									@Pc(161) int local161 = arg2 == null ? local152.method4140() : arg2[local148];
									local152.method4131(arg4 + local129, -local161 + this.aClass208_8.anInt6377 + local9 + local138, 0, 0);
									local13 = -1;
									arg4 += arg5[local148].method4141();
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method5686(local67);
							}
							continue;
						}
						local46 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg4 += this.aClass208_8.method5379(local13, local46);
					}
					@Pc(221) int local221;
					if (arg0 == null) {
						local221 = 0;
					} else {
						local221 = arg0[local15];
					}
					if (arg1 == null) {
						local129 = 0;
					} else {
						local129 = arg1[local15];
					}
					local15++;
					if (local46 != ' ') {
						if ((Static226.anInt4547 & 0xFF000000) != 0) {
							this.method5675(local46, arg4 + local221 + 1, local129 + local9 + 1, Static226.anInt4547, true);
						}
						this.method5675(local46, arg4 + local221, local9 - -local129, Static21.anInt445, false);
					} else if (Static325.anInt6177 > 0) {
						Static349.anInt6595 += Static325.anInt6177;
						arg4 += Static349.anInt6595 >> 8;
						Static349.anInt6595 &= 0xFF;
					}
					local138 = this.aClass208_8.method5372(local46);
					if (Static130.anInt2843 != -1) {
						this.aClass89_9.method5448(arg4, local138, (int) ((double) this.aClass208_8.anInt6377 * 0.7D) + local9, Static130.anInt2843);
					}
					if (Static250.anInt4913 != -1) {
						this.aClass89_9.method5448(arg4, local138, local9 + this.aClass208_8.anInt6377, Static250.anInt4913);
					}
					arg4 += local138;
					local13 = local46;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5686(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static21.anInt445 = Static21.anInt445 & 0xFF000000 | Static24.method418(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static21.anInt445 = Static58.anInt1486 & 0xFFFFFF | Static21.anInt445 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static21.anInt445 = Static24.method418(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static21.anInt445 = Static58.anInt1486;
			} else if (arg0.startsWith("str=")) {
				Static130.anInt2843 = Static24.method418(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static130.anInt2843 = -8388608;
			} else if (arg0.equals("/str")) {
				Static130.anInt2843 = -1;
			} else if (arg0.startsWith("u=")) {
				Static250.anInt4913 = Static24.method418(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static250.anInt4913 = -16777216;
			} else if (arg0.equals("/u")) {
				Static250.anInt4913 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static226.anInt4547 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static226.anInt4547 = Static24.method418(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static226.anInt4547 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static226.anInt4547 = Static123.anInt6671;
				return;
			} else if (arg0.equals("br")) {
				this.method5691(Static58.anInt1486, Static123.anInt6671);
				return;
			}
		} catch (@Pc(159) Exception local159) {
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjava/lang/String;BIII)V")
	public final void method5687(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5691(arg2, arg0);
			this.method5680(null, arg1, null, 0, 0, arg3, null, arg4 - this.aClass208_8.method5385(arg1) / 2);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLjava/lang/String;IIIII[I[Lclient!kb;Ljava/util/Random;[IIII)I")
	public final int method5688(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) Class52[] arg8, @OriginalArg(10) Random arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg1 == null) {
			return 0;
		}
		arg9.setSeed((long) arg13);
		@Pc(25) int local25 = (arg9.nextInt() & 0x1F) + 192;
		this.method5691(arg11 & 0xFFFFFF | local25 << 24, arg12 & 0xFFFFFF | local25 << 24);
		@Pc(45) int local45 = arg1.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg9.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(70) int local70 = arg0;
		@Pc(76) int local76 = arg4 + this.aClass208_8.anInt6381;
		@Pc(78) int local78 = -1;
		if (arg5 == 1) {
			local76 += (arg3 - this.aClass208_8.anInt6371 - this.aClass208_8.anInt6381) / 2;
		} else if (arg5 == 2) {
			local76 = arg4 + arg3 - this.aClass208_8.anInt6371;
		}
		if (arg2 == 1) {
			local78 = local50 + this.aClass208_8.method5385(arg1);
			local70 = arg0 + (arg6 - local78) / 2;
		} else if (arg2 == 2) {
			local78 = local50 + this.aClass208_8.method5385(arg1);
			local70 = arg0 + arg6 - local78;
		}
		this.method5684(local48, null, arg7, local76, local70, arg8, arg1);
		if (arg10 != null) {
			if (local78 == -1) {
				local78 = this.aClass208_8.method5385(arg1) + local50;
			}
			arg10[2] = local78;
			arg10[1] = local76 - this.aClass208_8.anInt6381;
			arg10[0] = local70;
			arg10[3] = this.aClass208_8.anInt6371 + this.aClass208_8.anInt6381;
		}
		return local50;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([Lclient!kb;Ljava/lang/String;IIII[II)V")
	public final void method5689(@OriginalArg(0) Class52[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		if (arg1 != null) {
			this.method5691(arg2, arg6);
			this.method5680(arg5, arg1, arg0, 0, 0, arg3, null, arg4);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method5690(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5691(arg3, 0);
		@Pc(14) int local14 = arg2.length();
		@Pc(17) int[] local17 = new int[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			local17[local19] = (int) (Math.sin((double) local19 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method5684(null, local17, null, arg0, arg1 - this.aClass208_8.method5385(arg2) / 2, null, arg2);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
	private void method5691(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static349.anInt6595 = 0;
		Static130.anInt2843 = -1;
		Static325.anInt6177 = 0;
		Static58.anInt1486 = arg0;
		Static21.anInt445 = arg0;
		Static250.anInt4913 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static123.anInt6671 = arg1;
		Static226.anInt4547 = arg1;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method5692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method5691(arg1, arg4);
			this.method5680(null, arg2, null, 0, 0, arg3, null, arg0);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII[IBIIILclient!vj;III[Lclient!kb;Ljava/lang/String;I)I")
	public final int method5693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class64 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class52[] arg12, @OriginalArg(14) String arg13, @OriginalArg(15) int arg14) {
		if (arg13 == null) {
			return 0;
		}
		this.method5691(arg9, arg1);
		if (arg14 == 0) {
			arg14 = this.aClass208_8.anInt6377;
		}
		@Pc(47) int[] local47;
		if (arg5 < this.aClass208_8.anInt6381 + this.aClass208_8.anInt6371 + arg14 && arg5 < arg14 + arg14) {
			local47 = null;
		} else {
			local47 = new int[] { arg10 };
		}
		@Pc(64) int local64 = this.aClass208_8.method5373(arg13, Static117.aStringArray29, arg12, local47);
		if (arg6 == 3 && local64 == 1) {
			arg6 = 1;
		}
		@Pc(107) int local107;
		@Pc(152) int local152;
		if (arg6 == 0) {
			local107 = this.aClass208_8.anInt6381 + arg11;
		} else if (arg6 == 1) {
			local107 = arg11 + this.aClass208_8.anInt6381 + (-((local64 + -1) * arg14) + -this.aClass208_8.anInt6381 + (arg5 - this.aClass208_8.anInt6371)) / 2;
		} else if (arg6 == 2) {
			local107 = arg5 + arg11 - arg14 * (local64 - 1) - this.aClass208_8.anInt6371;
		} else {
			local152 = (arg5 - this.aClass208_8.anInt6371 - this.aClass208_8.anInt6381 - arg14 * (local64 + -1)) / (local64 + 1);
			if (local152 < 0) {
				local152 = 0;
			}
			local107 = local152 + this.aClass208_8.anInt6381 + arg11;
			arg14 += local152;
		}
		for (local152 = 0; local152 < local64; local152++) {
			if (arg3 == 0) {
				this.method5680(arg4, Static117.aStringArray29[local152], arg12, arg7, arg0, local107, arg8, arg2);
			} else if (arg3 == 1) {
				this.method5680(arg4, Static117.aStringArray29[local152], arg12, arg7, arg0, local107, arg8, arg2 + (arg10 - this.aClass208_8.method5385(Static117.aStringArray29[local152])) / 2);
			} else if (arg3 == 2) {
				this.method5680(arg4, Static117.aStringArray29[local152], arg12, arg7, arg0, local107, arg8, arg10 + arg2 - this.aClass208_8.method5385(Static117.aStringArray29[local152]));
			} else if (local64 - 1 == local152) {
				this.method5680(arg4, Static117.aStringArray29[local152], arg12, arg7, arg0, local107, arg8, arg2);
			} else {
				this.method5676(arg10, Static117.aStringArray29[local152]);
				this.method5680(arg4, Static117.aStringArray29[local152], arg12, arg7, arg0, local107, arg8, arg2);
				Static325.anInt6177 = 0;
			}
			local107 += arg14;
		}
		return local64;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III[Lclient!kb;Ljava/lang/String;II[I)V")
	public final void method5694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class52[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		if (arg3 != null) {
			this.method5691(arg4, arg1);
			this.method5680(arg6, arg3, arg2, 0, 0, arg5, null, arg0 - this.aClass208_8.method5385(arg3));
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjava/lang/String;IBIII)V")
	public final void method5695(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5691(arg4, 0);
		@Pc(14) int local14 = arg1.length();
		@Pc(17) int[] local17 = new int[local14];
		@Pc(20) int[] local20 = new int[local14];
		for (@Pc(28) int local28 = 0; local28 < local14; local28++) {
			local17[local28] = (int) (Math.sin((double) arg3 / 5.0D + (double) local28 / 5.0D) * 5.0D);
			local20[local28] = (int) (Math.sin((double) local28 / 3.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method5684(local17, local20, null, arg2, arg0 - this.aClass208_8.method5385(arg1) / 2, null, arg1);
	}
}
