import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!oq", name = "N", descriptor = "Lclient!ln;")
	public static Class208 aClass208_2;

	@OriginalMember(owner = "client!oq", name = "hb", descriptor = "I")
	public static int anInt7312;

	@OriginalMember(owner = "client!oq", name = "R", descriptor = "I")
	public static int anInt7299 = 0;

	@OriginalMember(owner = "client!oq", name = "U", descriptor = "[I")
	public static final int[] anIntArray434 = new int[3];

	@OriginalMember(owner = "client!oq", name = "ab", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_234 = new Class194(91, 7);

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "(I)V")
	public static void method6435() {
		for (@Pc(14) Class3_Sub31 local14 = (Class3_Sub31) Static402.aClass216_51.method5457(); local14 != null; local14 = (Class3_Sub31) Static402.aClass216_51.method5458()) {
			if (local14.aBoolean434) {
				local14.method5121();
			}
		}
		for (@Pc(34) Class3_Sub31 local34 = (Class3_Sub31) Static413.aClass216_52.method5457(); local34 != null; local34 = (Class3_Sub31) Static413.aClass216_52.method5458()) {
			if (local34.aBoolean434) {
				local34.method5121();
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(B)V")
	public static void method6436() {
		if (Static13.anInt233 < 0) {
			return;
		}
		@Pc(4) long local4 = Static191.method3071();
		Static13.anInt233 = (int) ((long) Static13.anInt233 + Static408.aLong189 - local4);
		if (Static13.anInt233 > 0) {
			@Pc(24) int local24 = (Static13.anInt233 << 8) / Static340.anInt6306;
			@Pc(29) int local29 = 255 - local24;
			@Pc(34) float local34 = (float) local24 / 255.0F;
			Static21.anInt292 = (local24 * (Static85.anInt1683 & 0xFF00FF) + local29 * (Static508.aClass291_7.anInt8326 & 0xFF00FF) & 0xFF00FF00) + ((Static85.anInt1683 & 0xFF00) * local24 + ((Static508.aClass291_7.anInt8326 & 0xFF00) * local29) & 0xFF0000) >>> 8;
			@Pc(72) float local72 = 1.0F - local34;
			Static56.aFloat22 = Static543.aFloat179 + (Static508.aClass291_7.aFloat158 - Static543.aFloat179) * local72;
			Static454.aFloat150 = (Static508.aClass291_7.aFloat161 - Static473.aFloat154) * local72 + Static473.aFloat154;
			Static265.aFloat121 = local72 * (Static508.aClass291_7.aFloat159 - Static138.aFloat63) + Static138.aFloat63;
			Static570.aFloat75 = (Static508.aClass291_7.aFloat157 - Static368.aFloat144) * local72 + Static368.aFloat144;
			Static159.anInt3199 = ((Static473.anInt8108 & 0xFF00FF) * local24 + (Static508.aClass291_7.anInt8321 & 0xFF00FF) * local29 & 0xFF00FF00) + (local24 * (Static473.anInt8108 & 0xFF00) + ((Static508.aClass291_7.anInt8321 & 0xFF00) * local29) & 0xFF0000) >>> 8;
			Static465.anInt7959 = Static28.anInt407 * local24 + Static508.aClass291_7.anInt8322 * local29 >> 8;
			Static462.aFloat151 = (Static508.aClass291_7.aFloat160 - Static511.aFloat162) * local72 + Static511.aFloat162;
			Static15.aFloat2 = local72 * (Static508.aClass291_7.aFloat156 - Static442.aFloat149) + Static442.aFloat149;
			if (Static508.aClass291_7.aClass141_4 != Static458.aClass141_3) {
				Static28.aClass141_1 = Static511.aClass82_16.method6150(Static458.aClass141_3, Static508.aClass291_7.aClass141_4, local72, Static28.aClass141_1);
			}
		} else {
			Static454.aFloat150 = Static508.aClass291_7.aFloat161;
			Static462.aFloat151 = Static508.aClass291_7.aFloat160;
			Static13.anInt233 = -1;
			Static465.anInt7959 = Static508.aClass291_7.anInt8322;
			Static159.anInt3199 = Static508.aClass291_7.anInt8321;
			Static570.aFloat75 = Static508.aClass291_7.aFloat157;
			Static56.aFloat22 = Static508.aClass291_7.aFloat158;
			Static28.aClass141_1 = Static508.aClass291_7.aClass141_4;
			Static15.aFloat2 = Static508.aClass291_7.aFloat156;
			Static265.aFloat121 = Static508.aClass291_7.aFloat159;
			Static21.anInt292 = Static508.aClass291_7.anInt8326;
		}
		Static408.aLong189 = local4;
	}
}
