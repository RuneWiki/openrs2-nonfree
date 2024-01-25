import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cr", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!cr", name = "R", descriptor = "Lclient!cca;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!cr", name = "L", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V")
	public static void method1669() {
		if (Static355.anInt6648 < 0) {
			return;
		}
		@Pc(11) long local11 = Static76.method1679();
		Static355.anInt6648 = (int) ((long) Static355.anInt6648 + Static119.aLong77 - local11);
		if (Static355.anInt6648 <= 0) {
			Static520.aFloat189 = Static528.aClass240_10.aFloat148;
			Static355.anInt6648 = -1;
			Static425.aFloat178 = Static528.aClass240_10.aFloat152;
			Static436.aFloat179 = Static528.aClass240_10.aFloat149;
			Static9.anInt137 = Static528.aClass240_10.anInt6892;
			Static173.anInt3935 = Static528.aClass240_10.anInt6888;
			Static345.aFloat131 = Static528.aClass240_10.aFloat147;
			Static372.anInt6881 = Static528.aClass240_10.anInt6887;
			Static98.aClass124_1 = Static528.aClass240_10.aClass124_2;
			Static141.aFloat78 = Static528.aClass240_10.aFloat150;
			Static84.aFloat55 = Static528.aClass240_10.aFloat151;
		} else {
			@Pc(65) int local65 = (Static355.anInt6648 << 8) / Static81.anInt1954;
			@Pc(69) int local69 = 255 - local65;
			@Pc(74) float local74 = (float) local65 / 255.0F;
			@Pc(79) float local79 = 1.0F - local74;
			Static9.anInt137 = (local65 * (Static65.anInt1499 & 0xFF00FF) + local69 * (Static528.aClass240_10.anInt6892 & 0xFF00FF) & 0xFF00FF00) + ((Static65.anInt1499 & 0xFF00) * local65 + ((Static528.aClass240_10.anInt6892 & 0xFF00) * local69) & 0xFF0000) >>> 8;
			Static84.aFloat55 = Static384.aFloat173 + (Static528.aClass240_10.aFloat151 - Static384.aFloat173) * local79;
			Static345.aFloat131 = Static414.aFloat177 + (Static528.aClass240_10.aFloat147 - Static414.aFloat177) * local79;
			Static372.anInt6881 = local65 * Static290.anInt5633 + local69 * Static528.aClass240_10.anInt6887 >> 8;
			Static425.aFloat178 = Static235.aFloat185 + (Static528.aClass240_10.aFloat152 - Static235.aFloat185) * local79;
			Static173.anInt3935 = (local69 * (Static528.aClass240_10.anInt6888 & 0xFF00FF) + local65 * (Static162.anInt3762 & 0xFF00FF) & 0xFF00FF00) + (local69 * (Static528.aClass240_10.anInt6888 & 0xFF00) + (Static162.anInt3762 & 0xFF00) * local65 & 0xFF0000) >>> 8;
			Static141.aFloat78 = Static338.aFloat76 + local79 * (Static528.aClass240_10.aFloat150 - Static338.aFloat76);
			Static436.aFloat179 = Static346.aFloat132 + (Static528.aClass240_10.aFloat149 - Static346.aFloat132) * local79;
			Static520.aFloat189 = (Static528.aClass240_10.aFloat148 - Static454.aFloat182) * local79 + Static454.aFloat182;
			if (Static528.aClass240_10.aClass124_2 != Static540.aClass124_4) {
				Static98.aClass124_1 = Static497.aClass42_9.method5805(Static540.aClass124_4, Static528.aClass240_10.aClass124_2, local79, Static98.aClass124_1);
			}
		}
		Static119.aLong77 = local11;
	}
}
