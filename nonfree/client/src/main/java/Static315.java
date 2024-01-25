import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	public static int anInt5070;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_49 = new Class144(54, 3);

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZB)V")
	public static void method4631(@OriginalArg(0) boolean arg0) {
		Static445.method5895();
		if (!Static472.method6431(Static98.anInt2140)) {
			return;
		}
		@Pc(20) Class292[] local20 = Static95.aClass292Array1;
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(28) Class292 local28 = local20[local22];
			local28.anInt8015++;
			if (local28.anInt8015 < 50 && !arg0) {
				return;
			}
			local28.anInt8015 = 0;
			if (!local28.aBoolean535 && local28.aClass118_2 != null) {
				@Pc(67) Class3_Sub29 local67 = Static507.method6901(Static658.aClass144_101, local28.aClass88_2);
				local28.method6855(local67);
				try {
					local28.method6851();
				} catch (@Pc(76) IOException local76) {
					local28.aBoolean535 = true;
				}
			}
		}
		Static445.method5895();
	}
}
