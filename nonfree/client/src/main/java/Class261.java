import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class261 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	public final int anInt7196;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	public int anInt7197;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "[I")
	public final int[] anIntArray619;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "[I")
	public final int[] anIntArray620;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class261() {
		Static184.method2882(16);
		this.anInt7196 = Static184.method2883() == 0 ? 1 : Static184.method2882(4) + 1;
		if (Static184.method2883() != 0) {
			Static184.method2882(8);
		}
		Static184.method2882(2);
		if (this.anInt7196 > 1) {
			this.anInt7197 = Static184.method2882(4);
		}
		this.anIntArray619 = new int[this.anInt7196];
		this.anIntArray620 = new int[this.anInt7196];
		for (@Pc(42) int local42 = 0; local42 < this.anInt7196; local42++) {
			Static184.method2882(8);
			this.anIntArray619[local42] = Static184.method2882(8);
			this.anIntArray620[local42] = Static184.method2882(8);
		}
	}
}
