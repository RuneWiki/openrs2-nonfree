import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLclient!rca;)Z")
	public static boolean method6827(@OriginalArg(1) Interface25 arg0) {
		@Pc(17) Class5 local17 = Static79.aClass304_2.method6956(arg0.method6207());
		if (local17.anInt60 == -1) {
			return true;
		} else {
			@Pc(32) Class220 local32 = Static108.aClass79_1.method1974(local17.anInt60);
			return local32.anInt5984 == -1 ? true : local32.method5163();
		}
	}
}
