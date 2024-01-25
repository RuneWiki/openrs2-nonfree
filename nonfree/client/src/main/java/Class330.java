import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class330 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
	public final int anInt9150;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
	public int anInt9151;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "[I")
	public final int[] anIntArray639;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "[I")
	public final int[] anIntArray638;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	public Class330() {
		Static83.method1532(16);
		this.anInt9150 = Static83.method1536() == 0 ? 1 : Static83.method1532(4) + 1;
		if (Static83.method1536() != 0) {
			Static83.method1532(8);
		}
		Static83.method1532(2);
		if (this.anInt9150 > 1) {
			this.anInt9151 = Static83.method1532(4);
		}
		this.anIntArray639 = new int[this.anInt9150];
		this.anIntArray638 = new int[this.anInt9150];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9150; local42++) {
			Static83.method1532(8);
			this.anIntArray639[local42] = Static83.method1532(8);
			this.anIntArray638[local42] = Static83.method1532(8);
		}
	}
}
