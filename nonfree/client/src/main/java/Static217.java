import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!km", name = "v", descriptor = "I")
	public static int anInt1119 = -50;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "[Lclient!mh;")
	public static final Class1_Sub3_Sub14[] aClass1_Sub3_Sub14Array2 = new Class1_Sub3_Sub14[14];

	@OriginalMember(owner = "client!km", name = "y", descriptor = "[I")
	public static final int[] anIntArray122 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!km", name = "z", descriptor = "[I")
	public static final int[] anIntArray123 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
	public static void method986() {
		for (@Pc(7) int local7 = 0; local7 < Static383.anInt6137; local7++) {
			@Pc(13) int local13 = Static111.anIntArray154[local7];
			@Pc(21) Class11_Sub1_Sub3_Sub1 local21 = ((Class1_Sub44) Static46.aClass208_33.method4405((long) local13)).aClass11_Sub1_Sub3_Sub1_2;
			@Pc(25) int local25 = Static413.aClass1_Sub19_Sub2_1.method2915();
			if ((local25 & 0x10) != 0) {
				local25 += Static413.aClass1_Sub19_Sub2_1.method2915() << 8;
			}
			if ((local25 & 0x800) != 0) {
				local21.anInt3291 = Static413.aClass1_Sub19_Sub2_1.method2910();
				local21.anInt3329 = Static413.aClass1_Sub19_Sub2_1.method2910();
				local21.anInt3306 = Static413.aClass1_Sub19_Sub2_1.method2917();
				local21.anInt3294 = Static413.aClass1_Sub19_Sub2_1.method2923();
				local21.anInt3301 = Static413.aClass1_Sub19_Sub2_1.method2892() + Static98.anInt1304;
				local21.anInt3341 = Static413.aClass1_Sub19_Sub2_1.method2938() + Static98.anInt1304;
				local21.anInt3292 = Static413.aClass1_Sub19_Sub2_1.method2884();
				local21.anInt3294 += local21.anIntArray247[0];
				local21.anInt3291 += local21.anIntArray246[0];
				local21.anInt3344 = 0;
				local21.anInt3342 = 1;
				local21.anInt3306 += local21.anIntArray246[0];
				local21.anInt3329 += local21.anIntArray247[0];
			}
			@Pc(140) int local140;
			@Pc(151) int local151;
			if ((local25 & 0x1) != 0) {
				local140 = Static413.aClass1_Sub19_Sub2_1.method2896();
				if (local140 == 65535) {
					local140 = -1;
				}
				local151 = Static413.aClass1_Sub19_Sub2_1.method2928();
				Static182.method2672(local151, local21, local140);
			}
			if ((local25 & 0x100) != 0) {
				local21.aByte56 = Static413.aClass1_Sub19_Sub2_1.method2910();
				local21.aByte55 = Static413.aClass1_Sub19_Sub2_1.method2917();
				local21.aByte54 = Static413.aClass1_Sub19_Sub2_1.method2899();
				local21.aByte57 = (byte) Static413.aClass1_Sub19_Sub2_1.method2915();
				local21.anInt3326 = Static98.anInt1304 + Static413.aClass1_Sub19_Sub2_1.method2882();
				local21.anInt3321 = Static98.anInt1304 + Static413.aClass1_Sub19_Sub2_1.method2896();
			}
			if ((local25 & 0x20) != 0) {
				local140 = Static413.aClass1_Sub19_Sub2_1.method2883();
				local151 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local21.method2630(local140, Static98.anInt1304, local151);
			}
			if ((local25 & 0x8) != 0) {
				if (local21.aClass272_1.method5899()) {
					Static136.method1742(local21);
				}
				local21.method1303(Static428.aClass196_1.method4163(Static413.aClass1_Sub19_Sub2_1.method2938()));
				local21.method2637(local21.aClass272_1.anInt7346);
				local21.anInt3297 = local21.aClass272_1.anInt7317 << 3;
				if (local21.aClass272_1.method5899()) {
					Static123.method1515(0, local21.anIntArray246[0], local21, local21.anIntArray247[0], local21.aByte90, null, null);
				}
			}
			@Pc(303) int local303;
			if ((local25 & 0x4) != 0) {
				local140 = Static413.aClass1_Sub19_Sub2_1.method2882();
				if (local140 == 65535) {
					local140 = -1;
				}
				local151 = Static413.aClass1_Sub19_Sub2_1.method2900();
				local303 = Static413.aClass1_Sub19_Sub2_1.method2919();
				local21.method2632(local140, false, local303, local151);
			}
			if ((local25 & 0x80) != 0) {
				local140 = Static413.aClass1_Sub19_Sub2_1.method2883();
				local151 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local21.method2630(local140, Static98.anInt1304, local151);
				local21.anInt3309 = Static98.anInt1304 + 300;
				local21.anInt3316 = Static413.aClass1_Sub19_Sub2_1.method2915();
			}
			if ((local25 & 0x2000) != 0) {
				local140 = Static413.aClass1_Sub19_Sub2_1.method2882();
				local151 = Static413.aClass1_Sub19_Sub2_1.method2877();
				if (local140 == 65535) {
					local140 = -1;
				}
				local303 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local21.method2632(local140, true, local303, local151);
			}
			if ((local25 & 0x1000) != 0) {
				local140 = Static413.aClass1_Sub19_Sub2_1.method2938();
				local21.anInt3269 = Static413.aClass1_Sub19_Sub2_1.method2928();
				local21.anInt3332 = Static413.aClass1_Sub19_Sub2_1.method2915();
				local21.aBoolean323 = (local140 & 0x8000) != 0;
				local21.anInt3274 = local140 & 0x7FFF;
				local21.anInt3336 = local21.anInt3269 + Static98.anInt1304 + local21.anInt3274;
			}
			if ((local25 & 0x40) != 0) {
				local21.anInt3318 = Static413.aClass1_Sub19_Sub2_1.method2938();
				if (local21.anInt3318 == 65535) {
					local21.anInt3318 = -1;
				}
			}
			if ((local25 & 0x400) != 0) {
				local140 = Static413.aClass1_Sub19_Sub2_1.method2915();
				@Pc(442) int[] local442 = new int[local140];
				@Pc(445) int[] local445 = new int[local140];
				@Pc(448) int[] local448 = new int[local140];
				for (@Pc(450) int local450 = 0; local450 < local140; local450++) {
					@Pc(456) int local456 = Static413.aClass1_Sub19_Sub2_1.method2892();
					if (local456 == 65535) {
						local456 = -1;
					}
					local442[local450] = local456;
					local445[local450] = Static413.aClass1_Sub19_Sub2_1.method2884();
					local448[local450] = Static413.aClass1_Sub19_Sub2_1.method2892();
				}
				Static439.method5501(local442, local21, local445, local448);
			}
			if ((local25 & 0x200) != 0) {
				local21.anInt1603 = Static413.aClass1_Sub19_Sub2_1.method2938();
				local21.anInt1610 = Static413.aClass1_Sub19_Sub2_1.method2882();
			}
			if ((local25 & 0x2) != 0) {
				local21.aString31 = Static413.aClass1_Sub19_Sub2_1.method2914();
				local21.anInt3305 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!za;)V")
	public static void method988(@OriginalArg(1) Class117 arg0) {
		if (Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 != Static190.anInt3500 && (Static259.aClass216ArrayArrayArray3 != null && Static114.method1412(arg0, Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90))) {
			Static190.anInt3500 = Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90;
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public static void method989() {
		Static460.anInt7364 = -1;
		Static288.anInt4834 = -1;
		Static61.anInt7291 = 0;
	}
}
