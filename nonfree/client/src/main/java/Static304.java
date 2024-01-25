import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_114 = new Class253(102, 4);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method4043(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static217.method3066(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(47) int local47 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(50) int local50;
			do {
				local50 = arg1.nextInt();
			} while (local47 <= local50);
			return Static134.method2136(local50, arg0);
		}
	}
}
