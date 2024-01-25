import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!ac;")
	public static Class3 aClass3_2;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
	public static int anInt803;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public static int anInt801 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method714(@OriginalArg(0) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static9.anInt194 > 0) {
			local26 = Static166.aByteArrayArray22[--Static9.anInt194];
			Static166.aByteArrayArray22[Static9.anInt194] = null;
			return local26;
		} else if (arg0 == 5000 && Static367.anInt6219 > 0) {
			local26 = Static158.aByteArrayArray21[--Static367.anInt6219];
			Static158.aByteArrayArray21[Static367.anInt6219] = null;
			return local26;
		} else if (arg0 == 30000 && Static376.anInt6293 > 0) {
			local26 = Static257.aByteArrayArray48[--Static376.anInt6293];
			Static257.aByteArrayArray48[Static376.anInt6293] = null;
			return local26;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZII[B)[B")
	public static byte[] method715(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static459.method2110(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method716() {
		Static383.aClass113_117.anInt2734 = 1;
		Static389.aClient4.method787();
		Static323.aBoolean426 = true;
		Static5.aBoolean13 = true;
		Static342.method4344();
		Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
		Static418.aClass214_243 = null;
		Static300.anInt5023 = 0;
		Static379.aClass214_229 = null;
		Static79.anInt1462 = 0;
		Static175.aClass214_107 = null;
		Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
		Static439.aClass214_250 = null;
		Static65.anInt1145 = 0;
		for (@Pc(5583) int local5583 = 0; local5583 < Static162.aClass209Array1.length; local5583++) {
			Static162.aClass209Array1[local5583] = null;
		}
		for (@Pc(5601) int local5601 = 0; local5601 < 100; local5601++) {
			Static321.aStringArray38[local5601] = null;
		}
		Static101.anInt6647 = 0;
		Static360.aBoolean498 = false;
		Static22.method413();
		Static95.aFloat27 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static106.anInt1854 = (int) (Math.random() * 110.0D) - 55;
		Static305.anInt5082 = (int) (Math.random() * 30.0D) - 20;
		Static104.anInt7242 = (int) (Math.random() * 80.0D) - 40;
		Static399.anInt6510 = (int) (Math.random() * 100.0D) - 50;
		Static171.anInt2824 = (int) (Math.random() * 120.0D) - 60;
		Static142.method1877();
		for (@Pc(5666) int local5666 = 0; local5666 < 2048; local5666++) {
			Static73.aClass20_Sub3_Sub3_Sub1Array1[local5666] = null;
		}
		Static411.anInt6695 = 0;
		for (@Pc(5680) int local5680 = 0; local5680 < 32768; local5680++) {
			Static98.aClass20_Sub3_Sub3_Sub2Array1[local5680] = null;
		}
		Static264.aClass254_25.method5438();
		Static245.aClass254_23.method5438();
		Static78.aClass227_4.method4835();
		Static194.aClass257_13.method5499();
		Static204.aClass254_22 = new Class254();
		Static89.anInt1571 = 0;
		Static145.anInt2445 = 0;
		Static364.aClass259_1.method5521();
		Static271.method3441();
		Static253.anInt4091 = 0;
		anInt803 = 0;
		Static315.anInt5218 = 0;
		Static65.anInt1146 = 0;
		Static427.anInt7043 = 0;
		Static388.anInt903 = 0;
		Static71.anInt1332 = 0;
		Static149.anInt7379 = 0;
		Static365.anInt6176 = 0;
		Static235.anInt3807 = 0;
		for (@Pc(5741) int local5741 = 0; local5741 < Static156.anIntArray134.length; local5741++) {
			if (!Static389.aBooleanArray12[local5741]) {
				Static156.anIntArray134[local5741] = -1;
			}
		}
		if (Static169.anInt2522 != -1) {
			Static199.method2715(Static169.anInt2522);
		}
		for (@Pc(5772) Class1_Sub26 local5772 = (Class1_Sub26) Static304.aClass257_21.method5506(); local5772 != null; local5772 = (Class1_Sub26) Static304.aClass257_21.method5501()) {
			if (!local5772.method5618()) {
				local5772 = (Class1_Sub26) Static304.aClass257_21.method5506();
				if (local5772 == null) {
					break;
				}
			}
			Static454.method5610(false, true, local5772);
		}
		Static169.anInt2522 = -1;
		Static304.aClass257_21 = new Class257(8);
		Static347.method4405();
		Static394.aClass250_13 = null;
		for (@Pc(5814) int local5814 = 0; local5814 < 8; local5814++) {
			Static348.aStringArray45[local5814] = null;
			Static245.aBooleanArray18[local5814] = false;
			Static448.anIntArray444[local5814] = -1;
		}
		Static121.method1659();
		Static391.aBoolean527 = true;
		for (@Pc(5840) int local5840 = 0; local5840 < 100; local5840++) {
			Static145.aBooleanArray15[local5840] = true;
		}
		Static73.anInt1389 = 0;
		Static401.aClass76Array2 = null;
		Static234.aString38 = null;
		for (@Pc(5858) int local5858 = 0; local5858 < 6; local5858++) {
			Static290.aClass237Array1[local5858] = new Class237();
		}
		for (@Pc(5874) int local5874 = 0; local5874 < 25; local5874++) {
			Static311.anIntArray310[local5874] = 0;
			Static366.anIntArray376[local5874] = 0;
			Static202.anIntArray179[local5874] = 0;
		}
		Static421.method5243();
		Static64.aShortArray18 = Static447.aShortArray124 = Static395.aShortArray117 = Static395.aShortArray116 = new short[256];
		Static390.aBoolean526 = true;
		Static249.aString40 = Static205.aClass151_109.method3122(Static188.anInt3028);
		Static41.anInt752 = 0;
		Static336.aClass106_Sub1_1.aBoolean477 = false;
		Static336.aClass106_Sub1_1.aBoolean476 = false;
		Static431.method5425();
		Static326.method4184();
		Static52.aClass1_Sub10_1 = null;
		Static383.aClass113_117.anInt2734 = 2;
		Static15.aLong18 = 0L;
	}
}
