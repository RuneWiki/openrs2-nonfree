import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
	public int anInt735 = 0;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BLclient!vj;)V")
	public void method586(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8547();
			if (local9 == 0) {
				return;
			}
			this.method589(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BLclient!vj;I)V")
	private void method589(@OriginalArg(1) Class2_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt735 = arg0.method8546();
		}
	}
}
