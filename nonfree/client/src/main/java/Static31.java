import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
	public static int anInt6065;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
	public static int anInt6061 = 0;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public static int anInt6062 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
	public static int method4737() {
		return 2;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZIII)I")
	public static int method4738(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(8) Class3_Sub32 local8 = Static238.method3609(arg2, false);
		if (local8 == null) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		for (@Pc(22) int local22 = 0; local22 < local8.anIntArray339.length; local22++) {
			if (local8.anIntArray339[local22] >= 0 && Static314.aClass12_2.anInt408 > local8.anIntArray339[local22]) {
				@Pc(46) Class81 local46 = Static314.aClass12_2.method327(local8.anIntArray339[local22]);
				@Pc(58) int local58 = local46.method1951(Static318.aClass26_5.method691(arg1).anInt6133, arg1);
				if (arg0) {
					local14 += local8.anIntArray340[local22] * local58;
				} else {
					local14 += local58;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
	public static void method4739(@OriginalArg(0) int arg0) {
		if (!Static374.aClass20_Sub1_1.aBoolean194) {
			arg0 = -1;
		}
		if (arg0 == Static251.anInt4762) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class113 local25 = Static239.aClass263_2.method5814(arg0);
			@Pc(29) Class264 local29 = local25.method2749();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static66.aClass143_2.method3404(local29.method5841(), local29.method5836(), local29.method5843(), new Point(local25.anInt3415, local25.anInt3421), Static392.aCanvas6);
				Static251.anInt4762 = arg0;
			}
		}
		if (arg0 == -1 && Static251.anInt4762 != -1) {
			Static66.aClass143_2.method3404(-1, -1, null, new Point(), Static392.aCanvas6);
			Static251.anInt4762 = -1;
		}
	}
}
