import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "Z")
	public static boolean aBoolean505 = false;

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "Lclient!hd;")
	public static final Class128 aClass128_35 = new Class128(32);

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method5995(@OriginalArg(1) String[] arg0) {
		@Pc(16) String[] local16 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local16[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local16[local18] = local16[local18] + arg0[local18];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)[Lclient!cf;")
	public static Class46[] method5999() {
		return new Class46[] { Static530.aClass46_1, Static530.aClass46_2, Static530.aClass46_3, Static530.aClass46_4, Static530.aClass46_5, Static530.aClass46_6, Static530.aClass46_7, Static530.aClass46_8, Static530.aClass46_9, Static530.aClass46_10, Static530.aClass46_11, Static530.aClass46_12, Static530.aClass46_13, Static530.aClass46_14 };
	}
}
