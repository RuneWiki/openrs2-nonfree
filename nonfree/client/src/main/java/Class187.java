import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class187 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
	public int anInt5783 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!oe;I)V")
	public void method4558(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2146();
			if (local5 == 0) {
				return;
			}
			this.method4559(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!oe;IB)V")
	private void method4559(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt5783 = arg0.method2130();
		}
	}
}
