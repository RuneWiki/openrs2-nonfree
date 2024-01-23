import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	public static int anInt3326;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Lclient!db;")
	public static Class31 aClass31_26 = new Class31(64);

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public static int anInt3325 = -1;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "[I")
	public static int[] anIntArray391 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIILclient!le;II)Z")
	public static boolean method2690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class104 arg3) {
		@Pc(10) Class105 local10 = Static230.method3689(arg3.anInt2799);
		if (local10.anInt2845 == -1) {
			return true;
		}
		if (arg3.aBoolean208) {
			@Pc(29) int local29 = arg0 + arg3.anInt2796;
			arg0 = local29 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(40) Class48_Sub2 local40 = local10.method2365(arg0, arg3.aBoolean197);
		if (local40 == null) {
			return false;
		}
		@Pc(48) int local48 = arg3.anInt2817;
		@Pc(51) int local51 = local40.anInt4745;
		@Pc(54) int local54 = arg3.anInt2814;
		if ((arg0 & 0x1) == 1) {
			local54 = arg3.anInt2817;
			local48 = arg3.anInt2814;
		}
		@Pc(70) int local70 = local40.anInt4749;
		if (local10.aBoolean213) {
			local51 = local54 * 4;
			local70 = local48 * 4;
		}
		if (local10.anInt2843 == 0) {
			local40.method3620(arg1 * 4 + 48, (-local48 + (104 - arg2)) * 4 + 48, local51, local70);
		} else {
			local40.method3623(arg1 * 4 + 48, (-local48 + 104 + -arg2) * 4 + 48, local51, local70, local10.anInt2843);
		}
		return true;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method2692() {
		Static210.aClass31_32.method856(50);
		Static296.aClass31_46.method856(50);
		Static98.aClass31_15.method856(50);
	}
}
