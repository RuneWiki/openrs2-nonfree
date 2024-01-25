import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class380 {

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "[I")
	public int[] anIntArray929;

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
	public int anInt10536 = -1;

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
	public int anInt10540 = -1;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZLclient!jp;)V")
	private void method9120(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt10540 = arg1.method8593();
		} else if (arg0 == 2) {
			this.anIntArray929 = new int[arg1.method8632()];
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray929.length; local38++) {
				this.anIntArray929[local38] = arg1.method8593();
			}
		} else if (arg0 == 3) {
			this.anInt10536 = arg1.method8632();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLclient!jp;)V")
	public void method9121(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8632();
			if (local9 == 0) {
				return;
			}
			this.method9120(local9, arg0);
		}
	}
}
