import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "Lclient!pu;")
	public static Class270 aClass270_95;

	@OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
	public static int anInt7679;

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "Lclient!la;")
	public static Class64 aClass64_12;

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "Lclient!pu;")
	public static Class270 aClass270_96;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_233 = new Class235(103, 5);

	@OriginalMember(owner = "client!raa", name = "o", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_234 = new Class235(33, 11);

	@OriginalMember(owner = "client!raa", name = "q", descriptor = "F")
	public static float aFloat179 = 1.0F;

	@OriginalMember(owner = "client!raa", name = "s", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject18 = null;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZLclient!vg;)V")
	public static void method6111(@OriginalArg(1) Class341 arg0) {
		if (Static182.anInt3238 == arg0.anInt9241) {
			Static166.aBooleanArray5[arg0.anInt9299] = true;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)I")
	public static int method6112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(34) int local34 = (local15 * 15731 * local15 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method6116(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static344.method4704(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static344.method4704(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(48) int local48 = local14 - local11;
		if (local48 < 1 || local48 > 12) {
			return null;
		}
		@Pc(65) StringBuffer local65 = new StringBuffer(local48);
		for (@Pc(72) int local72 = local11; local72 < local14; local72++) {
			@Pc(78) char local78 = arg0.charAt(local72);
			if (Static56.method1014(local78)) {
				@Pc(86) char local86 = Static219.method5963(local78);
				if (local86 != '\u0000') {
					local65.append(local86);
				}
			}
		}
		if (local65.length() == 0) {
			return null;
		} else {
			return local65.toString();
		}
	}
}
