import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class22_Sub8 extends Class22 {

	@OriginalMember(owner = "client!to", name = "i", descriptor = "I")
	public int anInt6043;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "Lclient!kj;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "[Lclient!bm;")
	public Class22_Sub1[] aClass22_Sub1Array1;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "I")
	public int anInt6046;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "I")
	public int anInt6047;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IZLclient!km;I)Z")
	public boolean method5238(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass22_Sub1Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass22_Sub1Array1.length; local15++) {
				if (this.aClass22_Sub1Array1[local15].method625(arg2, arg0) && this.aClass12_1.method5450(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
