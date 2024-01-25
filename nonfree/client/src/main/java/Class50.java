import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class50 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
	public final int anInt1693;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public int anInt1694;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
	public final int[] anIntArray125;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
	public final int[] anIntArray124;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class50() {
		Static268.method4574(16);
		this.anInt1693 = Static268.method4578() == 0 ? 1 : Static268.method4574(4) + 1;
		if (Static268.method4578() != 0) {
			Static268.method4574(8);
		}
		Static268.method4574(2);
		if (this.anInt1693 > 1) {
			this.anInt1694 = Static268.method4574(4);
		}
		this.anIntArray125 = new int[this.anInt1693];
		this.anIntArray124 = new int[this.anInt1693];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1693; local42++) {
			Static268.method4574(8);
			this.anIntArray125[local42] = Static268.method4574(8);
			this.anIntArray124[local42] = Static268.method4574(8);
		}
	}
}
