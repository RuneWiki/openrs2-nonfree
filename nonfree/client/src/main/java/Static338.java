import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
	public static int anInt5763;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "[I")
	public static int[] anIntArray507;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Lclient!et;")
	public static Class71 method4532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class71 local7 = new Class71();
		local7.anInt1967 = arg1 + 1 + 5;
		local7.anInt1979 = -1;
		local7.anInt1971 = arg0 + 5 + 1;
		local7.anInt1973 = -1;
		local7.anIntArrayArray11 = new int[local7.anInt1967][local7.anInt1971];
		local7.method1621();
		return local7;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lclient!at;")
	public static Class16 method4534(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static151.aClass16ArrayArray1[local7] == null || Static151.aClass16ArrayArray1[local7][local11] == null) {
			@Pc(33) boolean local33 = Static260.method3501(local7);
			if (!local33) {
				return null;
			}
		}
		return Static151.aClass16ArrayArray1[local7][local11];
	}
}
