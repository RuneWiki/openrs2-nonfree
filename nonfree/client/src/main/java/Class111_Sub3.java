import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class111_Sub3 extends Class111 {

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!ge;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	public int anInt3920;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public int anInt3921;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	public int anInt3923;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "[Lclient!wp;")
	public Class111_Sub8[] aClass111_Sub8Array1;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!za;II)Z")
	public boolean method3061(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass111_Sub8Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass111_Sub8Array1.length; local10++) {
				if (this.aClass111_Sub8Array1[local10].method5889(arg0, arg2) && this.aClass11_1.method5180(arg0, arg1, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
