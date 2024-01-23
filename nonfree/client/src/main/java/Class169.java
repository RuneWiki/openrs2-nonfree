import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class169 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public int anInt5411;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public int anInt5412;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
	public int[] anIntArray562;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
	public int[] anIntArray563;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class169() {
		Static242.method4100(16);
		this.anInt5411 = Static242.method4103() == 0 ? 1 : Static242.method4100(4) + 1;
		if (Static242.method4103() != 0) {
			Static242.method4100(8);
		}
		Static242.method4100(2);
		if (this.anInt5411 > 1) {
			this.anInt5412 = Static242.method4100(4);
		}
		this.anIntArray562 = new int[this.anInt5411];
		this.anIntArray563 = new int[this.anInt5411];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5411; local42++) {
			Static242.method4100(8);
			this.anIntArray562[local42] = Static242.method4100(8);
			this.anIntArray563[local42] = Static242.method4100(8);
		}
	}
}
