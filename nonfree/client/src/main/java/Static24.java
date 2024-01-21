import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!ne;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt655 = 0;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_178 = Static81.method1507("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_179 = Static81.method1507("mapscene");

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public static int anInt661 = 0;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[S")
	public static final short[] aShortArray19 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "[I")
	public static final int[] anIntArray69 = new int[2000];

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	public static int anInt663 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!nf;BIBIZI)V")
	public static void method501(@OriginalArg(0) Class69_Sub1 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) (arg2 + (arg5 << 16));
		@Pc(16) Class1_Sub2_Sub24 local16 = (Class1_Sub2_Sub24) Static162.aClass57_36.method1872(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub2_Sub24) Static176.aClass57_45.method1872(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub2_Sub24) Static80.aClass57_19.method1872(local10);
		if (local16 == null) {
			if (!arg4) {
				local16 = (Class1_Sub2_Sub24) Static104.aClass57_21.method1872(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub2_Sub24();
			local16.anInt4641 = arg3;
			local16.aClass69_Sub1_159 = arg0;
			local16.aByte13 = arg1;
			if (arg4) {
				Static162.aClass57_36.method1874(local16, local10);
				Static3.anInt116++;
			} else {
				Static79.aClass58_1.method1913(local16);
				Static80.aClass57_19.method1874(local16, local10);
				Static49.anInt1246++;
			}
		} else if (arg4) {
			local16.method3549();
			Static162.aClass57_36.method1874(local16, local10);
			Static49.anInt1246--;
			Static3.anInt116++;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)J")
	public static synchronized long method503() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static77.aLong49 > local5) {
			Static190.aLong134 += Static77.aLong49 - local5;
		}
		Static77.aLong49 = local5;
		return local5 + Static190.aLong134;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!vc;)V")
	public static void method504(@OriginalArg(1) Class98 arg0) {
		@Pc(9) int local9 = arg0.anInt4351;
		if (local9 == 324) {
			if (Static122.anInt2711 == -1) {
				Static151.anInt3371 = arg0.anInt4407;
				Static122.anInt2711 = arg0.anInt4361;
			}
			if (Static69.aClass21_2.aBoolean41) {
				arg0.anInt4361 = Static122.anInt2711;
			} else {
				arg0.anInt4361 = Static151.anInt3371;
			}
		} else if (local9 == 325) {
			if (Static122.anInt2711 == -1) {
				Static122.anInt2711 = arg0.anInt4361;
				Static151.anInt3371 = arg0.anInt4407;
			}
			if (Static69.aClass21_2.aBoolean41) {
				arg0.anInt4361 = Static151.anInt3371;
			} else {
				arg0.anInt4361 = Static122.anInt2711;
			}
		} else if (local9 == 327) {
			arg0.anInt4353 = 150;
			arg0.anInt4378 = (int) (Math.sin((double) Static42.anInt1100 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt4363 = 5;
			arg0.anInt4362 = -1;
		} else if (local9 == 328) {
			if (Static87.aClass5_Sub2_Sub1_1.aClass24_173 == null) {
				arg0.anInt4362 = 0;
			} else {
				arg0.anInt4353 = 150;
				arg0.anInt4378 = (int) (Math.sin((double) Static42.anInt1100 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4363 = 5;
				arg0.anInt4362 = ((int) Static87.aClass5_Sub2_Sub1_1.aClass24_173.method747() << 11) + 2047;
				arg0.anInt4390 = Static87.aClass5_Sub2_Sub1_1.anInt2504;
				arg0.anInt4359 = Static87.aClass5_Sub2_Sub1_1.anInt2490;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
	public static int method505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub10 local18 = (Class1_Sub10) Static49.aClass57_12.method1872((long) arg1);
		if (local18 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local18.anIntArray171.length) {
			return local18.anIntArray171[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)I")
	public static int method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 2 << 10) + (arg1 >> 5 << 7) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLclient!ld;)V")
	public static void method507(@OriginalArg(1) Class5_Sub2 arg0) {
		@Pc(5) int local5 = arg0.anInt2451 - Static42.anInt1100;
		arg0.anInt2502 = 0;
		if (arg0.anInt2460 == 0) {
			arg0.anInt2463 = 1024;
		}
		if (arg0.anInt2460 == 1) {
			arg0.anInt2463 = 1536;
		}
		@Pc(45) int local45 = arg0.anInt2480 * 64 + arg0.anInt2469 * 128;
		arg0.anInt2501 += (local45 - arg0.anInt2501) / local5;
		@Pc(67) int local67 = arg0.anInt2480 * 64 + arg0.anInt2482 * 128;
		if (arg0.anInt2460 == 2) {
			arg0.anInt2463 = 0;
		}
		if (arg0.anInt2460 == 3) {
			arg0.anInt2463 = 512;
		}
		arg0.anInt2448 += (local67 - arg0.anInt2448) / local5;
	}
}
