import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
	public static int anInt8519;

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "Z")
	public static boolean aBoolean728 = false;

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
	public static int anInt8521 = 100;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)B")
	public static byte method7264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)V")
	public static void method7266(@OriginalArg(0) boolean arg0) {
		Static572.aClass254_9.method7356(Static374.aClass65_12.method6890());
		@Pc(10) int[] local10 = Static374.aClass65_12.Y();
		Static136.anInt2680 = local10[3];
		Static163.anInt3311 = local10[2];
		Static88.anInt2040 = local10[1];
		Static365.anInt6627 = local10[0];
		if (arg0) {
			Static374.aClass65_12.DA(Static566.anInt9195, Static401.anInt7138, Static527.anInt8741, Static245.anInt778);
			Static564.method5794(Static290.aDouble9);
		} else {
			Static374.aClass65_12.DA(Static562.anInt9142, Static193.anInt3729, Static190.anInt5142, Static26.anInt347);
			Static564.method5794(Static508.aDouble21);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!vn;")
	public static Class374 method7267(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static122.aClass374Array3[arg0] : null;
	}
}
