import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!po", name = "r", descriptor = "J")
	public static long aLong201;

	@OriginalMember(owner = "client!po", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray52;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "Lclient!wd;")
	public static Class354 aClass354_5;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method6391(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static100.method2181(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local42 <= local45);
			return Static444.method6842(local45, arg1);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IBI)Lclient!ga;")
	public static Class111 method6392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class111 local7 = new Class111();
		local7.anInt3186 = arg1 + 5 + 1;
		local7.anInt3180 = -1;
		local7.anInt3168 = arg0 + 1 + 5;
		local7.anInt3177 = -1;
		local7.anIntArrayArray20 = new int[local7.anInt3186][local7.anInt3168];
		local7.method2855();
		return local7;
	}
}
