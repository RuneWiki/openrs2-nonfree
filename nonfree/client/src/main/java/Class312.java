import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class312 {

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "[I")
	public int[] anIntArray625;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	public int anInt8770 = -1;

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
	public int anInt8769 = -1;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!jr;B)V")
	public void method6974(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6019();
			if (local5 == 0) {
				return;
			}
			this.method6977(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!jr;II)V")
	private void method6977(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8769 = arg0.method6044();
		} else if (arg1 == 2) {
			this.anIntArray625 = new int[arg0.method6019()];
			for (@Pc(33) int local33 = 0; local33 < this.anIntArray625.length; local33++) {
				this.anIntArray625[local33] = arg0.method6044();
			}
		} else if (arg1 == 3) {
			this.anInt8770 = arg0.method6019();
		}
	}
}
