import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!am", name = "q", descriptor = "Lclient!au;")
	public static final Class22 aClass22_42 = new Class22();

	@OriginalMember(owner = "client!am", name = "y", descriptor = "F")
	public static float aFloat153 = 0.25F;

	@OriginalMember(owner = "client!am", name = "E", descriptor = "Z")
	public static boolean aBoolean432 = false;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!r;IILclient!nf;I)V")
	public static void method4947(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class233 arg4) {
		@Pc(9) Class23 local9 = Static259.aClass249_2.method5889(arg4.anInt6701);
		if (local9.anInt1014 == -1) {
			return;
		}
		if (arg4.aBoolean455) {
			@Pc(24) int local24 = arg3 + arg4.anInt6705;
			arg3 = local24 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(40) Class88 local40 = local9.method900(arg4.aBoolean461, arg3, arg1);
		if (local40 == null) {
			return;
		}
		@Pc(46) int local46 = arg4.anInt6718;
		@Pc(49) int local49 = arg4.anInt6665;
		if ((arg3 & 0x1) == 1) {
			local46 = arg4.anInt6665;
			local49 = arg4.anInt6718;
		}
		@Pc(63) int local63 = local40.A();
		@Pc(66) int local66 = local40.ca();
		if (local9.aBoolean93) {
			local63 = local46 * 4;
			local66 = local49 * 4;
		}
		if (local9.anInt1015 == 0) {
			local40.method8046(arg2, arg0 - (local49 - 1) * 4, local63, local66);
		} else {
			local40.method8049(arg2, arg0 + 4 - local49 * 4, local63, local66, 0, local9.anInt1015 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!dq;Z)V")
	public static void method4957(@OriginalArg(0) Class79 arg0) {
		Static180.aClass79_4 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(IB)Lclient!dj;")
	public static Class74 method4958(@OriginalArg(0) int arg0) {
		@Pc(10) Class74 local10 = (Class74) Static218.aClass167_16.method3966((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static457.aClass348_107.method7964(arg0, 0);
		local10 = new Class74();
		if (local28 != null) {
			local10.method1892(new Class4_Sub13(local28), arg0);
		}
		Static218.aClass167_16.method3974((long) arg0, local10);
		return local10;
	}
}
