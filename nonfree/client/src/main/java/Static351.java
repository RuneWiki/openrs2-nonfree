import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!u", name = "V", descriptor = "Lclient!hp;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!u", name = "X", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!u", name = "U", descriptor = "Lclient!es;")
	public static final Class73 aClass73_6 = new Class73("WTQA", 2);

	@OriginalMember(owner = "client!u", name = "W", descriptor = "Lclient!o;")
	public static final Class169 aClass169_310 = new Class169("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBLjava/util/Random;)I")
	public static int method4927(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static196.method2844(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(37) int local37;
			do {
				local37 = arg1.nextInt();
			} while (local37 >= local34);
			return Static233.method3202(arg0, local37);
		}
	}
}
