import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static382 {

	@OriginalMember(owner = "client!mja", name = "l", descriptor = "I")
	public static int anInt6717;

	@OriginalMember(owner = "client!mja", name = "i", descriptor = "I")
	public static int anInt6719 = 100;

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(ILclient!v;Lclient!v;)V")
	public static void method5867(@OriginalArg(1) Class14_Sub2 arg0, @OriginalArg(2) Class14_Sub2 arg1) {
		if (arg1.aClass14_Sub2_66 != null) {
			arg1.method9093();
		}
		arg1.aClass14_Sub2_66 = arg0.aClass14_Sub2_66;
		arg1.aClass14_Sub2_67 = arg0;
		arg1.aClass14_Sub2_66.aClass14_Sub2_67 = arg1;
		arg1.aClass14_Sub2_67.aClass14_Sub2_66 = arg1;
	}
}
