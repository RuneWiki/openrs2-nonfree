import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
	public static int anInt5300;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_181 = new Class221("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "[I")
	public static final int[] anIntArray650 = new int[2048];

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "[I")
	public static final int[] anIntArray651 = new int[50];

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V")
	public static void method4675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static318.anInt4651; local8++) {
			@Pc(14) Rectangle local14 = Class2.aRectangleArray120[local8];
			if (arg1 < local14.width + local14.x && local14.x < arg1 + arg3 && arg2 < local14.height + local14.y && local14.y < arg2 + arg0) {
				Static370.aBooleanArray143[local8] = true;
			}
		}
	}
}
