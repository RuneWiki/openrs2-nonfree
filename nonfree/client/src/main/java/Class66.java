import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class66 {

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
	public final int anInt1888;

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
	public int anInt1889;

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "[I")
	public final int[] anIntArray106;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "[I")
	public final int[] anIntArray105;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V")
	public Class66() {
		Static495.method7149(16);
		this.anInt1888 = Static495.method7146() == 0 ? 1 : Static495.method7149(4) + 1;
		if (Static495.method7146() != 0) {
			Static495.method7149(8);
		}
		Static495.method7149(2);
		if (this.anInt1888 > 1) {
			this.anInt1889 = Static495.method7149(4);
		}
		this.anIntArray106 = new int[this.anInt1888];
		this.anIntArray105 = new int[this.anInt1888];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1888; local42++) {
			Static495.method7149(8);
			this.anIntArray106[local42] = Static495.method7149(8);
			this.anIntArray105[local42] = Static495.method7149(8);
		}
	}
}
