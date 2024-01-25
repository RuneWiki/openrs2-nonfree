import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class23_Sub5 extends Class23 {

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "[Lclient!st;")
	public Class23_Sub6[] aClass23_Sub6Array1;

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
	public int anInt5279;

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "Lclient!a;")
	public Class1 aClass1_1;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
	public int anInt5281;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
	public int anInt5282;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIILclient!qa;)Z")
	public boolean method4354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		if (this.aClass23_Sub6Array1 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.aClass23_Sub6Array1.length; local19++) {
				if (this.aClass23_Sub6Array1[local19].method5327(arg1, arg0) && this.aClass1_1.method6245(arg0, arg1, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
