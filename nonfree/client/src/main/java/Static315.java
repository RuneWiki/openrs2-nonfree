import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "Lclient!kfa;")
	public static Class178 aClass178_10;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
	public static int anInt6423 = 13156520;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Lclient!fj;")
	public static Class100 method5366() {
		return Static480.method7068();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZ)V")
	public static void method5367(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(15) Class3_Sub26 local15 = Static640.method8636(Static230.aClass344_57, Static403.aClass294_3);
			local15.aClass3_Sub15_Sub1_3.method8464(arg0);
			Static472.method5189(local15);
		} else {
			Static84.method2218(Static236.aClass229_4, arg0, -1);
		}
	}
}
