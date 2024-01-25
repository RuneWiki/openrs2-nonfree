import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
	public int anInt6388 = 0;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lclient!ia;B)V")
	public void method4900(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1171();
			if (local9 == 0) {
				return;
			}
			this.method4902(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!ia;I)V")
	private void method4902(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt6388 = arg0.method1177();
		}
	}
}
