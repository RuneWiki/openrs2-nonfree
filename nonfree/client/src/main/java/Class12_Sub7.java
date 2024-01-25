import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class12_Sub7 extends Class12 {

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
	public int anInt4979;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "Lclient!in;")
	public Class28 aClass28_1;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
	public int anInt4980;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "[Lclient!kt;")
	public Class12_Sub5[] aClass12_Sub5Array1;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
	public int anInt4981;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!np;IZ)Z")
	public boolean method4491(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass12_Sub5Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass12_Sub5Array1.length; local16++) {
				if (this.aClass12_Sub5Array1[local16].method3067(arg0, arg2) && this.aClass28_1.method5408(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
