import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
	public static int anInt1978;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
	public static final int[] anIntArray100 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "S")
	public static short aShort34 = 320;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Z")
	public static boolean method1634() {
		@Pc(14) Class1_Sub3 local14 = (Class1_Sub3) Static251.aClass142_26.aClass1_143.aClass1_261;
		if (local14 == null || local14 == Static251.aClass142_26.aClass1_143) {
			return false;
		} else {
			if (local14.anInt227 >= 2000) {
				local14.anInt227 -= 2000;
			}
			return local14.anInt227 == 1002;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!hb;")
	public static RuntimeException_Sub1 method1635(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString41 = local12.aString41 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZI)V")
	public static void method1636(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub13 local13 = Static379.method5347(arg1, arg0);
		if (local13 != null) {
			local13.method5965();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public static void method1638() {
		Static225.aClass109_57.anInt2631 = 1;
		Static451.aClient1.method728();
		Static135.aBoolean196 = true;
		Static381.aBoolean28 = true;
		Static405.method5509();
		Static201.aClass1_Sub14_Sub2_2.anInt5695 = 0;
		Static114.anInt2193 = 0;
		Static108.anInt2094 = 0;
		Static84.aClass12_300 = null;
		Static225.anInt3905 = 0;
		Static369.aClass12_329 = null;
		Static133.aClass12_129 = null;
		Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
		Static397.aClass12_345 = null;
		for (@Pc(5583) int local5583 = 0; local5583 < Static416.aClass262Array1.length; local5583++) {
			Static416.aClass262Array1[local5583] = null;
		}
		for (@Pc(5605) int local5605 = 0; local5605 < 100; local5605++) {
			Static434.aStringArray44[local5605] = null;
		}
		Static3.anInt60 = 0;
		Static217.aBoolean311 = false;
		Static110.method1733();
		Static242.anInt4632 = (int) (Math.random() * 100.0D) - 50;
		Static402.anInt7349 = (int) (Math.random() * 80.0D) - 40;
		Static388.anInt7297 = (int) (Math.random() * 120.0D) - 60;
		Static25.anInt430 = (int) (Math.random() * 30.0D) - 20;
		Static147.aFloat59 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static378.anInt6795 = (int) (Math.random() * 110.0D) - 55;
		Static46.method1759();
		for (@Pc(5672) int local5672 = 0; local5672 < 2048; local5672++) {
			Static362.aClass47_Sub1_Sub5_Sub2Array1[local5672] = null;
		}
		Static47.anInt760 = 0;
		for (@Pc(5686) int local5686 = 0; local5686 < 32768; local5686++) {
			Static307.aClass47_Sub1_Sub5_Sub1Array1[local5686] = null;
		}
		Static152.aClass142_19.method3206();
		Static111.aClass142_14.method3206();
		Static311.aClass242_8.method5505();
		Static346.aClass51_22.method921();
		Static280.aClass142_29 = new Class142();
		Static365.anInt6644 = 0;
		Static342.anInt6234 = 0;
		Static237.aClass80_1.method1619();
		Static61.method922();
		Static229.anInt3930 = 0;
		Static207.anInt3759 = 0;
		Static321.anInt5590 = 0;
		Static398.anInt7110 = 0;
		Static84.anInt6174 = 0;
		Static382.anInt5701 = 0;
		Static68.anInt1239 = 0;
		Static224.anInt3893 = 0;
		Static322.anInt4035 = 0;
		Static383.anInt3787 = 0;
		for (@Pc(5743) int local5743 = 0; local5743 < Static103.anIntArray102.length; local5743++) {
			if (!Static342.aBooleanArray23[local5743]) {
				Static103.anIntArray102[local5743] = -1;
			}
		}
		if (Static246.anInt4292 != -1) {
			Static184.method2956(Static246.anInt4292);
		}
		for (@Pc(5773) Class1_Sub38 local5773 = (Class1_Sub38) Static81.aClass51_5.method928(); local5773 != null; local5773 = (Class1_Sub38) Static81.aClass51_5.method926()) {
			if (!local5773.method5966()) {
				local5773 = (Class1_Sub38) Static81.aClass51_5.method928();
				if (local5773 == null) {
					break;
				}
			}
			Static284.method3909(true, false, local5773);
		}
		Static246.anInt4292 = -1;
		Static81.aClass51_5 = new Class51(8);
		Static373.method5287();
		Static405.aClass229_12 = null;
		for (@Pc(5813) int local5813 = 0; local5813 < 8; local5813++) {
			Static51.aStringArray8[local5813] = null;
			Static308.aBooleanArray26[local5813] = false;
			Static129.anIntArray175[local5813] = -1;
		}
		Static224.method3276();
		Static374.aBoolean546 = true;
		for (@Pc(5837) int local5837 = 0; local5837 < 100; local5837++) {
			Static204.aBooleanArray15[local5837] = true;
		}
		Static175.anInt5411 = 0;
		Static345.aClass152Array1 = null;
		Static96.aString37 = null;
		for (@Pc(5857) int local5857 = 0; local5857 < 6; local5857++) {
			Static383.aClass120Array3[local5857] = new Class120();
		}
		for (@Pc(5871) int local5871 = 0; local5871 < 25; local5871++) {
			Static357.anIntArray477[local5871] = 0;
			Static82.anIntArray73[local5871] = 0;
			Static153.anIntArray363[local5871] = 0;
		}
		Static92.method1453();
		Static242.aShortArray75 = Static404.aShortArray114 = Static207.aShortArray56 = Static106.aShortArray13 = new short[256];
		Static5.aBoolean541 = true;
		Static399.aString85 = Static3.aClass96_1.method1935(Static389.anInt7061);
		Static100.anInt1967 = 0;
		Static327.aClass230_Sub1_1.aBoolean624 = false;
		Static327.aClass230_Sub1_1.aBoolean623 = false;
		Static195.method3036();
		Static294.method4014();
		Static225.aClass109_57.anInt2631 = 2;
		Static396.aLong208 = 0L;
		Static205.aClass1_Sub4_4 = null;
	}
}
