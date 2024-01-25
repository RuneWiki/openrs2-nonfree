import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class4_Sub1_Sub19 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
	public int anInt5604 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!tq;ZI)V")
	private void method4750(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt5604 = arg0.method2404();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!tq;B)V")
	public void method4753(@OriginalArg(0) Class4_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2380();
			if (local5 == 0) {
				return;
			}
			this.method4750(arg0, local5);
		}
	}
}
