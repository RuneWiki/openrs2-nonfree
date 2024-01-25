import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!wg;")
	public static Class316 aClass316_1;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
	public static int anInt3812 = 0;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
	public static int anInt3813 = 0;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Z")
	public static boolean aBoolean310 = false;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IC)Z")
	public static boolean method3531(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!os;B)V")
	public static void method3534(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static528.aClass265_6 != null) {
			@Pc(27) int local27;
			try {
				Static528.aClass265_6.method6862(0L);
				Static528.aClass265_6.method6859(local13);
				for (local27 = 0; local27 < 24 && local13[local27] == 0; local27++) {
				}
				if (local27 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(49) Exception local49) {
				for (local27 = 0; local27 < 24; local27++) {
					local13[local27] = -1;
				}
			}
		}
		arg0.method4454(24, local13);
	}
}
