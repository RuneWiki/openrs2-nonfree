import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class119 {

	@OriginalMember(owner = "client!in", name = "d", descriptor = "[I")
	public int[] anIntArray370;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "I")
	public int anInt3655 = -1;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	public int anInt3657 = -1;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IILclient!nn;)V")
	private void method2944(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt3655 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anIntArray370 = new int[arg1.method2502()];
			for (@Pc(30) int local30 = 0; local30 < this.anIntArray370.length; local30++) {
				this.anIntArray370[local30] = arg1.method2485();
			}
			return;
		} else if (arg0 == 3) {
			this.anInt3657 = arg1.method2502();
			return;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!nn;I)V")
	public void method2945(@OriginalArg(0) Class10_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2502();
			if (local13 == 0) {
				return;
			}
			this.method2944(local13, arg0);
		}
	}
}
