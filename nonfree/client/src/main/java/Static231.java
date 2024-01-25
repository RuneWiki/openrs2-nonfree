import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_62 = new Class177(6, 7);

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!es;")
	public static final Class78 aClass78_1 = new Class78();

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBII)V")
	public static void method3515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0 * Static12.aClass34_Sub1_1.anInt7157 >> 8;
		if (local10 != 0 && arg2 != -1) {
			Static199.method3194(Static238.aClass211_60, local10, arg2);
			Static180.aBoolean240 = true;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)C")
	public static char method3516(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(41) char local41 = Static382.aCharArray5[local7 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local7 = local41;
		}
		return (char) local7;
	}
}
