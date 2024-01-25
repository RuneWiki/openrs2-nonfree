import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!in", name = "i", descriptor = "[Lclient!pr;")
	public Class2_Sub7[] aClass2_Sub7Array1;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "I")
	public int anInt4360;

	@OriginalMember(owner = "client!in", name = "k", descriptor = "I")
	public int anInt4361;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	public int anInt4365;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "Lclient!co;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!qa;III)Z")
	public boolean method3803(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass2_Sub7Array1 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.aClass2_Sub7Array1.length; local13++) {
				if (this.aClass2_Sub7Array1[local13].method5752(arg1, arg2) && this.aClass47_1.method7157(arg2, arg0, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
