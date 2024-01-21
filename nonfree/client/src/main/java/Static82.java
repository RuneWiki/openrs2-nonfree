import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!ec;")
	public static Class22 aClass22_629 = Static60.method1113("headicons_pk");

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[104][104];

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_630 = Static60.method1113("Mitglieder)2Welt");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)I")
	public static int method1451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg2 /= 2;
		}
		if (arg1 > 192) {
			arg2 /= 2;
		}
		if (arg1 > 217) {
			arg2 /= 2;
		}
		if (arg1 > 243) {
			arg2 /= 2;
		}
		return arg1 / 2 + (arg2 / 32 << 7) + (arg0 / 4 << 10);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method1452() {
		aClass22_629 = null;
		aClass4_Sub1_Sub2_Sub2_6 = null;
		aClass22_630 = null;
		anIntArrayArray20 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!fd;)V")
	public static void method1453(@OriginalArg(1) Class4_Sub4 arg0) {
		arg0.aBoolean227 = false;
		if (arg0.aClass4_Sub13_5 != null) {
			arg0.aClass4_Sub13_5.anInt1364 = 0;
		}
		for (@Pc(18) Class4_Sub4 local18 = arg0.method1640(); local18 != null; local18 = arg0.method1638()) {
			method1453(local18);
		}
	}
}
