import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
	public static int anInt5746;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
	public static int anInt5741 = 0;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "[Lclient!rt;")
	public static Class216[] aClass216Array1 = new Class216[50];

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "[I")
	public static final int[] anIntArray353 = new int[5];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)V")
	public static void method4769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		Static19.aFloat6 = local3;
		if (Static27.anInt490 == 2) {
			Static372.anInt6317 = local3;
			Static419.anInt7092 = local7;
			Static205.anInt5939 = 0;
		}
		Static275.aFloat61 = local7;
		Static252.method3554();
		Static179.aBoolean252 = true;
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
	public static void method4772() {
		Static301.aClass237_5.method5435();
		Static178.aClass231_4.method5383();
		Static421.aClass7_1.method141();
		Static9.aClass149_1.method3575();
		Static118.aClass19_1.method402();
		Static158.aClass272_1.method6282();
		Static444.aClass59_3.method1550();
		Static387.aClass201_2.method4770();
		Static256.aClass112_1.method2865();
		Static208.aClass159_1.method3768();
		Static212.aClass238_1.method5442();
		Static462.aClass182_4.method4368();
		Static212.aClass45_3.method1251();
		Static113.aClass206_2.method4885();
		Static70.aClass15_1.method327();
		Static335.aClass58_1.method1546();
		Static448.aClass172_1.method4199();
		Static84.aClass87_3.method2047();
		Static57.aClass98_1.method2342();
		Static227.aClass260_1.method5944();
		Static118.method1898();
		Static381.method5285();
		Static431.method5864();
		if (Static230.aClass35_2 != Static80.aClass35_1) {
			for (@Pc(86) int local86 = 0; local86 < Static351.aByteArrayArray24.length; local86++) {
				Static351.aByteArrayArray24[local86] = null;
			}
			Static376.anInt6360 = 0;
		}
		Static134.method2072();
		Static278.method3846();
		Static339.method4725();
		Static21.method6254();
		Static311.method4372();
		Static219.aClass268_31.method6160();
		Static413.aClass167_11.method5991();
		Static248.aClass85_6.method2041();
		Static298.method4262();
		Static255.aClass250_63.method5794();
		Static101.aClass250_34.method5794();
		Static326.aClass250_81.method5794();
		Static90.aClass250_30.method5794();
		Static156.aClass250_45.method5794();
		Static92.aClass250_31.method5794();
		Static28.aClass250_12.method5794();
		Static119.aClass250_38.method5794();
		Static8.aClass250_2.method5794();
		Static126.aClass250_39.method5794();
		Static409.aClass250_98.method5794();
		Static145.aClass250_42.method5794();
		Static317.aClass250_79.method5794();
		Static351.aClass250_88.method5794();
		Static72.aClass250_24.method5794();
		Static464.aClass250_106.method5794();
		Static30.aClass250_13.method5794();
		Static333.aClass250_83.method5794();
		Static441.aClass250_102.method5794();
		Static171.aClass250_48.method5794();
		Static324.aClass250_80.method5794();
		Static6.aClass250_1.method5794();
		Static327.aClass250_82.method5794();
		Static171.aClass250_49.method5794();
		Static72.aClass250_23.method5794();
		Static180.aClass250_55.method5794();
		Static111.aClass250_37.method5794();
		Static339.aClass250_84.method5794();
		Static72.aClass250_25.method5794();
		Static158.aClass250_46.method5794();
		Static72.aClass268_12.method6160();
		Static313.aClass268_44.method6160();
		Static334.aClass268_46.method6160();
		Static437.aClass268_58.method6160();
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)I")
	public static int method4774(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}
}
