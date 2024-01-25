import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!gv;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	public static int anInt3296 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B[BII)Ljava/lang/String;")
	public static String method2672(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(21) int local21 = 0; local21 < arg2; local21++) {
			@Pc(31) int local31 = arg0[local21 + arg1] & 0xFF;
			if (local31 != 0) {
				if (local31 >= 128 && local31 < 160) {
					@Pc(50) char local50 = Static189.aCharArray8[local31 - 128];
					if (local50 == '\u0000') {
						local50 = '?';
					}
					local31 = local50;
				}
				local8[local10++] = (char) local31;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Lclient!lf;")
	public static Class26_Sub3 method2673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass26_Sub3_2;
	}
}
