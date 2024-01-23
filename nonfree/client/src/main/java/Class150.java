import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class150 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	public int anInt4586;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public int anInt4587;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class150() {
		Static182.method3055(16);
		this.anInt4586 = Static182.method3053() == 0 ? 1 : Static182.method3055(4) + 1;
		if (Static182.method3053() != 0) {
			Static182.method3055(8);
		}
		Static182.method3055(2);
		if (this.anInt4586 > 1) {
			this.anInt4587 = Static182.method3055(4);
		}
		this.anIntArray409 = new int[this.anInt4586];
		this.anIntArray410 = new int[this.anInt4586];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4586; local42++) {
			Static182.method3055(8);
			this.anIntArray409[local42] = Static182.method3055(8);
			this.anIntArray410[local42] = Static182.method3055(8);
		}
	}
}
