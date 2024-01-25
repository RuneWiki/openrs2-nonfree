import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "[I")
	public static final int[] anIntArray358 = new int[32];

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_128 = new Class81(9, 2);

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "Z")
	public static boolean aBoolean467 = true;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4359(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(19) int local19 = local8.length() - 3; local19 > 0; local19 -= 3) {
			local8 = local8.substring(0, local19) + "," + local8.substring(local19);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static228.aClass256_35.method5720(Static272.anInt7537) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static296.aClass256_110.method5720(Static272.anInt7537) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public static void method4361() {
		@Pc(5) int local5 = 0;
		if (Static399.aClass167_Sub1_1.method4514(Static281.anInt5126)) {
			local5 = 55;
		}
		if (!Static399.aClass167_Sub1_1.aBoolean487) {
			local5 |= 0x40;
		}
		Static89.method1493(local5);
		Static406.aClass150_3.method3511(local5);
		Static350.aClass149_2.method3484(local5);
		Static417.aClass234_2.method5355(local5);
		Static137.aClass16_2.method254(local5);
		Static131.method1915(local5);
		Static248.method3825(local5);
		Static184.method2921(local5);
		Static133.method1921(local5);
		if (Static297.anInt5339 == 10) {
			Static446.method6043(28);
		} else if (Static297.anInt5339 == 30) {
			Static446.method6043(25);
		}
	}
}
