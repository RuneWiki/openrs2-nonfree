import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class63_Sub3 extends Class63 {

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "Lclient!fs;")
	public Class25 aClass25_1;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
	public int anInt2768;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
	public int anInt2771;

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
	public int anInt2772;

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "[Lclient!ue;")
	public Class63_Sub7[] aClass63_Sub7Array1;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILclient!en;B)Z")
	public boolean method2592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2) {
		if (this.aClass63_Sub7Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass63_Sub7Array1.length; local10++) {
				if (this.aClass63_Sub7Array1[local10].method5374(arg0, arg1) && this.aClass25_1.method5586(arg0, arg1, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
