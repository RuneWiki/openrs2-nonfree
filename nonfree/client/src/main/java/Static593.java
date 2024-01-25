import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!tha;")
	public static Class132_Sub1 aClass132_Sub1_2;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	public static int anInt9880 = -1;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ha;II)Lclient!ac;")
	public static Class5 method8114(@OriginalArg(0) Class33 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub24 local15 = (Class3_Sub24) Static493.aClass307_47.method7424((long) arg1);
		if (local15 != null) {
			@Pc(22) Class3_Sub10_Sub2 local22 = local15.aClass187_Sub1_1.method5768();
			local15.aBoolean397 = true;
			if (local22 != null) {
				return local22.method1303(arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	public static void method8116(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static583.anInt9761 = arg1;
		Static202.anInt4720 = arg0;
		Static246.anInt5506 = 0;
		Static472.anInt6105 = 0;
	}
}
