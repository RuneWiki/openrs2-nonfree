import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "[[Lclient!qf;")
	public static Class245[][] aClass245ArrayArray2;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public static int anInt8281 = 0;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_110 = new Class158(5, 4);

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Z")
	public static boolean aBoolean586 = false;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "[B")
	public static final byte[] aByteArray96 = new byte[2048];

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Lclient!os;")
	public static final Class223 aClass223_6 = new Class223();

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method6872(@OriginalArg(0) String arg0) {
		@Pc(17) String local17 = Static179.method4141(Static402.method7158(arg0));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)Z")
	public static boolean method6873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
