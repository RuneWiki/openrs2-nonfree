import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "Lclient!ve;")
	public static Class69 aClass69_31;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_895 = Static81.method1507(")1j");

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_896 = Static81.method1507("::fps ");

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_42 = new Class86(128);

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "[S")
	public static short[] aShortArray37 = new short[256];

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_897 = Static81.method1507("Starting 3d library");

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
	public static int anInt2970 = 0;

	@OriginalMember(owner = "client!oa", name = "W", descriptor = "Lclient!dj;")
	public static Class24 aClass24_898 = aClass24_897;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)I")
	public static int method2282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(22) int local22 = Static16.method366(local17, local7);
		@Pc(28) int local28 = arg1 & arg2 - 1;
		@Pc(37) int local37 = Static16.method366(local17 + 1, local7);
		@Pc(46) int local46 = Static16.method366(local17, local7 + 1);
		@Pc(57) int local57 = Static16.method366(local17 + 1, local7 + 1);
		@Pc(64) int local64 = Static121.method2052(local22, local37, local13, arg2);
		@Pc(71) int local71 = Static121.method2052(local46, local57, local13, arg2);
		return Static121.method2052(local64, local71, local28, arg2);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lclient!kh;")
	public static Class1_Sub2_Sub13 method2283(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub13 local10 = (Class1_Sub2_Sub13) Static1.aClass86_3.method2816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static56.aClass69_Sub1_48.method2208(arg0, 0);
		if (local20 == null) {
			return null;
		}
		local10 = new Class1_Sub2_Sub13();
		@Pc(33) Class1_Sub7 local33 = new Class1_Sub7(local20);
		local33.anInt3592 = local33.aByteArray38.length - 2;
		@Pc(44) int local44 = local33.method2765();
		@Pc(55) int local55 = local33.aByteArray38.length - local44 - 12 - 2;
		local33.anInt3592 = local55;
		@Pc(62) int local62 = local33.method2793();
		local10.anInt2365 = local33.method2765();
		local10.anInt2373 = local33.method2765();
		local10.anInt2366 = local33.method2765();
		local10.anInt2364 = local33.method2765();
		@Pc(86) int local86 = local33.method2771();
		@Pc(94) int local94;
		@Pc(99) int local99;
		if (local86 > 0) {
			local10.aClass57Array1 = new Class57[local86];
			for (local94 = 0; local94 < local86; local94++) {
				local99 = local33.method2765();
				@Pc(106) Class57 local106 = new Class57(Static208.method3518(local99));
				local10.aClass57Array1[local94] = local106;
				while (local99-- > 0) {
					@Pc(116) int local116 = local33.method2793();
					@Pc(120) int local120 = local33.method2793();
					local106.method1874(new Class1_Sub24(local120), (long) local116);
				}
			}
		}
		local33.anInt3592 = 0;
		local10.aClass24_709 = local33.method2774();
		local10.aClass24Array16 = new Class24[local62];
		local10.anIntArray194 = new int[local62];
		local10.anIntArray193 = new int[local62];
		local94 = 0;
		while (local55 > local33.anInt3592) {
			local99 = local33.method2765();
			if (local99 == 3) {
				local10.aClass24Array16[local94] = local33.method2761();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local10.anIntArray193[local94] = local33.method2771();
			} else {
				local10.anIntArray193[local94] = local33.method2793();
			}
			local10.anIntArray194[local94++] = local99;
		}
		Static1.aClass86_3.method2821(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!lg;IIIIZI)Lclient!lg;")
	public static Class5_Sub1 method2284(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg4;
		@Pc(14) Class5_Sub1 local14 = (Class5_Sub1) Static164.aClass46_11.method1588(local8);
		if (local14 == null) {
			@Pc(21) Class5_Sub6 local21 = Static171.method2955(Static74.aClass69_Sub1_56, arg4);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method2942(64, 768, -50, -10, -50);
			Static164.aClass46_11.method1586(local14, local8);
		}
		@Pc(41) int local41 = arg0.method166();
		@Pc(44) int local44 = arg0.method155();
		@Pc(47) int local47 = arg0.method161();
		@Pc(50) int local50 = arg0.method163();
		local14 = local14.method162(true);
		if (arg5 != 0) {
			local14.method158(arg5);
		}
		@Pc(65) Class5_Sub1_Sub1 local65 = (Class5_Sub1_Sub1) local14;
		if (Static37.method699(local47 + arg2, Static170.anInt3799, local41 + arg3) != arg1 || arg1 != Static37.method699(local50 + arg2, Static170.anInt3799, arg3 + local44)) {
			for (@Pc(102) int local102 = 0; local102 < local65.anInt160; local102++) {
				local65.anIntArray7[local102] += Static37.method699(arg2 + local65.anIntArray11[local102], Static170.anInt3799, local65.anIntArray8[local102] + arg3) - arg1;
			}
			local65.aBoolean7 = false;
		}
		return local14;
	}
}
