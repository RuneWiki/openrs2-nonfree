import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
	public static int anInt497 = 0;

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
	public static int anInt501 = 0;

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_155 = Static120.method1824("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
	public static volatile int anInt502 = 0;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_156 = Static120.method1824("Ok");

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_157 = Static120.method1824("Registrierter Benutzer");

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_158 = Static120.method1824("null");

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lclient!rd;")
	public static Class80 aClass80_159 = aClass80_156;

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray2 = new byte[50][];

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "[I")
	public static final int[] anIntArray69 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
	public static volatile int anInt507 = -1;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IB)Lclient!nb;")
	public static Class3_Sub1_Sub13 method341(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub13 local6 = (Class3_Sub1_Sub13) Static145.aClass5_43.method139((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(33) byte[] local33 = Static137.aClass1_23.method60(Static58.method867(arg0), Static2.method81(arg0));
		local6 = new Class3_Sub1_Sub13();
		if (local33 != null) {
			local6.method1807(new Class3_Sub17(local33));
		}
		Static145.aClass5_43.method145(local6, (long) arg0);
		return local6;
	}
}
