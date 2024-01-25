import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "[Lclient!o;")
	public static Class49[] aClass49Array2;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
	public static int anInt788 = -50;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
	public static final int[] anIntArray39 = new int[13];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZILjava/util/Random;)I")
	public static int method700(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static147.method2135(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local39 <= local42);
			return Static30.method478(local42, arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V")
	public static void method701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub2_Sub9 local12 = Static72.method1073(13, arg0);
		local12.method3026();
		local12.anInt3818 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V")
	public static void method702(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		Static84.method1238(arg0, arg3, null, arg1, arg4, -1, arg2);
	}
}
