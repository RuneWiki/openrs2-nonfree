import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class359 {

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
	public final int anInt9710;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
	public int anInt9709;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "[I")
	public final int[] anIntArray720;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "[I")
	public final int[] anIntArray719;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	public Class359() {
		Static239.method4061(16);
		this.anInt9710 = Static239.method4069() == 0 ? 1 : Static239.method4061(4) + 1;
		if (Static239.method4069() != 0) {
			Static239.method4061(8);
		}
		Static239.method4061(2);
		if (this.anInt9710 > 1) {
			this.anInt9709 = Static239.method4061(4);
		}
		this.anIntArray720 = new int[this.anInt9710];
		this.anIntArray719 = new int[this.anInt9710];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9710; local42++) {
			Static239.method4061(8);
			this.anIntArray720[local42] = Static239.method4061(8);
			this.anIntArray719[local42] = Static239.method4061(8);
		}
	}
}
