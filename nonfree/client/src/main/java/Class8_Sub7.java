import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class8_Sub7 extends Class8 {

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "[Lclient!aj;")
	public Class8_Sub2[] aClass8_Sub2Array1;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	public int anInt5409;

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "Lclient!km;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
	public int anInt5411;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
	public int anInt5412;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZLclient!tj;I)Z")
	public boolean method4550(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass8_Sub2Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass8_Sub2Array1.length; local15++) {
				if (this.aClass8_Sub2Array1[local15].method172(arg0, arg2) && this.aClass5_1.method5330(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
