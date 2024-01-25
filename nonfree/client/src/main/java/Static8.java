import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_1 = new Class236(50, 2);

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
	public static void method271() {
		Static339.aClass288_46.method6742();
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!ae;IIIZ)Ljava/awt/Frame;")
	public static Frame method273(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg1.method279()) {
			return null;
		}
		@Pc(17) Class196[] local17 = Static188.method3174(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt6049 == arg0 && arg3 == local17[local25].anInt6050 && (!local23 || arg2 < local17[local25].anInt6048)) {
				local23 = true;
				arg2 = local17[local25].anInt6048;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(95) Class83 local95 = arg1.method280(arg2, arg0, arg3);
		while (local95.anInt2495 == 0) {
			Static213.method3465(10L);
		}
		@Pc(121) Frame local121 = (Frame) local95.anObject8;
		if (local121 == null) {
			return null;
		} else if (local95.anInt2495 == 2) {
			Static133.method2511(arg1, local121);
			return null;
		} else {
			return local121;
		}
	}
}
