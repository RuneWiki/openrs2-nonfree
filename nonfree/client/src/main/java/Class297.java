import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class297 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	public final int anInt8748;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
	public int anInt8749;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "[I")
	public final int[] anIntArray745;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "[I")
	public final int[] anIntArray744;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class297() {
		Static433.method6585(16);
		this.anInt8748 = Static433.method6582() == 0 ? 1 : Static433.method6585(4) + 1;
		if (Static433.method6582() != 0) {
			Static433.method6585(8);
		}
		Static433.method6585(2);
		if (this.anInt8748 > 1) {
			this.anInt8749 = Static433.method6585(4);
		}
		this.anIntArray745 = new int[this.anInt8748];
		this.anIntArray744 = new int[this.anInt8748];
		for (@Pc(42) int local42 = 0; local42 < this.anInt8748; local42++) {
			Static433.method6585(8);
			this.anIntArray745[local42] = Static433.method6585(8);
			this.anIntArray744[local42] = Static433.method6585(8);
		}
	}
}
