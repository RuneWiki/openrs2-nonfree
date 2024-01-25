import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
	public static int anInt6023;

	@OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
	public static int anInt6025;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "Lclient!an;")
	public static final Class11 aClass11_36 = new Class11(16);

	@OriginalMember(owner = "client!nn", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[200];

	@OriginalMember(owner = "client!nn", name = "A", descriptor = "Lclient!op;")
	public static final Class182 aClass182_9 = new Class182("WTRC", 1);

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V")
	public static void method4712() {
		try {
			if (Static410.anInt6753 == 1) {
				@Pc(15) int local15 = Static452.aClass3_Sub5_Sub4_3.method5125();
				if (local15 > 0 && Static452.aClass3_Sub5_Sub4_3.method5151()) {
					local15 -= Static301.anInt2467;
					if (local15 < 0) {
						local15 = 0;
					}
					Static452.aClass3_Sub5_Sub4_3.method5155(local15);
				} else {
					Static452.aClass3_Sub5_Sub4_3.method5157();
					Static452.aClass3_Sub5_Sub4_3.method5129();
					Static36.aClass140_1 = null;
					Static48.aClass3_Sub40_1 = null;
					if (Static50.aClass32_21 == null) {
						Static410.anInt6753 = 0;
					} else {
						Static410.anInt6753 = 2;
					}
				}
			}
		} catch (@Pc(53) Exception local53) {
			local53.printStackTrace();
			Static452.aClass3_Sub5_Sub4_3.method5157();
			Static48.aClass3_Sub40_1 = null;
			Static36.aClass140_1 = null;
			Static410.anInt6753 = 0;
			Static50.aClass32_21 = null;
		}
	}
}
