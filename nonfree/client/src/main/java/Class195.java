import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class195 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "[I")
	public int[] anIntArray751;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
	public int anInt5904 = -1;

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
	public int anInt5911 = -1;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!ap;B)V")
	public void method5006(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub3 arg1) {
		while (true) {
			@Pc(16) int local16 = arg1.method2772();
			if (local16 == 0) {
				return;
			}
			this.method5009(arg0, arg1, local16);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILclient!ap;I)V")
	private void method5009(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt5904 = arg1.method2764();
		} else if (arg2 == 2) {
			this.anIntArray751 = new int[arg1.method2772()];
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray751.length; local25++) {
				this.anIntArray751[local25] = arg1.method2764();
			}
		} else if (arg2 == 3) {
			this.anInt5911 = arg1.method2772();
		}
	}
}
