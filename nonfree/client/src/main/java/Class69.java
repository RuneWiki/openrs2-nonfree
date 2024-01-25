import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class69 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	public int anInt1460 = -1;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public int anInt1459 = -1;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ee;Z)V")
	private void method1394(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt1459 = arg1.method8631();
		} else if (arg0 == 2) {
			this.anIntArray114 = new int[arg1.method8645()];
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray114.length; local26++) {
				this.anIntArray114[local26] = arg1.method8631();
			}
			return;
		} else if (arg0 == 3) {
			this.anInt1460 = arg1.method8645();
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ee;)V")
	public void method1395(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8645();
			if (local5 == 0) {
				return;
			}
			this.method1394(local5, arg0);
		}
	}
}
