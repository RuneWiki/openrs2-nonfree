import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "Lclient!aga;")
	public static Class13 aClass13_15;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_164 = new Class319(61, 8);

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Lclient!sj;")
	public static final Class296 aClass296_6 = new Class296();

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "J")
	public static long aLong406 = -1L;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
	public static void method7638() {
		@Pc(10) int local10 = Static479.aClass1_Sub7_Sub1_1.method2638(Static375.anInt6609);
		if (local10 == 0) {
			Static221.aByteArrayArrayArray5 = null;
			Static141.method2305(0);
		} else if (local10 == 1) {
			Static469.method6618((byte) 0);
			Static141.method2305(512);
			if (Static511.aByteArrayArrayArray19 != null) {
				Static585.method7825();
			}
		} else {
			Static469.method6618((byte) (Static473.anInt8020 - 4 & 0xFF));
			Static141.method2305(2);
		}
		Static58.anInt1499 = Static240.anInt4595;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIB)I")
	public static int method7639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local9 << 13 ^ local9;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * 15731 * local20 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}
}
