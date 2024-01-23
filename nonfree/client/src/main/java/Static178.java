import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
	public static int anInt3828 = 0;

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1300 = Static200.method3116("<)4col>");

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1301 = Static200.method3116("Untersuchen");

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method2847() {
		Static91.anInt2134 = 0;
		Static27.anInt644 = 0;
		Static56.anInt1484 = 0;
		Static172.anInt3718 = -1;
		Static7.anInt182 = -1;
		Static96.aClass1_Sub9_Sub1_3.anInt1192 = 0;
		Static16.aClass1_Sub9_Sub1_1.anInt1192 = 0;
		anInt3828 = 0;
		Static9.anInt4431 = 0;
		Static42.anInt909 = 0;
		Static52.anInt1420 = -1;
		Static162.aBoolean261 = false;
		Static161.anInt3566 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static41.aClass9_Sub4_Sub1Array2.length; local35++) {
			if (Static41.aClass9_Sub4_Sub1Array2[local35] != null) {
				Static41.aClass9_Sub4_Sub1Array2[local35].anInt3953 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static1.aClass9_Sub4_Sub2Array1.length; local53++) {
			if (Static1.aClass9_Sub4_Sub2Array1[local53] != null) {
				Static1.aClass9_Sub4_Sub2Array1[local53].anInt3953 = -1;
			}
		}
		Static89.method1533();
		Static85.method1486(30);
		for (@Pc(76) int local76 = 0; local76 < 100; local76++) {
			Static153.aBooleanArray19[local76] = true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BZLclient!ah;)V")
	public static void method2848(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(15) int local15 = arg1.anInt201 == 0 ? arg1.anInt251 : arg1.anInt201;
		@Pc(33) int local33 = arg1.anInt266 == 0 ? arg1.anInt221 : arg1.anInt266;
		Static106.method1822(arg1.anInt229, arg0, Static82.aClass6ArrayArray1[arg1.anInt229 >> 16], local15, local33);
		if (arg1.aClass6Array1 != null) {
			Static106.method1822(arg1.anInt229, arg0, arg1.aClass6Array1, local15, local33);
		}
		@Pc(68) Class1_Sub11 local68 = (Class1_Sub11) Static10.aClass33_1.method1071((long) arg1.anInt229);
		if (local68 != null) {
			Static5.method82(arg0, local15, local68.anInt1626, local33);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ai;I)V")
	public static void method2854(@OriginalArg(0) Class7 arg0) {
		Static90.aClass7_16 = arg0;
		Static51.anInt1250 = Static90.aClass7_16.method3246(4);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ah;B)V")
	public static void method2855(@OriginalArg(0) Class6 arg0) {
		@Pc(15) Class6 local15 = Static131.method2198(arg0);
		@Pc(19) int local19;
		@Pc(21) int local21;
		if (local15 == null) {
			local19 = Static88.anInt2058;
			local21 = Static112.anInt2563;
		} else {
			local19 = local15.anInt251;
			local21 = local15.anInt221;
		}
		Static42.method692(arg0, local21, local19);
	}
}
