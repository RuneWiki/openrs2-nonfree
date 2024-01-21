import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	public static int anInt2150;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array14 = new Class49[200];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([IIIIIII)V")
	public static void method1739(@OriginalArg(0) int[] arg0) {
		Static24.anInt539 = 25;
		Static22.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static24.anInt539 + Static24.anInt539 + 1][Static24.anInt539 + Static24.anInt539 + 1];
		Static23.anInt507 = 0;
		Static40.anInt977 = 0;
		Static170.anInt3725 = 512;
		Static113.anInt2349 = 334;
		Static115.anInt2398 = 256;
		Static3.anInt52 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static24.anInt539 + Static24.anInt539 + 3][Static24.anInt539 + Static24.anInt539 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static126.anInt2751 = Class2_Sub2_Sub2_Sub4.anIntArray217[local47];
				Static105.anInt2201 = Class2_Sub2_Sub2_Sub4.anIntArray218[local47];
				Static163.anInt695 = Class2_Sub2_Sub2_Sub4.anIntArray217[local50];
				Static46.anInt1062 = Class2_Sub2_Sub2_Sub4.anIntArray218[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static24.anInt539 + 1); local82 <= Static24.anInt539 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static24.anInt539 + 1); local88 <= Static24.anInt539 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static70.method1163(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static24.anInt539 + 1][local88 + Static24.anInt539 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static24.anInt539; local77 < Static24.anInt539; local77++) {
					for (local82 = -Static24.anInt539; local82 < Static24.anInt539; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static24.anInt539 + 1][local82 + local97 + Static24.anInt539 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static24.anInt539 + 1][local82 + local97 + Static24.anInt539 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static24.anInt539 + 1][local82 + local97 + Static24.anInt539 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static24.anInt539 + 1][local82 + local97 + Static24.anInt539 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static22.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static24.anInt539][local82 + Static24.anInt539] = local174;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method1741() {
		for (@Pc(18) Class2_Sub11 local18 = (Class2_Sub11) Static43.aClass81_3.method2682(); local18 != null; local18 = (Class2_Sub11) Static43.aClass81_3.method2686()) {
			if (local18.anInt1549 > 0) {
				local18.anInt1549--;
			}
			if (local18.anInt1549 != 0) {
				if (local18.anInt1553 > 0) {
					local18.anInt1553--;
				}
				if (local18.anInt1553 == 0 && local18.anInt1544 >= 1 && local18.anInt1540 >= 1 && local18.anInt1544 <= 102 && local18.anInt1540 <= 102 && (local18.anInt1547 < 0 || Static25.method461(local18.anInt1550, local18.anInt1547))) {
					Static36.method754(local18.anInt1540, local18.anInt1541, local18.anInt1544, local18.anInt1550, local18.anInt1554, local18.anInt1551, local18.anInt1547);
					local18.anInt1553 = -1;
					if (local18.anInt1547 == local18.anInt1542 && local18.anInt1542 == -1) {
						local18.method3007();
					} else if (local18.anInt1547 == local18.anInt1542 && local18.anInt1551 == local18.anInt1548 && local18.anInt1550 == local18.anInt1546) {
						local18.method3007();
					}
				}
			} else if (local18.anInt1542 < 0 || Static25.method461(local18.anInt1546, local18.anInt1542)) {
				Static36.method754(local18.anInt1540, local18.anInt1541, local18.anInt1544, local18.anInt1546, local18.anInt1554, local18.anInt1548, local18.anInt1542);
				local18.method3007();
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public static void method1742() {
		aClass49Array14 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Lclient!lf;")
	public static Class49 method1743(@OriginalArg(0) int arg0) {
		return Static161.aClass49Array19[arg0].method1653() > 0 ? Static33.method692(new Class49[] { Static102.aClass49Array15[arg0], Static31.aClass49_427, Static161.aClass49Array19[arg0] }) : Static102.aClass49Array15[arg0];
	}
}
