import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class49 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public final int anInt3070;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public int anInt3069;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	public final int[] anIntArray272;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
	public final int[] anIntArray271;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class49() {
		Static176.method3179(16);
		this.anInt3070 = Static176.method3177() == 0 ? 1 : Static176.method3179(4) + 1;
		if (Static176.method3177() != 0) {
			Static176.method3179(8);
		}
		Static176.method3179(2);
		if (this.anInt3070 > 1) {
			this.anInt3069 = Static176.method3179(4);
		}
		this.anIntArray272 = new int[this.anInt3070];
		this.anIntArray271 = new int[this.anInt3070];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3070; local42++) {
			Static176.method3179(8);
			this.anIntArray272[local42] = Static176.method3179(8);
			this.anIntArray271[local42] = Static176.method3179(8);
		}
	}
}
