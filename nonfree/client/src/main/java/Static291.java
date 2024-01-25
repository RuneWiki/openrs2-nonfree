import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
	public static int anInt4944;

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "[I")
	public static final int[] anIntArray443 = new int[1];

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_71 = new Class218(34, 6);

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
	public static int anInt4945 = 0;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_33 = new Class165(4);

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_34 = new Class165(5);

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!oba;B)V")
	public static void method4559(@OriginalArg(0) Class3_Sub11_Sub14 arg0) {
		if (Static43.aBoolean74) {
			return;
		}
		arg0.method9380();
		Static450.anInt7444--;
		if (!arg0.aBoolean476) {
			@Pc(29) long local29 = arg0.aLong212;
			@Pc(35) Class3_Sub11_Sub8 local35;
			for (local35 = (Class3_Sub11_Sub8) Static369.aClass83_24.method2368(local29); local35 != null && !local35.aString31.equals(arg0.aString67); local35 = (Class3_Sub11_Sub8) Static369.aClass83_24.method2373()) {
			}
			if (local35 != null && local35.method3476(arg0)) {
				Static156.method2841(local35);
				return;
			}
			return;
		}
		for (@Pc(66) Class3_Sub11_Sub8 local66 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1842(); local66 != null; local66 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1844()) {
			if (local66.aString31.equals(arg0.aString67)) {
				@Pc(76) boolean local76 = false;
				for (@Pc(82) Class3_Sub11_Sub14 local82 = (Class3_Sub11_Sub14) local66.aClass74_4.method1842(); local82 != null; local82 = (Class3_Sub11_Sub14) local66.aClass74_4.method1844()) {
					if (local82 == arg0) {
						local76 = true;
						if (local66.method3476(arg0)) {
							Static156.method2841(local66);
						}
						break;
					}
				}
				if (local76) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIIII)V")
	public static void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static24.aClass3_Sub22_4.aClass6_Sub28_1.method8690() != 0 && arg3 != 0 && Static199.anInt3915 < 50 && arg1 != -1) {
			Static240.aClass182Array1[Static199.anInt3915++] = new Class182((byte) 1, arg1, arg3, arg2, arg0, 0, arg4, (Class28_Sub1) null);
		}
	}
}
