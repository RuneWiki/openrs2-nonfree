import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!tl", name = "S", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!tl", name = "U", descriptor = "Z")
	public static boolean aBoolean444;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
	public static void method5086() {
		Static229.aClass4_Sub1_Sub4_3.method3797();
		Static317.aClass193_100 = null;
		Static261.anInt5280 = 1;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!br;IIB)V")
	public static void method5087(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static312.anInt6062 = arg2;
		Static181.aClass21_10 = arg0;
		Static156.anInt5229 = arg1;
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
	public static void method5088() {
		Static215.aClass116_38.method3273();
		for (@Pc(18) Class4_Sub39 local18 = (Class4_Sub39) Static58.aClass116_7.method3270(); local18 != null; local18 = (Class4_Sub39) Static58.aClass116_7.method3272()) {
			if (local18.anInt5716 < 1000) {
				local18.method5687();
				Static215.aClass116_38.method3274(local18);
			}
		}
		Static215.aClass116_38.method3268(Static58.aClass116_7);
		if (Static103.aClass21_5 != null || Static93.anInt2506 > 0) {
			return;
		}
		@Pc(55) int local55 = -1;
		if (Static138.aClass4_Sub28_2 != null) {
			local55 = Static138.aClass4_Sub28_2.method5558();
		}
		if (!Static272.aBoolean393) {
			if (Static116.anInt2757 >= 0) {
				local55 = Static116.anInt2757;
			}
			Static116.anInt2757 = -1;
			if (local55 == 0 && (Static321.anInt4799 == 1 && Static105.anInt2645 > 2 || Static121.method4351())) {
				local55 = 2;
			}
			if (local55 == 2 && Static105.anInt2645 > 0) {
				if (Static138.aClass4_Sub28_2 == null) {
					Static92.method532(Static320.anInt6202, Static196.anInt6632);
				} else {
					Static92.method532(Static138.aClass4_Sub28_2.method5559(), Static138.aClass4_Sub28_2.method5555());
				}
			}
			if (local55 != 0 || Static105.anInt2645 <= 0) {
				return;
			}
			Static122.method2532();
			return;
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (local55 == -1) {
			local71 = Static258.aClass127_1.method3588();
			local75 = Static258.aClass127_1.method3595();
			if (local71 < Static70.anInt1838 - 10 || local71 > Static302.anInt5773 + Static70.anInt1838 + 10 || local75 < Static127.anInt3018 - 10 || local75 > Static127.anInt3018 + Static184.anInt3880 + 10) {
				Static272.aBoolean393 = false;
				Static168.method5617(Static184.anInt3880, Static127.anInt3018, Static70.anInt1838, Static302.anInt5773);
			}
		}
		if (local55 != 0) {
			return;
		}
		local71 = Static70.anInt1838;
		local75 = Static127.anInt3018;
		@Pc(120) int local120 = Static302.anInt5773;
		@Pc(124) int local124 = Static138.aClass4_Sub28_2.method5555();
		@Pc(128) int local128 = Static138.aClass4_Sub28_2.method5559();
		@Pc(130) int local130 = -1;
		@Pc(148) int local148;
		for (@Pc(132) int local132 = 0; local132 < Static105.anInt2645; local132++) {
			if (Static140.aBoolean255) {
				local148 = local75 + (Static105.anInt2645 - local132 - 1) * 16 + 33;
				if (local124 > local71 && local124 < local120 + local71 && local148 - 13 < local128 && local148 + 4 > local128) {
					local130 = local132;
				}
			} else {
				local148 = local75 + (Static105.anInt2645 - 1 - local132) * 16 + 31;
				if (local71 < local124 && local71 + local120 > local124 && local148 - 13 < local128 && local148 + 3 > local128) {
					local130 = local132;
				}
			}
		}
		if (local130 != -1) {
			local148 = 0;
			@Pc(237) Class37 local237 = new Class37(Static58.aClass116_7);
			for (@Pc(242) Class4_Sub39 local242 = (Class4_Sub39) local237.method1016(); local242 != null; local242 = (Class4_Sub39) local237.method1018()) {
				if (local130 == local148) {
					Static350.method5564(local242);
				}
				local148++;
			}
		}
		Static272.aBoolean393 = false;
		Static168.method5617(Static184.anInt3880, Static127.anInt3018, Static70.anInt1838, Static302.anInt5773);
		return;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIBII)V")
	public static void method5090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(17) int local17 = -arg2;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg2 + arg1);
		@Pc(36) int local36 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg1 - arg2);
		Static135.method2878(Static223.anIntArrayArray124[arg0], local27, arg3, local36);
		while (local12 < local14) {
			local19 += 2;
			local17 += local19;
			@Pc(68) int local68;
			@Pc(72) int local72;
			@Pc(92) int local92;
			@Pc(101) int local101;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local68 = arg0 - local14;
				local72 = local14 + arg0;
				if (Static349.anInt6619 <= local72 && Static195.anInt4097 >= local68) {
					local92 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, local12 + arg1);
					local101 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg1 - local12);
					if (local72 <= Static195.anInt4097) {
						Static135.method2878(Static223.anIntArrayArray124[local72], local92, arg3, local101);
					}
					if (Static349.anInt6619 <= local68) {
						Static135.method2878(Static223.anIntArrayArray124[local68], local92, arg3, local101);
					}
				}
			}
			local12++;
			local68 = arg0 - local12;
			local72 = arg0 + local12;
			if (Static349.anInt6619 <= local72 && local68 <= Static195.anInt4097) {
				local92 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, local14 + arg1);
				local101 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg1 - local14);
				if (local72 <= Static195.anInt4097) {
					Static135.method2878(Static223.anIntArrayArray124[local72], local92, arg3, local101);
				}
				if (local68 >= Static349.anInt6619) {
					Static135.method2878(Static223.anIntArrayArray124[local68], local92, arg3, local101);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(BI)V")
	public static void method5091() {
		Static168.aClass198_247.method5202(5);
		Static334.aClass198_140.method5202(5);
	}
}
