import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
	public static int anInt2917;

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
	public static int anInt2927;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	public static int anInt2905 = 0;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1263 = Static119.method1462("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1264 = Static119.method1462("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
	public static final int anInt2919 = 5063219;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1265 = Static119.method1462("Lade Sprites )2 ");

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1266 = Static119.method1462(":assistreq:");

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1267 = Static119.method1462("Unable to find ");

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1268 = aClass65_1267;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lclient!pe;")
	public static Class65 method2039(@OriginalArg(1) int arg0) {
		return Static35.method647(new Class65[] { Static120.method1871(arg0 >> 24 & 0xFF), Static66.aClass65_673, Static120.method1871(arg0 >> 16 & 0xFF), Static66.aClass65_673, Static120.method1871(arg0 >> 8 & 0xFF), Static66.aClass65_673, Static120.method1871(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public static void method2040() {
		aClass65_1266 = null;
		aClass65_1264 = null;
		aClass65_1267 = null;
		aClass65_1268 = null;
		aClass65_1265 = null;
		aClass65_1263 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
	public static void method2041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static14.anInt351 == 1) {
			Static69.aClass2_Sub1_Sub4_Sub1Array7[Static14.anInt355 / 100].method461(Static49.anInt1206 - 8, Static97.anInt2215 + -8);
		}
		if (Static14.anInt351 == 2) {
			Static69.aClass2_Sub1_Sub4_Sub1Array7[Static14.anInt355 / 100 + 4].method461(Static49.anInt1206 - 8, Static97.anInt2215 + -8);
		}
		Static53.method886();
		if (!Static114.aBoolean102) {
			return;
		}
		@Pc(48) int local48 = arg0 + 20;
		@Pc(54) int local54 = arg2 + 512 - 5;
		Static127.aClass2_Sub1_Sub4_Sub3_Sub1_4.method2095(Static35.method647(new Class65[] { Static17.aClass65_136, Static120.method1871(Static103.anInt2349) }), local54, local48, 16776960, -1);
		@Pc(75) int local75 = local48 + 15;
		@Pc(77) Runtime local77 = Runtime.getRuntime();
		@Pc(86) int local86 = (int) ((local77.totalMemory() - local77.freeMemory()) / 1024L);
		@Pc(88) int local88 = 16776960;
		if (local86 > 32768 && Static48.aBoolean47) {
			local88 = 16711680;
		}
		if (local86 > 65536 && !Static48.aBoolean47) {
			local88 = 16711680;
		}
		Static127.aClass2_Sub1_Sub4_Sub3_Sub1_4.method2095(Static35.method647(new Class65[] { Static77.aClass65_738, Static120.method1871(local86), Static53.aClass65_555 }), local54, local75, local88, -1);
		local48 = local75 + 15;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lclient!pe;")
	public static Class65 method2042(@OriginalArg(1) int arg0) {
		@Pc(12) Class65 local12 = new Class65();
		local12.aByteArray27 = new byte[arg0];
		local12.anInt2005 = 0;
		return local12;
	}
}
