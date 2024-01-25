import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
	public static int anInt4149;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1 aClass2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "F")
	public static float aFloat109 = 1024.0F;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
	public static void method3427(@OriginalArg(0) int arg0) {
		if (Static29.anIntArray98 == null || arg0 > Static29.anIntArray98.length) {
			Static29.anIntArray98 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method3428(@OriginalArg(1) int arg0) {
		@Pc(11) String local11 = Integer.toString(arg0);
		for (@Pc(16) int local16 = local11.length() - 3; local16 > 0; local16 -= 3) {
			local11 = local11.substring(0, local16) + "," + local11.substring(local16);
		}
		if (local11.length() > 9) {
			return " <col=00ff80>" + local11.substring(0, local11.length() - 8) + Static628.aClass369_33.method8475(Static377.anInt6756) + " (" + local11 + ")</col>";
		} else if (local11.length() > 6) {
			return " <col=ffffff>" + local11.substring(0, local11.length() - 4) + Static628.aClass369_35.method8475(Static377.anInt6756) + " (" + local11 + ")</col>";
		} else {
			return " <col=ffff00>" + local11 + "</col>";
		}
	}
}
