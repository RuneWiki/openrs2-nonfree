import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bea", name = "l", descriptor = "Lclient!vaa;")
	public static final Class361 aClass361_4 = new Class361(2, 2);

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "Lclient!el;")
	public static final Class109 aClass109_18 = new Class109(87, -1);

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "[I")
	public static final int[] anIntArray39 = new int[1];

	@OriginalMember(owner = "client!bea", name = "i", descriptor = "Lclient!el;")
	public static final Class109 aClass109_19 = new Class109(7, 3);

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB)I")
	public static int method687(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZZII)Ljava/lang/String;")
	public static String method688(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		} else if (arg0 && arg1 >= 0) {
			@Pc(42) int local42 = 2;
			@Pc(46) int local46 = arg1 / 10;
			while (local46 != 0) {
				local46 /= 10;
				local42++;
			}
			@Pc(63) char[] local63 = new char[local42];
			local63[0] = '+';
			for (@Pc(79) int local79 = local42 - 1; local79 > 0; local79--) {
				@Pc(83) int local83 = arg1;
				arg1 /= 10;
				@Pc(94) int local94 = local83 - arg1 * 10;
				if (local94 < 10) {
					local63[local79] = (char) (local94 + 48);
				} else {
					local63[local79] = (char) (local94 + 87);
				}
			}
			return new String(local63);
		} else {
			return Integer.toString(arg1, 10);
		}
	}
}
