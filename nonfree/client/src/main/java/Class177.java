import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class177 {

	@OriginalMember(owner = "client!iia", name = "d", descriptor = "I")
	public final int anInt4727;

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
	public int anInt4726;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "[I")
	public final int[] anIntArray311;

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "[I")
	public final int[] anIntArray312;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "()V")
	public Class177() {
		Static570.method7706(16);
		this.anInt4727 = Static570.method7701() == 0 ? 1 : Static570.method7706(4) + 1;
		if (Static570.method7701() != 0) {
			Static570.method7706(8);
		}
		Static570.method7706(2);
		if (this.anInt4727 > 1) {
			this.anInt4726 = Static570.method7706(4);
		}
		this.anIntArray311 = new int[this.anInt4727];
		this.anIntArray312 = new int[this.anInt4727];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4727; local42++) {
			Static570.method7706(8);
			this.anIntArray311[local42] = Static570.method7706(8);
			this.anIntArray312[local42] = Static570.method7706(8);
		}
	}
}
