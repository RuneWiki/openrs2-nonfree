import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class74 {

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt2536 = -1;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public int anInt2535 = -1;

	static {
		new Class159(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!lf;)V")
	public void method2234(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method3440();
			if (local5 == 0) {
				return;
			}
			this.method2238(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILclient!lf;)V")
	private void method2238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub11 arg2) {
		if (arg1 == 1) {
			this.anInt2536 = arg2.method3401();
		} else if (arg1 == 2) {
			this.anIntArray223 = new int[arg2.method3440()];
			for (@Pc(40) int local40 = 0; local40 < this.anIntArray223.length; local40++) {
				this.anIntArray223[local40] = arg2.method3401();
			}
		} else if (arg1 == 3) {
			this.anInt2535 = arg2.method3440();
			return;
		}
	}
}
