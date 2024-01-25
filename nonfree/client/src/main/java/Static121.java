import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
	public static int anInt2623;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!tq;")
	public static final Class305 aClass305_16 = new Class305(8);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIB)Z")
	public static boolean method2386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static293.method4804(arg1, arg0) | (arg1 & 0x800) != 0 || Static401.method6295(arg0, arg1);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method2388() {
		return Static218.aBoolean366 || Static567.aClass6_Sub42_4 == null ? "" : Static567.aClass6_Sub42_4.aString101;
	}
}
