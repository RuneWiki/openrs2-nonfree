import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class8 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public final int anInt220;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	public int anInt221;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
	public final int[] anIntArray29;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "[I")
	public final int[] anIntArray28;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class8() {
		Static14.method332(16);
		this.anInt220 = Static14.method339() == 0 ? 1 : Static14.method332(4) + 1;
		if (Static14.method339() != 0) {
			Static14.method332(8);
		}
		Static14.method332(2);
		if (this.anInt220 > 1) {
			this.anInt221 = Static14.method332(4);
		}
		this.anIntArray29 = new int[this.anInt220];
		this.anIntArray28 = new int[this.anInt220];
		for (@Pc(42) int local42 = 0; local42 < this.anInt220; local42++) {
			Static14.method332(8);
			this.anIntArray29[local42] = Static14.method332(8);
			this.anIntArray28[local42] = Static14.method332(8);
		}
	}
}
