import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
	public static int anInt7732 = 503;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)I")
	public static int method6779() {
		return Static242.method4113(false);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static566.anInt9279 <= arg0 && arg0 <= Static392.anInt6753 && arg7 >= Static566.anInt9279 && arg7 <= Static392.anInt6753 && arg1 >= Static566.anInt9279 && arg1 <= Static392.anInt6753 && arg4 >= Static566.anInt9279 && arg4 <= Static392.anInt6753 && arg2 >= Static346.anInt5494 && Static640.anInt10333 >= arg2 && Static346.anInt5494 <= arg8 && arg8 <= Static640.anInt10333 && arg3 >= Static346.anInt5494 && arg3 <= Static640.anInt10333 && Static346.anInt5494 <= arg6 && Static640.anInt10333 >= arg6) {
			Static74.method7160(arg3, arg5, arg0, arg2, arg4, arg6, arg1, arg7, arg8);
		} else {
			Static91.method1885(arg5, arg6, arg8, arg0, arg2, arg4, arg7, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
	public static void method6781() {
		if (Static592.anInt9857 == -1) {
			return;
		}
		@Pc(12) int local12 = Static186.aClass358_1.method8722();
		@Pc(16) int local16 = Static186.aClass358_1.method8721();
		@Pc(21) Class2_Sub1 local21 = (Class2_Sub1) Static574.aClass114_53.method2772();
		if (local21 != null) {
			local12 = local21.method7155();
			local16 = local21.method7157();
		}
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (Static148.aBoolean241) {
			local33 = Static100.method1939();
			local35 = Static260.method4303();
		}
		Static104.method1960(local35, local16, local16 + local35, Static592.anInt9857, local35 + Static71.anInt1925, local33 - -Class16_Sub1_Sub5_Sub1.lb, local33, local12 + local33, local33, local35, local12);
		if (Static422.aClass303_15 != null) {
			Static339.method5147(local16 + local35, local12 - -local33);
		}
	}
}
