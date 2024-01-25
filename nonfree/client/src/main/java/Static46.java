import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!la;")
	public static Class92 aClass92_2;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[Lclient!tr;")
	public static Class237[] aClass237Array1;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public static int anInt817 = -1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_31 = new Class102(53, 8);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	public static void method669(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static142.anInt2523 != -1) {
				Static184.method2531(Static142.anInt2523);
			}
			for (@Pc(18) Class2_Sub21 local18 = (Class2_Sub21) Static418.aClass72_44.method1655(); local18 != null; local18 = (Class2_Sub21) Static418.aClass72_44.method1649()) {
				if (!local18.method5702()) {
					local18 = (Class2_Sub21) Static418.aClass72_44.method1655();
					if (local18 == null) {
						break;
					}
				}
				Static74.method1091(local18, false, true);
			}
			Static142.anInt2523 = -1;
			Static418.aClass72_44 = new Class72(8);
			Static139.method2048();
			Static142.anInt2523 = Static286.anInt4704;
			Static129.method1930(false);
			Static204.method2721();
			Static191.method2566(Static142.anInt2523);
		}
		Static258.aString121 = "";
		Static427.aString196 = "";
		Static137.aBoolean469 = false;
		Static402.method5077();
		Static96.anInt1855 = -1;
		Static166.method2337(Static82.anInt1523);
		Static60.aClass3_Sub4_Sub1_Sub2_1 = new Class3_Sub4_Sub1_Sub2();
		Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray425[0] = Static166.anInt2852 / 2;
		Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 = Static166.anInt2852 * 128 / 2;
		Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 = Static426.anInt6923 * 128 / 2;
		Static143.anInt2544 = 0;
		Static174.anInt3028 = 0;
		Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray424[0] = Static426.anInt6923 / 2;
		if (Static414.anInt6776 == 2) {
			Static143.anInt2544 = Static434.anInt7014 << 7;
			Static174.anInt3028 = Static247.anInt3992 << 7;
		} else {
			Static223.method5278();
		}
		Static449.method5641();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!fs;Lclient!fs;I)V")
	public static void method670(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		if (arg1.aClass2_Sub5_58 != null) {
			arg1.method5621();
		}
		arg1.aClass2_Sub5_57 = arg0.aClass2_Sub5_57;
		arg1.aClass2_Sub5_58 = arg0;
		arg1.aClass2_Sub5_58.aClass2_Sub5_57 = arg1;
		arg1.aClass2_Sub5_57.aClass2_Sub5_58 = arg1;
	}
}
