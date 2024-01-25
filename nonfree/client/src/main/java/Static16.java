import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "[Lclient!wi;")
	public static Class372[] aClass372Array1;

	@OriginalMember(owner = "client!aia", name = "F", descriptor = "[Lclient!rr;")
	public static Class15_Sub1[] aClass15_Sub1Array1;

	@OriginalMember(owner = "client!aia", name = "hb", descriptor = "Lclient!dba;")
	public static Class8_Sub5_Sub4 aClass8_Sub5_Sub4_1;

	@OriginalMember(owner = "client!aia", name = "O", descriptor = "Lclient!uh;")
	public static final Class342 aClass342_1 = new Class342();

	@OriginalMember(owner = "client!aia", name = "Y", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!aia", name = "eb", descriptor = "Lclient!pfa;")
	public static final Class253 aClass253_3 = new Class253(4);

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)V")
	public static void method758(@OriginalArg(1) int arg0) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(10, arg0);
		local8.method3512();
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIII)I")
	public static int method763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg2 & arg0 - 1;
		@Pc(28) int local28 = Static36.method1266(local7, local17);
		@Pc(35) int local35 = Static36.method1266(local7 + 1, local17);
		@Pc(42) int local42 = Static36.method1266(local7, local17 + 1);
		@Pc(51) int local51 = Static36.method1266(local7 + 1, local17 - -1);
		@Pc(60) int local60 = Static332.method5393(local13, local28, local35, arg0);
		@Pc(67) int local67 = Static332.method5393(local13, local42, local51, arg0);
		return Static332.method5393(local23, local60, local67, arg0);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB)Z")
	public static boolean method765(@OriginalArg(0) int arg0) {
		return arg0 == 5 || arg0 == 13 || arg0 == 1002 || arg0 == 12 || arg0 == 9;
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V")
	public static void method768() {
		for (@Pc(10) Class8_Sub5_Sub6 local10 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7327(); local10 != null; local10 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7326()) {
			if (local10.anInt3391 > 1) {
				local10.anInt3391 = 0;
				Static565.aClass236_33.method6241(((Class8_Sub5_Sub7) local10.aClass302_2.aClass8_Sub5_52.aClass8_Sub5_66).aLong92, local10);
				local10.aClass302_2.method7322();
			}
		}
		Static156.anInt3931 = 0;
		Static548.anInt9471 = 0;
		Static72.aClass43_17.method1431();
		Static555.aClass253_37.method6598();
		Static414.aClass302_11.method7322();
		Static577.method8063(Static543.aClass8_Sub5_Sub7_4);
	}
}
