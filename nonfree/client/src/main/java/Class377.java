import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class377 {

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "[I")
	public int[] anIntArray579;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
	public int anInt10116 = -1;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
	public int anInt10115 = -1;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!rv;I)V")
	private void method8430(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10116 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anIntArray579 = new int[arg0.method3642()];
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray579.length; local34++) {
				this.anIntArray579[local34] = arg0.method3698();
			}
		} else if (arg1 == 3) {
			this.anInt10115 = arg0.method3642();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!rv;)V")
	public void method8432(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3642();
			if (local11 == 0) {
				return;
			}
			this.method8430(arg0, local11);
		}
	}
}
