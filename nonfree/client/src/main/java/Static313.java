import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "Lclient!al;")
	public static final Class11 aClass11_130 = new Class11(16);

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
	public static int anInt6041 = 0;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
	public static int anInt6042 = 0;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
	public static int anInt6043 = 0;

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
	public static int anInt6044 = -1;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)V")
	public static void method5400() {
		for (@Pc(10) Class14_Sub2_Sub1 local10 = (Class14_Sub2_Sub1) Static69.aClass18_5.method459(); local10 != null; local10 = (Class14_Sub2_Sub1) Static69.aClass18_5.method453()) {
			@Pc(15) Class10_Sub3_Sub4 local15 = local10.aClass10_Sub3_Sub4_1;
			if (Static219.anInt4400 != local15.aByte64 || local15.anInt3634 < Static153.anInt3257) {
				local10.method5986();
				local15.method3434();
			} else if (local15.anInt3633 <= Static153.anInt3257) {
				if (local15.anInt3621 > 0) {
					@Pc(41) Class10_Sub3_Sub3_Sub1 local41 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local15.anInt3621 - 1];
					if (local41 != null && local41.anInt5910 >= 0 && local41.anInt5910 < Static195.anInt3965 * 128 && local41.anInt5908 >= 0 && Static298.anInt5716 * 128 > local41.anInt5908) {
						local15.method3436(local41.anInt5910, Static153.anInt3257, local41.anInt5908, Static279.method4730(local15.aByte64, local41.anInt5910, local41.anInt5908) - local15.anInt3632);
					}
				}
				if (local15.anInt3621 < 0) {
					@Pc(96) int local96 = -local15.anInt3621 - 1;
					@Pc(103) Class10_Sub3_Sub3_Sub2 local103;
					if (local96 == Static266.anInt5054) {
						local103 = Static173.aClass10_Sub3_Sub3_Sub2_1;
					} else {
						local103 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local96];
					}
					if (local103 != null && local103.anInt5910 >= 0 && local103.anInt5910 < Static195.anInt3965 * 128 && local103.anInt5908 >= 0 && Static298.anInt5716 * 128 > local103.anInt5908) {
						local15.method3436(local103.anInt5910, Static153.anInt3257, local103.anInt5908, Static279.method4730(local15.aByte64, local103.anInt5910, local103.anInt5908) - local15.anInt3632);
					}
				}
				local15.method3435(Static71.anInt5636);
				Static194.method3667(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)V")
	public static void method5401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class193 local3 = new Class193();
		local3.anInt5844 = arg1 >> 7;
		local3.anInt5835 = arg2 >> 7;
		local3.anInt5829 = arg3 >> 7;
		local3.anInt5837 = arg4 >> 7;
		local3.anInt5845 = arg0;
		local3.anInt5832 = arg1;
		local3.anInt5830 = arg2;
		local3.anInt5833 = arg3;
		local3.anInt5849 = arg4;
		local3.anInt5834 = arg5;
		local3.anInt5841 = arg6;
		Static43.aClass193Array1[Static63.anInt1526++] = local3;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Lclient!aq;")
	public static Class10_Sub2 method5403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_Sub2_1;
	}
}
