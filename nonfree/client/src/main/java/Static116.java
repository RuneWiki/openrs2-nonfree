import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
	public static int anInt2535;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_884 = Static151.method2243("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZLclient!pb;Lclient!pb;Z)V")
	public static void method1782(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) Class71 arg2, @OriginalArg(4) boolean arg3) {
		Static175.aClass71_34 = arg2;
		Static27.aClass71_6 = arg1;
		Static203.aBoolean185 = arg0;
		Static1.aBoolean6 = arg3;
		Static37.aClass79_3 = new Class79(30);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	public static void method1784() {
		Static208.aClass53_24.method1649();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
	public static void method1787() {
		if (Static136.aDouble113 < Static47.aDouble31) {
			Static136.aDouble113 += Static136.aDouble113 / 30.0D;
			if (Static136.aDouble113 > Static47.aDouble31) {
				Static136.aDouble113 = Static47.aDouble31;
			}
			Static26.method2655();
		} else if (Static136.aDouble113 > Static47.aDouble31) {
			Static136.aDouble113 -= Static136.aDouble113 / 30.0D;
			if (Static136.aDouble113 < Static47.aDouble31) {
				Static136.aDouble113 = Static47.aDouble31;
			}
			Static26.method2655();
		}
		if (Static176.anInt3717 == -1 || Static186.anInt3885 == -1) {
			return;
		}
		@Pc(53) int local53 = Static176.anInt3717 - Static142.anInt3025;
		if (local53 < 2 || local53 > 2) {
			local53 >>= 0x4;
		}
		@Pc(70) int local70 = Static186.anInt3885 - Static50.anInt1085;
		Static142.anInt3025 -= -local53;
		if (local70 < 2 || local70 > 2) {
			local70 >>= 0x4;
		}
		if (local53 == 0 && local70 == 0) {
			Static186.anInt3885 = -1;
			Static176.anInt3717 = -1;
		}
		Static50.anInt1085 += local70;
		Static26.method2655();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
	public static void method1788() {
		Static42.aClass2_Sub1_Sub2_Sub1_8.method271(0, 0);
		Static99.aClass2_Sub1_Sub2_Sub1_7.method271(382, 0);
		Static159.aClass42_4.method2468(382 - Static159.aClass42_4.anInt3594 / 2, 18);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z")
	public static boolean method1789(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZZBZI)Lclient!oc;")
	public static Class71_Sub1 method1790(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class98 local12 = null;
		if (Static64.aClass9_1 != null) {
			local12 = new Class98(arg3, Static64.aClass9_1, Static111.aClass9Array1[arg3], 1000000);
		}
		return new Class71_Sub1(local12, Static121.aClass98_1, arg3, arg1, arg2, arg0);
	}
}
