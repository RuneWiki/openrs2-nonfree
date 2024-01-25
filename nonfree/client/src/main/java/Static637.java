import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	public static final int anInt2182 = 4;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1837(@OriginalArg(1) String arg0) {
		if (!Static47.aBoolean59 || (Static344.anInt5895 & 0x18) == 0) {
			return;
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = Static439.anInt7133;
		@Pc(23) int[] local23 = Static294.anIntArray593;
		for (@Pc(25) int local25 = 0; local25 < local21; local25++) {
			@Pc(33) Class34_Sub1_Sub1_Sub2_Sub1 local33 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local23[local25]];
			if (local33.aString25 != null && local33.aString25.equalsIgnoreCase(arg0) && (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 == local33 && (Static344.anInt5895 & 0x10) != 0 || local33 != null && (Static344.anInt5895 & 0x8) != 0)) {
				@Pc(66) Class3_Sub37 local66 = Static90.method1509(Static368.aClass240_57, Static226.aClass144_2);
				local66.aClass3_Sub4_Sub1_2.method7948(0);
				local66.aClass3_Sub4_Sub1_2.method7909(Static376.anInt5867);
				local66.aClass3_Sub4_Sub1_2.method7956(Static284.anInt4811);
				local66.aClass3_Sub4_Sub1_2.method7941(local23[local25]);
				local66.aClass3_Sub4_Sub1_2.method7920(Static454.anInt7316);
				Static301.method2678(local66);
				Static539.method6916(-2, local33.anIntArray529[0], local33.method7866(), local33.method7866(), 0, true, 0, local33.anIntArray528[0]);
				local19 = true;
				break;
			}
		}
		if (!local19) {
			Static342.method4988(Static114.aClass84_21.method1729(Static654.anInt10668) + arg0);
		}
		if (Static47.aBoolean59) {
			Static252.method3806();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method1838() {
		Static521.anInt8234 = 0;
		Static342.anInt5876 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static358.anInt6116; local11++) {
			@Pc(17) int local17 = Static620.anInt10280 * local11;
			for (@Pc(19) int local19 = 0; local19 < Static620.anInt10280; local19++) {
				@Pc(26) int local26 = local17 + local19;
				Static354.anInterface10Array1[local26].method8745(local19 * Static141.anInt2656, Static456.anInt7325 * local11, Static141.anInt2656, Static456.anInt7325, true);
			}
		}
	}
}
