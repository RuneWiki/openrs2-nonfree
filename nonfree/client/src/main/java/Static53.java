import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "J")
	public static long aLong41;

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_27 = new Class133(1, 7);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IBZLjava/lang/String;)I")
	public static int method1120(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(38) int local38 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(98) int local98;
			if (local46 >= '0' && local46 <= '9') {
				local98 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local98 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local98 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local98 >= arg0) {
				throw new NumberFormatException();
			}
			if (local26) {
				local98 = -local98;
			}
			@Pc(127) int local127 = arg0 * local30 + local98;
			if (local127 / arg0 != local30) {
				throw new NumberFormatException();
			}
			local30 = local127;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
	public static boolean method1121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = (arg1 & 0x37) == 0 ? Static424.method6501(arg0, arg1) : Static349.method5539(arg1, arg0);
		return (arg0 & 0x10000) != 0 | Static469.method7009(arg0, arg1) | local22;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(B)V")
	public static void method1122() {
		Static326.aBoolean396 = false;
		Static65.aClipboard1 = null;
		Static403.method6133();
	}
}
