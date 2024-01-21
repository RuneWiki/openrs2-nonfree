import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
	public static int anInt4098;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1917 = method3089("skill)2");

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1916 = aClass92_1917;

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1919 = method3089("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1918 = aClass92_1919;

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
	public static int anInt4097 = -1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
	public static int method3088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!vd;")
	public static Class92 method3089(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(11) int local11 = 0;
		@Pc(15) Class92 local15 = new Class92();
		local15.aByteArray52 = new byte[local9];
		while (local11 < local9) {
			@Pc(27) int local27 = local6[local11++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local9 <= local11) {
					break;
				}
				@Pc(47) int local47 = local6[local11++] & 0xFF;
				local15.aByteArray52[local15.anInt4244++] = (byte) (local27 * 43 + local47 - 1720 - 48);
			} else if (local27 != 0) {
				local15.aByteArray52[local15.anInt4244++] = (byte) local27;
			}
		}
		local15.method3219();
		return local15.method3202();
	}
}
