import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "Lclient!td;")
	public static Class1_Sub19_Sub3 aClass1_Sub19_Sub3_1;

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
	public static int anInt653 = 0;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "F")
	public static float aFloat5 = 1024.0F;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method555(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			local5 *= 37L;
			@Pc(19) char local19 = arg0.charAt(local10);
			if (local19 >= 'A' && local19 <= 'Z') {
				local5 += local19 + 1 - 65;
			} else if (local19 >= 'a' && local19 <= 'z') {
				local5 += local19 - 96;
			} else if (local19 >= '0' && local19 <= '9') {
				local5 += local19 + 27 - 48;
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BILclient!za;ILclient!pu;)V")
	public static void method557(@OriginalArg(2) Class106 arg0, @OriginalArg(4) Class203 arg1) {
		Static140.aClass203_19.method4553();
		if (Static19.aBoolean18) {
			return;
		}
		for (@Pc(22) Class1_Sub28 local22 = (Class1_Sub28) arg1.method4548(); local22 != null; local22 = (Class1_Sub28) arg1.method4545()) {
			@Pc(29) Class47 local29 = Static377.aClass170_4.method3739(local22.anInt4940);
			if (Static175.method2966(local29)) {
				@Pc(43) boolean local43 = Static334.method4720(local29, local22, arg0);
				if (local43) {
					Static409.method5564(arg0, local29, local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ec;ZZII)V")
	public static void method558(@OriginalArg(0) Class68 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6 = arg0.anInt2107;
		@Pc(9) int local9 = arg0.anInt2149;
		if (arg0.aByte41 == 0) {
			arg0.anInt2107 = arg0.anInt2190;
		} else if (arg0.aByte41 == 1) {
			arg0.anInt2107 = arg2 - arg0.anInt2190;
		} else if (arg0.aByte41 == 2) {
			arg0.anInt2107 = arg2 * arg0.anInt2190 >> 14;
		}
		if (arg0.aByte42 == 0) {
			arg0.anInt2149 = arg0.anInt2179;
		} else if (arg0.aByte42 == 1) {
			arg0.anInt2149 = arg3 - arg0.anInt2179;
		} else if (arg0.aByte42 == 2) {
			arg0.anInt2149 = arg0.anInt2179 * arg3 >> 14;
		}
		if (arg0.aByte41 == 4) {
			arg0.anInt2107 = arg0.anInt2140 * arg0.anInt2149 / arg0.anInt2099;
		}
		if (arg0.aByte42 == 4) {
			arg0.anInt2149 = arg0.anInt2107 * arg0.anInt2099 / arg0.anInt2140;
		}
		if (Static226.aBoolean281 && (Static55.method1059(arg0).anInt5243 != 0 || arg0.anInt2153 == 0)) {
			if (arg0.anInt2149 < 5 && arg0.anInt2107 < 5) {
				arg0.anInt2107 = 5;
				arg0.anInt2149 = 5;
			} else {
				if (arg0.anInt2149 <= 0) {
					arg0.anInt2149 = 5;
				}
				if (arg0.anInt2107 <= 0) {
					arg0.anInt2107 = 5;
				}
			}
		}
		if (arg0.anInt2169 == Static227.anInt4498) {
			Static201.aClass68_8 = arg0;
		}
		if (arg1 && arg0.anObjectArray5 != null && (local6 != arg0.anInt2107 || local9 != arg0.anInt2149)) {
			@Pc(177) Class1_Sub10 local177 = new Class1_Sub10();
			local177.aClass68_3 = arg0;
			local177.anObjectArray2 = arg0.anObjectArray5;
			Static106.aClass203_11.method4551(local177);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!za;Lclient!vl;III)V")
	public static void method559(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class252 local12;
		if (arg3 < Static216.anInt4346) {
			local12 = Static67.aClass252ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass30_Sub4_2 != null && local12.aClass30_Sub4_2.method5719()) {
				arg1.method5718(Static251.anInt4890, arg0, 0, 0, local12.aClass30_Sub4_2, true);
			}
		}
		if (arg4 < Static216.anInt4346) {
			local12 = Static67.aClass252ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass30_Sub4_2 != null && local12.aClass30_Sub4_2.method5719()) {
				arg1.method5718(0, arg0, Static251.anInt4890, 0, local12.aClass30_Sub4_2, true);
			}
		}
		if (arg3 < Static216.anInt4346 && arg4 < Static198.anInt7949) {
			local12 = Static67.aClass252ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass30_Sub4_2 != null && local12.aClass30_Sub4_2.method5719()) {
				arg1.method5718(Static251.anInt4890, arg0, Static251.anInt4890, 0, local12.aClass30_Sub4_2, true);
			}
		}
		if (arg3 < Static216.anInt4346 && arg4 > 0) {
			local12 = Static67.aClass252ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass30_Sub4_2 != null && local12.aClass30_Sub4_2.method5719()) {
				arg1.method5718(Static251.anInt4890, arg0, -Static251.anInt4890, 0, local12.aClass30_Sub4_2, true);
			}
		}
	}
}
