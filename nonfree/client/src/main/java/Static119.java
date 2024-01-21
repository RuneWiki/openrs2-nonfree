import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!pb;")
	public static Class41 aClass41_78;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!jd;")
	public static Class37 aClass37_39;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public static int anInt2846;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
	public static int anInt2848;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
	public static int anInt2851;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public static int anInt2852;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1834 = Static69.method1153("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	public static int anInt2847 = 0;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1835 = Static69.method1153("redstone2");

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1836 = Static69.method1153("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1837 = Static69.method1153("Benutzername: ");

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
	public static int[] anIntArray452 = new int[50];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2088(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static51.aClass24_1);
		arg0.addMouseMotionListener(Static51.aClass24_1);
		arg0.addFocusListener(Static51.aClass24_1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public static void method2089() {
		aClass41_78 = null;
		anIntArray452 = null;
		aClass64_1837 = null;
		aClass37_39 = null;
		aClass64_1835 = null;
		aCRC32_2 = null;
		aClass64_1834 = null;
		aClass64_1836 = null;
	}
}
