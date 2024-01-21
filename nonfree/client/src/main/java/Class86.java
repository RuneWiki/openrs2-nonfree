import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class86 {

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public final int anInt4004;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public int anInt4003;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
	public final int[] anIntArray421;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "[I")
	public final int[] anIntArray422;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class86() {
		Static55.method976(16);
		this.anInt4004 = Static55.method986() == 0 ? 1 : Static55.method976(4) + 1;
		if (Static55.method986() != 0) {
			Static55.method976(8);
		}
		Static55.method976(2);
		if (this.anInt4004 > 1) {
			this.anInt4003 = Static55.method976(4);
		}
		this.anIntArray421 = new int[this.anInt4004];
		this.anIntArray422 = new int[this.anInt4004];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4004; local42++) {
			Static55.method976(8);
			this.anIntArray421[local42] = Static55.method976(8);
			this.anIntArray422[local42] = Static55.method976(8);
		}
	}
}
