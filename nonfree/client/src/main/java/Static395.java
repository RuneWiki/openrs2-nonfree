import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!to", name = "k", descriptor = "[S")
	public static short[] aShortArray110 = new short[256];

	@OriginalMember(owner = "client!to", name = "m", descriptor = "I")
	public static int anInt6456 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V")
	public static void method5139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass2_Sub3_2 != null) {
			local7.aClass2_Sub3_2 = null;
		}
	}
}
