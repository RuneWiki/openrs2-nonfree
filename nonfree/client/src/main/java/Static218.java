import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	public static int anInt3871;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_102 = new Class211(97, 7);

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Lclient!fa;")
	public static final Class77 aClass77_28 = new Class77(16);

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray53 = new String[100];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)I")
	public static int method3197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 1) + (((arg2 >> 2 & 0x3F) << 10) + (arg0 >> 5 << 7));
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3198(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static248.anInt4157; local11++) {
			if (arg0.equalsIgnoreCase(Static175.aStringArray45[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!sk;)V")
	public static void method3199(@OriginalArg(1) Class25_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt2347 == Static366.anInt5883 || arg0.anInt2333 == -1 || arg0.anInt2323 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class185 local29 = Static25.aClass67_1.method1227(arg0.anInt2333);
			if (local29.aBoolean465 || arg0.anInt2354 + 1 > local29.anIntArray582[arg0.anInt2322]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(61) int local61 = arg0.anInt2347 - arg0.anInt2336;
			@Pc(67) int local67 = Static366.anInt5883 - arg0.anInt2336;
			@Pc(78) int local78 = arg0.anInt2346 * 128 + arg0.method1877() * 64;
			@Pc(89) int local89 = arg0.anInt2329 * 128 + arg0.method1877() * 64;
			@Pc(101) int local101 = arg0.anInt2366 * 128 + arg0.method1877() * 64;
			@Pc(113) int local113 = arg0.anInt2349 * 128 + arg0.method1877() * 64;
			arg0.anInt6077 = (local67 * local113 + local89 * (local61 - local67)) / local61;
			arg0.anInt6080 = (local67 * local101 + (local61 - local67) * local78) / local61;
		}
		arg0.anInt2380 = 0;
		if (arg0.anInt2334 == 0) {
			arg0.method1891(8192);
		}
		if (arg0.anInt2334 == 1) {
			arg0.method1891(12288);
		}
		if (arg0.anInt2334 == 2) {
			arg0.method1891(0);
		}
		if (arg0.anInt2334 == 3) {
			arg0.method1891(4096);
		}
	}
}
