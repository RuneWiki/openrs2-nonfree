import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Lclient!a;")
	public Class1 aClass1_1;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "[Lclient!qt;")
	public Class7_Sub6[] aClass7_Sub6Array1;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	public int anInt4257;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
	public int anInt4258;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public int anInt4260;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!oj;ZII)Z")
	public boolean method3785(@OriginalArg(0) Class48 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass7_Sub6Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass7_Sub6Array1.length; local15++) {
				if (this.aClass7_Sub6Array1[local15].method4848(arg1, arg2) && this.aClass1_1.method6016(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
