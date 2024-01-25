import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "[Lclient!mo;")
	public Class36_Sub6[] aClass36_Sub6Array1;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
	public int anInt732;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
	public int anInt733;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!hh;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!pe;BI)Z")
	public boolean method686(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass36_Sub6Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass36_Sub6Array1.length; local16++) {
				if (this.aClass36_Sub6Array1[local16].method3633(arg2, arg0) && this.aClass22_1.method5342(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
