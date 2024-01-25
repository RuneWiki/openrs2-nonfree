import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "F")
	public static float aFloat211;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!k;")
	public static Class168 aClass168_17;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_302 = new Class123(83, 6);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
	public static boolean method7448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
	public static void method7449(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static79.anInt2118 != -1) {
				Static530.method7269(Static79.anInt2118);
			}
			for (@Pc(19) Class3_Sub49 local19 = (Class3_Sub49) Static204.aClass297_16.method6529(); local19 != null; local19 = (Class3_Sub49) Static204.aClass297_16.method6532()) {
				if (!local19.method8129()) {
					local19 = (Class3_Sub49) Static204.aClass297_16.method6529();
					if (local19 == null) {
						break;
					}
				}
				Static46.method1171(true, false, local19);
			}
			Static79.anInt2118 = -1;
			Static204.aClass297_16 = new Class297(8);
			Static50.method1227();
			Static79.anInt2118 = Static93.anInt2348;
			Static542.method7422(false);
			Static246.method3899();
			Static583.method7926(Static79.anInt2118);
		}
		Static262.aBoolean331 = false;
		Static525.aString237 = "";
		Static422.aString202 = "";
		Static238.method3807();
		Static580.anInt10049 = -1;
		Static306.method4607(Static211.anInt8483);
		Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 = new Class25_Sub2_Sub2_Sub5_Sub1();
		Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 = Static535.anInt9341 * 512 / 2;
		Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0] = Static345.anInt6228 / 2;
		Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 = Static345.anInt6228 * 512 / 2;
		Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0] = Static535.anInt9341 / 2;
		Static418.anInt7466 = 0;
		Static407.anInt7345 = 0;
		if (Static188.anInt4080 == 2) {
			Static407.anInt7345 = Static429.anInt7994 << 9;
			Static418.anInt7466 = Static512.anInt8854 << 9;
		} else {
			Static121.method2334();
		}
		Static38.method1056();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)I")
	public static int method7451(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
