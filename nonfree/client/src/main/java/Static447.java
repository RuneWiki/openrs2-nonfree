import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Lclient!qg;")
	public static Class30 aClass30_7;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	public static int anInt6544;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public static int anInt6547;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[200];

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)Lclient!lv;")
	public static Class24_Sub4 method5138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass24_Sub4_1 == null ? null : local7.aClass24_Sub4_1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IC)Z")
	public static boolean method5141(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(36) char[] local36 = Static191.aCharArray5;
			for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
				@Pc(44) char local44 = local36[local38];
				if (arg0 == local44) {
					return true;
				}
			}
		}
		return false;
	}
}
