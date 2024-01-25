import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
	public static int anInt4608 = 0;

	@OriginalMember(owner = "client!ok", name = "I", descriptor = "[I")
	public static final int[] anIntArray619 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ok", name = "K", descriptor = "Z")
	public static boolean aBoolean341 = true;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)V")
	public static void method4055() {
		@Pc(14) int local14;
		for (@Pc(7) int local7 = -1; local7 < Static223.anInt4466; local7++) {
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static314.anIntArray758[local7];
			}
			@Pc(24) Class22_Sub2_Sub1_Sub1 local24 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local14];
			if (local24 != null && local24.anInt5125 > 0) {
				local24.anInt5125--;
				if (local24.anInt5125 == 0) {
					local24.aString325 = null;
				}
			}
		}
		for (local14 = 0; local14 < Static11.anInt3203; local14++) {
			@Pc(61) int local61 = Static257.anIntArray649[local14];
			@Pc(65) Class22_Sub2_Sub1_Sub2 local65 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local61];
			if (local65 != null && local65.anInt5125 > 0) {
				local65.anInt5125--;
				if (local65.anInt5125 == 0) {
					local65.aString325 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!bi;II)V")
	public static void method4056(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class64 local12 = arg1.method428(Static128.aClass89_3);
		if (local12 == null) {
			return;
		}
		Static128.aClass89_3.method5431(arg0, arg2, arg1.anInt523 + arg0, arg2 - -arg1.anInt515);
		if (Static348.anInt6562 >= 3) {
			Static128.aClass89_3.method5436(local12, arg0, arg2);
		} else {
			Static294.aClass52_30.method4132((float) arg0 + (float) arg1.anInt523 / 2.0F, (float) arg1.anInt515 / 2.0F + (float) arg2, ((int) -Static351.aFloat80 & 0x3FFF) << 2, local12, arg0, arg2);
		}
	}
}
