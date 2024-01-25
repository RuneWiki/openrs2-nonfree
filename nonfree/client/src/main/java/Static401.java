import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
	public static void method6521() {
		Static205.aClass69_73.anInt2003 = 1;
		Static231.method4170();
		Static87.aBoolean160 = true;
		Static148.aBoolean252 = true;
		Static189.method3652();
		for (@Pc(7026) int local7026 = 0; local7026 < Static261.aClass248Array1.length; local7026++) {
			Static261.aClass248Array1[local7026] = null;
		}
		Static181.aBoolean310 = false;
		Static155.method2852();
		Static109.anInt2299 = (int) (Math.random() * 110.0D) - 55;
		Static220.anInt4325 = (int) (Math.random() * 30.0D) - 20;
		Static135.aFloat193 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static513.anInt9088 = (int) (Math.random() * 100.0D) - 50;
		Static379.anInt7382 = (int) (Math.random() * 80.0D) - 40;
		Static445.anInt7798 = (int) (Math.random() * 120.0D) - 60;
		Static222.method4034();
		for (@Pc(7096) int local7096 = 0; local7096 < 2048; local7096++) {
			Static511.aClass20_Sub1_Sub1_Sub1Array1[local7096] = null;
		}
		Static342.anInt6322 = 0;
		Static141.anInt2822 = 0;
		Static362.aClass230_46.method6141();
		Static8.aClass295_3.method7541();
		Static330.aClass295_36.method7541();
		Static16.aClass184_50.method5136();
		Static4.aClass230_2.method6141();
		Static30.aClass295_6 = new Class295();
		Static417.aClass10_1.method531();
		Static320.method5475();
		Static28.anInt771 = 0;
		Static154.anInt3014 = 0;
		Static44.anInt9296 = 0;
		Static113.anInt2324 = 0;
		Static481.anInt6918 = 0;
		Static387.anInt6848 = 0;
		Static526.anInt9307 = 0;
		Static460.anInt7959 = 0;
		Static230.anInt4474 = 0;
		Static241.anInt4647 = 0;
		for (@Pc(7162) int local7162 = 0; local7162 < Static540.anIntArray837.length; local7162++) {
			if (!Static137.aBooleanArray4[local7162]) {
				Static540.anIntArray837[local7162] = -1;
			}
		}
		if (Static328.anInt6167 != -1) {
			Static62.method1530(Static328.anInt6167);
		}
		for (@Pc(7193) Class1_Sub35 local7193 = (Class1_Sub35) Static362.aClass230_45.method6137(); local7193 != null; local7193 = (Class1_Sub35) Static362.aClass230_45.method6140()) {
			if (!local7193.method8241()) {
				local7193 = (Class1_Sub35) Static362.aClass230_45.method6137();
				if (local7193 == null) {
					break;
				}
			}
			Static537.method8142(local7193, false, true);
		}
		Static328.anInt6167 = -1;
		Static362.aClass230_45 = new Class230(8);
		Static51.method1405();
		Static447.aClass91_14 = null;
		for (@Pc(7237) int local7237 = 0; local7237 < 8; local7237++) {
			Static74.aStringArray8[local7237] = null;
			Static142.aBooleanArray5[local7237] = false;
			Static200.anIntArray315[local7237] = -1;
		}
		Static199.method1510();
		Static400.aBoolean506 = true;
		for (@Pc(7261) int local7261 = 0; local7261 < 100; local7261++) {
			Static258.aBooleanArray17[local7261] = true;
		}
		for (@Pc(7275) int local7275 = 0; local7275 < 6; local7275++) {
			Static538.aClass42Array1[local7275] = new Class42();
		}
		for (@Pc(7291) int local7291 = 0; local7291 < 25; local7291++) {
			Static347.anIntArray621[local7291] = 0;
			Static75.anIntArray121[local7291] = 0;
			Static451.anIntArray730[local7291] = 0;
		}
		Static22.method601();
		Static506.aBoolean670 = true;
		Static193.aShortArray71 = Static147.aShortArray64 = Static92.aShortArray63 = Static424.aShortArray114 = new short[256];
		Static252.aString108 = Static322.aClass45_94.method1474(Static544.anInt7853);
		Static286.aClass1_Sub15_Sub1_1.aBoolean542 = false;
		Static418.anInt6721 = 0;
		Static286.aClass1_Sub15_Sub1_1.aBoolean539 = false;
		Static409.method6500();
		Static504.method7719();
		Static205.aClass69_73.anInt2003 = 2;
		Static434.aLong207 = 0L;
		Static125.aClass1_Sub16_1 = null;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)I")
	public static int method6523() {
		if (Static238.aBoolean354) {
			return 6;
		} else if (Static250.aClass1_Sub25_2 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static250.aClass1_Sub25_2.anInt4365;
			if (Static421.method6580(local14)) {
				return 1;
			} else if (Static337.method5699(local14)) {
				return 2;
			} else if (Static456.method6996(local14)) {
				return 3;
			} else if (Static459.method7010(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
