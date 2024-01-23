import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "W", descriptor = "I")
	public static int anInt43;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!oj;")
	public static Class84 aClass84_1 = new Class84(30);

	@OriginalMember(owner = "client!a", name = "S", descriptor = "I")
	public static int anInt40 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!a", name = "U", descriptor = "I")
	public static int anInt41 = 0;

	@OriginalMember(owner = "client!a", name = "V", descriptor = "I")
	public static int anInt42 = 0;

	@OriginalMember(owner = "client!a", name = "X", descriptor = "[I")
	public static int[] anIntArray10 = new int[5];

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "Z")
	public static boolean aBoolean1 = true;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg5 - arg7;
		@Pc(21) int local21 = (arg6 - arg4 << 16) / local12;
		@Pc(25) int local25 = arg2 - arg0;
		@Pc(37) int local37 = (arg3 - arg1 << 16) / local25;
		Static32.method466(local37, arg7, arg0, arg5, arg2, local21, arg1, arg4);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!pa;I)V")
	public static void method30(@OriginalArg(0) Class86 arg0) {
		Static213.aClass78_Sub1Array7 = Static203.method545(arg0, Static176.anInt3693);
		Static147.anIntArray318 = new int[256];
		@Pc(36) int local36;
		for (@Pc(15) int local15 = 0; local15 < 3; local15++) {
			@Pc(26) float local26 = (float) (Static120.anIntArray265[local15] >> 16 & 0xFF);
			local36 = Static120.anIntArray265[local15 + 1] >> 16 & 0xFF;
			@Pc(43) float local43 = ((float) local36 - local26) / 64.0F;
			@Pc(52) float local52 = (float) (Static120.anIntArray265[local15] >> 8 & 0xFF);
			@Pc(62) int local62 = Static120.anIntArray265[local15 + 1] >> 8 & 0xFF;
			@Pc(69) float local69 = ((float) local62 - local52) / 64.0F;
			@Pc(76) float local76 = (float) (Static120.anIntArray265[local15] & 0xFF);
			@Pc(84) int local84 = Static120.anIntArray265[local15 + 1] & 0xFF;
			@Pc(92) float local92 = ((float) local84 - local76) / 64.0F;
			for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
				Static147.anIntArray318[local15 * 64 + local94] = (int) local76 | (int) local26 << 16 | (int) local52 << 8;
				local26 += local43;
				local52 += local69;
				local76 += local92;
			}
		}
		for (local36 = 192; local36 < 255; local36++) {
			Static147.anIntArray318[local36] = Static120.anIntArray265[3];
		}
		Static141.anIntArray428 = new int[32768];
		Static91.anIntArray463 = new int[32768];
		Static158.method2636(null);
		Static109.anIntArray232 = new int[32768];
		Static144.anIntArray305 = new int[32768];
		Static92.aClass1_Sub1_Sub8_Sub1_1 = new Class1_Sub1_Sub8_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
	public static boolean method31(@OriginalArg(1) int arg0) {
		if (Static201.aBooleanArray22[arg0]) {
			return true;
		} else if (Static145.aClass86_53.method3314(arg0)) {
			@Pc(23) int local23 = Static145.aClass86_53.method3323(arg0);
			if (local23 == 0) {
				Static201.aBooleanArray22[arg0] = true;
				return true;
			}
			if (Static54.aClass93ArrayArray1[arg0] == null) {
				Static54.aClass93ArrayArray1[arg0] = new Class93[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static54.aClass93ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static145.aClass86_53.method3325(arg0, local45);
					if (local59 != null) {
						Static54.aClass93ArrayArray1[arg0][local45] = new Class93();
						Static54.aClass93ArrayArray1[arg0][local45].anInt3603 = local45 + (arg0 << 16);
						if (local59[0] == -1) {
							Static54.aClass93ArrayArray1[arg0][local45].method2907(new Class1_Sub17(local59));
						} else {
							Static54.aClass93ArrayArray1[arg0][local45].method2908(new Class1_Sub17(local59));
						}
					}
				}
			}
			Static201.aBooleanArray22[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIII)V")
	public static void method32(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 >= Static131.anInt2713 && Static135.anInt2790 >= arg3 && arg4 >= Static49.anInt1030 && arg2 <= Static177.anInt3701) {
			Static163.method2724(arg0, arg3, arg1, arg6, arg4, arg5, arg2);
		} else {
			Static74.method1090(arg5, arg6, arg1, arg2, arg4, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qh;I)V")
	public static void method34(@OriginalArg(0) Class93 arg0) {
		@Pc(14) int local14 = arg0.anInt3618;
		if (local14 == 324) {
			if (Static44.anInt938 == -1) {
				Static176.anInt3691 = arg0.anInt3601;
				Static44.anInt938 = arg0.anInt3676;
			}
			if (Static16.aClass25_1.aBoolean47) {
				arg0.anInt3676 = Static44.anInt938;
			} else {
				arg0.anInt3676 = Static176.anInt3691;
			}
		} else if (local14 == 325) {
			if (Static44.anInt938 == -1) {
				Static176.anInt3691 = arg0.anInt3601;
				Static44.anInt938 = arg0.anInt3676;
			}
			if (Static16.aClass25_1.aBoolean47) {
				arg0.anInt3676 = Static176.anInt3691;
			} else {
				arg0.anInt3676 = Static44.anInt938;
			}
		} else if (local14 == 327) {
			arg0.anInt3607 = 150;
			arg0.anInt3624 = (int) (Math.sin((double) Static107.anInt2132 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3632 = -1;
			arg0.anInt3615 = 5;
		} else if (local14 == 328) {
			if (Static230.aClass20_Sub3_Sub1_3.aClass50_493 == null) {
				arg0.anInt3632 = 0;
			} else {
				arg0.anInt3607 = 150;
				arg0.anInt3624 = (int) (Math.sin((double) Static107.anInt2132 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3615 = 5;
				arg0.anInt3632 = ((int) Static230.aClass20_Sub3_Sub1_3.aClass50_493.method1221() << 11) + 2047;
				arg0.anInt3606 = Static230.aClass20_Sub3_Sub1_3.anInt3051;
				arg0.anInt3636 = Static230.aClass20_Sub3_Sub1_3.anInt3038;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
	public static void method35() {
		Static19.aClass1_Sub11ArrayArrayArray2 = new Class1_Sub11[4][104][104];
		Static224.anIntArrayArrayArray2 = new int[4][105][105];
		Static82.method1207();
		Static12.anInt236 = 104;
		Static232.anInt4450 = 104;
		Static69.anIntArrayArrayArray4 = new int[4][105][105];
		Static32.method462();
		Static75.anInt1524 = 25;
		Static16.aBooleanArrayArray1 = new boolean[Static75.anInt1524 + Static75.anInt1524 + 1][Static75.anInt1524 + Static75.anInt1524 + 1];
		Static129.aBooleanArrayArray2 = new boolean[Static75.anInt1524 + Static75.anInt1524 + 2][Static75.anInt1524 + Static75.anInt1524 + 2];
	}
}
