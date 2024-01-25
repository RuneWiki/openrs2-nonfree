import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class102_Sub2 extends Class102 {

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
	public int anInt4821;

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
	public int anInt4822;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	public int anInt4823;

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "[Lclient!qn;")
	public Class102_Sub5[] aClass102_Sub5Array1;

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "Lclient!bo;")
	public Class29 aClass29_1;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!oa;III)Z")
	public boolean method4138(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass102_Sub5Array1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.aClass102_Sub5Array1.length; local18++) {
				if (this.aClass102_Sub5Array1[local18].method6173(arg2, arg1) && this.aClass29_1.method7542(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
