import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!os", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString97;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Z")
	public static boolean method6358() {
		@Pc(7) boolean local7 = true;
		if (Static97.aClass173_4 == null) {
			if (Static345.aClass208_78.method4977(Static150.anInt2409)) {
				Static97.aClass173_4 = Static684.method3649(Static345.aClass208_78, Static150.anInt2409);
			} else {
				local7 = false;
			}
		}
		if (Static526.aClass173_28 == null) {
			if (Static345.aClass208_78.method4977(Static179.anInt2993)) {
				Static526.aClass173_28 = Static684.method3649(Static345.aClass208_78, Static179.anInt2993);
			} else {
				local7 = false;
			}
		}
		if (Static197.aClass173_32 == null) {
			if (Static345.aClass208_78.method4977(Static618.anInt10170)) {
				Static197.aClass173_32 = Static684.method3649(Static345.aClass208_78, Static618.anInt10170);
			} else {
				local7 = false;
			}
		}
		if (Static404.aClass224_9 == null) {
			if (Static85.aClass208_16.method4977(Static30.anInt495)) {
				Static404.aClass224_9 = Static439.method6500(Static30.anInt495, Static85.aClass208_16);
			} else {
				local7 = false;
			}
		}
		if (Static514.aClass173Array1 == null) {
			if (Static345.aClass208_78.method4977(Static30.anInt495)) {
				Static514.aClass173Array1 = Static684.method3657(Static345.aClass208_78, Static30.anInt495);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
