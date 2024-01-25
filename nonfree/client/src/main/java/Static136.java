import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	public static int anInt2636;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array6;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[8];

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	public static int anInt2639 = 0;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "[I")
	public static final int[] anIntArray176 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	public static void method1966() {
		if (Static126.aClass67_Sub1_1.method4531(Static286.anInt5207) || Static221.anInt4855 == Static107.anInt2257) {
			Static351.method4932(Static16.aClass30_11);
			if (Static25.anInt667 != Static221.anInt4855) {
				Static176.method2582();
			}
		} else {
			Static5.method158(Static33.anInt781, false, false, Static50.anInt1367);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Z")
	public static boolean method1968(@OriginalArg(1) int arg0) {
		@Pc(9) Class84_Sub1 local9 = Static246.method3391(arg0);
		if (local9 == null) {
			return false;
		} else if (Static159.anInt3000 == 3) {
			@Pc(41) String local41 = "";
			if (Static130.aClass239_4 != Static427.aClass239_7) {
				local41 = ":" + (local9.anInt6832 + 7000);
			}
			@Pc(57) String local57 = "";
			if (Static156.aString26 != null) {
				local57 = "/p=" + Static156.aString26;
			}
			@Pc(111) String local111 = "http://" + local9.aString66 + local41 + "/l=" + Static139.anInt2670 + "/a=" + Static121.anInt2512 + local57 + "/j" + (Static197.aBoolean435 ? "1" : "0") + ",o" + (Static242.aBoolean359 ? "1" : "0") + ",a2";
			try {
				Static102.aClient1.getAppletContext().showDocument(new URL(local111), "_self");
				return true;
			} catch (@Pc(121) Exception local121) {
				return false;
			}
		} else {
			Static83.anInt1889 = local9.anInt6832;
			Static436.aString70 = local9.aString66;
			if (Static130.aClass239_4 != Static427.aClass239_7) {
				Static81.anInt1880 = Static83.anInt1889 + 40000;
				Static271.anInt1484 = Static83.anInt1889 + 50000;
				Static274.anInt4849 = Static81.anInt1880;
			}
			return true;
		}
	}
}
