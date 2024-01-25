import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	public int anInt4583;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!ij;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
	public int anInt4585;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
	public int anInt4587;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "[Lclient!ii;")
	public Class8_Sub4[] aClass8_Sub4Array1;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!ya;II)Z")
	public boolean method3694(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass8_Sub4Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass8_Sub4Array1.length; local15++) {
				if (this.aClass8_Sub4Array1[local15].method2655(arg2, arg1) && this.aClass3_1.method5140(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
