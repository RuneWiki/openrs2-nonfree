import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	public static int anInt5173 = 0;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_271 = new Class159("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
	public static final int[] anIntArray425 = new int[200];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Z")
	public static boolean method4470() {
		try {
			return Static15.method865();
		} catch (@Pc(14) IOException local14) {
			Static291.method4882();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static229.anInt4619 + "," + Static205.anInt4305 + "," + Static209.anInt4334 + " - " + Static133.anInt3104 + "," + (Static286.anInt6699 + Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0]) + "," + (Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0] + Static136.anInt3193) + " - ";
			for (@Pc(62) int local62 = 0; local62 < Static133.anInt3104 && local62 < 50; local62++) {
				local60 = local60 + Static127.aClass4_Sub11_Sub1_3.aByteArray55[local62] + ",";
			}
			Static289.method4874(local60, local19);
			Static232.method4122();
			return true;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)I")
	public static int method4471(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	public static void method4472() {
		if (Static201.aClass35_1 != null) {
			Static201.aClass35_1.method2568();
		}
		if (Static261.aClass35_2 != null) {
			Static261.aClass35_2.method2568();
		}
		Static258.method4493(Static106.aBoolean193);
		Static201.aClass35_1 = Static324.method5272(22050, Static1.aClass134_7, 0, Static300.aCanvas5);
		Static201.aClass35_1.method2549(Static133.aClass4_Sub1_Sub4_2);
		Static261.aClass35_2 = Static324.method5272(2048, Static1.aClass134_7, 1, Static300.aCanvas5);
		Static261.aClass35_2.method2549(Static196.aClass4_Sub1_Sub3_3);
	}
}
