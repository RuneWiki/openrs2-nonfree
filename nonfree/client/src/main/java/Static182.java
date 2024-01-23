import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "Lclient!cg;")
	public static Class22 aClass22_64;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString126 = "flash3:";

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLclient!jc;I)V")
	public static void method2938(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub2_Sub9 arg1) {
		@Pc(12) int local12;
		if (Static251.aBoolean330 || arg0) {
			local12 = Static292.anInt5674;
			@Pc(18) int local18 = local12 * 956 / 503;
			Static115.aClass4_Sub2_Sub4_4.method4136((Static189.anInt5672 - local18) / 2, 0, local18, local12);
			Static67.aClass58_1.method3972(Static189.anInt5672 / 2 - Static67.aClass58_1.anInt5028 / 2, 18);
		}
		arg1.method4101(Static122.anInt2465 == 1 ? Static13.aString12 : Static88.aString69, Static189.anInt5672 / 2, Static292.anInt5674 / 2 - 26, 16777215, -1);
		local12 = Static292.anInt5674 / 2 - 18;
		if (Static251.aBoolean330) {
			Static87.method1452(Static189.anInt5672 / 2 - 152, local12, 304, 34, 9179409);
			Static87.method1452(Static189.anInt5672 / 2 - 151, local12 + 1, 302, 32, 0);
			Static87.method1464(Static189.anInt5672 / 2 - 150, local12 + 2, Static65.anInt5707 * 3, 30, 9179409);
			Static87.method1464(Static65.anInt5707 * 3 + Static189.anInt5672 / 2 - 150, local12 + 2, 300 - Static65.anInt5707 * 3, 30, 0);
		} else {
			Static258.method4025(Static189.anInt5672 / 2 - 152, local12, 304, 34, 9179409);
			Static258.method4025(Static189.anInt5672 / 2 - 151, local12 + 1, 302, 32, 0);
			Static258.method4031(Static189.anInt5672 / 2 - 150, local12 - -2, Static65.anInt5707 * 3, 30, 9179409);
			Static258.method4031(Static189.anInt5672 / 2 + Static65.anInt5707 * 3 - 150, local12 + 2, 300 - Static65.anInt5707 * 3, 30, 0);
		}
		arg1.method4101(Static190.aString134, Static189.anInt5672 / 2, Static292.anInt5674 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public static void method2940() {
		for (@Pc(14) Class4_Sub30 local14 = (Class4_Sub30) Static167.aClass163_25.method4192(); local14 != null; local14 = (Class4_Sub30) Static167.aClass163_25.method4183()) {
			@Pc(19) int local19 = local14.anInt5208;
			if (Static48.method951(local19)) {
				@Pc(25) boolean local25 = true;
				@Pc(29) Class97[] local29 = Static217.aClass97ArrayArray1[local19];
				@Pc(31) int local31;
				for (local31 = 0; local31 < local29.length; local31++) {
					if (local29[local31] != null) {
						local25 = local29[local31].aBoolean192;
						break;
					}
				}
				if (!local25) {
					local31 = (int) local14.aLong211;
					@Pc(60) Class97 local60 = Static148.method2340(local31);
					if (local60 != null) {
						Static178.method2927(local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!lg;I)Z")
	public static boolean method2941(@OriginalArg(0) Class97 arg0) {
		if (arg0.anIntArray260 == null) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < arg0.anIntArray260.length; local22++) {
			@Pc(36) int local36 = Static207.method1818(arg0, local22);
			@Pc(41) int local41 = arg0.anIntArray254[local22];
			if (arg0.anIntArray260[local22] == 2) {
				if (local41 <= local36) {
					return false;
				}
			} else if (arg0.anIntArray260[local22] == 3) {
				if (local41 >= local36) {
					return false;
				}
			} else if (arg0.anIntArray260[local22] == 4) {
				if (local36 == local41) {
					return false;
				}
			} else if (local36 != local41) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public static void method2942() {
		Static53.aClass172_11.method4346();
		Static286.aClass172_47.method4346();
		Static253.aClass172_41.method4346();
		Static288.aClass172_48.method4346();
	}
}
