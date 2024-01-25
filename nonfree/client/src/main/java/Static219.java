import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
	public static int anInt4400;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ICI)I")
	public static int method3940(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local12 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local12 = 1762;
		}
		return local12;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)I")
	public static int method3941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static71.method5018(arg0 - 1, arg1 + -1) + Static71.method5018(arg0 + 1, arg1 + -1) + Static71.method5018(arg0 + -1, arg1 + 1) + Static71.method5018(arg0 + 1, arg1 + 1);
		@Pc(74) int local74 = Static71.method5018(arg0 - 1, arg1) + Static71.method5018(arg0 + 1, arg1) + Static71.method5018(arg0, arg1 - 1) + Static71.method5018(arg0, arg1 - -1);
		@Pc(81) int local81 = Static71.method5018(arg0, arg1);
		return local81 / 4 + local74 / 8 + local42 / 16;
	}
}
