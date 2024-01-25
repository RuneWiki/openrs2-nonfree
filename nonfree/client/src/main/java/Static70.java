import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
	public static int anInt1720 = 0;

	@OriginalMember(owner = "client!dm", name = "P", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_22 = new Class21("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!dm", name = "Q", descriptor = "[Lclient!rw;")
	public static final Class4_Sub1_Sub17[] aClass4_Sub1_Sub17Array3 = new Class4_Sub1_Sub17[14];

	@OriginalMember(owner = "client!dm", name = "U", descriptor = "I")
	public static int anInt1726 = 0;

	@OriginalMember(owner = "client!dm", name = "Y", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_66 = new Class214(65, 6);

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
	public static void method1547() {
		Static90.method5069(Static157.aClass185_Sub1_1.anInt5564);
		@Pc(17) int local17 = (Static235.anInt4645 >> 10) + (Static426.anInt7325 >> 3);
		Static59.anInt1472 = Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 = 0;
		@Pc(30) int local30 = (Static108.anInt2350 >> 10) + (Static72.anInt1776 >> 3);
		Static52.aClass11_Sub5_Sub2_Sub1_2.method3617(8, 8);
		Static8.aByteArrayArray2 = new byte[18][];
		Static431.anIntArray600 = new int[18];
		Static423.anIntArrayArray57 = new int[18][4];
		Static4.anIntArray6 = new int[18];
		Static402.anIntArray574 = new int[18];
		Static164.aByteArrayArray14 = new byte[18][];
		Static256.aByteArrayArray15 = new byte[18][];
		Static55.anIntArray82 = new int[18];
		Static109.anIntArray203 = new int[18];
		Static353.aByteArrayArray18 = new byte[18][];
		Static129.anIntArray233 = new int[18];
		Static125.aByteArrayArray9 = new byte[18][];
		@Pc(81) int local81 = 0;
		@Pc(101) int local101;
		for (@Pc(90) int local90 = (local17 - (Static193.anInt3853 >> 4)) / 8; local90 <= (local17 + (Static193.anInt3853 >> 4)) / 8; local90++) {
			for (local101 = (local30 - (Static301.anInt5585 >> 4)) / 8; local101 <= (local30 + (Static301.anInt5585 >> 4)) / 8; local101++) {
				@Pc(109) int local109 = local101 + (local90 << 8);
				Static109.anIntArray203[local81] = local109;
				Static431.anIntArray600[local81] = Static30.aClass38_8.method1045("m" + local90 + "_" + local101);
				Static55.anIntArray82[local81] = Static30.aClass38_8.method1045("l" + local90 + "_" + local101);
				Static4.anIntArray6[local81] = Static30.aClass38_8.method1045("n" + local90 + "_" + local101);
				Static129.anIntArray233[local81] = Static30.aClass38_8.method1045("um" + local90 + "_" + local101);
				Static402.anIntArray574[local81] = Static30.aClass38_8.method1045("ul" + local90 + "_" + local101);
				if (Static4.anIntArray6[local81] == -1) {
					Static431.anIntArray600[local81] = -1;
					Static55.anIntArray82[local81] = -1;
					Static129.anIntArray233[local81] = -1;
					Static402.anIntArray574[local81] = -1;
				}
				local81++;
			}
		}
		for (local101 = local81; local101 < Static4.anIntArray6.length; local101++) {
			Static4.anIntArray6[local101] = -1;
			Static431.anIntArray600[local101] = -1;
			Static55.anIntArray82[local101] = -1;
			Static129.anIntArray233[local101] = -1;
			Static402.anIntArray574[local101] = -1;
		}
		@Pc(281) byte local281;
		if (anInt1726 == 1 || anInt1726 == 2) {
			local281 = 3;
		} else {
			local281 = 7;
		}
		Static181.method3319(local17, local30, local281, false);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method1550(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(19) String local19 = arg0[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(35) int local35 = arg2 + arg1;
			@Pc(37) int local37 = 0;
			for (@Pc(39) int local39 = arg2; local39 < local35; local39++) {
				@Pc(45) String local45 = arg0[local39];
				if (local45 == null) {
					local37 += 4;
				} else {
					local37 += local45.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local37);
			for (@Pc(66) int local66 = arg2; local66 < local35; local66++) {
				@Pc(72) String local72 = arg0[local66];
				if (local72 == null) {
					local64.append("null");
				} else {
					local64.append(local72);
				}
			}
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIBI)V")
	public static void method1554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static55.anInt1319 < arg2 || Static162.anInt1715 > arg3) {
			return;
		}
		@Pc(23) boolean local23;
		if (arg4 < Static176.anInt3462) {
			local23 = false;
			arg4 = Static176.anInt3462;
		} else if (arg4 <= Static418.anInt3023) {
			local23 = true;
		} else {
			arg4 = Static418.anInt3023;
			local23 = false;
		}
		@Pc(51) boolean local51;
		if (arg0 < Static176.anInt3462) {
			local51 = false;
			arg0 = Static176.anInt3462;
		} else if (Static418.anInt3023 < arg0) {
			local51 = false;
			arg0 = Static418.anInt3023;
		} else {
			local51 = true;
		}
		if (arg2 >= Static162.anInt1715) {
			Static236.method3990(arg0, arg4, Static400.anIntArrayArray54[arg2++], arg1);
		} else {
			arg2 = Static162.anInt1715;
		}
		if (Static55.anInt1319 >= arg3) {
			Static236.method3990(arg0, arg4, Static400.anIntArrayArray54[arg3--], arg1);
		} else {
			arg3 = Static55.anInt1319;
		}
		@Pc(109) int local109;
		if (local23 && local51) {
			for (local109 = arg2; local109 <= arg3; local109++) {
				@Pc(151) int[] local151 = Static400.anIntArrayArray54[local109];
				local151[arg4] = local151[arg0] = arg1;
			}
		} else if (local23) {
			for (local109 = arg2; local109 <= arg3; local109++) {
				Static400.anIntArrayArray54[local109][arg4] = arg1;
			}
		} else if (local51) {
			for (local109 = arg2; local109 <= arg3; local109++) {
				Static400.anIntArrayArray54[local109][arg0] = arg1;
			}
		}
	}
}
