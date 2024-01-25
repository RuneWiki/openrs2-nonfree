import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static106 {

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
	public static int anInt2252;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	public static int anInt2237 = 0;

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!qa;Lclient!dn;I)V")
	public static void method2170(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class69 arg1) {
		if (Static28.aBoolean69) {
			return;
		}
		arg0.Z(0);
		Static242.aClass104_19 = arg0.method7149(Static547.method1921(arg1, Static301.anInt5880));
		Static242.aClass104_19.method7716((Static70.anInt1753 - Static242.aClass104_19.EA()) / 2, (Static508.anInt8910 - Static242.aClass104_19.ma()) / 2);
		Static322.aClass104_22 = arg0.method7149(Static547.method1921(arg1, Static309.anInt5934));
		Static322.aClass104_22.method7716((Static70.anInt1753 - Static322.aClass104_22.EA()) / 2, 18);
		Static28.aBoolean69 = true;
	}
}
