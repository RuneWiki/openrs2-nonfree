import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class153 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	public int anInt4890 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!cg;I)V")
	private void method3814(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt4890 = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLclient!cg;)V")
	public void method3817(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2690();
			if (local12 == 0) {
				return;
			}
			this.method3814(arg0, local12);
		}
	}
}
