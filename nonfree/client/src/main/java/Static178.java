import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "J")
	public static long aLong122;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1324 = Static151.method2243("Your account is already logged in)3");

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1321 = aClass62_1324;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1325 = Static151.method2243("Unexpected server response)3");

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1322 = aClass62_1325;

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1323 = Static151.method2243("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
	public static int anInt3749 = 0;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)Lclient!ch;")
	public static Class20 method2578() {
		try {
			return (Class20) Class.forName("Class20_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!mf;JZ)V")
	public static void method2579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class10 local6 = new Class10();
		local6.aClass7_1 = arg4;
		local6.anInt331 = arg1 * 128 + 64;
		local6.anInt335 = arg2 * 128 + 64;
		local6.anInt332 = arg3;
		local6.aLong23 = arg5;
		if (Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub18(arg0, arg1, arg2);
		}
		Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass10_1 = local6;
	}
}
