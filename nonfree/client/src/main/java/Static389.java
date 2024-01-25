import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public static int anInt6274;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!uf;")
	public static Class242 aClass242_1;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_194 = new Class107(110, -1);

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_81 = new Class179(44, 4);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method5228(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static28.anInt641 >= 100) {
			Static135.method2324(Static179.aClass7_83.method331(Static341.anInt5770));
			return;
		}
		@Pc(20) String local20 = Static459.method4507(arg0);
		if (local20 == null) {
			return;
		}
		@Pc(64) String local64;
		for (@Pc(25) int local25 = 0; local25 < Static28.anInt641; local25++) {
			@Pc(32) String local32 = Static459.method4507(Static214.aStringArray34[local25]);
			if (local32 != null && local32.equals(local20)) {
				Static135.method2324(arg0 + Static335.aClass7_130.method331(Static341.anInt5770));
				return;
			}
			if (Static260.aStringArray30[local25] != null) {
				local64 = Static459.method4507(Static260.aStringArray30[local25]);
				if (local64 != null && local64.equals(local20)) {
					Static135.method2324(arg0 + Static335.aClass7_130.method331(Static341.anInt5770));
					return;
				}
			}
		}
		for (@Pc(94) int local94 = 0; local94 < Static313.anInt5409; local94++) {
			local64 = Static459.method4507(Static22.aStringArray6[local94]);
			if (local64 != null && local64.equals(local20)) {
				Static135.method2324(Static107.aClass7_55.method331(Static341.anInt5770) + arg0 + Static458.aClass7_165.method331(Static341.anInt5770));
				return;
			}
			if (Static172.aStringArray22[local94] != null) {
				@Pc(136) String local136 = Static459.method4507(Static172.aStringArray22[local94]);
				if (local136 != null && local136.equals(local20)) {
					Static135.method2324(Static107.aClass7_55.method331(Static341.anInt5770) + arg0 + Static458.aClass7_165.method331(Static341.anInt5770));
					return;
				}
			}
		}
		if (Static459.method4507(Static452.aClass31_Sub2_Sub1_Sub1_2.aString10).equals(local20)) {
			Static135.method2324(Static312.aClass7_121.method331(Static341.anInt5770));
		} else {
			Static193.method2984(Static454.aClass179_95);
			Static92.aClass1_Sub5_Sub1_1.method5396(Static119.method747(arg0) + 1);
			Static92.aClass1_Sub5_Sub1_1.method5385(arg0);
			Static92.aClass1_Sub5_Sub1_1.method5396(arg1 ? 1 : 0);
		}
	}
}
