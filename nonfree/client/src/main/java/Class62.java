import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class62 {

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	public int anInt2056 = -1;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	public int anInt2058 = -1;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLclient!at;II)V")
	private void method1926(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2056 = arg0.method2161();
		} else if (arg2 == 2) {
			this.anIntArray161 = new int[arg0.method2132()];
			for (@Pc(36) int local36 = 0; local36 < this.anIntArray161.length; local36++) {
				this.anIntArray161[local36] = arg0.method2161();
			}
		} else if (arg2 == 3) {
			this.anInt2058 = arg0.method2132();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!at;I)V")
	public void method1930(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2132();
			if (local9 == 0) {
				return;
			}
			this.method1926(arg1, arg0, local9);
		}
	}
}
