import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
	public static int anInt4403 = 0;

	@OriginalMember(owner = "client!ol", name = "Y", descriptor = "I")
	public static int anInt4405 = 0;

	@OriginalMember(owner = "client!ol", name = "Z", descriptor = "I")
	public static int anInt4406 = 0;

	@OriginalMember(owner = "client!ol", name = "bb", descriptor = "I")
	public static int anInt4408 = -1;

	@OriginalMember(owner = "client!ol", name = "eb", descriptor = "Z")
	public static boolean aBoolean276 = true;

	@OriginalMember(owner = "client!ol", name = "gb", descriptor = "S")
	public static short aShort65 = 1;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
	public static void method3230() {
		Static187.aClass89_27.method2265();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lclient!d;")
	public static Class32 method3231(@OriginalArg(0) int arg0) {
		@Pc(10) Class32 local10 = (Class32) Static209.aClass89_31.method2268((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static128.aClass168_95.method4058(Static204.method3256(arg0), Static211.method3376(arg0));
		local10 = new Class32();
		local10.anInt974 = arg0;
		if (local25 != null) {
			local10.method805(new Class1_Sub14(local25));
		}
		local10.method811();
		Static209.aClass89_31.method2272((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)V")
	public static void method3232() {
		Static251.method4175(Static266.anInt5317);
		@Pc(21) int local21 = (Static159.anInt3527 >> 3) + (Static58.anInt1269 >> 10);
		@Pc(32) int local32 = (Static94.anInt2161 >> 10) + (Static217.anInt4673 >> 3);
		Static1.anIntArray564 = new int[18];
		Static68.anIntArray170 = new int[18];
		Static24.aByteArrayArray4 = new byte[18][];
		Static262.anIntArrayArray66 = new int[18][4];
		Static271.anIntArray488 = new int[18];
		Static234.anIntArray456 = new int[18];
		Static72.aByteArrayArray10 = new byte[18][];
		Static175.aByteArrayArray2 = new byte[18][];
		Static230.aByteArrayArray13 = new byte[18][];
		Static153.anIntArray315 = new int[18];
		Static124.anIntArray275 = new int[18];
		Static129.aByteArrayArray11 = new byte[18][];
		@Pc(77) int local77 = 0;
		@Pc(83) int local83;
		for (local83 = (local21 - 6) / 8; local83 <= (local21 + 6) / 8; local83++) {
			for (@Pc(96) int local96 = (local32 - 6) / 8; local96 <= (local32 + 6) / 8; local96++) {
				@Pc(113) int local113 = local96 + (local83 << 8);
				Static234.anIntArray456[local77] = local113;
				Static271.anIntArray488[local77] = Static124.aClass168_93.method4069("m" + local83 + "_" + local96);
				Static1.anIntArray564[local77] = Static124.aClass168_93.method4069("l" + local83 + "_" + local96);
				Static153.anIntArray315[local77] = Static124.aClass168_93.method4069("n" + local83 + "_" + local96);
				Static124.anIntArray275[local77] = Static124.aClass168_93.method4069("um" + local83 + "_" + local96);
				Static68.anIntArray170[local77] = Static124.aClass168_93.method4069("ul" + local83 + "_" + local96);
				if (Static153.anIntArray315[local77] == -1) {
					Static271.anIntArray488[local77] = -1;
					Static1.anIntArray564[local77] = -1;
					Static124.anIntArray275[local77] = -1;
					Static68.anIntArray170[local77] = -1;
				}
				local77++;
			}
		}
		for (local83 = local77; local83 < Static153.anIntArray315.length; local83++) {
			Static153.anIntArray315[local83] = -1;
			Static271.anIntArray488[local83] = -1;
			Static1.anIntArray564[local83] = -1;
			Static124.anIntArray275[local83] = -1;
			Static68.anIntArray170[local83] = -1;
		}
		Static229.method3621(0, 8, false, local21, local32, 8, true);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIB)V")
	public static void method3233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 - arg1;
		@Pc(14) int local14 = arg2 - arg0;
		if (local14 == 0) {
			if (local9 != 0) {
				Static158.method1923(arg4, arg3, arg0, arg1);
			}
		} else if (local9 == 0) {
			Static135.method2293(arg1, arg2, arg0, arg4);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(60) boolean local60 = local9 > local14;
			@Pc(67) int local67;
			@Pc(65) int local65;
			if (local60) {
				local65 = arg2;
				local67 = arg0;
				arg0 = arg1;
				arg2 = arg3;
				arg3 = local65;
				arg1 = local67;
			}
			if (arg2 < arg0) {
				local65 = arg1;
				local67 = arg0;
				arg0 = arg2;
				arg1 = arg3;
				arg3 = local65;
				arg2 = local67;
			}
			local67 = arg1;
			local65 = arg2 - arg0;
			@Pc(107) int local107 = arg3 - arg1;
			@Pc(112) int local112 = -(local65 >> 1);
			if (local107 < 0) {
				local107 = -local107;
			}
			@Pc(129) int local129 = arg1 >= arg3 ? -1 : 1;
			@Pc(133) int local133;
			if (local60) {
				for (local133 = arg0; local133 <= arg2; local133++) {
					local112 += local107;
					Static121.anIntArrayArray33[local133][local67] = arg4;
					if (local112 > 0) {
						local112 -= local65;
						local67 += local129;
					}
				}
			} else {
				for (local133 = arg0; local133 <= arg2; local133++) {
					Static121.anIntArrayArray33[local67][local133] = arg4;
					local112 += local107;
					if (local112 > 0) {
						local67 += local129;
						local112 -= local65;
					}
				}
			}
		}
	}
}
