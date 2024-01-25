import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
	public static int anInt5592;

	@OriginalMember(owner = "client!mk", name = "K", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_127 = new Class40(103, 5);

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!cga;IIII)V")
	public static void method4821(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static114.method1781(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static80.anInt1391) {
			Static114.method1781(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static114.method1781(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static164.anInt2881) {
			Static114.method1781(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static164.anInt2881) {
			Static114.method1781(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static80.anInt1391 && arg4 <= Static164.anInt2881) {
			Static114.method1781(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static114.method1781(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static80.anInt1391 && arg4 > 0) {
			Static114.method1781(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)V")
	public static void method4822() {
		if (Static457.aBoolean261) {
			return;
		}
		if (Static480.aClass6_Sub37_Sub1_1.aBoolean412) {
			Static475.aFloat174 = (int) Static475.aFloat174 - 17 & 0xFFFFFFF0;
		} else {
			Static212.aFloat48 += (-Static212.aFloat48 - 12.0F) / 2.0F;
		}
		Static457.aBoolean261 = true;
		Static244.aBoolean263 = true;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)V")
	public static void method4824() {
		@Pc(7) int local7 = Static199.anInt3448;
		@Pc(9) int[] local9 = Static272.anIntArray443;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class29_Sub2_Sub1_Sub2 local19 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null) {
				Static510.method6879(local19.method7008(), local19);
			}
		}
	}
}
