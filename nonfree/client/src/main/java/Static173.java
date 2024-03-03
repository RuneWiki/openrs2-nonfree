import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)V", line = 4)
	public static void method3399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Class14.aClass2_Sub4_Sub2_4.method4814(arg2);
		Class14.aClass2_Sub4_Sub2_4.method4856(arg1);
		Class14.aClass2_Sub4_Sub2_4.method4844(arg0);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILclient!bc;I)Lclient!js;", line = 20)
	public static Class2_Sub2_Sub11 method3400(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 << 8 | arg1.anInt538;
		@Pc(27) Class2_Sub2_Sub11 local27 = (Class2_Sub2_Sub11) Class174.aClass116_7.method3153((long) local10 << 16);
		if (local27 != null) {
			return local27;
		}
		@Pc(39) byte[] local39 = Static182.aClass197_54.method5083(Static182.aClass197_54.method5098(local10));
		if (local39 == null) {
			local10 = arg1.anInt538 | arg0 + 65536 << 8;
			local27 = (Class2_Sub2_Sub11) Class174.aClass116_7.method3153((long) local10 << 16);
			if (local27 != null) {
				return local27;
			}
			local39 = Static182.aClass197_54.method5083(Static182.aClass197_54.method5098(local10));
			if (local39 == null) {
				local10 = arg1.anInt538 | 0xFFFF00;
				local27 = (Class2_Sub2_Sub11) Class174.aClass116_7.method3153((long) local10 << 16);
				if (local27 != null) {
					return local27;
				}
				local39 = Static182.aClass197_54.method5083(Static182.aClass197_54.method5098(local10));
				if (local39 == null) {
					return null;
				} else if (local39.length <= 1) {
					return null;
				} else {
					local27 = Static199.method3746(local39);
					local27.aClass16_4 = arg1;
					Class174.aClass116_7.method3156(local27, (long) local10 << 16);
					return local27;
				}
			} else if (local39.length <= 1) {
				return null;
			} else {
				local27 = Static199.method3746(local39);
				local27.aClass16_4 = arg1;
				Class174.aClass116_7.method3156(local27, (long) local10 << 16);
				return local27;
			}
		} else if (local39.length <= 1) {
			return null;
		} else {
			local27 = Static199.method3746(local39);
			local27.aClass16_4 = arg1;
			Class174.aClass116_7.method3156(local27, (long) local10 << 16);
			return local27;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIBII)V", line = 90)
	public static void method3401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class161 local8 = Static193.method3706(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(18) Class2_Sub13 local18 = new Class2_Sub13();
			local18.aClass161_3 = local8;
			local18.anObjectArray4 = local8.anObjectArray15;
			Static185.method3592(local18);
		}
		Class119.anInt3313 = local8.anInt4293;
		Class77.anInt2216 = arg4;
		Static38.anInt1043 = arg0;
		InputStream_Sub1.anInt3788 = arg3;
		Class2_Sub2_Sub10_Sub2.aBoolean419 = true;
		Static314.anInt6305 = arg2;
		Static108.anInt3833 = arg1;
		Static161.anInt3294 = arg5;
		Static187.method3646(local8);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIII)V", line = 127)
	public static void method3402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static24.method861(Class2_Sub40.anInt6819, arg2, Class2_Sub20.anInt2951);
		@Pc(17) int local17 = Static24.method861(Class2_Sub40.anInt6819, arg0, Class2_Sub20.anInt2951);
		@Pc(23) int local23 = Static24.method861(Class25_Sub1.anInt675, arg4, Class61.anInt1835);
		@Pc(29) int local29 = Static24.method861(Class25_Sub1.anInt675, arg3, Class61.anInt1835);
		@Pc(37) int local37 = Static24.method861(Class2_Sub40.anInt6819, arg1 + arg2, Class2_Sub20.anInt2951);
		@Pc(46) int local46 = Static24.method861(Class2_Sub40.anInt6819, arg0 - arg1, Class2_Sub20.anInt2951);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static94.method2165(local29, Static332.anIntArrayArray58[local48], arg5, local23);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static94.method2165(local29, Static332.anIntArrayArray58[local64], arg5, local23);
		}
		@Pc(89) int local89 = Static24.method861(Class25_Sub1.anInt675, arg4 + arg1, Class61.anInt1835);
		@Pc(97) int local97 = Static24.method861(Class25_Sub1.anInt675, arg3 - arg1, Class61.anInt1835);
		for (@Pc(107) int local107 = local37; local107 <= local46; local107++) {
			@Pc(113) int[] local113 = Static332.anIntArrayArray58[local107];
			Static94.method2165(local89, local113, arg5, local23);
			Static94.method2165(local29, local113, arg5, local97);
		}
	}
}
