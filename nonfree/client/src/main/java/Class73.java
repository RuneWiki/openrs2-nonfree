import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class73 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public final int anInt2968;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public int anInt2967;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
	public final int[] anIntArray208;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
	public final int[] anIntArray209;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class73() {
		Static100.method1425(16);
		this.anInt2968 = Static100.method1422() == 0 ? 1 : Static100.method1425(4) + 1;
		if (Static100.method1422() != 0) {
			Static100.method1425(8);
		}
		Static100.method1425(2);
		if (this.anInt2968 > 1) {
			this.anInt2967 = Static100.method1425(4);
		}
		this.anIntArray208 = new int[this.anInt2968];
		this.anIntArray209 = new int[this.anInt2968];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2968; local42++) {
			Static100.method1425(8);
			this.anIntArray208[local42] = Static100.method1425(8);
			this.anIntArray209[local42] = Static100.method1425(8);
		}
	}
}
