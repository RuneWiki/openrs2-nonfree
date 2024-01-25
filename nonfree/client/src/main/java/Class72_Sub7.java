import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class72_Sub7 extends Class72 {

	@OriginalMember(owner = "client!qba", name = "n", descriptor = "[Lclient!eca;")
	public Class72_Sub2[] aClass72_Sub2Array1;

	@OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
	public int anInt6968;

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
	public int anInt6969;

	@OriginalMember(owner = "client!qba", name = "u", descriptor = "I")
	public int anInt6970;

	@OriginalMember(owner = "client!qba", name = "v", descriptor = "Lclient!lb;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBLclient!qa;I)Z")
	public boolean method5848(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass72_Sub2Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass72_Sub2Array1.length; local15++) {
				if (this.aClass72_Sub2Array1[local15].method1794(arg0, arg2) && this.aClass49_1.method7452(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
