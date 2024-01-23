import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public int anInt22;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public int anInt23;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
	public int[] anIntArray2;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "[I")
	public int[] anIntArray1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class2() {
		Static9.method163(16);
		this.anInt22 = Static9.method169() == 0 ? 1 : Static9.method163(4) + 1;
		if (Static9.method169() != 0) {
			Static9.method163(8);
		}
		Static9.method163(2);
		if (this.anInt22 > 1) {
			this.anInt23 = Static9.method163(4);
		}
		this.anIntArray2 = new int[this.anInt22];
		this.anIntArray1 = new int[this.anInt22];
		for (@Pc(42) int local42 = 0; local42 < this.anInt22; local42++) {
			Static9.method163(8);
			this.anIntArray2[local42] = Static9.method163(8);
			this.anIntArray1[local42] = Static9.method163(8);
		}
	}
}
