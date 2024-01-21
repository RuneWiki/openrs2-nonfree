import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public static int anInt3136;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Lclient!nh;")
	public static Class62 aClass62_32;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public static int anInt3137 = 0;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[Lclient!ff;")
	public static final Class4_Sub1_Sub1_Sub6[] aClass4_Sub1_Sub1_Sub6Array1 = new Class4_Sub1_Sub1_Sub6[4];

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "B")
	public static byte aByte7 = 0;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt3139 = 1;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1144 = Static177.method3050("<col=ffb000>");

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1145 = Static177.method3050("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1146 = aClass46_1145;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!a;IIIIII)V")
	public static void method2313(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static26.aBoolean32) {
			Static6.anInt227 = 32;
		} else {
			Static6.anInt227 = 0;
		}
		Static26.aBoolean32 = false;
		@Pc(116) int local116;
		if (Static177.anInt3974 != 0) {
			if (arg0 <= arg3 && arg0 + 16 > arg3 && arg4 <= arg6 && arg6 < arg4 + 16) {
				arg1.anInt32 -= 4;
				Static3.method21(arg1);
			} else if (arg0 <= arg3 && arg0 + 16 > arg3 && arg4 + arg2 - 16 <= arg6 && arg6 < arg2 + arg4) {
				arg1.anInt32 += 4;
				Static3.method21(arg1);
			} else if (arg0 - Static6.anInt227 <= arg3 && arg0 + Static6.anInt227 + 16 > arg3 && arg4 + 16 <= arg6 && arg4 + arg2 - 16 > arg6) {
				local116 = arg2 * (arg2 - 32) / arg5;
				if (local116 < 8) {
					local116 = 8;
				}
				@Pc(135) int local135 = arg6 - local116 / 2 - arg4 - 16;
				@Pc(142) int local142 = arg2 - local116 - 32;
				arg1.anInt32 = local135 * (arg5 - arg2) / local142;
				Static3.method21(arg1);
				Static26.aBoolean32 = true;
			}
		}
		if (Static71.anInt1856 == 0) {
			return;
		}
		local116 = arg1.anInt50;
		if (arg0 - local116 <= arg3 && arg6 >= arg4 && arg0 + 16 > arg3 && arg6 <= arg2 + arg4) {
			arg1.anInt32 += Static71.anInt1856 * 45;
			Static3.method21(arg1);
			return;
		}
	}
}
