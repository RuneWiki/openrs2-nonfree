import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class289 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public final int anInt8560;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	public int anInt8561;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
	public final int[] anIntArray751;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
	public final int[] anIntArray752;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class289() {
		Static195.method3731(16);
		this.anInt8560 = Static195.method3722() == 0 ? 1 : Static195.method3731(4) + 1;
		if (Static195.method3722() != 0) {
			Static195.method3731(8);
		}
		Static195.method3731(2);
		if (this.anInt8560 > 1) {
			this.anInt8561 = Static195.method3731(4);
		}
		this.anIntArray751 = new int[this.anInt8560];
		this.anIntArray752 = new int[this.anInt8560];
		for (@Pc(42) int local42 = 0; local42 < this.anInt8560; local42++) {
			Static195.method3731(8);
			this.anIntArray751[local42] = Static195.method3731(8);
			this.anIntArray752[local42] = Static195.method3731(8);
		}
	}
}
