import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
	public static int anInt6211;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
	public static int anInt6217;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_181 = new Class208(24, -1);

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Z")
	public static boolean aBoolean455 = true;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "[Lclient!hu;")
	public static final Class102[] aClass102Array1 = new Class102[14];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLclient!oj;)V")
	public static void method5410(@OriginalArg(1) Class48 arg0) {
		if (Static127.aBoolean191) {
			Static247.method4313(arg0);
		} else {
			Static61.method1154(arg0);
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
	public static void method5411() {
		if (Static231.aString41.length() == 0) {
			return;
		}
		Static375.method5958("--> " + Static231.aString41);
		Static39.method541(Static231.aString41, false);
		Static329.anInt6063 = 0;
		Static231.aString41 = "";
		Static174.anInt3548 = 0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBIII)V")
	public static void method5413(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class2_Sub7_Sub2 local13 = Static328.method5290(8, arg2);
		local13.method1198();
		local13.anInt1465 = arg1;
		local13.anInt1462 = arg0;
		local13.anInt1468 = arg3;
	}
}
