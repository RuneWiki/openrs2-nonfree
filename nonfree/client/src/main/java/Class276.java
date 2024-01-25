import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class276 {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
	public final int anInt7709;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
	public int anInt7708;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "[I")
	public final int[] anIntArray656;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "[I")
	public final int[] anIntArray657;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class276() {
		Static377.method5464(16);
		this.anInt7709 = Static377.method5456() == 0 ? 1 : Static377.method5464(4) + 1;
		if (Static377.method5456() != 0) {
			Static377.method5464(8);
		}
		Static377.method5464(2);
		if (this.anInt7709 > 1) {
			this.anInt7708 = Static377.method5464(4);
		}
		this.anIntArray656 = new int[this.anInt7709];
		this.anIntArray657 = new int[this.anInt7709];
		for (@Pc(42) int local42 = 0; local42 < this.anInt7709; local42++) {
			Static377.method5464(8);
			this.anIntArray656[local42] = Static377.method5464(8);
			this.anIntArray657[local42] = Static377.method5464(8);
		}
	}
}
