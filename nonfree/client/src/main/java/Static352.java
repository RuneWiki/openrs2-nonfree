import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
	public static int anInt6763 = 0;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "[B")
	public static final byte[] aByteArray91 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIZIB)I")
	public static int method5661(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class2_Sub21 local10 = Static238.method4329(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray245.length; local23++) {
			if (local10.anIntArray245[local23] >= 0 && local10.anIntArray245[local23] < Static310.aClass184_2.anInt5966) {
				@Pc(45) Class122 local45 = Static310.aClass184_2.method5040(local10.anIntArray245[local23]);
				@Pc(54) int local54 = local45.method3398(arg1, Static176.method3422(arg1).anInt4464);
				if (arg0) {
					local21 += local10.anIntArray247[local23] * local54;
				} else {
					local21 += local54;
				}
			}
		}
		return local21;
	}
}
