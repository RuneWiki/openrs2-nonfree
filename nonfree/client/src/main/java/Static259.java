import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Z")
	public static boolean aBoolean354;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "[I")
	public static final int[] anIntArray384 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "[S")
	public static short[] aShortArray55 = new short[256];

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
	public static int anInt5052 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!wv;B)V")
	public static void method4374(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static312.anInt5688 < arg1.anInt7105) {
			Static28.method884(arg1);
		} else if (arg1.anInt7084 >= Static312.anInt5688) {
			Static501.method6776(arg1);
		} else {
			Static146.method2822(arg1, false);
			local9 = Static72.anInt1522;
			local7 = Static135.anInt3010;
		}
		if (arg1.anInt9542 < 512 || arg1.anInt9540 < 512 || arg1.anInt9542 >= (Static473.anInt8075 - 1) * 512 || Static165.anInt6749 * 512 - 512 <= arg1.anInt9540) {
			arg1.anInt7084 = 0;
			arg1.anInt7069 = -1;
			local9 = 0;
			arg1.anInt7105 = 0;
			arg1.anInt7124 = -1;
			arg1.anInt7085 = -1;
			local7 = -1;
			arg1.anIntArray519 = null;
			arg1.anInt9542 = arg1.anIntArray521[0] * 512 + arg1.method5892() * 256;
			arg1.anInt9540 = arg1.anIntArray522[0] * 512 + arg1.method5892() * 256;
			arg1.method5895();
		}
		if (arg1 == Static328.aClass4_Sub1_Sub1_Sub2_2 && (arg1.anInt9542 < 6144 || arg1.anInt9540 < 6144 || Static473.anInt8075 * 512 - 6144 <= arg1.anInt9542 || (Static165.anInt6749 - 12) * 512 <= arg1.anInt9540)) {
			arg1.anInt7084 = 0;
			arg1.anIntArray519 = null;
			arg1.anInt7124 = -1;
			local9 = 0;
			arg1.anInt7069 = -1;
			arg1.anInt7085 = -1;
			local7 = -1;
			arg1.anInt7105 = 0;
			arg1.anInt9542 = arg1.anIntArray521[0] * 512 + arg1.method5892() * 256;
			arg1.anInt9540 = arg1.anIntArray522[0] * 512 + arg1.method5892() * 256;
			arg1.method5895();
		}
		@Pc(218) int local218 = Static284.method4644(arg1);
		Static578.method7717(local218, local9, local7, arg1);
		Static592.method7817(arg1, local7);
		Static27.method853(arg1);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
	public static boolean method4375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static288.method4675(arg1, arg0) | (arg1 & 0x70000) != 0 || Static524.method7193(arg1, arg0);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)Z")
	public static boolean method4376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static38.method1002(arg0, arg1) | (arg0 & 0x40000) != 0 || Static516.method7139(arg0, arg1);
	}
}
