import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
	public static final int anInt5557 = -1;

	@OriginalMember(owner = "client!jba", name = "z", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_87 = new Class73(36, 3);

	@OriginalMember(owner = "client!jba", name = "E", descriptor = "Lclient!oq;")
	public static final Class248 aClass248_6 = new Class248();

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V")
	public static void method4588(@OriginalArg(0) int arg0) {
		if (!Static156.method3070(arg0)) {
			return;
		}
		@Pc(18) Class302[] local18 = Static299.aClass302ArrayArray2[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class302 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt8900 = 0;
				local26.anInt8910 = 0;
				local26.anInt8889 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZB)I")
	public static int method4589(@OriginalArg(0) boolean arg0) {
		if (Static6.anIntArray10 == null) {
			return 0;
		} else if (arg0 || Static429.aClass259Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static6.anIntArray10.length; local22++) {
				@Pc(28) int local28 = Static6.anIntArray10[local22];
				if (Static347.aClass223_72.method5951(local28)) {
					local20++;
				}
				if (Static379.aClass223_80.method5951(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static6.anIntArray10.length * 2;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BC)Z")
	public static boolean method4590(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
