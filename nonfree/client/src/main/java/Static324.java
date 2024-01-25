import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ku", name = "P", descriptor = "Lclient!aj;")
	public static Class15 aClass15_87;

	@OriginalMember(owner = "client!ku", name = "R", descriptor = "[Lclient!iba;")
	public static Class148[] aClass148Array1;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)V")
	public static void method4962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static346.method5177(local7.aClass28_Sub1_Sub2_2);
		Static346.method5177(local7.aClass28_Sub1_Sub2_1);
		if (local7.aClass28_Sub1_Sub2_2 != null) {
			local7.aClass28_Sub1_Sub2_2 = null;
		}
		if (local7.aClass28_Sub1_Sub2_1 != null) {
			local7.aClass28_Sub1_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZ)[B")
	public static byte[] method4964(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub11_Sub10 local15 = (Class3_Sub11_Sub10) Static151.aClass179_1.method4558((long) arg0);
		if (local15 == null) {
			@Pc(20) byte[] local20 = new byte[512];
			@Pc(26) Random local26 = new Random((long) arg0);
			for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
				local20[local28] = (byte) local28;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(46) int local46 = 255 - local40;
				@Pc(51) int local51 = Static371.method5392(local26, local46);
				@Pc(55) byte local55 = local20[local51];
				local20[local51] = local20[local46];
				local20[local46] = local20[511 - local40] = local55;
			}
			local15 = new Class3_Sub11_Sub10(local20);
			Static151.aClass179_1.method4562(local15, (long) arg0);
		}
		return local15.aByteArray45;
	}
}
