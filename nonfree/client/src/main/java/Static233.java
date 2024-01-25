import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!os", name = "j", descriptor = "[Lclient!jo;")
	public static Class64_Sub1[] aClass64_Sub1Array2;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "Lclient!dp;")
	public static Class53 aClass53_106;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "[I")
	public static int[] anIntArray489;

	@OriginalMember(owner = "client!os", name = "C", descriptor = "[Lclient!sf;")
	public static Class183[] aClass183Array1;

	@OriginalMember(owner = "client!os", name = "I", descriptor = "I")
	public static int anInt4345;

	@OriginalMember(owner = "client!os", name = "T", descriptor = "I")
	public static int anInt4352;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "I")
	public static int anInt4334 = -1;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(I)I")
	public static int method4136() {
		return 2;
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V")
	public static void method4139() {
		Static131.aClass6_Sub10_Sub1_2.method2886(153);
		Static131.aClass6_Sub10_Sub1_2.method4025(Static31.anInt579);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLclient!mb;)V")
	public static void method4142(@OriginalArg(1) Class132 arg0) {
		@Pc(12) int local12 = arg0.anInt3539;
		if (local12 == 324) {
			if (Static220.anInt4060 == -1) {
				Static230.anInt4303 = arg0.anInt3519;
				Static220.anInt4060 = arg0.anInt3533;
			}
			if (Static204.aClass21_1.aBoolean39) {
				arg0.anInt3533 = Static220.anInt4060;
			} else {
				arg0.anInt3533 = Static230.anInt4303;
			}
		} else if (local12 == 325) {
			if (Static220.anInt4060 == -1) {
				Static220.anInt4060 = arg0.anInt3533;
				Static230.anInt4303 = arg0.anInt3519;
			}
			if (Static204.aClass21_1.aBoolean39) {
				arg0.anInt3533 = Static230.anInt4303;
			} else {
				arg0.anInt3533 = Static220.anInt4060;
			}
		} else if (local12 == 327) {
			arg0.anInt3512 = 150;
			arg0.anInt3570 = (int) (Math.sin((double) Static76.anInt2853 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt3553 = 5;
			arg0.anInt3558 = -1;
		} else if (local12 == 328) {
			if (Static253.aClass44_Sub4_Sub4_Sub1_1.aString207 == null) {
				arg0.anInt3560 = 0;
				arg0.anInt3558 = 0;
			} else {
				arg0.anInt3512 = 150;
				arg0.anInt3570 = (int) (Math.sin((double) Static76.anInt2853 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3553 = 5;
				arg0.anInt3558 = 2047;
				arg0.anInt3560 = Static122.method2429(Static253.aClass44_Sub4_Sub4_Sub1_1.aString207);
				arg0.anInt3487 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt5091;
				arg0.anInt3573 = 0;
				arg0.anInt3541 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt5116;
				arg0.anInt3534 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt5129;
			}
		}
	}
}
