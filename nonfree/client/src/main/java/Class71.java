import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class71 {

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
	public final int anInt1970;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
	public int anInt1969;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "[I")
	public final int[] anIntArray97;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "[I")
	public final int[] anIntArray96;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class71() {
		Static196.method3051(16);
		this.anInt1970 = Static196.method3053() == 0 ? 1 : Static196.method3051(4) + 1;
		if (Static196.method3053() != 0) {
			Static196.method3051(8);
		}
		Static196.method3051(2);
		if (this.anInt1970 > 1) {
			this.anInt1969 = Static196.method3051(4);
		}
		this.anIntArray97 = new int[this.anInt1970];
		this.anIntArray96 = new int[this.anInt1970];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1970; local42++) {
			Static196.method3051(8);
			this.anIntArray97[local42] = Static196.method3051(8);
			this.anIntArray96[local42] = Static196.method3051(8);
		}
	}
}
