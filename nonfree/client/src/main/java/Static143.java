import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	public static int anInt2792;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
	public static int anInt2793;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
	public static int anInt2794 = 0;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt2795 = -1;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString96 = "red:";

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "S")
	public static short aShort22 = 1;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIILclient!km;IJ)Z")
	public static boolean method2512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class11 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static282.method4274(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}
}
