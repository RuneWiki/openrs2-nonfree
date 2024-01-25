import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
	public static int anInt5929;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "Lclient!lk;")
	public static final Class209 aClass209_31 = new Class209(512);

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "J")
	public static long aLong169 = -1L;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "[I")
	public static final int[] anIntArray338 = new int[6];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)I")
	public static int method5040(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}
}
