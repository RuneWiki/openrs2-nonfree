import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public static int anInt4470;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Lclient!jd;")
	public static Class84 aClass84_97;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!jd;")
	public static Class84 aClass84_98;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
	public static int[] anIntArray364 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public static int anInt4472 = 0;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23 = new String[1000];

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "[I")
	public static int[] anIntArray365 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
	public static void method3631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static68.anInt1509 <= arg0 && arg3 <= Static43.anInt1054 && arg4 >= Static127.anInt2664 && arg2 <= Static290.anInt6021) {
			Static153.method2647(arg1, arg4, arg0, arg3, arg2);
		} else {
			Static277.method4620(arg4, arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([II[I[ILclient!kk;)V")
	public static void method3632(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class36_Sub3_Sub1 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(15) int local15 = arg2[local3];
			@Pc(19) int local19 = arg1[local3];
			@Pc(23) int local23 = arg0[local3];
			for (@Pc(25) int local25 = 0; local15 != 0 && arg3.aClass86Array3.length > local25; local25++) {
				if ((local15 & 0x1) != 0) {
					if (local19 == -1) {
						arg3.aClass86Array3[local25] = null;
					} else {
						@Pc(48) Class15 local48 = Static35.method706(local19);
						@Pc(53) Class86 local53 = arg3.aClass86Array3[local25];
						@Pc(56) int local56 = local48.anInt428;
						if (local53 != null) {
							if (local53.anInt2565 == local19) {
								if (local56 == 0) {
									local53 = arg3.aClass86Array3[local25] = null;
								} else if (local56 == 1) {
									local53.anInt2576 = local23;
									local53.anInt2566 = 0;
									local53.anInt2579 = 0;
									local53.anInt2568 = 0;
									local53.anInt2575 = 1;
									Static225.method3777(0, false, arg3.anInt5109, local48, arg3.anInt5093);
								} else if (local56 == 2) {
									local53.anInt2566 = 0;
								}
							} else if (local48.anInt413 >= Static35.method706(local53.anInt2565).anInt413) {
								local53 = arg3.aClass86Array3[local25] = null;
							}
						}
						if (local53 == null) {
							local53 = arg3.aClass86Array3[local25] = new Class86();
							local53.anInt2565 = local19;
							local53.anInt2579 = 0;
							local53.anInt2575 = 1;
							local53.anInt2566 = 0;
							local53.anInt2568 = 0;
							local53.anInt2576 = local23;
							Static225.method3777(0, false, arg3.anInt5109, local48, arg3.anInt5093);
						}
					}
				}
				local15 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lclient!dc;")
	public static Class2_Sub3_Sub3 method3633(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3_Sub3 local10 = (Class2_Sub3_Sub3) Static250.aClass53_10.method1254((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31;
		if (arg0 < 32768) {
			local31 = Static8.aClass84_5.method2127(arg0, 0);
		} else {
			local31 = Static36.aClass84_16.method2127(arg0 & 0x7FFF, 0);
		}
		local10 = new Class2_Sub3_Sub3();
		if (local31 != null) {
			local10.method824(new Class2_Sub26(local31));
		}
		if (arg0 >= 32768) {
			local10.method828();
		}
		Static250.aClass53_10.method1258((long) arg0, local10);
		return local10;
	}
}
