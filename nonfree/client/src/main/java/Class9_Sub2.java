import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "Lclient!gfa;")
	public Class9_Sub1 aClass9_Sub1_1;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[Lclient!ql;")
	public Class9_Sub9[] aClass9_Sub9Array1;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!r;III)Z")
	public boolean method2655(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass9_Sub9Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass9_Sub9Array1.length; local10++) {
				if (this.aClass9_Sub9Array1[local10].method6092(arg2, arg1) && this.aClass9_Sub1_1.method7474(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
