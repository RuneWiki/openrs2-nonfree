import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class222 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public final int anInt5955;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	public int anInt5956;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
	public final int[] anIntArray449;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
	public final int[] anIntArray448;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public Class222() {
		Static412.method6279(16);
		this.anInt5955 = Static412.method6280() == 0 ? 1 : Static412.method6279(4) + 1;
		if (Static412.method6280() != 0) {
			Static412.method6279(8);
		}
		Static412.method6279(2);
		if (this.anInt5955 > 1) {
			this.anInt5956 = Static412.method6279(4);
		}
		this.anIntArray449 = new int[this.anInt5955];
		this.anIntArray448 = new int[this.anInt5955];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5955; local42++) {
			Static412.method6279(8);
			this.anIntArray449[local42] = Static412.method6279(8);
			this.anIntArray448[local42] = Static412.method6279(8);
		}
	}
}
