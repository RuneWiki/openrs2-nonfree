import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Lclient!or;")
	public Class31 aClass31_1;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "[Lclient!ju;")
	public Class4_Sub5[] aClass4_Sub5Array1;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
	public int anInt194;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ya;BII)Z")
	public boolean method165(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass4_Sub5Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass4_Sub5Array1.length; local15++) {
				if (this.aClass4_Sub5Array1[local15].method3036(arg1, arg2) && this.aClass31_1.method5968(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
