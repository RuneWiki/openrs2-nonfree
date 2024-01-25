import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class137 {

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	public int anInt3647 = 0;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	public int anInt3649 = 2048;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
	public int anInt3653 = 2048;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
	public int anInt3651 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!fh;)V")
	public void method2889(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5539();
			if (local17 == 0) {
				return;
			}
			this.method2891(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method2891(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3651 = arg0.method5539();
		} else if (arg1 == 2) {
			this.anInt3649 = arg0.method5598();
		} else if (arg1 == 3) {
			this.anInt3653 = arg0.method5598();
		} else if (arg1 == 4) {
			this.anInt3647 = arg0.method5586();
		}
	}
}
