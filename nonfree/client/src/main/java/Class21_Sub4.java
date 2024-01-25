import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class21_Sub4 extends Class21 {

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "Lclient!vj;")
	public Class21_Sub1 aClass21_Sub1_2;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "[Lclient!j;")
	public Class21_Sub7[] aClass21_Sub7Array1;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILclient!r;I)Z")
	public boolean method2190(@OriginalArg(0) int arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass21_Sub7Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass21_Sub7Array1.length; local10++) {
				if (this.aClass21_Sub7Array1[local10].method3753(arg0, arg2) && this.aClass21_Sub1_2.method8222(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
