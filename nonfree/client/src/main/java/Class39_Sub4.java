import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class39_Sub4 extends Class39 {

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "Lclient!co;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
	public int anInt3247;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "[Lclient!nh;")
	public Class39_Sub7[] aClass39_Sub7Array1;

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
	public int anInt3248;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
	public int anInt3249;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIBLclient!qa;)Z")
	public boolean method2777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class109 arg2) {
		if (this.aClass39_Sub7Array1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.aClass39_Sub7Array1.length; local18++) {
				if (this.aClass39_Sub7Array1[local18].method3892(arg1, arg0) && this.aClass26_1.method5517(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
