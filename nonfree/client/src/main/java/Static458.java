import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
	public static int anInt8539;

	@OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
	public static int anInt8547;

	@OriginalMember(owner = "client!rm", name = "A", descriptor = "Lclient!r;")
	public static Class44 aClass44_13;

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "Lclient!sb;")
	public static final Class299 aClass299_5 = new Class299("WIP", 2);

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_191 = new Class362(55, 10);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)I")
	public static int method6987(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public static void method6988() {
		Static92.method2100(Static317.aClass225_54);
		Static453.anInt8515++;
		if (Static487.aBoolean624 && Static320.aBoolean455) {
			@Pc(26) int local26 = Static172.aClass135_1.method6370();
			@Pc(30) int local30 = Static172.aClass135_1.method6378();
			local26 -= Static255.anInt4672;
			local30 -= Static323.anInt6277;
			if (Static366.anInt8691 > local26) {
				local26 = Static366.anInt8691;
			}
			if (local30 < Static307.anInt6169) {
				local30 = Static307.anInt6169;
			}
			if (Static317.aClass225_54.anInt6529 + local26 > Static366.anInt8691 + Static167.aClass225_16.anInt6529) {
				local26 = Static167.aClass225_16.anInt6529 + Static366.anInt8691 - Static317.aClass225_54.anInt6529;
			}
			if (Static167.aClass225_16.anInt6521 + Static307.anInt6169 < local30 + Static317.aClass225_54.anInt6521) {
				local30 = Static307.anInt6169 + Static167.aClass225_16.anInt6521 - Static317.aClass225_54.anInt6521;
			}
			@Pc(100) int local100 = local26 + Static167.aClass225_16.anInt6485 - Static366.anInt8691;
			@Pc(108) int local108 = local30 + Static167.aClass225_16.anInt6563 - Static307.anInt6169;
			@Pc(166) Class4_Sub25 local166;
			if (Static172.aClass135_1.method6372()) {
				if (Static317.aClass225_54.anInt6522 < Static453.anInt8515) {
					@Pc(124) int local124 = local26 - Static173.anInt3515;
					@Pc(129) int local129 = local30 - Static275.anInt5634;
					if (Static317.aClass225_54.anInt6546 < local124 || -Static317.aClass225_54.anInt6546 > local124 || Static317.aClass225_54.anInt6546 < local129 || local129 < -Static317.aClass225_54.anInt6546) {
						Static211.aBoolean299 = true;
					}
				}
				if (Static317.aClass225_54.anObjectArray29 != null && Static211.aBoolean299) {
					local166 = new Class4_Sub25();
					local166.aClass225_21 = Static317.aClass225_54;
					local166.anObjectArray1 = Static317.aClass225_54.anObjectArray29;
					local166.anInt4393 = local108;
					local166.anInt4397 = local100;
					Static388.method6121(local166);
					return;
				}
			} else {
				if (Static211.aBoolean299) {
					Static419.method6558();
					if (Static317.aClass225_54.anObjectArray6 != null) {
						local166 = new Class4_Sub25();
						local166.anInt4397 = local100;
						local166.anInt4393 = local108;
						local166.anObjectArray1 = Static317.aClass225_54.anObjectArray6;
						local166.aClass225_21 = Static317.aClass225_54;
						local166.aClass225_20 = Static529.aClass225_48;
						Static388.method6121(local166);
					}
					if (Static529.aClass225_48 != null && Static69.method1182(Static317.aClass225_54) != null) {
						Static565.method8094(Static317.aClass225_54, Static529.aClass225_48);
					}
				} else if ((Static297.anInt6005 == 1 || Static400.method6306()) && Static339.anInt6583 > 2) {
					Static41.method502(Static275.anInt5634 + Static323.anInt6277, Static173.anInt3515 + Static255.anInt4672);
				} else if (Static220.method3589()) {
					Static41.method502(Static275.anInt5634 + Static323.anInt6277, Static173.anInt3515 + Static255.anInt4672);
				}
				Static317.aClass225_54 = null;
			}
		} else if (Static453.anInt8515 > 1) {
			Static317.aClass225_54 = null;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(FFFI)F")
	public static float method6990(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg2 + arg0 * (arg1 - arg2);
	}
}
