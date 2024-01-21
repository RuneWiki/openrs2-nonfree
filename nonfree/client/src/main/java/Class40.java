import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class40 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	public final int anInt1594;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	public int anInt1595;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "[I")
	public final int[] anIntArray118;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
	public final int[] anIntArray117;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class40() {
		Static78.method1379(16);
		this.anInt1594 = Static78.method1376() == 0 ? 1 : Static78.method1379(4) + 1;
		if (Static78.method1376() != 0) {
			Static78.method1379(8);
		}
		Static78.method1379(2);
		if (this.anInt1594 > 1) {
			this.anInt1595 = Static78.method1379(4);
		}
		this.anIntArray118 = new int[this.anInt1594];
		this.anIntArray117 = new int[this.anInt1594];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1594; local42++) {
			Static78.method1379(8);
			this.anIntArray118[local42] = Static78.method1379(8);
			this.anIntArray117[local42] = Static78.method1379(8);
		}
	}
}
