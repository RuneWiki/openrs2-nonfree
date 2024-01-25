import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class181 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
	public final int anInt4318;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	public int anInt4319;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "[I")
	public final int[] anIntArray261;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
	public final int[] anIntArray262;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class181() {
		Static638.method8459(16);
		this.anInt4318 = Static638.method8455() == 0 ? 1 : Static638.method8459(4) + 1;
		if (Static638.method8455() != 0) {
			Static638.method8459(8);
		}
		Static638.method8459(2);
		if (this.anInt4318 > 1) {
			this.anInt4319 = Static638.method8459(4);
		}
		this.anIntArray261 = new int[this.anInt4318];
		this.anIntArray262 = new int[this.anInt4318];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4318; local42++) {
			Static638.method8459(8);
			this.anIntArray261[local42] = Static638.method8459(8);
			this.anIntArray262[local42] = Static638.method8459(8);
		}
	}
}
