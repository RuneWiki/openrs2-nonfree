import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "Lclient!sea;")
	public static Class308 aClass308_187;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
	public static final int[] anIntArray584 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)V")
	public static void method7554(@OriginalArg(0) byte arg0) {
		if (Static368.aByteArrayArrayArray12 == null) {
			Static368.aByteArrayArrayArray12 = new byte[4][Static458.anInt9736][Static378.anInt6747];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static458.anInt9736; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static378.anInt6747; local22++) {
					Static368.aByteArrayArrayArray12[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public static void method7556() {
		@Pc(10) int local10 = 0;
		if (Static86.aClass1_Sub30_Sub1_1 != null) {
			local10 = Static86.aClass1_Sub30_Sub1_1.method5026(Static286.anInt5239);
		}
		@Pc(41) int local41;
		@Pc(55) int local55;
		if (local10 == 2) {
			local41 = Static8.anInt5988 > 800 ? 800 : Static8.anInt5988;
			Static273.anInt1189 = (Static8.anInt5988 - local41) / 2;
			local55 = Static65.anInt1195 > 600 ? 600 : Static65.anInt1195;
			Static349.anInt6422 = local41;
			Static465.anInt8056 = 0;
			Static594.anInt9806 = local55;
		} else if (local10 == 1) {
			local41 = Static8.anInt5988 <= 1024 ? Static8.anInt5988 : 1024;
			Static273.anInt1189 = (Static8.anInt5988 - local41) / 2;
			local55 = Static65.anInt1195 > 768 ? 768 : Static65.anInt1195;
			Static349.anInt6422 = local41;
			Static594.anInt9806 = local55;
			Static465.anInt8056 = 0;
		} else {
			Static594.anInt9806 = Static65.anInt1195;
			Static465.anInt8056 = 0;
			Static349.anInt6422 = Static8.anInt5988;
			Static273.anInt1189 = 0;
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Lclient!hg;")
	public static Class133 method7557() {
		return Static488.method6719();
	}
}
