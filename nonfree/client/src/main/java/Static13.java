import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
	public static int anInt346;

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "Lclient!de;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "[Lclient!wc;")
	public static Class3_Sub13_Sub1[] aClass3_Sub13_Sub1Array3;

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
	public static int anInt354 = 0;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2 = null;

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!fb;II)V")
	public static void method236(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (Static4.aClass36_2 == null) {
			return;
		}
		try {
			Static4.aClass36_2.method833(0L);
			Static4.aClass36_2.method834(24, arg1, arg0.aByteArray70);
		} catch (@Pc(16) Exception local16) {
		}
	}
}
