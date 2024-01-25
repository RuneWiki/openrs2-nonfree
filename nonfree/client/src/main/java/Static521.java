import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "Z")
	public static boolean aBoolean629 = false;

	@OriginalMember(owner = "client!tw", name = "wb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray26 = new byte[250][];

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZILjava/util/Random;)I")
	public static int method7113(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static119.method2029(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local42 <= local45);
			return Static197.method3407(local45, arg0);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BIZI)I")
	public static int method7119(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub46 local10 = Static365.method5363(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(29) int local29 = 0; local29 < local10.anIntArray576.length; local29++) {
				if (local10.anIntArray577[local29] == arg2) {
					local22 += local10.anIntArray576[local29];
				}
			}
			return local22;
		}
	}
}
