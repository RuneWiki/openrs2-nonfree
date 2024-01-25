import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "Lclient!ra;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_96 = new Class239(99, -1);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method3589(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static111.method2163(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static60.anInt1162; local30++) {
			@Pc(36) String local36 = Static73.aStringArray6[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static111.method2163(local36);
			if (local36 != null && local36.equals(local20)) {
				Static60.anInt1162--;
				for (@Pc(60) int local60 = local30; local60 < Static60.anInt1162; local60++) {
					Static73.aStringArray6[local60] = Static73.aStringArray6[local60 + 1];
					Static290.aStringArray30[local60] = Static290.aStringArray30[local60 + 1];
					Static185.aStringArray19[local60] = Static185.aStringArray19[local60 + 1];
					Static454.aStringArray38[local60] = Static454.aStringArray38[local60 + 1];
					Static115.aBooleanArray20[local60] = Static115.aBooleanArray20[local60 + 1];
				}
				Static224.anInt4039 = Static507.anInt2745;
				Static93.method1721(Static328.aClass243_62);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static332.method5299(arg0));
				Static381.aClass2_Sub29_Sub2_2.method5189(arg0);
				return;
			}
		}
	}
}
