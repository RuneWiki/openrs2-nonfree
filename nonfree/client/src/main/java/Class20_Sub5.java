import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class20_Sub5 extends Class20 {

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
	public int anInt3903;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "[Lclient!vs;")
	public Class20_Sub8[] aClass20_Sub8Array1;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "Lclient!gg;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
	public int anInt3906;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
	public int anInt3908;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ya;BI)Z")
	public boolean method3083(@OriginalArg(0) int arg0, @OriginalArg(1) Class135 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass20_Sub8Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass20_Sub8Array1.length; local16++) {
				if (this.aClass20_Sub8Array1[local16].method5776(arg0, arg2) && this.aClass8_1.method5878(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
