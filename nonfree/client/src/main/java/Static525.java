import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "[I")
	public static int[] anIntArray553;

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "I")
	public static int anInt8434;

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
	public static int anInt8428 = 16777215;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/lang/String;Lclient!r;Lclient!la;ZLclient!ho;Z)V")
	public static void method7021(@OriginalArg(0) String arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(4) Class134 arg3, @OriginalArg(5) boolean arg4) {
		@Pc(12) boolean local12 = !Static564.aBoolean719 || Static420.method5989();
		if (!local12) {
			return;
		}
		@Pc(36) int local36;
		@Pc(45) int local45;
		if (Static564.aBoolean719 && local12) {
			@Pc(148) Class134 local148 = Static11.aClass134_2;
			@Pc(154) Class54 local154 = arg1.method7394(local148, Static108.aClass279Array4);
			local36 = local148.method3355(arg0, null, 250);
			local45 = local148.method3351(250, local148.anInt3766, arg0, null);
			@Pc(173) int local173 = Static3.aClass279_4.anInt7341;
			@Pc(177) int local177 = local173 + 4;
			local36 += local177 * 2;
			local45 += local177 * 2;
			if (Static414.anInt7056 > local36) {
				local36 = Static414.anInt7056;
			}
			if (local45 < Static490.anInt7996) {
				local45 = Static490.anInt7996;
			}
			@Pc(216) int local216 = Static448.aClass63_20.method1678(Static245.anInt4333, local36) + Static318.anInt5430;
			@Pc(224) int local224 = Static378.aClass249_18.method5777(local45, Static66.anInt1531) + Static586.anInt2134;
			arg1.method7398(Static453.aClass279_5, false).DA(local216 + Static70.aClass279_2.anInt7341, Static70.aClass279_2.anInt7340 + local224, local36 - Static70.aClass279_2.anInt7341 * 2, local45 + -(Static70.aClass279_2.anInt7340 * 2), 1, 0, 0);
			arg1.method7398(Static70.aClass279_2, true).method7680(local216, local224);
			Static70.aClass279_2.method6154();
			arg1.method7398(Static70.aClass279_2, true).method7680(local36 + local216 - local173, local224);
			Static70.aClass279_2.method6153();
			arg1.method7398(Static70.aClass279_2, true).method7680(local216 + local36 - local173, -local173 + local224 - -local45);
			Static70.aClass279_2.method6154();
			arg1.method7398(Static70.aClass279_2, true).method7680(local216, local224 + local45 - local173);
			Static70.aClass279_2.method6153();
			arg1.method7398(Static3.aClass279_4, true).method7682(local216, Static70.aClass279_2.anInt7340 + local224, local173, local45 - Static70.aClass279_2.anInt7340 * 2);
			Static3.aClass279_4.method6163();
			arg1.method7398(Static3.aClass279_4, true).method7682(local216 + Static70.aClass279_2.anInt7341, local224, local36 - Static70.aClass279_2.anInt7341 * 2, local173);
			Static3.aClass279_4.method6163();
			arg1.method7398(Static3.aClass279_4, true).method7682(local216 + local36 - local173, local224 + Static70.aClass279_2.anInt7340, local173, local45 - Static70.aClass279_2.anInt7340 * 2);
			Static3.aClass279_4.method6163();
			arg1.method7398(Static3.aClass279_4, true).method7682(local216 + Static70.aClass279_2.anInt7341, local45 + local224 - local173, local36 - Static70.aClass279_2.anInt7341 * 2, local173);
			Static3.aClass279_4.method6163();
			local154.method7790(null, null, 0, 1, -1, local36 - local177 * 2, local177 + local224, local45 - local177 * 2, 1, 0, Static101.anInt2073 | 0xFF000000, local177 + local216, arg0, 0, null);
			Static542.method7209(local36, local224, local216, local45);
		} else {
			local36 = arg3.method3355(arg0, null, 250);
			local45 = arg3.method3352(null, 250, arg0) * 13;
			arg1.J(6, 6, local36 + 4 + 4, local45 + 4 - -4, -16777216, 0);
			arg1.method7402(6, 6, local36 + 4 + 4, local45 + 8, -1, 0);
			arg2.method7790(null, null, 0, 1, -1, local36, 10, local45, 1, 0, -1, 10, arg0, 0, null);
			Static542.method7209(local36 + 4 + 4, 6, 6, local45 + 4 + 4);
		}
		if (arg4) {
			try {
				arg1.method7386();
			} catch (@Pc(448) Exception_Sub1 local448) {
			}
		}
	}
}
