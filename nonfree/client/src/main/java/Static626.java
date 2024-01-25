import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "J")
	public static long aLong282;

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "F")
	public static float aFloat227 = 1.0F;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method8410(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg1, 3);
		local9.method3955();
		local9.aString42 = arg0;
	}
}
