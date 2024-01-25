import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class171 {

	@OriginalMember(owner = "client!jea", name = "g", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
	public int anInt5098 = -1;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
	public int anInt5101 = -1;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IILclient!dc;)V")
	private void method4386(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt5101 = arg1.method5610();
		} else if (arg0 == 2) {
			this.anIntArray279 = new int[arg1.method5633()];
			for (@Pc(31) int local31 = 0; local31 < this.anIntArray279.length; local31++) {
				this.anIntArray279[local31] = arg1.method5610();
			}
		} else if (arg0 == 3) {
			this.anInt5098 = arg1.method5633();
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!dc;)V")
	public void method4388(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5633();
			if (local9 == 0) {
				return;
			}
			this.method4386(local9, arg0);
		}
	}
}
