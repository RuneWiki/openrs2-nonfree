import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
	public static int anInt9210;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "Lclient!di;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "Lclient!fw;")
	public static final Class125 aClass125_36 = new Class125(16);

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_220 = new Class251(59, -1);

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_58 = new Class317(8);

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "Z")
	public static boolean aBoolean639 = false;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "()V")
	public static void method7943() {
		Static354.method5380(Static59.anInt987);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIZIZ)I")
	public static int method7944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class14_Sub14 local8 = Static495.method7455(arg0, false);
		if (local8 == null) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8.anIntArray106.length; local17++) {
			if (local8.anIntArray106[local17] >= 0 && Static252.aClass56_1.anInt1014 > local8.anIntArray106[local17]) {
				@Pc(47) Class284 local47 = Static252.aClass56_1.method1052(local8.anIntArray106[local17]);
				@Pc(57) int local57 = local47.method6828(Static653.aClass104_2.method2173(arg1).anInt2348, arg1);
				if (arg2) {
					local15 += local8.anIntArray107[local17] * local57;
				} else {
					local15 += local57;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method7945(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static691.method82(arg0, arg1, local6, 0, 32768);
		return local6;
	}
}
