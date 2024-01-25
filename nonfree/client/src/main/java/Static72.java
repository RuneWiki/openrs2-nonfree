import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
	public static int anInt1776;

	@OriginalMember(owner = "client!dq", name = "R", descriptor = "Lclient!qv;")
	public static Class214 aClass214_68;

	@OriginalMember(owner = "client!dq", name = "F", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_67 = new Class214(94, 6);

	@OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
	public static int anInt1777 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1583(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = arg0.charAt(local17) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)I")
	public static int method1584() {
		return Static87.anInt1986;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLclient!ki;)V")
	public static void method1585(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(11) Class4_Sub6 local11 = (Class4_Sub6) Static48.aClass96_3.method2797((long) arg0.anInt6518);
		if (local11 == null) {
			return;
		}
		if (local11.aClass4_Sub7_Sub1_3 != null) {
			Static132.aClass4_Sub7_Sub4_1.method5474(local11.aClass4_Sub7_Sub1_3);
			local11.aClass4_Sub7_Sub1_3 = null;
		}
		local11.method6330();
	}

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "(B)V")
	public static void method1586() {
		Static24.aClass4_Sub14_1 = new Class4_Sub14(Static267.aClass21_74.method362(Static168.anInt3290), "", Static457.anInt7815, 1002, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
	public static void method1587() {
		Static133.aClass59_1.method1766();
		Static240.aClass121_3.method3393();
		Static383.aClass126_2.method3431();
		Static146.aClass228_1.method5205();
		Static220.aClass247_1.method5655();
		Static139.aClass193_1.method4646();
		Static143.aClass85_1.method2404();
		Static193.aClass186_1.method4457();
		Static166.aClass86_3.method2410();
		Static99.aClass50_1.method1528();
		Static123.aClass223_1.method5134();
		Static261.aClass8_4.method65();
		Static62.aClass116_1.method3299();
		Static413.aClass257_1.method5856();
		Static203.aClass202_1.method4863();
		Static104.aClass180_1.method4412();
		Static348.aClass237_1.method5395();
		Static75.aClass207_1.method4887();
		Static433.aClass275_2.method6295();
		Static159.aClass218_1.method5096();
		Static47.method1040();
		Static105.method2008();
		Static31.method452();
		if (Static42.aClass219_1 != Static297.aClass219_2) {
			for (@Pc(76) int local76 = 0; local76 < Static1.aByteArrayArray1.length; local76++) {
				Static1.aByteArrayArray1[local76] = null;
			}
			Static459.anInt7451 = 0;
		}
		Static130.method2413();
		Static163.method6313();
		Static20.method5757();
		Static137.method2533();
		Static185.method3382();
		Static64.aClass83_11.method2346();
		Static30.aClass30_3.method2038();
		Static54.aClass181_5.method4417();
		Static191.method3428();
		Static302.aClass38_63.method1036();
		Static203.aClass38_45.method1036();
		Static29.aClass38_93.method1036();
		Static378.aClass38_77.method1036();
		Static180.aClass38_37.method1036();
		Static30.aClass38_8.method1036();
		Static296.aClass38_80.method1036();
		Static181.aClass38_39.method1036();
		Static143.aClass38_30.method1036();
		Static132.aClass38_29.method1036();
		Static228.aClass38_47.method1036();
		Static57.aClass38_12.method1036();
		Static308.aClass38_64.method1036();
		Static300.aClass38_60.method1036();
		Static30.aClass38_9.method1036();
		Static127.aClass38_26.method1036();
		Static340.aClass38_70.method1036();
		Static444.aClass38_92.method1036();
		Static327.aClass38_66.method1036();
		Static258.aClass38_38.method1036();
		Static220.aClass38_46.method1036();
		Static109.aClass38_22.method1036();
		Static65.aClass38_15.method1036();
		Static438.aClass38_91.method1036();
		Static249.aClass38_52.method1036();
		Static387.aClass38_79.method1036();
		Static34.aClass38_10.method1036();
		Static460.aClass38_94.method1036();
		Static228.aClass38_48.method1036();
		Static241.aClass38_51.method1036();
		Static285.aClass83_34.method2346();
		Static274.aClass83_32.method2346();
		Static138.aClass83_23.method2346();
		Static292.aClass83_37.method2346();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!sv;Z)Z")
	public static boolean method1589(@OriginalArg(0) Class11_Sub5 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static389.aClass14Array3 == Static77.aClass14Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6040();
		if (arg0.aShort95 < 0 || arg0.aShort93 < 0 || arg0.aShort94 >= Static230.anInt4581 || arg0.aShort92 >= Static268.anInt5106) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort95; local34 <= arg0.aShort94; local34++) {
			for (local38 = arg0.aShort93; local38 <= arg0.aShort92; local38++) {
				@Pc(45) Class162 local45 = Static408.method5689(arg0.aByte100, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort95) {
						local49++;
					}
					if (local34 < arg0.aShort94) {
						local49 += 4;
					}
					if (local38 > arg0.aShort93) {
						local49 += 8;
					}
					if (local38 < arg0.aShort92) {
						local49 += 2;
					}
					@Pc(74) Class199 local74 = Static258.method3309(local49, arg0);
					@Pc(77) Class199 local77 = local45.aClass199_1;
					if (local77 == null) {
						local45.aClass199_1 = local74;
					} else {
						while (local77.aClass199_2 != null) {
							local77 = local77.aClass199_2;
						}
						local77.aClass199_2 = local74;
					}
					local45.aByte62 = (byte) (local45.aByte62 | local49);
					if (local6 && (Static383.anIntArrayArray47[local34][local38] & 0xFF000000) != 0) {
						local8 = Static383.anIntArrayArray47[local34][local38];
						local10 = Static231.aShortArrayArray6[local34][local38];
						local12 = Static410.aByteArrayArray20[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort95; local38 <= arg0.aShort94; local38++) {
				for (@Pc(150) int local150 = arg0.aShort93; local150 <= arg0.aShort92; local150++) {
					if ((Static383.anIntArrayArray47[local38][local150] & 0xFF000000) == 0) {
						Static383.anIntArrayArray47[local38][local150] = local8;
						Static231.aShortArrayArray6[local38][local150] = local10;
						Static410.aByteArrayArray20[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static95.aClass11_Sub5Array1[Static132.anInt2706++] = arg0;
		}
		return true;
	}
}
