import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jka")
public final class Class196 {

	@OriginalMember(owner = "client!jka", name = "d", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!jka", name = "b", descriptor = "I")
	public int anInt5323 = -1;

	@OriginalMember(owner = "client!jka", name = "h", descriptor = "I")
	public int anInt5327 = -1;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(ILclient!fca;)V")
	public void method4507(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method4509(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(BILclient!fca;)V")
	private void method4509(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt5327 = arg1.method4858();
		} else if (arg0 == 2) {
			this.anIntArray344 = new int[arg1.method4888()];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray344.length; local23++) {
				this.anIntArray344[local23] = arg1.method4858();
			}
		} else if (arg0 == 3) {
			this.anInt5323 = arg1.method4888();
		}
	}
}
