import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class77 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "I")
	public final int anInt3093;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "I")
	public int anInt3094;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "[I")
	public final int[] anIntArray372;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
	public final int[] anIntArray371;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class77() {
		Static5.method31(16);
		this.anInt3093 = Static5.method38() == 0 ? 1 : Static5.method31(4) + 1;
		if (Static5.method38() != 0) {
			Static5.method31(8);
		}
		Static5.method31(2);
		if (this.anInt3093 > 1) {
			this.anInt3094 = Static5.method31(4);
		}
		this.anIntArray372 = new int[this.anInt3093];
		this.anIntArray371 = new int[this.anInt3093];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3093; local42++) {
			Static5.method31(8);
			this.anIntArray372[local42] = Static5.method31(8);
			this.anIntArray371[local42] = Static5.method31(8);
		}
	}
}
