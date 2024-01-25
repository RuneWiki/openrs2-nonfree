import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Lclient!bs;")
	public static Class37 aClass37_4;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	public static int anInt7118 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
	public static void method5432(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub1_Sub11 local14 = Static248.method3707(arg0, 5);
		local14.method2954();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Lclient!f;")
	public static Class30_Sub2 method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass30_Sub2_2;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	public static void method5434() {
		if (Static257.anInt5000 <= 0) {
			Static72.aString16 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static38.aStringArray6.length; local14++) {
			if (Static38.aStringArray6[local14].startsWith("--> ")) {
				@Pc(25) int local25 = ~Static257.anInt5000;
				local12++;
				if (local25 == ~local12) {
					Static72.aString16 = Static38.aStringArray6[local14].substring(4);
					break;
				}
			}
		}
	}
}
