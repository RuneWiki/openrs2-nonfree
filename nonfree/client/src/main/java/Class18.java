import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class18 {

	@OriginalMember(owner = "client!av", name = "f", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "I")
	public int anInt401 = -1;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "I")
	public int anInt402 = -1;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method314(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3111();
			if (local5 == 0) {
				return;
			}
			this.method315(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IBLclient!ha;)V")
	private void method315(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt402 = arg1.method3108();
		} else if (arg0 == 2) {
			this.anIntArray29 = new int[arg1.method3111()];
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray29.length; local27++) {
				this.anIntArray29[local27] = arg1.method3108();
			}
		} else if (arg0 == 3) {
			this.anInt401 = arg1.method3111();
		}
	}
}
