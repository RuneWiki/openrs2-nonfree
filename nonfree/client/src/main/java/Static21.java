import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IBI)V")
	public static void method963(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub4_Sub12 local14 = Static556.method8018(16, arg1);
		local14.method3608();
		local14.anInt4062 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!sl;B)V")
	public static void method970(@OriginalArg(0) Class3_Sub3 arg0) {
		@Pc(14) byte[] local14 = new byte[24];
		if (Static43.aClass173_1 != null) {
			@Pc(28) int local28;
			try {
				Static43.aClass173_1.method4421(0L);
				Static43.aClass173_1.method4419(local14);
				for (local28 = 0; local28 < 24 && local14[local28] == 0; local28++) {
				}
				if (local28 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local28 = 0; local28 < 24; local28++) {
					local14[local28] = -1;
				}
			}
		}
		arg0.method4237(0, local14, 24);
	}
}
