import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public static int anInt3421;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
	public static int anInt3422;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "[I")
	public static final int[] anIntArray302 = new int[13];

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
	public static void method2972() {
		if (Static323.method4607(Static342.anInt5771) || Static85.method1601(Static342.anInt5771)) {
			Static223.method3421(Static92.anInt1946 >> 10, 5000, Static139.anInt2727 >> 10);
		} else {
			@Pc(31) int local31 = Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray658[0] >> 3;
			@Pc(38) int local38 = Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray657[0] >> 3;
			if (local31 >= 0 && local31 < Static195.anInt3537 >> 3 && local38 >= 0 && Static118.anInt2419 >> 3 > local38) {
				Static223.method3421(local38, 5000, local31);
			} else {
				Static223.method3421(Static118.anInt2419 >> 4, 0, Static195.anInt3537 >> 4);
			}
		}
		Static148.method2440();
		Static199.method3243();
		Static87.method1624();
		Static313.method4459();
	}
}
