import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!tf;")
	public static Class322 aClass322_14;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public static int anInt747;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "Lclient!fq;")
	public static Class102 aClass102_1;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Lclient!ps;")
	public static final Class262 aClass262_1 = new Class262(8, 17);

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	public static int anInt749 = 0;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "Lclient!wp;")
	public static Class361 aClass361_2 = null;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIZ)V")
	public static void method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if ((arg4 ? Static405.aClass3_Sub3_Sub1_1.anInt7561 : Static405.aClass3_Sub3_Sub1_1.anInt7559) != 0 && arg3 != 0 && Static5.anInt118 < 50 && arg2 != -1) {
			Static204.aClass347Array1[Static5.anInt118++] = new Class347((byte) (arg4 ? 3 : 2), arg2, arg3, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZIIIIBF)[[I")
	public static int[][] method649(@OriginalArg(8) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class3_Sub6_Sub23 local13 = new Class3_Sub6_Sub23();
		local13.anInt5597 = 3;
		local13.aBoolean404 = false;
		local13.anInt5587 = (int) (arg0 * 4096.0F);
		local13.anInt5592 = 4;
		local13.anInt5590 = 4;
		local13.method7768();
		Static181.method3119(64, 256);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local13.method4773(local48, local9[local48]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method652() {
		Static208.aClass112_24.method3092();
		Static112.aClass112_17.method3092();
		@Pc(28) int local28;
		for (@Pc(23) Class3_Sub43 local23 = (Class3_Sub43) Static133.aClass112_20.method3088(); local23 != null; local23 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
			local28 = local23.anInt7753;
			if (local28 < 1000) {
				local23.method7825();
				if (local28 == 11 || local28 == 22 || local28 == 16 || local28 == 50 || local28 == 23 || local28 == 25 || local28 == 3) {
					Static112.aClass112_17.method3079(local23);
				} else {
					Static208.aClass112_24.method3079(local23);
				}
			}
		}
		Static208.aClass112_24.method3082(Static133.aClass112_20);
		Static112.aClass112_17.method3082(Static133.aClass112_20);
		if (Static571.anInt9281 <= 1) {
			Static369.aClass3_Sub43_3 = null;
		} else if (Static505.aBoolean625 && Static140.aClass195_1.method4499(81) && Static571.anInt9281 > 2) {
			Static369.aClass3_Sub43_3 = (Class3_Sub43) Static133.aClass112_20.aClass3_111.aClass3_285.aClass3_285;
		} else {
			Static369.aClass3_Sub43_3 = (Class3_Sub43) Static133.aClass112_20.aClass3_111.aClass3_285;
		}
		local28 = -1;
		@Pc(135) Class3_Sub1 local135 = (Class3_Sub1) Static68.aClass112_15.method3088();
		if (local135 != null) {
			local28 = local135.method5714();
		}
		if (!Static150.aBoolean254) {
			if (local28 == 0 && (Static521.anInt8378 == 1 && Static571.anInt9281 > 2 || Static490.method6636())) {
				local28 = 2;
			}
			if (local28 == 2 && Static571.anInt9281 > 0 && local135 != null) {
				if (Static283.aClass361_8 == null && Static442.anInt7419 == 0) {
					Static65.method1421(local135.method5713(), local135.method5711());
				} else {
					Static204.anInt3753 = 2;
				}
			}
			if (local28 == 0 && Static571.anInt9281 > 0) {
				Static223.method3525();
			}
			if (Static283.aClass361_8 != null || Static442.anInt7419 != 0) {
				return;
			}
			Static556.aClass3_Sub43_4 = null;
			Static204.anInt3753 = 0;
			return;
		}
		@Pc(150) int local150;
		@Pc(156) int local156;
		if (local28 == -1) {
			local150 = Static465.aClass86_1.method7267();
			local156 = Static465.aClass86_1.method7265();
			if (local150 < Static211.anInt3825 - 10 || Static211.anInt3825 + Static520.anInt9775 + 10 < local150 || Static538.anInt8629 - 10 > local156 || Static538.anInt8629 + Static122.anInt2800 + 10 < local156) {
				Static242.method3771();
			}
		}
		if (local28 != 0) {
			return;
		}
		local150 = Static211.anInt3825;
		local156 = Static538.anInt8629;
		@Pc(206) int local206 = Static520.anInt9775;
		@Pc(210) int local210 = local135.method5713();
		@Pc(214) int local214 = local135.method5711();
		@Pc(216) int local216 = -1;
		@Pc(235) int local235;
		for (@Pc(218) int local218 = 0; local218 < Static571.anInt9281; local218++) {
			if (Static270.aBoolean347) {
				local235 = (Static571.anInt9281 - local218 - 1) * 16 + local156 + 33;
				if (local150 < local210 && local210 < local150 + local206 && local235 - 13 < local214 && local214 < local235 + 4) {
					local216 = local218;
				}
			} else {
				local235 = local156 + (Static571.anInt9281 + -1 + -local218) * 16 + 31;
				if (local150 < local210 && local150 + local206 > local210 && local214 > local235 - 13 && local214 < local235 + 3) {
					local216 = local218;
				}
			}
		}
		if (local216 != -1) {
			local235 = 0;
			@Pc(318) Class202 local318 = new Class202(Static133.aClass112_20);
			for (@Pc(323) Class3_Sub43 local323 = (Class3_Sub43) local318.method4672(); local323 != null; local323 = (Class3_Sub43) local318.method4670()) {
				if (local216 == local235) {
					Static302.method4444(local323, local210, local214);
				}
				local235++;
			}
		}
		Static242.method3771();
		return;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!ot;Lclient!r;)I")
	public static int method653(@OriginalArg(1) Class246 arg0, @OriginalArg(2) Class45 arg1) {
		if (arg0.anInt6865 != -1) {
			return arg0.anInt6865;
		}
		if (arg0.anInt6863 != -1) {
			@Pc(33) Class55 local33 = arg1.anInterface3_12.method4776(arg0.anInt6863);
			if (!local33.aBoolean144) {
				return local33.aShort21;
			}
		}
		return arg0.anInt6869;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Z")
	public static boolean method654(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class3_Sub43 local15 = (Class3_Sub43) Static133.aClass112_20.method3088(); local15 != null; local15 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
			if (Static246.method3794(local15.anInt7753) && local15.aLong221 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
