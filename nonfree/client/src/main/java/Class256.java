import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class256 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public final int anInt7516;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public int anInt7515;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
	public final int[] anIntArray381;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
	public final int[] anIntArray380;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class256() {
		Static527.method7630(16);
		this.anInt7516 = Static527.method7637() == 0 ? 1 : Static527.method7630(4) + 1;
		if (Static527.method7637() != 0) {
			Static527.method7630(8);
		}
		Static527.method7630(2);
		if (this.anInt7516 > 1) {
			this.anInt7515 = Static527.method7630(4);
		}
		this.anIntArray381 = new int[this.anInt7516];
		this.anIntArray380 = new int[this.anInt7516];
		for (@Pc(42) int local42 = 0; local42 < this.anInt7516; local42++) {
			Static527.method7630(8);
			this.anIntArray381[local42] = Static527.method7630(8);
			this.anIntArray380[local42] = Static527.method7630(8);
		}
	}
}
