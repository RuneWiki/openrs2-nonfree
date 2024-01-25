import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Lclient!lh;")
	public static Class182 aClass182_1;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "Lclient!hb;")
	public static Class117 aClass117_1;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	public static int anInt858;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
	public static int anInt856 = 0;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_13 = new Class306("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Lclient!im;")
	public static final Class140 aClass140_17 = new Class140(0, 6);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIZI)V")
	public static void method897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static422.anInt7388; local8++) {
			@Pc(14) Rectangle local14 = Class79.aRectangleArray1[local8];
			if (local14.x + local14.width > arg1 && local14.x < arg2 + arg1 && arg3 < local14.height + local14.y && arg3 + arg0 > local14.y) {
				Static236.aBooleanArray29[local8] = true;
			}
		}
	}
}
