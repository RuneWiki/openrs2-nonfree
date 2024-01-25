import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class63 {

	@OriginalMember(owner = "client!da", name = "e", descriptor = "[F")
	public static final float[] aFloatArray90 = new float[16384];

	@OriginalMember(owner = "client!da", name = "k", descriptor = "[F")
	public static final float[] aFloatArray91 = new float[16384];

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Lclient!ha;")
	private final Class82 aClass82_17;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!ej;")
	private final Class93 aClass93_12;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray90[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray91[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!ej;)V")
	protected Class63(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class93 arg1) {
		this.aClass82_17 = arg0;
		this.aClass93_12 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)V")
	private void method7747(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static647.anInt10288 = -1;
		Static100.anInt2906 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static312.anInt6045 = 0;
		Class9_Sub2_Sub4_Sub1.lb = -1;
		Static320.anInt8788 = arg1;
		Static11.anInt199 = arg1;
		Static182.anInt3456 = arg0;
		Static24.anInt351 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!fd;III[ILclient!aa;ILjava/lang/String;)V")
	private void method7748(@OriginalArg(0) int arg0, @OriginalArg(1) Class103[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(7) int local7 = arg0 - this.aClass93_12.anInt2762;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg7.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(37) char local37 = (char) (Static605.method8320(arg7.charAt(local20)) & 0xFF);
			if (local37 == '<') {
				local13 = local20;
			} else {
				if (local37 == '>' && local13 != -1) {
					@Pc(59) String local59 = arg7.substring(local13 + 1, local20);
					local13 = -1;
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
									@Pc(123) int local123 = Static508.method7720(local59.substring(4));
									@Pc(127) Class103 local127 = arg1[local123];
									@Pc(136) int local136 = arg4 == null ? local127.method7451() : arg4[local123];
									if ((Static11.anInt199 & 0xFF000000) == -16777216) {
										local127.method7444(arg3, local7 + this.aClass93_12.anInt2762 - local136, 1, 0, 1);
									} else {
										local127.method7444(arg3, local7 + this.aClass93_12.anInt2762 - local136, 0, Static11.anInt199 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg3 += arg1[local123].method7454();
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method7766(local59);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass93_12.method2312(local37, local15);
					}
					if (local37 == ' ') {
						if (Static312.anInt6045 > 0) {
							Static100.anInt2906 += Static312.anInt6045;
							arg3 += Static100.anInt2906 >> 8;
							Static100.anInt2906 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static24.anInt351 & 0xFF000000) != 0) {
							this.fa(local37, arg3 + 1, local7 + 1, Static24.anInt351, true);
						}
						this.fa(local37, arg3, local7, Static11.anInt199, false);
					} else {
						if ((Static24.anInt351 & 0xFF000000) != 0) {
							this.method7767(local37, arg3 + 1, local7 + 1, Static24.anInt351, true, arg5, arg6, arg2);
						}
						this.method7767(local37, arg3, local7, Static11.anInt199, false, arg5, arg6, arg2);
					}
					@Pc(308) int local308 = this.aClass93_12.method2317(local37);
					if (Class9_Sub2_Sub4_Sub1.lb != -1) {
						this.aClass82_17.method6108(arg3, local7 + (int) ((double) this.aClass93_12.anInt2762 * 0.7D), Class9_Sub2_Sub4_Sub1.lb, local308);
					}
					if (Static647.anInt10288 != -1) {
						this.aClass82_17.method6108(arg3, this.aClass93_12.anInt2762 + local7 + 1, Static647.anInt10288, local308);
					}
					arg3 += local308;
					local15 = local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII[IILclient!aa;ILjava/lang/String;III[Lclient!fd;III)I")
	public final int method7749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) String arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class103[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method7759(arg5, arg1, arg11, arg12, arg7, arg8, arg4, arg0, arg2, arg13, 0, arg10, arg14, arg6, arg9, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIIILjava/lang/String;I)V")
	public final void method7750(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		if (arg4 == null) {
			return;
		}
		this.method7747(-16777216, arg5);
		@Pc(21) double local21 = 7.0D - (double) arg3 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg4.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (Math.sin((double) local35 / 1.5D + (double) arg2) * local21);
		}
		this.method7765(arg1, (Class103[]) null, local33, arg0 - this.aClass93_12.method2315(arg4) / 2, (int[]) null, arg4, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method7751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7747(arg1, arg3);
			this.method7748(arg4, (Class103[]) null, 0, arg0, (int[]) null, (Class1) null, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method7752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method7747(arg4, arg1);
			this.method7748(arg2, (Class103[]) null, 0, arg0 - this.aClass93_12.method2315(arg3), (int[]) null, (Class1) null, 0, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V")
	public final void method7753(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method7747(-16777216, arg1);
		@Pc(16) int local16 = arg0.length();
		@Pc(23) int[] local23 = new int[local16];
		@Pc(26) int[] local26 = new int[local16];
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			local23[local28] = (int) (Math.sin((double) arg4 / 5.0D + (double) local28 / 5.0D) * 5.0D);
			local26[local28] = (int) (Math.sin((double) arg4 / 5.0D + (double) local28 / 3.0D) * 5.0D);
		}
		this.method7765(arg3, (Class103[]) null, local26, arg2 - this.aClass93_12.method2315(arg0) / 2, (int[]) null, arg0, local23);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7754(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7747(arg3, arg2);
			this.method7748(arg1, (Class103[]) null, 0, arg4 - this.aClass93_12.method2315(arg0) / 2, (int[]) null, (Class1) null, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method7755(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method7747(-16777216, arg2);
		@Pc(24) int local24 = arg1.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) arg0 / 5.0D + (double) local29 / 2.0D) * 5.0D);
		}
		this.method7765(arg4, (Class103[]) null, local27, arg3 - this.aClass93_12.method2315(arg1) / 2, (int[]) null, arg1, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!fd;BI[ILjava/lang/String;II)V")
	public final void method7756(@OriginalArg(0) int arg0, @OriginalArg(1) Class103[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(7) int arg5) {
		if (arg4 != null) {
			this.method7747(0, arg5);
			this.method7748(arg2, arg1, 0, arg0, arg3, (Class1) null, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!fd;IIIILjava/util/Random;[IILjava/lang/String;)I")
	public final int method7757(@OriginalArg(0) int arg0, @OriginalArg(1) Class103[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Random arg4, @OriginalArg(7) int[] arg5, @OriginalArg(9) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg4.setSeed((long) arg0);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method7747((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg6.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg4.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method7765(arg2, arg1, (int[]) null, arg3, arg5, arg6, local43);
		return local45;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[Lclient!fd;IILjava/lang/String;[IIIIIIILclient!aa;II)I")
	public final int method7759(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class103[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class1 arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg5 == null) {
			return 0;
		}
		this.method7747(arg3, arg15);
		if (arg8 == 0) {
			arg8 = this.aClass93_12.anInt2762;
		}
		@Pc(42) int[] local42;
		if (arg0 < this.aClass93_12.anInt2765 + this.aClass93_12.anInt2767 + arg8 && arg0 < arg8 + arg8) {
			local42 = null;
		} else {
			local42 = new int[] { arg11 };
		}
		@Pc(60) int local60 = this.aClass93_12.method2311(arg5, Static94.aStringArray16, arg2, local42);
		if (arg10 == -1) {
			arg10 = arg0 / arg8;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local60 >= arg10) {
			Static94.aStringArray16[arg10 - 1] = this.aClass93_12.method2320(arg2, Static94.aStringArray16[arg10 - 1], arg11);
			local60 = arg10;
		}
		if (arg7 == 3 && local60 == 1) {
			arg7 = 1;
		}
		@Pc(159) int local159;
		@Pc(147) int local147;
		if (arg7 == 0) {
			local159 = arg9 + this.aClass93_12.anInt2765;
		} else if (arg7 == 1) {
			local159 = (arg0 - this.aClass93_12.anInt2765 - this.aClass93_12.anInt2767 - arg8 * (local60 - 1)) / 2 + this.aClass93_12.anInt2765 + arg9;
		} else if (arg7 == 2) {
			local159 = arg0 + arg9 - arg8 * (local60 - 1) - this.aClass93_12.anInt2767;
		} else {
			local147 = (arg0 - this.aClass93_12.anInt2767 - this.aClass93_12.anInt2765 - (local60 + -1) * arg8) / (local60 + 1);
			if (local147 < 0) {
				local147 = 0;
			}
			local159 = local147 + arg9 + this.aClass93_12.anInt2765;
			arg8 += local147;
		}
		for (local147 = 0; local147 < local60; local147++) {
			if (arg1 == 0) {
				this.method7748(local159, arg2, arg12, arg4, arg6, arg13, arg14, Static94.aStringArray16[local147]);
			} else if (arg1 == 1) {
				this.method7748(local159, arg2, arg12, arg4 + (arg11 - this.aClass93_12.method2315(Static94.aStringArray16[local147])) / 2, arg6, arg13, arg14, Static94.aStringArray16[local147]);
			} else if (arg1 == 2) {
				this.method7748(local159, arg2, arg12, arg4 + arg11 - this.aClass93_12.method2315(Static94.aStringArray16[local147]), arg6, arg13, arg14, Static94.aStringArray16[local147]);
			} else if (local60 - 1 == local147) {
				this.method7748(local159, arg2, arg12, arg4, arg6, arg13, arg14, Static94.aStringArray16[local147]);
			} else {
				this.method7760(arg11, Static94.aStringArray16[local147]);
				this.method7748(local159, arg2, arg12, arg4, arg6, arg13, arg14, Static94.aStringArray16[local147]);
				Static312.anInt6045 = 0;
			}
			local159 += arg8;
		}
		return local60;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;B)V")
	private void method7760(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; arg1.length() > local15; local15++) {
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
			Static312.anInt6045 = (arg0 - this.aClass93_12.method2315(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/util/Random;IILjava/lang/String;III[I[III[Lclient!fd;I)I")
	public final int method7764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class103[] arg12, @OriginalArg(14) int arg13) {
		if (arg4 == null) {
			return 0;
		}
		arg2.setSeed((long) arg0);
		@Pc(25) int local25 = (arg2.nextInt() & 0x1F) + 192;
		this.method7747(local25 << 24 | arg13 & 0xFFFFFF, arg5 & 0xFFFFFF | local25 << 24);
		@Pc(45) int local45 = arg4.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg2.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(70) int local70 = arg6;
		@Pc(76) int local76 = arg7 + this.aClass93_12.anInt2765;
		@Pc(78) int local78 = -1;
		if (arg11 == 1) {
			local76 += (arg3 - this.aClass93_12.anInt2765 - this.aClass93_12.anInt2767) / 2;
		} else if (arg11 == 2) {
			local76 = arg3 + arg7 - this.aClass93_12.anInt2767;
		}
		if (arg10 == 1) {
			local78 = this.aClass93_12.method2315(arg4) + local50;
			local70 = arg6 + (arg1 - local78) / 2;
		} else if (arg10 == 2) {
			local78 = local50 + this.aClass93_12.method2315(arg4);
			local70 = arg6 + arg1 - local78;
		}
		this.method7765(local76, arg12, (int[]) null, local70, arg8, arg4, local48);
		if (arg9 != null) {
			if (local78 == -1) {
				local78 = this.aClass93_12.method2315(arg4) + local50;
			}
			arg9[3] = this.aClass93_12.anInt2767 + this.aClass93_12.anInt2765;
			arg9[1] = local76 - this.aClass93_12.anInt2765;
			arg9[2] = local78;
			arg9[0] = local70;
		}
		return local50;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!fd;[II[ILjava/lang/String;[IB)V")
	private void method7765(@OriginalArg(0) int arg0, @OriginalArg(1) Class103[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int[] arg6) {
		@Pc(11) int local11 = arg0 - this.aClass93_12.anInt2762;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg5.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(41) char local41 = (char) (Static605.method8320(arg5.charAt(local22)) & 0xFF);
			if (local41 == '<') {
				local13 = local22;
			} else {
				@Pc(120) int local120;
				@Pc(130) int local130;
				if (local41 == '>' && local13 != -1) {
					@Pc(64) String local64 = arg5.substring(local13 + 1, local22);
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
									if (arg6 == null) {
										local120 = 0;
									} else {
										local120 = arg6[local17];
									}
									if (arg2 == null) {
										local130 = 0;
									} else {
										local130 = arg2[local17];
									}
									local17++;
									@Pc(143) int local143 = Static508.method7720(local64.substring(4));
									@Pc(147) Class103 local147 = arg1[local143];
									@Pc(156) int local156 = arg4 == null ? local147.method7451() : arg4[local143];
									local147.method7444(arg3 + local120, local130 + local11 + (this.aClass93_12.anInt2762 - local156), 1, 0, 1);
									local15 = -1;
									arg3 += arg1[local143].method7454();
								} catch (@Pc(184) Exception local184) {
								}
							} else {
								this.method7766(local64);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass93_12.method2312(local41, local15);
					}
					@Pc(232) int local232;
					if (arg6 == null) {
						local232 = 0;
					} else {
						local232 = arg6[local17];
					}
					if (arg2 == null) {
						local120 = 0;
					} else {
						local120 = arg2[local17];
					}
					if (local41 != ' ') {
						if ((Static24.anInt351 & 0xFF000000) != 0) {
							this.fa(local41, arg3 + local232 + 1, local120 + local11 - -1, Static24.anInt351, true);
						}
						this.fa(local41, arg3 + local232, local11 + local120, Static11.anInt199, false);
					} else if (Static312.anInt6045 > 0) {
						Static100.anInt2906 += Static312.anInt6045;
						arg3 += Static100.anInt2906 >> 8;
						Static100.anInt2906 &= 0xFF;
					}
					local17++;
					local130 = this.aClass93_12.method2317(local41);
					if (Class9_Sub2_Sub4_Sub1.lb != -1) {
						this.aClass82_17.method6108(arg3, local11 + (int) ((double) this.aClass93_12.anInt2762 * 0.7D), Class9_Sub2_Sub4_Sub1.lb, local130);
					}
					if (Static647.anInt10288 != -1) {
						this.aClass82_17.method6108(arg3, local11 + this.aClass93_12.anInt2762, Static647.anInt10288, local130);
					}
					arg3 += local130;
					local15 = local41;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method7766(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static11.anInt199 = Static11.anInt199 & 0xFF000000 | Static460.method6836(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static11.anInt199 = Static320.anInt8788 & 0xFFFFFF | Static11.anInt199 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static11.anInt199 = Static460.method6836(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static11.anInt199 = Static320.anInt8788;
			} else if (arg0.startsWith("str=")) {
				Class9_Sub2_Sub4_Sub1.lb = Static11.anInt199 & 0xFF000000 | Static460.method6836(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Class9_Sub2_Sub4_Sub1.lb = Static11.anInt199 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Class9_Sub2_Sub4_Sub1.lb = -1;
			} else if (arg0.startsWith("u=")) {
				Static647.anInt10288 = Static11.anInt199 & 0xFF000000 | Static460.method6836(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static647.anInt10288 = Static11.anInt199 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static647.anInt10288 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static24.anInt351 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static24.anInt351 = Static11.anInt199 & 0xFF000000 | Static460.method6836(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static24.anInt351 = Static11.anInt199 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static24.anInt351 = Static182.anInt3456;
			} else if (arg0.equals("br")) {
				this.method7747(Static182.anInt3456, Static320.anInt8788);
			}
		} catch (@Pc(187) Exception local187) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method7767(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
