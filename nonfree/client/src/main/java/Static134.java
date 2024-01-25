import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_101 = new Class123(117, 17);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)Lclient!ht;")
	public static Class25_Sub2_Sub5 method2611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass25_Sub2_Sub5_1 == null ? null : local7.aClass25_Sub2_Sub5_1;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(III)Z")
	public static boolean method2612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
