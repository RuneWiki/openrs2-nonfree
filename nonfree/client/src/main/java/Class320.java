import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class320 {

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "[I")
	public int[] anIntArray652;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
	public int anInt8651 = -1;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
	public int anInt8653 = -1;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!mo;I)V")
	private void method7078(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8651 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anIntArray652 = new int[arg0.method5750()];
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray652.length; local17++) {
				this.anIntArray652[local17] = arg0.method5771();
			}
		} else if (arg1 == 3) {
			this.anInt8653 = arg0.method5750();
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method7079(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5750();
			if (local5 == 0) {
				return;
			}
			this.method7078(arg0, local5);
		}
	}
}
