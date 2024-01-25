import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "Lclient!gba;")
	public static Class115 aClass115_13 = null;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	public static void method6136() {
		Static508.aClass124_59.method3265();
		Static465.anInt7842 = 0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(FIBFF)F")
	public static float method6137(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static137.aFloatArrayArray11[arg1];
		return arg2 * local12[2] + arg0 * local12[0] + arg3 * local12[1];
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method6139(@OriginalArg(1) String arg0) {
		if (!Static524.aBoolean617 || (Static360.anInt6361 & 0x18) == 0) {
			return;
		}
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = Static272.anInt5182;
		@Pc(25) int[] local25 = Static362.anIntArray519;
		for (@Pc(27) int local27 = 0; local27 < local23; local27++) {
			@Pc(35) Class10_Sub1_Sub2_Sub2 local35 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local25[local27]];
			if (local35.aString93 != null && local35.aString93.equalsIgnoreCase(arg0) && (Static129.aClass10_Sub1_Sub2_Sub2_1 == local35 && (Static360.anInt6361 & 0x10) != 0 || local35 != null && (Static360.anInt6361 & 0x8) != 0)) {
				@Pc(71) Class4_Sub41 local71 = Static128.method2707(Static327.aClass61_120, Class16_Sub3.lb);
				local71.aClass4_Sub9_Sub1_3.method6011(local25[local27]);
				local71.aClass4_Sub9_Sub1_3.method6002(Static143.anInt3245);
				local71.aClass4_Sub9_Sub1_3.method6002(Static209.anInt9662);
				local71.aClass4_Sub9_Sub1_3.method5970(0);
				local71.aClass4_Sub9_Sub1_3.method5963(Static539.anInt9099);
				Static551.method7603(local71);
				local21 = true;
				Static292.method4577(local35.method7021(), true, 0, local35.method7021(), local35.anIntArray654[0], local35.anIntArray653[0], 0, -2);
				break;
			}
		}
		if (!local21) {
			Static160.method3167(Static275.aClass198_20.method4407(Static56.anInt953) + arg0);
		}
		if (Static524.aBoolean617) {
			Static400.method5802();
		}
	}
}
