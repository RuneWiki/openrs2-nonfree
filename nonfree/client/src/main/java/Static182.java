import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!gga", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray159;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method7780() {
		if (Static627.aBoolean736 || Static601.aClass2_Sub2_Sub11_4 == null) {
			return "";
		} else if ((Static601.aClass2_Sub2_Sub11_4.aString43 == null || Static601.aClass2_Sub2_Sub11_4.aString43.length() == 0) && Static601.aClass2_Sub2_Sub11_4.aString45 != null && Static601.aClass2_Sub2_Sub11_4.aString45.length() > 0) {
			return Static601.aClass2_Sub2_Sub11_4.aString45;
		} else {
			return Static601.aClass2_Sub2_Sub11_4.aString43;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(III)Z")
	public static boolean method7787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(III)Z")
	public static boolean method7791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static471.method6342(arg1, arg0) || Static147.method2209(arg0, arg1);
	}
}
