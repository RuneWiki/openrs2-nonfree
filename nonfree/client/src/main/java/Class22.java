import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class22 {

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
	public int[] anIntArray110;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
	public int[] anIntArray109;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class22() {
		Static88.method1567(16);
		this.anInt691 = Static88.method1563() == 0 ? 1 : Static88.method1567(4) + 1;
		if (Static88.method1563() != 0) {
			Static88.method1567(8);
		}
		Static88.method1567(2);
		if (this.anInt691 > 1) {
			this.anInt690 = Static88.method1567(4);
		}
		this.anIntArray110 = new int[this.anInt691];
		this.anIntArray109 = new int[this.anInt691];
		for (@Pc(42) int local42 = 0; local42 < this.anInt691; local42++) {
			Static88.method1567(8);
			this.anIntArray110[local42] = Static88.method1567(8);
			this.anIntArray109[local42] = Static88.method1567(8);
		}
	}
}
