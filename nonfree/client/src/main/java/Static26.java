import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "Lclient!se;")
	public static Class215 aClass215_1;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	public static int anInt668 = 500;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	public static int anInt671 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method529() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static293.aBooleanArray21[local11] = false;
		}
		Static280.anInt4896 = 0;
		Static15.anInt417 = 0;
		Static134.anInt2621 = 1;
		Static282.anInt4959 = -1;
		Static52.anInt1388 = -1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
	public static void method530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static414.anInt7043 <= arg0 && Static198.anInt3778 >= arg0) {
			@Pc(19) int local19 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg3);
			@Pc(25) int local25 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg2);
			Static284.method3971(local19, local25, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ap;I)V")
	public static void method531(@OriginalArg(0) Class6_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class6_Sub2_Sub1_Sub2) {
			@Pc(30) Class6_Sub2_Sub1_Sub2 local30 = (Class6_Sub2_Sub1_Sub2) arg0;
			if (local30.aClass243_1 != null) {
				Static336.method4595(Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 != local30.aByte86, local30);
			}
		} else if (arg0 instanceof Class6_Sub2_Sub1_Sub1) {
			@Pc(8) Class6_Sub2_Sub1_Sub1 local8 = (Class6_Sub2_Sub1_Sub1) arg0;
			Static363.method5032(local8, local8.aByte86 != Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86);
		}
	}
}
