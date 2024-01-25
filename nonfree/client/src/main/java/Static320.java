import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	public static int anInt5800;

	@OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
	public static int anInt5804 = 0;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
	public static void method4827() {
		Static29.aClass77_1.method1681();
		Static3.aClass14_1.method295();
		Static489.aClass344_1.method8019();
		Static619.aClass281_4.method6733();
		Static341.aClass76_1.method1673();
		Static570.aClass267_2.method6596();
		Static185.aClass303_1.method7203();
		Static414.aClass356_2.method8215();
		Static23.aClass296_1.method7027();
		Static18.aClass244_1.method6260();
		Static182.aClass140_1.method3448();
		Static509.aClass139_3.method3436();
		Static259.aClass248_2.method6351();
		Static290.aClass119_1.method3060();
		Static584.aClass206_2.method4915();
		Static571.aClass169_1.method4171();
		Static576.aClass343_1.method8013();
		Static375.aClass58_1.method1361();
		Static151.aClass273_1.method6656();
		Static232.aClass92_3.method2510();
		Static618.method8413();
		Static109.method1817();
		Static374.method5640();
		Static347.method5405();
		if (Static95.aClass86_5 != Static267.aClass86_7) {
			for (@Pc(82) int local82 = 0; local82 < Static226.aByteArrayArray11.length; local82++) {
				Static226.aByteArrayArray11[local82] = null;
			}
			Static568.anInt9372 = 0;
		}
		Static202.method3530();
		Static240.method3961();
		Static142.method2719();
		Static150.method2867();
		Static477.method6834();
		Static639.aClass233_63.method5663();
		Static600.aClass87_15.method7917();
		Static4.method59();
		Static280.method4457();
		Static164.aClass97_42.method2556();
		Static573.aClass97_139.method2556();
		Static104.aClass97_26.method2556();
		Static100.aClass97_25.method2556();
		Static560.aClass97_137.method2556();
		Static48.aClass97_6.method2556();
		Static536.aClass97_133.method2556();
		Static625.aClass97_153.method2556();
		Static594.aClass97_144.method2556();
		Static276.aClass97_69.method2556();
		Static345.aClass97_91.method2556();
		Static226.aClass97_60.method2556();
		Static224.aClass97_59.method2556();
		Static428.aClass97_107.method2556();
		Static333.aClass97_87.method2556();
		Static87.aClass97_17.method2556();
		Static95.aClass97_21.method2556();
		Static410.aClass97_101.method2556();
		Static377.aClass97_96.method2556();
		Static64.aClass97_12.method2556();
		Static328.aClass97_84.method2556();
		Static282.aClass97_70.method2556();
		Static544.aClass97_135.method2556();
		Static612.aClass97_149.method2556();
		Static253.aClass97_65.method2556();
		Static551.aClass97_136.method2556();
		Static442.aClass97_110.method2556();
		Static372.aClass97_95.method2556();
		Static150.aClass97_37.method2556();
		Static644.aClass97_154.method2556();
		Static193.aClass97_56.method2556();
		Static181.aClass97_52.method2556();
		Static312.aClass97_78.method2556();
		Static394.aClass233_32.method5663();
		Static589.aClass233_57.method5663();
		Static616.aClass233_61.method5663();
		Static111.aClass233_28.method5663();
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)Z")
	public static boolean method4828() {
		try {
			return Static267.method6455();
		} catch (@Pc(13) IOException local13) {
			Static98.method1680();
			return true;
		} catch (@Pc(18) Exception local18) {
			@Pc(76) String local76 = "T2 - " + (Static398.aClass274_115 == null ? -1 : Static398.aClass274_115.method6661()) + "," + (Static136.aClass274_35 == null ? -1 : Static136.aClass274_35.method6661()) + "," + (Static287.aClass274_86 == null ? -1 : Static287.aClass274_86.method6661()) + " - " + Static44.anInt971 + "," + (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0] + Static451.anInt7933) + "," + (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0] + Static470.anInt8063) + " - ";
			for (@Pc(78) int local78 = 0; local78 < Static44.anInt971 && local78 < 50; local78++) {
				local76 = local76 + Static313.aClass2_Sub34_Sub2_1.aByteArray77[local78] + ",";
			}
			Static420.method6396(local76, local18);
			Static75.method1450(false);
			return true;
		}
	}
}
