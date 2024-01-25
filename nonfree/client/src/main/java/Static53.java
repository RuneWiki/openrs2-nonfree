import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static53 {

	@OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
	public static int anInt1098;

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "Lclient!wn;")
	public static final Class2_Sub22_Sub2 aClass2_Sub22_Sub2_1 = new Class2_Sub22_Sub2(7500);

	@OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
	public static final int anInt1099 = -1;

	@OriginalMember(owner = "client!bu", name = "r", descriptor = "[S")
	public static short[] aShortArray21 = new short[256];

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!paa;I)V")
	public static void method844(@OriginalArg(0) Class261 arg0) {
		if (arg0.anInt6635 == 5 && arg0.anInt6585 != -1) {
			Static63.method8323(arg0, Static192.aClass95_4);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)V")
	public static void method846(@OriginalArg(1) int arg0) {
		if (Static317.anInt5047 == 0) {
			Static267.aClass2_Sub13_Sub3_3.method6126(arg0);
		} else {
			Static33.anInt738 = arg0;
		}
	}
}
