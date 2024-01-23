import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class147 {

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
	public int anInt4982;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public int anInt4983;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
	public int anInt4988;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!qm;I)V")
	public void method3757(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2199();
			if (local17 == 0) {
				return;
			}
			this.method3759(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBLclient!qm;)V")
	private void method3759(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt4983 = arg1.method2244();
			this.anInt4982 = arg1.method2199();
			this.anInt4988 = arg1.method2199();
		}
	}
}
