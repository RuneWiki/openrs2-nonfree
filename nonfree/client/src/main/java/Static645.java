import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "[I")
	public static int[] anIntArray567;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIZ)V")
	public static void method9066(@OriginalArg(3) boolean arg0) {
		if (22050 > 48000) {
			throw new IllegalArgumentException();
		}
		Static157.anInt2396 = 22050;
		Static541.anInt9210 = 2;
		Static583.aBoolean664 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/util/Random;B)I")
	public static int method9067(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static670.method9288(100, arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(38) int local38 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(48) int local48;
			do {
				local48 = arg1.nextInt();
			} while (local38 <= local48);
			return Static596.method8450(local48, arg0);
		}
	}
}
