import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
	public static int anInt9140;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sia;I)V")
	public static void method7990(@OriginalArg(0) Class3_Sub1 arg0) {
		arg0.aBoolean455 = false;
		if (arg0.aClass3_Sub35_6 != null) {
			arg0.aClass3_Sub35_6.anInt5393 = 0;
		}
		for (@Pc(21) Class3_Sub1 local21 = arg0.method5778(); local21 != null; local21 = arg0.method5782()) {
			method7990(local21);
		}
	}
}
