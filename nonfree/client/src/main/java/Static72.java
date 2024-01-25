import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public static int anInt1497 = 0;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "[Lclient!me;")
	public static final Class229_Sub1[] aClass229_Sub1Array1 = new Class229_Sub1[37];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!gba;)Z")
	public static boolean method1222(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub22_Sub1 arg1) {
		@Pc(10) int local10 = arg1.method2655(2);
		@Pc(30) int local30;
		@Pc(37) int local37;
		@Pc(110) int local110;
		@Pc(114) int local114;
		@Pc(120) int local120;
		if (local10 == 0) {
			if (arg1.method2655(1) != 0) {
				method1222(arg0, arg1);
			}
			local30 = arg1.method2655(6);
			local37 = arg1.method2655(6);
			@Pc(51) boolean local51 = arg1.method2655(1) == 1;
			if (local51) {
				Static523.anIntArray492[Static66.anInt1360++] = arg0;
			}
			if (Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(74) Class264 local74 = Static120.aClass264Array1[arg0];
			@Pc(82) Class4_Sub2_Sub1_Sub1_Sub1 local82 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[arg0] = new Class4_Sub2_Sub1_Sub1_Sub1();
			local82.anInt1225 = arg0;
			if (Static14.aClass5_Sub22Array1[arg0] != null) {
				local82.method744(Static14.aClass5_Sub22Array1[arg0]);
			}
			local82.method1024(true, local74.anInt7223);
			local82.anInt1272 = local74.anInt7222;
			local110 = local74.anInt7221;
			local114 = local110 >> 28;
			local120 = local110 >> 14 & 0xFF;
			@Pc(124) int local124 = local110 & 0xFF;
			@Pc(133) int local133 = local30 + (local120 << 6) - Static565.anInt9560;
			local82.aBoolean48 = local74.aBoolean516;
			@Pc(146) int local146 = local37 + (local124 << 6) - Static567.anInt9589;
			local82.aByteArray17[0] = Static415.aByteArray72[arg0];
			local82.aByte132 = local82.aByte131 = (byte) local114;
			if (Static23.method285(local133, local146)) {
				local82.aByte131++;
			}
			local82.method742(local133, local146);
			local82.aBoolean46 = false;
			Static120.aClass264Array1[arg0] = null;
			return true;
		} else if (local10 == 1) {
			local30 = arg1.method2655(2);
			local37 = Static120.aClass264Array1[arg0].anInt7221;
			Static120.aClass264Array1[arg0].anInt7221 = ((local30 + (local37 >> 28) & 0x3) << 28) + (local37 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(238) int local238;
			@Pc(243) int local243;
			@Pc(251) int local251;
			if (local10 != 2) {
				local30 = arg1.method2655(18);
				local37 = local30 >> 16;
				local238 = local30 >> 8 & 0xFF;
				local243 = local30 & 0xFF;
				local251 = Static120.aClass264Array1[arg0].anInt7221;
				local110 = (local251 >> 28) + local37 & 0x3;
				local114 = (local251 >> 14) + local238 & 0xFF;
				local120 = local243 + local251 & 0xFF;
				Static120.aClass264Array1[arg0].anInt7221 = local120 + (local110 << 28) + (local114 << 14);
				return false;
			}
			local30 = arg1.method2655(5);
			local37 = local30 >> 3;
			local238 = local30 & 0x7;
			local243 = Static120.aClass264Array1[arg0].anInt7221;
			local251 = local37 + (local243 >> 28) & 0x3;
			local110 = local243 >> 14 & 0xFF;
			local114 = local243 & 0xFF;
			if (local238 == 0) {
				local110--;
				local114--;
			}
			if (local238 == 1) {
				local114--;
			}
			if (local238 == 2) {
				local110++;
				local114--;
			}
			if (local238 == 3) {
				local110--;
			}
			if (local238 == 4) {
				local110++;
			}
			if (local238 == 5) {
				local110--;
				local114++;
			}
			if (local238 == 6) {
				local114++;
			}
			if (local238 == 7) {
				local110++;
				local114++;
			}
			Static120.aClass264Array1[arg0].anInt7221 = (local251 << 28) + (local110 << 14) + local114;
			return false;
		}
	}
}
