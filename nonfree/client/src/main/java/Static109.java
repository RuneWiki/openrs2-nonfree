import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ld", name = "Hc", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_13;

	@OriginalMember(owner = "client!ld", name = "Kc", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!ld", name = "vc", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ld", name = "Cc", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_849 = Static161.method2452("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ld", name = "Ec", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_850 = Static161.method2452("<)4col>");

	@OriginalMember(owner = "client!ld", name = "Ic", descriptor = "I")
	public static int anInt2292 = 0;

	@OriginalMember(owner = "client!ld", name = "Lc", descriptor = "I")
	public static int anInt2294 = 0;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)Lclient!sd;")
	public static Class5_Sub2_Sub19 method1750() {
		if (Static91.aClass5_Sub2_Sub19_1 == null) {
			Static91.aClass5_Sub2_Sub19_1 = new Class5_Sub2_Sub19();
		}
		return Static91.aClass5_Sub2_Sub19_1;
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)Lclient!nb;")
	public static Class25 method1751() {
		try {
			return (Class25) Class.forName("Class25_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!ci;Lclient!dj;)V")
	public static void method1754(@OriginalArg(1) int arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) Class23_Sub1 arg2) {
		@Pc(12) Class5_Sub14 local12 = new Class5_Sub14();
		local12.aLong253 = arg0;
		local12.anInt1584 = 1;
		local12.aClass23_Sub1_11 = arg2;
		local12.aClass17_3 = arg1;
		@Pc(27) Class91 local27 = Static140.aClass91_11;
		synchronized (Static140.aClass91_11) {
			Static140.aClass91_11.method2686(local12);
		}
		Static203.method3016();
	}
}
