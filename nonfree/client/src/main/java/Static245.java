import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "Lclient!cj;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_56 = new Class179(76, -1);

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
	public static int anInt3947 = 0;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString38 = null;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIII)V")
	public static void method3378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static234.aClass2_Sub5_48.aClass6_Sub22_5.method7291() != 0 && arg1 != 0 && Static270.anInt4355 < 50 && arg2 != -1) {
			Static81.aClass105Array1[Static270.anInt4355++] = new Class105((byte) 1, arg2, arg1, arg4, arg0, 0, arg3, null);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!gs;")
	public static Class13_Sub1_Sub1 method3380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class325 local14 = local7.aClass325_1; local14 != null; local14 = local14.aClass325_3) {
			@Pc(18) Class13_Sub1_Sub1 local18 = local14.aClass13_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort117 == arg1 && local18.aShort119 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
