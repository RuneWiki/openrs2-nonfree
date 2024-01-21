import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	public static int anInt677 = 0;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!md;")
	public static Class54 aClass54_2 = new Class54(32);

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	public static int anInt691 = 0;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	public static void method481() {
		aClass54_2 = null;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	public static void method484() {
		for (@Pc(3) int local3 = 0; local3 < Static88.anInt2165; local3++) {
			@Pc(9) int local9 = Static90.anIntArray225[local3]--;
			if (Static90.anIntArray225[local3] >= -10) {
				@Pc(82) Class24 local82 = Static146.aClass24Array1[local3];
				if (local82 == null) {
					local82 = Static183.method846(Static65.aClass44_Sub1_8, Static123.anIntArray332[local3], 0);
					if (local82 == null) {
						continue;
					}
					Static90.anIntArray225[local3] += local82.method847();
					Static146.aClass24Array1[local3] = local82;
				}
				if (Static90.anIntArray225[local3] < 0) {
					@Pc(206) int local206;
					if (Static63.anIntArray155[local3] == 0) {
						local206 = Static59.anInt1602;
					} else {
						@Pc(126) int local126 = (Static63.anIntArray155[local3] & 0xFF) * 128;
						@Pc(134) int local134 = Static63.anIntArray155[local3] >> 16 & 0xFF;
						@Pc(144) int local144 = local134 * 128 + 64 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700;
						if (local144 < 0) {
							local144 = -local144;
						}
						@Pc(157) int local157 = Static63.anIntArray155[local3] >> 8 & 0xFF;
						@Pc(166) int local166 = local157 * 128 + 64 - Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711;
						if (local166 < 0) {
							local166 = -local166;
						}
						@Pc(181) int local181 = local144 + local166 - 128;
						if (local126 < local181) {
							Static90.anIntArray225[local3] = -100;
							continue;
						}
						if (local181 < 0) {
							local181 = 0;
						}
						local206 = (local126 - local181) * Static147.anInt3353 / local126;
					}
					if (local206 > 0) {
						@Pc(220) Class3_Sub9_Sub1 local220 = local82.method849().method2837(Static121.aClass41_1);
						@Pc(225) Class3_Sub5_Sub4 local225 = Static189.method2780(local220, local206);
						local225.method2785(Static49.anIntArray126[local3] - 1);
						Static163.aClass3_Sub5_Sub3_2.method2455(local225);
					}
					Static90.anIntArray225[local3] = -100;
				}
			} else {
				Static88.anInt2165--;
				for (@Pc(25) int local25 = local3; local25 < Static88.anInt2165; local25++) {
					Static123.anIntArray332[local25] = Static123.anIntArray332[local25 + 1];
					Static146.aClass24Array1[local25] = Static146.aClass24Array1[local25 + 1];
					Static49.anIntArray126[local25] = Static49.anIntArray126[local25 + 1];
					Static90.anIntArray225[local25] = Static90.anIntArray225[local25 + 1];
					Static63.anIntArray155[local25] = Static63.anIntArray155[local25 + 1];
				}
				local3--;
			}
		}
		if (Static150.aBoolean146 && !Static74.method1246()) {
			if (Static68.anInt1768 != 0 && Static170.anInt3767 != -1) {
				Static40.method845(Static68.anInt1768, 0, Static170.anInt3767, Static53.aClass44_Sub1_5);
			}
			Static150.aBoolean146 = false;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jg;ZI)Lclient!sb;")
	public static Class3_Sub22 method485(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte[] local12 = arg0.method1633(arg1);
		return local12 == null ? null : new Class3_Sub22(local12);
	}
}
