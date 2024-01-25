import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class302 {

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
	public int[] anIntArray481;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	public int anInt8555 = -1;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public int anInt8552 = -1;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!mc;)V")
	private void method7295(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (arg0 == 1) {
			this.anInt8555 = arg1.method7860();
		} else if (arg0 == 2) {
			this.anIntArray481 = new int[arg1.method7816()];
			for (@Pc(30) int local30 = 0; local30 < this.anIntArray481.length; local30++) {
				this.anIntArray481[local30] = arg1.method7860();
			}
		} else if (arg0 == 3) {
			this.anInt8552 = arg1.method7816();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!mc;B)V")
	public void method7298(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7816();
			if (local3 == 0) {
				return;
			}
			this.method7295(local3, arg0);
		}
	}
}
