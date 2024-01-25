import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public static int anInt3841;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_50 = new Class98(115, 2);

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!faa;")
	public static Class97 aClass97_11 = null;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!oa;IIIIII)Lclient!ba;")
	public static Class24 method3329(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class24 local12 = (Class24) Static342.aClass330_35.method7677(local6);
		if (local12 == null) {
			@Pc(22) Class134 local22 = Static311.method4670(Static509.aClass248_75, arg4);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt3869 < 13) {
				local22.method3345();
			}
			local12 = arg0.method7464(local22, 2055, Static70.anInt1184, 64, 768);
			Static342.aClass330_35.method7676(local12, local6);
		}
		local12 = local12.method7398((byte) 2, 2055, true);
		if (arg2 != 0) {
			local12.I(arg2);
		}
		if (arg5 != 0) {
			local12.AA(arg5);
		}
		if (arg1 != 0) {
			local12.v(arg1);
		}
		if (arg3 != 0) {
			local12.m(0, arg3, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/Object;Lclient!tt;Z)V")
	public static void method3330(@OriginalArg(0) Object arg0, @OriginalArg(1) Class313 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static183.method3079(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(42) Exception local42) {
		}
	}
}
