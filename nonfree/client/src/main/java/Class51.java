import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class51 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public final int anInt2111;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	public int anInt2110;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
	public final int[] anIntArray238;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
	public final int[] anIntArray237;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class51() {
		Static122.method2159(16);
		this.anInt2111 = Static122.method2160() == 0 ? 1 : Static122.method2159(4) + 1;
		if (Static122.method2160() != 0) {
			Static122.method2159(8);
		}
		Static122.method2159(2);
		if (this.anInt2111 > 1) {
			this.anInt2110 = Static122.method2159(4);
		}
		this.anIntArray238 = new int[this.anInt2111];
		this.anIntArray237 = new int[this.anInt2111];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2111; local42++) {
			Static122.method2159(8);
			this.anIntArray238[local42] = Static122.method2159(8);
			this.anIntArray237[local42] = Static122.method2159(8);
		}
	}
}
