import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!saa", name = "X", descriptor = "[Lclient!mi;")
	public static Class46[] aClass46Array16;

	@OriginalMember(owner = "client!saa", name = "N", descriptor = "[I")
	public static int[] anIntArray605 = new int[1];

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "(B)Z")
	public static boolean method7787() {
		Static274.anInt5853++;
		Static167.aBoolean305 = true;
		return true;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7789(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(25) Class2_Sub52 local25 = Static130.method3019(Static3.aClass94_103, Static361.aClass183_1);
			local25.aClass2_Sub11_Sub2_7.method8374(Static296.method5291(arg0));
			local25.aClass2_Sub11_Sub2_7.method8329(arg0);
			Static96.method2563(local25);
		}
	}
}
