import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array43;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!iq;")
	public static Class104 aClass104_143;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_40 = new Class107(64);

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "[J")
	public static final long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_175 = new Class157(79, 4);

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!jg;")
	public static Class107 aClass107_41 = new Class107(128);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
	public static void method4704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static108.anInt2266 <= arg4 - arg0 && Static205.anInt4504 >= arg4 + arg0 && Static197.anInt4298 <= arg5 - arg0 && Static38.anInt553 >= arg5 + arg0) {
			Static212.method3982(arg3, arg1, arg2, arg5, arg4, arg0);
		} else {
			Static260.method4616(arg5, arg4, arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIILclient!gr;IB)V")
	public static void method4705(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class84 arg4, @OriginalArg(5) int arg5) {
		if (Static191.anInt4213 >= 50 || (arg4 == null || arg4.anIntArrayArray22 == null || arg1 >= arg4.anIntArrayArray22.length || arg4.anIntArrayArray22[arg1] == null)) {
			return;
		}
		@Pc(36) int local36 = arg4.anIntArrayArray22[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(69) int local69;
		if (arg4.anIntArrayArray22[arg1].length > 1) {
			local69 = (int) ((double) arg4.anIntArrayArray22[arg1].length * Math.random());
			if (local69 > 0) {
				local40 = arg4.anIntArrayArray22[arg1][local69];
			}
		}
		if (local50 == 0) {
			if (arg0) {
				Static197.method3643(255, local40, 0, local46);
			}
		} else if (Static46.anInt752 != 0) {
			Static300.anIntArray461[Static191.anInt4213] = local40;
			Static236.anIntArray88[Static191.anInt4213] = local46;
			Static186.anIntArray310[Static191.anInt4213] = 0;
			Static226.aClass135Array1[Static191.anInt4213] = null;
			Static241.anIntArray398[Static191.anInt4213] = 255;
			local69 = (arg3 - 64) / 128;
			@Pc(132) int local132 = (arg2 - 64) / 128;
			Static312.anIntArray478[Static191.anInt4213] = (local69 << 16) + (arg5 << 24) + (local132 << 8) + local50;
			Static191.anInt4213++;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!rs;")
	public static Class177 method4707(@OriginalArg(0) int arg0) {
		@Pc(5) Class107 local5 = Static298.aClass107_46;
		@Pc(14) Class177 local14;
		synchronized (Static298.aClass107_46) {
			local14 = (Class177) Static298.aClass107_46.method3021((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = aClass104_143.method2756(Static221.method4179(arg0), Static359.method5730(arg0));
		local14 = new Class177();
		local14.anInt5802 = arg0;
		if (local34 != null) {
			local14.method4857(new Class2_Sub12(local34));
		}
		@Pc(63) Class107 local63 = Static298.aClass107_46;
		synchronized (Static298.aClass107_46) {
			Static298.aClass107_46.method3018((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
	public static void method4708(@OriginalArg(0) int arg0) {
		if (Static266.anIntArray431 == null || arg0 > Static266.anIntArray431.length) {
			Static266.anIntArray431 = new int[arg0];
		}
	}
}
