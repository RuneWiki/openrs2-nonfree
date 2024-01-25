import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ef", name = "sb", descriptor = "Lclient!ha;")
	public static Class35 aClass35_16;

	@OriginalMember(owner = "client!ef", name = "zb", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_26 = new Class243(60, -1);

	@OriginalMember(owner = "client!ef", name = "Cb", descriptor = "[Lclient!ko;")
	public static final Class164_Sub1[] aClass164_Sub1Array1 = new Class164_Sub1[32];

	@OriginalMember(owner = "client!ef", name = "Db", descriptor = "[I")
	public static final int[] anIntArray222 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!dda;I)Lclient!dd;")
	public static Class52 method2062(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1) {
		@Pc(16) byte[] local16 = arg1.method1599(arg0);
		return local16 == null ? null : new Class52(local16);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILclient!wca;)V")
	public static void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class310 arg2) {
		if (Static21.aBoolean31) {
			@Pc(21) Class73 local21 = Static74.anInt1557 == -1 ? null : Static66.aClass247_1.method6470(Static74.anInt1557);
			if (Static67.method1257(arg2).method6271() && (Static176.anInt3294 & 0x20) != 0) {
				if (local21 == null || arg2.method7642(local21.anInt2133, Static74.anInt1557) != local21.anInt2133) {
					Static111.method2154(0L, arg2.anInt9224, 15, arg2.anInt9226, true, Static131.aString66, arg2.anInt9170, Static125.aString61 + " -> " + arg2.aString203, Static472.anInt8248, false);
				}
				return;
			}
			return;
		}
		@Pc(87) String local87;
		for (@Pc(80) int local80 = 9; local80 >= 5; local80--) {
			local87 = Static124.method2363(local80, arg2);
			if (local87 != null) {
				Static111.method2154((long) (local80 + 1), arg2.anInt9224, 1001, arg2.anInt9226, true, local87, arg2.anInt9170, arg2.aString203, Static519.method7539(arg2, local80), false);
			}
		}
		local87 = Static331.method5295(arg2);
		if (local87 != null) {
			Static111.method2154(0L, arg2.anInt9224, 18, arg2.anInt9226, true, local87, arg2.anInt9170, arg2.aString203, arg2.anInt9180, false);
		}
		for (@Pc(150) int local150 = 4; local150 >= 0; local150--) {
			@Pc(157) String local157 = Static124.method2363(local150, arg2);
			if (local157 != null) {
				Static111.method2154((long) (local150 + 1), arg2.anInt9224, 2, arg2.anInt9226, true, local157, arg2.anInt9170, arg2.aString203, Static519.method7539(arg2, local150), false);
			}
		}
		if (!Static67.method1257(arg2).method6275()) {
			return;
		}
		if (arg2.aString207 != null) {
			Static111.method2154(0L, arg2.anInt9224, 13, arg2.anInt9226, true, arg2.aString207, arg2.anInt9170, "", -1, false);
			return;
		}
		Static111.method2154(0L, arg2.anInt9224, 13, arg2.anInt9226, true, Static461.aClass202_234.method5139(Static172.anInt6352), arg2.anInt9170, "", -1, false);
	}
}
