import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "[[Lclient!pt;")
	public static Class263[][] aClass263ArrayArray5;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "[I")
	public static final int[] anIntArray261 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public static void method4390() {
		Static590.aClass342_204.method7693();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class147 local13 = local7.aClass147_3; local13 != null; local13 = local13.aClass147_2) {
			@Pc(17) Class25_Sub2_Sub2 local17 = local13.aClass25_Sub2_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort106 == arg1 && local17.aShort107 == arg2) {
				Static320.method4730(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4394(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 == 0) {
			Static319.aClass31_11 = Static448.method8065(Static348.aClass3_Sub51_Sub1_5.anInt9941 * 2, Static129.aCanvas6, 0, Static100.anInterface4_13, Static374.aClass284_112);
			if (arg1 != null) {
				Static319.aClass31_11.ja(0);
				@Pc(29) Class328 local29 = Static33.method484(Static336.aClass284_99, Static252.anInt4919);
				@Pc(38) Class63 local38 = Static319.aClass31_11.method8027(local29, Static607.method8154(Static194.aClass284_60, Static252.anInt4919));
				Static239.method3812();
				Static452.method6235(local38, arg1, Static319.aClass31_11, local29, true);
			}
		} else {
			@Pc(51) Class31 local51 = null;
			@Pc(79) Class63 local79;
			@Pc(70) Class328 local70;
			if (arg1 != null) {
				local51 = Static448.method8065(0, Static129.aCanvas6, 0, Static100.anInterface4_13, Static374.aClass284_112);
				local51.ja(0);
				local70 = Static33.method484(Static336.aClass284_99, Static252.anInt4919);
				local79 = local51.method8027(local70, Static607.method8154(Static194.aClass284_60, Static252.anInt4919));
				Static239.method3812();
				Static452.method6235(local79, arg1, local51, local70, true);
			}
			try {
				Static319.aClass31_11 = Static448.method8065(Static348.aClass3_Sub51_Sub1_5.anInt9941 * 2, Static129.aCanvas6, arg0, Static100.anInterface4_13, Static374.aClass284_112);
				if (arg1 != null) {
					local51.ja(0);
					local70 = Static33.method484(Static336.aClass284_99, Static252.anInt4919);
					local79 = local51.method8027(local70, Static607.method8154(Static194.aClass284_60, Static252.anInt4919));
					Static239.method3812();
					Static452.method6235(local79, arg1, local51, local70, true);
				}
				if (Static319.aClass31_11.method8054()) {
					@Pc(133) boolean local133 = true;
					try {
						local133 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(145) Throwable local145) {
					}
					@Pc(151) Class3_Sub8 local151;
					if (local133) {
						local151 = Static319.aClass31_11.method8036(146800640);
					} else {
						local151 = Static319.aClass31_11.method8036(104857600);
					}
					Static319.aClass31_11.method8064(local151);
				}
			} catch (@Pc(162) Throwable local162) {
				arg0 = 0;
				Static319.aClass31_11 = Static448.method8065(0, Static129.aCanvas6, 0, Static100.anInterface4_13, Static374.aClass284_112);
			}
			if (local51 != null) {
				try {
					local51.method8053();
				} catch (@Pc(179) Throwable local179) {
				}
			}
		}
		Static37.anInt1122 = arg0;
		Static57.method1392();
		Static319.aClass31_11.va(32);
		Static585.aClass42_6 = Static319.aClass31_11.method8031();
		Static378.aClass42_4 = Static319.aClass31_11.method8031();
		Static66.method1639();
		Static319.aClass31_11.method8045(!Static348.aClass3_Sub51_Sub1_5.aBoolean679);
		if (Static319.aClass31_11.method8047()) {
			Static566.method7707(Static348.aClass3_Sub51_Sub1_5.aBoolean686);
		}
		Static514.method6932(Static535.anInt9341 >> 3, Static345.anInt6228 >> 3, Static319.aClass31_11);
		Static38.method1056();
		Static67.aBoolean133 = false;
		Static251.aBoolean447 = true;
		Static384.aClass136Array1 = null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI[Ljava/lang/Object;I[I)V")
	public static void method4395(@OriginalArg(1) int arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg2) / 2;
		@Pc(25) int local25 = arg2;
		@Pc(29) int local29 = arg3[local23];
		arg3[local23] = arg3[arg0];
		arg3[arg0] = local29;
		@Pc(43) Object local43 = arg1[local23];
		arg1[local23] = arg1[arg0];
		arg1[arg0] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg2; local62 < arg0; local62++) {
			if (arg3[local62] < (local62 & local60) + local29) {
				@Pc(77) int local77 = arg3[local62];
				arg3[local62] = arg3[local25];
				arg3[local25] = local77;
				@Pc(91) Object local91 = arg1[local62];
				arg1[local62] = arg1[local25];
				arg1[local25++] = local91;
			}
		}
		arg3[arg0] = arg3[local25];
		arg3[local25] = local29;
		arg1[arg0] = arg1[local25];
		arg1[local25] = local43;
		method4395(local25 - 1, arg1, arg2, arg3);
		method4395(arg0, arg1, local25 + 1, arg3);
	}
}
