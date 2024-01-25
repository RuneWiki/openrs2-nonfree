import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class32_Sub7 extends Class32 {

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "Lclient!je;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
	public int anInt6246;

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
	public int anInt6247;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "[Lclient!oo;")
	public Class32_Sub4[] aClass32_Sub4Array1;

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
	public int anInt6248;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!fp;BII)Z")
	public boolean method5578(@OriginalArg(0) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass32_Sub4Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass32_Sub4Array1.length; local10++) {
				if (this.aClass32_Sub4Array1[local10].method4290(arg2, arg1) && this.aClass11_1.method5914(arg0, arg1, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
