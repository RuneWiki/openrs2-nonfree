import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static45 {

	@OriginalMember(owner = "client!da", name = "L", descriptor = "I")
	public static int anInt1014;

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "Lclient!cg;")
	public static Class22 aClass22_24;

	@OriginalMember(owner = "client!da", name = "qb", descriptor = "I")
	public static int anInt1037;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "[Lclient!ed;")
	public static Class39_Sub1[] aClass39_Sub1Array1 = new Class39_Sub1[29];

	@OriginalMember(owner = "client!da", name = "ub", descriptor = "I")
	public static int anInt1039 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIII)V")
	public static void method914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static176.anInt5575 = arg0;
		Static293.anInt5686 = arg1;
		Static193.anInt3890 = arg4;
		Static3.anInt19 = arg2;
		Static279.anInt5478 = arg3;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
	public static void method926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static99.anInt1946 == 2) {
			Static56.anInt1258 = arg0;
			Static254.anInt4974 = arg1;
		}
		Static276.aFloat156 = arg1;
		Static126.aFloat73 = arg0;
		Static123.method2037();
		Static82.aBoolean100 = true;
	}
}
