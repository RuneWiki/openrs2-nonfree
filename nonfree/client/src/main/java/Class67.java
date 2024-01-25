import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class67 {

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "[I")
	public int[] anIntArray181;

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public int anInt2073 = -1;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
	public int anInt2075 = -1;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!wn;I)V")
	private void method1838(@OriginalArg(1) Class4_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2073 = arg0.method4560();
		} else if (arg1 == 2) {
			this.anIntArray181 = new int[arg0.method4614()];
			for (@Pc(36) int local36 = 0; local36 < this.anIntArray181.length; local36++) {
				this.anIntArray181[local36] = arg0.method4560();
			}
		} else if (arg1 == 3) {
			this.anInt2075 = arg0.method4614();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!wn;I)V")
	public void method1843(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4614();
			if (local5 == 0) {
				return;
			}
			this.method1838(arg0, local5);
		}
	}
}
