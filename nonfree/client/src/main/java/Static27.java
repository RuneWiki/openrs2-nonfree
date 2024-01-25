import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_12 = new Class57("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString6 = "";

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
	public static int anInt355 = 0;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "[Lclient!vo;")
	public static final Class3_Sub7_Sub15[] aClass3_Sub7_Sub15Array1 = new Class3_Sub7_Sub15[14];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method327(@OriginalArg(1) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
	public static void method329() {
		Static105.anInt2076 = 0;
		Static47.aClass138_7.method3046();
		Static287.aBoolean397 = false;
	}
}
