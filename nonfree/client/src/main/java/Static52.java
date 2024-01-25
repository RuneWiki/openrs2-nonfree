import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
	public static int anInt944 = 0;

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "[[B")
	public static final byte[][] aByteArrayArray4 = new byte[50][];

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V")
	public static void method983() {
		if (Static48.method914(Static345.anInt5823) || Static213.method3197(Static345.anInt5823)) {
			Static255.method3569(Static152.anInt7561 >> 10, Static266.anInt4433 >> 10, 5000);
		} else {
			@Pc(31) int local31 = Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray510[0] >> 3;
			@Pc(38) int local38 = Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray509[0] >> 3;
			if (local31 >= 0 && Static373.anInt6324 >> 3 > local31 && local38 >= 0 && Static291.anInt5062 >> 3 > local38) {
				Static255.method3569(local38, local31, 5000);
			} else {
				Static255.method3569(Static291.anInt5062 >> 4, Static373.anInt6324 >> 4, 0);
			}
		}
		Static259.method3611();
		Static296.method4218();
		Static457.method6234();
		Static331.method6001();
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
	public static void method984() {
		Static243.aClass3_Sub25_Sub1_7.anInt4974 = 0;
		Static46.aClass136_17 = null;
		Static245.anInt4185 = 0;
		Static176.aClass3_Sub25_Sub1_1.anInt4974 = 0;
		Static167.aClass136_81 = null;
		Static452.aClass136_201 = null;
		Static269.anInt3398 = 0;
		Static237.aClass136_117 = null;
		Static102.anInt1839 = 0;
		Static81.method1462();
		Static53.method1000();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static216.aClass1_Sub2_Sub6_Sub2Array1[local31] = null;
		}
		Static203.aClass1_Sub2_Sub6_Sub2_1 = null;
		for (@Pc(47) int local47 = 0; local47 < Static76.anInt1390; local47++) {
			@Pc(54) Class1_Sub2_Sub6_Sub1 local54 = Static407.aClass3_Sub40Array1[local47].aClass1_Sub2_Sub6_Sub1_2;
			if (local54 != null) {
				local54.anInt7580 = -1;
			}
		}
		Static346.method4834();
		Static27.anInt490 = 1;
		Static393.method5432(9);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static391.aBooleanArray22[local81] = true;
		}
		Static162.method2549();
		Static39.aClass3_Sub23_1 = null;
		Static76.aLong53 = 0L;
	}
}
