import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!o;")
	public static Class137 aClass137_17;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_134 = new Class263(42, 8);

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Z")
	public static boolean aBoolean364 = false;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4388(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(26) String local26 = Static311.method4474(arg0);
		if (local26 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static323.anInt5975; local31++) {
			@Pc(36) String local36 = Static169.aStringArray24[local31];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static311.method4474(local36);
			if (local36 != null && local36.equals(local26)) {
				Static323.anInt5975--;
				for (@Pc(60) int local60 = local31; local60 < Static323.anInt5975; local60++) {
					Static169.aStringArray24[local60] = Static169.aStringArray24[local60 + 1];
					Static318.aStringArray37[local60] = Static318.aStringArray37[local60 + 1];
					Static30.anIntArray50[local60] = Static30.anIntArray50[local60 + 1];
					Static416.aStringArray44[local60] = Static416.aStringArray44[local60 + 1];
					Static152.anIntArray332[local60] = Static152.anIntArray332[local60 + 1];
					Static258.aBooleanArray18[local60] = Static258.aBooleanArray18[local60 + 1];
				}
				Static290.anInt5510 = Static175.anInt3842;
				Static32.method677(Static257.aClass177_71);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static146.method2347(arg0));
				Static433.aClass1_Sub3_Sub1_11.method1190(arg0);
				return;
			}
		}
	}
}
