import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
	public static int anInt4372;

	@OriginalMember(owner = "client!lp", name = "E", descriptor = "[[Lclient!bf;")
	public static Class22[][] aClass22ArrayArray1;

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString45;

	@OriginalMember(owner = "client!lp", name = "J", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "Lclient!mn;")
	public static final Class163 aClass163_28 = new Class163(16);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I")
	public static int method3553(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIII[BI)Z")
	public static boolean method3555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(21) int local21 = arg0 % 8;
		@Pc(28) int local28;
		if (local21 == 0) {
			local28 = 0;
		} else {
			local28 = 8 - local21;
		}
		@Pc(43) int local43 = -((arg1 + 8 - 1) / 8);
		@Pc(52) int local52 = -((arg0 + 8 - 1) / 8);
		for (@Pc(54) int local54 = local43; local54 < 0; local54++) {
			for (@Pc(58) int local58 = local52; local58 < 0; local58++) {
				if (arg4[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local28;
			if (arg4[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}
}
