import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "Z")
	public static boolean aBoolean564;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Lclient!fg;")
	public static Class102 aClass102_8;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_10 = new Class101(6, 0, 4, 2);

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_11 = new Class101(1, 2, 2, 0);

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "[I")
	public static int[] anIntArray539 = new int[2];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B[B)V")
	public static void method5589(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class1_Sub35 local16 = new Class1_Sub35(arg0);
		while (true) {
			while (true) {
				@Pc(20) int local20 = local16.method5750();
				if (local20 == 0) {
					return;
				}
				if (local20 == 1) {
					@Pc(34) int[] local34 = Static570.anIntArray713 = new int[6];
					local34[0] = local16.method5771();
					local34[1] = local16.method5771();
					local34[2] = local16.method5771();
					local34[3] = local16.method5771();
					local34[4] = local16.method5771();
					local34[5] = local16.method5771();
				} else {
					@Pc(81) int local81;
					@Pc(86) int local86;
					if (local20 == 4) {
						local81 = local16.method5750();
						Static139.anIntArray225 = new int[local81];
						for (local86 = 0; local86 < local81; local86++) {
							Static139.anIntArray225[local86] = local16.method5771();
							if (Static139.anIntArray225[local86] == 65535) {
								Static139.anIntArray225[local86] = -1;
							}
						}
					} else if (local20 == 5) {
						local81 = local16.method5750();
						Static359.anIntArray434 = new int[local81];
						for (local86 = 0; local86 < local81; local86++) {
							Static359.anIntArray434[local86] = local16.method5771();
							if (Static359.anIntArray434[local86] == 65535) {
								Static359.anIntArray434[local86] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
	public static void method5592() {
		Static151.aClass181_3.method3759();
		Static474.aClass322_7.method7126();
		Static22.aClass71_1.method1492();
		Static518.aClass96_4.method1930();
		Static322.aClass326_2.method7240();
		Static175.aClass114_4.method2210();
		Static192.aClass211_1.method4276();
		Static107.aClass200_3.method3954();
		Static499.aClass241_5.method4894();
		Static409.aClass246_1.method5045();
		Static384.aClass305_1.method6488();
		Static383.aClass273_3.method5842();
		Static521.aClass257_4.method5588();
		Static459.aClass38_2.method710();
		Static591.aClass274_1.method5886();
		Static485.aClass318_1.method6998();
		Static321.aClass279_1.method6101();
		Static252.aClass205_3.method4121();
		Static348.aClass141_2.method2988();
		Static430.aClass265_1.method5653();
		Static297.method4156();
		Static583.method7797();
		Static227.method3466();
		Static495.method1121();
		Static321.method4407();
		Static467.aClass222_52.method4433(5);
		Static257.aClass222_27.method4433(5);
		Static574.aClass222_62.method4433(5);
		Static224.aClass222_48.method4433(5);
		Static80.aClass222_8.method4433(5);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZB)V")
	public static void method5593(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static422.anInt7311 != -1) {
				Static546.method7464(Static422.anInt7311);
			}
			for (@Pc(23) Class1_Sub44 local23 = (Class1_Sub44) Static78.aClass187_8.method3799(); local23 != null; local23 = (Class1_Sub44) Static78.aClass187_8.method3805()) {
				if (!local23.method7856()) {
					local23 = (Class1_Sub44) Static78.aClass187_8.method3799();
					if (local23 == null) {
						break;
					}
				}
				Static157.method2283(false, true, local23);
			}
			Static422.anInt7311 = -1;
			Static78.aClass187_8 = new Class187(8);
			Static361.method4889();
			Static422.anInt7311 = Static493.anInt8492;
			Static482.method6526(false);
			Static164.method7470();
			Static80.method1459(Static422.anInt7311);
		}
		Static468.aBoolean615 = true;
	}
}
