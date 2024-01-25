import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "F")
	public static float aFloat210;

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "Lclient!id;")
	public static final Class155 aClass155_6 = new Class155();

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "[I")
	public static int[] anIntArray556 = new int[2];

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString125 = null;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZIIIIIIIII)Z")
	public static boolean method6730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static431.method5688(arg4, arg0, arg7)) {
			return false;
		}
		@Pc(15) int local15 = Static422.anIntArray451[0];
		@Pc(19) int local19 = Static422.anIntArray451[1];
		@Pc(23) int local23 = Static422.anIntArray451[2];
		if (!Static431.method5688(arg1, arg8, arg6)) {
			return false;
		}
		@Pc(40) int local40 = Static422.anIntArray451[1];
		@Pc(44) int local44 = Static422.anIntArray451[0];
		@Pc(48) int local48 = Static422.anIntArray451[2];
		if (Static431.method5688(arg3, arg2, arg5)) {
			@Pc(60) int local60 = Static422.anIntArray451[1];
			@Pc(64) int local64 = Static422.anIntArray451[0];
			@Pc(68) int local68 = Static422.anIntArray451[2];
			return Static183.method2352(local40, local48, local60, local68, local19, local15, local23, local64, local44);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
	public static void method6731() {
		Static386.anInt6384 = 0;
		@Pc(16) boolean local16 = Static361.aClass2_Sub7_Sub2_1.method4464() == 1;
		@Pc(20) int local20 = Static361.aClass2_Sub7_Sub2_1.method4465();
		@Pc(24) int local24 = Static361.aClass2_Sub7_Sub2_1.method4518();
		@Pc(28) int local28 = Static361.aClass2_Sub7_Sub2_1.method4464();
		Static489.method6264();
		Static589.method7515(local28);
		@Pc(41) int local41 = (Static528.anInt8479 - Static361.aClass2_Sub7_Sub2_1.anInt5186) / 16;
		Static378.anIntArrayArray44 = new int[local41][4];
		@Pc(51) int local51;
		for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static378.anIntArrayArray44[local47][local51] = Static361.aClass2_Sub7_Sub2_1.method4509();
			}
		}
		Static327.anIntArray374 = new int[local41];
		Static26.aByteArrayArray1 = null;
		Static571.aByteArrayArray23 = new byte[local41][];
		Static396.aByteArrayArray15 = new byte[local41][];
		Static336.anIntArray377 = null;
		Static301.anIntArray349 = new int[local41];
		Static491.anIntArray519 = new int[local41];
		Static196.anIntArray240 = new int[local41];
		Static420.anIntArray479 = new int[local41];
		Static418.aByteArrayArray17 = new byte[local41][];
		Static210.aByteArrayArray9 = new byte[local41][];
		local41 = 0;
		for (local51 = (local24 - (Static281.anInt4822 >> 4)) / 8; local51 <= (local24 + (Static281.anInt4822 >> 4)) / 8; local51++) {
			for (@Pc(126) int local126 = (local20 - (Static29.anInt491 >> 4)) / 8; local126 <= (local20 + (Static29.anInt491 >> 4)) / 8; local126++) {
				Static301.anIntArray349[local41] = (local51 << 8) + local126;
				Static327.anIntArray374[local41] = Static372.aClass229_89.method4955("m" + local51 + "_" + local126);
				Static196.anIntArray240[local41] = Static372.aClass229_89.method4955("l" + local51 + "_" + local126);
				Static420.anIntArray479[local41] = Static372.aClass229_89.method4955("um" + local51 + "_" + local126);
				Static491.anIntArray519[local41] = Static372.aClass229_89.method4955("ul" + local51 + "_" + local126);
				local41++;
			}
		}
		Static412.method5556(local20, 11, local24, local16);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	public static void method6733() {
		Static276.anInt4774 = Static266.aClass112_7.anInt2430 + Static266.aClass112_7.anInt2421 + 2;
		Static64.anInt1146 = Static537.aClass112_11.anInt2430 + Static537.aClass112_11.anInt2421 + 2;
		Static311.aStringArray28 = new String[500];
		for (@Pc(30) int local30 = 0; local30 < Static311.aStringArray28.length; local30++) {
			Static311.aStringArray28[local30] = "";
		}
		Static144.method1990(Static229.aClass159_3.method2776(Static261.anInt4297));
	}
}
