import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!na", name = "S", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1014 = Static177.method3050("<col=40ff00>");

	@OriginalMember(owner = "client!na", name = "T", descriptor = "I")
	public static int anInt2757 = 0;

	@OriginalMember(owner = "client!na", name = "V", descriptor = "Lclient!db;")
	public static final Class20 aClass20_6 = new Class20(4096);

	@OriginalMember(owner = "client!na", name = "X", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1015 = Static177.method3050("::noclip");

	@OriginalMember(owner = "client!na", name = "Z", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1016 = Static177.method3050("<col=ff3000>");

	@OriginalMember(owner = "client!na", name = "jb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1021 = Static177.method3050("Free world");

	@OriginalMember(owner = "client!na", name = "bb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1017 = aClass46_1021;

	@OriginalMember(owner = "client!na", name = "ib", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1020 = Static177.method3050("Login server offline)3");

	@OriginalMember(owner = "client!na", name = "cb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1018 = aClass46_1020;

	@OriginalMember(owner = "client!na", name = "fb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1019 = Static177.method3050("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!nh;ZLclient!nh;)V")
	public static void method2086(@OriginalArg(1) Class62 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class62 arg2) {
		Static103.aBoolean112 = arg1;
		Static53.aClass62_14 = arg2;
		Static96.aClass62_26 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!jd;BLclient!nh;Lclient!jd;)[Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3[] method2087(@OriginalArg(0) Class46 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(4) int local4 = arg1.method2859(arg2);
		@Pc(14) int local14 = arg1.method2860(local4, arg0);
		return Static41.method707(local4, local14, arg1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!jc;II)V")
	public static void method2088(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt2808 == arg2 && arg2 != -1) {
			@Pc(13) Class4_Sub1_Sub4 local13 = Static137.method2394(arg2);
			@Pc(16) int local16 = local13.anInt542;
			if (local16 == 1) {
				arg1.anInt2840 = arg0;
				arg1.anInt2837 = 0;
				arg1.anInt2844 = 0;
				arg1.anInt2812 = 0;
				Static186.method3139(local13, arg1.anInt2844, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1 == arg1, arg1.anInt2803, arg1.anInt2832);
			}
			if (local16 == 2) {
				arg1.anInt2812 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt2808 == -1 || Static137.method2394(arg2).anInt544 >= Static137.method2394(arg1.anInt2808).anInt544) {
			arg1.anInt2837 = 0;
			arg1.anInt2836 = arg1.anInt2823;
			arg1.anInt2812 = 0;
			arg1.anInt2844 = 0;
			arg1.anInt2808 = arg2;
			arg1.anInt2840 = arg0;
			if (arg1.anInt2808 != -1) {
				Static186.method3139(Static137.method2394(arg1.anInt2808), arg1.anInt2844, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1 == arg1, arg1.anInt2803, arg1.anInt2832);
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)Lclient!wh;")
	public static Class4_Sub1_Sub19 method2090(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub1_Sub19 local10 = (Class4_Sub1_Sub19) Static186.aClass66_50.method2225((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static53.aClass62_14.method2878(Static121.method2179(arg0), Static183.method1440(arg0));
		local10 = new Class4_Sub1_Sub19();
		local10.anInt4188 = arg0;
		if (local24 != null) {
			local10.method3181(new Class4_Sub11(local24));
		}
		local10.method3183();
		if (local10.aBoolean176) {
			local10.aBoolean177 = false;
			local10.anInt4156 = 0;
		}
		Static186.aClass66_50.method2222(local10, (long) arg0);
		return local10;
	}
}
