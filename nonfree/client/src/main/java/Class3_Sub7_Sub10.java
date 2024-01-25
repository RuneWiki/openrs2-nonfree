import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class3_Sub7_Sub10 extends Class3_Sub7 {

	@OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
	public int anInt4151 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!rp;)V")
	public void method3857(@OriginalArg(1) Class3_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2739();
			if (local5 == 0) {
				return;
			}
			this.method3859(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!rp;IB)V")
	private void method3859(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt4151 = arg0.method2767();
		}
	}
}
