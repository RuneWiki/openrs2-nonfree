import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class350 {

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
	public int anInt9684 = 0;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IILclient!sl;)V")
	private void method8301(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg0 == 5) {
			this.anInt9684 = arg1.method4221();
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILclient!sl;)V")
	public void method8302(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4225();
			if (local5 == 0) {
				return;
			}
			this.method8301(local5, arg0);
		}
	}
}
