import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!og", name = "g", descriptor = "[Lclient!pba;")
	public Class6_Sub6[] aClass6_Sub6Array1;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Lclient!lo;")
	public Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!r;III)Z")
	public boolean method5655(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass6_Sub6Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass6_Sub6Array1.length; local15++) {
				if (this.aClass6_Sub6Array1[local15].method5802(arg2, arg1) && this.aClass6_Sub1_1.method7331(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
