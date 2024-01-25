import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class123 {

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
	public int anInt3465 = 0;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILclient!co;)V")
	public void method3053(@OriginalArg(1) Class5_Sub3 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method4220();
			if (local16 == 0) {
				return;
			}
			this.method3055(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILclient!co;I)V")
	private void method3055(@OriginalArg(1) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt3465 = arg0.method4227();
		}
	}
}
