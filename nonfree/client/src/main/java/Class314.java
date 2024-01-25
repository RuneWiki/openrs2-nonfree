import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class314 {

	@OriginalMember(owner = "client!te", name = "f", descriptor = "[I")
	public int[] anIntArray522;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	public int anInt8800 = -1;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public int anInt8801 = -1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ie;II)V")
	private void method6872(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8800 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anIntArray522 = new int[arg0.method6814()];
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray522.length; local34++) {
				this.anIntArray522[local34] = arg0.method6811();
			}
		} else if (arg1 == 3) {
			this.anInt8801 = arg0.method6814();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ie;Z)V")
	public void method6873(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6814();
			if (local5 == 0) {
				return;
			}
			this.method6872(arg0, local5);
		}
	}
}
