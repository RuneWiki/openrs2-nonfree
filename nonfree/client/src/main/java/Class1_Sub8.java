import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!um", name = "k", descriptor = "I")
	public int anInt6227;

	@OriginalMember(owner = "client!um", name = "o", descriptor = "I")
	public int anInt6231;

	@OriginalMember(owner = "client!um", name = "r", descriptor = "I")
	public int anInt6233;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "[Lclient!cd;")
	public Class1_Sub3[] aClass1_Sub3Array1;

	@OriginalMember(owner = "client!um", name = "v", descriptor = "Lclient!hm;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILclient!e;)Z")
	public boolean method5566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		if (this.aClass1_Sub3Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass1_Sub3Array1.length; local16++) {
				if (this.aClass1_Sub3Array1[local16].method873(arg0, arg1) && this.aClass10_1.method5336(arg0, arg1, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
