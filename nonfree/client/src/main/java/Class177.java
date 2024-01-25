import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class177 {

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
	public int anInt4546 = -1;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	public int anInt4545 = -1;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ac;I)V")
	private void method3640(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt4545 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anIntArray249 = new int[arg1.method7974()];
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray249.length; local46++) {
				this.anIntArray249[local46] = arg1.method7945();
			}
		} else if (arg0 == 3) {
			this.anInt4546 = arg1.method7974();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ac;)V")
	public void method3641(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7974();
			if (local9 == 0) {
				return;
			}
			this.method3640(local9, arg0);
		}
	}
}
