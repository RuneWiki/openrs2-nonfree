import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!lg;")
	public static Class149 aClass149_1;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!hv;")
	public static final Class107 aClass107_3 = new Class107();

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public static int anInt552 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
	public static byte[] method444(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg1;
			return arg0 ? Static286.method3549(local21) : local21;
		} else if (arg1 instanceof Class19) {
			@Pc(35) Class19 local35 = (Class19) arg1;
			return local35.method456();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BIB)I")
	public static int method445(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class49_Sub2.anIntArray470[(arg1[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)[Lclient!ne;")
	public static Class170[] method447() {
		return new Class170[] { Static289.aClass170_8, Static381.aClass170_7, Static23.aClass170_1, Static163.aClass170_6, Static346.aClass170_9, Static153.aClass170_11 };
	}
}
