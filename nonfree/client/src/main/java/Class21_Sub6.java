import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class21_Sub6 extends Class21 {

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "[Lclient!rr;")
	public Class21_Sub7[] aClass21_Sub7Array1;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
	public int anInt5552;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "Lclient!lb;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
	public int anInt5556;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
	public int anInt5558;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILclient!za;)Z")
	public boolean method4408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		if (this.aClass21_Sub7Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass21_Sub7Array1.length; local15++) {
				if (this.aClass21_Sub7Array1[local15].method4686(arg1, arg0) && this.aClass3_1.method5282(arg0, arg1, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
