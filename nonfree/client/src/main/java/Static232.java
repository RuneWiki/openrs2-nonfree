import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
	public static int anInt4212;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "Z")
	public static boolean aBoolean297 = false;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)Lclient!rg;")
	public static Class1_Sub2_Sub15 method3507(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub15 local10 = (Class1_Sub2_Sub15) Static60.aClass29_1.method757((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static105.aClass246_64.method5477(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static90.method1652(local20);
			Static60.aClass29_1.method756(local10, (long) arg0);
			return local10;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3508(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(26) String local26 = Static459.method4507(arg0);
		if (local26 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static28.anInt641; local31++) {
			@Pc(36) String local36 = Static214.aStringArray34[local31];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static459.method4507(local36);
			if (local36 != null && local36.equals(local26)) {
				Static28.anInt641--;
				for (@Pc(60) int local60 = local31; local60 < Static28.anInt641; local60++) {
					Static214.aStringArray34[local60] = Static214.aStringArray34[local60 + 1];
					Static52.aStringArray33[local60] = Static52.aStringArray33[local60 + 1];
					Static260.aStringArray30[local60] = Static260.aStringArray30[local60 + 1];
					Static184.aStringArray23[local60] = Static184.aStringArray23[local60 + 1];
					Static199.aBooleanArray28[local60] = Static199.aBooleanArray28[local60 + 1];
				}
				Static254.anInt4601 = Static319.anInt4221;
				Static193.method2984(Static295.aClass179_59);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static119.method747(arg0));
				Static92.aClass1_Sub5_Sub1_1.method5385(arg0);
				return;
			}
		}
	}
}
