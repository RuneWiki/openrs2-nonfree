import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public static int anInt7583 = -1;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_101 = new Class84("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
	public static final int[] anIntArray662 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z")
	public static boolean method5875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
