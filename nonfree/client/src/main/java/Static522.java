import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!oh;")
	public static Class237 aClass237_126;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_125 = new Class71(118, 0);

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Lclient!hp;")
	public static Class136 aClass136_1 = new Class136(8);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public static void method7444() {
		Static508.aClass331Array1 = null;
		if (Static513.aBoolean642 && Static383.method6158() != 1) {
			Static365.method5686(0, Static638.method8600(), 0, Static525.method7462(), Static435.anInt8191 == 3 || Static435.anInt8191 == 7);
		}
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		if (Static513.aBoolean642) {
			local34 = Static550.method8313();
			local36 = Static530.method7484();
		}
		Static144.method3010(-1, local36, Static212.anInt4965, local34, local34, local36, local36 + Static313.anInt6355, local34 + Static235.anInt5298);
		if (Static508.aClass331Array1 != null) {
			Static446.method6493(local34, Static384.anInt7467, Static235.anInt5298 + local34, true, local36 + Static313.anInt6355, Static514.aClass331_15.anInt9502, local36, Static134.anInt3555, -1412584499, Static508.aClass331Array1);
			Static508.aClass331Array1 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
	public static void method7445(@OriginalArg(1) int arg0) {
		@Pc(16) Class8_Sub5_Sub8 local16 = Static509.method7344(4, arg0);
		local16.method3512();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!rr;Lclient!fba;II)V")
	public static void method7447(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) int arg2) {
		if (Static55.anInt1863 >= 50 || (arg1 == null || arg1.anIntArrayArray13 == null || arg2 >= arg1.anIntArrayArray13.length || arg1.anIntArrayArray13[arg2] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray13[arg2][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg1.anIntArrayArray13[arg2].length > 1) {
			local65 = (int) (Math.random() * (double) arg1.anIntArrayArray13[arg2].length);
			if (local65 > 0) {
				local38 = arg1.anIntArrayArray13[arg2][local65];
			}
		}
		local65 = 256;
		if (arg1.anIntArray183 != null && arg1.anIntArray181 != null) {
			local65 = arg1.anIntArray183[arg2] + (int) ((double) (arg1.anIntArray181[arg2] - arg1.anIntArray183[arg2]) * Math.random());
		}
		@Pc(115) int local115 = arg1.anIntArray185 == null ? 255 : arg1.anIntArray185[arg2];
		if (local48 == 0) {
			if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 == arg0) {
				if (!arg1.aBoolean265) {
					Static143.method2988(local65, local44, local38, local115, 0);
					return;
				}
				Static343.method5470(0, false, local44, local65, local38, local115);
			}
		} else if (Static155.aClass8_Sub25_6.aClass36_Sub6_5.method3331() != 0) {
			@Pc(156) int local156 = arg0.anInt10301 - 256 >> 9;
			@Pc(163) int local163 = arg0.anInt10298 - 256 >> 9;
			@Pc(183) int local183 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 == arg0 ? 0 : (local163 << 8) + (local156 << 16) + (arg0.aByte124 << 24) + local48;
			Static63.aClass230Array1[Static55.anInt1863++] = new Class230((byte) (arg1.aBoolean265 ? 2 : 1), local38, local44, 0, local115, local183, local65, arg0);
		}
	}
}
