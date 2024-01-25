import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
	public static int anInt10558 = 0;

	@OriginalMember(owner = "client!uba", name = "x", descriptor = "Lclient!sha;")
	public static Class321 aClass321_53 = null;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)Z")
	public static boolean method8953(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!gs;B)I")
	public static int method8958(@OriginalArg(0) Class6_Sub23_Sub1 arg0) {
		@Pc(15) int local15 = arg0.method2878(2);
		@Pc(31) int local31;
		if (local15 == 0) {
			local31 = 0;
		} else if (local15 == 1) {
			local31 = arg0.method2878(5);
		} else if (local15 == 2) {
			local31 = arg0.method2878(8);
		} else {
			local31 = arg0.method2878(11);
		}
		return local31;
	}
}
