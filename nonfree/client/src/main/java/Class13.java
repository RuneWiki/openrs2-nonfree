import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public abstract class Class13 {

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "Lclient!di;")
	private final Class38 aClass38_7;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "Lclient!aa;")
	private final Class2 aClass2_13;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!aa;Lclient!di;)V")
	protected Class13(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class38 arg1) {
		this.aClass38_7 = arg1;
		this.aClass2_13 = arg0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;III[Lclient!lf;IBIIIIIILclient!tm;I[I)I")
	public final int method4442(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class90[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class97 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int[] arg14) {
		if (arg0 == null) {
			return 0;
		}
		this.method4448(arg8, arg10);
		if (arg3 == 0) {
			arg3 = this.aClass38_7.anInt1353;
		}
		@Pc(42) int[] local42;
		if (this.aClass38_7.anInt1355 + this.aClass38_7.anInt1347 + arg3 > arg13 && arg13 < arg3 + arg3) {
			local42 = null;
		} else {
			local42 = new int[] { arg6 };
		}
		@Pc(62) int local62 = this.aClass38_7.method1314(local42, arg4, Static221.aStringArray31, arg0);
		if (arg5 == 3 && local62 == 1) {
			arg5 = 1;
		}
		@Pc(80) int local80;
		@Pc(139) int local139;
		if (arg5 == 0) {
			local80 = this.aClass38_7.anInt1347 + arg11;
		} else if (arg5 == 1) {
			local80 = (arg13 - this.aClass38_7.anInt1347 - this.aClass38_7.anInt1355 - (local62 - 1) * arg3) / 2 + arg11 + this.aClass38_7.anInt1347;
		} else if (arg5 == 2) {
			local80 = arg11 + arg13 - arg3 * (local62 - 1) - this.aClass38_7.anInt1355;
		} else {
			local139 = (arg13 - (local62 - 1) * arg3 - this.aClass38_7.anInt1355 - this.aClass38_7.anInt1347) / (local62 + 1);
			if (local139 < 0) {
				local139 = 0;
			}
			arg3 += local139;
			local80 = local139 + this.aClass38_7.anInt1347 + arg11;
		}
		for (local139 = 0; local139 < local62; local139++) {
			if (arg1 == 0) {
				this.method4462(arg9, Static221.aStringArray31[local139], arg2, local80, arg12, arg7, arg4, arg14);
			} else if (arg1 == 1) {
				this.method4462((arg6 - this.aClass38_7.method1316(Static221.aStringArray31[local139])) / 2 + arg9, Static221.aStringArray31[local139], arg2, local80, arg12, arg7, arg4, arg14);
			} else if (arg1 == 2) {
				this.method4462(arg9 + arg6 - this.aClass38_7.method1316(Static221.aStringArray31[local139]), Static221.aStringArray31[local139], arg2, local80, arg12, arg7, arg4, arg14);
			} else if (local62 - 1 == local139) {
				this.method4462(arg9, Static221.aStringArray31[local139], arg2, local80, arg12, arg7, arg4, arg14);
			} else {
				this.method4450(arg6, Static221.aStringArray31[local139]);
				this.method4462(arg9, Static221.aStringArray31[local139], arg2, local80, arg12, arg7, arg4, arg14);
				Static184.anInt3835 = 0;
			}
			local80 += arg3;
		}
		return local62;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/util/Random;I[I[Lclient!lf;IILjava/lang/String;[IIIIZIII)I")
	public final int method4443(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class90[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == null) {
			return 0;
		}
		arg0.setSeed((long) arg8);
		@Pc(20) int local20 = (arg0.nextInt() & 0x1F) + 192;
		this.method4448(local20 << 24 | arg9 & 0xFFFFFF, local20 << 24 | arg10 & 0xFFFFFF);
		@Pc(45) int local45 = arg6.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg0.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(74) int local74 = arg11;
		@Pc(80) int local80 = arg5 + this.aClass38_7.anInt1347;
		@Pc(82) int local82 = -1;
		if (arg12 == 1) {
			local80 += (arg1 - this.aClass38_7.anInt1347 - this.aClass38_7.anInt1355) / 2;
		} else if (arg12 == 2) {
			local80 = arg1 + arg5 - this.aClass38_7.anInt1355;
		}
		if (arg13 == 1) {
			local82 = this.aClass38_7.method1316(arg6) + local50;
			local74 = arg11 + (arg4 - local82) / 2;
		} else if (arg13 == 2) {
			local82 = this.aClass38_7.method1316(arg6) + local50;
			local74 = arg11 + arg4 - local82;
		}
		this.method4454(arg2, local74, local80, null, arg3, arg6, local48);
		if (arg7 != null) {
			if (local82 == -1) {
				local82 = this.aClass38_7.method1316(arg6) + local50;
			}
			arg7[1] = local80 - this.aClass38_7.anInt1347;
			arg7[0] = local74;
			arg7[2] = local82;
			arg7[3] = this.aClass38_7.anInt1355 + this.aClass38_7.anInt1347;
		}
		return local50;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II[Lclient!lf;IIILjava/util/Random;[ILjava/lang/String;B)I")
	public final int method4444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Random arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg4.setSeed((long) arg1);
		@Pc(42) int local42 = (arg4.nextInt() & 0x1F) + 192;
		this.method4448((local42 | 0x0) << 24, local42 << 24 | 0xFFFFFF);
		@Pc(62) int local62 = arg6.length();
		@Pc(65) int[] local65 = new int[local62];
		@Pc(67) int local67 = 0;
		for (@Pc(69) int local69 = 0; local69 < local62; local69++) {
			local65[local69] = local67;
			if ((arg4.nextInt() & 0x3) == 0) {
				local67++;
			}
		}
		this.method4454(arg5, arg0, arg3, null, arg2, arg6, local65);
		return local67;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBIIILjava/lang/String;I)V")
	public final void method4445(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method4448(-16777216, arg4);
		@Pc(24) int local24 = arg3.length();
		@Pc(27) int[] local27 = new int[local24];
		@Pc(30) int[] local30 = new int[local24];
		for (@Pc(32) int local32 = 0; local32 < local24; local32++) {
			local27[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg2 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) arg2 / 5.0D + (double) local32 / 3.0D) * 5.0D);
		}
		this.method4454(null, arg0 - this.aClass38_7.method1316(arg3) / 2, arg1, local30, null, arg3, local27);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method4446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method4448(-16777216, arg3);
		@Pc(22) double local22 = 7.0D - (double) arg4 / 8.0D;
		if (local22 < 0.0D) {
			local22 = 0.0D;
		}
		@Pc(31) int local31 = arg5.length();
		@Pc(34) int[] local34 = new int[local31];
		for (@Pc(41) int local41 = 0; local41 < local31; local41++) {
			local34[local41] = (int) (local22 * Math.sin((double) arg0 + (double) local41 / 1.5D));
		}
		this.method4454(null, arg1 - this.aClass38_7.method1316(arg5) / 2, arg2, local34, null, arg5, null);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method4447(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static109.anInt2208 = Static109.anInt2208 & 0xFF000000 | Static348.method3536(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static109.anInt2208 = Static109.anInt2208 & 0xFF000000 | Static252.anInt4850 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static109.anInt2208 = Static348.method3536(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static109.anInt2208 = Static252.anInt4850;
			} else if (arg0.startsWith("str=")) {
				Static67.anInt1736 = Static348.method3536(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static67.anInt1736 = -8388608;
			} else if (arg0.equals("/str")) {
				Static67.anInt1736 = -1;
			} else if (arg0.startsWith("u=")) {
				Static248.anInt4819 = Static348.method3536(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static248.anInt4819 = -16777216;
			} else if (arg0.equals("/u")) {
				Static248.anInt4819 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static169.anInt4512 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static169.anInt4512 = Static348.method3536(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static169.anInt4512 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static169.anInt4512 = Static241.anInt4703;
			} else if (arg0.equals("br")) {
				this.method4448(Static241.anInt4703, Static252.anInt4850);
				return;
			}
		} catch (@Pc(159) Exception local159) {
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
	private void method4448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static252.anInt4850 = arg1;
		Static109.anInt2208 = arg1;
		Static178.anInt3686 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static67.anInt1736 = -1;
		Static184.anInt3835 = 0;
		Static248.anInt4819 = -1;
		Static241.anInt4703 = arg0;
		Static169.anInt4512 = arg0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILjava/lang/String;IBII)V")
	public final void method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method4448(-16777216, arg4);
		@Pc(21) int local21 = arg2.length();
		@Pc(24) int[] local24 = new int[local21];
		for (@Pc(26) int local26 = 0; local26 < local21; local26++) {
			local24[local26] = (int) (Math.sin((double) arg3 / 5.0D + (double) local26 / 2.0D) * 5.0D);
		}
		this.method4454(null, arg1 - this.aClass38_7.method1316(arg2) / 2, arg0, local24, null, arg2, null);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method4450(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg1.length() > local11; local11++) {
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
			Static184.anInt3835 = (arg0 - this.aClass38_7.method1316(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILjava/lang/String;III[Lclient!lf;[I)V")
	public final void method4451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class90[] arg5, @OriginalArg(7) int[] arg6) {
		if (arg2 != null) {
			this.method4448(arg0, arg3);
			this.method4462(arg1, arg2, 0, arg4, null, 0, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;IIBII)V")
	public final void method4452(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method4448(-1, arg2);
			this.method4462(arg1 - this.aClass38_7.method1316(arg0), arg0, 0, arg3, null, 0, null, null);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([III[I[Lclient!lf;Ljava/lang/String;[IZ)V")
	private void method4454(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class90[] arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass38_7.anInt1353;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(25) int local25 = arg5.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) char local38 = (char) (Static191.method3006(arg5.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local13 = local27;
			} else {
				@Pc(127) int local127;
				@Pc(137) int local137;
				if (local38 == '>' && local13 != -1) {
					@Pc(61) String local61 = arg5.substring(local13 + 1, local27);
					local13 = -1;
					if (local61.equals("lt")) {
						local38 = '<';
					} else if (local61.equals("gt")) {
						local38 = '>';
					} else if (local61.equals("nbsp")) {
						local38 = ' ';
					} else if (local61.equals("shy")) {
						local38 = '\u00ad';
					} else if (local61.equals("times")) {
						local38 = '×';
					} else if (local61.equals("euro")) {
						local38 = '€';
					} else if (local61.equals("copy")) {
						local38 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local127 = 0;
									} else {
										local127 = arg6[local17];
									}
									if (arg3 == null) {
										local137 = 0;
									} else {
										local137 = arg3[local17];
									}
									local17++;
									@Pc(148) int local148 = Static280.method4822(local61.substring(4));
									@Pc(152) Class90 local152 = arg4[local148];
									@Pc(161) int local161 = arg0 == null ? local152.method5467() : arg0[local148];
									local152.method5455(arg1 + local127, local137 + -local161 + (local7 - -this.aClass38_7.anInt1353), 0, 0);
									arg1 += arg4[local148].method5464();
									local15 = -1;
								} catch (@Pc(191) Exception local191) {
								}
							} else {
								this.method4447(local61);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass38_7.method1315(local38, local15);
					}
					@Pc(228) int local228;
					if (arg6 == null) {
						local228 = 0;
					} else {
						local228 = arg6[local17];
					}
					if (arg3 == null) {
						local127 = 0;
					} else {
						local127 = arg3[local17];
					}
					if (local38 != ' ') {
						if ((Static169.anInt4512 & 0xFF000000) != 0) {
							this.method4458(local38, arg1 + local228 + 1, local7 + 1 + local127, Static169.anInt4512, true);
						}
						this.method4458(local38, arg1 + local228, local7 + local127, Static109.anInt2208, false);
					} else if (Static184.anInt3835 > 0) {
						Static178.anInt3686 += Static184.anInt3835;
						arg1 += Static178.anInt3686 >> 8;
						Static178.anInt3686 &= 0xFF;
					}
					local17++;
					local137 = this.aClass38_7.method1308(local38);
					if (Static67.anInt1736 != -1) {
						this.aClass2_13.method3254(Static67.anInt1736, (int) ((double) this.aClass38_7.anInt1353 * 0.7D) + local7, arg1, local137);
					}
					if (Static248.anInt4819 != -1) {
						this.aClass2_13.method3254(Static248.anInt4819, this.aClass38_7.anInt1353 + local7, arg1, local137);
					}
					local15 = local38;
					arg1 += local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method4455(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method4448(arg3, arg4);
			this.method4462(arg2 - this.aClass38_7.method1316(arg1) / 2, arg1, 0, arg0, null, 0, null, null);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILjava/lang/String;BI)V")
	public final void method4456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method4448(arg2, arg0);
			this.method4462(arg4, arg3, 0, arg1, null, 0, null, null);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method4458(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;I[II[Lclient!lf;IZ)V")
	public final void method4460(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class90[] arg5, @OriginalArg(6) int arg6) {
		if (arg1 != null) {
			this.method4448(arg6, arg2);
			this.method4462(arg0 - this.aClass38_7.method1316(arg1), arg1, 0, arg4, null, 0, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(CIIIZLclient!tm;II)V")
	protected abstract void method4461(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class97 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;IIILclient!tm;I[Lclient!lf;[I)V")
	private void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class97 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class90[] arg6, @OriginalArg(8) int[] arg7) {
		@Pc(22) int local22 = arg3 - this.aClass38_7.anInt1353;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(29) int local29 = arg1.length();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(42) char local42 = (char) (Static191.method3006(arg1.charAt(local31)) & 0xFF);
			if (local42 == '<') {
				local24 = local31;
			} else {
				if (local42 == '>' && local24 != -1) {
					@Pc(64) String local64 = arg1.substring(local24 + 1, local31);
					local24 = -1;
					if (local64.equals("lt")) {
						local42 = '<';
					} else if (local64.equals("gt")) {
						local42 = '>';
					} else if (local64.equals("nbsp")) {
						local42 = ' ';
					} else if (local64.equals("shy")) {
						local42 = '\u00ad';
					} else if (local64.equals("times")) {
						local42 = '×';
					} else if (local64.equals("euro")) {
						local42 = '€';
					} else if (local64.equals("copy")) {
						local42 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									@Pc(126) int local126 = Static280.method4822(local64.substring(4));
									@Pc(130) Class90 local130 = arg6[local126];
									@Pc(139) int local139 = arg7 == null ? local130.method5467() : arg7[local126];
									if ((Static109.anInt2208 & 0xFF000000) == -16777216) {
										local130.method5455(arg0, this.aClass38_7.anInt1353 + local22 - local139, 0, 0);
									} else {
										local130.method5455(arg0, this.aClass38_7.anInt1353 + local22 - local139, 1, Static109.anInt2208 & 0xFF000000 | 0xFFFFFF);
									}
									arg0 += arg6[local126].method5464();
									local26 = -1;
								} catch (@Pc(191) Exception local191) {
								}
							} else {
								this.method4447(local64);
							}
							continue;
						}
						local42 = '®';
					}
				}
				if (local24 == -1) {
					if (local26 != -1) {
						arg0 += this.aClass38_7.method1315(local42, local26);
					}
					if (local42 == ' ') {
						if (Static184.anInt3835 > 0) {
							Static178.anInt3686 += Static184.anInt3835;
							arg0 += Static178.anInt3686 >> 8;
							Static178.anInt3686 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static169.anInt4512 & 0xFF000000) != 0) {
							this.method4458(local42, arg0 + 1, local22 + 1, Static169.anInt4512, true);
						}
						this.method4458(local42, arg0, local22, Static109.anInt2208, false);
					} else {
						if ((Static169.anInt4512 & 0xFF000000) != 0) {
							this.method4461(local42, arg0 + 1, local22 - -1, Static169.anInt4512, true, arg4, arg5, arg2);
						}
						this.method4461(local42, arg0, local22, Static109.anInt2208, false, arg4, arg5, arg2);
					}
					@Pc(312) int local312 = this.aClass38_7.method1308(local42);
					if (Static67.anInt1736 != -1) {
						this.aClass2_13.method3254(Static67.anInt1736, (int) ((double) this.aClass38_7.anInt1353 * 0.7D) + local22, arg0, local312);
					}
					if (Static248.anInt4819 != -1) {
						this.aClass2_13.method3254(Static248.anInt4819, this.aClass38_7.anInt1353 + local22 + 1, arg0, local312);
					}
					local26 = local42;
					arg0 += local312;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([IIIILjava/lang/String;IB[Lclient!lf;)V")
	public final void method4463(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class90[] arg6) {
		if (arg4 != null) {
			this.method4448(arg3, arg2);
			this.method4462(arg1 - this.aClass38_7.method1316(arg4) / 2, arg4, 0, arg5, null, 0, arg6, arg0);
		}
	}
}
