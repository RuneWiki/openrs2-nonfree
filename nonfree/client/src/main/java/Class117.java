import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class117 {

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "I")
	public final int anInt3827;

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
	public int anInt3826;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "[I")
	public final int[] anIntArray173;

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "[I")
	public final int[] anIntArray174;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
	public Class117() {
		Static529.method8219(16);
		this.anInt3827 = Static529.method8211() == 0 ? 1 : Static529.method8219(4) + 1;
		if (Static529.method8211() != 0) {
			Static529.method8219(8);
		}
		Static529.method8219(2);
		if (this.anInt3827 > 1) {
			this.anInt3826 = Static529.method8219(4);
		}
		this.anIntArray173 = new int[this.anInt3827];
		this.anIntArray174 = new int[this.anInt3827];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3827; local42++) {
			Static529.method8219(8);
			this.anIntArray173[local42] = Static529.method8219(8);
			this.anIntArray174[local42] = Static529.method8219(8);
		}
	}
}
