import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static653 {

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "Z")
	public static boolean aBoolean739 = false;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method8740(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (Static651.aClass122_38.aBoolean281) {
			Static82.aClass165_2 = new Class165();
			Static82.aClass165_2.anInt4607 = arg0;
			Static82.aClass165_2.aString47 = arg1;
			if (Static520.aClass352_8 != Static41.aClass352_2) {
				Static82.aClass165_2.anInt4602 = Static82.aClass165_2.anInt4607 + 50000;
				Static82.aClass165_2.anInt4608 = Static82.aClass165_2.anInt4607 + 40000;
			}
			for (@Pc(39) int local39 = 0; local39 < Static59.aClass204_Sub1Array1.length; local39++) {
				if (arg0 == Static59.aClass204_Sub1Array1[local39].anInt6031) {
					Static687.anInt9943 = Static59.aClass204_Sub1Array1[local39].anInt6021;
				}
			}
			return true;
		}
		@Pc(69) String local69 = "";
		if (Static41.aClass352_2 != Static520.aClass352_8) {
			local69 = ":" + (arg0 + 7000);
		}
		@Pc(84) String local84 = "";
		if (Static506.aString97 != null) {
			local84 = "/p=" + Static506.aString97;
		}
		@Pc(148) String local148 = "http://" + arg1 + local69 + "/l=" + Static601.anInt9518 + "/a=" + Static99.anInt1987 + local84 + "/j" + (Static477.aBoolean381 ? "1" : "0") + ",o" + (Static566.aBoolean646 ? "1" : "0") + ",a2";
		try {
			Static635.aClient1.getAppletContext().showDocument(new URL(local148), "_self");
			return true;
		} catch (@Pc(167) Exception local167) {
			return false;
		}
	}
}
