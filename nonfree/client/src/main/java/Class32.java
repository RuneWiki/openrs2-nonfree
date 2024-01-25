import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class32 {

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "[I")
	public int[] anIntArray53;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
	public int anInt893 = -1;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public int anInt894 = -1;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZLclient!dt;)V")
	private void method798(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt894 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anIntArray53 = new int[arg1.method7954()];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray53.length; local21++) {
				this.anIntArray53[local21] = arg1.method7951();
			}
		} else if (arg0 == 3) {
			this.anInt893 = arg1.method7954();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!dt;)V")
	public void method799(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7954();
			if (local15 == 0) {
				return;
			}
			this.method798(local15, arg0);
		}
	}
}
