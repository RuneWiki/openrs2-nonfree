import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_233 = new Class338();

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	public static void method9117() {
		Static441.aClass165_50.method4394(50);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZIII)V")
	public static void method9118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		if (arg0 < arg3) {
			for (local22 = arg0; local22 < arg3; local22++) {
				Static392.anIntArrayArray39[local22][arg2] = arg1;
			}
		} else {
			for (local22 = arg3; local22 < arg0; local22++) {
				Static392.anIntArrayArray39[local22][arg2] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIILclient!or;)V")
	public static void method9119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class260 arg2) {
		Static53.anInt1109 = arg0;
		Static218.aClass260_10 = arg2;
		Static651.anInt10355 = arg1;
	}
}
