import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!q;")
	public static Class80 aClass80_9 = null;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Lclient!i;")
	private static Class41 aClass41_762 = Static184.method2923("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!i;")
	public static Class41 aClass41_763 = aClass41_762;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	public static int anInt2618 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BILclient!nb;)Lclient!lj;")
	public static Class60 method1829(@OriginalArg(1) int arg0, @OriginalArg(2) Class15 arg1) {
		return Static188.method2999(arg0, arg1) ? Static25.method3303() : null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIB)V")
	public static void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static121.method3319(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg3;
		@Pc(27) int local27 = -arg3;
		@Pc(29) int local29 = local15;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(82) int local82;
		if (Static45.anInt1337 <= arg1 && arg1 <= Static17.anInt457) {
			@Pc(47) int[] local47 = Static3.anIntArrayArray1[arg1];
			local56 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 - arg3);
			local64 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 + arg3);
			local73 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 - local15);
			local82 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 + local15);
			Static204.method3147(local56, arg2, local73, local47);
			Static204.method3147(local73, arg0, local82, local47);
			Static204.method3147(local82, arg2, local64, local47);
		}
		@Pc(102) int local102 = -1;
		@Pc(105) int local105 = -local15;
		@Pc(107) int local107 = -1;
		while (local24 > local10) {
			local107 += 2;
			local27 += local107;
			local102 += 2;
			local105 += local102;
			if (local105 >= 0 && local29 >= 1) {
				local29--;
				Static27.anIntArray230[local29] = local10;
				local105 -= local29 << 1;
			}
			local10++;
			@Pc(199) int local199;
			@Pc(207) int local207;
			@Pc(218) int[] local218;
			@Pc(152) int local152;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local152 = arg1 - local24;
				local56 = arg1 + local24;
				if (Static45.anInt1337 <= local56 && Static17.anInt457 >= local152) {
					if (local24 < local15) {
						local64 = Static27.anIntArray230[local24];
						local73 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 + local10);
						local82 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 - local10);
						local199 = Static141.method2224(Static60.anInt4779, Static11.anInt385, local64 + arg4);
						local207 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 - local64);
						if (local56 <= Static17.anInt457) {
							local218 = Static3.anIntArrayArray1[local56];
							Static204.method3147(local82, arg2, local207, local218);
							Static204.method3147(local207, arg0, local199, local218);
							Static204.method3147(local199, arg2, local73, local218);
						}
						if (local152 >= Static45.anInt1337) {
							local218 = Static3.anIntArrayArray1[local152];
							Static204.method3147(local82, arg2, local207, local218);
							Static204.method3147(local207, arg0, local199, local218);
							Static204.method3147(local199, arg2, local73, local218);
						}
					} else {
						local64 = Static141.method2224(Static60.anInt4779, Static11.anInt385, local10 + arg4);
						local73 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 - local10);
						if (local56 <= Static17.anInt457) {
							Static204.method3147(local73, arg2, local64, Static3.anIntArrayArray1[local56]);
						}
						if (Static45.anInt1337 <= local152) {
							Static204.method3147(local73, arg2, local64, Static3.anIntArrayArray1[local152]);
						}
					}
				}
			}
			local56 = local10 + arg1;
			local152 = arg1 - local10;
			if (local56 >= Static45.anInt1337 && local152 <= Static17.anInt457) {
				local64 = arg4 + local24;
				local73 = arg4 - local24;
				if (Static60.anInt4779 <= local64 && local73 <= Static11.anInt385) {
					local64 = Static141.method2224(Static60.anInt4779, Static11.anInt385, local64);
					local73 = Static141.method2224(Static60.anInt4779, Static11.anInt385, local73);
					if (local15 > local10) {
						local82 = local29 >= local10 ? local29 : Static27.anIntArray230[local10];
						local199 = Static141.method2224(Static60.anInt4779, Static11.anInt385, local82 + arg4);
						local207 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 - local82);
						if (local56 <= Static17.anInt457) {
							local218 = Static3.anIntArrayArray1[local56];
							Static204.method3147(local73, arg2, local207, local218);
							Static204.method3147(local207, arg0, local199, local218);
							Static204.method3147(local199, arg2, local64, local218);
						}
						if (local152 >= Static45.anInt1337) {
							local218 = Static3.anIntArrayArray1[local152];
							Static204.method3147(local73, arg2, local207, local218);
							Static204.method3147(local207, arg0, local199, local218);
							Static204.method3147(local199, arg2, local64, local218);
						}
					} else {
						if (Static17.anInt457 >= local56) {
							Static204.method3147(local73, arg2, local64, Static3.anIntArrayArray1[local56]);
						}
						if (Static45.anInt1337 <= local152) {
							Static204.method3147(local73, arg2, local64, Static3.anIntArrayArray1[local152]);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!bj;Lclient!ud;)V")
	public static void method1831(@OriginalArg(1) int arg0, @OriginalArg(2) Class15_Sub1 arg1, @OriginalArg(3) Class96 arg2) {
		@Pc(3) Class2_Sub13 local3 = new Class2_Sub13();
		local3.aClass15_Sub1_51 = arg1;
		local3.aLong150 = arg0;
		local3.anInt2044 = 1;
		local3.aClass96_3 = arg2;
		@Pc(27) Class108 local27 = Static201.aClass108_17;
		synchronized (Static201.aClass108_17) {
			Static201.aClass108_17.method3334(local3);
		}
		Static131.method2089();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!nb;II)[Lclient!rh;")
	public static Class60_Sub1[] method1833(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1) {
		return Static188.method2999(arg1, arg0) ? Static156.method2540() : null;
	}
}
