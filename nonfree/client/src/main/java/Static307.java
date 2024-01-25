import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([IILclient!sf;I[II)Lclient!vk;")
	public static Class1_Sub3 method4714(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16_Sub1 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg2.method6292(Static553.aClass330_14, Static550.aClass361_15)) {
			@Pc(21) int[] local21 = new int[arg1 * arg4];
			for (local23 = 0; local23 < arg1; local23++) {
				local33 = local23 * arg4 + arg3[local23];
				for (local35 = 0; local35 < arg0[local23]; local35++) {
					local21[local33++] = -16777216;
				}
			}
			return new Class1_Sub3(arg2, arg4, arg1, local21);
		}
		@Pc(69) byte[] local69 = new byte[arg4 * arg1];
		for (local23 = 0; local23 < arg1; local23++) {
			local33 = arg4 * local23 + arg3[local23];
			for (local35 = 0; local35 < arg0[local23]; local35++) {
				local69[local33++] = -1;
			}
		}
		return new Class1_Sub3(arg2, arg4, arg1, local69);
	}
}
