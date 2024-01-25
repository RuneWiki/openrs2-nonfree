import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
	public static int anInt9502;

	@OriginalMember(owner = "client!uia", name = "n", descriptor = "Lclient!hu;")
	public static Class155 aClass155_14;

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "[I")
	public static final int[] anIntArray685 = new int[1];

	@OriginalMember(owner = "client!uia", name = "h", descriptor = "Z")
	public static boolean aBoolean679 = true;

	@OriginalMember(owner = "client!uia", name = "q", descriptor = "I")
	public static int anInt9512 = -1;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "([BB)[B")
	public static byte[] method8069(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub17 local8 = new Class2_Sub17(arg0);
		@Pc(17) int local17 = local8.method2859();
		@Pc(21) int local21 = local8.method2881();
		if (local21 < 0 || Static454.anInt7417 != 0 && local21 > Static454.anInt7417) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(43) byte[] local43 = new byte[local21];
			local8.method2832(local43, local21, 0);
			return local43;
		} else {
			@Pc(57) int local57 = local8.method2881();
			if (local57 < 0 || Static454.anInt7417 != 0 && local57 > Static454.anInt7417) {
				throw new RuntimeException();
			}
			@Pc(75) byte[] local75 = new byte[local57];
			if (local17 == 1) {
				Static615.method8584(local75, local57, arg0, local21);
			} else {
				@Pc(80) Class154 local80 = Static124.aClass154_1;
				synchronized (Static124.aClass154_1) {
					Static124.aClass154_1.method3607(local8, local75);
				}
			}
			return local75;
		}
	}
}
