import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
	public static int anInt4244;

	@OriginalMember(owner = "client!lg", name = "cb", descriptor = "[Lclient!co;")
	public static Class43[] aClass43Array1 = new Class43[50];

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBIII)V")
	public static void method3347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg2 + 1;
		Static298.method3977(arg3, arg1, arg4, Static194.anIntArrayArray28[arg2]);
		@Pc(21) int local21 = arg0 - 1;
		Static298.method3977(arg3, arg1, arg4, Static194.anIntArrayArray28[arg0]);
		for (@Pc(33) int local33 = local8; local33 <= local21; local33++) {
			@Pc(39) int[] local39 = Static194.anIntArrayArray28[local33];
			local39[arg3] = local39[arg4] = arg1;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!nt;IIII)Ljava/awt/Frame;")
	public static Frame method3351(@OriginalArg(0) int arg0, @OriginalArg(1) Class177 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1.method3843()) {
			return null;
		}
		@Pc(25) Class174[] local25 = Static25.method357(arg1);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (arg0 == local25[local33].anInt4753 && local25[local33].anInt4754 == arg2 && (!local31 || arg3 < local25[local33].anInt4752)) {
				local31 = true;
				arg3 = local25[local33].anInt4752;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(102) Class253 local102 = arg1.method3855(arg2, arg3, arg0);
		while (local102.anInt6669 == 0) {
			Static331.method4343(10L);
		}
		@Pc(114) Frame local114 = (Frame) local102.anObject9;
		if (local114 == null) {
			return null;
		} else if (local102.anInt6669 == 2) {
			Static98.method1146(arg1, local114);
			return null;
		} else {
			return local114;
		}
	}
}
