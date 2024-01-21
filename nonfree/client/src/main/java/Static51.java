import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "Lclient!ga;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_357 = Static151.method2243("(R");

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
	public static int anInt1099 = 0;

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "Lclient!gd;")
	public static Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
	public static int anInt1107 = 99;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array29 = new Class62[1000];

	@OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
	public static int anInt1111 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method767() {
		for (@Pc(10) Class2_Sub7 local10 = (Class2_Sub7) Static49.aClass58_7.method1709(); local10 != null; local10 = (Class2_Sub7) Static49.aClass58_7.method1705()) {
			@Pc(15) int local15 = local10.anInt1410;
			if (Static124.method1934(local15)) {
				@Pc(21) boolean local21 = true;
				@Pc(25) Class47[] local25 = Static89.aClass47ArrayArray1[local15];
				for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
					if (local25[local27] != null) {
						local21 = local25[local27].aBoolean95;
						break;
					}
				}
				if (!local21) {
					@Pc(51) int local51 = (int) local10.aLong148;
					@Pc(55) Class47 local55 = Static143.method2159(local51);
					if (local55 != null) {
						Static165.method2410(local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	public static boolean method769(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V")
	public static void method770(@OriginalArg(0) int arg0) {
		if (Static128.anIntArray13 == null || arg0 > Static128.anIntArray13.length) {
			Static128.anIntArray13 = new int[arg0];
		}
	}
}
