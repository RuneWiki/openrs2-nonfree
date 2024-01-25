import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
	public static int anInt5416 = 0;

	@OriginalMember(owner = "client!pr", name = "E", descriptor = "Lclient!gs;")
	public static final Class93 aClass93_5 = new Class93();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIII)V")
	public static void method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static303.anInt5016 = arg5;
		Static56.anInt1029 = arg2;
		Static31.anInt593 = arg1;
		Static255.anInt4112 = arg3;
		Static85.anInt1705 = arg0;
		Static26.anInt460 = arg4;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLclient!oo;)V")
	public static void method4284(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub22_5 != null) {
			arg0.aClass2_Sub22_5.anInt2620 = 0;
		}
		arg0.aBoolean288 = false;
		for (@Pc(18) Class2_Sub1 local18 = arg0.method3224(); local18 != null; local18 = arg0.method3226()) {
			method4284(local18);
		}
	}
}
