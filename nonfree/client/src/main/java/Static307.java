import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "Lclient!wk;")
	public static Class264 aClass264_49;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)I")
	public static int method5819(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(19) int local19 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local19 == 0) {
				return 1;
			}
			if (local19 == 1) {
				return 2;
			}
			if (local19 == 2) {
				return 4;
			}
			if (local19 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local19 == 0) {
				return 16;
			}
			if (local19 == 1) {
				return 32;
			}
			if (local19 == 2) {
				return 64;
			}
			if (local19 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	public static void method5820() {
		Static416.anInt7072 = -1;
		Static195.aClass3_8 = null;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)V")
	public static void method5823(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg0, 2);
		local8.method2761();
	}
}
