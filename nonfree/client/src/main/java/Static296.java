import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!am;")
	public static final Class14 aClass14_32 = new Class14();

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_75 = new Class142("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	public static void method3925() {
		if (Static36.anInt541 < 0) {
			return;
		}
		@Pc(16) long local16 = Static183.method2674();
		Static36.anInt541 = (int) ((long) Static36.anInt541 + Static362.aLong193 - local16);
		if (Static36.anInt541 <= 0) {
			Static106.anInt7395 = Static223.aClass160_6.anInt4577;
			Static165.aFloat29 = Static223.aClass160_6.aFloat66;
			Static36.anInt541 = -1;
			Static293.aFloat69 = Static223.aClass160_6.aFloat62;
			Static416.aFloat82 = Static223.aClass160_6.aFloat67;
			Static138.anInt2145 = Static223.aClass160_6.anInt4571;
			Static43.aClass59_49 = Static223.aClass160_6.aClass59_24;
			Static374.aFloat80 = Static223.aClass160_6.aFloat63;
			Static428.aFloat84 = Static223.aClass160_6.aFloat64;
			Static30.aFloat4 = Static223.aClass160_6.aFloat65;
			Static65.anInt1010 = Static223.aClass160_6.anInt4578;
		} else {
			@Pc(67) int local67 = (Static36.anInt541 << 8) / Static232.anInt4197;
			@Pc(72) int local72 = 255 - local67;
			@Pc(77) float local77 = (float) local67 / 255.0F;
			Static65.anInt1010 = (local72 * (Static223.aClass160_6.anInt4578 & 0xFF00FF) + (Static371.anInt5990 & 0xFF00FF) * local67 & 0xFF00FF00) + ((Static371.anInt5990 & 0xFF00) * local67 + ((Static223.aClass160_6.anInt4578 & 0xFF00) * local72) & 0xFF0000) >>> 8;
			@Pc(114) float local114 = 1.0F - local77;
			Static293.aFloat69 = Static459.aFloat91 + local114 * (Static223.aClass160_6.aFloat62 - Static459.aFloat91);
			Static138.anInt2145 = Static223.aClass160_6.anInt4571 * local72 + Static33.anInt500 * local67 >> 8;
			Static165.aFloat29 = local114 * (Static223.aClass160_6.aFloat66 - Static112.aFloat10) + Static112.aFloat10;
			Static374.aFloat80 = Static258.aFloat61 + local114 * (Static223.aClass160_6.aFloat63 - Static258.aFloat61);
			Static30.aFloat4 = Static182.aFloat51 + (Static223.aClass160_6.aFloat65 - Static182.aFloat51) * local114;
			Static106.anInt7395 = ((Static223.aClass160_6.anInt4577 & 0xFF00) * local72 + (Static322.anInt5303 & 0xFF00) * local67 & 0xFF0000) + (local72 * (Static223.aClass160_6.anInt4577 & 0xFF00FF) + local67 * (Static322.anInt5303 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static416.aFloat82 = Static431.aFloat85 + local114 * (Static223.aClass160_6.aFloat67 - Static431.aFloat85);
			Static428.aFloat84 = (Static223.aClass160_6.aFloat64 - Static4.aFloat1) * local114 + Static4.aFloat1;
			if (Static199.aClass59_18 != Static223.aClass160_6.aClass59_24) {
				Static43.aClass59_49 = Static424.aClass117_11.method5720(Static199.aClass59_18, Static223.aClass160_6.aClass59_24, local114, Static43.aClass59_49);
			}
		}
		Static362.aLong193 = local16;
	}
}
