import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
	public static int anInt602;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array3 = new Class28[1000];

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!pa;")
	public static Class63 aClass63_4 = new Class63(64);

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public static int anInt605 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method616() {
		aClass28Array3 = null;
		aClass63_4 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)Z")
	public static boolean method617(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
	public static void method618(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static2.anInt84; local1++) {
			if (arg3 < Static24.anIntArray154[local1] + Static78.anIntArray382[local1] && arg3 + arg1 > Static24.anIntArray154[local1] && Static64.anIntArray332[local1] + Static166.anIntArray675[local1] > arg0 && Static64.anIntArray332[local1] < arg0 + arg2) {
				Static137.aBooleanArray15[local1] = true;
			}
		}
	}
}
