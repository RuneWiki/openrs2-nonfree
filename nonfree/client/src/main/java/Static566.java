import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
	public static int anInt10281;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
	public static int anInt10283;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Lclient!q;")
	public static Class81 aClass81_6;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "Lclient!vo;")
	public static Class348 aClass348_130;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)I")
	public static int method7998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(24) int local24 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local24;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZ)I")
	public static int method8000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(30) double local30 = (local10 - local22) * Math.random() + local22;
		return (int) (Math.pow(2.0D, local30) + 0.5D);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIBIIII)V")
	public static void method8001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg2);
		@Pc(17) int local17 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg4);
		@Pc(23) int local23 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg5);
		@Pc(29) int local29 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg3);
		@Pc(37) int local37 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg0 + arg2);
		@Pc(46) int local46 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg4 - arg0);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static238.method3886(Static442.anIntArrayArray48[local48], local29, arg1, local23);
		}
		for (@Pc(76) int local76 = local17; local76 > local46; local76--) {
			Static238.method3886(Static442.anIntArrayArray48[local76], local29, arg1, local23);
		}
		@Pc(98) int local98 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg0 + arg5);
		@Pc(106) int local106 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg3 - arg0);
		for (@Pc(108) int local108 = local37; local108 <= local46; local108++) {
			@Pc(114) int[] local114 = Static442.anIntArrayArray48[local108];
			Static238.method3886(local114, local98, arg1, local23);
			Static238.method3886(local114, local29, arg1, local106);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
	public static void method8002() {
		Static10.aClass22_10.method886();
		Static328.anInt6426 = 0;
	}
}
