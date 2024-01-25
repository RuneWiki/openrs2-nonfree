import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class186 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public final int anInt5355;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	public int anInt5354;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
	public final int[] anIntArray400;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "[I")
	public final int[] anIntArray399;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class186() {
		Static368.method5866(16);
		this.anInt5355 = Static368.method5859() == 0 ? 1 : Static368.method5866(4) + 1;
		if (Static368.method5859() != 0) {
			Static368.method5866(8);
		}
		Static368.method5866(2);
		if (this.anInt5355 > 1) {
			this.anInt5354 = Static368.method5866(4);
		}
		this.anIntArray400 = new int[this.anInt5355];
		this.anIntArray399 = new int[this.anInt5355];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5355; local42++) {
			Static368.method5866(8);
			this.anIntArray400[local42] = Static368.method5866(8);
			this.anIntArray399[local42] = Static368.method5866(8);
		}
	}
}
