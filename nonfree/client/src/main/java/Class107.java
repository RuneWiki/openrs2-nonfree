import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class107 {

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
	public int anInt3116 = -1;

	@OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
	public int anInt3118 = -1;

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
	public int anInt3120 = 0;

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
	public int anInt3113 = -1;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IILclient!jc;)V")
	private void method2920(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt3116 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anIntArray169 = new int[arg1.method3030()];
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray169.length; local29++) {
				this.anIntArray169[local29] = arg1.method3018();
			}
		} else if (arg0 == 3) {
			this.anInt3118 = arg1.method3030();
		} else if (arg0 == 4) {
			this.anInt3120 = arg1.method3030();
		} else if (arg0 == 5) {
			this.anInt3113 = arg1.method3018();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method2922(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3030();
			if (local9 == 0) {
				return;
			}
			this.method2920(local9, arg0);
		}
	}
}
