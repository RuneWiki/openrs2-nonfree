import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jia", name = "u", descriptor = "I")
	public static int anInt5273;

	@OriginalMember(owner = "client!jia", name = "w", descriptor = "I")
	public static int anInt5275;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(III)Z")
	public static boolean method4505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIIII)V")
	public static void method4506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class3_Sub7_Sub5 local10 = Static138.method2377(4, arg0);
		local10.method1474();
		local10.anInt1723 = arg3;
		local10.anInt1728 = arg1;
		local10.anInt1720 = arg2;
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(III)Z")
	public static boolean method4507(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "()V")
	public static void method4508() {
		Static460.aClass47_3 = Static460.aClass47_2;
	}

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "(B)V")
	public static void method4511() {
		if (Static82.anInt1653 == 9) {
			Static206.method3226(5);
		} else if (Static82.anInt1653 == 5 || Static82.anInt1653 == 6) {
			Static206.method3226(3);
		} else if (Static82.anInt1653 == 12) {
			Static206.method3226(3);
		}
	}
}
