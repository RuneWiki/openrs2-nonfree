import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
	public static int anInt4678;

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
	public static int anInt4684 = -1;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!ak;)V")
	public static void method3575(@OriginalArg(1) Class7 arg0) {
		if (Static261.aBoolean403) {
			return;
		}
		if (Static240.aBoolean369) {
			Static50.method861();
		} else {
			Static213.method3379();
		}
		Static242.aClass1_Sub2_Sub2_10 = Static290.method4466(Static279.anInt5595, arg0);
		@Pc(19) int local19 = Static166.anInt3046;
		@Pc(25) int local25 = local19 * 956 / 503;
		Static242.aClass1_Sub2_Sub2_10.method3922((Static145.anInt2690 - local25) / 2, 0, local25, local19);
		Static296.aClass48_1 = Static183.method4443(arg0, Static17.anInt406);
		Static296.aClass48_1.method3616(Static145.anInt2690 / 2 - Static296.aClass48_1.anInt4754 / 2, 18);
		Static261.aBoolean403 = true;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(CI)Z")
	public static boolean method3576(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)V")
	public static void method3577() {
		Static283.aClass1_Sub2_Sub8_5 = null;
		Static263.aClass1_Sub2_Sub8_4 = null;
		Static95.aClass1_Sub2_Sub8_1 = null;
		Static236.aClass1_Sub2_Sub8_3 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z[I[I[ILclient!qi;)V")
	public static void method3578(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class6_Sub6_Sub1 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(15) int local15 = arg1[local3];
			@Pc(19) int local19 = arg0[local3];
			@Pc(23) int local23 = arg2[local3];
			for (@Pc(25) int local25 = 0; local15 != 0 && local25 < arg3.aClass160Array3.length; local25++) {
				if ((local15 & 0x1) != 0) {
					if (local23 == -1) {
						arg3.aClass160Array3[local25] = null;
					} else {
						@Pc(56) Class133 local56 = Static262.method4031(local23);
						@Pc(59) int local59 = local56.anInt4021;
						@Pc(64) Class160 local64 = arg3.aClass160Array3[local25];
						if (local64 != null) {
							if (local23 == local64.anInt5254) {
								if (local59 == 0) {
									local64 = arg3.aClass160Array3[local25] = null;
								} else if (local59 == 1) {
									local64.anInt5252 = 0;
									local64.anInt5257 = 0;
									local64.anInt5253 = 1;
									local64.anInt5251 = local19;
									local64.anInt5250 = 0;
									Static128.method1976(false, local56, arg3.anInt4569, 0, arg3.anInt4562);
								} else if (local59 == 2) {
									local64.anInt5252 = 0;
								}
							} else if (local56.anInt4013 >= Static262.method4031(local64.anInt5254).anInt4013) {
								local64 = arg3.aClass160Array3[local25] = null;
							}
						}
						if (local64 == null) {
							local64 = arg3.aClass160Array3[local25] = new Class160();
							local64.anInt5253 = 1;
							local64.anInt5254 = local23;
							local64.anInt5257 = 0;
							local64.anInt5251 = local19;
							local64.anInt5250 = 0;
							local64.anInt5252 = 0;
							Static128.method1976(false, local56, arg3.anInt4569, 0, arg3.anInt4562);
						}
					}
				}
				local15 >>>= 0x1;
			}
		}
	}
}
