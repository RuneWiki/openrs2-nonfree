import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "[Lclient!lc;")
	public Class6_Sub5[] aClass6_Sub5Array1;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	public int anInt87;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Lclient!to;")
	public Class7 aClass7_1;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	public int anInt92;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!qa;IBI)Z")
	public boolean method40(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass6_Sub5Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass6_Sub5Array1.length; local15++) {
				if (this.aClass6_Sub5Array1[local15].method3348(arg2, arg1) && this.aClass7_1.method5270(arg0, arg1, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
