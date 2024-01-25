import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "J")
	public static long aLong94;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Lclient!vm;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "Lclient!us;")
	public static final Class344 aClass344_46 = new Class344(37, 8);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Lclient!of;")
	public static Class243 method3781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass243_1;
	}
}
