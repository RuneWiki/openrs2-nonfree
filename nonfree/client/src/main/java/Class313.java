import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class313 {

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
	public final int anInt9414;

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
	public int anInt9415;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "[I")
	public final int[] anIntArray536;

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "[I")
	public final int[] anIntArray537;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "()V")
	public Class313() {
		Static116.method2115(16);
		this.anInt9414 = Static116.method2125() == 0 ? 1 : Static116.method2115(4) + 1;
		if (Static116.method2125() != 0) {
			Static116.method2115(8);
		}
		Static116.method2115(2);
		if (this.anInt9414 > 1) {
			this.anInt9415 = Static116.method2115(4);
		}
		this.anIntArray536 = new int[this.anInt9414];
		this.anIntArray537 = new int[this.anInt9414];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9414; local42++) {
			Static116.method2115(8);
			this.anIntArray536[local42] = Static116.method2115(8);
			this.anIntArray537[local42] = Static116.method2115(8);
		}
	}
}
