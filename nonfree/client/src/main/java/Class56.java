import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class56 {

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
	public int anInt1720;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
	public int anInt1719;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "[I")
	public int[] anIntArray134;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class56() {
		Static32.method544(16);
		this.anInt1720 = Static32.method553() == 0 ? 1 : Static32.method544(4) + 1;
		if (Static32.method553() != 0) {
			Static32.method544(8);
		}
		Static32.method544(2);
		if (this.anInt1720 > 1) {
			this.anInt1719 = Static32.method544(4);
		}
		this.anIntArray135 = new int[this.anInt1720];
		this.anIntArray134 = new int[this.anInt1720];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1720; local42++) {
			Static32.method544(8);
			this.anIntArray135[local42] = Static32.method544(8);
			this.anIntArray134[local42] = Static32.method544(8);
		}
	}
}
