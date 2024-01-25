import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "Lclient!qi;")
	public static Class290 aClass290_1;

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
	public static int anInt5385;

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
	public static int anInt5386;

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_99 = new Class337(96, 0);

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)V")
	public static void method4833(@OriginalArg(1) int arg0) {
		Static554.anInt9352 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)Lclient!qi;")
	public static Class290 method4834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass290_2;
	}
}
