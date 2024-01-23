import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "[Lclient!hk;")
	public static Class1_Sub1_Sub8_Sub1[] aClass1_Sub1_Sub8_Sub1Array7;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array62;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
	public static int anInt3193;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	public static int anInt3190 = -1;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "Lclient!oj;")
	public static Class84 aClass84_27 = new Class84(64);

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1067 = Static186.method3527("hitbar_default");

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array63 = new Class50[1000];

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[Lclient!hh;)[Lclient!hh;")
	public static Class50[] method2566(@OriginalArg(1) Class50[] arg0) {
		@Pc(4) Class50[] local4 = new Class50[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local4[local15] = Static17.method257(new Class50[] { Static160.method2684(local15), Static117.aClass50_791 });
			if (arg0 != null && arg0[local15] != null) {
				local4[local15] = Static17.method257(new Class50[] { local4[local15], arg0[local15] });
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)V")
	public static void method2567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static42.anInt924; local7++) {
			if (Static135.anIntArray296[local7] + Static118.anIntArray258[local7] > arg0 && Static118.anIntArray258[local7] < arg2 + arg0 && arg3 < Static75.anIntArray124[local7] + Static189.anIntArray440[local7] && arg1 + arg3 > Static75.anIntArray124[local7]) {
				Static98.aBooleanArray5[local7] = true;
			}
		}
	}
}
