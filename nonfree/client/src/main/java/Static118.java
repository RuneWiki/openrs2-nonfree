import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] aClass3_Sub2_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!pb", name = "db", descriptor = "[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] aClass3_Sub2_Sub2_Sub4Array4;

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "Lclient!fe;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!pb", name = "ib", descriptor = "[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] aClass3_Sub2_Sub2_Sub4Array5;

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_992 = Static170.method3101("Benutzen");

	@OriginalMember(owner = "client!pb", name = "Z", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(IBI)I")
	public static int method2368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class3_Sub15 local6 = (Class3_Sub15) Static1.aClass87_1.method3201((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(32) int local32 = 0; local32 < local6.anIntArray474.length; local32++) {
				if (local6.anIntArray473[local32] == arg1) {
					local22 += local6.anIntArray474[local32];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
	public static void method2369() {
		aClass3_Sub2_Sub2_Sub4Array4 = null;
		aClass3_Sub2_Sub2_Sub4Array3 = null;
		aClass28_992 = null;
		aBooleanArray13 = null;
		aClass3_Sub2_Sub2_Sub4Array5 = null;
		aClass9_1 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIBII)V")
	public static void method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static60.aClass3_Sub2_Sub2_Sub3Array5[0].method840(arg0, arg3);
		@Pc(13) int local13 = arg1 * (arg1 - 32) / arg4;
		if (local13 < 8) {
			local13 = 8;
		}
		Static60.aClass3_Sub2_Sub2_Sub3Array5[1].method840(arg0, arg1 + arg3 - 16);
		@Pc(48) int local48 = (arg1 - local13 - 32) * arg2 / (arg4 - arg1);
		Static147.method1775(arg0, arg3 + 16, 16, arg1 - 32, Static116.anInt2988);
		Static147.method1775(arg0, arg3 + local48 + 16, 16, local13, Static60.anInt1755);
		Static147.method1763(arg0, local48 + arg3 + 16, local13, Static63.anInt1932);
		Static147.method1763(arg0 + 1, arg3 + 16 + local48, local13, Static63.anInt1932);
		Static147.method1767(arg0, arg3 + local48 + 16, 16, Static63.anInt1932);
		Static147.method1767(arg0, arg3 + local48 + 17, 16, Static63.anInt1932);
		Static147.method1763(arg0 + 15, arg3 + 16 - -local48, local13, Static149.anInt3709);
		Static147.method1763(arg0 + 14, arg3 + 17 - -local48, local13 - 1, Static149.anInt3709);
		Static147.method1767(arg0, arg3 + local48 + local13 + 15, 16, Static149.anInt3709);
		Static147.method1767(arg0 + 1, local13 + local48 + 14 + arg3, 15, Static149.anInt3709);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([BI)[B")
	public static byte[] method2372(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub8 local8 = new Class3_Sub8(arg0);
		@Pc(12) int local12 = local8.method1545();
		@Pc(16) int local16 = local8.method1540();
		if (local16 < 0 || Static167.anInt4073 != 0 && local16 > Static167.anInt4073) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(46) byte[] local46 = new byte[local16];
			local8.method1506(local16, local46);
			return local46;
		} else {
			@Pc(58) int local58 = local8.method1540();
			if (local58 < 0 || Static167.anInt4073 != 0 && local58 > Static167.anInt4073) {
				throw new RuntimeException();
			}
			@Pc(78) byte[] local78 = new byte[local58];
			if (local12 == 1) {
				Static88.method2001(local78, local58, arg0, local16);
			} else {
				Static153.aClass54_1.method2110(local8, local78);
			}
			return local78;
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(III)Lclient!n;")
	public static Class55 method2373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass55_1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBIII)V")
	public static void method2374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class3_Sub15 local10 = (Class3_Sub15) Static1.aClass87_1.method3201((long) arg3);
		if (local10 == null) {
			local10 = new Class3_Sub15();
			Static1.aClass87_1.method3200((long) arg3, local10);
		}
		if (arg0 >= local10.anIntArray473.length) {
			@Pc(40) int[] local40 = new int[arg0 + 1];
			@Pc(45) int[] local45 = new int[arg0 + 1];
			for (@Pc(47) int local47 = 0; local47 < local10.anIntArray473.length; local47++) {
				local40[local47] = local10.anIntArray473[local47];
				local45[local47] = local10.anIntArray474[local47];
			}
			for (@Pc(72) int local72 = local10.anIntArray473.length; local72 < arg0; local72++) {
				local40[local72] = -1;
				local45[local72] = 0;
			}
			local10.anIntArray473 = local40;
			local10.anIntArray474 = local45;
		}
		local10.anIntArray473[arg0] = arg2;
		local10.anIntArray474[arg0] = arg1;
	}
}
