import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static217 {

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_37 = new Class208(67, 2);

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "Lclient!dea;")
	public static final Class6_Sub11 aClass6_Sub11_1 = new Class6_Sub11(0, 0);

	@OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
	public static final int anInt4255 = 1338;

	@OriginalMember(owner = "client!hm", name = "R", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)B")
	public static byte method3686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZII)Z")
	public static boolean method3687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)Z")
	public static boolean method3690(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
