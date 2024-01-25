import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fu", name = "A", descriptor = "Z")
	public static boolean aBoolean304 = true;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BIIIII)V")
	public static void method3583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static237.anInt5159 < arg3 || Static380.anInt7421 > arg2) {
			return;
		}
		@Pc(27) boolean local27;
		if (arg4 < Static161.anInt7734) {
			arg4 = Static161.anInt7734;
			local27 = false;
		} else if (arg4 <= Static38.anInt823) {
			local27 = true;
		} else {
			local27 = false;
			arg4 = Static38.anInt823;
		}
		@Pc(46) boolean local46;
		if (Static161.anInt7734 > arg0) {
			arg0 = Static161.anInt7734;
			local46 = false;
		} else if (arg0 > Static38.anInt823) {
			arg0 = Static38.anInt823;
			local46 = false;
		} else {
			local46 = true;
		}
		if (arg3 < Static380.anInt7421) {
			arg3 = Static380.anInt7421;
		} else {
			Static280.method5108(arg0, Static208.anIntArrayArray20[arg3++], arg4, arg1);
		}
		if (arg2 <= Static237.anInt5159) {
			Static280.method5108(arg0, Static208.anIntArrayArray20[arg2--], arg4, arg1);
		} else {
			arg2 = Static237.anInt5159;
		}
		@Pc(109) int local109;
		if (local27 && local46) {
			for (local109 = arg3; local109 <= arg2; local109++) {
				@Pc(151) int[] local151 = Static208.anIntArrayArray20[local109];
				local151[arg4] = local151[arg0] = arg1;
			}
		} else if (local27) {
			for (local109 = arg3; local109 <= arg2; local109++) {
				Static208.anIntArrayArray20[local109][arg4] = arg1;
			}
		} else if (local46) {
			for (local109 = arg3; local109 <= arg2; local109++) {
				Static208.anIntArrayArray20[local109][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3584(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBLclient!in;)Lclient!mi;")
	public static Class46 method3585(@OriginalArg(0) int arg0, @OriginalArg(2) Class157 arg1) {
		@Pc(10) Class46 local10 = (Class46) Static121.aClass169_57.method5002((long) arg0);
		if (local10 == null) {
			if (Static549.aBoolean684) {
				local10 = Static186.aClass20_4.method7294(Static652.method7574(arg1, arg0), true);
			} else {
				local10 = Static551.method2897(arg1.method4569(arg0));
			}
			Static121.aClass169_57.method5001(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLjava/lang/Object;Lclient!wea;)V")
	public static void method3586(@OriginalArg(1) Object arg0, @OriginalArg(2) Class370 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static190.method3914(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(44) Exception local44) {
		}
	}
}
