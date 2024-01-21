import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
	public static int anInt1680;

	@OriginalMember(owner = "client!hf", name = "H", descriptor = "Lclient!ed;")
	public static Class23 aClass23_620 = Static169.method2903("_");

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "Lclient!td;")
	public static Class79 aClass79_9 = new Class79(128);

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "[I")
	public static int[] anIntArray231 = new int[100];

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "Lclient!ed;")
	private static Class23 aClass23_622 = Static169.method2903("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "Lclient!ed;")
	public static Class23 aClass23_621 = aClass23_622;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!ob;)Lclient!ob;")
	public static Class60 method1132(@OriginalArg(1) Class60 arg0) {
		@Pc(7) int local7 = Static88.method1545(Static170.method475(arg0));
		if (local7 == 0) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			arg0 = Static111.method1964(arg0.anInt2971);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[BII)I")
	public static int method1133(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg0; local14++) {
			local7 = Class88.anIntArray580[(arg1[local14] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method1134() {
		aClass23_620 = null;
		aClass23_621 = null;
		aClass23_622 = null;
		anIntArray231 = null;
		aClass79_9 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([BIB)I")
	public static int method1136(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return method1133(arg1, arg0, 0);
	}
}
