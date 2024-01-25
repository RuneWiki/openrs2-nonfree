import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!ct;")
	public static Class30 aClass30_12;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Lclient!rr;")
	public static Class187 aClass187_1;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public static int anInt1396 = 0;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!hn;Z)V")
	public static void method1351(@OriginalArg(0) Class1_Sub20 arg0) {
		if (Static105.aClass155ArrayArrayArray3 == null) {
			return;
		}
		@Pc(14) Interface4 local14 = null;
		if (arg0.anInt2709 == 0) {
			local14 = (Interface4) Static342.method5727(arg0.anInt2707, arg0.anInt2716, arg0.anInt2698);
		}
		if (arg0.anInt2709 == 1) {
			local14 = (Interface4) Static74.method1619(arg0.anInt2707, arg0.anInt2716, arg0.anInt2698);
		}
		if (arg0.anInt2709 == 2) {
			local14 = (Interface4) Static138.method2791(arg0.anInt2707, arg0.anInt2716, arg0.anInt2698, jb.class);
		}
		if (arg0.anInt2709 == 3) {
			local14 = (Interface4) Static109.method2324(arg0.anInt2707, arg0.anInt2716, arg0.anInt2698);
		}
		if (local14 == null) {
			arg0.anInt2703 = 0;
			arg0.anInt2705 = -1;
			arg0.anInt2712 = 0;
		} else {
			arg0.anInt2705 = local14.method5927();
			arg0.anInt2703 = local14.method5925();
			arg0.anInt2712 = local14.method5922();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method1352() {
		Static17.aClass21_62.method857();
	}
}
