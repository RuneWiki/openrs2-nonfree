import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
	public static int anInt4434;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "F")
	public static float aFloat138;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "[I")
	public static int[] anIntArray298 = new int[1];

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIZ)V")
	public static void method3474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static177.anInt2973 == 0) {
			Static33.method633(false);
		} else {
			Static320.anInt5660 = Static177.anInt2973;
			Static239.method3551(0);
		}
		Static80.anInt1620 = arg1;
		Static303.anInt5361 = arg0;
		Static58.aBoolean98 = arg3;
		Static148.method4492(arg2);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	public static void method3475() {
		@Pc(17) Class4_Sub5 local17 = (Class4_Sub5) Static413.aClass183_47.method4140();
		@Pc(28) boolean local28 = Static281.aClass247_12 != null || Static64.anInt1367 > 0;
		if (local28) {
			Static194.anInt3685 = 1;
		}
		if (Static434.aBoolean692 && Static384.aClass244_1.method5489(81) && Static407.anInt6710 > 2) {
			if (local28) {
				Static413.aClass4_Sub39_2 = (Class4_Sub39) Static206.aClass183_28.aClass4_207.aClass4_261.aClass4_261;
			} else {
				Static247.method3617(local17.method519(), (Class4_Sub39) Static206.aClass183_28.aClass4_207.aClass4_261.aClass4_261, local17.method518());
			}
		} else if (local28) {
			Static413.aClass4_Sub39_2 = (Class4_Sub39) Static206.aClass183_28.aClass4_207.aClass4_261;
		} else {
			Static247.method3617(local17.method519(), (Class4_Sub39) Static206.aClass183_28.aClass4_207.aClass4_261, local17.method518());
		}
	}
}
