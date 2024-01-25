import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "[Lclient!bla;")
	public static Class19_Sub1[] aClass19_Sub1Array2;

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_33 = new Class357();

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
	public static String method5137(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) char[] local19 = new char[arg1];
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < arg1; local23++) {
			@Pc(33) int local33 = arg0[local23 + arg2] & 0xFF;
			if (local33 != 0) {
				if (local33 >= 128 && local33 < 160) {
					@Pc(51) char local51 = Static38.aCharArray1[local33 - 128];
					if (local51 == '\u0000') {
						local51 = '?';
					}
					local33 = local51;
				}
				local19[local21++] = (char) local33;
			}
		}
		return new String(local19, 0, local21);
	}
}
