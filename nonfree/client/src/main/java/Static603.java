import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!uia", name = "h", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_347 = new Class179(132, -1);

	@OriginalMember(owner = "client!uia", name = "n", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_348 = new Class179(80, 28);

	@OriginalMember(owner = "client!uia", name = "o", descriptor = "[I")
	public static final int[] anIntArray655 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IBIII)V")
	public static void method8299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) Class6_Sub4_Sub18 local22 = Static565.method7924((long) arg2 << 32 | (long) arg3, 19);
		local22.method7976();
		local22.anInt9463 = arg0;
		local22.anInt9466 = arg1;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IBI)V")
	public static void method8302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class6_Sub4_Sub18 local11 = Static565.method7924((long) arg0, 5);
		local11.method7976();
		local11.anInt9466 = arg1;
	}
}
