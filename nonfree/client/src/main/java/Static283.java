import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!vm", name = "db", descriptor = "Z")
	public static boolean aBoolean474;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!jd;B)V")
	public static void method4711(@OriginalArg(0) Class84 arg0) {
		Static39.anInt945 = arg0.method2121("titlebg");
		Static277.anInt5749 = arg0.method2121("logo");
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V")
	public static void method4713() {
		Static174.aClass46_30.method1077();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([IILclient!th;[I[I)V")
	public static void method4715(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class36_Sub3_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) int local15 = arg0[local7];
			@Pc(19) int local19 = arg2[local7];
			@Pc(23) int local23 = arg3[local7];
			@Pc(25) int local25 = 0;
			while (local23 != 0 && local25 < arg1.aClass86Array3.length) {
				if ((local23 & 0x1) != 0) {
					if (local15 == -1) {
						arg1.aClass86Array3[local25] = null;
					} else {
						@Pc(55) Class15 local55 = Static35.method706(local15);
						@Pc(60) Class86 local60 = arg1.aClass86Array3[local25];
						@Pc(63) int local63 = local55.anInt428;
						if (local60 != null) {
							if (local60.anInt2565 == local15) {
								if (local63 == 0) {
									local60 = arg1.aClass86Array3[local25] = null;
								} else if (local63 == 1) {
									local60.anInt2566 = 0;
									local60.anInt2575 = 1;
									local60.anInt2579 = 0;
									local60.anInt2576 = local19;
									local60.anInt2568 = 0;
									Static225.method3777(0, arg1 == Static111.aClass36_Sub3_Sub2_1, arg1.anInt5109, local55, arg1.anInt5093);
								} else if (local63 == 2) {
									local60.anInt2566 = 0;
								}
							} else if (local55.anInt413 >= Static35.method706(local60.anInt2565).anInt413) {
								local60 = arg1.aClass86Array3[local25] = null;
							}
						}
						if (local60 == null) {
							local60 = arg1.aClass86Array3[local25] = new Class86();
							local60.anInt2575 = 1;
							local60.anInt2566 = 0;
							local60.anInt2568 = 0;
							local60.anInt2576 = local19;
							local60.anInt2579 = 0;
							local60.anInt2565 = local15;
							Static225.method3777(0, Static111.aClass36_Sub3_Sub2_1 == arg1, arg1.anInt5109, local55, arg1.anInt5093);
						}
					}
				}
				local25++;
				local23 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)Lclient!sj;")
	public static Class159 method4716(@OriginalArg(1) int arg0) {
		@Pc(10) Class159 local10 = (Class159) Static72.aClass46_8.method1074((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static111.aClass84_48.method2127(arg0, 31);
		local10 = new Class159();
		if (local21 != null) {
			local10.method3943(arg0, new Class2_Sub26(local21));
		}
		Static72.aClass46_8.method1071(local10, (long) arg0);
		return local10;
	}
}
