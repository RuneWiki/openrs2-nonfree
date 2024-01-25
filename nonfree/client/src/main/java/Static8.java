import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "bd", descriptor = "Lclient!lu;")
	public static final Class207 aClass207_1 = new Class207();

	@OriginalMember(owner = "client!ag", name = "dd", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_8 = new Class254(19, 6);

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)V")
	public static void method605(@OriginalArg(0) int arg0) {
		if (!Static104.aClass6_Sub6_Sub1_4.aBoolean123) {
			arg0 = -1;
		}
		if (Static367.anInt6941 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(20) Class301 local20 = Static106.aClass205_1.method4917(arg0);
			@Pc(26) Class1 local26 = local20.method7379();
			if (local26 == null) {
				arg0 = -1;
			} else {
				Static414.aClass246_5.method6132(local26.method60(), local26.method49(), Static38.aCanvas4, new Point(local20.anInt8813, local20.anInt8814), local26.method51());
				Static367.anInt6941 = arg0;
			}
		}
		if (arg0 == -1 && Static367.anInt6941 != -1) {
			Static414.aClass246_5.method6132(-1, null, Static38.aCanvas4, new Point(), -1);
			Static367.anInt6941 = -1;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIILclient!ep;)V")
	public static void method606(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class93 arg2) {
		if (Static122.aClass93_7 != null || Static218.aBoolean366 || (arg2 == null || Static165.method3346(arg2) == null)) {
			return;
		}
		Static122.aClass93_7 = arg2;
		Static371.aClass93_12 = Static165.method3346(arg2);
		Static151.anInt3285 = 0;
		Static416.anInt7781 = arg0;
		Static323.anInt6113 = arg1;
		Static191.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IBI)V")
	public static void method612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg0 != Static289.anInt5549) {
			Static473.anIntArray730 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static473.anIntArray730[local13] = (local13 << 12) / arg0;
			}
			Static153.anInt3343 = arg0 - 1;
			Static289.anInt5549 = arg0;
			Static337.anInt6232 = arg0 * 32;
		}
		if (Static468.anInt8642 == arg1) {
			return;
		}
		if (Static289.anInt5549 == arg1) {
			Static346.anIntArray472 = Static473.anIntArray730;
		} else {
			Static346.anIntArray472 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static346.anIntArray472[local13] = (local13 << 12) / arg1;
			}
		}
		Static468.anInt8642 = arg1;
		Static574.anInt9711 = arg1 - 1;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method614(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static222.aClass152_78.method4002(Static286.anInt5468) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static222.aClass152_80.method4002(Static286.anInt5468) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
