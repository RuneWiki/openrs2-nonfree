import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString289 = "Unable to find ";

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBII)V")
	public static void method4402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static184.anInt6250 <= arg4 && arg0 <= Static80.anInt4809 && arg1 >= Static314.anInt6018 && arg3 <= Static334.anInt6315) {
			Static332.method5559(arg4, arg1, arg0, arg3, arg2);
		} else {
			Static295.method4990(arg4, arg2, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Lclient!ka;")
	public static Class25_Sub4 method4403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass25_Sub4_1 == null ? null : local7.aClass25_Sub4_1;
	}

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V")
	public static void method4404() {
		if (Static15.aClass59_1.method4865()) {
			Static263.method4508();
			Static15.aClass59_1.method4837(Static243.aCanvas3);
			Static241.method4110();
		} else {
			Static43.method967(Static134.anInt2746);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)Lclient!fm;")
	public static Class25_Sub2 method4406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub2_2;
	}

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "(I)V")
	public static void method4407() {
		Static277.aClass59_7 = null;
		Static338.aClass91_10 = null;
	}
}
