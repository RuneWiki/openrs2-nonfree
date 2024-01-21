import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Z")
	public static boolean aBoolean161;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1123 = Static158.method3034("Loading )2 please wait)3");

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1119 = aClass60_1123;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1120 = Static158.method3034(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1121 = Static158.method3034("gleiten:");

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1122 = Static158.method3034("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public static int anInt4097 = -1;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public static int anInt4099 = 1;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1124 = Static158.method3034("Username: ");

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1125 = aClass60_1124;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[BI)Lclient!ob;")
	public static Class60 method3103(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class60 local7 = new Class60();
		local7.anInt3466 = 0;
		local7.aByteArray39 = new byte[arg2];
		for (@Pc(16) int local16 = arg0; local16 < arg0 + arg2; local16++) {
			if (arg1[local16] != 0) {
				local7.aByteArray39[local7.anInt3466++] = arg1[local16];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lclient!bh;")
	public static Class11 method3104() {
		try {
			return (Class11) Class.forName("Class11_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public static void method3105(@OriginalArg(1) int arg0) {
		if (Static185.anIntArray482 == null || Static185.anIntArray482.length < arg0) {
			Static185.anIntArray482 = new int[arg0];
		}
	}
}
