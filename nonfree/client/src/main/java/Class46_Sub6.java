import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class46_Sub6 extends Class46 {

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
	public int anInt6349;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
	public int anInt6351;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "Lclient!oe;")
	public Class20 aClass20_1;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "[Lclient!cf;")
	public Class46_Sub1[] aClass46_Sub1Array1;

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
	public int anInt6354;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZILclient!qa;)Z")
	public boolean method5762(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4 arg2) {
		if (this.aClass46_Sub1Array1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aClass46_Sub1Array1.length; local20++) {
				if (this.aClass46_Sub1Array1[local20].method1482(arg0, arg1) && this.aClass20_1.method8037(arg2, arg0, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
