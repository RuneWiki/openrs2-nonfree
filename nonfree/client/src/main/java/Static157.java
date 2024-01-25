import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!jo", name = "V", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_119 = new Class221(43, 15);

	@OriginalMember(owner = "client!jo", name = "Z", descriptor = "J")
	public static volatile long aLong115 = 0L;

	@OriginalMember(owner = "client!jo", name = "ab", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_111 = new Class157(69, 3);

	@OriginalMember(owner = "client!jo", name = "cb", descriptor = "[B")
	public static final byte[] aByteArray31 = new byte[2048];

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!go;Lclient!fh;IIIIILclient!lp;Lclient!or;Ljava/lang/String;I)V")
	public static void method3242(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class71 arg7, @OriginalArg(9) Class124 arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static135.anInt2910 == 4) {
			local13 = (int) Static366.aFloat48 & 0x3FFF;
		} else {
			local13 = (int) Static366.aFloat48 + Static85.anInt1601 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg2.anInt1874 / 2, arg2.anInt1845 / 2) + 10;
		@Pc(44) int local44 = arg6 * arg6 + arg3 * arg3;
		if (local35 * local35 < local44) {
			return;
		}
		@Pc(58) int local58 = Class101.anIntArray234[local13];
		@Pc(62) int local62 = Class101.anIntArray235[local13];
		if (Static135.anInt2910 != 4) {
			local62 = local62 * 256 / (Static267.anInt5561 + 256);
			local58 = local58 * 256 / (Static267.anInt5561 + 256);
		}
		@Pc(92) int local92 = arg3 * local58 + arg6 * local62 >> 15;
		@Pc(108) int local108 = local62 * arg3 - arg6 * local58 >> 15;
		@Pc(115) int local115 = arg1.method2237(arg9, null, 100);
		@Pc(123) int local123 = arg1.method2234(null, arg9);
		@Pc(129) int local129 = local92 - local115 / 2;
		if (-arg2.anInt1874 <= local129 && local129 <= arg2.anInt1874 && local108 >= -arg2.anInt1845 && local108 <= arg2.anInt1845) {
			arg7.method5246(50, 0, arg10, arg4, arg5, null, arg2.anInt1874 / 2 + arg4 + local129, null, arg2.anInt1845 / 2 + arg5 - local123 - local108 - arg0, local115, arg8, arg9, 0, 0, 1);
		}
	}
}
