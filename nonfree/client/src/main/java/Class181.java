import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class181 {

	@OriginalMember(owner = "client!om", name = "b", descriptor = "I")
	public int anInt5160 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!md;)V")
	public void method4166(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3737();
			if (local9 == 0) {
				return;
			}
			this.method4168(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!md;II)V")
	private void method4168(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt5160 = arg0.method3711();
		}
	}
}
