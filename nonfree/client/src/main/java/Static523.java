import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_339 = new Class196(111, 12);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
	public static void method8746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static65.method949(local7.aClass41_Sub1_Sub3_2);
		Static65.method949(local7.aClass41_Sub1_Sub3_1);
		if (local7.aClass41_Sub1_Sub3_2 != null) {
			local7.aClass41_Sub1_Sub3_2 = null;
		}
		if (local7.aClass41_Sub1_Sub3_1 != null) {
			local7.aClass41_Sub1_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZI)Z")
	public static boolean method8747(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static480.method3955(arg1, arg0) || Static620.method8303(arg1, arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	public static void method8754() {
		@Pc(5) int local5 = 0;
		if (Static655.aClass5_Sub36_29.aClass2_Sub16_1.method6973() == 1) {
			local5 = 55;
		}
		if (Static655.aClass5_Sub36_29.aClass2_Sub10_1.method3819() == 0) {
			local5 |= 0x40;
		}
		Static505.method7280(local5);
		Static400.aClass140_4.method2840(local5);
		Static259.aClass135_1.method2775(local5);
		Static58.aClass230_1.method5288(local5);
		Static312.aClass179_1.method3800(local5);
		Static387.method5668(local5);
		Static609.method8194(local5);
		Static655.method8585(local5);
		Static142.method2114(local5);
		Static12.method8633();
	}
}
