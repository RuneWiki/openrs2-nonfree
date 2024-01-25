import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	public static int anInt7024;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public static int anInt7026;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "J")
	public static long aLong191;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public static int anInt7025 = 0;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Lclient!mha;")
	public static final Class228 aClass228_7 = new Class228(3, 2);

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "[I")
	public static final int[] anIntArray550 = new int[3];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!s;)V")
	public static void method6249(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		Static299.aClass40Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)I")
	public static int method6250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
