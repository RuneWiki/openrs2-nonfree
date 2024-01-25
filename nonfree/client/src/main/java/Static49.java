import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "Lclient!nl;")
	public static Class171 aClass171_17;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_24 = new Class205(17, -2);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public static void method848() {
		Static140.aClass63_4.method1988(Static345.aFloat81, Static290.aFloat71, Static160.aFloat49);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I")
	public static int method850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method851(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) char[] local6 = new char[arg1];
		@Pc(8) int local8 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			@Pc(24) int local24 = arg0[local15 + arg2] & 0xFF;
			if (local24 != 0) {
				if (local24 >= 128 && local24 < 160) {
					@Pc(40) char local40 = Static187.aCharArray1[local24 - 128];
					if (local40 == '\u0000') {
						local40 = '?';
					}
					local24 = local40;
				}
				local6[local8++] = (char) local24;
			}
		}
		return new String(local6, 0, local8);
	}
}
