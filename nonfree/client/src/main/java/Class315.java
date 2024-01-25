import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class315 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public final int anInt9114;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	public int anInt9113;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
	public final int[] anIntArray500;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "[I")
	public final int[] anIntArray501;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class315() {
		Static446.method6556(16);
		this.anInt9114 = Static446.method6548() == 0 ? 1 : Static446.method6556(4) + 1;
		if (Static446.method6548() != 0) {
			Static446.method6556(8);
		}
		Static446.method6556(2);
		if (this.anInt9114 > 1) {
			this.anInt9113 = Static446.method6556(4);
		}
		this.anIntArray500 = new int[this.anInt9114];
		this.anIntArray501 = new int[this.anInt9114];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9114; local42++) {
			Static446.method6556(8);
			this.anIntArray500[local42] = Static446.method6556(8);
			this.anIntArray501[local42] = Static446.method6556(8);
		}
	}
}
