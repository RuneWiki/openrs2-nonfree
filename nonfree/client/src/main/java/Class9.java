import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class9 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public final int anInt248;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public int anInt249;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[I")
	public final int[] anIntArray31;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	public final int[] anIntArray32;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class9() {
		Static90.method1697(16);
		this.anInt248 = Static90.method1695() == 0 ? 1 : Static90.method1697(4) + 1;
		if (Static90.method1695() != 0) {
			Static90.method1697(8);
		}
		Static90.method1697(2);
		if (this.anInt248 > 1) {
			this.anInt249 = Static90.method1697(4);
		}
		this.anIntArray31 = new int[this.anInt248];
		this.anIntArray32 = new int[this.anInt248];
		for (@Pc(42) int local42 = 0; local42 < this.anInt248; local42++) {
			Static90.method1697(8);
			this.anIntArray31[local42] = Static90.method1697(8);
			this.anIntArray32[local42] = Static90.method1697(8);
		}
	}
}
