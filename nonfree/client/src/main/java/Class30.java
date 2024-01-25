import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class30 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public final int anInt662;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public int anInt663;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[I")
	public final int[] anIntArray54;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
	public final int[] anIntArray53;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class30() {
		Static504.method7039(16);
		this.anInt662 = Static504.method7041() == 0 ? 1 : Static504.method7039(4) + 1;
		if (Static504.method7041() != 0) {
			Static504.method7039(8);
		}
		Static504.method7039(2);
		if (this.anInt662 > 1) {
			this.anInt663 = Static504.method7039(4);
		}
		this.anIntArray54 = new int[this.anInt662];
		this.anIntArray53 = new int[this.anInt662];
		for (@Pc(42) int local42 = 0; local42 < this.anInt662; local42++) {
			Static504.method7039(8);
			this.anIntArray54[local42] = Static504.method7039(8);
			this.anIntArray53[local42] = Static504.method7039(8);
		}
	}
}
