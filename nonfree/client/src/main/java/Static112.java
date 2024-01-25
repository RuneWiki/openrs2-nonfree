import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public static int anInt2200;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "S")
	public static short aShort39 = 32767;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "[I")
	public static int[] anIntArray149 = new int[1];

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public static void method2124() {
		if (Static346.anInt5281 <= 1) {
			Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub20_1, 2);
		} else {
			Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub20_1, 4);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIII)Lclient!uea;")
	public static Class4_Sub48 method2125(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class4_Sub48 local5 = null;
		if (arg1 == 0) {
			local5 = Static335.method4615(Static461.aClass216_115, Static669.aClass196_2);
		}
		if (arg1 == 1) {
			local5 = Static335.method4615(Static68.aClass216_21, Static669.aClass196_2);
		}
		local5.aClass4_Sub11_Sub1_2.method8889(Static231.aClass102_6.method4311(82) ? 1 : 0);
		local5.aClass4_Sub11_Sub1_2.method8876(Static321.anInt5000 + arg2);
		local5.aClass4_Sub11_Sub1_2.method8838(arg0 + Static445.anInt6949);
		Static110.anInt2183 = arg2;
		Static63.aBoolean88 = false;
		Static78.anInt1643 = arg0;
		Static519.method7017();
		return local5;
	}
}
