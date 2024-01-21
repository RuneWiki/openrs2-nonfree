import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "[I")
	public static int[] anIntArray224;

	@OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
	public static int anInt2093;

	@OriginalMember(owner = "client!ib", name = "cb", descriptor = "Lclient!ag;")
	public static Class4 aClass4_51;

	@OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lclient!dd;")
	private static Class13 aClass13_715 = Static161.method2971("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_714 = aClass13_715;

	@OriginalMember(owner = "client!ib", name = "db", descriptor = "Lclient!dd;")
	public static Class13 aClass13_716 = Static161.method2971("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ib", name = "eb", descriptor = "[I")
	public static int[] anIntArray225 = new int[] { 1, -2, -1, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 4, 7, 0, 0, 20, 0, 0, 5, -2, 5, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 6, 0, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 6, 0, -2, 0, 6, 4, 0, 0, 0, 0, -1, 0, 0, 0, -1, 4, 0, 7, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 3, 10, -2, 0, 2, 0, 0, 0, 0, 0, 0, 3, 0, -1, 0, -1, 0, 0, 0, 0, 0, 7, 0, 0, 0, 6, 0, 12, 0, 0, 0, 0, 4, 0, 4, -2, 0, 6, 0, 15, 0, 6, 0, 0, 7, 0, 1, 0, 0, 0, 0, -2, 0, -2, 0, 6, 0, 0, 6, 0, 0, 14, 0, 0, -1, 0, -2, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 8, 0, 0, -2, 0, 0, 5, 0, 3, 2, 0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 6, 0, 24, 0, -1, 0, 0, -2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0 };

	@OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
	public static final int anInt2098 = 5063219;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!nf;)V")
	public static void method1540(@OriginalArg(0) Class59 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3133; local2 <= arg0.anInt3142; local2++) {
			for (@Pc(6) int local6 = arg0.anInt3130; local6 <= arg0.anInt3143; local6++) {
				@Pc(16) Class1_Sub10 local16 = Static170.aClass1_Sub10ArrayArrayArray35[arg0.anInt3136][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt1544; local20++) {
						if (local16.aClass59Array4[local20] == arg0) {
							local16.anInt1544--;
							for (local35 = local20; local35 < local16.anInt1544; local35++) {
								local16.aClass59Array4[local35] = local16.aClass59Array4[local35 + 1];
								local16.anIntArray160[local35] = local16.anIntArray160[local35 + 1];
							}
							local16.aClass59Array4[local16.anInt1544] = null;
							break;
						}
					}
					local16.anInt1538 = 0;
					for (local35 = 0; local35 < local16.anInt1544; local35++) {
						local16.anInt1538 |= local16.anIntArray160[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIB)V")
	public static void method1541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static171.method2892(arg0)) {
			Static52.method1287(arg1, Static145.aClass20ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!tc;IZI)V")
	public static void method1542(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub19 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static53.anInt1722 >= 400) {
			return;
		}
		if (arg1.anIntArray430 != null) {
			arg1 = arg1.method2798();
		}
		if (arg1 == null || !arg1.aBoolean297) {
			return;
		}
		@Pc(33) Class13 local33 = arg1.aClass13_1325;
		if (arg1.anInt3856 != 0) {
			local33 = Static57.method1349(new Class13[] { local33, Static34.method957(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2615, arg1.anInt3856), Static178.aClass13_1383, Static20.aClass13_281, Static3.method75(arg1.anInt3856), Static30.aClass13_359 });
		}
		if (Static116.anInt3103 == 1) {
			Static12.method462(arg0, Static57.method1349(new Class13[] { Static141.aClass13_1202, Static151.aClass13_1440, local33 }), Static57.aClass13_608, (short) 1, arg2, (long) arg3);
		} else if (!Static118.aBoolean233) {
			@Pc(90) Class13[] local90 = arg1.aClass13Array26;
			if (Static7.aBoolean235) {
				local90 = Static176.method2935(local90);
			}
			@Pc(100) int local100;
			if (local90 != null) {
				for (local100 = 4; local100 >= 0; local100--) {
					if (local90[local100] != null && !local90[local100].method894(Static112.aClass13_1017)) {
						@Pc(119) byte local119 = 0;
						if (local100 == 0) {
							local119 = 7;
						}
						if (local100 == 1) {
							local119 = 6;
						}
						if (local100 == 2) {
							local119 = 36;
						}
						if (local100 == 3) {
							local119 = 43;
						}
						if (local100 == 4) {
							local119 = 45;
						}
						Static12.method462(arg0, Static57.method1349(new Class13[] { Static91.aClass13_859, local33 }), local90[local100], local119, arg2, (long) arg3);
					}
				}
			}
			if (local90 != null) {
				for (local100 = 4; local100 >= 0; local100--) {
					if (local90[local100] != null && local90[local100].method894(Static112.aClass13_1017)) {
						@Pc(201) short local201 = 0;
						if (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2615 < arg1.anInt3856) {
							local201 = 2000;
						}
						@Pc(214) short local214 = 0;
						if (local100 == 0) {
							local214 = 7;
						}
						if (local100 == 1) {
							local214 = 6;
						}
						if (local100 == 2) {
							local214 = 36;
						}
						if (local100 == 3) {
							local214 = 43;
						}
						if (local100 == 4) {
							local214 = 45;
						}
						if (local214 != 0) {
							local214 += local201;
						}
						Static12.method462(arg0, Static57.method1349(new Class13[] { Static91.aClass13_859, local33 }), local90[local100], local214, arg2, (long) arg3);
					}
				}
			}
			Static12.method462(arg0, Static57.method1349(new Class13[] { Static91.aClass13_859, local33 }), Static46.aClass13_529, (short) 1006, arg2, (long) arg3);
			return;
		} else if ((Static111.anInt3019 & 0x2) == 2) {
			Static12.method462(arg0, Static57.method1349(new Class13[] { Static147.aClass13_1236, Static151.aClass13_1440, local33 }), Static113.aClass13_1022, (short) 16, arg2, (long) arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
	public static void method1543() {
		aClass4_51 = null;
		anIntArray225 = null;
		aClass13_715 = null;
		aClass13_716 = null;
		anIntArray224 = null;
		aClass13_714 = null;
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
	public static void method1544() {
		@Pc(1) Object local1 = Static85.anObject4;
		synchronized (Static85.anObject4) {
			if (Static62.anInt2604 != 0) {
				Static62.anInt2604 = 1;
				try {
					Static85.anObject4.wait();
				} catch (@Pc(17) InterruptedException local17) {
				}
			}
		}
	}
}
