import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "[I")
	public static final int[] anIntArray698 = new int[8];

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "[B")
	public static final byte[] aByteArray122 = new byte[2048];

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(III)V")
	public static void method7615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass29_Sub3_1 != null) {
			local7.aClass29_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILclient!ic;)V")
	public static void method7616(@OriginalArg(1) Interface14 arg0) {
		Static224.anInterface14_1.method5119();
		Static224.anInterface14_1 = arg0;
	}
}
