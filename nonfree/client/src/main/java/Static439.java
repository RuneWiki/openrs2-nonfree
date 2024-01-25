import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(ZI[Lclient!qga;III)V")
	public static void method6589(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class299[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(5) int local5 = 0; local5 < arg2.length; local5++) {
			@Pc(14) Class299 local14 = arg2[local5];
			if (local14 != null && local14.anInt8527 == arg4) {
				Static352.method8325(arg1, arg0, local14, arg3);
				Static628.method8818(arg3, local14, arg1);
				if (local14.anInt8552 > local14.anInt8560 - local14.anInt8573) {
					local14.anInt8552 = local14.anInt8560 - local14.anInt8573;
				}
				if (local14.anInt8599 - local14.anInt8547 < local14.anInt8617) {
					local14.anInt8617 = local14.anInt8599 - local14.anInt8547;
				}
				if (local14.anInt8552 < 0) {
					local14.anInt8552 = 0;
				}
				if (local14.anInt8617 < 0) {
					local14.anInt8617 = 0;
				}
				if (local14.anInt8610 == 0) {
					Static683.method9420(local14, arg0);
				}
			}
		}
	}
}
