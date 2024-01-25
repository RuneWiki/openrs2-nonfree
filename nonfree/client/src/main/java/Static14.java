import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
	public static int anInt328;

	@OriginalMember(owner = "client!ak", name = "U", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[8];

	@OriginalMember(owner = "client!ak", name = "ab", descriptor = "Lclient!vf;")
	public static final Class348 aClass348_3 = new Class348();

	@OriginalMember(owner = "client!ak", name = "fb", descriptor = "I")
	public static int anInt330 = 765;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)I")
	public static int method240(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZII)V")
	public static void method242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub2_Sub18 local12 = Static508.method6607(arg1, 1);
		local12.method6227();
		local12.anInt7701 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Z")
	public static boolean method247() {
		@Pc(7) boolean local7 = true;
		if (Static194.aClass344_1 == null) {
			if (Static241.aClass229_54.method4954(Static407.anInt6675)) {
				Static194.aClass344_1 = Static603.method7125(Static241.aClass229_54, Static407.anInt6675);
			} else {
				local7 = false;
			}
		}
		if (Static471.aClass344_5 == null) {
			if (Static241.aClass229_54.method4954(Static222.anInt3249)) {
				Static471.aClass344_5 = Static603.method7125(Static241.aClass229_54, Static222.anInt3249);
			} else {
				local7 = false;
			}
		}
		if (Static541.aClass344_4 == null) {
			if (Static241.aClass229_54.method4954(Static372.anInt6232)) {
				Static541.aClass344_4 = Static603.method7125(Static241.aClass229_54, Static372.anInt6232);
			} else {
				local7 = false;
			}
		}
		if (Static521.aClass112_10 == null) {
			if (Static191.aClass229_45.method4954(Static526.anInt9652)) {
				Static521.aClass112_10 = Static308.method4410(Static191.aClass229_45, Static526.anInt9652);
			} else {
				local7 = false;
			}
		}
		if (Static86.aClass344Array1 == null) {
			if (Static241.aClass229_54.method4954(Static526.anInt9652)) {
				Static86.aClass344Array1 = Static603.method7126(Static241.aClass229_54, Static526.anInt9652);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
