import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class73 {

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
	public int anInt1634 = -1;

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
	public int anInt1635 = -1;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILclient!gk;)V")
	public void method1373(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4464();
			if (local9 == 0) {
				return;
			}
			this.method1374(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!gk;BI)V")
	private void method1374(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1634 = arg0.method4518();
		} else if (arg1 == 2) {
			this.anIntArray147 = new int[arg0.method4464()];
			for (@Pc(33) int local33 = 0; local33 < this.anIntArray147.length; local33++) {
				this.anIntArray147[local33] = arg0.method4518();
			}
		} else if (arg1 == 3) {
			this.anInt1635 = arg0.method4464();
		}
	}
}
