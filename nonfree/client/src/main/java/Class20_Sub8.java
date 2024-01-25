import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class20_Sub8 extends Class20 {

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "[Lclient!bc;")
	public Class20_Sub3[] aClass20_Sub3Array1;

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "Lclient!ir;")
	public Class20_Sub2 aClass20_Sub2_1;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!r;IZI)Z")
	public boolean method6356(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass20_Sub3Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass20_Sub3Array1.length; local10++) {
				if (this.aClass20_Sub3Array1[local10].method794(arg2, arg1) && this.aClass20_Sub2_1.method7255(arg0, arg1, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
