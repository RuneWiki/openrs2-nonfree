import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class23 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public final int anInt1026;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public int anInt1027;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
	public final int[] anIntArray97;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "[I")
	public final int[] anIntArray96;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class23() {
		Static161.method2544(16);
		this.anInt1026 = Static161.method2548() == 0 ? 1 : Static161.method2544(4) + 1;
		if (Static161.method2548() != 0) {
			Static161.method2544(8);
		}
		Static161.method2544(2);
		if (this.anInt1026 > 1) {
			this.anInt1027 = Static161.method2544(4);
		}
		this.anIntArray97 = new int[this.anInt1026];
		this.anIntArray96 = new int[this.anInt1026];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1026; local42++) {
			Static161.method2544(8);
			this.anIntArray97[local42] = Static161.method2544(8);
			this.anIntArray96[local42] = Static161.method2544(8);
		}
	}
}
