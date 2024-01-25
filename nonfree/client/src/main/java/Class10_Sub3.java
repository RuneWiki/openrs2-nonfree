import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
	public int anInt1478;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
	public int anInt1479;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!uq;")
	public Class1 aClass1_1;

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "[Lclient!r;")
	public Class10_Sub7[] aClass10_Sub7Array1;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
	public int anInt1482;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILclient!vc;I)Z")
	public boolean method1234(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass10_Sub7Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass10_Sub7Array1.length; local15++) {
				if (this.aClass10_Sub7Array1[local15].method4346(arg0, arg2) && this.aClass1_1.method5642(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
