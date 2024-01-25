import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	public int anInt1115;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "[Lclient!bd;")
	public Class15_Sub2[] aClass15_Sub2Array1;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
	public int anInt1119;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "Lclient!qh;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBLclient!aa;I)Z")
	public boolean method1110(@OriginalArg(0) int arg0, @OriginalArg(2) Class2 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass15_Sub2Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass15_Sub2Array1.length; local16++) {
				if (this.aClass15_Sub2Array1[local16].method511(arg0, arg2) && this.aClass5_1.method5684(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
