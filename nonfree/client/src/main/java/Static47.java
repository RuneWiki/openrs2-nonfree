import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!ji;")
	public static Class2_Sub1_Sub12 aClass2_Sub1_Sub12_3;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "D")
	public static double aDouble31;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_324 = Static151.method2243("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_325 = Static151.method2243("(U3");

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_326 = Static151.method2243("skill)2");

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_327 = Static151.method2243(": ");

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "Lclient!mb;")
	public static Class62 aClass62_328 = aClass62_326;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIZ)V")
	public static void method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class2_Sub8 local10 = (Class2_Sub8) Static82.aClass13_4.method303(); local10 != null; local10 = (Class2_Sub8) Static82.aClass13_4.method309()) {
			if (local10.anInt1466 != -1 || local10.anIntArray125 != null) {
				@Pc(21) int local21 = 0;
				if (local10.anInt1472 < arg3) {
					local21 = arg3 - local10.anInt1472;
				} else if (arg3 < local10.anInt1460) {
					local21 = local10.anInt1460 - arg3;
				}
				if (local10.anInt1458 < arg0) {
					local21 += arg0 - local10.anInt1458;
				} else if (arg0 < local10.anInt1468) {
					local21 += local10.anInt1468 - arg0;
				}
				if (local10.anInt1459 < local21 - 64 || Static81.anInt4473 == 0 || local10.anInt1463 != arg1) {
					if (local10.aClass2_Sub2_Sub4_1 != null) {
						Static32.aClass2_Sub2_Sub3_1.method2609(local10.aClass2_Sub2_Sub4_1);
						local10.aClass2_Sub2_Sub4_1 = null;
					}
					if (local10.aClass2_Sub2_Sub4_2 != null) {
						Static32.aClass2_Sub2_Sub3_1.method2609(local10.aClass2_Sub2_Sub4_2);
						local10.aClass2_Sub2_Sub4_2 = null;
					}
				} else {
					local21 -= 64;
					if (local21 < 0) {
						local21 = 0;
					}
					@Pc(141) int local141 = Static81.anInt4473 * (local10.anInt1459 - local21) / local10.anInt1459;
					if (local10.aClass2_Sub2_Sub4_1 != null) {
						local10.aClass2_Sub2_Sub4_1.method2879(local141);
					} else if (local10.anInt1466 >= 0) {
						@Pc(156) Class27 local156 = Static219.method712(Static126.aClass71_Sub1_13, local10.anInt1466, 0);
						if (local156 != null) {
							@Pc(163) Class2_Sub20_Sub1 local163 = local156.method713().method2370(Static130.aClass49_1);
							@Pc(168) Class2_Sub2_Sub4 local168 = Static223.method2864(local163, local141);
							local168.method2888(-1);
							Static32.aClass2_Sub2_Sub3_1.method2608(local168);
							local10.aClass2_Sub2_Sub4_1 = local168;
						}
					}
					if (local10.aClass2_Sub2_Sub4_2 != null) {
						local10.aClass2_Sub2_Sub4_2.method2879(local141);
						if (!local10.aClass2_Sub2_Sub4_2.method3184()) {
							local10.aClass2_Sub2_Sub4_2 = null;
						}
					} else if (local10.anIntArray125 != null && (local10.anInt1467 -= arg2) <= 0) {
						@Pc(208) int local208 = (int) ((double) local10.anIntArray125.length * Math.random());
						@Pc(216) Class27 local216 = Static219.method712(Static126.aClass71_Sub1_13, local10.anIntArray125[local208], 0);
						if (local216 != null) {
							@Pc(223) Class2_Sub20_Sub1 local223 = local216.method713().method2370(Static130.aClass49_1);
							@Pc(228) Class2_Sub2_Sub4 local228 = Static223.method2864(local223, local141);
							local228.method2888(0);
							Static32.aClass2_Sub2_Sub3_1.method2608(local228);
							local10.anInt1467 = (int) (Math.random() * (double) (local10.anInt1464 - local10.anInt1470)) + local10.anInt1470;
							local10.aClass2_Sub2_Sub4_2 = local228;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)J")
	public static long method728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3292; local13++) {
			@Pc(19) Class39 local19 = local7.aClass39Array2[local13];
			if ((local19.aLong54 >> 29 & 0x3L) == 2L && local19.anInt1480 == arg1 && local19.anInt1484 == arg2) {
				return local19.aLong54;
			}
		}
		return 0L;
	}
}
