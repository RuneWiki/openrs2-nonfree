import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	public static int anInt509;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!kb;")
	public static Class46 aClass46_144 = Static65.method1172("::");

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt512 = 0;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_145 = Static65.method1172("mapfunction");

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt514 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method399() {
		aClass46_145 = null;
		aClass46_144 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	public static int method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static102.method1678(arg1 + 45365, arg0 + 91923, 4) + (Static102.method1678(arg1 + 10294, arg0 + 37821, 2) - 128 >> 1) + (Static102.method1678(arg1, arg0, 1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	public static int method401(@OriginalArg(0) int arg0) {
		@Pc(3) Class3_Sub2_Sub11 local3 = Static31.method573(arg0);
		@Pc(10) int local10 = local3.anInt2806;
		@Pc(13) int local13 = local3.anInt2808;
		@Pc(21) int local21 = local3.anInt2812;
		@Pc(28) int local28 = Class49.anIntArray217[local21 - local13];
		return local28 & Static41.anIntArray419[local10] >> local13;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	public static int method402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (arg2 >> 2 << 10) + (arg1 >> 5 << 7);
	}
}
