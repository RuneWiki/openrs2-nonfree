import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!o", name = "L", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "Z")
	public static boolean aBoolean564;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_141 = new Class136(115, 2);

	@OriginalMember(owner = "client!o", name = "I", descriptor = "[I")
	public static final int[] anIntArray532 = new int[500];

	@OriginalMember(owner = "client!o", name = "M", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_55 = new Class181(27, 8);

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(Z)Lclient!k;")
	public static Class179 method5991() {
		try {
			return (Class179) Class.forName("Class179_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class179_Sub1();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method5992() {
		if (!Static378.aBoolean549) {
			Static554.aFloat192 += (-12.0F - Static554.aFloat192) / 2.0F;
			Static378.aBoolean549 = true;
			Static349.aBoolean501 = true;
		}
	}
}
