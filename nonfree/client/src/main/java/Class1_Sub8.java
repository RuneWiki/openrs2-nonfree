import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "Lclient!ub;")
	public Class1_Sub4 aClass1_Sub4_2;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "[Lclient!mj;")
	public Class1_Sub9[] aClass1_Sub9Array1;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!r;III)Z")
	public boolean method5266(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass1_Sub9Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass1_Sub9Array1.length; local16++) {
				if (this.aClass1_Sub9Array1[local16].method5357(arg2, arg1) && this.aClass1_Sub4_2.method8116(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
