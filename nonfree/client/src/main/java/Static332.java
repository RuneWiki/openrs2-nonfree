import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "Z")
	public static boolean aBoolean372;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
	public static int anInt5256;

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	public static int anInt5258 = -60;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Z")
	public static boolean aBoolean373 = false;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
	public static int anInt5259 = 0;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
	public static void method4473() {
		@Pc(10) int local10 = 0;
		if (Static234.aClass2_Sub5_48 != null) {
			local10 = Static234.aClass2_Sub5_48.aClass6_Sub5_1.method2473();
		}
		@Pc(32) int local32;
		@Pc(47) int local47;
		if (local10 == 2) {
			local32 = Static550.anInt9024 > 800 ? 800 : Static550.anInt9024;
			Static394.anInt6214 = (Static550.anInt9024 - local32) / 2;
			local47 = Static236.anInt3828 <= 600 ? Static236.anInt3828 : 600;
			Static511.anInt8548 = local32;
			Static153.anInt2747 = local47;
			Static223.anInt3639 = 0;
		} else if (local10 == 1) {
			local32 = Static550.anInt9024 > 1024 ? 1024 : Static550.anInt9024;
			Static394.anInt6214 = (Static550.anInt9024 - local32) / 2;
			local47 = Static236.anInt3828 > 768 ? 768 : Static236.anInt3828;
			Static511.anInt8548 = local32;
			Static223.anInt3639 = 0;
			Static153.anInt2747 = local47;
		} else {
			Static223.anInt3639 = 0;
			Static394.anInt6214 = 0;
			Static153.anInt2747 = Static236.anInt3828;
			Static511.anInt8548 = Static550.anInt9024;
		}
	}
}
