import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
	public int anInt237 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!fj;BI)V")
	private void method232(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt237 = arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!fj;)V")
	public void method233(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2771();
			if (local12 == 0) {
				return;
			}
			this.method232(arg0, local12);
		}
	}
}
