import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "J")
	public static volatile long aLong71 = 0L;

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2957(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static83.method1161(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static244.anInt4491; local29++) {
			@Pc(35) String local35 = Static74.aStringArray5[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static83.method1161(local35);
			if (local35 != null && local35.equals(local24)) {
				Static244.anInt4491--;
				for (@Pc(59) int local59 = local29; local59 < Static244.anInt4491; local59++) {
					Static74.aStringArray5[local59] = Static74.aStringArray5[local59 + 1];
					Static328.aStringArray27[local59] = Static328.aStringArray27[local59 + 1];
					Static41.aStringArray4[local59] = Static41.aStringArray4[local59 + 1];
					Static140.aStringArray12[local59] = Static140.aStringArray12[local59 + 1];
					Static300.aBooleanArray19[local59] = Static300.aBooleanArray19[local59 + 1];
				}
				Static83.anInt1400 = Static124.anInt2133;
				Static534.method7063(Static203.aClass316_47);
				Static340.aClass6_Sub12_Sub2_1.method6047(Static314.method4913(arg0));
				Static340.aClass6_Sub12_Sub2_1.method6009(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIB)Z")
	public static boolean method2958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static189.method3219(arg0, arg1) || Static236.method3675(arg0, arg1);
	}
}
