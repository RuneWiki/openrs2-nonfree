import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cp", name = "K", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_29 = new Class263(107, 3);

	@OriginalMember(owner = "client!cp", name = "P", descriptor = "Lclient!ui;")
	public static final Class248 aClass248_1 = new Class248("LIVE", 0);

	@OriginalMember(owner = "client!cp", name = "Q", descriptor = "[S")
	public static final short[] aShortArray36 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!cp", name = "R", descriptor = "[I")
	public static final int[] anIntArray140 = new int[14];

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;BZI)I")
	public static int method1106(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(41) char local41 = arg0.charAt(local36);
			if (local36 == 0) {
				if (local41 == '-') {
					local27 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local41 >= '0' && local41 <= '9') {
				local75 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local75 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local75 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local75 >= arg1) {
				throw new NumberFormatException();
			}
			if (local27) {
				local75 = -local75;
			}
			@Pc(113) int local113 = local75 + local31 * arg1;
			if (local31 != local113 / arg1) {
				throw new NumberFormatException();
			}
			local29 = true;
			local31 = local113;
		}
		if (!local29) {
			throw new NumberFormatException();
		}
		return local31;
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "(II)Lclient!rr;")
	public static Class220 method1109(@OriginalArg(0) int arg0) {
		@Pc(6) Class220[] local6 = Static35.method726();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			if (arg0 == local6[local8].anInt6586) {
				return local6[local8];
			}
		}
		return null;
	}
}
