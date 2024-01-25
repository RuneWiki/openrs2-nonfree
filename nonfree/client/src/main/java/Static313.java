import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "[I")
	public static int[] anIntArray441 = new int[1];

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray159 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIJI)V")
	public static void method4473(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) arg1 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg1 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local14 != 10 && local14 != 11 && local14 != 22) {
			Static52.method875(arg0, 0, 0, true, 0, local21, local14, arg2);
			return;
		}
		@Pc(60) Class182 local60 = Static71.aClass105_6.method2336(local28);
		@Pc(73) int local73;
		@Pc(70) int local70;
		if (local21 == 0 || local21 == 2) {
			local70 = local60.anInt5487;
			local73 = local60.anInt5486;
		} else {
			local70 = local60.anInt5486;
			local73 = local60.anInt5487;
		}
		@Pc(84) int local84 = local60.anInt5484;
		if (local21 != 0) {
			local84 = (local84 << local21 & 0xF) + (local84 >> 4 - local21);
		}
		Static52.method875(arg0, local73, local70, true, local84, 0, 0, arg2);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BB)V")
	public static void method4474(@OriginalArg(0) byte arg0) {
		if (Static443.aByteArrayArrayArray17 == null) {
			Static443.aByteArrayArrayArray17 = new byte[4][Static135.anInt2314][Static352.anInt6022];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(24) int local24 = 0; local24 < Static135.anInt2314; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static352.anInt6022; local28++) {
					Static443.aByteArrayArrayArray17[local20][local24][local28] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIZ)V")
	public static void method4475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static130.method1891(arg1)) {
			Static124.method1857(Static448.aClass219ArrayArray2[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILclient!a;)Z")
	public static boolean method4476(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method146(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(120) int local120;
		if (local8 == 0) {
			if (arg1.method146(1) != 0) {
				method4476(arg0, arg1);
			}
			local31 = arg1.method146(6);
			local36 = arg1.method146(6);
			@Pc(46) boolean local46 = arg1.method146(1) == 1;
			if (local46) {
				Static160.anIntArray258[Static119.anInt7597++] = arg0;
			}
			if (Static311.aClass26_Sub2_Sub2_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(69) Class174 local69 = Static455.aClass174Array3[arg0];
			@Pc(77) Class26_Sub2_Sub2_Sub1 local77 = Static311.aClass26_Sub2_Sub2_Sub1Array1[arg0] = new Class26_Sub2_Sub2_Sub1();
			local77.anInt7097 = arg0;
			if (Static154.aClass1_Sub1Array1[arg0] != null) {
				local77.method5262(Static154.aClass1_Sub1Array1[arg0]);
			}
			local77.method5537(local69.anInt4948);
			local77.anInt7090 = local69.anInt4949;
			local102 = local69.anInt4946;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			local77.aBoolean432 = local69.aBoolean330;
			local120 = local102 & 0xFF;
			local77.aByteArray84[0] = Static444.aByteArray87[arg0];
			local77.aByte95 = (byte) local106;
			local77.method5256((local112 << 6) + local31 - Static437.anInt7555, -Static134.anInt5502 + local36 + (local120 << 6));
			local77.aBoolean434 = false;
			Static455.aClass174Array3[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg1.method146(2);
			local36 = Static455.aClass174Array3[arg0].anInt4946;
			Static455.aClass174Array3[arg0].anInt4946 = (local36 & 0xFFFFFFF) + (((local36 >> 28) + local31 & 0x3) << 28);
			return false;
		} else {
			@Pc(209) int local209;
			@Pc(222) int local222;
			if (local8 != 2) {
				local31 = arg1.method146(18);
				local36 = local31 >> 16;
				local209 = local31 >> 8 & 0xFF;
				local222 = local31 & 0xFF;
				local102 = Static455.aClass174Array3[arg0].anInt4946;
				local106 = local36 + (local102 >> 28) & 0x3;
				local112 = (local102 >> 14) + local209 & 0xFF;
				local120 = local222 + local102 & 0xFF;
				Static455.aClass174Array3[arg0].anInt4946 = local120 + (local106 << 28) + (local112 << 14);
				return false;
			}
			local31 = arg1.method146(5);
			local36 = local31 >> 3;
			local209 = local31 & 0x7;
			@Pc(214) int local214 = Static455.aClass174Array3[arg0].anInt4946;
			local222 = local36 + (local214 >> 28) & 0x3;
			local102 = local214 >> 14 & 0xFF;
			local106 = local214 & 0xFF;
			if (local209 == 0) {
				local106--;
				local102--;
			}
			if (local209 == 1) {
				local106--;
			}
			if (local209 == 2) {
				local106--;
				local102++;
			}
			if (local209 == 3) {
				local102--;
			}
			if (local209 == 4) {
				local102++;
			}
			if (local209 == 5) {
				local102--;
				local106++;
			}
			if (local209 == 6) {
				local106++;
			}
			if (local209 == 7) {
				local102++;
				local106++;
			}
			Static455.aClass174Array3[arg0].anInt4946 = (local222 << 28) + (local102 << 14) + local106;
			return false;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)Lclient!mt;")
	public static Class63 method4477() {
		try {
			return new Class63_Sub1();
		} catch (@Pc(16) Throwable local16) {
			try {
				return (Class63) Class.forName("Class63_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class63_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V")
	public static void method4478() {
		Static432.method5764();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)V")
	public static void method4479(@OriginalArg(1) int arg0) {
		if (Static144.anInt2452 == 0) {
			Static327.aClass1_Sub7_Sub3_3.method4997(arg0);
		} else {
			Static228.anInt4117 = arg0;
		}
	}
}
