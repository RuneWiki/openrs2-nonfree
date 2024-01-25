import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class99 {

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "[I")
	public int[] anIntArray265;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
	public int anInt3169 = -1;

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public int anInt3170 = -1;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BILclient!dg;)V")
	public void method2970(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method4421();
			if (local9 == 0) {
				return;
			}
			this.method2971(arg0, local9, arg1);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILclient!dg;B)V")
	private void method2971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub10 arg2) {
		if (arg1 == 1) {
			this.anInt3169 = arg2.method4464();
		} else if (arg1 == 2) {
			this.anIntArray265 = new int[arg2.method4421()];
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray265.length; local27++) {
				this.anIntArray265[local27] = arg2.method4464();
			}
			return;
		} else if (arg1 == 3) {
			this.anInt3170 = arg2.method4421();
			return;
		}
	}
}
