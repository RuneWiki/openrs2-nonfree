import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	public static int anInt1097;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIILclient!et;)V")
	public static void method1113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class91 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray11 != null) {
			@Pc(13) Class1_Sub10 local13 = new Class1_Sub10();
			local13.anObjectArray4 = arg2.anObjectArray11;
			local13.aClass91_2 = arg2;
			Static173.method3207(local13);
		}
		Static119.anInt2478 = arg2.anInt2395;
		Static245.anInt4711 = arg2.anInt2417;
		Static49.anInt1304 = arg2.anInt2368;
		Static189.anInt3926 = arg2.anInt2391;
		Static395.anInt6942 = arg1;
		Static59.anInt1479 = arg0;
		Static266.anInt5103 = arg2.anInt2431;
		Static181.aBoolean310 = true;
		Static243.method4316(arg2);
	}
}
