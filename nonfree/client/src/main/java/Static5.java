import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] aClass4_Sub1_Sub7_Sub2Array1;

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
	public static int anInt216;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
	public static int anInt210 = 2;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_90 = Static177.method3050("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
	public static volatile int anInt215 = 0;

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_91 = Static177.method3050("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)Lclient!gb;")
	public static Class31 method94() {
		try {
			return (Class31) Class.forName("Class31_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I")
	public static int method96(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
