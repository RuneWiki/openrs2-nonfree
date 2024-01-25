import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class99 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
	public int anInt2751 = -1;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public int anInt2754 = -1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILclient!nj;)V")
	private void method2347(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt2754 = arg1.method4083();
		} else if (arg0 == 2) {
			this.anIntArray146 = new int[arg1.method4096()];
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray146.length; local24++) {
				this.anIntArray146[local24] = arg1.method4083();
			}
		} else if (arg0 == 3) {
			this.anInt2751 = arg1.method4096();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!nj;)V")
	public void method2349(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4096();
			if (local9 == 0) {
				return;
			}
			this.method2347(local9, arg0);
		}
	}
}
