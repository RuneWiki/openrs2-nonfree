import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class353 {

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
	public final int anInt10441;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
	public int anInt10442;

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "[I")
	public final int[] anIntArray674;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "[I")
	public final int[] anIntArray673;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V")
	public Class353() {
		Static220.method4248(16);
		this.anInt10441 = Static220.method4247() == 0 ? 1 : Static220.method4248(4) + 1;
		if (Static220.method4247() != 0) {
			Static220.method4248(8);
		}
		Static220.method4248(2);
		if (this.anInt10441 > 1) {
			this.anInt10442 = Static220.method4248(4);
		}
		this.anIntArray674 = new int[this.anInt10441];
		this.anIntArray673 = new int[this.anInt10441];
		for (@Pc(42) int local42 = 0; local42 < this.anInt10441; local42++) {
			Static220.method4248(8);
			this.anIntArray674[local42] = Static220.method4248(8);
			this.anIntArray673[local42] = Static220.method4248(8);
		}
	}
}
