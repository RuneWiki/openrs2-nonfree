import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	public static int anInt4304;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)I")
	public static int method3456() {
		if (Static125.aClass93_11 == null) {
			if (!Static45.aBoolean34 && Static377.anInt6585 > 0) {
				if (Static111.aBoolean107 && Static161.aClass115_1.method2374(81) && Static377.anInt6585 > 2) {
					return ((Class2_Sub35) Static93.aClass181_7.aClass2_156.aClass2_267.aClass2_267).anInt5876;
				}
				return ((Class2_Sub35) Static93.aClass181_7.aClass2_156.aClass2_267).anInt5876;
			}
			@Pc(23) int local23 = Static196.aClass126_1.method5366();
			@Pc(27) int local27 = Static196.aClass126_1.method5364();
			@Pc(29) int local29 = Static281.anInt4448;
			@Pc(31) int local31 = Static168.anInt6340;
			@Pc(33) int local33 = Static204.anInt3495;
			if (local23 > local29 && local33 + local29 > local23) {
				@Pc(47) int local47 = -1;
				@Pc(66) int local66;
				for (@Pc(49) int local49 = 0; local49 < Static377.anInt6585; local49++) {
					if (Static237.aBoolean264) {
						local66 = local31 + (Static377.anInt6585 - 1 - local49) * 16 + 33;
						if (local66 - 13 < local27 && local27 <= local66 + 3) {
							local47 = local49;
						}
					} else {
						local66 = local31 + (Static377.anInt6585 - local49 - 1) * 16 + 31;
						if (local66 - 13 < local27 && local66 + 3 >= local27) {
							local47 = local49;
						}
					}
				}
				if (local47 != -1) {
					local66 = 0;
					@Pc(137) Class42 local137 = new Class42(Static93.aClass181_7);
					for (@Pc(142) Class2_Sub35 local142 = (Class2_Sub35) local137.method904(); local142 != null; local142 = (Class2_Sub35) local137.method905()) {
						if (local66++ == local47) {
							return local142.anInt5876;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z")
	public static boolean method3458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | Static97.method1427(arg0, arg1) || Static296.method4225(arg1, arg0);
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public static void method3459() {
		for (@Pc(7) int local7 = 0; local7 < Static126.anInt2092; local7++) {
			@Pc(13) Class253 local13 = Static409.aClass253Array2[local7];
			if (local13.aByte90 == 2) {
				if (local13.aClass2_Sub8_Sub4_4 == null) {
					local13.anInt7201 = Integer.MIN_VALUE;
				} else {
					Static414.aClass2_Sub8_Sub1_2.method1041(local13.aClass2_Sub8_Sub4_4);
				}
			}
		}
	}
}
