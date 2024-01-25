import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class7_Sub8 extends Class7 {

	@OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
	public int anInt9366;

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
	public int anInt9368;

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "Lclient!jt;")
	public Class30 aClass30_1;

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "[Lclient!kn;")
	public Class7_Sub4[] aClass7_Sub4Array1;

	@OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
	public int anInt9370;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IILclient!qa;B)Z")
	public boolean method7762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2) {
		if (this.aClass7_Sub4Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass7_Sub4Array1.length; local15++) {
				if (this.aClass7_Sub4Array1[local15].method4405(arg0, arg1) && this.aClass30_1.method7907(arg2, arg0, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
