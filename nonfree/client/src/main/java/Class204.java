import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class204 {

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
	public int anInt5040 = -1;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
	public int anInt5042 = -1;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILclient!vj;)V")
	private void method4246(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt5040 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anIntArray346 = new int[arg1.method8547()];
			for (@Pc(40) int local40 = 0; local40 < this.anIntArray346.length; local40++) {
				this.anIntArray346[local40] = arg1.method8546();
			}
		} else if (arg0 == 3) {
			this.anInt5042 = arg1.method8547();
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BLclient!vj;)V")
	public void method4249(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8547();
			if (local9 == 0) {
				return;
			}
			this.method4246(local9, arg0);
		}
	}
}
