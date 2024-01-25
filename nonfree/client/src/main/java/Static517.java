import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
	public static int anInt8991;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z")
	public static boolean method7377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static228.aBoolean342) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static459.aClass245ArrayArray2[local13] == null || Static459.aClass245ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class245 local35 = Static459.aClass245ArrayArray2[local13][local17];
		@Pc(49) Class3_Sub11 local49;
		if (arg0 == -1 && local35.anInt7223 == 0) {
			for (local49 = (Class3_Sub11) Static255.aClass71_43.method2089(); local49 != null; local49 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
				if (local49.anInt1419 == 13 || local49.anInt1419 == 1003 || local49.anInt1419 == 20 || local49.anInt1419 == 50 || local49.anInt1419 == 58) {
					for (@Pc(82) Class245 local82 = Static46.method1005(local49.anInt1417); local82 != null; local82 = Static232.method4126(local82)) {
						if (local35.anInt7256 == local82.anInt7256) {
							return true;
						}
					}
				}
			}
		} else {
			for (local49 = (Class3_Sub11) Static255.aClass71_43.method2089(); local49 != null; local49 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
				if (arg0 == local49.anInt1421 && local49.anInt1417 == local35.anInt7256 && (local49.anInt1419 == 13 || local49.anInt1419 == 1003 || local49.anInt1419 == 20 || local49.anInt1419 == 50 || local49.anInt1419 == 58)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!kea;)I")
	public static int method7378(@OriginalArg(1) Class161 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4268(Static464.anInt8336)) {
			local5++;
		}
		if (arg0.method4268(Static146.anInt2947)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(III)V")
	public static void method7379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 16);
		local8.method6211();
		local8.anInt7557 = arg1;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(III)V")
	public static void method7380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static25.aClass53_6.method1378(Static490.aClass67_143.method1934(Static193.anInt7803));
		for (@Pc(18) Class3_Sub11 local18 = (Class3_Sub11) Static255.aClass71_43.method2089(); local18 != null; local18 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
			@Pc(24) int local24 = Static157.method3099(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		@Pc(51) int local51 = Static179.anInt4933 * 16 + 21;
		@Pc(58) int local58 = arg0 - local13 / 2;
		if (Static480.anInt8652 < local58 + local13) {
			local58 = Static480.anInt8652 - local13;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(75) int local75 = arg1;
		if (Static412.anInt7547 < arg1 + local51) {
			local75 = Static412.anInt7547 - local51;
		}
		Static87.anInt1887 = local58;
		if (local75 < 0) {
			local75 = 0;
		}
		Static386.anInt7125 = local75;
		Static199.anInt4475 = (Static346.aBoolean416 ? 26 : 22) + Static179.anInt4933 * 16;
		Static256.anInt5196 = local13;
		Static228.aBoolean342 = true;
	}
}
