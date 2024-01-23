import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!kn", name = "Q", descriptor = "Lclient!mo;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!kn", name = "R", descriptor = "I")
	public static int anInt2980;

	@OriginalMember(owner = "client!kn", name = "V", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!kn", name = "W", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!kn", name = "X", descriptor = "Lclient!ph;")
	public static Class138 aClass138_45;

	@OriginalMember(owner = "client!kn", name = "ab", descriptor = "Lclient!qf;")
	public static Class146 aClass146_10;

	@OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
	public static int anInt2977 = 0;

	@OriginalMember(owner = "client!kn", name = "T", descriptor = "[I")
	public static int[] anIntArray241 = new int[32];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!ph;B)V")
	public static void method2387(@OriginalArg(0) Class138 arg0) {
		Static292.aClass138_83 = arg0;
	}

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)V")
	public static void method2388() {
		@Pc(4) Class176 local4 = Static154.aClass176_1;
		synchronized (Static154.aClass176_1) {
			Static299.anInt5671 = Static110.anInt2187;
			Static178.anInt3583++;
			@Pc(29) int local29;
			if (Static304.anInt5750 >= 0) {
				while (Static304.anInt5750 != Static199.anInt4010) {
					local29 = Static240.anIntArray107[Static199.anInt4010];
					Static199.anInt4010 = Static199.anInt4010 + 1 & 0x7F;
					if (local29 < 0) {
						Static88.aBooleanArray16[~local29] = false;
					} else {
						Static88.aBooleanArray16[local29] = true;
					}
				}
			} else {
				for (local29 = 0; local29 < 112; local29++) {
					Static88.aBooleanArray16[local29] = false;
				}
				Static304.anInt5750 = Static199.anInt4010;
			}
			Static110.anInt2187 = Static79.anInt1470;
		}
	}
}
