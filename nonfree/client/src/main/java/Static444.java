import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static444 {

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "Lclient!paa;")
	public static Class261 aClass261_9 = null;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(JI)V")
	public static void method6061(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static274.method3802(arg0 - 1L);
			Static274.method3802(1L);
		} else {
			Static274.method3802(arg0);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)V")
	public static void method6063(@OriginalArg(1) int arg0) {
		Static36.aLong28 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILclient!rea;BII)V")
	public static void method6064(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub40 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.aClass2_Sub22_Sub2_2.method8552(arg3);
		arg1.aClass2_Sub22_Sub2_2.method8528(arg0);
		arg1.aClass2_Sub22_Sub2_2.method8507(arg2);
	}
}
