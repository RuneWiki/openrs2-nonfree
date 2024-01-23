import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!pg", name = "fb", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_22;

	@OriginalMember(owner = "client!pg", name = "W", descriptor = "[I")
	public static int[] anIntArray440 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!pg", name = "cb", descriptor = "J")
	public static long aLong115 = 0L;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)Z")
	public static boolean method2590(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static171.aShortArray50[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 1001;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V")
	public static void method2591(@OriginalArg(1) boolean arg0) {
		if (Static205.aClass55_4 == null) {
			return;
		}
		try {
			@Pc(16) Class1_Sub9 local16 = new Class1_Sub9(4);
			local16.method899(arg0 ? 2 : 3);
			local16.method929(0);
			Static205.aClass55_4.method1756(local16.aByteArray20, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static205.aClass55_4.method1754();
			} catch (@Pc(42) Exception local42) {
			}
			Static205.aClass55_4 = null;
			Static4.anInt104++;
		}
	}
}
