import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString46 = "";

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Lclient!ou;")
	public static Class4_Sub5 method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub5_3;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)Z")
	public static boolean method5300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(19) Interface18 local19 = (Interface18) Static162.method2962(arg0, arg2, arg1);
		if (local19 != null) {
			local13 = Static373.method5569(local19) & true;
		}
		local19 = (Interface18) Static117.method2480(arg0, arg2, arg1, pba.class);
		if (local19 != null) {
			local13 &= Static373.method5569(local19);
		}
		local19 = (Interface18) Static300.method4758(arg0, arg2, arg1);
		if (local19 != null) {
			local13 &= Static373.method5569(local19);
		}
		return local13;
	}
}
