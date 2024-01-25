import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "[Lclient!kd;")
	public Class8_Sub4[] aClass8_Sub4Array1;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Lclient!rga;")
	public Class8_Sub3 aClass8_Sub3_1;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!r;BI)Z")
	public boolean method3932(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass8_Sub4Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass8_Sub4Array1.length; local15++) {
				if (this.aClass8_Sub4Array1[local15].method3788(arg0, arg2) && this.aClass8_Sub3_1.method7626(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
