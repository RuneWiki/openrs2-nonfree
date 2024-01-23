import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
	public static int anInt2195;

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
	public static int anInt2179 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLclient!uo;Ljava/lang/Object;)V")
	public static void method1972(@OriginalArg(1) Class176 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static16.method242(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZII[Lclient!si;II)V")
	public static void method1974(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class157[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = 0; local15 < arg2.length; local15++) {
			@Pc(27) Class157 local27 = arg2[local15];
			if (local27 != null && local27.anInt4671 == arg1) {
				Static62.method1107(local27, arg4, arg3, arg0);
				Static148.method2592(arg4, local27, arg3);
				if (local27.anInt4727 - local27.anInt4680 < local27.anInt4679) {
					local27.anInt4679 = local27.anInt4727 - local27.anInt4680;
				}
				if (local27.anInt4679 < 0) {
					local27.anInt4679 = 0;
				}
				if (local27.anInt4683 - local27.anInt4689 < local27.anInt4693) {
					local27.anInt4693 = local27.anInt4683 - local27.anInt4689;
				}
				if (local27.anInt4693 < 0) {
					local27.anInt4693 = 0;
				}
				if (local27.anInt4748 == 0) {
					Static39.method676(local27, arg0);
				}
			}
		}
	}
}
