import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pm", name = "Z", descriptor = "Lclient!bo;")
	public static Class30 aClass30_6;

	@OriginalMember(owner = "client!pm", name = "fb", descriptor = "Lclient!sg;")
	public static Class97 aClass97_16;

	@OriginalMember(owner = "client!pm", name = "ib", descriptor = "I")
	public static int anInt4938;

	@OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
	public static int anInt4932 = 0;

	@OriginalMember(owner = "client!pm", name = "cb", descriptor = "Z")
	public static boolean aBoolean325 = false;

	@OriginalMember(owner = "client!pm", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString47 = null;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4309(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static20.anInt374; local11++) {
			if (arg0.equalsIgnoreCase(Static193.aStringArray30[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(JI)V")
	public static void method4311(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static140.method2170(arg0 - 1L);
			Static140.method2170(1L);
		} else {
			Static140.method2170(arg0);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!kh;I)V")
	public static void method4312(@OriginalArg(0) Class11_Sub25 arg0) {
		@Pc(9) int local9 = arg0.method5188();
		Static238.aClass158Array1 = new Class158[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static238.aClass158Array1[local14] = new Class158();
			Static238.aClass158Array1[local14].anInt4941 = arg0.method5188();
			Static238.aClass158Array1[local14].aString48 = arg0.method5225();
		}
		Static232.anInt4702 = arg0.method5188();
		Static284.anInt5615 = arg0.method5188();
		Static27.anInt493 = arg0.method5188();
		Static80.aClass157_Sub1Array7 = new Class157_Sub1[Static284.anInt5615 + 1 - Static232.anInt4702];
		for (@Pc(71) int local71 = 0; local71 < Static27.anInt493; local71++) {
			@Pc(77) int local77 = arg0.method5188();
			@Pc(85) Class157_Sub1 local85 = Static80.aClass157_Sub1Array7[local77] = new Class157_Sub1();
			local85.anInt4786 = arg0.method5185();
			local85.anInt4784 = arg0.method5198();
			local85.anInt4799 = Static232.anInt4702 + local77;
			local85.aString44 = arg0.method5225();
			local85.aString45 = arg0.method5225();
		}
		Static99.anInt823 = arg0.method5198();
		Static103.aBoolean113 = true;
	}
}
