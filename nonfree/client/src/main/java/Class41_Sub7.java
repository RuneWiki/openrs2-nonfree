import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class41_Sub7 extends Class41 {

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
	public int anInt6865;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "[Lclient!tq;")
	public Class41_Sub8[] aClass41_Sub8Array1;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	public int anInt6867;

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
	public int anInt6869;

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "Lclient!vl;")
	public Class30 aClass30_1;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILclient!za;Z)Z")
	public boolean method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2) {
		if (this.aClass41_Sub8Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass41_Sub8Array1.length; local15++) {
				if (this.aClass41_Sub8Array1[local15].method5448(arg0, arg1) && this.aClass30_1.method5717(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
