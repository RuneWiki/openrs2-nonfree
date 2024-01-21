import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	public static int anInt3111;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	public static int anInt3124;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_926 = Static81.method1507("Welcome to RuneScape");

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_927 = Static81.method1507("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_928 = Static81.method1507("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Lclient!dj;")
	public static Class24 aClass24_929 = aClass24_926;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)V")
	public static void method2414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(16) Class1_Sub2_Sub24 local16 = (Class1_Sub2_Sub24) Static80.aClass57_19.method1872(local10);
		if (local16 != null) {
			Static79.aClass58_1.method1914(local16);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 < 128 || arg4 < 128 || arg0 > 13056 || arg4 > 13056) {
			Static107.anInt2427 = -1;
			Static76.anInt1816 = -1;
			return;
		}
		@Pc(35) int local35 = Static37.method699(arg4, Static170.anInt3799, arg0) - arg1;
		@Pc(39) int local39 = Class1_Sub2_Sub8_Sub4.anIntArray355[Static175.anInt3914];
		@Pc(43) int local43 = arg0 - anInt3111;
		@Pc(47) int local47 = local35 - Static32.anInt875;
		@Pc(51) int local51 = arg4 - Static92.anInt2140;
		@Pc(55) int local55 = Class1_Sub2_Sub8_Sub4.anIntArray350[Static175.anInt3914];
		@Pc(59) int local59 = Class1_Sub2_Sub8_Sub4.anIntArray350[Static35.anInt4158];
		@Pc(63) int local63 = Class1_Sub2_Sub8_Sub4.anIntArray355[Static35.anInt4158];
		@Pc(73) int local73 = local59 * local51 + local63 * local43 >> 16;
		@Pc(83) int local83 = local63 * local51 - local43 * local59 >> 16;
		@Pc(90) int local90 = local73;
		@Pc(101) int local101 = local47 * local39 - local83 * local55 >> 16;
		@Pc(111) int local111 = local39 * local83 + local47 * local55 >> 16;
		if (local111 < 50) {
			Static107.anInt2427 = -1;
			Static76.anInt1816 = -1;
		} else {
			Static107.anInt2427 = arg3 + (local90 << 9) / local111;
			Static76.anInt1816 = arg2 + (local101 << 9) / local111;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	public static void method2424(@OriginalArg(0) int arg0) {
		if (Static193.anIntArray378 == null || arg0 > Static193.anIntArray378.length) {
			Static193.anIntArray378 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
	public static void method2431() {
		for (@Pc(15) Class1_Sub2_Sub14 local15 = (Class1_Sub2_Sub14) Static201.aClass87_29.method2827(); local15 != null; local15 = (Class1_Sub2_Sub14) Static201.aClass87_29.method2830()) {
			@Pc(20) Class5_Sub4 local20 = local15.aClass5_Sub4_1;
			if (local20.anInt3451 != Static170.anInt3799 || Static42.anInt1100 > local20.anInt3433) {
				local15.method3563();
			} else if (Static42.anInt1100 >= local20.anInt3448) {
				if (local20.anInt3453 > 0) {
					@Pc(51) Class5_Sub2_Sub2 local51 = Static148.aClass5_Sub2_Sub2Array1[local20.anInt3453 - 1];
					if (local51 != null && local51.anInt2501 >= 0 && local51.anInt2501 < 13312 && local51.anInt2448 >= 0 && local51.anInt2448 < 13312) {
						local20.method2651(local51.anInt2448, Static37.method699(local51.anInt2448, local20.anInt3451, local51.anInt2501) - local20.anInt3449, local51.anInt2501, Static42.anInt1100);
					}
				}
				if (local20.anInt3453 < 0) {
					@Pc(98) int local98 = -local20.anInt3453 - 1;
					@Pc(103) Class5_Sub2_Sub1 local103;
					if (Static111.anInt2534 == local98) {
						local103 = Static87.aClass5_Sub2_Sub1_1;
					} else {
						local103 = Static110.aClass5_Sub2_Sub1Array1[local98];
					}
					if (local103 != null && local103.anInt2501 >= 0 && local103.anInt2501 < 13312 && local103.anInt2448 >= 0 && local103.anInt2448 < 13312) {
						local20.method2651(local103.anInt2448, Static37.method699(local103.anInt2448, local20.anInt3451, local103.anInt2501) - local20.anInt3449, local103.anInt2501, Static42.anInt1100);
					}
				}
				local20.method2650(Static92.anInt2138);
				Static160.method3564(Static170.anInt3799, (int) local20.aDouble6, (int) local20.aDouble3, (int) local20.aDouble10, 60, local20, local20.anInt3438, -1L, false);
			}
		}
	}
}
