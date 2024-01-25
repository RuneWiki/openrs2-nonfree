import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_96 = new Class359(102, 28);

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt5013 = -1;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
	public static int anInt5015 = 0;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public static int anInt5016 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)V")
	public static void method4247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static374.aClass65_12 == null) {
			return;
		}
		@Pc(16) int local16 = Static299.anInt5764;
		@Pc(18) int local18 = Static31.anInt495;
		Static264.method4124(arg0, arg1);
		if (Static1.anInt9943 == 0) {
			Static528.anInterface15_1 = null;
			Static528.anInterface15_1 = Static374.aClass65_12.method6942(Static374.aClass65_12.method6894(Static193.anInt3732, Static206.anInt3873), Static374.aClass65_12.method6939(Static193.anInt3732, Static206.anInt3873));
		} else if (Static1.anInt9943 == 1 && (Static420.anInterface15Array5 == null || Static299.anInt5764 != local16 || local18 != Static31.anInt495)) {
			Static420.anInterface15Array5 = new Interface15[Static31.anInt495 * Static299.anInt5764];
			for (@Pc(62) int local62 = 0; local62 < Static420.anInterface15Array5.length; local62++) {
				Static420.anInterface15Array5[local62] = Static374.aClass65_12.method6942(Static374.aClass65_12.method6894(Static597.anInt9791, Static382.anInt6778), Static374.aClass65_12.method6939(Static597.anInt9791, Static382.anInt6778));
			}
			Static10.anInt165 = 1;
			Static516.anIntArray483 = new int[Static299.anInt5764 * Static31.anInt495];
		}
		Static375.aBoolean591 = true;
	}
}
