import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!kq;")
	public static Class199 aClass199_9 = null;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIBLclient!lc;I)Ljava/awt/Frame;")
	public static Frame method4923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class207 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method4573()) {
			return null;
		}
		@Pc(22) Class249[] local22 = Static560.method7429(arg2);
		if (local22 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local22.length; local30++) {
			if (arg0 == local22[local30].anInt5845 && local22[local30].anInt5848 == arg3 && (!local28 || local22[local30].anInt5847 > arg1)) {
				local28 = true;
				arg1 = local22[local30].anInt5847;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(99) Class281 local99 = arg2.method4581(arg1, arg0, arg3);
		while (local99.anInt7338 == 0) {
			Static491.method6679(10L);
		}
		@Pc(114) Frame local114 = (Frame) local99.anObject17;
		if (local114 == null) {
			return null;
		} else if (local99.anInt7338 == 2) {
			Static494.method6885(arg2, local114);
			return null;
		} else {
			return local114;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!bt;Lclient!bt;I[I)V")
	public static void method4925(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int[] arg2) {
		Static201.aClass34_51 = arg1;
		if (arg2 != null) {
			Static368.anIntArray419 = arg2;
		}
		Static456.aClass34_96 = arg0;
	}
}
