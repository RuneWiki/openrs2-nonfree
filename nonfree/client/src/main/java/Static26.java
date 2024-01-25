import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bg", name = "Dc", descriptor = "I")
	public static int anInt588;

	@OriginalMember(owner = "client!bg", name = "Hc", descriptor = "I")
	public static int anInt592;

	@OriginalMember(owner = "client!bg", name = "Oc", descriptor = "Lclient!ui;")
	public static Class230 aClass230_7;

	@OriginalMember(owner = "client!bg", name = "Tc", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "client!bg", name = "oc", descriptor = "Lclient!at;")
	public static final Class17 aClass17_7 = new Class17();

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method463(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static125.method1826(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static56.anInt1157; local30++) {
			@Pc(36) String local36 = Static250.aStringArray59[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static125.method1826(local36);
			if (local36 != null && local36.equals(local25)) {
				Static56.anInt1157--;
				for (@Pc(60) int local60 = local30; local60 < Static56.anInt1157; local60++) {
					Static250.aStringArray59[local60] = Static250.aStringArray59[local60 + 1];
					Static262.aStringArray88[local60] = Static262.aStringArray88[local60 + 1];
					Static256.aStringArray60[local60] = Static256.aStringArray60[local60 + 1];
					Static267.aStringArray64[local60] = Static267.aStringArray64[local60 + 1];
					Static300.aBooleanArray27[local60] = Static300.aBooleanArray27[local60 + 1];
				}
				Static329.anInt3952 = Static105.anInt1853;
				Static177.method1119(Static134.aClass48_83);
				Static209.aClass1_Sub33_Sub2_2.method5165(Static56.method903(arg0));
				Static209.aClass1_Sub33_Sub2_2.method5143(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BII)Lclient!tf;")
	public static Class222 method469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class222 local7 = new Class222();
		local7.anInt5619 = -1;
		local7.anInt5625 = -1;
		local7.anInt5620 = arg0 + 5 + 1;
		local7.anInt5613 = arg1 + 1 + 5;
		local7.anIntArrayArray59 = new int[local7.anInt5620][local7.anInt5613];
		local7.method4831();
		return local7;
	}
}
