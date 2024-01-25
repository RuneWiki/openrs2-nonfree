import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class40_Sub5 extends Class40 {

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "[Lclient!pr;")
	public Class40_Sub8[] aClass40_Sub8Array1;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public int anInt4724;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public int anInt4725;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!vs;")
	public Class24 aClass24_1;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	public int anInt4726;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!za;IB)Z")
	public boolean method3812(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass40_Sub8Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass40_Sub8Array1.length; local16++) {
				if (this.aClass40_Sub8Array1[local16].method4367(arg2, arg0) && this.aClass24_1.method5691(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
