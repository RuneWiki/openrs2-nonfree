import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "Lclient!an;")
	public static Class3_Sub4 aClass3_Sub4_2;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!jv;")
	public static final Class179 aClass179_2 = new Class179(64);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLclient!w;Lclient!mga;)Lclient!kf;")
	public static Class3_Sub34 method3123(@OriginalArg(1) Class375 arg0, @OriginalArg(2) Class218 arg1) {
		@Pc(13) Class3_Sub34 local13 = Static54.method1205();
		local13.anInt5093 = arg1.anInt5967;
		local13.aClass218_75 = arg1;
		if (local13.anInt5093 == -1) {
			local13.aClass3_Sub25_Sub1_2 = new Class3_Sub25_Sub1(260);
		} else if (local13.anInt5093 == -2) {
			local13.aClass3_Sub25_Sub1_2 = new Class3_Sub25_Sub1(10000);
		} else if (local13.anInt5093 <= 18) {
			local13.aClass3_Sub25_Sub1_2 = new Class3_Sub25_Sub1(20);
		} else if (local13.anInt5093 > 98) {
			local13.aClass3_Sub25_Sub1_2 = new Class3_Sub25_Sub1(260);
		} else {
			local13.aClass3_Sub25_Sub1_2 = new Class3_Sub25_Sub1(100);
		}
		local13.aClass3_Sub25_Sub1_2.method3397(arg0);
		local13.aClass3_Sub25_Sub1_2.method3392(local13.aClass218_75.method5394());
		local13.anInt5095 = 0;
		return local13;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z")
	public static boolean method3125(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(JB)I")
	public static int method3126(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IJ)I")
	public static int method3127(@OriginalArg(1) long arg0) {
		Static125.method2359(arg0);
		return Static379.aCalendar20.get(1);
	}
}
