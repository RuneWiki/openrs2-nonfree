import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class28_Sub5 extends Class28 {

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	public int anInt5376;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "I")
	public int anInt5377;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	public int anInt5379;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "Lclient!bm;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "[Lclient!kk;")
	public Class28_Sub4[] aClass28_Sub4Array1;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!za;IBI)Z")
	public boolean method4281(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass28_Sub4Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass28_Sub4Array1.length; local10++) {
				if (this.aClass28_Sub4Array1[local10].method3043(arg1, arg2) && this.aClass11_1.method6209(arg1, arg2, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
