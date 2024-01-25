import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class30 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
	public final int anInt554;

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
	public int anInt555;

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "[I")
	public final int[] anIntArray44;

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "[I")
	public final int[] anIntArray43;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V")
	public Class30() {
		Static288.method4671(16);
		this.anInt554 = Static288.method4666() == 0 ? 1 : Static288.method4671(4) + 1;
		if (Static288.method4666() != 0) {
			Static288.method4671(8);
		}
		Static288.method4671(2);
		if (this.anInt554 > 1) {
			this.anInt555 = Static288.method4671(4);
		}
		this.anIntArray44 = new int[this.anInt554];
		this.anIntArray43 = new int[this.anInt554];
		for (@Pc(42) int local42 = 0; local42 < this.anInt554; local42++) {
			Static288.method4671(8);
			this.anIntArray44[local42] = Static288.method4671(8);
			this.anIntArray43[local42] = Static288.method4671(8);
		}
	}
}
