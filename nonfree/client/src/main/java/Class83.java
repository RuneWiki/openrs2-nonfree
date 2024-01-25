import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class83 {

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	public int anInt2524 = -1;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	public int anInt2530 = -1;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!fb;I)V")
	public void method2060(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method3643();
			if (local13 == 0) {
				return;
			}
			this.method2061(local13, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILclient!fb;B)V")
	private void method2061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4 arg2) {
		if (arg0 == 1) {
			this.anInt2530 = arg2.method3649();
		} else if (arg0 == 2) {
			this.anIntArray150 = new int[arg2.method3643()];
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray150.length; local38++) {
				this.anIntArray150[local38] = arg2.method3649();
			}
		} else if (arg0 == 3) {
			this.anInt2524 = arg2.method3643();
			return;
		}
	}
}
