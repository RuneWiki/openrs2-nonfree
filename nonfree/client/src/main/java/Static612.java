import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!um", name = "p", descriptor = "I")
	public static int anInt9404 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIBZLjava/lang/String;Ljava/lang/String;I)V")
	public static void method8028(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static203.aClass34_53.anInt1211 = 1;
		@Pc(11) String local11 = arg3.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg5 != -1) {
			@Pc(27) Class257 local27 = Static482.aClass84_2.method2152(arg5);
			if (local27 == null || arg2 != local27.method5757()) {
				return;
			}
			if (local27.method5757()) {
				local18 = local27.aString77;
			} else {
				local16 = local27.anInt6617;
			}
		}
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static532.aClass255_2.anInt5946; local58++) {
			@Pc(65) Class110 local65 = Static532.aClass255_2.method5210(local58);
			if ((!arg0 || local65.aBoolean201) && local65.anInt2774 == -1 && local65.anInt2752 == -1 && local65.anInt2806 == -1 && local65.anInt2759 == 0 && local65.aString24.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg2) {
						if (!arg4.equals(local65.method2606(arg5, local18))) {
							continue;
						}
					} else if (local65.method2611(local16, arg5) != arg1) {
						continue;
					}
				}
				if (local56 >= 250) {
					Static118.aShortArray33 = null;
					Static359.anInt5450 = -1;
					return;
				}
				if (local14.length <= local56) {
					@Pc(141) short[] local141 = new short[local14.length * 2];
					for (@Pc(143) int local143 = 0; local143 < local56; local143++) {
						local141[local143] = local14[local143];
					}
					local14 = local141;
				}
				local14[local56++] = (short) local58;
			}
		}
		Static118.aShortArray33 = local14;
		Static558.anInt8602 = 0;
		Static359.anInt5450 = local56;
		@Pc(190) String[] local190 = new String[Static359.anInt5450];
		for (@Pc(192) int local192 = 0; local192 < Static359.anInt5450; local192++) {
			local190[local192] = Static532.aClass255_2.method5210(local14[local192]).aString24;
		}
		Static479.method6584(Static118.aShortArray33, local190);
		Static203.aClass34_53.method1231();
		Static203.aClass34_53.anInt1211 = 2;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Z")
	public static boolean method8029(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static386.method4993(arg0, arg1) | Static615.method8045(arg0, arg1) | Static180.method8497(arg1, arg0)) & Static39.method4897(arg1, arg0);
	}
}
