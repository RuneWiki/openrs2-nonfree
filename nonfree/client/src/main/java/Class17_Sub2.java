import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
	public int anInt1284;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!ai;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
	public int anInt1285;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "[Lclient!pf;")
	public Class17_Sub6[] aClass17_Sub6Array1;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	public int anInt1287;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!vm;II)Z")
	public boolean method1055(@OriginalArg(1) Class92 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass17_Sub6Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass17_Sub6Array1.length; local10++) {
				if (this.aClass17_Sub6Array1[local10].method4180(arg1, arg2) && this.aClass2_1.method5414(arg1, arg2, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
