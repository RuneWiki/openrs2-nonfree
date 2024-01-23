import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!qf;")
	public static Class146 aClass146_4;

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "[Lclient!in;")
	public static Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array5;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
	public static int anInt1120;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "[Lclient!o;")
	public static Class122[] aClass122Array1 = new Class122[4];

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
	public static int anInt1112 = -1;

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
	public static volatile int anInt1114 = 0;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString32 = "yellow:";

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
	public static void method972(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static243.anInt5653;
		@Pc(13) int local13 = Static105.anInt2016;
		@Pc(15) int local15 = Static141.anInt2760;
		@Pc(17) int local17 = Static140.anInt2757;
		@Pc(19) int local19 = Static262.anInt2349;
		@Pc(22) int local22 = (int) Static15.aFloat2;
		if (Static215.anInt4230 / 256 > local22) {
			local22 = Static215.anInt4230 / 256;
		}
		if (Static104.aBooleanArray19[4] && local22 < Static221.anIntArray348[4] + 128) {
			local22 = Static221.anIntArray348[4] + 128;
		}
		@Pc(63) int local63 = Static295.anInt5584 + (int) Static2.aFloat1 & 0x7FF;
		Static136.method2201(Static142.anInt2794, arg0, Static216.anInt4233, local63, local22, Static104.method1648(Static295.anInt5586, Static229.aClass22_Sub3_Sub2_2.anInt4601, Static229.aClass22_Sub3_Sub2_2.anInt4623) - 50, 600 - -(local22 * 3));
		if (Static243.anInt5653 == local11 && local15 == Static141.anInt2760 && Static105.anInt2016 == local13 && local17 == Static140.anInt2757 && Static262.anInt2349 == local19) {
			Static101.anInt1895 = 1;
			return;
		}
		Static290.anInt5495 = 10;
		Static69.anInt1366 = 10;
		@Pc(125) int local125 = Static262.anInt2349 - local19;
		Static223.anInt4332 = 10;
		if (local125 > 1024) {
			local125 -= 2048;
		}
		if (Static243.anInt5653 > local11) {
			local11 += Static223.anInt4332 + (Static243.anInt5653 - local11) * Static290.anInt5495 / 1000;
			if (local11 < Static243.anInt5653) {
				Static243.anInt5653 = local11;
			}
		}
		if (local13 < Static105.anInt2016) {
			local13 += Static290.anInt5495 * (Static105.anInt2016 - local13) / 1000 + Static223.anInt4332;
			if (Static105.anInt2016 > local13) {
				Static105.anInt2016 = local13;
			}
		}
		if (local15 < Static141.anInt2760) {
			local15 += Static290.anInt5495 * (Static141.anInt2760 - local15) / 1000 + Static223.anInt4332;
			if (Static141.anInt2760 > local15) {
				Static141.anInt2760 = local15;
			}
		}
		if (local11 > Static243.anInt5653) {
			local11 -= Static223.anInt4332 + (local11 - Static243.anInt5653) * Static290.anInt5495 / 1000;
			if (Static243.anInt5653 < local11) {
				Static243.anInt5653 = local11;
			}
		}
		if (local125 < -1024) {
			local125 += 2048;
		}
		Static281.anInt5364 = 10;
		if (local13 > Static105.anInt2016) {
			local13 -= Static223.anInt4332 + Static290.anInt5495 * (local13 - Static105.anInt2016) / 1000;
			if (local13 > Static105.anInt2016) {
				Static105.anInt2016 = local13;
			}
		}
		if (local125 > 0) {
			local19 += Static69.anInt1366 * local125 / 1000 + Static281.anInt5364;
			local19 &= 0x7FF;
		}
		if (Static141.anInt2760 < local15) {
			local15 -= (local15 - Static141.anInt2760) * Static290.anInt5495 / 1000 + Static223.anInt4332;
			if (Static141.anInt2760 < local15) {
				Static141.anInt2760 = local15;
			}
		}
		if (Static140.anInt2757 > local17) {
			local17 += Static281.anInt5364 + Static69.anInt1366 * (Static140.anInt2757 - local17) / 1000;
			if (Static140.anInt2757 > local17) {
				Static140.anInt2757 = local17;
			}
		}
		if (local125 < 0) {
			local19 -= -local125 * Static69.anInt1366 / 1000 + Static281.anInt5364;
			local19 &= 0x7FF;
		}
		if (local17 > Static140.anInt2757) {
			local17 -= Static281.anInt5364 + (local17 - Static140.anInt2757) * Static69.anInt1366 / 1000;
			if (local17 > Static140.anInt2757) {
				Static140.anInt2757 = local17;
			}
		}
		@Pc(406) int local406 = Static262.anInt2349 - local19;
		if (local406 > 1024) {
			local406 -= 2048;
		}
		if (local406 < -1024) {
			local406 += 2048;
		}
		if (local406 >= 0 || local125 <= 0 || local406 > 0 && local125 < 0) {
			Static262.anInt2349 = local19;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)Lclient!sb;")
	public static Class1_Sub14 method973() {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(34);
		local8.method2631(11);
		local8.method2631(Static287.anInt5449);
		local8.method2631(Static85.aBoolean121 ? 1 : 0);
		local8.method2631(Static106.aBoolean159 ? 1 : 0);
		local8.method2631(Static289.aBoolean394 ? 1 : 0);
		local8.method2631(Static280.aBoolean383 ? 1 : 0);
		local8.method2631(Static101.aBoolean145 ? 1 : 0);
		local8.method2631(Static244.aBoolean348 ? 1 : 0);
		local8.method2631(Static215.aBoolean288 ? 1 : 0);
		local8.method2631(Static285.aBoolean387 ? 1 : 0);
		local8.method2631(Static143.anInt2823);
		local8.method2631(Static302.aBoolean419 ? 1 : 0);
		local8.method2631(Static311.aBoolean427 ? 1 : 0);
		local8.method2631(Static269.aBoolean27 ? 1 : 0);
		local8.method2631(Static114.anInt2269);
		local8.method2631(Static119.aBoolean428 ? 1 : 0);
		local8.method2631(Static223.anInt4334);
		local8.method2631(Static311.anInt5846);
		local8.method2631(Static315.anInt5926);
		local8.method2637(Static191.anInt3925);
		local8.method2637(Static63.anInt1285);
		local8.method2631(Static149.method2401());
		local8.method2630(Static12.anInt192);
		local8.method2631(Static247.anInt4901);
		local8.method2631(Static8.aBoolean8 ? 1 : 0);
		local8.method2631(Static51.aBoolean77 ? 1 : 0);
		local8.method2631(Static157.anInt3329);
		local8.method2631(Static5.aBoolean1 ? 1 : 0);
		local8.method2631(Static131.aBoolean192 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Lclient!ln;")
	public static Class1_Sub1_Sub3_Sub2 method974() {
		@Pc(13) int local13 = Static255.anIntArray450[0] * Static134.anIntArray220[0];
		@Pc(17) byte[] local17 = Static255.aByteArrayArray15[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static40.anIntArray59[local17[local22] & 0xFF];
		}
		@Pc(57) Class1_Sub1_Sub3_Sub2 local57 = new Class1_Sub1_Sub3_Sub2(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[0], Static148.anIntArray242[0], Static134.anIntArray220[0], Static255.anIntArray450[0], local20);
		Static295.method4395();
		return local57;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
	public static void method976(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static222.method3504(arg0, arg1, arg1.length - 1, 0);
	}
}
