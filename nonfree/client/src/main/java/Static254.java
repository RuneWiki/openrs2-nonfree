import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)V")
	public static void method4043(@OriginalArg(1) boolean arg0) {
		if (Static528.aClass36_2 != null) {
			Static528.aClass36_2.method1992();
			Static528.aClass36_2 = null;
		}
		Static575.anInt10384 = 0;
		Static276.method4458();
		Static31.method987();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static526.aClass232Array1[local19].method5276();
		}
		Static312.method4930(false);
		System.gc();
		Static283.method4490();
		Static421.aBoolean581 = false;
		Static269.anInt5657 = -1;
		Static159.method2601();
		Static496.method7171(true);
		Static173.anInt3656 = 0;
		Static343.anInt6623 = 0;
		Static308.anInt6201 = 0;
		Static157.anInt3323 = 0;
		Static242.anInt10133 = 0;
		Static560.anInt10211 = 0;
		for (@Pc(66) int local66 = 0; local66 < Static553.aClass292Array1.length; local66++) {
			Static553.aClass292Array1[local66] = null;
		}
		Static264.method4154();
		for (@Pc(87) int local87 = 0; local87 < 2048; local87++) {
			Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local87] = null;
		}
		Static137.anInt3042 = 0;
		Static144.aClass221_6.method5078();
		Static222.anInt4653 = 0;
		Static17.aClass221_1.method5078();
		Static398.method6101();
		Static11.anInt816 = 0;
		Static523.aClass173_1.method4070();
		Static287.method4582();
		Static491.method7120();
		Static221.aLong20 = 0L;
		Static59.aClass4_Sub46_1 = null;
		if (arg0) {
			Static231.method3759(12);
			return;
		}
		Static231.method3759(3);
		try {
			Static597.method1279(Static589.anApplet2, "loggedout");
		} catch (@Pc(138) Throwable local138) {
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IBI)Z")
	public static boolean method4044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)Z")
	public static boolean method4045(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}
}
