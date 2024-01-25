import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static int anInt3168;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V")
	public static void method2650() {
		@Pc(1) Class94 local1 = Static521.aClass94_62;
		synchronized (Static521.aClass94_62) {
			Static521.aClass94_62.method2958(5);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IJII)V")
	public static void method2651(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(24) int local24 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static168.method3192(local17, 0, 0, local10, arg2, arg1, true, 0);
			return;
		}
		@Pc(46) Class356 local46 = Static249.aClass310_1.method7474(local24);
		@Pc(57) int local57;
		@Pc(60) int local60;
		if (local17 == 0 || local17 == 2) {
			local57 = local46.anInt10250;
			local60 = local46.anInt10238;
		} else {
			local57 = local46.anInt10238;
			local60 = local46.anInt10250;
		}
		@Pc(71) int local71 = local46.anInt10218;
		if (local17 != 0) {
			local71 = (local71 << local17 & 0xF) + (local71 >> 4 - local17);
		}
		Static168.method3192(0, local71, local60, 0, arg2, arg1, true, local57);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)Lclient!lu;")
	public static Class191 method2652(@OriginalArg(0) int arg0) {
		@Pc(15) Class191 local15 = (Class191) Static454.aClass94_42.method2960((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static586.aClass223_52.method5954(arg0, 0);
		local15 = new Class191();
		if (local25 != null) {
			local15.method5543(new Class6_Sub8(local25), arg0);
		}
		Static454.aClass94_42.method2963((long) arg0, local15);
		return local15;
	}
}
