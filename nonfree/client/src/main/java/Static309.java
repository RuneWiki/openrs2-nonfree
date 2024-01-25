import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!pm", name = "L", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "Lclient!tk;")
	public static final Class239 aClass239_8 = new Class239();

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "[Lclient!jv;")
	public static final Class142[] aClass142Array1 = new Class142[30];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method4054(@OriginalArg(0) Class4_Sub9 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static275.anInt4587; local7++) {
			@Pc(13) int local13 = arg0.method5033();
			@Pc(17) int local17 = arg0.method5028();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static12.aClass176_Sub1Array1[local13] != null) {
				Static12.aClass176_Sub1Array1[local13].anInt4256 = local17;
			}
		}
	}
}
