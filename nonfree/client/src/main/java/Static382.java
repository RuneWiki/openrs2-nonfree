import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
	public static int anInt10556;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "[Lclient!sa;")
	public static final Class326[] aClass326Array3 = new Class326[8];

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
	public static void method9029() {
		for (@Pc(6) Class2_Sub18 local6 = (Class2_Sub18) Static284.aClass335_14.method8358(); local6 != null; local6 = (Class2_Sub18) Static284.aClass335_14.method8355()) {
			Static274.method4661(local6.anInt1619);
		}
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)Ljava/lang/String;")
	public static String method9034() {
		if (Static183.aBoolean305 || Static577.aClass2_Sub1_Sub13_4 == null) {
			return "";
		} else if ((Static577.aClass2_Sub1_Sub13_4.aString82 == null || Static577.aClass2_Sub1_Sub13_4.aString82.length() == 0) && Static577.aClass2_Sub1_Sub13_4.aString81 != null && Static577.aClass2_Sub1_Sub13_4.aString81.length() > 0) {
			return Static577.aClass2_Sub1_Sub13_4.aString81;
		} else {
			return Static577.aClass2_Sub1_Sub13_4.aString82;
		}
	}
}
