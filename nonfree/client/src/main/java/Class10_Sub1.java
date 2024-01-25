import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
	public int anInt68;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public int anInt69;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
	public int anInt70;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "Lclient!rr;")
	public Class67 aClass67_1;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "[Lclient!vf;")
	public Class10_Sub8[] aClass10_Sub8Array1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILclient!uo;Z)Z")
	public boolean method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class129 arg2) {
		if (this.aClass10_Sub8Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass10_Sub8Array1.length; local10++) {
				if (this.aClass10_Sub8Array1[local10].method5454(arg0, arg1) && this.aClass67_1.method5400(arg1, arg2, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
