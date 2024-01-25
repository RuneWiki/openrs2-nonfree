import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array26;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_239 = new Class175("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(JI)V")
	public static void method5696(@OriginalArg(0) long arg0) {
		@Pc(15) int local15 = Static330.anInt6009 + Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053;
		@Pc(20) int local20 = Static444.anInt7529 + Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055;
		if (Static288.anInt5279 - local15 < -500 || Static288.anInt5279 - local15 > 500 || Static334.anInt6158 - local20 < -500 || Static334.anInt6158 - local20 > 500) {
			Static334.anInt6158 = local20;
			Static288.anInt5279 = local15;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (Static288.anInt5279 != local15) {
			local66 = local15 - Static288.anInt5279;
			local74 = (int) (arg0 * (long) local66 / 320L);
			if (local66 > 0) {
				if (local74 == 0) {
					local74 = 1;
				} else if (local66 < local74) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = -1;
			} else if (local66 > local74) {
				local74 = local66;
			}
			Static288.anInt5279 += local74;
		}
		if (!Static123.aClass21_Sub1_1.aBoolean72) {
			Static265.aFloat64 += Static15.aFloat3 * (float) arg0 / 6.0F;
			Static235.aFloat60 += Static393.aFloat92 * (float) arg0 / 6.0F;
		}
		if (local20 != Static334.anInt6158) {
			local66 = local20 - Static334.anInt6158;
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
			Static334.anInt6158 += local74;
		}
		Static338.method1150();
	}
}
