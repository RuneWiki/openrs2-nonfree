import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class191 {

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public final int anInt5781;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	public int anInt5780;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
	public final int[] anIntArray464;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "[I")
	public final int[] anIntArray463;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class191() {
		Static163.method3185(16);
		this.anInt5781 = Static163.method3179() == 0 ? 1 : Static163.method3185(4) + 1;
		if (Static163.method3179() != 0) {
			Static163.method3185(8);
		}
		Static163.method3185(2);
		if (this.anInt5781 > 1) {
			this.anInt5780 = Static163.method3185(4);
		}
		this.anIntArray464 = new int[this.anInt5781];
		this.anIntArray463 = new int[this.anInt5781];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5781; local42++) {
			Static163.method3185(8);
			this.anIntArray464[local42] = Static163.method3185(8);
			this.anIntArray463[local42] = Static163.method3185(8);
		}
	}
}
