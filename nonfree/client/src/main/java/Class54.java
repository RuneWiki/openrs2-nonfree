import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class54 {

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public final int anInt3182;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public int anInt3181;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "[I")
	public final int[] anIntArray362;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "[I")
	public final int[] anIntArray363;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class54() {
		Static28.method688(16);
		this.anInt3182 = Static28.method687() == 0 ? 1 : Static28.method688(4) + 1;
		if (Static28.method687() != 0) {
			Static28.method688(8);
		}
		Static28.method688(2);
		if (this.anInt3182 > 1) {
			this.anInt3181 = Static28.method688(4);
		}
		this.anIntArray362 = new int[this.anInt3182];
		this.anIntArray363 = new int[this.anInt3182];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3182; local42++) {
			Static28.method688(8);
			this.anIntArray362[local42] = Static28.method688(8);
			this.anIntArray363[local42] = Static28.method688(8);
		}
	}
}
