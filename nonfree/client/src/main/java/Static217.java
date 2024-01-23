import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
	public static int anInt4437;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "Lclient!bo;")
	public static Class21 aClass21_3;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3608(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() <= 9) {
			return local8.length() > 6 ? " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static275.aString188 + " (" + local8 + ")</col>" : " <col=ffff00>" + local8 + "</col>";
		} else {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static193.aString138 + " (" + local8 + ")</col>";
		}
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
	public static void method3609() {
		Static301.aClass157_45.method4027();
	}
}
