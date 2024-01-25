import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class212 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public final int anInt6653;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	public int anInt6654;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
	public final int[] anIntArray556;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
	public final int[] anIntArray557;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class212() {
		Static96.method1635(16);
		this.anInt6653 = Static96.method1625() == 0 ? 1 : Static96.method1635(4) + 1;
		if (Static96.method1625() != 0) {
			Static96.method1635(8);
		}
		Static96.method1635(2);
		if (this.anInt6653 > 1) {
			this.anInt6654 = Static96.method1635(4);
		}
		this.anIntArray556 = new int[this.anInt6653];
		this.anIntArray557 = new int[this.anInt6653];
		for (@Pc(42) int local42 = 0; local42 < this.anInt6653; local42++) {
			Static96.method1635(8);
			this.anIntArray556[local42] = Static96.method1635(8);
			this.anIntArray557[local42] = Static96.method1635(8);
		}
	}
}
