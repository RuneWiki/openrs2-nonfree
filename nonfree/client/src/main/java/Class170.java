import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class170 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	public final int anInt4299;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public int anInt4300;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
	public final int[] anIntArray217;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "[I")
	public final int[] anIntArray216;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class170() {
		Static182.method3151(16);
		this.anInt4299 = Static182.method3150() == 0 ? 1 : Static182.method3151(4) + 1;
		if (Static182.method3150() != 0) {
			Static182.method3151(8);
		}
		Static182.method3151(2);
		if (this.anInt4299 > 1) {
			this.anInt4300 = Static182.method3151(4);
		}
		this.anIntArray217 = new int[this.anInt4299];
		this.anIntArray216 = new int[this.anInt4299];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4299; local42++) {
			Static182.method3151(8);
			this.anIntArray217[local42] = Static182.method3151(8);
			this.anIntArray216[local42] = Static182.method3151(8);
		}
	}
}
