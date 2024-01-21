import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	public static int anInt4292;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
	public static final int[] anIntArray386 = new int[5];

	@OriginalMember(owner = "client!w", name = "G", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_20 = new Class13();

	@OriginalMember(owner = "client!w", name = "M", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1487 = Static151.method2243("Standort");

	@OriginalMember(owner = "client!w", name = "S", descriptor = "I")
	public static int anInt4306 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLclient!kd;)Lclient!mb;")
	public static Class62 method3008(@OriginalArg(1) Class2_Sub11 arg0) {
		return Static196.method2788(arg0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)Lclient!qh;")
	public static Class2_Sub1_Sub19 method3010(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub19 local15 = (Class2_Sub1_Sub19) Static208.aClass53_24.method1648((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static95.aClass71_18.method2130(Static198.method2917(arg0), Static139.method2078(arg0));
		local15 = new Class2_Sub1_Sub19();
		if (local29 != null) {
			local15.method2403(new Class2_Sub11(local29));
		}
		Static208.aClass53_24.method1645((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(JI)V")
	public static void method3011(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static58.aClass2_Sub11_Sub1_2.method1595(162);
			Static58.aClass2_Sub11_Sub1_2.method1527(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!pb;)V")
	public static void method3012(@OriginalArg(1) Class71 arg0) {
		Static72.aClass71_14 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(III)V")
	public static void method3013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static95.anInt2134 != 0 && arg1 != -1) {
			Static78.method1104(Static95.anInt2134, Static156.aClass71_Sub1_18, arg1);
			Static164.aBoolean148 = true;
		}
	}
}
