import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!po", name = "l", descriptor = "I")
	public static int anInt8024;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "[Lclient!ta;")
	public static final Class6_Sub10[] aClass6_Sub10Array6 = new Class6_Sub10[8];

	@OriginalMember(owner = "client!po", name = "o", descriptor = "[B")
	public static byte[] aByteArray78 = null;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(BI)I")
	public static int method7064(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(27) int local27 = local13 | local13 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return arg0 & ~local45;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)I")
	public static int method7066(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(45) int local45 = (arg0 & 0x7F) * 96 >> 7;
			if (local45 < 2) {
				local45 = 2;
			} else if (local45 > 126) {
				local45 = 126;
			}
			return (arg0 & 0xFF80) + local45;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)V")
	public static void method7067(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub33 local16 = (Class6_Sub33) Static252.aClass74_67.method1401((long) arg0);
		if (local16 != null) {
			local16.aBoolean426 = !local16.aBoolean426;
			local16.aClass115_Sub1_1.method3241(local16.aBoolean426);
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Z")
	public static boolean method7068() {
		return Static37.anInt498 >= 1;
	}
}
