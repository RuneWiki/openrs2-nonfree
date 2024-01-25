import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "I")
	public static int anInt7329;

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "I")
	public static int anInt7330 = -1;

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(II)V")
	public static void method6299(@OriginalArg(0) int arg0) {
		if (Static338.anInt5833 == 0) {
			Static544.aClass6_Sub8_Sub4_10.method5066(arg0);
		} else {
			Static382.anInt6400 = arg0;
		}
	}

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(II)V")
	public static void method6300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class351 local28 = Static441.aClass351ArrayArrayArray1[local9][arg0][arg1] = Static441.aClass351ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class67 local33 = local28.aClass67_3; local33 != null; local33 = local33.aClass67_1) {
					@Pc(37) Class2_Sub1_Sub1 local37 = local33.aClass2_Sub1_Sub1_1;
					if (local37.aShort118 == arg0 && local37.aShort121 == arg1) {
						local37.aByte140--;
					}
				}
				if (local28.aClass2_Sub1_Sub3_1 != null) {
					local28.aClass2_Sub1_Sub3_1.aByte140--;
				}
				if (local28.aClass2_Sub1_Sub2_2 != null) {
					local28.aClass2_Sub1_Sub2_2.aByte140--;
				}
				if (local28.aClass2_Sub1_Sub2_1 != null) {
					local28.aClass2_Sub1_Sub2_1.aByte140--;
				}
				if (local28.aClass2_Sub1_Sub4_2 != null) {
					local28.aClass2_Sub1_Sub4_2.aByte140--;
				}
				if (local28.aClass2_Sub1_Sub4_1 != null) {
					local28.aClass2_Sub1_Sub4_1.aByte140--;
				}
			}
		}
		if (Static441.aClass351ArrayArrayArray1[0][arg0][arg1] == null) {
			Static441.aClass351ArrayArrayArray1[0][arg0][arg1] = new Class351(0);
			Static441.aClass351ArrayArrayArray1[0][arg0][arg1].aByte139 = 1;
		}
		Static441.aClass351ArrayArrayArray1[0][arg0][arg1].aClass351_1 = local7;
		Static441.aClass351ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
