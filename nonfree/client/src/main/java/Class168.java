import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class168 {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "[I")
	public int[] anIntArray514;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
	public int anInt4957 = -1;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
	public int anInt4962 = -1;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!ge;)V")
	public void method4294(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3922();
			if (local9 == 0) {
				return;
			}
			this.method4298(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!ge;IB)V")
	private void method4298(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4962 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anIntArray514 = new int[arg0.method3922()];
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray514.length; local46++) {
				this.anIntArray514[local46] = arg0.method3967();
			}
		} else if (arg1 == 3) {
			this.anInt4957 = arg0.method3922();
			return;
		}
	}
}
