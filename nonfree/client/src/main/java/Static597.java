import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z[B)Z")
	public static boolean method8406(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class2_Sub17 local13 = new Class2_Sub17(arg0);
		@Pc(17) int local17 = local13.method2859();
		if (local17 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local13.method2859() == 1;
		if (local33) {
			Static428.method6233(local13);
		}
		Static81.method1770(local13);
		return true;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)V")
	public static void method8407(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class2_Sub31 local19 = Static275.method4480(Static640.aClass314_2, Static549.aClass145_159);
		local19.aClass2_Sub17_Sub1_2.method2879(arg0);
		local19.aClass2_Sub17_Sub1_2.method2857(arg1);
		Static526.method7309(local19);
	}
}
