import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class257 {

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "[I")
	public int[] anIntArray490;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
	public int anInt7315 = -1;

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
	public int anInt7319 = -1;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!fh;)V")
	public void method5800(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5539();
			if (local13 == 0) {
				return;
			}
			this.method5801(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBLclient!fh;)V")
	private void method5801(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt7319 = arg1.method5598();
		} else if (arg0 == 2) {
			this.anIntArray490 = new int[arg1.method5539()];
			for (@Pc(35) int local35 = 0; local35 < this.anIntArray490.length; local35++) {
				this.anIntArray490[local35] = arg1.method5598();
			}
		} else if (arg0 == 3) {
			this.anInt7315 = arg1.method5539();
			return;
		}
	}
}
