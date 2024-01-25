import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!nca", name = "r", descriptor = "Lclient!uea;")
	public static Class326 aClass326_6;

	@OriginalMember(owner = "client!nca", name = "w", descriptor = "Lclient!gw;")
	public static Class132 aClass132_2;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5245(@OriginalArg(1) String arg0) {
		if (!Static430.aBoolean586 || (Static264.anInt5328 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static57.anInt1513;
		@Pc(21) int[] local21 = Static447.anIntArray571;
		for (@Pc(27) int local27 = 0; local27 < local19; local27++) {
			@Pc(35) Class21_Sub1_Sub1_Sub1_Sub2 local35 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local21[local27]];
			if (local35.aString87 != null && local35.aString87.equalsIgnoreCase(arg0) && (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 == local35 && (Static264.anInt5328 & 0x10) != 0 || local35 != null && (Static264.anInt5328 & 0x8) != 0)) {
				@Pc(68) Class4_Sub39 local68 = Static32.method999(Static402.aClass356_1, Static429.aClass344_76);
				local68.aClass4_Sub13_Sub2_1.method6999(Static569.anInt7644);
				local68.aClass4_Sub13_Sub2_1.method7044(Static231.anInt4893);
				local68.aClass4_Sub13_Sub2_1.method7032(Static286.anInt6126);
				local68.aClass4_Sub13_Sub2_1.method6996(0);
				local68.aClass4_Sub13_Sub2_1.method6999(local21[local27]);
				Static50.method1166(local68);
				local17 = true;
				Static225.method3649(local35.anIntArray207[0], 0, local35.method3339(), local35.method3339(), true, -2, 0, local35.anIntArray206[0]);
				break;
			}
		}
		if (!local17) {
			Static412.method6231(Static223.aClass152_25.method3624(Static142.anInt3088) + arg0);
		}
		if (Static430.aBoolean586) {
			Static263.method4151();
		}
	}
}
