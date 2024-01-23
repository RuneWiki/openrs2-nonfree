import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class32 {

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "[I")
	public int[] anIntArray106;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
	public int anInt1148 = -1;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	public int anInt1155 = -1;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!im;III)V")
	private void method879(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt1148 = arg0.method2652();
		} else if (arg2 == 2) {
			this.anIntArray106 = new int[arg0.method2655()];
			for (@Pc(31) int local31 = 0; local31 < this.anIntArray106.length; local31++) {
				this.anIntArray106[local31] = arg0.method2652();
			}
		} else if (arg2 == 3) {
			this.anInt1155 = arg0.method2655();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!im;I)V")
	public void method881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method2655();
			if (local13 == 0) {
				return;
			}
			this.method879(arg1, arg0, local13);
		}
	}
}
