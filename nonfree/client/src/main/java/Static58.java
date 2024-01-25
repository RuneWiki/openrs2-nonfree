import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cq", name = "P", descriptor = "I")
	public static int anInt1248;

	@OriginalMember(owner = "client!cq", name = "R", descriptor = "Lclient!md;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!cq", name = "S", descriptor = "I")
	public static int anInt1250;

	@OriginalMember(owner = "client!cq", name = "O", descriptor = "I")
	public static final int anInt1247 = 1;

	@OriginalMember(owner = "client!cq", name = "T", descriptor = "[I")
	public static final int[] anIntArray81 = new int[5];

	@OriginalMember(owner = "client!cq", name = "U", descriptor = "[I")
	public static final int[] anIntArray82 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)V")
	public static void method1058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static7.aFloat38 > Static7.aFloat39) {
			Static7.aFloat39 = (float) ((double) Static7.aFloat39 + (double) Static7.aFloat39 / 30.0D);
			if (Static7.aFloat39 > Static7.aFloat38) {
				Static7.aFloat39 = Static7.aFloat38;
			}
			Static144.method2162();
			Static7.anInt2563 = (int) Static7.aFloat39 >> 1;
			Static7.aByteArrayArrayArray2 = Static248.method3660(Static7.anInt2563);
		} else if (Static7.aFloat38 < Static7.aFloat39) {
			Static7.aFloat39 = (float) ((double) Static7.aFloat39 - (double) Static7.aFloat39 / 30.0D);
			if (Static7.aFloat39 < Static7.aFloat38) {
				Static7.aFloat39 = Static7.aFloat38;
			}
			Static144.method2162();
			Static7.anInt2563 = (int) Static7.aFloat39 >> 1;
			Static7.aByteArrayArrayArray2 = Static248.method3660(Static7.anInt2563);
		}
		if (Static55.anInt1147 != -1 && Static21.anInt465 != -1) {
			@Pc(78) int local78 = Static55.anInt1147 - Static46.anInt865;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(97) int local97 = Static21.anInt465 - Static151.anInt2577;
			if (local97 < 2 || local97 > 2) {
				local97 /= 8;
			}
			Static46.anInt865 -= -local78;
			Static151.anInt2577 -= -local97;
			if (local78 == 0 && local97 == 0) {
				Static21.anInt465 = -1;
				Static55.anInt1147 = -1;
			}
			Static144.method2162();
		}
		if (Static273.anInt4877 <= 0) {
			Static66.anInt1356 = -1;
			Static440.anInt7583 = -1;
		} else {
			Static397.anInt6910--;
			if (Static397.anInt6910 == 0) {
				Static397.anInt6910 = 100;
				Static273.anInt4877--;
			}
		}
		if (!Static40.aBoolean26 || Static67.aClass266_12 == null) {
			return;
		}
		for (@Pc(174) Class1_Sub9 local174 = (Class1_Sub9) Static67.aClass266_12.method6000(); local174 != null; local174 = (Class1_Sub9) Static67.aClass266_12.method5994()) {
			@Pc(183) Class231 local183 = Static7.aClass224_3.method5302(local174.aClass1_Sub28_1.anInt4274);
			if (local174.method1500(arg0, arg1)) {
				if (local183.aStringArray52 != null) {
					if (local183.aStringArray52[4] != null) {
						Static423.method5681(local183.anInt6858, 0, (long) local174.aClass1_Sub28_1.anInt4274, 1002, -1, -1, false, local183.aString53, local183.aStringArray52[4], true);
					}
					if (local183.aStringArray52[3] != null) {
						Static423.method5681(local183.anInt6858, 0, (long) local174.aClass1_Sub28_1.anInt4274, 1006, -1, -1, false, local183.aString53, local183.aStringArray52[3], true);
					}
					if (local183.aStringArray52[2] != null) {
						Static423.method5681(local183.anInt6858, 0, (long) local174.aClass1_Sub28_1.anInt4274, 1007, -1, -1, false, local183.aString53, local183.aStringArray52[2], true);
					}
					if (local183.aStringArray52[1] != null) {
						Static423.method5681(local183.anInt6858, 0, (long) local174.aClass1_Sub28_1.anInt4274, 1001, -1, -1, false, local183.aString53, local183.aStringArray52[1], true);
					}
					if (local183.aStringArray52[0] != null) {
						Static423.method5681(local183.anInt6858, 0, (long) local174.aClass1_Sub28_1.anInt4274, 1004, -1, -1, false, local183.aString53, local183.aStringArray52[0], true);
					}
				}
				if (!local174.aClass1_Sub28_1.aBoolean284) {
					local174.aClass1_Sub28_1.aBoolean284 = true;
					Static104.method1600(Static302.aClass190_7, local174.aClass1_Sub28_1.anInt4274, local183.anInt6858);
				}
				if (local174.aClass1_Sub28_1.aBoolean284) {
					Static104.method1600(Static414.aClass190_8, local174.aClass1_Sub28_1.anInt4274, local183.anInt6858);
				}
			} else if (local174.aClass1_Sub28_1.aBoolean284) {
				local174.aClass1_Sub28_1.aBoolean284 = false;
				Static104.method1600(Static75.aClass190_5, local174.aClass1_Sub28_1.anInt4274, local183.anInt6858);
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/Object;Lclient!kj;I)V")
	public static void method1059(@OriginalArg(0) Object arg0, @OriginalArg(1) Class138 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg1.anEventQueue1.peekEvent() != null; local15++) {
			Static67.method1189(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
