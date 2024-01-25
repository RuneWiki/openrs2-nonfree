import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method2953(@OriginalArg(0) String arg0) {
		if (!Static147.aBoolean270 || (Static328.anInt9771 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static315.anInt9128;
		@Pc(21) int[] local21 = Static533.anIntArray506;
		for (@Pc(23) int local23 = 0; local23 < local19; local23++) {
			@Pc(31) Class15_Sub1_Sub2_Sub2_Sub1 local31 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local21[local23]];
			if (local31.aString35 != null && local31.aString35.equalsIgnoreCase(arg0) && (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 == local31 && (Static328.anInt9771 & 0x10) != 0 || local31 != null && (Static328.anInt9771 & 0x8) != 0)) {
				@Pc(64) Class8_Sub31 local64 = Static51.method1418(Static38.aClass257_11, Static608.aClass336_1);
				local64.aClass8_Sub8_Sub2_1.method8543(Static401.anInt7697);
				local64.aClass8_Sub8_Sub2_1.method8572(Static391.anInt7576);
				local64.aClass8_Sub8_Sub2_1.method8572(local21[local23]);
				local64.aClass8_Sub8_Sub2_1.method8535(0);
				local64.aClass8_Sub8_Sub2_1.method8572(Static230.anInt5229);
				Static262.method4604(local64);
				Static46.method1367(true, 0, -2, local31.anIntArray436[0], local31.method6692(), local31.method6692(), 0, local31.anIntArray435[0]);
				local17 = true;
				break;
			}
		}
		if (!local17) {
			Static353.method5583(Static121.aClass84_21.method2710(Static372.anInt7083) + arg0);
		}
		if (Static147.aBoolean270) {
			Static8.method91();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBIII)Z")
	public static boolean method2954(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static307.aBoolean442 || !Static350.aBoolean469) {
			return false;
		} else if (Static359.anInt6889 < 100) {
			return false;
		} else if (Static109.method2472(arg1, arg2, arg0)) {
			@Pc(34) int local34 = arg1 << Static172.anInt4156;
			@Pc(38) int local38 = arg2 << Static172.anInt4156;
			if (Static591.method8163(arg3, Static572.anInt9827, local38, local34, Static34.aClass86Array5[arg0].method8086(arg2, arg1), Static572.anInt9827)) {
				Static36.anInt1451++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public static void method2956() {
		Static336.anInt6621 = 0;
		@Pc(11) int local11 = Static442.aClass8_Sub8_Sub2_2.method8541();
		@Pc(15) int local15 = Static442.aClass8_Sub8_Sub2_2.method8576();
		@Pc(19) int local19 = Static442.aClass8_Sub8_Sub2_2.method8527();
		@Pc(30) boolean local30 = Static442.aClass8_Sub8_Sub2_2.method8552() == 1;
		Static512.method7372();
		Static84.method2098(local19);
		@Pc(43) int local43 = (Static635.anInt10565 - Static442.aClass8_Sub8_Sub2_2.anInt10588) / 16;
		Static466.anIntArrayArray45 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static466.anIntArrayArray45[local49][local53] = Static442.aClass8_Sub8_Sub2_2.method8540();
			}
		}
		Static357.aByteArrayArray65 = null;
		Static568.aByteArrayArray154 = new byte[local43][];
		Static161.anIntArray214 = null;
		Static177.aByteArrayArray63 = new byte[local43][];
		Static488.anIntArray481 = new int[local43];
		Static414.anIntArray422 = new int[local43];
		Static19.aByteArrayArray59 = new byte[local43][];
		Static170.anIntArray225 = new int[local43];
		Static65.aByteArrayArray30 = new byte[local43][];
		Static87.anIntArray604 = new int[local43];
		Static158.anIntArray212 = new int[local43];
		local43 = 0;
		for (local53 = (local11 - (Static372.anInt7082 >> 4)) / 8; local53 <= (local11 + (Static372.anInt7082 >> 4)) / 8; local53++) {
			for (@Pc(126) int local126 = (local15 - (Static218.anInt5023 >> 4)) / 8; local126 <= ((Static218.anInt5023 >> 4) + local15) / 8; local126++) {
				Static170.anIntArray225[local43] = (local53 << 8) + local126;
				Static414.anIntArray422[local43] = Static140.aClass237_41.method6307("m" + local53 + "_" + local126);
				Static87.anIntArray604[local43] = Static140.aClass237_41.method6307("l" + local53 + "_" + local126);
				Static158.anIntArray212[local43] = Static140.aClass237_41.method6307("um" + local53 + "_" + local126);
				Static488.anIntArray481[local43] = Static140.aClass237_41.method6307("ul" + local53 + "_" + local126);
				local43++;
			}
		}
		Static63.method1690(local15, local11, local30, 11);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
	public static void method2957() {
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub13_2, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub13_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub3_1, 2);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub3_2, 2);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub1_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub20_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub16_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub27_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub4_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub17_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub14_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub21_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub2_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub12_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub26_2, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub26_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub9_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub7_1, 0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub29_1, 0);
		Static470.method7025();
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub11_1, 1);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub15_1, 3);
		Static180.method3451();
		Static364.method5679();
		Static226.aBoolean386 = true;
	}
}
