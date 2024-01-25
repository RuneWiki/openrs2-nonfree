import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
	public static int anInt2766;

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_94 = new Class221(93, -2);

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "[Lclient!dm;")
	public static final Class2_Sub9_Sub2[] aClass2_Sub9_Sub2Array7 = new Class2_Sub9_Sub2[14];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)I")
	public static int method2513(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
