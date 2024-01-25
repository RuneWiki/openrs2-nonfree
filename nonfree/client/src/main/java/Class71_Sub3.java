import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class71_Sub3 extends Class71 {

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	public int anInt5028;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	public int anInt5029;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "[Lclient!wc;")
	public Class71_Sub7[] aClass71_Sub7Array1;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
	public int anInt5032;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "Lclient!ee;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIILclient!qa;)Z")
	public boolean method4261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		if (this.aClass71_Sub7Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass71_Sub7Array1.length; local10++) {
				if (this.aClass71_Sub7Array1[local10].method6175(arg0, arg1) && this.aClass11_1.method6308(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
