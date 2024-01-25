import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
	public static int anInt8858;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "[I")
	public static int[] anIntArray672 = new int[1];

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
	public static boolean method7276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static361.method5443(arg1, arg0)) {
			return (arg1 & 0x9000) != 0 | Static63.method1064(arg1, arg0) | Static150.method7299(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (Static260.method4300(arg0, arg1) | (arg1 & 0x2000) != 0 | Static454.method6415(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)I")
	public static int method7277(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method7278(@OriginalArg(0) Class66 arg0) {
		if (Static263.aClass124_52.method3271() == 0) {
			return;
		}
		@Pc(24) Class4_Sub25 local24;
		if (Static403.anInt6994 == 0) {
			for (local24 = (Class4_Sub25) Static263.aClass124_52.method3267(); local24 != null; local24 = (Class4_Sub25) Static263.aClass124_52.method3273()) {
				Static195.aClass99_1.method2790(Static334.aClass91_5, false, arg0, false, local24.anInt4954, local24.anInt4953, arg0, local24.anInt4958, local24.aBoolean371 ? Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1 : null, local24.anInt4957, local24.anInt4955);
				local24.method8013();
			}
			Static39.method670();
			return;
		}
		if (Static11.aClass66_1 == null) {
			@Pc(73) Canvas local73 = new Canvas();
			local73.setSize(36, 32);
			Static11.aClass66_1 = Static367.method6819(0, local73, 0, Static422.aClass31_95, Static263.anInterface3_14);
			Static56.aClass91_3 = Static11.aClass66_1.method6829(Static297.method4643(Static147.anInt3290, Static520.aClass31_110), Static607.method5879(Static360.aClass31_78, Static147.anInt3290));
		}
		for (local24 = (Class4_Sub25) Static263.aClass124_52.method3267(); local24 != null; local24 = (Class4_Sub25) Static263.aClass124_52.method3273()) {
			Static195.aClass99_1.method2790(Static56.aClass91_3, false, Static11.aClass66_1, false, local24.anInt4954, local24.anInt4953, arg0, local24.anInt4958, local24.aBoolean371 ? Static129.aClass10_Sub1_Sub2_Sub2_1.aClass355_1 : null, local24.anInt4957, local24.anInt4955);
			local24.method8013();
		}
	}
}
