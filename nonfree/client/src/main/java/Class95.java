import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class95 {

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	public int anInt3096 = -1;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
	public int anInt3097 = -1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!np;B)V")
	private void method2789(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt3097 = arg1.method5198();
		} else if (arg0 == 2) {
			this.anIntArray143 = new int[arg1.method5175()];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray143.length; local21++) {
				this.anIntArray143[local21] = arg1.method5198();
			}
		} else if (arg0 == 3) {
			this.anInt3096 = arg1.method5175();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!np;I)V")
	public void method2791(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5175();
			if (local5 == 0) {
				return;
			}
			this.method2789(local5, arg0);
		}
	}
}
