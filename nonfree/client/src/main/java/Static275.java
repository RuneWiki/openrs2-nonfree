import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
	public static int anInt4927;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIZIIII)V")
	public static void method4147(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class57_Sub6 local10 = (Class57_Sub6) Static298.aClass111_4.method2688(); local10 != null; local10 = (Class57_Sub6) Static298.aClass111_4.method2690()) {
			if (local10.anInt4849 <= Static66.anInt1741) {
				local10.method5359();
			} else {
				Static100.method1821((local10.anInt4851 << 7) + 64, arg2 >> 1, arg3 >> 1, local10.anInt4854, local10.anInt4850 * 2, (local10.anInt4856 << 7) + 64);
				Static236.aClass29_2.method4795(Static247.anIntArray317[0] + arg0, local10.aString32, arg1 + Static247.anIntArray317[1], local10.anInt4857 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!qp;Lclient!qp;IZIZI)I")
	public static int method4148(@OriginalArg(0) Class152_Sub1 arg0, @OriginalArg(1) Class152_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static146.method2489(arg1, arg0, arg2, arg3);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(41) int local41 = Static146.method2489(arg1, arg0, arg5, arg4);
			return arg4 ? -local41 : local41;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLclient!eq;)V")
	public static void method4149(@OriginalArg(1) Class66 arg0) {
		if (Static250.aBoolean294) {
			Static30.method752(arg0);
		} else {
			Static189.method3017(arg0);
		}
	}
}
