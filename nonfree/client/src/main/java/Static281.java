import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!jia", name = "h", descriptor = "Lclient!eb;")
	public static Class91 aClass91_7;

	@OriginalMember(owner = "client!jia", name = "e", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_70 = new Class171(44, -1);

	@OriginalMember(owner = "client!jia", name = "j", descriptor = "I")
	public static int anInt4774 = 0;

	@OriginalMember(owner = "client!jia", name = "k", descriptor = "Z")
	public static boolean aBoolean315 = false;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)I")
	public static int method4096() {
		return Static407.anIntArray349 == null ? 0 : Static407.anIntArray349.length * 2;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V")
	public static void method4097() {
		Static135.aClass295_9.method6464();
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method4099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(38) int local38 = -((arg1 + 8 - 1) / 8);
		@Pc(48) int local48 = -((arg4 + 8 - 1) / 8);
		for (@Pc(50) int local50 = local38; local50 < 0; local50++) {
			for (@Pc(54) int local54 = local48; local54 < 0; local54++) {
				if (arg3[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local16;
			if (arg3[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg0;
		}
		return false;
	}
}
