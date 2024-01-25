import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	public int anInt7020;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "[Lclient!mr;")
	public Class5_Sub4[] aClass5_Sub4Array1;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	public int anInt7024;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "Lclient!fl;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	public int anInt7025;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!oa;BII)Z")
	public boolean method5927(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass5_Sub4Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass5_Sub4Array1.length; local16++) {
				if (this.aClass5_Sub4Array1[local16].method5271(arg1, arg2) && this.aClass11_1.method8104(arg2, arg0, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
