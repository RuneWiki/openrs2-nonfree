import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public final int anInt180;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "[I")
	public final int[] anIntArray14;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
	public final int[] anIntArray15;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class5() {
		Static47.method864(16);
		this.anInt180 = Static47.method858() == 0 ? 1 : Static47.method864(4) + 1;
		if (Static47.method858() != 0) {
			Static47.method864(8);
		}
		Static47.method864(2);
		if (this.anInt180 > 1) {
			this.anInt181 = Static47.method864(4);
		}
		this.anIntArray14 = new int[this.anInt180];
		this.anIntArray15 = new int[this.anInt180];
		for (@Pc(42) int local42 = 0; local42 < this.anInt180; local42++) {
			Static47.method864(8);
			this.anIntArray14[local42] = Static47.method864(8);
			this.anIntArray15[local42] = Static47.method864(8);
		}
	}
}
