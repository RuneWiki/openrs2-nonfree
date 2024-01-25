import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class163 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "I")
	public final int anInt4283;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "I")
	public int anInt4284;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "[I")
	public final int[] anIntArray217;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "[I")
	public final int[] anIntArray216;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class163() {
		Static562.method7598(16);
		this.anInt4283 = Static562.method7591() == 0 ? 1 : Static562.method7598(4) + 1;
		if (Static562.method7591() != 0) {
			Static562.method7598(8);
		}
		Static562.method7598(2);
		if (this.anInt4283 > 1) {
			this.anInt4284 = Static562.method7598(4);
		}
		this.anIntArray217 = new int[this.anInt4283];
		this.anIntArray216 = new int[this.anInt4283];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4283; local42++) {
			Static562.method7598(8);
			this.anIntArray217[local42] = Static562.method7598(8);
			this.anIntArray216[local42] = Static562.method7598(8);
		}
	}
}
