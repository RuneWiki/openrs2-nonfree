import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
	public static int anInt1427;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_481 = Static151.method2243("Hidden)2");

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "Lclient!ii;")
	public static Class47 aClass47_5 = null;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_482 = Static151.method2243("");

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
	public static int anInt1422 = 0;

	@OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
	public static int anInt1428 = 0;

	@OriginalMember(owner = "client!gh", name = "J", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_483 = Static151.method2243("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII)V")
	public static void method945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 - arg5 >= Static122.anInt2718 && Static153.anInt3279 >= arg5 + arg0 && Static154.anInt3307 <= arg1 - arg5 && Static15.anInt353 >= arg5 + arg1) {
			Static127.method1982(arg3, arg5, arg1, arg0, arg2, arg4);
		} else {
			Static88.method1250(arg3, arg1, arg5, arg4, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(JZ)Lclient!mb;")
	public static Class62 method947(@OriginalArg(0) long arg0) {
		Static173.aCalendar2.setTime(new Date(arg0));
		@Pc(18) int local18 = Static173.aCalendar2.get(7);
		@Pc(22) int local22 = Static173.aCalendar2.get(5);
		@Pc(26) int local26 = Static173.aCalendar2.get(2);
		@Pc(30) int local30 = Static173.aCalendar2.get(1);
		@Pc(34) int local34 = Static173.aCalendar2.get(11);
		@Pc(38) int local38 = Static173.aCalendar2.get(12);
		@Pc(42) int local42 = Static173.aCalendar2.get(13);
		return Static169.method2460(new Class62[] { Static72.aClass62Array40[local18 - 1], Static147.aClass62_1082, Static119.method1865(local22 / 10), Static119.method1865(local22 % 10), Static172.aClass62_220, Static53.aClass62Array30[local26], Static172.aClass62_220, Static119.method1865(local30), Static146.aClass62_1078, Static119.method1865(local34 / 10), Static119.method1865(local34 % 10), Static176.aClass62_1309, Static119.method1865(local38 / 10), Static119.method1865(local38 % 10), Static176.aClass62_1309, Static119.method1865(local42 / 10), Static119.method1865(local42 % 10), Static95.aClass62_752 });
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
	public static int method948(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static101.method1613(arg0);
	}
}
