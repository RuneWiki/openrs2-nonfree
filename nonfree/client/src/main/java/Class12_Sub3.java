import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class12_Sub3 extends Class12 {

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "Lclient!caa;")
	public Class12_Sub2 aClass12_Sub2_2;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "[Lclient!qh;")
	public Class12_Sub6[] aClass12_Sub6Array1;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!r;III)Z")
	public boolean method2592(@OriginalArg(0) Class162 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass12_Sub6Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass12_Sub6Array1.length; local10++) {
				if (this.aClass12_Sub6Array1[local10].method5742(arg1, arg2) && this.aClass12_Sub2_2.method7500(arg1, arg2, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
