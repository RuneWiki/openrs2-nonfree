import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dfa", name = "m", descriptor = "Lclient!pu;")
	public static Class270 aClass270_15;

	@OriginalMember(owner = "client!dfa", name = "n", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILclient!da;ZI)Lclient!nu;")
	public static Class242 method1472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class63 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class242(arg1, arg3, arg0, arg2.K(), arg2.KA(), arg2.l(), arg2.J(), arg2.H(), arg2.OA(), arg2.za());
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III)Lclient!kg;")
	public static Class8_Sub3_Sub4 method1473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub3_Sub4_1;
	}
}
