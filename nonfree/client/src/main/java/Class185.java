import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class185 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
	public final int anInt5672;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public int anInt5673;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "[I")
	public final int[] anIntArray721;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "[I")
	public final int[] anIntArray720;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class185() {
		Static181.method3325(16);
		this.anInt5672 = Static181.method3320() == 0 ? 1 : Static181.method3325(4) + 1;
		if (Static181.method3320() != 0) {
			Static181.method3325(8);
		}
		Static181.method3325(2);
		if (this.anInt5672 > 1) {
			this.anInt5673 = Static181.method3325(4);
		}
		this.anIntArray721 = new int[this.anInt5672];
		this.anIntArray720 = new int[this.anInt5672];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5672; local42++) {
			Static181.method3325(8);
			this.anIntArray721[local42] = Static181.method3325(8);
			this.anIntArray720[local42] = Static181.method3325(8);
		}
	}
}
