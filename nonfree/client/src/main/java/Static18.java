import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	public static int anInt252;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
	public static int anInt253;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "[S")
	public static short[] aShortArray11 = new short[256];

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "[I")
	public static final int[] anIntArray15 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public static void method227() {
		Static50.anInt606 = 0;
		Static541.anInt9249 = 0;
		Static524.anInt8592 = 0;
		Static405.anInt9127 = 0;
		Static404.anInt7039 = 0;
		Static253.anInt4790 = 0;
		for (@Pc(26) int local26 = 0; local26 < Static236.aClass232Array1.length; local26++) {
			Static236.aClass232Array1[local26] = null;
		}
		Static431.method6571();
		for (@Pc(47) int local47 = 0; local47 < 2048; local47++) {
			Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local47] = null;
		}
		Static201.anInt4069 = 0;
		Static419.aClass74_45.method1398();
		Static251.anInt4781 = 0;
		Static650.aClass74_72.method1398();
		Static552.method7810();
		Static620.anInt9784 = 0;
		Static303.aClass55_2.method944();
		Static531.aClass391_2 = null;
		Static579.aClass391_3 = null;
		Static442.aClass6_Sub46_2 = null;
		Static488.aClass6_Sub29_3 = null;
		Static182.aLong105 = 0L;
		Static99.aClass6_Sub29_1 = null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ha;Lclient!nga;B)I")
	public static int method228(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class249 arg1) {
		if (arg1.anInt6864 != -1) {
			return arg1.anInt6864;
		}
		if (arg1.anInt6871 != -1) {
			@Pc(24) Class297 local24 = arg0.anInterface11_10.method6027(arg1.anInt6871);
			if (!local24.aBoolean625) {
				return local24.aShort98;
			}
		}
		return arg1.anInt6869;
	}
}
