import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
	public static int anInt8346;

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "[Lclient!dca;")
	public static Interface5[] anInterface5Array1;

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "Lclient!efa;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
	public static void method7068() {
		Static291.anInt6172 = -1;
		Static26.anInt543 = 1;
		if (Static431.aString91 == null) {
			Static557.method8312(35);
		} else {
			@Pc(20) Class2_Sub11 local20 = new Class2_Sub11(Static341.method5874(Static344.method5903(Static431.aString91)));
			@Pc(24) long local24 = local20.method8361();
			Static476.aLong219 = local20.method8361();
			Static380.method6293(Static224.method4292(local24), true, "");
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method7069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static80.method2326(arg0)) {
			return;
		}
		if (Static410.aClass24ArrayArray1[arg0] == null) {
			Static76.method2237(Static631.aClass24ArrayArray2[arg0], -1, arg2, arg10, arg3, arg7, arg1, arg8, arg5, arg4, arg6, arg9);
		} else {
			Static76.method2237(Static410.aClass24ArrayArray1[arg0], -1, arg2, arg10, arg3, arg7, arg1, arg8, arg5, arg4, arg6, arg9);
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILclient!cea;)Lclient!o;")
	public static Class114_Sub4 method7070(@OriginalArg(1) Class2_Sub11 arg0) {
		return new Class114_Sub4(arg0.method8368(), arg0.method8368(), arg0.method8368(), arg0.method8368(), arg0.method8347(), arg0.method8383());
	}
}
