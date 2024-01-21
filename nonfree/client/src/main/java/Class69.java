import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class69 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public final int anInt3823;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public int anInt3822;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[I")
	public final int[] anIntArray361;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "[I")
	public final int[] anIntArray360;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class69() {
		Static23.method483(16);
		this.anInt3823 = Static23.method491() == 0 ? 1 : Static23.method483(4) + 1;
		if (Static23.method491() != 0) {
			Static23.method483(8);
		}
		Static23.method483(2);
		if (this.anInt3823 > 1) {
			this.anInt3822 = Static23.method483(4);
		}
		this.anIntArray361 = new int[this.anInt3823];
		this.anIntArray360 = new int[this.anInt3823];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3823; local42++) {
			Static23.method483(8);
			this.anIntArray361[local42] = Static23.method483(8);
			this.anIntArray360[local42] = Static23.method483(8);
		}
	}
}
