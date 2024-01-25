import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "[Lclient!et;")
	public Class11_Sub4[] aClass11_Sub4Array1;

	@OriginalMember(owner = "client!bca", name = "j", descriptor = "Lclient!vv;")
	public Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!r;IBI)Z")
	public boolean method599(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass11_Sub4Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass11_Sub4Array1.length; local10++) {
				if (this.aClass11_Sub4Array1[local10].method2243(arg2, arg1) && this.aClass11_Sub1_1.method7210(arg1, arg2, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
