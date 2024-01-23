import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	public static int anInt5465;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "Lclient!cg;")
	public static Class22 aClass22_97;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "[I")
	public static int[] anIntArray435;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
	public static int anInt5478;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString185 = "Loading interfaces - ";

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public static int anInt5471 = 255;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "Lclient!lg;")
	public static Class97 aClass97_21 = null;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
	public static int anInt5479 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public static void method4344() {
		if (Static115.aClass4_Sub2_Sub18_1 == null) {
			return;
		}
		if (Static219.anInt4212 < 10) {
			if (!Static245.aClass22_82.method684(Static115.aClass4_Sub2_Sub18_1.aString150)) {
				Static219.anInt4212 = Static52.aClass22_25.method657(Static115.aClass4_Sub2_Sub18_1.aString150) / 10;
				return;
			}
			Static44.method848();
			Static219.anInt4212 = 10;
		}
		if (Static219.anInt4212 == 10) {
			Static133.anInt2663 = Static115.aClass4_Sub2_Sub18_1.anInt4535 >> 6 << 6;
			@Pc(50) int local50 = -1;
			Static175.anInt3552 = Static115.aClass4_Sub2_Sub18_1.anInt4528 >> 6 << 6;
			Static158.anInt3242 = (Static115.aClass4_Sub2_Sub18_1.anInt4536 >> 6 << 6) - (Static133.anInt2663 - 64);
			@Pc(70) int local70 = -1;
			Static207.anInt2141 = (Static115.aClass4_Sub2_Sub18_1.anInt4525 >> 6 << 6) + 64 - Static175.anInt3552;
			@Pc(98) int[] local98 = Static115.aClass4_Sub2_Sub18_1.method3540((Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7) + Static105.anInt2105, (Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7) + Static269.anInt5357, Static222.anInt4467);
			if (local98 != null) {
				local70 = Static133.anInt2663 + Static158.anInt3242 - local98[2] - 1;
				local50 = local98[1] - Static175.anInt3552;
			}
			if (local50 >= 0 && Static207.anInt2141 > local50 && local70 >= 0 && local70 < Static158.anInt3242) {
				local70 += (int) (Math.random() * 10.0D) - 5;
				Static104.anInt2092 = local70;
				local50 += (int) (Math.random() * 10.0D) - 5;
				Static208.anInt4072 = local50;
			} else {
				@Pc(161) int[] local161;
				if (Static148.anInt2908 == -1 || Static273.anInt5430 == -1) {
					local161 = Static115.aClass4_Sub2_Sub18_1.method3547(Static115.aClass4_Sub2_Sub18_1.anInt4530 >> 14 & 0x3FFF, Static115.aClass4_Sub2_Sub18_1.anInt4530 & 0x3FFF);
					Static208.anInt4072 = local161[1] - Static175.anInt3552;
					Static104.anInt2092 = Static133.anInt2663 + Static158.anInt3242 - local161[2] - 1;
				} else {
					local161 = Static115.aClass4_Sub2_Sub18_1.method3547(Static148.anInt2908, Static273.anInt5430);
					if (local161 != null) {
						Static208.anInt4072 = local161[1] - Static175.anInt3552;
						Static104.anInt2092 = Static158.anInt3242 + Static133.anInt2663 - local161[2] - 1;
					}
					Static273.anInt5430 = -1;
					Static148.anInt2908 = -1;
				}
			}
			if (Static115.aClass4_Sub2_Sub18_1.anInt4541 == 37) {
				Static64.aFloat35 = 3.0F;
				Static5.aFloat4 = 3.0F;
			} else if (Static115.aClass4_Sub2_Sub18_1.anInt4541 == 50) {
				Static64.aFloat35 = 4.0F;
				Static5.aFloat4 = 4.0F;
			} else if (Static115.aClass4_Sub2_Sub18_1.anInt4541 == 75) {
				Static64.aFloat35 = 6.0F;
				Static5.aFloat4 = 6.0F;
			} else if (Static115.aClass4_Sub2_Sub18_1.anInt4541 == 100) {
				Static64.aFloat35 = 8.0F;
				Static5.aFloat4 = 8.0F;
			} else if (Static115.aClass4_Sub2_Sub18_1.anInt4541 == 200) {
				Static64.aFloat35 = 16.0F;
				Static5.aFloat4 = 16.0F;
			} else {
				Static64.aFloat35 = 8.0F;
				Static5.aFloat4 = 8.0F;
			}
			Static72.method1221();
			Static112.anIntArray191 = new int[Static17.anInt384 + 1];
			@Pc(308) int local308 = Static207.anInt2141 >> 6;
			@Pc(312) int local312 = Static158.anInt3242 >> 6;
			Static280.anIntArrayArrayArray14 = new int[local308][local312][];
			Static243.anIntArrayArrayArray13 = new int[local308][local312][];
			Static211.aByteArrayArrayArray12 = new byte[local308][local312][];
			Static108.anIntArrayArrayArray2 = new int[local308][local312][];
			Static245.aByteArrayArrayArray14 = new byte[local308][local312][];
			Static301.aByteArrayArrayArray17 = new byte[local308][local312][];
			Static138.aByteArrayArrayArray9 = new byte[local308][local312][];
			@Pc(346) int local346 = Static97.anInt4593 >> 2 << 10;
			Static293.aByteArrayArrayArray16 = new byte[local308][local312][];
			@Pc(354) int local354 = Static205.anInt4048 >> 1;
			Static10.method199(local354, local346);
			Static219.anInt4212 = 20;
		} else if (Static219.anInt4212 == 20) {
			Static301.method4636(new Class4_Sub24(Static245.aClass22_82.method681("underlay", Static115.aClass4_Sub2_Sub18_1.aString150)));
			Static219.anInt4212 = 30;
			Static20.method2327(true);
			Static298.method4218();
		} else if (Static219.anInt4212 == 30) {
			Static178.method2926(new Class4_Sub24(Static245.aClass22_82.method681("overlay", Static115.aClass4_Sub2_Sub18_1.aString150)));
			Static219.anInt4212 = 40;
			Static298.method4218();
		} else if (Static219.anInt4212 == 40) {
			Static16.method288(new Class4_Sub24(Static245.aClass22_82.method681("overlay2", Static115.aClass4_Sub2_Sub18_1.aString150)));
			Static219.anInt4212 = 50;
			Static298.method4218();
		} else if (Static219.anInt4212 == 50) {
			Static92.method1530(new Class4_Sub24(Static245.aClass22_82.method681("loc", Static115.aClass4_Sub2_Sub18_1.aString150)));
			Static219.anInt4212 = 60;
			Static20.method2327(true);
			Static298.method4218();
		} else if (Static219.anInt4212 == 60) {
			if (Static245.aClass22_82.method670(Static115.aClass4_Sub2_Sub18_1.aString150 + "_labels")) {
				if (!Static245.aClass22_82.method684(Static115.aClass4_Sub2_Sub18_1.aString150 + "_labels")) {
					return;
				}
				Static209.aClass100_3 = Static138.method2222(Static245.aClass22_82, Static115.aClass4_Sub2_Sub18_1.aString150 + "_labels");
			} else {
				Static209.aClass100_3 = new Class100(0);
			}
			Static219.anInt4212 = 70;
			Static298.method4218();
		} else if (Static219.anInt4212 == 70) {
			Static299.aClass177_7 = new Class177(11, true, Static139.aCanvas1);
			Static219.anInt4212 = 73;
			Static20.method2327(true);
			Static298.method4218();
		} else if (Static219.anInt4212 == 73) {
			Static143.aClass177_6 = new Class177(12, true, Static139.aCanvas1);
			Static219.anInt4212 = 76;
			Static20.method2327(true);
			Static298.method4218();
		} else if (Static219.anInt4212 == 76) {
			Static308.aClass177_8 = new Class177(14, true, Static139.aCanvas1);
			Static219.anInt4212 = 79;
			Static20.method2327(true);
			Static298.method4218();
		} else if (Static219.anInt4212 == 79) {
			Static114.aClass177_4 = new Class177(17, true, Static139.aCanvas1);
			Static219.anInt4212 = 82;
			Static20.method2327(true);
			Static298.method4218();
		} else if (Static219.anInt4212 == 82) {
			Static74.aClass177_1 = new Class177(19, true, Static139.aCanvas1);
			Static219.anInt4212 = 85;
			Static20.method2327(true);
			Static298.method4218();
		} else if (Static219.anInt4212 == 85) {
			Static101.aClass177_2 = new Class177(22, true, Static139.aCanvas1);
			Static219.anInt4212 = 88;
			Static20.method2327(true);
			Static298.method4218();
		} else if (Static219.anInt4212 == 88) {
			Static112.aClass177_3 = new Class177(26, true, Static139.aCanvas1);
			Static219.anInt4212 = 91;
			Static20.method2327(true);
			Static298.method4218();
		} else {
			Static132.aClass177_5 = new Class177(30, true, Static139.aCanvas1);
			Static219.anInt4212 = 100;
			Static20.method2327(true);
			Static298.method4218();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)I")
	public static int method4351(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0xF3333333) + (local13 & 0x33333333);
		@Pc(36) int local36 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}
}
