import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "Lclient!hf;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!he", name = "hb", descriptor = "Lclient!wf;")
	public static Class8_Sub24 aClass8_Sub24_5;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "Lclient!ic;")
	public static Class34 aClass34_678 = Static56.method816("null");

	@OriginalMember(owner = "client!he", name = "U", descriptor = "[[I")
	public static int[][] anIntArrayArray10 = new int[104][104];

	@OriginalMember(owner = "client!he", name = "V", descriptor = "Lclient!ic;")
	private static Class34 aClass34_679 = Static56.method816("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_680 = aClass34_679;

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
	public static int anInt1346 = 0;

	@OriginalMember(owner = "client!he", name = "ib", descriptor = "Lclient!ic;")
	public static Class34 aClass34_681 = Static56.method816("leuchten1:");

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	public static void method763() {
		aClass8_Sub24_5 = null;
		aClass34_678 = null;
		aClass34_681 = null;
		anIntArrayArray10 = null;
		aClass34_679 = null;
		aClass31_1 = null;
		aClass34_680 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!dd;Z)V")
	public static void method764(@OriginalArg(0) Class14 arg0) {
		Static106.aClass14_26 = arg0;
		Static31.anInt864 = Static106.aClass14_26.method1144(16);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	public static void method765() {
		Static100.aClass48_45.method1101();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!je;Ljava/lang/Object;B)V")
	public static void method766(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < 50 && arg0.anEventQueue1.peekEvent() != null; local9++) {
			Static107.method1511(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
	public static int method767() {
		return Static39.anInt962++;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBI)I")
	public static int method769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class8_Sub18 local7 = null;
		for (@Pc(17) Class8_Sub18 local17 = (Class8_Sub18) Static20.aClass49_2.method1107(); local17 != null; local17 = (Class8_Sub18) Static20.aClass49_2.method1109()) {
			if (local17.anInt2373 == arg0 && local17.anInt2367 == arg1 && local17.anInt2377 == arg2 && arg8 == local17.anInt2378) {
				local7 = local17;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class8_Sub18();
			local7.anInt2367 = arg1;
			local7.anInt2377 = arg2;
			local7.anInt2378 = arg8;
			local7.anInt2373 = arg0;
			Static18.method304(local7);
			Static20.aClass49_2.method1114(local7);
		}
		local7.anInt2366 = arg4;
		local7.anInt2368 = arg5;
		local7.anInt2379 = arg7;
		local7.anInt2372 = arg3;
		local7.anInt2369 = arg6;
	}
}
