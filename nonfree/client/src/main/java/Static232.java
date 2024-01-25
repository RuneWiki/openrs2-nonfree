import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!iaa", name = "s", descriptor = "Lclient!ee;")
	public static Class81 aClass81_6;

	@OriginalMember(owner = "client!iaa", name = "u", descriptor = "I")
	public static int anInt3961;

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
	public static int anInt3954 = 0;

	@OriginalMember(owner = "client!iaa", name = "p", descriptor = "[I")
	public static final int[] anIntArray224 = new int[3];

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method3397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg2[arg1 + local17] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(44) char local44 = Static454.aCharArray6[local27 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local27 = local44;
				}
				local8[local15++] = (char) local27;
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIZ)V")
	public static void method3400(@OriginalArg(3) boolean arg0) {
		Static555.anInt9293 = 2;
		Static555.aBoolean676 = arg0;
		Static328.anInt8868 = 22050;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)J")
	public static long method3401(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}
}
