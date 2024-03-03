import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public static int anInt5339;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Z")
	public static boolean aBoolean383;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
	public static int anInt5340;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Lclient!r;")
	public static Class197 aClass197_68;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)V", line = 9)
	public static void method4876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class2_Sub2_Sub7 local16 = Static293.method5414(15, 0);
		local16.method2313();
		local16.anInt2287 = arg1;
		local16.anInt2286 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ml;Ljava/lang/Object;I)V", line = 23)
	public static void method4877(@OriginalArg(0) Class152 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static214.method4024(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
