import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString68;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	public static int anInt6260;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	public static int anInt6261;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "Z")
	public static boolean aBoolean448 = false;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "Lclient!ln;")
	public static final Class216 aClass216_10 = new Class216(11, 0, 1, 2);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z")
	public static boolean method5551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
