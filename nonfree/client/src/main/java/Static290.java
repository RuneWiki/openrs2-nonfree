import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public static int anInt5053 = 0;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!of;")
	public static final Class174 aClass174_140 = new Class174(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!of;")
	public static final Class174 aClass174_141 = new Class174("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Z")
	public static boolean method4166(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static201.method3086(arg0, arg1) || Static5.method68(arg0, arg1) || Static307.method4642(arg1, arg0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method4167() {
		if (Static413.aClass167_11 == null) {
			return;
		}
		Static74.aClass194_1.method4583();
		Static443.method6070();
		Static138.method2121();
		Static453.method6159();
		Static360.method5047();
		Static11.method194();
		if (Static460.aClass64_1 != null) {
			Static460.aClass64_1.method1677();
		}
		Static197.method3057();
		Static342.method4772();
		Static169.method6284();
		Static126.method1992(false);
		Static429.method5844();
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			@Pc(51) Class1_Sub2_Sub6_Sub2 local51 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local45];
			if (local51 != null) {
				local51.aClass3_Sub47_3 = null;
				for (@Pc(58) int local58 = 0; local58 < local51.aClass108Array3.length; local58++) {
					local51.aClass108Array3[local58] = null;
				}
			}
		}
		for (@Pc(83) int local83 = 0; local83 < Static76.anInt1390; local83++) {
			@Pc(90) Class1_Sub2_Sub6_Sub1 local90 = Static407.aClass3_Sub40Array1[local83].aClass1_Sub2_Sub6_Sub1_2;
			if (local90 != null) {
				for (@Pc(94) int local94 = 0; local94 < local90.aClass108Array3.length; local94++) {
					local90.aClass108Array3[local94] = null;
				}
			}
		}
		Static359.aClass11_5 = null;
		Static103.aClass11_3 = null;
		Static413.aClass167_11.method5958();
		Static413.aClass167_11 = null;
	}
}
