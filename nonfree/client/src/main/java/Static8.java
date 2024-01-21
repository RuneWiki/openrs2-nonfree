import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	public static int anInt228 = 1;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_98 = Static119.method1462(":tradereq:");

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "[Lclient!ve;")
	public static Class82[] aClass82Array1 = new Class82[50];

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_99 = Static119.method1462(" <col=00ff80>");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!na;)V")
	public static void method156(@OriginalArg(1) Class56 arg0) {
		Static14.aClass56_7 = arg0;
		Static86.anInt1845 = Static14.aClass56_7.method1678(16);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
	public static void method158() {
		aClass65_98 = null;
		aClass82Array1 = null;
		aClass65_99 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)V")
	public static void method159(@OriginalArg(1) boolean arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static110.anInt2469; local5++) {
			@Pc(15) Class2_Sub1_Sub1_Sub4_Sub2 local15 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static117.anIntArray340[local5]];
			@Pc(24) int local24 = (Static117.anIntArray340[local5] << 14) + 536870912;
			if (local15 != null && local15.method1466() && local15.aClass2_Sub1_Sub12_1.aBoolean81 == arg0 && local15.aClass2_Sub1_Sub12_1.method1562()) {
				@Pc(45) int local45 = local15.anInt1948 >> 7;
				@Pc(50) int local50 = local15.anInt1958 >> 7;
				if (local45 >= 0 && local45 < 104 && local50 >= 0 && local50 < 104) {
					if (local15.anInt1929 == 1 && (local15.anInt1948 & 0x7F) == 64 && (local15.anInt1958 & 0x7F) == 64) {
						if (Static77.anInt1714 == Static50.anIntArrayArray12[local45][local50]) {
							continue;
						}
						Static50.anIntArrayArray12[local45][local50] = Static77.anInt1714;
					}
					if (!local15.aClass2_Sub1_Sub12_1.aBoolean83) {
						local24 += Integer.MIN_VALUE;
					}
					Static124.aClass49_1.method1158(Static59.anInt1479, local15.anInt1948, local15.anInt1958, Static106.method1718(local15.anInt1929 * 64 + local15.anInt1958 - 64, local15.anInt1948 - 64 - -(local15.anInt1929 * 64), Static59.anInt1479), local15.anInt1929 * 64 + 60 - 64, local15, local15.anInt1965, local24, local15.aBoolean78);
				}
			}
		}
	}
}
