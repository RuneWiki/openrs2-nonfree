import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public static int anInt3334;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	public static int anInt3336;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] aClass1_Sub3_Sub1_Sub1Array19;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public static int anInt3331 = -1;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1621 = Static187.method3089("Unexpected server response)3");

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1617 = aClass92_1621;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1619 = Static187.method3089("slide:");

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1618 = aClass92_1619;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1620 = Static187.method3089(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1622 = Static187.method3089("(U3");

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1623 = Static187.method3089("Abbrechen");

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1624 = aClass92_1619;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public static void method2506() {
		Static110.aClass77_7.method2260();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Lclient!ih;")
	public static Class48 method2508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass48_1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
	public static int method2509(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I")
	public static int method2511(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/Object;BLclient!d;)V")
	public static void method2512(@OriginalArg(0) Object arg0, @OriginalArg(2) Class24 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg1.anEventQueue1.peekEvent() != null; local15++) {
			Static199.method3292(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
