import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!qa;")
	public static Class26 aClass26_4;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_2;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_81 = new Class81(39, -1);

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_82 = new Class81(58, 8);

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[B")
	public static final byte[] aByteArray109 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
	public static final int[] anIntArray250 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
	public static int method2920(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
	public static void method2921(@OriginalArg(1) int arg0) {
		Static237.anInt4617 = arg0;
		@Pc(7) Class129 local7 = Static205.aClass129_33;
		synchronized (Static205.aClass129_33) {
			Static205.aClass129_33.method3025();
		}
		local7 = Static115.aClass129_58;
		synchronized (Static115.aClass129_58) {
			Static115.aClass129_58.method3025();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!sq;)I")
	public static int method2922(@OriginalArg(1) Class4_Sub2_Sub2_Sub2 arg0) {
		@Pc(8) Class215 local8 = arg0.aClass215_1;
		if (local8.anIntArray400 != null) {
			local8 = local8.method4795(Static215.aClass225_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt6013;
		@Pc(34) Class12 local34 = arg0.method5131();
		if (arg0.aBoolean561) {
			local23 = local8.anInt6028;
		} else if (local34.anInt334 == arg0.anInt6458 || arg0.anInt6458 == local34.anInt330 || local34.anInt336 == arg0.anInt6458 || local34.anInt361 == arg0.anInt6458) {
			local23 = local8.anInt6016;
		} else if (local34.anInt335 == arg0.anInt6458 || arg0.anInt6458 == local34.anInt364 || local34.anInt351 == arg0.anInt6458 || arg0.anInt6458 == local34.anInt322) {
			local23 = local8.anInt6017;
		}
		return local23;
	}
}
