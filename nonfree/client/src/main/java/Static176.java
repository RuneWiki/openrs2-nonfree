import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
	public static int anInt2886;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!qga;)V")
	public static void method2616(@OriginalArg(1) Class299 arg0) {
		@Pc(12) Class299 local12 = Static197.method2950(arg0);
		@Pc(16) int local16;
		@Pc(18) int local18;
		if (local12 == null) {
			local16 = Static563.anInt4939;
			local18 = Static506.anInt8791;
		} else {
			local18 = local12.anInt8547;
			local16 = local12.anInt8573;
		}
		Static352.method8325(local16, false, arg0, local18);
		Static628.method8818(local18, arg0, local16);
	}
}
