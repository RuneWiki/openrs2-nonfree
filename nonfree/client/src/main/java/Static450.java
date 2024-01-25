import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_152 = new Class136(33, -1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
	public static void method6694(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static504.method7360(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public static int method6695(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)I")
	public static int method6696(@OriginalArg(0) int arg0) {
		@Pc(20) int local20 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local26 >> 12) + 40960;
		return local20 * local34 >> 12;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIB)V")
	public static void method6697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = Static386.anInt6769;
		if (local9 == 0) {
			return;
		}
		if (local9 == 1) {
			Static606.anInt9939 = arg2;
			Static386.anInt6769 = 2;
			Static98.anInt4153 = arg1;
			Static294.anInt4740 = arg0;
			Static590.anInt9656 = arg3;
		} else if (local9 == 2) {
			if (arg0 < Static294.anInt4740) {
				Static294.anInt4740 = arg0;
			}
			if (arg3 < Static590.anInt9656) {
				Static590.anInt9656 = arg3;
			}
			if (arg1 > Static98.anInt4153) {
				Static98.anInt4153 = arg1;
			}
			if (arg2 > Static606.anInt9939) {
				Static606.anInt9939 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IB)V")
	public static void method6698(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub4_Sub13 local10 = Static506.method2916(arg0, 4);
		local10.method4132();
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)I")
	public static int method6699() {
		return Static182.aClass90_1.method1824();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIIII)V")
	public static void method6700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg2) {
			Static604.method8428(arg3, arg1, arg2, arg0);
		} else if (Static514.anInt8603 <= arg1 - arg2 && arg1 + arg2 <= Static487.anInt8320 && arg0 - arg4 >= Static304.anInt4824 && arg4 + arg0 <= Static231.anInt3977) {
			Static13.method360(arg4, arg0, arg3, arg1, arg2);
		} else {
			Static612.method8497(arg3, arg0, arg1, arg2, arg4);
		}
	}
}
