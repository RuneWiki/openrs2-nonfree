import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
	public static int anInt8687;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray15;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)Z")
	public static boolean method7427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)Z")
	public static boolean method7431(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(III)V")
	public static void method7432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(15, 0);
		local8.method3608();
		local8.anInt4062 = arg0;
		local8.anInt4064 = arg1;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method7434(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(17) int local17 = local8.length() - 3; local17 > 0; local17 -= 3) {
			local8 = local8.substring(0, local17) + "," + local8.substring(local17);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static59.aClass43_33.method1598(Static325.anInt6083) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static59.aClass43_35.method1598(Static325.anInt6083) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
