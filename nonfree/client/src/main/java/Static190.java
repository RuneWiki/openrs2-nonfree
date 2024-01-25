import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "B")
	public static byte aByte36;

	@OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
	public static int anInt3955;

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_84 = new Class73(95, -1);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Z")
	public static boolean method3451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BILclient!rr;I)V")
	public static void method3452(@OriginalArg(1) int arg0, @OriginalArg(2) Class292 arg1, @OriginalArg(3) int arg2) {
		if (Static199.aBoolean458) {
			@Pc(14) Class320 local14 = Static592.anInt9588 == -1 ? null : Static577.aClass185_2.method4519(Static592.anInt9588);
			if (Static67.method1354(arg1).method241() && (Static348.anInt6222 & 0x20) != 0 && (local14 == null || arg1.method6464(Static592.anInt9588, local14.anInt8653) != local14.anInt8653)) {
				Static142.method7766(false, true, arg1.anInt7933, 60, Static104.aString16, 0L, Static22.aString33 + " -> " + arg1.aString79, arg1.anInt7890, Static209.anInt4228, arg1.anInt7964);
			}
		}
		@Pc(79) String local79;
		for (@Pc(72) int local72 = 9; local72 >= 5; local72--) {
			local79 = Static427.method6151(arg1, local72);
			if (local79 != null) {
				Static142.method7766(false, true, arg1.anInt7933, 1002, local79, (long) (local72 + 1), arg1.aString79, arg1.anInt7890, Static362.method5434(local72, arg1), arg1.anInt7964);
			}
		}
		local79 = Static394.method5797(arg1);
		if (local79 != null) {
			Static142.method7766(false, true, arg1.anInt7933, 3, local79, 0L, arg1.aString79, arg1.anInt7890, arg1.anInt7940, arg1.anInt7964);
		}
		for (@Pc(147) int local147 = 4; local147 >= 0; local147--) {
			@Pc(154) String local154 = Static427.method6151(arg1, local147);
			if (local154 != null) {
				Static142.method7766(false, true, arg1.anInt7933, 22, local154, (long) (local147 + 1), arg1.aString79, arg1.anInt7890, Static362.method5434(local147, arg1), arg1.anInt7964);
			}
		}
		if (!Static67.method1354(arg1).method247()) {
			return;
		}
		if (arg1.aString75 == null) {
			Static142.method7766(false, true, arg1.anInt7933, 44, Static230.aClass156_8.method4065(Static25.anInt769), 0L, "", arg1.anInt7890, -1, arg1.anInt7964);
		} else {
			Static142.method7766(false, true, arg1.anInt7933, 44, arg1.aString75, 0L, "", arg1.anInt7890, -1, arg1.anInt7964);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
	public static int method3453(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
