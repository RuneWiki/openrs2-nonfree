import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class141 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public int anInt4535;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public int anInt4536;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "[I")
	public int[] anIntArray451;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
	public int[] anIntArray452;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class141() {
		Static283.method4411(16);
		this.anInt4535 = Static283.method4407() == 0 ? 1 : Static283.method4411(4) + 1;
		if (Static283.method4407() != 0) {
			Static283.method4411(8);
		}
		Static283.method4411(2);
		if (this.anInt4535 > 1) {
			this.anInt4536 = Static283.method4411(4);
		}
		this.anIntArray451 = new int[this.anInt4535];
		this.anIntArray452 = new int[this.anInt4535];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4535; local42++) {
			Static283.method4411(8);
			this.anIntArray451[local42] = Static283.method4411(8);
			this.anIntArray452[local42] = Static283.method4411(8);
		}
	}
}
