import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
	public static int anInt9003;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "Lclient!pq;")
	public static Class251 aClass251_147;

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "[I")
	public static final int[] anIntArray676 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Lclient!wda;")
	public static Class29_Sub5 method7362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass29_Sub5_2;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)V")
	public static void method7364(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub1_Sub5 local13 = Static77.method1176(arg0, 12);
		local13.method770();
	}
}
