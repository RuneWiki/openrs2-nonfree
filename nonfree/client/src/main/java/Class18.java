import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class18 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public final int anInt689;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
	public final int[] anIntArray99;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
	public final int[] anIntArray100;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class18() {
		Static69.method1392(16);
		this.anInt689 = Static69.method1389() == 0 ? 1 : Static69.method1392(4) + 1;
		if (Static69.method1389() != 0) {
			Static69.method1392(8);
		}
		Static69.method1392(2);
		if (this.anInt689 > 1) {
			this.anInt690 = Static69.method1392(4);
		}
		this.anIntArray99 = new int[this.anInt689];
		this.anIntArray100 = new int[this.anInt689];
		for (@Pc(42) int local42 = 0; local42 < this.anInt689; local42++) {
			Static69.method1392(8);
			this.anIntArray99[local42] = Static69.method1392(8);
			this.anIntArray100[local42] = Static69.method1392(8);
		}
	}
}
