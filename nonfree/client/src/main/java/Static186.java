import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!it", name = "A", descriptor = "Lclient!c;")
	public static Class6 aClass6_2;

	@OriginalMember(owner = "client!it", name = "B", descriptor = "I")
	public static int anInt3293;

	@OriginalMember(owner = "client!it", name = "t", descriptor = "I")
	public static int anInt3290 = 0;

	@OriginalMember(owner = "client!it", name = "u", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_49 = new Class208(63, -1);

	@OriginalMember(owner = "client!it", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!it", name = "y", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_50 = new Class208(24, 6);

	@OriginalMember(owner = "client!it", name = "z", descriptor = "[I")
	public static final int[] anIntArray270 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([BBII)Ljava/lang/String;")
	public static String method2710(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg2];
		@Pc(8) int local8 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg2; local15++) {
			@Pc(24) int local24 = arg0[arg1 + local15] & 0xFF;
			if (local24 != 0) {
				if (local24 >= 128 && local24 < 160) {
					@Pc(45) char local45 = Static205.aCharArray3[local24 - 128];
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
