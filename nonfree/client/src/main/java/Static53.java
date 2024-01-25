import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
	public static int anInt1102;

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "Lclient!ja;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "Lclient!dt;")
	public static Class62 aClass62_2 = null;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!jn;ZIZ)V")
	public static void method985(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt3029;
		@Pc(12) int local12 = (int) arg0.aLong240;
		arg0.method5700();
		if (arg2) {
			Static293.method4553(local8);
		}
		Static89.method5436(local8);
		@Pc(27) Class62 local27 = Static115.method1862(local12);
		if (local27 != null) {
			Static158.method2441(local27);
		}
		Static308.method4743();
		if (!arg1 && Static68.anInt1346 != -1) {
			Static244.method3984(Static68.anInt1346, 1);
		}
		@Pc(53) Class19 local53 = new Class19(Static29.aClass44_26);
		for (@Pc(58) Class3_Sub22 local58 = (Class3_Sub22) local53.method222(); local58 != null; local58 = (Class3_Sub22) local53.method220()) {
			if (!local58.method5702()) {
				local58 = (Class3_Sub22) local53.method222();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt3027 == 3) {
				@Pc(80) int local80 = (int) local58.aLong240;
				if (local80 >>> 16 == local8) {
					method985(local58, arg1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public static void method987() {
		Static229.method3783(Static261.aClass244_62);
		Static23.aClass3_Sub5_Sub1_1.method2749(Static204.anInt4957);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
	public static void method988() {
		if (Static12.aClass145_2 != null) {
			Static12.aClass145_2.method3136();
			Static12.aClass145_2 = null;
		}
		Static73.method1286();
		Static306.method4730();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static160.aClass67Array3[local17].method1324();
		}
		Static348.method4050(false);
		System.gc();
		Static130.method2060();
		Static4.anInt110 = -1;
		Static298.aBoolean402 = false;
		Static319.method4847(true);
		Static99.aBoolean149 = false;
		Static21.anInt265 = 0;
		Static1.anInt10 = 0;
		Static336.anInt2336 = 0;
		Static103.anInt2044 = 0;
		for (@Pc(54) int local54 = 0; local54 < Static323.aClass229Array1.length; local54++) {
			Static323.aClass229Array1[local54] = null;
		}
		Static234.method3886();
		for (@Pc(69) int local69 = 0; local69 < 2048; local69++) {
			Static308.aClass28_Sub1_Sub1_Sub2Array1[local69] = null;
		}
		Static23.anInt305 = 0;
		for (@Pc(89) int local89 = 0; local89 < 32768; local89++) {
			Static166.aClass28_Sub1_Sub1_Sub1Array41[local89] = null;
		}
		Static384.aClass44_39.method952();
		Static266.method4234();
		Static204.anInt4957 = 0;
		Static331.aClass115_1.method2405();
		Static137.method1433();
		Static346.method5247();
		Static275.method4304(true);
		try {
			Static398.method1714(Static61.aClass156_1.anApplet1, "loggedout");
		} catch (@Pc(126) Throwable local126) {
		}
		Static369.aLong219 = 0L;
		Static127.aClass3_Sub2_2 = null;
	}
}
