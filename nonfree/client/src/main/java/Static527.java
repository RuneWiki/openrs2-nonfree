import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[5];

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public static int anInt8177 = 100;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Lclient!sv;")
	public static final Class340 aClass340_5 = new Class340();

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
	public static int anInt8178 = -1;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method7104() {
		return Static333.aBoolean400 || Static111.aClass4_Sub5_Sub17_2 == null ? "" : Static111.aClass4_Sub5_Sub17_2.aString96;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method7105(@OriginalArg(0) int arg0) {
		@Pc(18) Class4_Sub34 local18 = (Class4_Sub34) Static255.aClass66_18.method1994((long) arg0);
		if (local18 != null) {
			@Pc(25) Class4_Sub6_Sub1 local25 = local18.aClass105_Sub1_1.method2531();
			if (local25 != null) {
				@Pc(32) double local32 = local18.aClass105_Sub1_1.method2524();
				if (local32 >= (double) local25.method556() && local32 <= (double) local25.method560()) {
					return local25.method561();
				}
			}
		}
		return null;
	}
}
