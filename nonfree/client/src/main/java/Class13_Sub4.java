import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "[Lclient!vk;")
	public Class13_Sub8[] aClass13_Sub8Array1;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Lclient!er;")
	public Class20 aClass20_1;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	public int anInt4197;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	public int anInt4198;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
	public int anInt4202;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!qa;II)Z")
	public boolean method3383(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass13_Sub8Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass13_Sub8Array1.length; local10++) {
				if (this.aClass13_Sub8Array1[local10].method5415(arg2, arg0) && this.aClass20_1.method5112(arg2, arg0, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
