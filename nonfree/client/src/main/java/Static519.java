import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
	public static int anInt2067;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "Lclient!ie;")
	public static final Class136 aClass136_7 = new Class136();

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
	public static int anInt2064 = 0;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
	public static final int[] anIntArray151 = new int[8];

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public static int anInt2068 = 0;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "J")
	public static long aLong53 = -1L;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!jr;IBI)Lclient!pj;")
	public static Class1_Sub2_Sub13 method1984(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 << 8 | arg0.anInt4520;
		@Pc(19) Class1_Sub2_Sub13 local19 = (Class1_Sub2_Sub13) Static100.aClass105_1.method2605((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static153.aClass69_32.method1890(Static153.aClass69_32.method1906(local10));
		if (local31 == null) {
			local10 = arg0.anInt4520 | arg2 + 65536 << 8;
			local19 = (Class1_Sub2_Sub13) Static100.aClass105_1.method2605((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static153.aClass69_32.method1890(Static153.aClass69_32.method1906(local10));
			if (local31 == null) {
				local10 = arg0.anInt4520 | 0xFFFF00;
				local19 = (Class1_Sub2_Sub13) Static100.aClass105_1.method2605((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static153.aClass69_32.method1890(Static153.aClass69_32.method1906(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static325.method5584(local31);
					local19.aClass155_20 = arg0;
					Static100.aClass105_1.method2600(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static325.method5584(local31);
				local19.aClass155_20 = arg0;
				Static100.aClass105_1.method2600(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static325.method5584(local31);
			local19.aClass155_20 = arg0;
			Static100.aClass105_1.method2600(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public static void method1985() {
		Static237.aClass143_2.method3942();
		Static541.aClass264_5.method6829();
		Static10.aClass179_1.method4893();
		Static398.aClass18_4.method599();
		Static358.aClass95_1.method2360();
		Static181.aClass316_1.method8106();
		Static35.aClass152_1.method4044();
		Static530.aClass195_2.method5435();
		Static363.aClass118_1.method2940();
		Static292.aClass255_1.method6636();
		Static398.aClass167_1.method4604();
		Static152.aClass160_1.method4295();
		Static193.aClass32_2.method1125();
		Static337.aClass48_1.method1524();
		Static440.aClass266_1.method6925();
		Static402.aClass2_1.method182();
		Static435.aClass280_1.method7064();
		Static478.aClass309_1.method7919();
		Static440.aClass273_1.method6998();
		Static99.aClass141_1.method3833();
		Static393.method6250();
		Static113.method2234();
		Static367.method5956();
		if (Static190.aClass139_1 != Static334.aClass139_4) {
			for (@Pc(78) int local78 = 0; local78 < Static495.aByteArrayArray26.length; local78++) {
				Static495.aByteArrayArray26[local78] = null;
			}
			Static291.anInt5559 = 0;
		}
		Static394.method6257();
		Static137.method2599();
		Static325.method5583();
		Static199.method1509();
		Static62.method1531();
		Static173.aClass277_29.method7019();
		Static455.aClass4_11.method7173();
		Static100.aClass105_1.method2604();
		Static538.method8166();
		Static79.aClass69_22.method1879();
		Static29.aClass69_10.method1879();
		Static205.aClass69_73.method1879();
		Static351.aClass69_69.method1879();
		Static339.aClass69_66.method1879();
		Static10.aClass69_4.method1879();
		Static521.aClass69_96.method1879();
		Static408.aClass69_78.method1879();
		Static46.aClass69_14.method1879();
		Static260.aClass69_53.method1879();
		Static194.aClass69_38.method1879();
		Static98.aClass69_25.method1879();
		Static153.aClass69_32.method1879();
		Static61.aClass69_18.method1879();
		Static479.aClass69_93.method1879();
		Static234.aClass69_46.method1879();
		Static237.aClass69_47.method1879();
		Static334.aClass69_65.method1879();
		Static11.aClass69_5.method1879();
		Static272.aClass69_54.method1879();
		Static525.aClass69_97.method1879();
		Static80.aClass69_23.method1879();
		Static298.aClass69_59.method1879();
		Static11.aClass69_6.method1879();
		Static112.aClass69_26.method1879();
		Static70.aClass69_19.method1879();
		Static409.aClass69_79.method1879();
		Static216.aClass69_42.method1879();
		Static159.aClass69_35.method1879();
		Static354.aClass69_71.method1879();
		Static307.aClass69_61.method1879();
		Static405.aClass69_77.method1879();
		Static163.aClass277_25.method7019();
		Static340.aClass277_48.method7019();
		Static402.aClass277_54.method7019();
		Static292.aClass277_41.method7019();
	}
}
