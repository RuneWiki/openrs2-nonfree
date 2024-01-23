import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "[Lclient!ta;")
	public static Class58_Sub2[] aClass58_Sub2Array1;

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "Lclient!cg;")
	public static Class22 aClass22_5;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString11 = "Loading...";

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	public static int anInt279 = 0;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
	public static int anInt280 = 0;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V")
	public static void method227() {
		Static282.aClass172_45.method4346();
		Static144.aClass172_24.method4346();
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
	public static void method228() {
		Static175.aClass172_32.method4350();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method229(@OriginalArg(0) int arg0) {
		@Pc(4) String local4 = Integer.toString(arg0);
		for (@Pc(19) int local19 = local4.length() - 3; local19 > 0; local19 -= 3) {
			local4 = local4.substring(0, local19) + "," + local4.substring(local19);
		}
		if (local4.length() <= 9) {
			return local4.length() <= 6 ? " <col=ffff00>" + local4 + "</col>" : " <col=ffffff>" + local4.substring(0, local4.length() - 4) + Static197.aString137 + " (" + local4 + ")</col>";
		} else {
			return " <col=00ff80>" + local4.substring(0, local4.length() - 8) + Static28.aString24 + " (" + local4 + ")</col>";
		}
	}
}
