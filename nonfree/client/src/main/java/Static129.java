import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[[[Lclient!rr;")
	public static Class313[][][] aClass313ArrayArrayArray7;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V")
	public static void method8396(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub2_Sub4 local13 = Static257.method3597(8, (long) arg0);
		local13.method2440();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZZ)I")
	public static int method8399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class5_Sub48 local8 = Static386.method5663(arg2, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(30) int local30 = 0; local30 < local8.anIntArray495.length; local30++) {
				if (arg0 == local8.anIntArray497[local30]) {
					local19 += local8.anIntArray495[local30];
				}
			}
			return local19;
		}
	}
}
