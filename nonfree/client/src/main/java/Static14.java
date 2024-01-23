import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!am", name = "h", descriptor = "Lclient!ka;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "I")
	public static int anInt367;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "I")
	public static int anInt369;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	public static int anInt370;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public static int anInt362 = -1;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "Lclient!db;")
	public static Class31 aClass31_3 = new Class31(64);

	@OriginalMember(owner = "client!am", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString15 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!am", name = "n", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZLjava/util/Random;)I")
	public static int method284(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static244.method3857(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(35) int local35 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(38) int local38;
			do {
				local38 = arg1.nextInt();
			} while (local35 <= local38);
			return Static22.method3918(local38, arg0);
		}
	}
}
