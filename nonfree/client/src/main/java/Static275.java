import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
	public static int anInt6176 = 0;

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
	public static int anInt6180 = 0;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)I")
	public static int method5399(@OriginalArg(0) int arg0) {
		if (Static386.aClass226_4 != null) {
			Static386.aClass226_4.method5543();
			Static386.aClass226_4 = null;
		}
		Static89.anInt1894++;
		if (Static89.anInt1894 > 4) {
			Static331.anInt6109 = 0;
			Static89.anInt1894 = 0;
			return arg0;
		}
		Static331.anInt6109 = 0;
		if (Static292.anInt5460 == Static327.anInt6033) {
			Static292.anInt5460 = Static236.anInt4682;
		} else {
			Static292.anInt5460 = Static327.anInt6033;
		}
		return -1;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)V")
	public static void method5400(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(3, arg0);
		local8.method1197();
	}
}
