import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "I")
	public static int anInt3872;

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_61 = new Class96("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_82 = new Class254(68, 2);

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
	public static int anInt3873 = 500;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)I")
	public static int method3244(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(JB)V")
	public static void method3250(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}
}
