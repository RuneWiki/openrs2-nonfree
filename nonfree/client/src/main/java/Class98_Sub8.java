import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class98_Sub8 extends Class98 {

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "[Lclient!po;")
	public Class98_Sub5[] aClass98_Sub5Array1;

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
	public int anInt9631;

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "Lclient!nt;")
	public Class4 aClass4_1;

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
	public int anInt9634;

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
	public int anInt9635;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IILclient!oa;I)Z")
	public boolean method7858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2) {
		if (this.aClass98_Sub5Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass98_Sub5Array1.length; local15++) {
				if (this.aClass98_Sub5Array1[local15].method5878(arg1, arg0) && this.aClass4_1.method7784(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
