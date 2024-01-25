import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7 {

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public int anInt141 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!jg;I)V")
	public void method133(@OriginalArg(0) Class14_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2548();
			if (local5 == 0) {
				return;
			}
			this.method135(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!jg;)V")
	private void method135(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub4 arg1) {
		if (arg0 == 5) {
			this.anInt141 = arg1.method2498();
		}
	}
}
