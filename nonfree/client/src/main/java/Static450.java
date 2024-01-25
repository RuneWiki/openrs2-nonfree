import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "Lclient!rba;")
	public static final Class277 aClass277_2 = new Class277();

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "Lclient!rba;")
	public static final Class277 aClass277_5 = new Class277();

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "Lclient!rba;")
	public static final Class277 aClass277_3 = new Class277();

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "Lclient!rba;")
	public static final Class277 aClass277_4 = new Class277();

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "[Lclient!jr;")
	public static Class177[] aClass177Array1 = new Class177[50];

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
	public static int anInt7748 = 0;

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "Lclient!jb;")
	public static final Class165 aClass165_5 = new Class165();

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IBI)I")
	public static int method6372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static566.method7639(arg0 - 1, arg1 - 1) + Static566.method7639(arg0 - 1, arg1 + 1) + Static566.method7639(arg0 + 1, arg1 + -1) + Static566.method7639(arg0 + 1, arg1 - -1);
		@Pc(71) int local71 = Static566.method7639(arg0, arg1 - 1) + Static566.method7639(arg0, arg1 + 1) + Static566.method7639(arg0 - 1, arg1) + Static566.method7639(arg0 + 1, arg1);
		@Pc(81) int local81 = Static566.method7639(arg0, arg1);
		return local81 / 4 + local71 / 8 + local41 / 16;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(BI)V")
	public static void method6373(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub3_Sub1 local14 = Static374.method5445(12, arg0);
		local14.method488();
	}
}
