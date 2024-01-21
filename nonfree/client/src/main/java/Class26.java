import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class26 {

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public final int anInt750;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
	public int anInt749;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "[I")
	public final int[] anIntArray96;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
	public final int[] anIntArray95;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class26() {
		Static85.method1379(16);
		this.anInt750 = Static85.method1381() == 0 ? 1 : Static85.method1379(4) + 1;
		if (Static85.method1381() != 0) {
			Static85.method1379(8);
		}
		Static85.method1379(2);
		if (this.anInt750 > 1) {
			this.anInt749 = Static85.method1379(4);
		}
		this.anIntArray96 = new int[this.anInt750];
		this.anIntArray95 = new int[this.anInt750];
		for (@Pc(42) int local42 = 0; local42 < this.anInt750; local42++) {
			Static85.method1379(8);
			this.anIntArray96[local42] = Static85.method1379(8);
			this.anIntArray95[local42] = Static85.method1379(8);
		}
	}
}
