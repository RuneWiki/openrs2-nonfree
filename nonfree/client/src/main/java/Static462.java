import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "F")
	public static float aFloat158;

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	public static int anInt7835 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!oa;I)Lclient!kga;")
	public static Class196 method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		@Pc(9) Class352 local9 = Static376.method5611(arg1, arg0, true);
		return local9 == null ? null : local9.aClass196_13;
	}
}
