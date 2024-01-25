import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!dp;")
	public static Class53 aClass53_5;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	public static int anInt32 = 0;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
	public static int anInt36 = 1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method30(@OriginalArg(1) String arg0) {
		return Static298.method5111(arg0);
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	public static void method31() {
		if (Static122.aBoolean191) {
			return;
		}
		Static122.aBoolean191 = true;
		Static211.aBoolean291 = true;
		if (Static317.aBoolean395) {
			Static163.aFloat69 = (int) Static163.aFloat69 - 17 & 0xFFFFFFF0;
		} else {
			Static128.aFloat62 += (-12.0F - Static128.aFloat62) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method32(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static284.aString230 + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static338.aString298 + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
