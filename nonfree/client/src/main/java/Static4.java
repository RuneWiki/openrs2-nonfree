import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
	public static int anInt75;

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "[Lclient!mha;")
	public static Class234_Sub1[] aClass234_Sub1Array1;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
	public static String method88(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg1];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			@Pc(24) int local24 = arg0[arg2 + local10] & 0xFF;
			if (local24 != 0) {
				if (local24 >= 128 && local24 < 160) {
					@Pc(45) char local45 = Static506.aCharArray7[local24 - 128];
					if (local45 == '\u0000') {
						local45 = '?';
					}
					local24 = local45;
				}
				local6[local8++] = (char) local24;
			}
		}
		return new String(local6, 0, local8);
	}
}
