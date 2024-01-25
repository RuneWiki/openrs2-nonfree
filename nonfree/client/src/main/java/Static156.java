import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!gf", name = "ch", descriptor = "Lclient!sd;")
	public static Class267 aClass267_14 = new Class267(8);

	@OriginalMember(owner = "client!gf", name = "Kh", descriptor = "[I")
	public static final int[] anIntArray362 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gf", name = "Lh", descriptor = "Lclient!db;")
	public static final Class57 aClass57_3 = new Class57(6, 0, 4, 2);

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "(B)V")
	public static void method3089() {
		if (Static103.anInt2281 <= 0) {
			Static27.aString7 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Static305.aStringArray37.length; local7++) {
			if (Static305.aStringArray37[local7].startsWith("--> ")) {
				local5++;
				if (Static103.anInt2281 == local5) {
					Static27.aString7 = Static305.aStringArray37[local7].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIII)I")
	public static int method3090(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		}
		@Pc(22) int local22 = 128 - arg1;
		@Pc(36) int local36 = arg1 * (arg2 & 0x7F) + (arg0 & 0x7F) * local22 >> 7;
		@Pc(50) int local50 = arg1 * (arg2 & 0x380) + local22 * (arg0 & 0x380) >> 7;
		@Pc(64) int local64 = local22 * (arg0 & 0xFC00) + arg1 * (arg2 & 0xFC00) >> 7;
		return local64 & 0xFC00 | local50 & 0x380 | local36 & 0x7F;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3091(@OriginalArg(1) String arg0) {
		if (!Static506.aBoolean659) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static235.anInt2721;
		@Pc(20) int[] local20 = Static130.anIntArray267;
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			@Pc(30) Class6_Sub1_Sub2_Sub1 local30 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local20[local22]];
			if (local30 != null && Static111.aClass6_Sub1_Sub2_Sub1_3 != local30 && local30.aString27 != null && local30.aString27.equalsIgnoreCase(arg0)) {
				Static278.method4791(Static464.aClass158_112);
				Static515.aClass3_Sub27_Sub1_2.method7606(Static113.anInt2478);
				Static515.aClass3_Sub27_Sub1_2.method7594(Static448.anInt8198);
				Static515.aClass3_Sub27_Sub1_2.method7576(0);
				Static515.aClass3_Sub27_Sub1_2.method7600(local20[local22], 30364);
				Static515.aClass3_Sub27_Sub1_2.method7587(Static508.anInt8865);
				local10 = true;
				Static501.method7220(local30.anIntArray733[0], local30.method7083(), true, 0, -2, local30.method7083(), 0, local30.anIntArray734[0]);
				break;
			}
		}
		if (!local10) {
			Static356.method5583(Static282.aClass67_87.method1934(Static193.anInt7803) + arg0);
		}
		if (Static506.aBoolean659) {
			Static320.method5152();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z")
	public static boolean method3092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static168.method3214(arg0, arg1) || Static104.method2057(arg1, arg0);
	}
}
