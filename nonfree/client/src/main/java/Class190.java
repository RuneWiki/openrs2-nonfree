import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class190 {

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public final int anInt5140;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	public int anInt5141;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "[I")
	public final int[] anIntArray400;

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "[I")
	public final int[] anIntArray401;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	public Class190() {
		Static99.method1791(16);
		this.anInt5140 = Static99.method1797() == 0 ? 1 : Static99.method1791(4) + 1;
		if (Static99.method1797() != 0) {
			Static99.method1791(8);
		}
		Static99.method1791(2);
		if (this.anInt5140 > 1) {
			this.anInt5141 = Static99.method1791(4);
		}
		this.anIntArray400 = new int[this.anInt5140];
		this.anIntArray401 = new int[this.anInt5140];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5140; local42++) {
			Static99.method1791(8);
			this.anIntArray400[local42] = Static99.method1791(8);
			this.anIntArray401[local42] = Static99.method1791(8);
		}
	}
}
