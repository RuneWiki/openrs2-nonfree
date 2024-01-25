import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Lclient!fr;")
	public static final Class85 aClass85_25 = new Class85();

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "[J")
	public static final long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!mv;IB)Lclient!wt;")
	public static Class270 method3210(@OriginalArg(0) Class26_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class270 local7;
		if (Static378.aClass270_2 == null) {
			local7 = new Class270();
		} else {
			local7 = Static378.aClass270_2;
			Static378.aClass270_2 = Static378.aClass270_2.aClass270_3;
			Static400.anInt5905--;
			local7.aClass270_3 = null;
		}
		local7.aClass26_Sub2_2 = arg0;
		local7.anInt7523 = arg1;
		return local7;
	}
}
