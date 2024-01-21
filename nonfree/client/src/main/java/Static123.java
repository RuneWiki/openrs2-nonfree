import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!p", name = "Kc", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_33;

	@OriginalMember(owner = "client!p", name = "vc", descriptor = "I")
	public static int anInt2726 = 0;

	@OriginalMember(owner = "client!p", name = "Gc", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1229 = Static32.method683("Could not complete login)3");

	@OriginalMember(owner = "client!p", name = "yc", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1228 = aClass49_1229;

	@OriginalMember(owner = "client!p", name = "Ac", descriptor = "I")
	public static int anInt2729 = 20;

	@OriginalMember(owner = "client!p", name = "Bc", descriptor = "I")
	public static int anInt2730 = 1;

	@OriginalMember(owner = "client!p", name = "Dc", descriptor = "I")
	public static int anInt2732 = -1;

	@OriginalMember(owner = "client!p", name = "Ec", descriptor = "I")
	public static int anInt2733 = 0;

	@OriginalMember(owner = "client!p", name = "Hc", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!p", name = "Ic", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1230 = Static32.method683("me");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!ja;)Lclient!j;")
	public static Class2_Sub3 method2140(@OriginalArg(1) Class2_Sub13 arg0) {
		@Pc(9) int local9 = arg0.method2962();
		@Pc(13) int local13 = arg0.method2962();
		@Pc(17) Class local17 = Static29.method552(local13);
		try {
			@Pc(21) Class2_Sub3 local21 = (Class2_Sub3) local17.getDeclaredConstructor().newInstance();
			if (local21 != null) {
				local21.anInt4038 = local9;
				local21.anInt4037 = arg0.method2962();
				@Pc(40) int local40 = arg0.method2962();
				for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
					@Pc(48) int local48 = arg0.method2962();
					local21.method3013(local48, arg0);
				}
			}
			local21.method3019();
			return local21;
		} catch (@Pc(67) IllegalAccessException local67) {
			throw new RuntimeException();
		} catch (@Pc(72) InstantiationException local72) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
	public static int method2141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIII)V")
	public static void method2142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg5 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg0 & 0x7FF;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg2;
		@Pc(38) int local38;
		@Pc(34) int local34;
		@Pc(49) int local49;
		if (local10 != 0) {
			local34 = Class2_Sub2_Sub2_Sub4.anIntArray218[local10];
			local38 = Class2_Sub2_Sub2_Sub4.anIntArray217[local10];
			local49 = local34 * 0 - arg2 * local38 >> 16;
			local23 = local34 * arg2 + local38 * 0 >> 16;
			local21 = local49;
		}
		if (local17 != 0) {
			local34 = Class2_Sub2_Sub2_Sub4.anIntArray218[local17];
			local38 = Class2_Sub2_Sub2_Sub4.anIntArray217[local17];
			local49 = local34 * 0 + local38 * local23 >> 16;
			local23 = local34 * local23 - local38 * 0 >> 16;
			local19 = local49;
		}
		Static35.anInt894 = arg4 - local19;
		Static101.anInt2150 = arg1 - local23;
		Static127.anInt2754 = arg0;
		Static66.anInt1389 = arg5;
		Static110.anInt2302 = arg3 - local21;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(Z)V")
	public static void method2143() {
		aClass49_1228 = null;
		aClass11_Sub1_33 = null;
		aClass49_1229 = null;
		aClass49_1230 = null;
	}
}
