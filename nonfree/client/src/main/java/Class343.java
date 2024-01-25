import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class343 {

	@OriginalMember(owner = "client!us", name = "d", descriptor = "I")
	public final int anInt8944;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "I")
	public int anInt8943;

	@OriginalMember(owner = "client!us", name = "b", descriptor = "[I")
	public final int[] anIntArray584;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "[I")
	public final int[] anIntArray583;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	public Class343() {
		Static406.method5533(16);
		this.anInt8944 = Static406.method5528() == 0 ? 1 : Static406.method5533(4) + 1;
		if (Static406.method5528() != 0) {
			Static406.method5533(8);
		}
		Static406.method5533(2);
		if (this.anInt8944 > 1) {
			this.anInt8943 = Static406.method5533(4);
		}
		this.anIntArray584 = new int[this.anInt8944];
		this.anIntArray583 = new int[this.anInt8944];
		for (@Pc(42) int local42 = 0; local42 < this.anInt8944; local42++) {
			Static406.method5533(8);
			this.anIntArray584[local42] = Static406.method5533(8);
			this.anIntArray583[local42] = Static406.method5533(8);
		}
	}
}
