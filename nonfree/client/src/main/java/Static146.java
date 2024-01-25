import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "Lclient!at;")
	public static final Class20 aClass20_10 = new Class20();

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "[I")
	public static final int[] anIntArray136 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "[I")
	public static final int[] anIntArray138 = new int[2];

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BI)I")
	public static int method2737(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(35) int local35 = local22 | local22 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return local41 + 1;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILclient!oi;)V")
	public static void method2738(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub1_Sub2 arg1) {
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		if (arg1.anInt6893 > Static565.anInt8921) {
			Static657.method9025(arg1);
		} else if (Static565.anInt8921 <= arg1.anInt6835) {
			Static63.method1074(arg1);
		} else {
			Static30.method505(false, arg1);
			local12 = Static479.anInt7782;
			local14 = Static268.anInt4796;
		}
		@Pc(129) int local129;
		if (arg1.anInt9805 < 512 || arg1.anInt9803 < 512 || (Static271.anInt4910 - 1) * 512 <= arg1.anInt9805 || arg1.anInt9803 >= Static613.anInt9909 * 512 - 512) {
			arg1.anInt6872 = -1;
			arg1.anInt6835 = 0;
			local12 = -1;
			local14 = 0;
			arg1.anInt6893 = 0;
			arg1.anIntArray403 = null;
			arg1.anInt9805 = arg1.anIntArray405[0] * 512 + arg1.method5932() * 256;
			arg1.anInt9803 = arg1.anIntArray404[0] * 512 + arg1.method5932() * 256;
			arg1.method5935();
			for (local129 = 0; local129 < arg1.aClass337Array3.length; local129++) {
				arg1.aClass337Array3[local129].anInt8754 = -1;
			}
		}
		if (arg1 == Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 && (arg1.anInt9805 < 6144 || arg1.anInt9803 < 6144 || (Static271.anInt4910 - 12) * 512 <= arg1.anInt9805 || (Static613.anInt9909 - 12) * 512 <= arg1.anInt9803)) {
			local12 = -1;
			local14 = 0;
			arg1.anInt6893 = 0;
			arg1.anInt6835 = 0;
			arg1.anInt6872 = -1;
			arg1.anIntArray403 = null;
			arg1.anInt9805 = arg1.anIntArray405[0] * 512 + arg1.method5932() * 256;
			arg1.anInt9803 = arg1.anIntArray404[0] * 512 + arg1.method5932() * 256;
			arg1.method5935();
			for (local129 = 0; local129 < arg1.aClass337Array3.length; local129++) {
				arg1.aClass337Array3[local129].anInt8754 = -1;
			}
		}
		local129 = Static398.method5825(arg1);
		Static56.method976(arg1);
		Static19.method289(local12, local129, arg1, local14);
		Static536.method7362(local12, arg1);
		Static191.method8804(arg1);
	}
}
