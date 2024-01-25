import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!ub;")
	public static Class315 aClass315_2;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;IZII)V")
	public static void method4015(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class97 local17 = Static76.method1088(arg3, arg2);
		if (local17 == null) {
			return;
		}
		if (local17.anObjectArray2 != null) {
			@Pc(27) Class6_Sub1 local27 = new Class6_Sub1();
			local27.aClass97_2 = local17;
			local27.aString1 = arg0;
			local27.anObjectArray1 = local17.anObjectArray2;
			local27.anInt88 = arg1;
			Static199.method3316(local27);
		}
		if (Static375.anInt9162 != 10 || !Static74.method1044(local17).method5833(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static534.method7063(Static458.aClass316_103);
			Static431.method6144(arg3, arg2, local17.anInt2607);
		}
		if (arg1 == 2) {
			Static534.method7063(Static266.aClass316_57);
			Static431.method6144(arg3, arg2, local17.anInt2607);
		}
		if (arg1 == 3) {
			Static534.method7063(Static432.aClass316_97);
			Static431.method6144(arg3, arg2, local17.anInt2607);
		}
		if (arg1 == 4) {
			Static534.method7063(Static422.aClass316_94);
			Static431.method6144(arg3, arg2, local17.anInt2607);
		}
		if (arg1 == 5) {
			Static534.method7063(Static501.aClass316_111);
			Static431.method6144(arg3, arg2, local17.anInt2607);
		}
		if (arg1 == 6) {
			Static534.method7063(Static420.aClass316_106);
			Static431.method6144(arg3, arg2, local17.anInt2607);
		}
		if (arg1 == 7) {
			Static534.method7063(Static260.aClass316_54);
			Static431.method6144(arg3, arg2, local17.anInt2607);
		}
		if (arg1 == 8) {
			Static534.method7063(Static279.aClass316_62);
			Static431.method6144(arg3, arg2, local17.anInt2607);
		}
		if (arg1 == 9) {
			Static534.method7063(Static571.aClass316_120);
			Static431.method6144(arg3, arg2, local17.anInt2607);
		}
		if (arg1 == 10) {
			Static534.method7063(Static380.aClass316_87);
			Static431.method6144(arg3, arg2, local17.anInt2607);
		}
	}
}
