import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
	public int anInt3971 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!og;)V")
	private void method3013(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 5) {
			this.anInt3971 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!og;)V")
	public void method3015(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method218();
			if (local17 == 0) {
				return;
			}
			this.method3013(local17, arg0);
		}
	}
}
