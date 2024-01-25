import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class41_Sub10 extends Class41 {

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "[Lclient!ufa;")
	public Class41_Sub8[] aClass41_Sub8Array1;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "Lclient!rb;")
	public Class41_Sub2 aClass41_Sub2_1;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!r;IB)Z")
	public boolean method7818(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass41_Sub8Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass41_Sub8Array1.length; local16++) {
				if (this.aClass41_Sub8Array1[local16].method7088(arg2, arg0) && this.aClass41_Sub2_1.method7838(arg1, arg2, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
