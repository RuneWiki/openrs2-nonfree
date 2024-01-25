import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!at", name = "eb", descriptor = "I")
	public static int anInt563 = -1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!es;)V")
	public static void method562(@OriginalArg(1) Class4_Sub11 arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static180.anInt9918; local8++) {
			@Pc(14) int local14 = arg0.method8823();
			@Pc(18) int local18 = arg0.method8859();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static659.aClass22_Sub1Array2[local14] != null) {
				Static659.aClass22_Sub1Array2[local14].anInt1412 = local18;
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIBII)V")
	public static void method564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static472.anInt7503 <= arg2 - arg5 && arg5 + arg2 <= Static257.anInt4172 && arg3 - arg5 >= Static73.anInt1542 && Static527.anInt8177 >= arg3 + arg5) {
			Static51.method1018(arg3, arg2, arg1, arg4, arg5, arg0);
		} else {
			Static677.method8975(arg2, arg3, arg5, arg1, arg0, arg4);
		}
	}
}
