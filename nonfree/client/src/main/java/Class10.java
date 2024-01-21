import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class10 {

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	public final int anInt249;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	public int anInt248;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
	public final int[] anIntArray22;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
	public final int[] anIntArray23;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class10() {
		Static125.method1840(16);
		this.anInt249 = Static125.method1848() == 0 ? 1 : Static125.method1840(4) + 1;
		if (Static125.method1848() != 0) {
			Static125.method1840(8);
		}
		Static125.method1840(2);
		if (this.anInt249 > 1) {
			this.anInt248 = Static125.method1840(4);
		}
		this.anIntArray22 = new int[this.anInt249];
		this.anIntArray23 = new int[this.anInt249];
		for (@Pc(42) int local42 = 0; local42 < this.anInt249; local42++) {
			Static125.method1840(8);
			this.anIntArray22[local42] = Static125.method1840(8);
			this.anIntArray23[local42] = Static125.method1840(8);
		}
	}
}
