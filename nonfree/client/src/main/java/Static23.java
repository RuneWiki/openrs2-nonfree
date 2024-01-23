import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!pe;")
	public static Class1_Sub2_Sub15 aClass1_Sub2_Sub15_1;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!jb;")
	public static Class28 aClass28_11;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array2;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array3;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt441;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array2 = new Class107[1000];

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[5];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
	public static void method417(@OriginalArg(1) int arg0) {
		if (Static92.anIntArray204 == null || arg0 > Static92.anIntArray204.length) {
			Static92.anIntArray204 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BZ)[B")
	public static byte[] method418(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class1_Sub26 local13 = new Class1_Sub26(arg0);
		@Pc(17) int local17 = local13.method2945();
		@Pc(21) int local21 = local13.method2958();
		if (local21 < 0 || Static218.anInt4761 != 0 && local21 > Static218.anInt4761) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(40) byte[] local40 = new byte[local21];
			local13.method2959(local40, local21);
			return local40;
		} else {
			@Pc(52) int local52 = local13.method2958();
			if (local52 < 0 || Static218.anInt4761 != 0 && Static218.anInt4761 < local52) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local52];
			if (local17 == 1) {
				Static50.method1040(local73, local52, arg0, local21);
			} else {
				Static211.aClass52_1.method1389(local73, local13);
			}
			return local73;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLclient!sc;)V")
	public static void method419(@OriginalArg(1) Class107 arg0) {
		if (Static156.anInt3417 >= 2) {
			@Pc(19) int local19;
			@Pc(37) int local37;
			if (arg0.method3096(Static189.aClass107_1102)) {
				Static165.method1869();
				for (local19 = 0; local19 < 10; local19++) {
					System.gc();
				}
				@Pc(28) Runtime local28 = Runtime.getRuntime();
				local37 = (int) ((local28.totalMemory() - local28.freeMemory()) / 1024L);
				Static136.method2282(Static149.method2437(new Class107[] { Static86.aClass107_545, Static115.method2001(local37), Static55.aClass107_389 }), 0, null);
			}
			if (arg0.method3096(Static219.aClass107_1292)) {
				Static38.method718();
			}
			if (arg0.method3096(Static112.aClass107_670)) {
				Static52.method1046(25);
			}
			if (arg0.method3096(Static42.aClass107_290)) {
				Static25.aBoolean39 = true;
			}
			if (arg0.method3096(Static83.aClass107_524)) {
				Static25.aBoolean39 = false;
			}
			if (arg0.method3096(Static133.aClass107_772)) {
				for (local19 = 0; local19 < 4; local19++) {
					for (@Pc(99) int local99 = 1; local99 < 103; local99++) {
						for (local37 = 1; local37 < 103; local37++) {
							Static107.aClass60Array1[local19].anIntArrayArray24[local99][local37] = 0;
						}
					}
				}
			}
			if (arg0.method3099(Static140.aClass107_234) && Static88.anInt1920 != 0) {
				Static94.method1587(arg0.method3084(6).method3103());
			}
			if (arg0.method3096(Static24.aClass107_155) && Static88.anInt1920 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method3099(Static3.aClass107_1063)) {
				Static163.anInt3554 = arg0.method3084(12).method3101().method3103();
				Static136.method2282(Static149.method2437(new Class107[] { Static156.aClass107_902, Static115.method2001(Static163.anInt3554) }), 0, null);
			}
			if (arg0.method3096(Static157.aClass107_911)) {
				Static219.aBoolean426 = true;
			}
		}
		Static193.aClass1_Sub26_Sub1_2.method3000(215);
		Static193.aClass1_Sub26_Sub1_2.method2967(arg0.method3095() - 1);
		Static193.aClass1_Sub26_Sub1_2.method2979(arg0.method3084(2));
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!jb;BI)Z")
	public static boolean method421(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method836(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static16.method356(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static29.anIntArrayArrayArray2[arg0][local16][local20] == -Static86.anInt1909) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static166.anIntArrayArrayArray11[arg0][arg1][arg3] + arg5;
			if (!Static152.method2504(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static152.method2504(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static152.method2504(local20, local156, local182)) {
				return false;
			} else if (Static152.method2504(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static178.method2833(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static152.method2504(local16 + 1, Static166.anIntArrayArrayArray11[arg0][arg1][arg3] + arg5, local20 + 1) && Static152.method2504(local16 + 128 - 1, Static166.anIntArrayArrayArray11[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static152.method2504(local16 + 128 - 1, Static166.anIntArrayArrayArray11[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static152.method2504(local16 + 1, Static166.anIntArrayArrayArray11[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
