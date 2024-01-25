import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public static int anInt1515 = -1;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z")
	public static boolean method1501(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZZI)Lclient!hw;")
	public static Class3_Sub18 method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub18 local7 = new Class3_Sub18();
		local7.anInt3962 = arg1;
		local7.anInt3964 = arg3;
		Static283.aClass25_23.method945(local7, (long) arg0);
		Static380.method6131(arg1);
		@Pc(31) Class305 local31 = Static220.method3786(arg0);
		if (local31 != null) {
			Static282.method4860(local31);
		}
		if (Static321.aClass305_8 != null) {
			Static282.method4860(Static321.aClass305_8);
			Static321.aClass305_8 = null;
		}
		Static442.method6914();
		if (local31 != null) {
			Static194.method3313(!arg2, local31);
		}
		if (!arg2) {
			Static597.method8428(arg1);
		}
		if (!arg2 && Static25.anInt779 != -1) {
			Static474.method7273(1, Static25.anInt779);
		}
		return local7;
	}
}
