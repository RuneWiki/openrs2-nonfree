import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZI)V")
	public static void method1616() {
		@Pc(1) Class326 local1 = Static421.aClass326_42;
		synchronized (Static421.aClass326_42) {
			Static421.aClass326_42.method7241(5);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIBLclient!gba;II)Ljava/awt/Frame;")
	public static Frame method1617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class114 arg2, @OriginalArg(4) int arg3) {
		if (!arg2.method2505()) {
			return null;
		}
		@Pc(17) Class360[] local17 = Static276.method4279(arg2);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt9503 == arg3 && local17[local25].anInt9501 == arg0 && (!local23 || arg1 < local17[local25].anInt9499)) {
				arg1 = local17[local25].anInt9499;
				local23 = true;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(96) Class23 local96 = arg2.method2517(arg0, arg1, arg3);
		while (local96.anInt875 == 0) {
			Static423.method5918(10L);
		}
		@Pc(111) Frame local111 = (Frame) local96.anObject1;
		if (local111 == null) {
			return null;
		} else if (local96.anInt875 == 2) {
			Static67.method1437(arg2, local111);
			return null;
		} else {
			return local111;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII)V")
	public static void method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static487.anInt8210 <= arg4 - arg3 && Static278.anInt5111 >= arg3 + arg4 && Static126.anInt6658 <= arg5 - arg3 && Static494.anInt8295 >= arg5 + arg3) {
			Static526.method7176(arg1, arg5, arg0, arg3, arg4, arg2);
		} else {
			Static369.method5396(arg2, arg5, arg0, arg1, arg4, arg3);
		}
	}
}
