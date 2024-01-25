import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "Lclient!oa;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!hk", name = "N", descriptor = "Lclient!ho;")
	public static Class103 aClass103_2;

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString21 = null;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!at;I)V")
	public static void method2472(@OriginalArg(0) Class7_Sub2_Sub3_Sub1 arg0) {
		for (@Pc(15) Class3_Sub12 local15 = (Class3_Sub12) Static54.aClass243_11.method5208(); local15 != null; local15 = (Class3_Sub12) Static54.aClass243_11.method5203()) {
			if (arg0 == local15.aClass7_Sub2_Sub3_Sub1_1) {
				if (local15.aClass3_Sub5_Sub2_1 != null) {
					Static331.aClass3_Sub5_Sub1_42.method886(local15.aClass3_Sub5_Sub2_1);
					local15.aClass3_Sub5_Sub2_1 = null;
				}
				local15.method5977();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Z")
	public static boolean method2473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static262.method3815(arg1, arg0) || Static40.method776(arg0, arg1);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V")
	public static void method2474(@OriginalArg(0) int arg0) {
		if (Static101.anInt6818 == arg0) {
			return;
		}
		Static40.anInt1089 = Static44.anInt7276 = Static130.anIntArray280[arg0];
		Static242.method3663();
		Static210.anIntArrayArray28 = new int[Static40.anInt1089][Static44.anInt7276];
		Static201.anIntArrayArrayArray6 = new int[4][Static40.anInt1089 >> 3][Static44.anInt7276 >> 3];
		Static36.anIntArrayArray7 = new int[Static40.anInt1089][Static44.anInt7276];
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			Static382.aClass29Array3[local38] = Static89.method1671(Static40.anInt1089, Static44.anInt7276);
		}
		Static229.aByteArrayArrayArray16 = new byte[4][Static40.anInt1089][Static44.anInt7276];
		Static348.method4626(Static44.anInt7276, Static40.anInt1089);
		Static146.method2390(Static121.aClass172_3, Static44.anInt7276 >> 3, Static40.anInt1089 >> 3);
		Static101.anInt6818 = arg0;
	}
}
