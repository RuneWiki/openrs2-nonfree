import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	public static int anInt4002;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "[I")
	public static final int[] anIntArray240 = new int[3];

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!jk;")
	public static Class124 aClass124_6 = null;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)[Lclient!wq;")
	public static Class269[] method3253() {
		return new Class269[] { Static325.aClass269_42, Static305.aClass269_39, Static168.aClass269_19, Static328.aClass269_43, Static305.aClass269_38, Static297.aClass269_45, Static56.aClass269_9, Static1.aClass269_1, Static223.aClass269_44, Static438.aClass269_35, Static251.aClass269_31, Static293.aClass269_37, Static396.aClass269_46, Static166.aClass269_18, Static415.aClass269_47 };
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V")
	public static void method3257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static427.anInt7214 <= arg1 && Static434.anInt7302 >= arg4 && Static289.anInt5053 <= arg2 && arg0 <= Static93.anInt1676) {
			if (arg5 == 1) {
				Static390.method5102(arg3, arg0, arg2, arg4, arg1);
			} else {
				Static310.method4224(arg2, arg4, arg1, arg5, arg0, arg3);
			}
		} else if (arg5 == 1) {
			Static296.method4064(arg4, arg1, arg0, arg2, arg3);
		} else {
			Static9.method137(arg5, arg0, arg3, arg4, arg2, arg1);
		}
	}
}
