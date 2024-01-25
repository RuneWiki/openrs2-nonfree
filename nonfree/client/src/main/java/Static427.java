import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!oja", name = "h", descriptor = "J")
	public static long aLong200;

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(III)Lclient!mha;")
	public static Class4_Sub1_Sub5 method6188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub1_Sub5_2;
	}
}
