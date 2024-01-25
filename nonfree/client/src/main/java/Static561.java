import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
	public static int anInt9691;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "([IB[Ljava/lang/Object;)V")
	public static void method7831(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static185.method3524(arg0.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIBII)V")
	public static void method7832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class8_Sub5_Sub8 local13 = Static509.method7344(10, arg2);
		local13.method3509();
		local13.anInt4329 = arg3;
		local13.anInt4324 = arg1;
		local13.anInt4321 = arg0;
	}
}
