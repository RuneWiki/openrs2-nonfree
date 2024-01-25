import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gba", name = "A", descriptor = "Lclient!sfa;")
	public static Class111 aClass111_1;

	@OriginalMember(owner = "client!gba", name = "H", descriptor = "[I")
	public static int[] anIntArray168 = new int[1];

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)Z")
	public static boolean method2613(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static622.method7592(arg0, arg1) | (arg0 & 0x800) != 0 || Static394.method5729(arg1, arg0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILclient!wq;IZ)V")
	public static void method2615(@OriginalArg(0) int arg0, @OriginalArg(1) Class394 arg1, @OriginalArg(2) int arg2) {
		Static535.anInt10419 = arg2;
		Static582.aClass394_11 = arg1;
		Static250.anInt4002 = arg0;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZB)Z")
	public static boolean method2617(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static563.aClass143_13.method6224();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static563.aClass143_13.method6189();
		} else if (!Static563.aClass143_13.method6227()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub13_1, arg0 ? 1 : 0);
			Static185.method2703();
			return true;
		}
	}

	@OriginalMember(owner = "client!gba", name = "g", descriptor = "(I)V")
	public static void method2619() {
		if (!Static363.aBoolean460) {
			return;
		}
		while (true) {
			while (Static475.aClass160_Sub1Array2.length > Static361.anInt6319) {
				@Pc(25) Class160_Sub1 local25 = Static475.aClass160_Sub1Array2[Static361.anInt6319];
				if (local25 != null && local25.anInt3897 == -1) {
					if (Static238.aClass5_Sub33_1 == null) {
						Static238.aClass5_Sub33_1 = Static548.aClass231_1.method5373(local25.aString34);
					}
					@Pc(50) int local50 = Static238.aClass5_Sub33_1.anInt5994;
					if (local50 == -1) {
						return;
					}
					Static361.anInt6319++;
					local25.anInt3897 = local50;
					Static238.aClass5_Sub33_1 = null;
				} else {
					Static361.anInt6319++;
				}
			}
			return;
		}
	}
}
