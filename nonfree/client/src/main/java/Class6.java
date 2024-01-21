import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class6 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public final int anInt168;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	public int anInt169;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
	public final int[] anIntArray24;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "[I")
	public final int[] anIntArray23;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class6() {
		Static86.method1454(16);
		this.anInt168 = Static86.method1447() == 0 ? 1 : Static86.method1454(4) + 1;
		if (Static86.method1447() != 0) {
			Static86.method1454(8);
		}
		Static86.method1454(2);
		if (this.anInt168 > 1) {
			this.anInt169 = Static86.method1454(4);
		}
		this.anIntArray24 = new int[this.anInt168];
		this.anIntArray23 = new int[this.anInt168];
		for (@Pc(42) int local42 = 0; local42 < this.anInt168; local42++) {
			Static86.method1454(8);
			this.anIntArray24[local42] = Static86.method1454(8);
			this.anIntArray23[local42] = Static86.method1454(8);
		}
	}
}
