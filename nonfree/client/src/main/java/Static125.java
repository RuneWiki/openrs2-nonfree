import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Lclient!sf;")
	public static Class212 aClass212_1;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "Lclient!kl;")
	public static Class134 aClass134_3;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
	public static int anInt2380 = -1;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
	public static int anInt2385 = 0;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
	public static int anInt2386 = 0;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Lclient!lr;")
	public static Class3_Sub7_Sub8 method2010() {
		@Pc(13) Class3_Sub7_Sub8 local13 = (Class3_Sub7_Sub8) Static146.aClass162_7.method3734();
		if (local13 != null) {
			local13.method5700();
			local13.method5673();
			return local13;
		}
		do {
			local13 = (Class3_Sub7_Sub8) Static347.aClass162_10.method3734();
			if (local13 == null) {
				return null;
			}
			if (local13.method3221() > Static288.method4512()) {
				return null;
			}
			local13.method5700();
			local13.method5673();
		} while ((local13.aLong231 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	public static void method2014() {
		Static106.method1736();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII)I")
	public static int method2017(@OriginalArg(2) int arg0) {
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
}
