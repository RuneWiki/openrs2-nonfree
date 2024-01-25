import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!tfa", name = "w", descriptor = "Lclient!fca;")
	public static Class109 aClass109_8;

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_252 = new Class363(44, 7);

	@OriginalMember(owner = "client!tfa", name = "u", descriptor = "I")
	public static int anInt8480 = 0;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IBI)I")
	public static int method7040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static209.anIntArray249[arg1 & 0x3] : Static271.anIntArray337[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BII)Z")
	public static boolean method7043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)V")
	public static void method7047() {
		if (Static348.anInt6257 < 0) {
			return;
		}
		@Pc(8) long local8 = Static548.method7437();
		Static348.anInt6257 = (int) ((long) Static348.anInt6257 + Static415.aLong200 - local8);
		if (Static348.anInt6257 <= 0) {
			Static101.aClass37_2 = Static539.aClass216_2.aClass37_5;
			Static534.anInt8750 = Static539.aClass216_2.anInt6019;
			Static293.anInt5314 = Static539.aClass216_2.anInt6024;
			Static428.anInt7334 = Static539.aClass216_2.anInt6025;
			Static205.aFloat126 = Static539.aClass216_2.aFloat177;
			Static348.anInt6257 = -1;
			Static97.aFloat54 = Static539.aClass216_2.aFloat174;
			Static121.aFloat64 = Static539.aClass216_2.aFloat175;
			Static92.aFloat53 = Static539.aClass216_2.aFloat173;
			Static45.aFloat24 = Static539.aClass216_2.aFloat172;
			Static289.aFloat145 = Static539.aClass216_2.aFloat176;
		} else {
			@Pc(59) int local59 = (Static348.anInt6257 << 8) / Static547.anInt7003;
			@Pc(63) int local63 = 255 - local59;
			@Pc(68) float local68 = (float) local59 / 255.0F;
			Static293.anInt5314 = (local59 * (Static327.anInt6049 & 0xFF00) + (Static539.aClass216_2.anInt6024 & 0xFF00) * local63 & 0xFF0000) + ((Static327.anInt6049 & 0xFF00FF) * local59 + (local63 * (Static539.aClass216_2.anInt6024 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			@Pc(106) float local106 = 1.0F - local68;
			Static534.anInt8750 = (local59 * (Static223.anInt4186 & 0xFF00FF) + (Static539.aClass216_2.anInt6019 & 0xFF00FF) * local63 & 0xFF00FF00) + (local59 * (Static223.anInt4186 & 0xFF00) + ((Static539.aClass216_2.anInt6019 & 0xFF00) * local63) & 0xFF0000) >>> 8;
			Static289.aFloat145 = (Static539.aClass216_2.aFloat176 - Static469.aFloat251) * local106 + Static469.aFloat251;
			Static121.aFloat64 = local106 * (Static539.aClass216_2.aFloat175 - Static188.aFloat124) + Static188.aFloat124;
			Static205.aFloat126 = local106 * (Static539.aClass216_2.aFloat177 - Static4.aFloat263) + Static4.aFloat263;
			Static428.anInt7334 = Static122.anInt2380 * local59 + local63 * Static539.aClass216_2.anInt6025 >> 8;
			Static92.aFloat53 = Static40.aFloat21 + (Static539.aClass216_2.aFloat173 - Static40.aFloat21) * local106;
			Static97.aFloat54 = Static84.aFloat50 + (Static539.aClass216_2.aFloat174 - Static84.aFloat50) * local106;
			Static45.aFloat24 = Static427.aFloat208 + local106 * (Static539.aClass216_2.aFloat172 - Static427.aFloat208);
			if (Static539.aClass216_2.aClass37_5 != Static290.aClass37_4) {
				Static101.aClass37_2 = Static312.aClass100_7.method6210(Static290.aClass37_4, Static539.aClass216_2.aClass37_5, local106, Static101.aClass37_2);
			}
		}
		Static415.aLong200 = local8;
	}
}
