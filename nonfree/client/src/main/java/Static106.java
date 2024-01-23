import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
	public static int anInt3753;

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
	public static int anInt3747 = 2;

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
	public static int anInt3751 = 0;

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "[Lclient!db;")
	public static Class1_Sub5_Sub4[] aClass1_Sub5_Sub4Array6 = new Class1_Sub5_Sub4[14];

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
	public static int anInt3752 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBII)V")
	public static void method3313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static188.anInt3598 <= arg1 && arg1 <= Static289.anInt5245) {
			@Pc(23) int local23 = Static306.method4566(arg3, Static231.anInt4333, Static218.anInt4086);
			@Pc(29) int local29 = Static306.method4566(arg0, Static231.anInt4333, Static218.anInt4086);
			Static128.method2261(arg2, local23, arg1, local29);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!nm;)I")
	public static int method3315(@OriginalArg(1) Class119 arg0) {
		@Pc(11) int local11 = 0;
		if (arg0.method3250(Static210.anInt4012)) {
			local11++;
		}
		if (arg0.method3250(Static188.anInt3604)) {
			local11++;
		}
		return local11;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIBIII)V")
	public static void method3316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static299.method4478(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(23) int local23 = -arg5;
		@Pc(26) int local26 = -local15;
		@Pc(28) int local28 = arg5;
		@Pc(30) int local30 = local15;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(39) int local39 = arg1 - local15;
		@Pc(43) int[] local43 = Static40.anIntArrayArray6[arg3];
		Static103.method1978(arg4, local39, arg1 - arg5, local43);
		@Pc(55) int local55 = arg1 + local15;
		Static103.method1978(arg2, local55, local39, local43);
		Static103.method1978(arg4, arg1 + arg5, local55, local43);
		while (local10 < local28) {
			local34 += 2;
			local32 += 2;
			local26 += local34;
			local23 += local32;
			if (local26 >= 0 && local30 >= 1) {
				Static22.anIntArray49[local30] = local10;
				local30--;
				local26 -= local30 << 1;
			}
			local10++;
			@Pc(154) int[] local154;
			@Pc(135) int[] local135;
			@Pc(143) int local143;
			@Pc(139) int local139;
			@Pc(148) int local148;
			@Pc(159) int local159;
			@Pc(164) int local164;
			if (local23 >= 0) {
				local28--;
				if (local15 > local28) {
					local135 = Static40.anIntArrayArray6[arg3 - local28];
					local139 = local10 + arg1;
					local143 = Static22.anIntArray49[local28];
					local148 = arg1 - local10;
					local154 = Static40.anIntArrayArray6[local28 + arg3];
					local159 = arg1 + local143;
					local164 = arg1 - local143;
					Static103.method1978(arg4, local164, local148, local154);
					Static103.method1978(arg2, local159, local164, local154);
					Static103.method1978(arg4, local139, local159, local154);
					Static103.method1978(arg4, local164, local148, local135);
					Static103.method1978(arg2, local159, local164, local135);
					Static103.method1978(arg4, local139, local159, local135);
				} else {
					local154 = Static40.anIntArrayArray6[arg3 + local28];
					local135 = Static40.anIntArrayArray6[arg3 - local28];
					local143 = arg1 + local10;
					local139 = arg1 - local10;
					Static103.method1978(arg4, local143, local139, local154);
					Static103.method1978(arg4, local143, local139, local135);
				}
				local23 -= local28 << 1;
			}
			local154 = Static40.anIntArrayArray6[local10 + arg3];
			local135 = Static40.anIntArrayArray6[arg3 - local10];
			local139 = arg1 - local28;
			local143 = local28 + arg1;
			if (local10 >= local15) {
				Static103.method1978(arg4, local143, local139, local154);
				Static103.method1978(arg4, local143, local139, local135);
			} else {
				local148 = local10 <= local30 ? local30 : Static22.anIntArray49[local10];
				local164 = arg1 - local148;
				local159 = arg1 + local148;
				Static103.method1978(arg4, local164, local139, local154);
				Static103.method1978(arg2, local159, local164, local154);
				Static103.method1978(arg4, local143, local159, local154);
				Static103.method1978(arg4, local164, local139, local135);
				Static103.method1978(arg2, local159, local164, local135);
				Static103.method1978(arg4, local143, local159, local135);
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(IB)V")
	public static void method3317(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static249.aFloat101 = 3.0F;
		} else if (arg0 == 50) {
			Static249.aFloat101 = 4.0F;
		} else if (arg0 == 75) {
			Static249.aFloat101 = 6.0F;
		} else if (arg0 == 100) {
			Static249.aFloat101 = 8.0F;
		} else if (arg0 == 200) {
			Static249.aFloat101 = 16.0F;
		}
		Static272.anInt5001 = -1;
		Static272.anInt5001 = -1;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)V")
	public static void method3319(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub5_Sub21 local8 = Static278.method4266(9, arg0);
		local8.method4064();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V")
	public static void method3320(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub5_Sub21 local14 = Static278.method4266(11, arg0);
		local14.method4064();
	}
}
