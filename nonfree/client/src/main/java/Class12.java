import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class12 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public final int anInt468;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
	public final int[] anIntArray27;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "[I")
	public final int[] anIntArray26;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class12() {
		Static125.method1948(16);
		this.anInt468 = Static125.method1942() == 0 ? 1 : Static125.method1948(4) + 1;
		if (Static125.method1942() != 0) {
			Static125.method1948(8);
		}
		Static125.method1948(2);
		if (this.anInt468 > 1) {
			this.anInt469 = Static125.method1948(4);
		}
		this.anIntArray27 = new int[this.anInt468];
		this.anIntArray26 = new int[this.anInt468];
		for (@Pc(42) int local42 = 0; local42 < this.anInt468; local42++) {
			Static125.method1948(8);
			this.anIntArray27[local42] = Static125.method1948(8);
			this.anIntArray26[local42] = Static125.method1948(8);
		}
	}
}
