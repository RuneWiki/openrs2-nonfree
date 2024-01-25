import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!f", name = "V", descriptor = "[I")
	public static int[] anIntArray89;

	@OriginalMember(owner = "client!f", name = "P", descriptor = "[I")
	public static final int[] anIntArray88 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!f", name = "R", descriptor = "I")
	public static int anInt1879 = 0;

	@OriginalMember(owner = "client!f", name = "S", descriptor = "[S")
	public static final short[] aShortArray16 = new short[] { 17, 15, 18, 19, 3, 8, 48, 50 };

	@OriginalMember(owner = "client!f", name = "U", descriptor = "[Lclient!ok;")
	public static final Class181[] aClass181Array1 = new Class181[6];

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public static void method1527() {
		Static281.aClass5_Sub15_Sub2_13.anInt7013 = 0;
		Static299.anInt4665 = 0;
		Static227.anInt3788 = 0;
		Static285.aClass129_114 = null;
		Static128.anInt2223 = 0;
		Static445.aClass129_65 = null;
		Static304.aClass129_129 = null;
		Static76.aClass5_Sub15_Sub2_1.anInt7013 = 0;
		Static279.aClass129_109 = null;
		Static48.method784();
		Static179.method2456();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static359.aClass2_Sub1_Sub3_Sub2Array1[local31] = null;
		}
		Static220.aClass2_Sub1_Sub3_Sub2_1 = null;
		for (@Pc(47) int local47 = 0; local47 < anInt1879; local47++) {
			@Pc(54) Class2_Sub1_Sub3_Sub1 local54 = Static277.aClass5_Sub7Array1[local47].aClass2_Sub1_Sub3_Sub1_1;
			if (local54 != null) {
				local54.anInt6176 = -1;
			}
		}
		Static271.method3663();
		Static449.anInt7379 = 1;
		Static407.method5394(9);
		for (@Pc(72) int local72 = 0; local72 < 100; local72++) {
			Static99.aBooleanArray5[local72] = true;
		}
		Static458.method6018();
		Static379.aLong134 = 0;
		Static332.aClass5_Sub10_2 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
	public static int method1529(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)I")
	public static int method1530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	public static void method1531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		if (arg3 <= arg0) {
			for (local14 = arg3; local14 < arg0; local14++) {
				Static133.anIntArrayArray15[local14][arg2] = arg1;
			}
		} else {
			for (local14 = arg0; local14 < arg3; local14++) {
				Static133.anIntArrayArray15[local14][arg2] = arg1;
			}
		}
	}
}
