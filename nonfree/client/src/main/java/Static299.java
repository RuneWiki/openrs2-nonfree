import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
	public static int anInt5988;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Z")
	public static boolean aBoolean428 = false;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	public static int anInt5987 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4908(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(22) Class8_Sub31 local22 = Static51.method1418(Static280.aClass257_51, Static608.aClass336_1);
			local22.aClass8_Sub8_Sub2_1.method8562(Static643.method8631(arg0));
			local22.aClass8_Sub8_Sub2_1.method8582(arg0);
			Static262.method4604(local22);
		}
	}
}
