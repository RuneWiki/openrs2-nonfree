import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!vca", name = "D", descriptor = "I")
	public static int anInt10394;

	@OriginalMember(owner = "client!vca", name = "H", descriptor = "[I")
	public static final int[] anIntArray730 = new int[2048];

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "(I)V")
	public static void method9110(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static537.aBooleanArray25[local3] = true;
		}
		if (arg0 > -55) {
			method9112(66);
		}
	}

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "(B)Ljava/lang/String;")
	public static String method9111() {
		if (Static189.aBoolean301 || Static91.aClass2_Sub6_Sub20_2 == null) {
			return "";
		} else if ((Static91.aClass2_Sub6_Sub20_2.aString106 == null || Static91.aClass2_Sub6_Sub20_2.aString106.length() == 0) && Static91.aClass2_Sub6_Sub20_2.aString108 != null && Static91.aClass2_Sub6_Sub20_2.aString108.length() > 0) {
			return Static91.aClass2_Sub6_Sub20_2.aString108;
		} else {
			return Static91.aClass2_Sub6_Sub20_2.aString106;
		}
	}
}
