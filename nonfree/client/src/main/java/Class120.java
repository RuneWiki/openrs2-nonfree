import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class120 {

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
	public int anInt3621 = -1;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
	public int anInt3622 = -1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!ji;)V")
	public void method3176(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6069();
			if (local5 == 0) {
				return;
			}
			this.method3178(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!ji;B)V")
	private void method3178(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt3622 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anIntArray210 = new int[arg1.method6069()];
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray210.length; local34++) {
				this.anIntArray210[local34] = arg1.method6003();
			}
		} else if (arg0 == 3) {
			this.anInt3621 = arg1.method6069();
		}
	}
}
