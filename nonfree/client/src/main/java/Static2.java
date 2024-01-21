import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
	public static int anInt57;

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
	public static int anInt63;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "[I")
	public static final int[] anIntArray1 = new int[500];

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
	public static int anInt56 = 0;

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_8 = Static181.method2795("<col=ffffff>");

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!aa", name = "T", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_9 = Static181.method2795("underlay)3dat");

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_10 = Static181.method2795(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_11 = Static181.method2795("mem=");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BILclient!qa;)V")
	public static void method57(@OriginalArg(1) int arg0, @OriginalArg(2) Class24_Sub4 arg1) {
		if (arg1.anInt3294 > Static13.anInt386) {
			Static71.method1375(arg1);
		} else if (Static13.anInt386 > arg1.anInt3308) {
			Static47.method941(arg1);
		} else {
			Static215.method3246(arg1);
		}
		if (arg1.anInt3316 < 128 || arg1.anInt3349 < 128 || arg1.anInt3316 >= 13184 || arg1.anInt3349 >= 13184) {
			arg1.anInt3349 = arg1.anInt3332 * 64 + arg1.anIntArray316[0] * 128;
			arg1.anInt3294 = 0;
			arg1.anInt3308 = 0;
			arg1.anInt3336 = -1;
			arg1.anInt3311 = -1;
			arg1.anInt3316 = arg1.anIntArray319[0] * 128 + arg1.anInt3332 * 64;
			arg1.method2520();
		}
		if (Static54.aClass24_Sub4_Sub1_1 == arg1 && (arg1.anInt3316 < 1536 || arg1.anInt3349 < 1536 || arg1.anInt3316 >= 11776 || arg1.anInt3349 >= 11776)) {
			arg1.anInt3336 = -1;
			arg1.anInt3311 = -1;
			arg1.anInt3316 = arg1.anIntArray319[0] * 128 + arg1.anInt3332 * 64;
			arg1.anInt3294 = 0;
			arg1.anInt3308 = 0;
			arg1.anInt3349 = arg1.anIntArray316[0] * 128 + arg1.anInt3332 * 64;
			arg1.method2520();
		}
		Static82.method1481(arg1);
		Static93.method1602(arg1);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(JB)Lclient!qe;")
	public static Class83 method59(@OriginalArg(0) long arg0) {
		Static57.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static57.aCalendar3.get(7);
		@Pc(17) int local17 = Static57.aCalendar3.get(5);
		@Pc(21) int local21 = Static57.aCalendar3.get(2);
		@Pc(25) int local25 = Static57.aCalendar3.get(1);
		@Pc(29) int local29 = Static57.aCalendar3.get(11);
		@Pc(33) int local33 = Static57.aCalendar3.get(12);
		@Pc(42) int local42 = Static57.aCalendar3.get(13);
		return Static67.method1268(new Class83[] { Static82.aClass83Array34[local13 - 1], Static6.aClass83_30, Static129.method2179(local17 / 10), Static129.method2179(local17 % 10), Static23.aClass83_143, Static38.aClass83Array20[local21], Static23.aClass83_143, Static129.method2179(local25), Static161.aClass83_64, Static129.method2179(local29 / 10), Static129.method2179(local29 % 10), Static148.aClass83_895, Static129.method2179(local33 / 10), Static129.method2179(local33 % 10), Static148.aClass83_895, Static129.method2179(local42 / 10), Static129.method2179(local42 % 10), Static30.aClass83_226 });
	}
}
