import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
	public static int anInt4395;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!efa;")
	public static final Class90 aClass90_12 = new Class90(8);

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public static void method3733() {
		Static248.aClass229_57.anInt5920 = 1;
		Static121.method1723();
		Static565.aBoolean769 = true;
		Static287.aBoolean374 = true;
		Static185.method2363();
		for (@Pc(7484) int local7484 = 0; local7484 < Static271.aClass80Array1.length; local7484++) {
			Static271.aClass80Array1[local7484] = null;
		}
		Static355.aBoolean473 = false;
		Static505.method6537();
		Static525.anInt8446 = (int) (Math.random() * 120.0D) - 60;
		Static83.anInt1438 = (int) (Math.random() * 80.0D) - 40;
		Static402.anInt6615 = (int) (Math.random() * 110.0D) - 55;
		Static313.aFloat157 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static434.anInt6973 = (int) (Math.random() * 30.0D) - 20;
		Static157.anInt2490 = (int) (Math.random() * 100.0D) - 50;
		Static553.method7240();
		for (@Pc(7554) int local7554 = 0; local7554 < 2048; local7554++) {
			Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local7554] = null;
		}
		Static51.anInt912 = 0;
		Static365.anInt6148 = 0;
		Static436.aClass90_26.method1678();
		Static131.aClass70_5.method1265();
		Static380.aClass70_51.method1265();
		Static71.aClass220_8.method4657();
		Static531.aClass90_39.method1678();
		Static246.aClass70_25 = new Class70();
		Static426.aClass160_1.method2784();
		Static111.method1642();
		Static334.anInt9531 = 0;
		Static18.anInt4107 = 0;
		Static452.anInt7231 = 0;
		Static181.anInt2686 = 0;
		Static212.anInt3068 = 0;
		Static274.anInt4738 = 0;
		Static259.anInt4284 = 0;
		Static582.anInt9451 = 0;
		Static388.anInt6396 = 0;
		Static353.anInt6039 = 0;
		for (@Pc(7618) int local7618 = 0; local7618 < Static297.anIntArray342.length; local7618++) {
			if (!Static143.aBooleanArray26[local7618]) {
				Static297.anIntArray342[local7618] = -1;
			}
		}
		if (Static122.anInt2094 != -1) {
			Static453.method5905(Static122.anInt2094);
		}
		for (@Pc(7644) Class2_Sub33 local7644 = (Class2_Sub33) Static346.aClass90_17.method1676(); local7644 != null; local7644 = (Class2_Sub33) Static346.aClass90_17.method1680()) {
			if (!local7644.method7656()) {
				local7644 = (Class2_Sub33) Static346.aClass90_17.method1676();
				if (local7644 == null) {
					break;
				}
			}
			Static393.method5411(false, local7644, true);
		}
		Static122.anInt2094 = -1;
		Static346.aClass90_17 = new Class90(8);
		Static397.method5455();
		Static396.aClass273_10 = null;
		for (@Pc(7684) int local7684 = 0; local7684 < 8; local7684++) {
			Static14.aStringArray4[local7684] = null;
			Static262.aBooleanArray18[local7684] = false;
			Static594.anIntArray618[local7684] = -1;
		}
		Static497.method6444();
		Static482.aBoolean657 = true;
		for (@Pc(7708) int local7708 = 0; local7708 < 100; local7708++) {
			Static255.aBooleanArray17[local7708] = true;
		}
		for (@Pc(7722) int local7722 = 0; local7722 < 6; local7722++) {
			Static280.aClass92Array1[local7722] = new Class92();
		}
		for (@Pc(7738) int local7738 = 0; local7738 < 25; local7738++) {
			Static452.anIntArray487[local7738] = 0;
			Static18.anIntArray300[local7738] = 0;
			Static102.anIntArray157[local7738] = 0;
		}
		Static113.method1669();
		Static122.aBoolean139 = true;
		Static307.aShortArray95 = Static560.aShortArray134 = Static579.aShortArray138 = Static459.aShortArray113 = new short[256];
		Static88.aString20 = Static229.aClass159_28.method2776(Static261.anInt4297);
		Static257.aClass2_Sub35_Sub1_1.aBoolean643 = false;
		Static257.aClass2_Sub35_Sub1_1.aBoolean642 = false;
		Static240.anInt9588 = 0;
		Static136.method1879();
		Static499.method6471();
		Static535.aClass2_Sub8_2 = null;
		Static248.aClass229_57.anInt5920 = 2;
		Static537.aLong247 = 0L;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!fn;I)Lclient!fn;")
	public static Class2_Sub3_Sub2 method3734(@OriginalArg(0) Class2_Sub3_Sub2 arg0) {
		@Pc(19) Class2_Sub3_Sub2 local19 = arg0 == null ? new Class2_Sub3_Sub2() : new Class2_Sub3_Sub2(arg0);
		local19.method2047();
		return local19;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[BI)I")
	public static int method3735(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(17) int local17 = arg2; local17 < arg0; local17++) {
			local7 = local7 >>> 8 ^ Class312.anIntArray518[(local7 ^ arg1[local17]) & 0xFF];
		}
		return ~local7;
	}
}
