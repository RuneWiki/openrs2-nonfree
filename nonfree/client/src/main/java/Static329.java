import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!la", name = "r", descriptor = "I")
	public static int anInt6017;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!hga;")
	public static Class141 aClass141_4;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public static int anInt6013 = 0;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_64 = new Class341(4, -1);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Lclient!dc;")
	public static Class15_Sub3_Sub2 method5441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class15_Sub3_Sub2 local14 = local7.aClass15_Sub3_Sub2_1;
			local7.aClass15_Sub3_Sub2_1 = null;
			Static353.method6087(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5442(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static645.anInt10075; local16++) {
			if (arg0.equalsIgnoreCase(Static13.aStringArray49[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static542.aStringArray61[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)Z")
	public static boolean method5444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static345.method5979(arg1, arg0) & Static52.method1059(arg1, arg0);
	}
}
