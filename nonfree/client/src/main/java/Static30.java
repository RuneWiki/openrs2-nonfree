import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
	public static int anInt448 = -1;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IILclient!ha;ZII)V")
	public static void method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.KA(arg4, arg1, arg3 + arg4, arg1 - -arg0);
		arg2.method6134(arg4, arg0, arg3, -16777216, arg1);
		if (Static214.anInt4427 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static598.anInt2998 / (float) Static598.anInt2994;
		@Pc(38) int local38 = arg3;
		@Pc(40) int local40 = arg0;
		if (local36 < 1.0F) {
			local40 = (int) ((float) arg3 * local36);
		} else {
			local38 = (int) ((float) arg0 / local36);
		}
		@Pc(67) int local67 = arg4 + (arg3 - local38) / 2;
		@Pc(76) int local76 = arg1 + (arg0 - local40) / 2;
		if (Static198.aClass103_35 == null || Static198.aClass103_35.method7445() != arg3 || Static198.aClass103_35.method7440() != arg0) {
			Static598.method2549(Static598.anInt2992, Static598.anInt2995 + Static598.anInt2998, Static598.anInt2994 + Static598.anInt2992, Static598.anInt2995, local67, local76, local38 + local67, local76 + local40);
			Static598.method2536(arg2);
			Static198.aClass103_35 = arg2.method6144(local67, local76, local38, local40, false);
		}
		Static198.aClass103_35.method7462(local67, local76);
		@Pc(133) int local133 = local38 * Static192.anInt3594 / Static598.anInt2994;
		@Pc(139) int local139 = Static124.anInt2655 * local40 / Static598.anInt2998;
		@Pc(147) int local147 = local38 * Static3.anInt26 / Static598.anInt2994 + local67;
		@Pc(161) int local161 = local40 + local76 - local139 - Static255.anInt4981 * local40 / Static598.anInt2998;
		@Pc(163) int local163 = -1996554240;
		if (Static300.aClass133_17 == Static431.aClass133_11) {
			local163 = -1996488705;
		}
		arg2.aa(local147, local161, local133, local139, local163, 1);
		arg2.method6179(local147, local161, local133, local139, local163, 0);
		if (Static476.anInt8998 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (Static156.anInt3180 <= 50) {
			local198 = Static156.anInt3180 * 5;
		} else {
			local198 = 500 - Static156.anInt3180 * 5;
		}
		for (@Pc(212) Class3_Sub47 local212 = (Class3_Sub47) Static598.aClass216_26.method5457(); local212 != null; local212 = (Class3_Sub47) Static598.aClass216_26.method5458()) {
			@Pc(220) Class179 local220 = Static598.aClass154_2.method3947(local212.anInt9169);
			if (Static32.method455(local220)) {
				@Pc(244) int local244;
				@Pc(256) int local256;
				if (Static475.anInt8130 == local212.anInt9169) {
					local244 = local212.anInt9168 * local38 / Static598.anInt2994 + local67;
					local256 = local76 + (Static598.anInt2998 - local212.anInt9165) * local40 / Static598.anInt2998;
					arg2.method6134(local244 - 2, 4, 4, local198 << 24 | 0xFFFF00, local256 - 2);
				} else if (Static464.anInt7910 != -1 && local220.anInt5334 == Static464.anInt7910) {
					local244 = local212.anInt9168 * local38 / Static598.anInt2994 + local67;
					local256 = local76 + local40 * (Static598.anInt2998 - local212.anInt9165) / Static598.anInt2998;
					arg2.method6134(local244 - 2, 4, 4, local198 << 24 | 0xFFFF00, local256 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "(B)[Lclient!ww;")
	public static Class384[] method436() {
		return new Class384[] { Static429.aClass384_57, Static349.aClass384_71, Static556.aClass384_68, Static89.aClass384_50, Static179.aClass384_28, Static518.aClass384_65, Static548.aClass384_70, Static200.aClass384_32, Static583.aClass384_72, Static198.aClass384_54 };
	}
}
