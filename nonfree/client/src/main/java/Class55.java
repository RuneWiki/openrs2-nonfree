import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class55 {

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
	public final int anInt1835;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
	public int anInt1834;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "[I")
	public final int[] anIntArray105;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "[I")
	public final int[] anIntArray104;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class55() {
		Static405.method5714(16);
		this.anInt1835 = Static405.method5722() == 0 ? 1 : Static405.method5714(4) + 1;
		if (Static405.method5722() != 0) {
			Static405.method5714(8);
		}
		Static405.method5714(2);
		if (this.anInt1835 > 1) {
			this.anInt1834 = Static405.method5714(4);
		}
		this.anIntArray105 = new int[this.anInt1835];
		this.anIntArray104 = new int[this.anInt1835];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1835; local42++) {
			Static405.method5714(8);
			this.anIntArray105[local42] = Static405.method5714(8);
			this.anIntArray104[local42] = Static405.method5714(8);
		}
	}
}
