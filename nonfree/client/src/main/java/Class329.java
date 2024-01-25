import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class329 {

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
	public int anInt9141 = -1;

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
	public int anInt9140 = -1;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!ofa;I)V")
	public void method7887(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5966();
			if (local5 == 0) {
				return;
			}
			this.method7888(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZILclient!ofa;)V")
	private void method7888(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt9140 = arg1.method5968();
		} else if (arg0 == 2) {
			this.anIntArray502 = new int[arg1.method5966()];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray502.length; local19++) {
				this.anIntArray502[local19] = arg1.method5968();
			}
		} else if (arg0 == 3) {
			this.anInt9141 = arg1.method5966();
		}
	}
}
