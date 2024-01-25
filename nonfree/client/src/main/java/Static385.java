import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!wl", name = "Z", descriptor = "[I")
	public static int[] anIntArray584;

	@OriginalMember(owner = "client!wl", name = "cb", descriptor = "I")
	public static int anInt7009;

	@OriginalMember(owner = "client!wl", name = "G", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_112 = new Class183(59, -1);

	@OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
	public static int anInt7000 = 10;

	@OriginalMember(owner = "client!wl", name = "ab", descriptor = "[I")
	public static final int[] anIntArray585 = new int[25];

	@OriginalMember(owner = "client!wl", name = "bb", descriptor = "I")
	public static int anInt7008 = -1;

	@OriginalMember(owner = "client!wl", name = "db", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_205 = new Class208(102, 3);

	@OriginalMember(owner = "client!wl", name = "eb", descriptor = "Z")
	public static boolean aBoolean496 = true;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)V")
	public static void method6038() {
		Static320.aClass238_42.method5806();
		for (@Pc(13) Class2_Sub43 local13 = (Class2_Sub43) Static262.aClass238_29.method5795(); local13 != null; local13 = (Class2_Sub43) Static262.aClass238_29.method5799()) {
			if (local13.anInt7126 < 1000) {
				local13.method6130();
				Static320.aClass238_42.method5796(local13);
			}
		}
		Static320.aClass238_42.method5802(Static262.aClass238_29);
		@Pc(39) int local39 = -1;
		if (Static248.aClass2_Sub17_1 != null) {
			local39 = Static248.aClass2_Sub17_1.method2187();
		}
		if (!Static214.aBoolean313) {
			if (local39 == 0 && (Static251.anInt4857 == 1 && Static233.anInt4642 > 2 || Static15.method175())) {
				local39 = 2;
			}
			if (local39 == 2 && Static233.anInt4642 > 0 && Static248.aClass2_Sub17_1 != null) {
				if (Static268.aClass3_13 == null && Static334.anInt6171 == 0) {
					Static346.method5533(Static248.aClass2_Sub17_1.method2189(), Static248.aClass2_Sub17_1.method2186());
				} else {
					Static303.anInt7065 = 2;
				}
			}
			if (local39 == 0 && Static233.anInt4642 > 0) {
				Static57.method884();
			}
			if (Static268.aClass3_13 != null || Static334.anInt6171 != 0) {
				return;
			}
			Static53.aClass2_Sub43_1 = null;
			Static303.anInt7065 = 0;
			return;
		}
		@Pc(63) int local63;
		@Pc(67) int local67;
		if (local39 == -1) {
			local63 = Static136.aClass91_2.method5223();
			local67 = Static136.aClass91_2.method5224();
			if (local63 < Static30.anInt453 - 10 || local63 > Static30.anInt453 + Static392.anInt7142 + 10 || local67 < Static92.anInt1974 - 10 || Static10.anInt6517 + Static92.anInt1974 + 10 < local67) {
				Static214.aBoolean313 = false;
				Static330.method5311(Static30.anInt453, Static392.anInt7142, Static92.anInt1974, Static10.anInt6517);
			}
		}
		if (local39 != 0) {
			return;
		}
		local63 = Static30.anInt453;
		local67 = Static92.anInt1974;
		@Pc(116) int local116 = Static392.anInt7142;
		@Pc(120) int local120 = Static248.aClass2_Sub17_1.method2189();
		@Pc(124) int local124 = Static248.aClass2_Sub17_1.method2186();
		@Pc(126) int local126 = -1;
		@Pc(145) int local145;
		for (@Pc(128) int local128 = 0; local128 < Static233.anInt4642; local128++) {
			if (Static127.aBoolean191) {
				local145 = local67 + (Static233.anInt4642 + (-1 - local128)) * 16 + 33;
				if (local63 < local120 && local120 < local116 + local63 && local145 - 13 < local124 && local145 + 4 > local124) {
					local126 = local128;
				}
			} else {
				local145 = (Static233.anInt4642 - local128 - 1) * 16 + local67 + 31;
				if (local63 < local120 && local116 + local63 > local120 && local124 > local145 - 13 && local145 + 3 > local124) {
					local126 = local128;
				}
			}
		}
		if (local126 != -1) {
			local145 = 0;
			@Pc(229) Class42 local229 = new Class42(Static262.aClass238_29);
			for (@Pc(234) Class2_Sub43 local234 = (Class2_Sub43) local229.method841(); local234 != null; local234 = (Class2_Sub43) local229.method840()) {
				if (local145 == local126) {
					Static133.method2328(local120, local234, local124);
				}
				local145++;
			}
		}
		Static214.aBoolean313 = false;
		Static330.method5311(Static30.anInt453, Static392.anInt7142, Static92.anInt1974, Static10.anInt6517);
		return;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!gn;)V")
	public static void method6039(@OriginalArg(1) Class1_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt5416 - Static339.anInt6265;
		@Pc(21) int local21 = arg0.anInt5378 * 128 + arg0.method4792() * 64;
		@Pc(32) int local32 = arg0.anInt5392 * 128 + arg0.method4792() * 64;
		arg0.anInt6800 += (local21 - arg0.anInt6800) / local9;
		arg0.anInt5429 = 0;
		arg0.anInt6798 += (local32 - arg0.anInt6798) / local9;
		if (arg0.anInt5376 == 0) {
			arg0.method4793(8192);
		}
		if (arg0.anInt5376 == 1) {
			arg0.method4793(12288);
		}
		if (arg0.anInt5376 == 2) {
			arg0.method4793(0);
		}
		if (arg0.anInt5376 == 3) {
			arg0.method4793(4096);
		}
	}
}
