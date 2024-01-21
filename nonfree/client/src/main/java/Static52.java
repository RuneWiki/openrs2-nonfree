import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] aClass1_Sub2_Sub8_Sub3Array10;

	@OriginalMember(owner = "client!fa", name = "db", descriptor = "[I")
	public static int[] anIntArray114;

	@OriginalMember(owner = "client!fa", name = "M", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!fa", name = "U", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_356 = Static81.method1507("::rect_debug");

	@OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
	public static int anInt1336 = 0;

	@OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
	public static int anInt1338 = 100;

	@OriginalMember(owner = "client!fa", name = "eb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_357 = Static81.method1507("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!fa", name = "fb", descriptor = "B")
	public static byte aByte3 = 0;

	@OriginalMember(owner = "client!fa", name = "hb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_358 = Static81.method1507(":assistreq:");

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
	public static void method1033() {
		Static75.aClass86_62.method2817();
		Static140.aClass46_5.method1587();
		Static28.aClass46_1.method1587();
		Static41.aClass46_3.method1587();
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)Z")
	public static boolean method1042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static166.anInt3693; local1++) {
			@Pc(6) Class61 local6 = Static54.aClass61Array6[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2587 == 1) {
				local15 = local6.anInt2597 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2590 + (local6.anInt2594 * local15 >> 8);
					local37 = local6.anInt2602 + (local6.anInt2591 * local15 >> 8);
					local47 = local6.anInt2603 + (local6.anInt2593 * local15 >> 8);
					local57 = local6.anInt2592 + (local6.anInt2600 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2587 == 2) {
				local15 = arg0 - local6.anInt2597;
				if (local15 > 0) {
					local27 = local6.anInt2590 + (local6.anInt2594 * local15 >> 8);
					local37 = local6.anInt2602 + (local6.anInt2591 * local15 >> 8);
					local47 = local6.anInt2603 + (local6.anInt2593 * local15 >> 8);
					local57 = local6.anInt2592 + (local6.anInt2600 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2587 == 3) {
				local15 = local6.anInt2590 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2597 + (local6.anInt2604 * local15 >> 8);
					local37 = local6.anInt2606 + (local6.anInt2599 * local15 >> 8);
					local47 = local6.anInt2603 + (local6.anInt2593 * local15 >> 8);
					local57 = local6.anInt2592 + (local6.anInt2600 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2587 == 4) {
				local15 = arg2 - local6.anInt2590;
				if (local15 > 0) {
					local27 = local6.anInt2597 + (local6.anInt2604 * local15 >> 8);
					local37 = local6.anInt2606 + (local6.anInt2599 * local15 >> 8);
					local47 = local6.anInt2603 + (local6.anInt2593 * local15 >> 8);
					local57 = local6.anInt2592 + (local6.anInt2600 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2587 == 5) {
				local15 = arg1 - local6.anInt2603;
				if (local15 > 0) {
					local27 = local6.anInt2597 + (local6.anInt2604 * local15 >> 8);
					local37 = local6.anInt2606 + (local6.anInt2599 * local15 >> 8);
					local47 = local6.anInt2590 + (local6.anInt2594 * local15 >> 8);
					local57 = local6.anInt2602 + (local6.anInt2591 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
