import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "J")
	public static long aLong2;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array3 = new Class34[500];

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_39 = Static56.method816("blinken1:");

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
	public static int[] anIntArray12 = new int[100];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method39() {
		anIntArray12 = null;
		aClass34_39 = null;
		aByteArrayArrayArray1 = null;
		aClass34Array3 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
	public static void method40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
			for (local19 = 0; local19 < 8; local19++) {
				Static24.anIntArrayArrayArray4[arg2][arg0 + local15][arg1 + local19] = 0;
			}
		}
		if (arg0 > 0) {
			for (local19 = 1; local19 < 8; local19++) {
				Static24.anIntArrayArrayArray4[arg2][arg0][local19 + arg1] = Static24.anIntArrayArrayArray4[arg2][arg0 - 1][local19 + arg1];
			}
		}
		if (arg1 > 0) {
			for (local19 = 1; local19 < 8; local19++) {
				Static24.anIntArrayArrayArray4[arg2][local19 + arg0][arg1] = Static24.anIntArrayArrayArray4[arg2][arg0 + local19][arg1 - 1];
			}
		}
		if (arg0 > 0 && Static24.anIntArrayArrayArray4[arg2][arg0 - 1][arg1] != 0) {
			Static24.anIntArrayArrayArray4[arg2][arg0][arg1] = Static24.anIntArrayArrayArray4[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && Static24.anIntArrayArrayArray4[arg2][arg0][arg1 - 1] != 0) {
			Static24.anIntArrayArrayArray4[arg2][arg0][arg1] = Static24.anIntArrayArrayArray4[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && Static24.anIntArrayArrayArray4[arg2][arg0 - 1][arg1 - 1] != 0) {
			Static24.anIntArrayArrayArray4[arg2][arg0][arg1] = Static24.anIntArrayArrayArray4[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	public static void method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(16) Class8_Sub1_Sub8 local16 = (Class8_Sub1_Sub8) Static58.aClass7_10.method45(local10);
		if (local16 != null) {
			Static78.aClass60_2.method1355(local16);
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public static void method42() {
		try {
			if (Static51.aClass31_1 == null) {
				Static51.aClass31_1 = new Class31(Static93.aClass40_3, Static44.method669(new Class34[] { Static14.aClass34_204, Static36.aClass34_500, Static8.aClass34_107 }).method832());
			} else {
				@Pc(7) byte[] local7 = Static51.aClass31_1.method771();
				if (local7 != null) {
					@Pc(14) Class8_Sub20 local14 = new Class8_Sub20(local7);
					Static116.anInt2617 = local14.method1839();
					Static91.aClass2Array1 = new Class2[Static116.anInt2617];
					for (@Pc(23) int local23 = 0; local23 < Static116.anInt2617; local23++) {
						@Pc(33) Class2 local33 = Static91.aClass2Array1[local23] = new Class2();
						@Pc(37) int local37 = local14.method1839();
						local33.aBoolean2 = (local37 & 0x8000) != 0;
						local33.anInt30 = local37 & 0x7FFF;
						local33.aClass34_5 = local14.method1892();
						local33.anInt27 = local14.method1856();
						local33.anInt36 = local23;
						local33.anInt31 = Static45.method683(local33.aClass34_5);
					}
					Static115.method1634(0, Static91.aClass2Array1, Static91.aClass2Array1.length - 1, Static101.anIntArray325, Static68.anIntArray208);
					Static51.aClass31_1 = null;
					Static115.aBoolean104 = true;
				}
			}
		} catch (@Pc(118) Exception local118) {
			local118.printStackTrace();
			Static51.aClass31_1 = null;
		}
	}
}
