import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class32_Sub4 extends Class32 {

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "[Lclient!uh;")
	public Class32_Sub8[] aClass32_Sub8Array1;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
	public int anInt4088;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	public int anInt4089;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "Lclient!ac;")
	public Class4 aClass4_1;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
	public int anInt4091;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIILclient!ea;)Z")
	public boolean method3780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class55 arg2) {
		if (this.aClass32_Sub8Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass32_Sub8Array1.length; local10++) {
				if (this.aClass32_Sub8Array1[local10].method5580(arg1, arg0) && this.aClass4_1.method5900(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
