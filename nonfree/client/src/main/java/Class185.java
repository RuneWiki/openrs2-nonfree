import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class185 {

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	public final int anInt4442;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
	public int anInt4441;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "[I")
	public final int[] anIntArray338;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "[I")
	public final int[] anIntArray339;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	public Class185() {
		Static230.method3367(16);
		this.anInt4442 = Static230.method3368() == 0 ? 1 : Static230.method3367(4) + 1;
		if (Static230.method3368() != 0) {
			Static230.method3367(8);
		}
		Static230.method3367(2);
		if (this.anInt4442 > 1) {
			this.anInt4441 = Static230.method3367(4);
		}
		this.anIntArray338 = new int[this.anInt4442];
		this.anIntArray339 = new int[this.anInt4442];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4442; local42++) {
			Static230.method3367(8);
			this.anIntArray338[local42] = Static230.method3367(8);
			this.anIntArray339[local42] = Static230.method3367(8);
		}
	}
}
