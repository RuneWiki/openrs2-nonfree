import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!jia", name = "f", descriptor = "[Lclient!er;")
	public static Class101[] aClass101Array1;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "I")
	public static int anInt5468 = 0;

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
	public static int anInt5471 = 0;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(III)Lclient!sla;")
	public static Class343 method4639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass343_2;
	}
}
