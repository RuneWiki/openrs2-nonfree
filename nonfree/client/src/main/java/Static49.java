import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "J")
	public static long aLong33;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "[I")
	public static int[] anIntArray133;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "Lclient!cc;")
	public static Class2_Sub2_Sub4 aClass2_Sub2_Sub4_3;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_416 = Static184.method2923("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!ea;")
	public static Class2_Sub3 aClass2_Sub3_2 = new Class2_Sub3(new byte[5000]);

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Lclient!i;")
	private static Class41 aClass41_419 = Static184.method2923("wishes to trade with you)3");

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_417 = aClass41_419;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "[B")
	public static byte[] aByteArray10 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_418 = Static184.method2923("Konfig geladen)3");

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public static int anInt1395 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I")
	public static int method966(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * 6 - 61440;
		@Pc(18) int local18 = (local9 * arg0 >> 12) + 40960;
		@Pc(28) int local28 = (arg0 * arg0 >> 12) * arg0 >> 12;
		return local18 * local28 >> 12;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB[BI)Lclient!i;")
	public static Class41 method967(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class41 local9 = new Class41();
		local9.anInt2012 = 0;
		local9.aByteArray26 = new byte[arg2];
		for (@Pc(18) int local18 = arg0; local18 < arg0 + arg2; local18++) {
			if (arg1[local18] != 0) {
				local9.aByteArray26[local9.anInt2012++] = arg1[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Lclient!pc;")
	public static Class78 method969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass78_1 == null ? null : local7.aClass78_1;
	}
}
