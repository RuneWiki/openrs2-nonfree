import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!ve;")
	public static Class69 aClass69_33;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1065 = Static81.method1507("sl_back");

	@OriginalMember(owner = "client!s", name = "h", descriptor = "[S")
	public static short[] aShortArray41 = new short[256];

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1066 = Static81.method1507("Untersuchen");

	@OriginalMember(owner = "client!s", name = "s", descriptor = "I")
	public static int anInt3693 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!dj;ILclient!dj;ILclient!dj;I)V")
	public static void method2829(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class24 arg3, @OriginalArg(5) int arg4) {
		for (@Pc(5) int local5 = 99; local5 > 0; local5--) {
			Static178.anIntArray339[local5] = Static178.anIntArray339[local5 - 1];
			Static8.aClass24Array1[local5] = Static8.aClass24Array1[local5 - 1];
			Static103.aClass24Array15[local5] = Static103.aClass24Array15[local5 - 1];
			Static95.aClass24Array14[local5] = Static95.aClass24Array14[local5 - 1];
			Static64.anIntArray141[local5] = Static64.anIntArray141[local5 - 1];
		}
		Static8.aClass24Array1[0] = arg1;
		Static103.aClass24Array15[0] = arg3;
		Static34.anInt922 = Static60.anInt3643;
		Static178.anIntArray339[0] = arg2;
		Static125.anInt2738++;
		Static95.aClass24Array14[0] = arg0;
		Static64.anIntArray141[0] = arg4;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIII)V")
	public static void method2833(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg2; local7++) {
			Static39.method731(Static98.anIntArrayArray16[local7], arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public static void method2834() {
		Static36.aClass86_12.method2817();
		Static152.aClass46_8.method1587();
		Static67.aClass86_24.method2817();
	}
}
