import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "Lclient!jo;")
	public static Class168 aClass168_91;

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
	public static int anInt7230;

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "Lclient!vd;")
	public static final Class328 aClass328_5 = new Class328();

	@OriginalMember(owner = "client!pba", name = "j", descriptor = "S")
	public static short aShort75 = 1;

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(Z)V")
	public static void method6069() {
		if (Static326.anInt6153 < 0) {
			return;
		}
		@Pc(16) long local16 = Static174.method3502();
		Static326.anInt6153 = (int) ((long) Static326.anInt6153 + Static48.aLong191 - local16);
		if (Static326.anInt6153 > 0) {
			@Pc(33) int local33 = (Static326.anInt6153 << 8) / Static215.anInt4569;
			@Pc(37) int local37 = 255 - local33;
			@Pc(42) float local42 = (float) local33 / 255.0F;
			Static203.anInt4356 = ((Static275.aClass348_1.anInt9712 & 0xFF00FF) * local37 + local33 * (Static43.anInt1258 & 0xFF00FF) & 0xFF00FF00) + ((Static275.aClass348_1.anInt9712 & 0xFF00) * local37 + local33 * (Static43.anInt1258 & 0xFF00) & 0xFF0000) >>> 8;
			@Pc(79) float local79 = 1.0F - local42;
			Static243.aFloat114 = Static501.aFloat116 + local79 * (Static275.aClass348_1.aFloat199 - Static501.aFloat116);
			Static581.anInt9824 = local33 * Static557.anInt9494 + Static275.aClass348_1.anInt9717 * local37 >> 8;
			Static161.aFloat92 = (Static275.aClass348_1.aFloat202 - Static316.aFloat125) * local79 + Static316.aFloat125;
			Static243.aFloat113 = Static431.aFloat176 + (Static275.aClass348_1.aFloat201 - Static431.aFloat176) * local79;
			Static263.anInt5267 = (local37 * (Static275.aClass348_1.anInt9715 & 0xFF00) + local33 * (Static535.anInt9246 & 0xFF00) & 0xFF0000) + (local33 * (Static535.anInt9246 & 0xFF00FF) + local37 * (Static275.aClass348_1.anInt9715 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static397.aFloat174 = Static352.aFloat152 + (Static275.aClass348_1.aFloat198 - Static352.aFloat152) * local79;
			Static294.aFloat122 = Static321.aFloat128 + local79 * (Static275.aClass348_1.aFloat200 - Static321.aFloat128);
			Static552.aFloat183 = local79 * (Static275.aClass348_1.aFloat203 - Static42.aFloat40) + Static42.aFloat40;
			if (Static275.aClass348_1.aClass65_139 != Static331.aClass65_142) {
				Static93.aClass65_29 = Static101.aClass9_4.method5402(Static331.aClass65_142, Static275.aClass348_1.aClass65_139, local79, Static93.aClass65_29);
			}
		} else {
			Static243.aFloat114 = Static275.aClass348_1.aFloat199;
			Static243.aFloat113 = Static275.aClass348_1.aFloat201;
			Static397.aFloat174 = Static275.aClass348_1.aFloat198;
			Static161.aFloat92 = Static275.aClass348_1.aFloat202;
			Static263.anInt5267 = Static275.aClass348_1.anInt9715;
			Static294.aFloat122 = Static275.aClass348_1.aFloat200;
			Static552.aFloat183 = Static275.aClass348_1.aFloat203;
			Static93.aClass65_29 = Static275.aClass348_1.aClass65_139;
			Static581.anInt9824 = Static275.aClass348_1.anInt9717;
			Static326.anInt6153 = -1;
			Static203.anInt4356 = Static275.aClass348_1.anInt9712;
		}
		Static48.aLong191 = local16;
	}
}
