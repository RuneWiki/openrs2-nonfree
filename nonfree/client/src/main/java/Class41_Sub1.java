import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
	public int anInt924;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
	public int anInt925;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "[Lclient!ro;")
	public Class41_Sub5[] aClass41_Sub5Array1;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "Lclient!hm;")
	public Class25 aClass25_1;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
	public int anInt927;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLclient!tq;I)Z")
	public boolean method723(@OriginalArg(0) int arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass41_Sub5Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass41_Sub5Array1.length; local15++) {
				if (this.aClass41_Sub5Array1[local15].method4595(arg0, arg2) && this.aClass25_1.method5234(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
