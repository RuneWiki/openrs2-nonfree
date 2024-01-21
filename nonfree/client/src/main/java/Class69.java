import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class69 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	public final int anInt2922;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	public int anInt2921;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
	public final int[] anIntArray273;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "[I")
	public final int[] anIntArray272;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class69() {
		Static52.method915(16);
		this.anInt2922 = Static52.method924() == 0 ? 1 : Static52.method915(4) + 1;
		if (Static52.method924() != 0) {
			Static52.method915(8);
		}
		Static52.method915(2);
		if (this.anInt2922 > 1) {
			this.anInt2921 = Static52.method915(4);
		}
		this.anIntArray273 = new int[this.anInt2922];
		this.anIntArray272 = new int[this.anInt2922];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2922; local42++) {
			Static52.method915(8);
			this.anIntArray273[local42] = Static52.method915(8);
			this.anIntArray272[local42] = Static52.method915(8);
		}
	}
}
