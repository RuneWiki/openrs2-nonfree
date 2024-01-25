import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "D")
	public static double aDouble23;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZI)V")
	public static void method7293(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg0) {
			@Pc(14) Class6_Sub17 local14 = Static330.method7824(Static462.aClass185_93, Static569.aClass134_2);
			local14.aClass6_Sub8_Sub1_2.method8241(arg1);
			Static452.method6867(local14);
		} else {
			Static435.method6677(Static503.aClass122_10, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!ji;)V")
	public static void method7294(@OriginalArg(1) Class6_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static428.anInt7857; local7++) {
			@Pc(13) int local13 = arg0.method8214();
			@Pc(17) int local17 = arg0.method8220();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static256.aClass67_Sub1Array2[local13] != null) {
				Static256.aClass67_Sub1Array2[local13].anInt5765 = local17;
			}
		}
	}
}
