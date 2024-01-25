import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class55_Sub6 extends Class55 {

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public int anInt8007;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
	public int anInt8009;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "Lclient!cq;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
	public int anInt8011;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "[Lclient!ht;")
	public Class55_Sub3[] aClass55_Sub3Array1;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!oa;II)Z")
	public boolean method6621(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass55_Sub3Array1 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.aClass55_Sub3Array1.length; local12++) {
				if (this.aClass55_Sub3Array1[local12].method3387(arg2, arg0) && this.aClass2_1.method8389(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
