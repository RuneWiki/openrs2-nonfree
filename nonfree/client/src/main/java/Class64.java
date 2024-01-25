import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class64 {

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
	public final int anInt1874;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
	public int anInt1873;

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "[I")
	public final int[] anIntArray87;

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "[I")
	public final int[] anIntArray88;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "()V")
	public Class64() {
		Static577.method7751(16);
		this.anInt1874 = Static577.method7749() == 0 ? 1 : Static577.method7751(4) + 1;
		if (Static577.method7749() != 0) {
			Static577.method7751(8);
		}
		Static577.method7751(2);
		if (this.anInt1874 > 1) {
			this.anInt1873 = Static577.method7751(4);
		}
		this.anIntArray87 = new int[this.anInt1874];
		this.anIntArray88 = new int[this.anInt1874];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1874; local42++) {
			Static577.method7751(8);
			this.anIntArray87[local42] = Static577.method7751(8);
			this.anIntArray88[local42] = Static577.method7751(8);
		}
	}
}
