import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Lclient!in;")
	public static Class157 aClass157_278;

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "Lclient!tu;")
	public static Class333 aClass333_3;

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
	public static int anInt10146 = 0;

	@OriginalMember(owner = "client!uc", name = "S", descriptor = "Lclient!uh;")
	public static final Class341 aClass341_65 = new Class341();

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)Lclient!qfa;")
	public static Class3_Sub1_Sub5 method8458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub1_Sub5_2;
	}
}
