import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class268 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public final int anInt7757;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public int anInt7758;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
	public final int[] anIntArray618;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
	public final int[] anIntArray619;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class268() {
		Static333.method4913(16);
		this.anInt7757 = Static333.method4922() == 0 ? 1 : Static333.method4913(4) + 1;
		if (Static333.method4922() != 0) {
			Static333.method4913(8);
		}
		Static333.method4913(2);
		if (this.anInt7757 > 1) {
			this.anInt7758 = Static333.method4913(4);
		}
		this.anIntArray618 = new int[this.anInt7757];
		this.anIntArray619 = new int[this.anInt7757];
		for (@Pc(42) int local42 = 0; local42 < this.anInt7757; local42++) {
			Static333.method4913(8);
			this.anIntArray618[local42] = Static333.method4913(8);
			this.anIntArray619[local42] = Static333.method4913(8);
		}
	}
}
