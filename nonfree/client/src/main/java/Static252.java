import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mp", name = "w", descriptor = "J")
	public static long aLong54;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "[Lclient!nl;")
	public static final Class4_Sub1_Sub12[] aClass4_Sub1_Sub12Array3 = new Class4_Sub1_Sub12[14];

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "S")
	public static short aShort46 = 256;

	@OriginalMember(owner = "client!mp", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BJ)V")
	public static void method1736(@OriginalArg(1) long arg0) {
		@Pc(15) int local15 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 + Static179.anInt3325;
		@Pc(21) int local21 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 + Static397.anInt6817;
		if (Static156.anInt2980 - local15 < -500 || Static156.anInt2980 - local15 > 500 || Static322.anInt5750 - local21 < -500 || Static322.anInt5750 - local21 > 500) {
			Static156.anInt2980 = local15;
			Static322.anInt5750 = local21;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local15 != Static156.anInt2980) {
			local66 = local15 - Static156.anInt2980;
			local74 = (int) (arg0 * (long) local66 / 320L);
			if (local66 <= 0) {
				if (local74 == 0) {
					local74 = -1;
				} else if (local66 > local74) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = 1;
			} else if (local66 < local74) {
				local74 = local66;
			}
			Static156.anInt2980 += local74;
		}
		if (local21 != Static322.anInt5750) {
			local66 = local21 - Static322.anInt5750;
			local74 = (int) ((long) local66 * arg0 / 320L);
			if (local66 <= 0) {
				if (local74 == 0) {
					local74 = -1;
				} else if (local74 < local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = 1;
			} else if (local66 < local74) {
				local74 = local66;
			}
			Static322.anInt5750 += local74;
		}
		if (!Static126.aClass67_Sub1_1.aBoolean402) {
			Static416.aFloat208 += (float) arg0 * Static311.aFloat155 / 6.0F;
			Static146.aFloat82 += (float) arg0 * Static8.aFloat8 / 6.0F;
		}
		Static449.method5768();
	}
}
