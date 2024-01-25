import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "Lclient!lt;")
	public static Class158 aClass158_62;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
	public static int anInt4598;

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
	public static int anInt4600;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "Z")
	public static boolean aBoolean330 = false;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	public static int anInt4597 = 0;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "J")
	public static long aLong144 = 0L;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	public static int anInt4599 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IJ)V")
	public static void method4096(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(6) InterruptedException local6) {
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	public static void method4098() {
		@Pc(14) int local14 = (int) ((double) Static84.anInt1632 * 34.46D);
		local14 <<= 0x0;
		if (Static44.aClass28_14.method3557()) {
			local14 += 128;
		}
		Static44.aClass28_14.method3479(50, local14);
	}
}
