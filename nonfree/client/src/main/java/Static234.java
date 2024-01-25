import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
	public static int anInt4321 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method3455() {
		Static100.aClass207_7.method4392();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method3456(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static549.anInt9183; local11++) {
			if (arg0.equalsIgnoreCase(Static433.aStringArray15[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static593.aStringArray42[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIILclient!r;)V")
	public static void method3458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class78 arg4) {
		arg4.da(arg2, arg1, arg2 + arg3, arg0 + arg1);
		arg4.method6800(-16777216, arg0, arg2, arg3, arg1);
		if (Static142.anInt2752 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static287.anInt3863 / (float) Static287.anInt3861;
		@Pc(36) int local36 = arg3;
		@Pc(38) int local38 = arg0;
		if (local34 < 1.0F) {
			local38 = (int) (local34 * (float) arg3);
		} else {
			local36 = (int) ((float) arg0 / local34);
		}
		@Pc(65) int local65 = arg2 + (arg3 - local36) / 2;
		@Pc(73) int local73 = arg1 + (arg0 - local38) / 2;
		if (Static426.aClass5_32 == null || Static426.aClass5_32.E() != arg3 || arg0 != Static426.aClass5_32.u()) {
			Static287.method3142(Static287.anInt3859, Static287.anInt3862 + Static287.anInt3863, Static287.anInt3859 - -Static287.anInt3861, Static287.anInt3862, local65, local73, local65 + local36, local38 + local73);
			Static287.method3149(arg4);
			Static426.aClass5_32 = arg4.method6823(local65, local73, local36, local38, false);
		}
		Static426.aClass5_32.method7795(local65, local73);
		@Pc(126) int local126 = Static141.anInt2742 * local36 / Static287.anInt3861;
		@Pc(132) int local132 = Static401.anInt7185 * local38 / Static287.anInt3863;
		@Pc(140) int local140 = local36 * Static160.anInt3053 / Static287.anInt3861 + local65;
		@Pc(154) int local154 = local73 + local38 - local132 - local38 * Static130.anInt2589 / Static287.anInt3863;
		@Pc(156) int local156 = -1996554240;
		if (Static101.aClass42_1 == Static110.aClass42_2) {
			local156 = -1996488705;
		}
		arg4.J(local140, local154, local126, local132, local156, 1);
		arg4.method6778(local140, local154, local126, local132, local156, 0);
		if (Static413.anInt7319 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static24.anInt582 > 50) {
			local193 = (100 - Static24.anInt582) * 5;
		} else {
			local193 = Static24.anInt582 * 5;
		}
		for (@Pc(204) Class1_Sub51 local204 = (Class1_Sub51) Static287.aClass111_18.method2547(); local204 != null; local204 = (Class1_Sub51) Static287.aClass111_18.method2554()) {
			@Pc(212) Class345 local212 = Static287.aClass113_3.method2595(local204.anInt9675);
			if (Static119.method2166(local212)) {
				@Pc(234) int local234;
				@Pc(246) int local246;
				if (Static514.anInt8865 == local204.anInt9675) {
					local234 = local65 + local204.anInt9680 * local36 / Static287.anInt3861;
					local246 = local73 + local38 * (Static287.anInt3863 - local204.anInt9679) / Static287.anInt3863;
					arg4.method6800(local193 << 24 | 0xFFFF00, 4, local234 - 2, 4, local246 - 2);
				} else if (Static69.anInt1339 != -1 && Static69.anInt1339 == local212.anInt9198) {
					local234 = local65 + local36 * local204.anInt9680 / Static287.anInt3861;
					local246 = local73 + local38 * (Static287.anInt3863 - local204.anInt9679) / Static287.anInt3863;
					arg4.method6800(local193 << 24 | 0xFFFF00, 4, local234 - 2, 4, local246 - 2);
				}
			}
		}
	}
}
