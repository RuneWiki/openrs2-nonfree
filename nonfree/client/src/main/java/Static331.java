import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "Lclient!nl;")
	public static Class171 aClass171_86;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_52 = new Class160(8);

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Z")
	public static boolean aBoolean415 = true;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "Z")
	public static boolean aBoolean417 = true;

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[100];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!nl;IBI)Lclient!qi;")
	public static Class200 method4882(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) byte[] local9 = arg0.method3745(arg1, 0);
		return local9 == null ? null : new Class200(local9);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/util/Random;IB)I")
	public static int method4885(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static69.method1129(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local42);
			return Static83.method1260(local45, arg1);
		}
	}
}
