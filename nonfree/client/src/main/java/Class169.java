import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class169 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public int anInt5434;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	public int anInt5435;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
	public int[] anIntArray477;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
	public int[] anIntArray478;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class169() {
		Static223.method3731(16);
		this.anInt5434 = Static223.method3738() == 0 ? 1 : Static223.method3731(4) + 1;
		if (Static223.method3738() != 0) {
			Static223.method3731(8);
		}
		Static223.method3731(2);
		if (this.anInt5434 > 1) {
			this.anInt5435 = Static223.method3731(4);
		}
		this.anIntArray477 = new int[this.anInt5434];
		this.anIntArray478 = new int[this.anInt5434];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5434; local42++) {
			Static223.method3731(8);
			this.anIntArray477[local42] = Static223.method3731(8);
			this.anIntArray478[local42] = Static223.method3731(8);
		}
	}
}
