import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class88_Sub2 extends Class88 {

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "[Lclient!wg;")
	public Class88_Sub8[] aClass88_Sub8Array1;

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
	public int anInt2813;

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
	public int anInt2814;

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Lclient!ps;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
	public int anInt2816;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIILclient!za;)Z")
	public boolean method2280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class200 arg2) {
		if (this.aClass88_Sub8Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass88_Sub8Array1.length; local10++) {
				if (this.aClass88_Sub8Array1[local10].method5922(arg0, arg1) && this.aClass2_1.method6019(arg2, arg0, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
