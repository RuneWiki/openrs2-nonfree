import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
	public static int anInt7397;

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "Lclient!me;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "[I")
	public static int[] anIntArray438;

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
	public static int anInt7395 = 13156520;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	public static void method6445() {
		@Pc(16) byte[] local16;
		if (Static381.anObject12 == null) {
			@Pc(9) Class60_Sub1_Sub2 local9 = new Class60_Sub1_Sub2();
			local16 = local9.method5677();
			Static381.anObject12 = Static72.method1167(local16);
		}
		if (Static655.anObject21 == null) {
			@Pc(34) Class60_Sub2_Sub1 local34 = new Class60_Sub2_Sub1();
			local16 = local34.method8930();
			Static655.anObject21 = Static72.method1167(local16);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(CB)Z")
	public static boolean method6447(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
