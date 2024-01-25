import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class193 {

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "[I")
	public int[] anIntArray397;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	public int anInt5561 = -1;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
	public int anInt5562 = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!daa;I)V")
	public void method4671(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5216();
			if (local5 == 0) {
				return;
			}
			this.method4672(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!daa;IB)V")
	private void method4672(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5562 = arg0.method5199();
		} else if (arg1 == 2) {
			this.anIntArray397 = new int[arg0.method5216()];
			for (@Pc(36) int local36 = 0; local36 < this.anIntArray397.length; local36++) {
				this.anIntArray397[local36] = arg0.method5199();
			}
		} else if (arg1 == 3) {
			this.anInt5561 = arg0.method5216();
		}
	}
}
