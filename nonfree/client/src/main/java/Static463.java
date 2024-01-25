import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_155 = new Class126(86, 7);

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "Lclient!wm;")
	public static final Class393 aClass393_6 = new Class393();

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "Z")
	public static boolean aBoolean600 = false;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	public static void method6658() {
		for (@Pc(7) int local7 = 0; local7 < Static228.anInt2286; local7++) {
			@Pc(13) Class303 local13 = Static631.aClass303Array2[local7];
			if (local13.aByte109 == 3) {
				if (local13.aClass3_Sub9_Sub2_4 == null) {
					local13.anInt8507 = Integer.MIN_VALUE;
				} else {
					Static557.aClass3_Sub9_Sub1_2.method1420(local13.aClass3_Sub9_Sub2_4);
				}
			}
		}
	}
}
