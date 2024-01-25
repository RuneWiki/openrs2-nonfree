import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class176 {

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
	public int anInt4952;

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
	public int anInt4953;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
	public int anInt4954;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!sl;ZI)V")
	private void method4467(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4954 = arg0.method4221();
			this.anInt4953 = arg0.method4225();
			this.anInt4952 = arg0.method4225();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!sl;)V")
	public void method4468(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4225();
			if (local9 == 0) {
				return;
			}
			this.method4467(arg0, local9);
		}
	}
}
