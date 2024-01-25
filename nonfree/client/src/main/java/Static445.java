import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "Lclient!f;")
	public static Class76 aClass76_22;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	public static int anInt7762;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	public static int anInt7767;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)Z")
	public static boolean method6017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V")
	public static void method6018(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub2 local12 = Static15.method236(arg0, 1);
		local12.method435();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)I")
	public static int method6019(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static369.method5166(arg0 - 1, arg1 + -1) + Static369.method5166(arg0 + 1, arg1 + -1) + Static369.method5166(arg0 - 1, arg1 - -1) + Static369.method5166(arg0 + 1, arg1 + 1);
		@Pc(79) int local79 = Static369.method5166(arg0 - 1, arg1) + Static369.method5166(arg0 + 1, arg1) + Static369.method5166(arg0, arg1 + -1) + Static369.method5166(arg0, arg1 - -1);
		@Pc(86) int local86 = Static369.method5166(arg0, arg1);
		return local86 / 4 + local45 / 16 + local79 / 8;
	}
}
