import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class33 {

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
	public final int anInt1976;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
	public int anInt1977;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "[I")
	public final int[] anIntArray209;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
	public final int[] anIntArray210;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class33() {
		Static92.method1932(16);
		this.anInt1976 = Static92.method1934() == 0 ? 1 : Static92.method1932(4) + 1;
		if (Static92.method1934() != 0) {
			Static92.method1932(8);
		}
		Static92.method1932(2);
		if (this.anInt1976 > 1) {
			this.anInt1977 = Static92.method1932(4);
		}
		this.anIntArray209 = new int[this.anInt1976];
		this.anIntArray210 = new int[this.anInt1976];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1976; local42++) {
			Static92.method1932(8);
			this.anIntArray209[local42] = Static92.method1932(8);
			this.anIntArray210[local42] = Static92.method1932(8);
		}
	}
}
