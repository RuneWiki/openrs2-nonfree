import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "Ljava/lang/Object;")
	public static Object anObject21;

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "I")
	public static int anInt8057;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
	public static int anInt8053 = 0;

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
	public static int anInt8056 = 0;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method6468(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIII)I")
	public static int method6469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(12) int local12 = 128 - arg2;
		@Pc(26) int local26 = arg2 * (arg1 & 0x7F) + (arg0 & 0x7F) * local12 >> 7;
		@Pc(41) int local41 = (arg0 & 0x380) * local12 + (arg1 & 0x380) * arg2 >> 7;
		@Pc(61) int local61 = (arg0 & 0xFC00) * local12 + arg2 * (arg1 & 0xFC00) >> 7;
		return local26 & 0x7F | local41 & 0x380 | local61 & 0xFC00;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)Lclient!mk;")
	public static Class1_Sub8_Sub9 method6470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(24) Class1_Sub8_Sub9 local24 = (Class1_Sub8_Sub9) Static28.aClass91_2.method2271((long) arg0 | (long) arg1 << 32);
		if (local24 == null) {
			local24 = new Class1_Sub8_Sub9(arg1, arg0);
			Static28.aClass91_2.method2269(local24.aLong268, local24);
		}
		return local24;
	}
}
