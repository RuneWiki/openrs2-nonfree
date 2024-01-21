import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class81 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
	public final int anInt3880;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	public int anInt3881;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
	public final int[] anIntArray531;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "[I")
	public final int[] anIntArray530;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class81() {
		Static117.method2068(16);
		this.anInt3880 = Static117.method2074() == 0 ? 1 : Static117.method2068(4) + 1;
		if (Static117.method2074() != 0) {
			Static117.method2068(8);
		}
		Static117.method2068(2);
		if (this.anInt3880 > 1) {
			this.anInt3881 = Static117.method2068(4);
		}
		this.anIntArray531 = new int[this.anInt3880];
		this.anIntArray530 = new int[this.anInt3880];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3880; local42++) {
			Static117.method2068(8);
			this.anIntArray531[local42] = Static117.method2068(8);
			this.anIntArray530[local42] = Static117.method2068(8);
		}
	}
}
