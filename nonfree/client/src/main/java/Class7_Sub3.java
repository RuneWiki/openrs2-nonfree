import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	public int anInt1439;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "[Lclient!kd;")
	public Class7_Sub6[] aClass7_Sub6Array1;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	public int anInt1441;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	public int anInt1442;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!nc;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILclient!ii;)Z")
	public boolean method1192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class105 arg2) {
		if (this.aClass7_Sub6Array1 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.aClass7_Sub6Array1.length; local17++) {
				if (this.aClass7_Sub6Array1[local17].method2616(arg0, arg1) && this.aClass10_1.method5826(arg0, arg1, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
