import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
	public static int anInt6703;

	@OriginalMember(owner = "client!oda", name = "j", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_118 = new Class286(21, 3);

	@OriginalMember(owner = "client!oda", name = "k", descriptor = "S")
	public static short aShort77 = 32767;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IZ)V")
	public static void method5602(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static554.anInt9121 != -1) {
				Static309.method4628(Static554.anInt9121);
			}
			for (@Pc(15) Class2_Sub44 local15 = (Class2_Sub44) Static217.aClass162_20.method3527(); local15 != null; local15 = (Class2_Sub44) Static217.aClass162_20.method3523()) {
				if (!local15.method7968()) {
					local15 = (Class2_Sub44) Static217.aClass162_20.method3527();
					if (local15 == null) {
						break;
					}
				}
				Static564.method7655(false, true, local15);
			}
			Static554.anInt9121 = -1;
			Static217.aClass162_20 = new Class162(8);
			Static308.method4597();
			Static554.anInt9121 = Static360.anInt6452;
			Static75.method1189(false);
			Static139.method2348();
			Static552.method7488(Static554.anInt9121);
		}
		Static527.aBoolean670 = false;
		Static286.aString44 = "";
		Static392.aString61 = "";
		Static361.method6166();
		Static78.anInt9033 = -1;
		Static13.method5525(Static395.anInt6896);
		Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 = new Class6_Sub1_Sub1_Sub1_Sub2();
		Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 = Static188.anInt3850 * 512 / 2;
		Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0] = Static188.anInt3850 / 2;
		Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 = Static49.anInt1174 * 512 / 2;
		Static7.anInt337 = 0;
		Static90.anInt1932 = 0;
		Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0] = Static49.anInt1174 / 2;
		if (Static311.anInt5570 == 2) {
			Static7.anInt337 = Static529.anInt9415 << 9;
			Static90.anInt1932 = Static400.anInt6972 << 9;
		} else {
			Static145.method2415();
		}
		Static6.method168();
	}
}
