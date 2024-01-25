import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
	public static int anInt5938 = 0;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)V")
	public static void method4777() {
		Static71.anInt1577 = -1;
		Static237.anInt4548 = 1;
		Static263.aBoolean350 = false;
		Static332.anInt5719 = 2;
		Static74.aClass160_9 = null;
		Static436.anInt7186 = -1;
		Static237.anInt4547 = 0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method4778(@OriginalArg(1) int arg0) {
		@Pc(6) String local6 = Integer.toString(arg0);
		for (@Pc(11) int local11 = local6.length() - 3; local11 > 0; local11 -= 3) {
			local6 = local6.substring(0, local11) + "," + local6.substring(local11);
		}
		if (local6.length() > 9) {
			return " <col=00ff80>" + local6.substring(0, local6.length() - 8) + Static59.aClass209_32.method4562(Static388.anInt6533) + " (" + local6 + ")</col>";
		} else if (local6.length() > 6) {
			return " <col=ffffff>" + local6.substring(0, local6.length() - 4) + Static40.aClass209_22.method4562(Static388.anInt6533) + " (" + local6 + ")</col>";
		} else {
			return " <col=ffff00>" + local6 + "</col>";
		}
	}
}
