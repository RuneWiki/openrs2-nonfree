import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static725 {

	@OriginalMember(owner = "client!wu", name = "G", descriptor = "Lclient!ik;")
	public static Class182 aClass182_131;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "I")
	public static int anInt11246 = -2;

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
	public static int anInt11247 = -1;

	@OriginalMember(owner = "client!wu", name = "K", descriptor = "I")
	public static int anInt11253 = -1;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZ)V")
	public static void method9584(@OriginalArg(1) boolean arg0) {
		if (Static397.aClass325_1 == null) {
			Static645.method8481();
		}
		if (arg0) {
			Static397.aClass325_1.method7277();
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Z)V")
	public static void method9586() {
		@Pc(18) Class3_Sub29 local18 = Static507.method6901(Static692.aClass144_108, Static95.aClass292_2.aClass88_2);
		local18.aClass3_Sub2_Sub1_1.method2018(Static407.anInt6329);
		Static95.aClass292_2.method6855(local18);
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(III)Z")
	public static boolean method9587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
