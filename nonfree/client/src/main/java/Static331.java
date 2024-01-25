import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
	public static int anInt6223 = -1;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([II[J)V")
	public static void method5390(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static22.method871(arg1.length - 1, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!gw;)V")
	public static void method5391(@OriginalArg(1) Class1_Sub13 arg0) {
		if (arg0.aByteArray45.length - arg0.anInt3400 < 1) {
			return;
		}
		@Pc(17) int local17 = arg0.method3043();
		if (local17 < 0 || local17 > 1 || arg0.aByteArray45.length - arg0.anInt3400 < 2) {
			return;
		}
		@Pc(39) int local39 = arg0.method3056();
		if (arg0.aByteArray45.length - arg0.anInt3400 < local39 * 6) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < local39; local57++) {
			@Pc(62) int local62 = arg0.method3056();
			@Pc(68) int local68 = arg0.method3037();
			if (local62 < Static52.anIntArray138.length && Static99.aBooleanArray12[local62] && (Static221.aClass263_1.method6375(local62).aChar2 != '1' || local68 >= -1 && local68 <= 1)) {
				Static52.anIntArray138[local62] = local68;
			}
		}
	}
}
