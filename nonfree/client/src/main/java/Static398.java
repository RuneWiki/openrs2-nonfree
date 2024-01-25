import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!ofa", name = "F", descriptor = "Lclient!td;")
	public static Class24 aClass24_24;

	@OriginalMember(owner = "client!ofa", name = "M", descriptor = "Lclient!ha;")
	public static Class5 aClass5_13;

	@OriginalMember(owner = "client!ofa", name = "G", descriptor = "I")
	public static int anInt7399 = 0;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IZBII)V")
	public static void method6435(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static58.method1595();
		Static215.aLong115 = 0L;
		@Pc(14) int local14 = Static634.method8682();
		if (arg3 == 3 || local14 == 3) {
			arg1 = true;
		}
		if (!Static323.aClass5_9.method7559()) {
			arg1 = true;
		}
		Static435.method6793(arg1, local14, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(III)B")
	public static byte method6436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)V")
	public static void method6437() {
		for (@Pc(17) Class3_Sub40 local17 = (Class3_Sub40) Static229.aClass223_18.method5874(); local17 != null; local17 = (Class3_Sub40) Static229.aClass223_18.method5870()) {
			if (local17.anInt7272 == -1) {
				local17.anInt7262 = 0;
				if (local17.anInt7269 >= 0 && local17.anInt7265 >= 0 && Static634.anInt10129 > local17.anInt7269 && local17.anInt7265 < Static638.anInt10172) {
					Static331.method5404(local17);
				}
			} else {
				local17.method8769();
			}
		}
	}

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "(Z)V")
	public static void method6438() {
		if (Static29.anInterface21Array1 == null) {
			return;
		}
		@Pc(14) Interface21[] local14 = Static29.anInterface21Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface21 local22 = local14[local16];
			local22.method3922();
		}
	}
}
