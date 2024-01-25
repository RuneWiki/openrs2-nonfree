import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "[Lclient!pc;")
	public static Class265[] aClass265Array1;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "Lclient!u;")
	public static Class342 aClass342_3;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;IIZ)Z")
	public static boolean method7782(@OriginalArg(0) String arg0) {
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(43) char local43 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local43 == '-') {
					local29 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(72) int local72;
			if (local43 >= '0' && local43 <= '9') {
				local72 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local72 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local72 = local43 - 'W';
			} else {
				return false;
			}
			if (local72 >= 10) {
				return false;
			}
			if (local29) {
				local72 = -local72;
			}
			@Pc(119) int local119 = local72 + local33 * 10;
			if (local33 != local119 / 10) {
				return false;
			}
			local31 = true;
			local33 = local119;
		}
		return local31;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIBIII)V")
	public static void method7783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static428.anInt6845 = arg0;
		Static668.anInt10668 = arg4;
		Static361.anInt5826 = arg2;
		Static51.anInt1086 = arg3;
		Static519.anInt8363 = arg1;
		Static155.anInt3064 = arg5;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z")
	public static boolean method7784(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
