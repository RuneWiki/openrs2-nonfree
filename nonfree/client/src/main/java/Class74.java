import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class74 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
	public final int anInt1711;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	public int anInt1710;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "[I")
	public final int[] anIntArray122;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "[I")
	public final int[] anIntArray121;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V")
	public Class74() {
		Static403.method5641(16);
		this.anInt1711 = Static403.method5639() == 0 ? 1 : Static403.method5641(4) + 1;
		if (Static403.method5639() != 0) {
			Static403.method5641(8);
		}
		Static403.method5641(2);
		if (this.anInt1711 > 1) {
			this.anInt1710 = Static403.method5641(4);
		}
		this.anIntArray122 = new int[this.anInt1711];
		this.anIntArray121 = new int[this.anInt1711];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1711; local42++) {
			Static403.method5641(8);
			this.anIntArray122[local42] = Static403.method5641(8);
			this.anIntArray121[local42] = Static403.method5641(8);
		}
	}
}
