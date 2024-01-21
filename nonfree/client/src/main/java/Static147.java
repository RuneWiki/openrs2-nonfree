import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static147 {

	@OriginalMember(owner = "client!se", name = "J", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!se", name = "pb", descriptor = "I")
	public static int anInt3576;

	@OriginalMember(owner = "client!se", name = "T", descriptor = "[I")
	public static int[] anIntArray521 = new int[25];

	@OriginalMember(owner = "client!se", name = "lb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1260 = Static146.method2172("Clientscript error in: ");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	public static void method2485() {
		aByteArrayArrayArray7 = null;
		aClass77_1260 = null;
		anIntArray521 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!sg;IILclient!sg;III)V")
	public static void method2486(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class77 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static166.aBoolean181 || Static18.anInt618 >= 500) {
			return;
		}
		Static56.aClass77Array10[Static18.anInt618] = arg3;
		Static136.aClass77Array20[Static18.anInt618] = arg0;
		Static131.anIntArray616[Static18.anInt618] = arg4;
		Static20.anIntArray86[Static18.anInt618] = arg5;
		Static107.anIntArray418[Static18.anInt618] = arg2;
		Static137.anIntArray496[Static18.anInt618] = arg1;
		Static18.anInt618++;
	}
}
