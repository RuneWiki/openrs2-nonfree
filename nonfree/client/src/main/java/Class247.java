import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class247 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public final int anInt7235;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	public int anInt7236;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "[I")
	public final int[] anIntArray562;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "[I")
	public final int[] anIntArray561;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class247() {
		Static333.method5237(16);
		this.anInt7235 = Static333.method5234() == 0 ? 1 : Static333.method5237(4) + 1;
		if (Static333.method5234() != 0) {
			Static333.method5237(8);
		}
		Static333.method5237(2);
		if (this.anInt7235 > 1) {
			this.anInt7236 = Static333.method5237(4);
		}
		this.anIntArray562 = new int[this.anInt7235];
		this.anIntArray561 = new int[this.anInt7235];
		for (@Pc(42) int local42 = 0; local42 < this.anInt7235; local42++) {
			Static333.method5237(8);
			this.anIntArray562[local42] = Static333.method5237(8);
			this.anIntArray561[local42] = Static333.method5237(8);
		}
	}
}
