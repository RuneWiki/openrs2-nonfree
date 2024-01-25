import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class5_Sub5_Sub7 extends Class5_Sub5 {

	@OriginalMember(owner = "client!ffa", name = "z", descriptor = "I")
	public int anInt2591 = 0;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!ofa;)V")
	public void method2198(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5966();
			if (local17 == 0) {
				return;
			}
			this.method2199(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ofa;II)V")
	private void method2199(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt2591 = arg0.method5968();
		}
	}
}
