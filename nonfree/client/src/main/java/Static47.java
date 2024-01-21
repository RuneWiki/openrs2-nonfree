import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!id", name = "vb", descriptor = "I")
	public static int anInt1476;

	@OriginalMember(owner = "client!id", name = "jb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_795 = Static106.method1849("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!id", name = "rb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_797 = Static106.method1849("Your account is already logged in)3");

	@OriginalMember(owner = "client!id", name = "kb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_796 = aClass66_797;

	@OriginalMember(owner = "client!id", name = "xb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_798 = Static106.method1849("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!id", name = "zb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_799 = aClass66_795;

	@OriginalMember(owner = "client!id", name = "Eb", descriptor = "[I")
	public static int[] anIntArray225 = new int[50];

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3 method1039() {
		@Pc(12) Class1_Sub1_Sub2_Sub3 local12 = new Class1_Sub1_Sub2_Sub3();
		local12.aByteArray9 = Static29.aByteArrayArray2[0];
		local12.anInt1432 = Static125.anIntArray493[0];
		local12.anInt1430 = Static98.anInt2486;
		local12.anIntArray213 = Static16.anIntArray81;
		local12.anInt1431 = Static48.anInt1502;
		local12.anInt1429 = Static14.anIntArray80[0];
		local12.anInt1433 = Static99.anIntArray181[0];
		local12.anInt1434 = Static28.anIntArray105[0];
		Static22.method509();
		return local12;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
	public static void method1043() {
		aClass66_795 = null;
		aClass66_798 = null;
		aClass66_797 = null;
		aClass66_796 = null;
		aClass66_799 = null;
		anIntArray225 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
	public static void method1045() {
		Static87.aBoolean96 = true;
		Static10.aBoolean14 = true;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static51.method1090(arg0)) {
			Static25.aClass1_Sub10Array1 = null;
			Static134.method2053(arg2, arg5, arg3, -1, arg7, arg6, Static100.aClass1_Sub10ArrayArray1[arg0], arg4, arg1);
			if (Static25.aClass1_Sub10Array1 != null) {
				Static134.method2053(arg2, Static34.anInt102, arg3, -1412584499, arg7, arg6, Static25.aClass1_Sub10Array1, arg4, Static95.anInt2444);
				Static25.aClass1_Sub10Array1 = null;
			}
		} else if (arg6 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static128.aBooleanArray18[local14] = true;
			}
		} else {
			Static128.aBooleanArray18[arg6] = true;
		}
	}
}
