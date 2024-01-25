import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class207 {

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "[I")
	public int[] anIntArray468;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	public int anInt6279 = -1;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	public int anInt6282 = -1;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!co;II)V")
	private void method5210(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6282 = arg0.method4227();
		} else if (arg1 == 2) {
			this.anIntArray468 = new int[arg0.method4220()];
			for (@Pc(32) int local32 = 0; local32 < this.anIntArray468.length; local32++) {
				this.anIntArray468[local32] = arg0.method4227();
			}
		} else if (arg1 == 3) {
			this.anInt6279 = arg0.method4220();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!co;I)V")
	public void method5214(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4220();
			if (local12 == 0) {
				return;
			}
			this.method5210(arg0, local12);
		}
	}
}
