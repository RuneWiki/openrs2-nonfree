import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
	public static int anInt5011;

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!ke", name = "M", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[8];

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_98 = new Class225(76, 0);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)I")
	public static int method4554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static158.aClass133Array4 == null) {
			return 0;
		}
		@Pc(19) int local19 = arg1 >> 9;
		@Pc(23) int local23 = arg2 >> 9;
		if (local19 < 0 || local23 < 0 || local19 > Static426.anInt6942 - 1 || local23 > Static280.anInt6752 - 1) {
			return 0;
		}
		@Pc(51) int local51 = arg0;
		if (arg0 < 3 && (Static392.aByteArrayArrayArray16[1][local19][local23] & 0x2) != 0) {
			local51 = arg0 + 1;
		}
		return Static158.aClass133Array4[local51].method8214(arg1, arg2);
	}
}
