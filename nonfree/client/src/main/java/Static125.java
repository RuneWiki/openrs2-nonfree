import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "Lclient!fo;")
	public static Class112 aClass112_5;

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
	public static int anInt2098 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILclient!ps;I)V")
	public static void method1728(@OriginalArg(1) int arg0, @OriginalArg(2) Class273 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray17 != null) {
			@Pc(18) Class2_Sub10 local18 = new Class2_Sub10();
			local18.aClass273_4 = arg1;
			local18.anObjectArray1 = arg1.anObjectArray17;
			Static566.method7398(local18);
		}
		Static229.anInt3341 = arg1.anInt6805;
		Static460.anInt7404 = arg1.anInt6800;
		Static251.anInt4193 = arg1.anInt6797;
		Static409.anInt6677 = arg1.anInt6864;
		Static401.anInt6603 = arg2;
		Static464.anInt7423 = arg1.anInt6810;
		Static277.anInt4787 = arg0;
		Static355.aBoolean473 = true;
		Static155.method2111(arg1);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IBI)Z")
	public static boolean method1730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
