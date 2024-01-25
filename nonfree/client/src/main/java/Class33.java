import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class33 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public int[] anIntArray61;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public int anInt725 = -1;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	public int anInt731 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!vt;)V")
	public void method583(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5732();
			if (local5 == 0) {
				return;
			}
			this.method586(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!vt;BI)V")
	private void method586(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt731 = arg0.method5753();
		} else if (arg1 == 2) {
			this.anIntArray61 = new int[arg0.method5732()];
			for (@Pc(41) int local41 = 0; local41 < this.anIntArray61.length; local41++) {
				this.anIntArray61[local41] = arg0.method5753();
			}
		} else if (arg1 == 3) {
			this.anInt725 = arg0.method5732();
		}
	}
}
