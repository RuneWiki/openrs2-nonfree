import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_22 = new Class33(6, 4);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method7346(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = Static412.anInt7191;
		@Pc(7) int[] local7 = Static349.anIntArray479;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < local5; local11++) {
			@Pc(18) Class47_Sub2_Sub3_Sub2 local18 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local7[local11]];
			if (local18 != null && local18 != Static16.aClass47_Sub2_Sub3_Sub2_1 && local18.aString36 != null && local18.aString36.equalsIgnoreCase(arg1)) {
				local9 = true;
				if (arg0 == 1) {
					Static444.method6416(Static68.aClass186_25);
					Static192.aClass1_Sub13_Sub2_1.method3019(local7[local11]);
					Static192.aClass1_Sub13_Sub2_1.method3021(0);
				} else if (arg0 == 4) {
					Static444.method6416(Static89.aClass186_29);
					Static192.aClass1_Sub13_Sub2_1.method3023(local7[local11]);
					Static192.aClass1_Sub13_Sub2_1.method3021(0);
				} else if (arg0 == 5) {
					Static444.method6416(Static414.aClass186_98);
					Static192.aClass1_Sub13_Sub2_1.method3065(0);
					Static192.aClass1_Sub13_Sub2_1.method3028(local7[local11]);
				} else if (arg0 == 6) {
					Static444.method6416(Static16.aClass186_3);
					Static192.aClass1_Sub13_Sub2_1.method3047(0);
					Static192.aClass1_Sub13_Sub2_1.method3028(local7[local11]);
				} else if (arg0 == 7) {
					Static444.method6416(Static172.aClass186_48);
					Static192.aClass1_Sub13_Sub2_1.method3047(0);
					Static192.aClass1_Sub13_Sub2_1.method3038(local7[local11]);
				}
				break;
			}
		}
		if (!local9) {
			Static289.method4881(Static165.aClass114_75.method3330(Static315.anInt5993) + arg1);
		}
	}
}
