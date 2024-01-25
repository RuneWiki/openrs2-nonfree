import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	public static int anInt1853;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Lclient!ru;")
	public static final Class220 aClass220_8 = new Class220(16);

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
	public static int anInt1852 = -1;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIII)V")
	public static void method1810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub1_Sub6 local12 = Static267.method3705(arg2, 11);
		local12.method2574();
		local12.anInt3131 = arg1;
		local12.anInt3130 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
	public static void method1812() {
		Static427.aClass93Array2 = null;
		Static365.method3531(Static103.anInt5365, 0, Static49.anInt789, -1, 0, Static344.anInt6105, 0, 0);
		if (Static427.aClass93Array2 != null) {
			Static454.method6176(0, Static344.anInt6105, Static427.aClass93Array2, Static148.aClass93_8.anInt2449, 0, Static428.anInt7260, -1412584499, Static260.anInt4602, Static49.anInt789);
			Static427.aClass93Array2 = null;
		}
	}
}
